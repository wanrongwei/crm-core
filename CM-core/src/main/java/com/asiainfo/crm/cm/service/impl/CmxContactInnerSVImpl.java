package com.asiainfo.crm.cm.service.impl;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import com.ai.appframe2.service.ServiceFactory;
import com.ai.common.i18n.CrmLocaleFactory;
import com.ai.common.util.ExceptionUtil;
import com.asiainfo.crm.cm.common.util.CmCommonUtil;
import com.asiainfo.crm.cm.inner.party.ivalues.IBOCmPartyContactValue;
import com.asiainfo.crm.cm.inner.contact.dao.interfaces.ICmxContactDAO;
import com.asiainfo.crm.cm.inner.contact.ivalues.IBOCmGroupContactHValue;
import com.asiainfo.crm.cm.inner.contact.ivalues.IBOCmxGroupCustAdminValue;
import com.asiainfo.crm.cm.inner.contact.ivalues.IQBOCmxGroupContactHValue;
import com.asiainfo.crm.cm.inner.contact.ivalues.IQBOCmxGroupContactValue;
import com.asiainfo.crm.cm.service.interfaces.ICmxContactInnerSV;
import com.asiainfo.crm.cm.service.impl.CmxGroupCustInnerSVImpl;

public class CmxContactInnerSVImpl implements ICmxContactInnerSV {

	private ICmxContactDAO getContactCustDAO() throws Exception {
		return (ICmxContactDAO) ServiceFactory.getService(ICmxContactDAO.class);
	}
	private static transient Log log = LogFactory.getLog(CmxGroupCustInnerSVImpl.class);

	public IBOCmPartyContactValue[] queryContactById(long[] partyIds ) throws Exception {
		
		if(partyIds == null ){
			return new IBOCmPartyContactValue[0] ;
		}
		StringBuilder condition = new StringBuilder() ;
		
		condition.append( " 1 = 1 " ).append( " AND " ).append( IBOCmPartyContactValue.S_PartyId ).append( " in ( " ) ;
		int length =partyIds.length / 1000 ; //用in查询信息,但oracle10g的in最大为1000 个，所以每1000个请求一次数据库
		List custIdList = new ArrayList() ; //用来保存需返回的用户信息
		IBOCmPartyContactValue[] contactValues = null ;
		StringBuilder sqlParamer = null ;
		
		if ( partyIds.length >= 1000 ) {
			for ( int i = 0 ; i < length ; i ++ ){
				sqlParamer = new StringBuilder();// 参数
				for (int j = 0; j < 1000; j++) {
					if (j == 0) {
						sqlParamer.append(partyIds[j]);
						continue;
					}
					sqlParamer.append(",").append(partyIds[(i * 1000) + j]);
				}
				contactValues = getContactCustDAO().queryCustContact((new StringBuilder( condition.toString()) )
						.append(sqlParamer.toString()).append(" ) ").toString() , new HashMap() ) ;
				
				if ( CmCommonUtil.isNotEmptyObject( contactValues )){
					for ( int j = 0 , legth = contactValues.length ; j < legth ; j ++ ){
						custIdList.add( contactValues[ j ] ) ;
					}
				}
			}
		}
		sqlParamer = new StringBuilder() ;
		// 对1000取模后剩下的再查一次,例如2800就是查2次in 1000的，再查一次 in 800的
		if ( partyIds.length % 1000 != 0 ){
			for( int i = 0 ; i < partyIds.length % 1000 ; i ++ ){
				if ( partyIds.length < 1000 ){
					if ( i == 0 ){
						sqlParamer.append( partyIds[ i ] ) ;
						continue ;
					}
					sqlParamer.append( " , " ).append( partyIds[ i ] ) ;
				}else {
					if ( i == 0 ){
						sqlParamer.append( partyIds[ length * 1000 ] ) ;
						continue ;
					}
					sqlParamer.append(",").append( partyIds[ length * 1000 + i ]);
				}
			}
			contactValues = getContactCustDAO().queryCustContact(( new StringBuilder( condition.toString()) )
				.append( sqlParamer.toString()).append(" ) ").toString(), new HashMap()) ;
			
			if( CmCommonUtil.isNotEmptyObject( contactValues ) ){
				for ( int j = 0 , legth = contactValues.length ; j < legth ; j ++ ){
					custIdList.add( contactValues[ j ] ) ;
				}
			}
		}
		return (IBOCmPartyContactValue[]) custIdList.toArray( new IBOCmPartyContactValue[ custIdList.size()] ) ;
	}
	
