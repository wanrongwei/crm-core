package com.asiainfo.crm.cm.service.impl;

import java.util.HashMap;
import java.util.Map;

import org.apache.commons.lang.StringUtils;

import com.ai.appframe2.bo.DataContainer;
import com.ai.appframe2.common.DataContainerInterface;
import com.ai.secframe.orgmodel.ivalues.IBOSecOperatorValue;
import com.ai.secframe.orgmodel.ivalues.IQBOSecOrgStaffOperValue;
import com.asiainfo.crm.cm.busimodel.impl.club.AbstractClubQueryModelImpl;
import com.asiainfo.crm.cm.busimodel.impl.common.AbstractQueryBusiModelImpl;
import com.asiainfo.crm.cm.busimodel.impl.evaluation.AbstractSpecialListDealBusiModelImpl;
import com.asiainfo.crm.cm.busimodel.impl.evaluation.AbstractSpecialListQueryModelImpl;
import com.asiainfo.crm.cm.common.CmConstants;
import com.asiainfo.crm.cm.common.CmServiceFactory;
import com.asiainfo.crm.cm.common.CmxServiceFactory;
import com.asiainfo.crm.cm.common.util.CmCommonUtil;
import com.asiainfo.crm.cm.inner.evaluation.ivalues.IBOCmSpecialListValue;
import com.asiainfo.crm.cm.model.bean.VOSpecialListBean;
import com.asiainfo.crm.cm.model.bo.ClubBean;
import com.asiainfo.crm.cm.model.bo.SpecialListBean;
import com.asiainfo.crm.cm.model.ivalues.IClubValue;
import com.asiainfo.crm.cm.model.ivalues.ICustomerValue;
import com.asiainfo.crm.cm.model.ivalues.ISoUserValue;
import com.asiainfo.crm.cm.model.ivalues.ISpecialListValue;
import com.asiainfo.crm.cm.model.ivalues.IVOCustValue;
import com.asiainfo.crm.cm.model.ivalues.IVOSpecialListValue;
import com.asiainfo.crm.cm.service.interfaces.ICmSpecialListSV;
import com.asiainfo.crm.cm.teaminvoke.in.service.interfaces.ICmTeamInvokeSV;

/**   
 * @Copyright Copyright (c) 2011 Asiainfo-Linkage
 * 
 * @ClassName CmCustomerSVImpl
 * @Description 客户类的使用
 *
 * @version v1.0.0
 * @author huzq2
 * @date 2011-12-16 下午2:30:06
 *
 * Modification History:
 * Date         Author          Version            Description
 * ---------------------------------------------------------*
 * 2011-12-16     huzq2           v1.0.0               修改原因
 */
public class CmSpecialListSVImpl implements ICmSpecialListSV {

	public void saveSpecalList(IVOCustValue custValue) throws Exception {
		AbstractSpecialListDealBusiModelImpl specialListDealModelImpl = (AbstractSpecialListDealBusiModelImpl) CmServiceFactory
				.getBusiMode(AbstractSpecialListDealBusiModelImpl.class);
		IVOSpecialListValue specialListValue = new VOSpecialListBean();
		specialListValue.addSpecialLists((ISpecialListValue[]) custValue.getUserObject("specialListValue"));
		specialListDealModelImpl.deal(specialListValue);
	}

	public void saveSpecialList(ISpecialListValue specialListValue, Map userObject) throws Exception {
		AbstractSpecialListDealBusiModelImpl busiModelImpl = (AbstractSpecialListDealBusiModelImpl) CmServiceFactory.getBusiMode(AbstractSpecialListDealBusiModelImpl.class);
		IVOSpecialListValue listValue = new VOSpecialListBean();
		listValue.addSpecialList(specialListValue);
		listValue.addUserMap(userObject);
		busiModelImpl.deal(listValue);
	}