	public int queryGroupContactCount(String billId,long contClass) throws Exception {
		StringBuilder condition = new StringBuilder();
		HashMap paraMap = new HashMap();
		condition.append(" 1=1 ");
		condition.append(" AND ").append(IQBOCmxGroupContactValue.S_ContMobile).append(" = :contMobile ");
		condition.append(" AND ").append(IQBOCmxGroupContactValue.S_ContClass).append(" = :contClass ");
		paraMap.put("contMobile", String.valueOf(billId));
		paraMap.put("contClass", Long.valueOf(contClass));
		return getContactCustDAO().queryGroupContactCount(condition.toString(), paraMap);
	}

	public IQBOCmxGroupContactValue[] queryGroupContacts(String billId,long contClass,int starNum, int endNum) throws Exception {
		StringBuilder condition = new StringBuilder();
		HashMap paraMap = new HashMap();
		condition.append(" 1=1 ");
		condition.append(" AND ").append(IQBOCmxGroupContactValue.S_ContMobile).append(" = :contMobile ");
		condition.append(" AND ").append(IQBOCmxGroupContactValue.S_ContClass).append(" = :contClass ");
		paraMap.put("contMobile", String.valueOf(billId));
		paraMap.put("contClass", Long.valueOf(contClass));
		IQBOCmxGroupContactValue[] cmxGroupContactValues = getContactCustDAO().queryGroupContacts(null, condition.toString(), paraMap, starNum, endNum);
		return cmxGroupContactValues;
	}

	public IQBOCmxGroupContactHValue[] queryGroupContactH(long custId,long prioryLevel,long custContId, int starNum, int endNum) throws Exception {
		StringBuilder condition = new StringBuilder();
		HashMap paraMap = new HashMap();
		condition.append(" 1=1 ");
		if (custContId > 0) {
			condition.append(" AND ").append(IQBOCmxGroupContactHValue.S_CustContId).append(" = :custContId ");
			paraMap.put("custContId", Long.valueOf(custContId));
		}
		if (prioryLevel >0) {
			condition.append(" AND ").append(IQBOCmxGroupContactHValue.S_PrioryLevel).append(" = :prioryLevel ");
			paraMap.put("prioryLevel", Long.valueOf(prioryLevel));
		}
		condition.append(" AND ").append(IQBOCmxGroupContactHValue.S_CustId).append(" = :custId ");
		paraMap.put("custId", Long.valueOf(custId));
		
		return  getContactCustDAO().queryGroupContactH(null, condition.toString(), paraMap, starNum, endNum);
	}

	public int queryGroupContactHCount(long custId, long prioryLevel,long custContId)throws Exception {
		StringBuilder condition = new StringBuilder();
		HashMap paraMap = new HashMap();
		condition.append(" 1=1 ");
		if (custContId > 0) {
			condition.append(" AND ").append(IQBOCmxGroupContactHValue.S_CustContId).append(" = :custContId ");
			paraMap.put("custContId", Long.valueOf(custContId));
		}
		condition.append(" AND ").append(IQBOCmxGroupContactHValue.S_CustId).append(" = :custId ");
		condition.append(" AND ").append(IQBOCmxGroupContactHValue.S_PrioryLevel).append(" = :prioryLevel ");
		paraMap.put("custId", Long.valueOf(custId));
		paraMap.put("prioryLevel", Long.valueOf(prioryLevel));
		return getContactCustDAO().queryGroupContactHCount(condition.toString(), paraMap);
	}