	public void saveSpecialLists(ISpecialListValue[] specialListValues, Map userObject) throws Exception {
		AbstractSpecialListDealBusiModelImpl busiModelImpl = (AbstractSpecialListDealBusiModelImpl) CmServiceFactory.getBusiMode(AbstractSpecialListDealBusiModelImpl.class);
		IVOSpecialListValue listValue = new VOSpecialListBean();
		listValue.addSpecialLists(specialListValues);
		listValue.addUserMap(userObject);
		busiModelImpl.deal(listValue);
	}

	
	public ISpecialListValue querySpecialLists(String criteria) throws Exception {			
		ISpecialListValue[] specialListValue =  CmServiceFactory.getSpecialListSV().querySpecialLists(criteria, -1, -1);
		if(CmCommonUtil.isNotEmptyObject(specialListValue)){
			IQBOSecOrgStaffOperValue operatorValue = CmServiceFactory.getTeamInvokeSV().getOperQBOByOperId(specialListValue[0].getOpId());
			if (CmCommonUtil.isNotEmptyObject(operatorValue)) {
				specialListValue[0].initProperty("OPERATOR_NAME",operatorValue.getStaffName());
				specialListValue[0].initProperty("ORGANIZE_NAME",operatorValue.getOrganizeName());
			}	
			return specialListValue[0];
		}
		return null;
	}
	public ISpecialListValue querySpecialList(DataContainer conditionDC) throws Exception {
		ISpecialListValue[]  specialListValue =  CmServiceFactory.getSpecialListSV().querySpecialLists(conditionDC, -1, -1);
		if (CmCommonUtil.isNotEmptyObject(specialListValue)) {
			return specialListValue[0];		
		}
		 return null;
	}						   
	
	public ISpecialListValue[] querySpecialLists(DataContainer conditionDC, int startNum, int endNum) throws Exception {
		return (ISpecialListValue[]) ((AbstractSpecialListQueryModelImpl) CmServiceFactory.getBusiMode(AbstractSpecialListQueryModelImpl.class)).queryData(
				new DataContainer[] { conditionDC }, startNum, endNum);
	}

	public int querySpecialListCount(DataContainer conditionDC) throws Exception {
		return ((AbstractSpecialListQueryModelImpl) CmServiceFactory.getBusiMode(AbstractSpecialListQueryModelImpl.class)).queryCount(new DataContainer[] { conditionDC });
	}

	public ISpecialListValue[] querySpecialLists(String criteria, int startNum, int endNum) throws Exception {
		AbstractSpecialListQueryModelImpl querySpecialModelImpl = (AbstractSpecialListQueryModelImpl) CmServiceFactory.getBusiMode(AbstractSpecialListQueryModelImpl.class);
		return (ISpecialListValue[]) querySpecialModelImpl.queryData(criteria, startNum, endNum);
	}

	public int querySpecialListCount(String criteria) throws Exception {
		return ((AbstractSpecialListQueryModelImpl) CmServiceFactory.getBusiMode(AbstractSpecialListQueryModelImpl.class)).queryCount(criteria);
	}

	public ISpecialListValue querySpecialListById(long listId) throws Exception {
		AbstractSpecialListQueryModelImpl model = (AbstractSpecialListQueryModelImpl) CmServiceFactory.getBusiMode(AbstractSpecialListQueryModelImpl.class);
		return (ISpecialListValue) model.queryDataById(listId);
	}

	
	public ISpecialListValue[] querySpecialListValuesByCustId(long custId) throws Exception {
		
		ICustomerValue custValue = CmServiceFactory.getCustomerSV().queryCustomerByCustId(custId);
		if(CmCommonUtil.isNotEmptyObject(custValue)){
		    String certcode = custValue.getCustCertCode();
			int certtype = custValue.getCustCertType();
			
			DataContainer criteria = new DataContainer();
			criteria.set(ISpecialListValue.S_CertCode, certcode);
			criteria.set(ISpecialListValue.S_CertType, certtype);
			
			DataContainerInterface[] results = ((AbstractSpecialListQueryModelImpl)( CmServiceFactory.getBusiMode(AbstractSpecialListQueryModelImpl.class))).queryData(new DataContainer[] { criteria }, -1,
					-1);
			ISpecialListValue[] speciallistvalue = new SpecialListBean[results.length];
			for(int i = 0;i<speciallistvalue.length;i++){
			    speciallistvalue[i] = new SpecialListBean();
			    speciallistvalue[i].copy(results[i]);
			}
			return speciallistvalue; 
		}
		return null;
	}
}