	public IBOCmxGroupCustAdminValue[] queryGroupCustAdmins(long custId,int starNum, int endNum) throws Exception {
		StringBuilder condition = new StringBuilder();
		HashMap paraMap = new HashMap();
		condition.append(" 1=1 ");
		condition.append(" AND ").append(IBOCmxGroupCustAdminValue.S_CustId).append(" = :custId ");
		paraMap.put("custId", Long.valueOf(custId));
		return getContactCustDAO().queryGroupCustAdmins(null, condition.toString(), paraMap, starNum, endNum);
	}

	public int queryGroupCustAdminsCount(long custId) throws Exception {
		StringBuilder condition = new StringBuilder();
		HashMap paraMap = new HashMap();
		condition.append(" 1=1 ");
		condition.append(" AND ").append(IBOCmxGroupCustAdminValue.S_CustId).append(" = :custId ");
		paraMap.put("custId", Long.valueOf(custId));
		return getContactCustDAO().queryCmxGroupAdminsCount(condition.toString(), paraMap);
	}

	public IBOCmxGroupCustAdminValue[] queryGroupCustAdmin(long custId,long custContId) throws Exception {
		StringBuilder condition = new StringBuilder();
		HashMap paraMap = new HashMap();
		condition.append(" 1=1 ");
		condition.append(" AND ").append(IBOCmxGroupCustAdminValue.S_CustId).append(" = :custId ");
		condition.append(" AND ").append(IBOCmxGroupCustAdminValue.S_CustContId).append(" = :custContId ");
		paraMap.put("custId", Long.valueOf(custId));
		paraMap.put("custContId", Long.valueOf(custContId));
		return getContactCustDAO().queryGroupCustAdmins(null, condition.toString(), paraMap, -1, -1);
	}

	public void saveGroupCustAdmin(IBOCmxGroupCustAdminValue groupCustAdminValue)throws Exception {	
		getContactCustDAO().saveGroupCustAdmin(groupCustAdminValue);
	}

	public IQBOCmxGroupContactValue[] queryGroupAddressBook(long custServiceId, long contClass, int startNum, int endNum) throws Exception {
		StringBuilder condition = new StringBuilder();
		HashMap paraMap = new HashMap();
		condition.append(" 1=1 ");
		condition.append(" AND ").append(IQBOCmxGroupContactValue.S_CustServiceId).append(" = :custServiceId ");
		condition.append(" AND ").append(IQBOCmxGroupContactValue.S_ContClass).append(" = :contClass ");
		paraMap.put("custServiceId", Long.valueOf(custServiceId));
		paraMap.put("contClass", Long.valueOf(contClass));
		IQBOCmxGroupContactValue[] cmxGroupContactValues = getContactCustDAO().queryGroupContacts(null, condition.toString(), paraMap, startNum, endNum);
		return cmxGroupContactValues;
	}

	public int queryGroupAddressBookCount(long custServiceId, long contClass) throws Exception {
		if (custServiceId <= 0) {
			log.error(CrmLocaleFactory.getResource("CMS0000073"));
			ExceptionUtil.throwBusinessException("CMS0000073");
		}
		StringBuilder condition = new StringBuilder();
		HashMap paraMap = new HashMap();
		condition.append(" 1=1 ");
		condition.append(" AND ").append(IQBOCmxGroupContactValue.S_CustServiceId).append(" = :custServiceId ");
		condition.append(" AND ").append(IQBOCmxGroupContactValue.S_ContClass).append(" = :contClass ");
		paraMap.put("custServiceId",Long.valueOf(custServiceId));
		paraMap.put("contClass", Long.valueOf(contClass));
		return getContactCustDAO().queryGroupContactCount(condition.toString(), paraMap);
	}

	public void saveGroupContactH(IBOCmGroupContactHValue[] groupContactHValues) throws Exception {
		getContactCustDAO().saveGroupContactH(groupContactHValues);
	}
	
}
