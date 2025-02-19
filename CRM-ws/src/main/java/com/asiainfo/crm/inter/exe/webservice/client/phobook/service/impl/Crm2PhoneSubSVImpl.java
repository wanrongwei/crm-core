package com.asiainfo.crm.inter.exe.webservice.client.phobook.service.impl;

import com.ai.appframe2.common.DataType;
import com.ai.appframe2.service.ServiceFactory;
import com.ai.common.ivalues.IBOBsStaticDataValue;
import com.ai.common.util.ExceptionUtil;
import com.ai.common.util.StaticDataUtil;
import com.asiainfo.crm.cm.common.util.ws.address;
import com.asiainfo.crm.cm.teaminvoke.out.service.interfaces.ICm2SoSV;
import com.asiainfo.crm.inter.exe.webservice.client.phobook.bo.BOIntPhoSubBean;
import com.asiainfo.crm.inter.exe.webservice.client.phobook.bo.BOResAddressBean;
import com.asiainfo.crm.inter.exe.webservice.client.phobook.dao.interfaces.ICrm2PhoneDAO;
import com.asiainfo.crm.inter.exe.webservice.client.phobook.ivalues.IBOIntPhoSubValue;
import com.asiainfo.crm.inter.exe.webservice.client.phobook.ivalues.IBOResAddressValue;
import com.asiainfo.crm.inter.exe.webservice.client.phobook.ivalues.IQBOResAddressValue;
import com.asiainfo.crm.inter.exe.webservice.client.phobook.service.interfaces.ICrm2PhoneSubSV;
import com.asiainfo.crm.inter.exe.webservice.client.phobook.service.interfaces.IIntPhoSubSV;
import com.asiainfo.crm.so.common.party.ivalues.IBOInsxUserAddressValue;
import org.apache.commons.lang.StringUtils;

import java.sql.Timestamp;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

public class Crm2PhoneSubSVImpl implements ICrm2PhoneSubSV {

	/**
	 * add by liaopeng
	 */
	private static void saveResBean(BOResAddressBean bean) throws Exception{		
		ICrm2PhoneDAO cpd = (ICrm2PhoneDAO) ServiceFactory.getService(ICrm2PhoneDAO.class);
		cpd.saveResBean(bean);
	}
	
	private static BOResAddressBean[]  getResBeans(String userId) throws Exception{

		StringBuilder condition = new StringBuilder();
		condition.append(IBOResAddressValue.S_UserId).append("=:").append(IBOResAddressValue.S_UserId);
		condition.append(" AND ").append(IBOResAddressValue.S_State).append("=:").append(IBOResAddressValue.S_State);
		Map parameter = new HashMap();
		parameter.put(IBOResAddressValue.S_UserId, userId);
		parameter.put(IBOResAddressValue.S_State, IBOIntPhoSubValue.USED);
		ICrm2PhoneDAO cpd = (ICrm2PhoneDAO) ServiceFactory.getService(ICrm2PhoneDAO.class);
		BOResAddressBean[] rsbs = cpd.getResBeans(condition.toString(), parameter);
		return rsbs;
	}
	
	public void saveBean(Map m) throws Exception {
		String userId = null;
		String billId = null;
		if (!m.containsKey(IBOIntPhoSubValue.S_TelephoSub)) {
			throw new Exception("No USER_ID Param");
		}
		try {
			userId = (String) m.get(IBOIntPhoSubValue.S_TelephoSub);
			if (userId == null) {
				throw new Exception();
			}
		} catch (Exception e) {
			throw new Exception("USER_ID is not string");
		}
		if (!m.containsKey(IBOIntPhoSubValue.S_DanishTelephoNumId)) {
			throw new Exception("No BILL_ID Param");
		}
		try {
			billId = (String) m.get(IBOIntPhoSubValue.S_DanishTelephoNumId);
			if (billId == null) {
				throw new Exception();
			}
		} catch (Exception e) {
			throw new Exception("BILL_ID is not string");
		}
		IIntPhoSubSV phoSub = (IIntPhoSubSV) ServiceFactory.getService(IIntPhoSubSV.class);

		//modify by sunjing3 start
		BOIntPhoSubBean[] beans = phoSub.getBeans(userId,billId);
		//BOResAddressBean[] resBeans= getResBeans(userId);
		//end 
		if (beans != null && beans.length > 0) {
			throw new Exception("Already have a record, cannot save!");
		}
		
		if (m.isEmpty()) {
			ExceptionUtil.throwBusinessException("INS1090001", "InputParam", "Map Collection");
		}
		BOIntPhoSubBean bips = new BOIntPhoSubBean();
		//modify by liaopeng
		BOResAddressBean br = new BOResAddressBean();
		if (m.containsKey("CUST_ID")) {
			map2Bean(m, bips,br);
			bips.setStatus(IBOIntPhoSubValue.USED);
			phoSub.saveBean(bips);
			br.setAddressId(bips.getSubId());
			br.setState(IBOIntPhoSubValue.USED);
			saveResBean(br);			
		} else {
			ExceptionUtil.throwBusinessException("INS1090001", "Input parameter", "CUST_ID");
		}

	}
	public static void main(String[] args) throws Exception {
		Map m = new HashMap();
		m.put("TELEPHO_SUB", "42108100000532");
		Crm2PhoneSubSVImpl c = new Crm2PhoneSubSVImpl();
		c.changeBean(m);
	}
	public void changeBean(Map m) throws Exception {
		String userId = null;
		String billId = null;
		BOIntPhoSubBean[] bsbs = null;
		if (!m.containsKey(IBOIntPhoSubValue.S_TelephoSub)) {
			throw new Exception("No USER_ID Param");
		}
		try {
			userId = (String) m.get(IBOIntPhoSubValue.S_TelephoSub);
			if (userId == null) {
				throw new Exception();
			}
		} catch (Exception e) {
			throw new Exception("USER_ID is not string");
		}
		/*modify by sunjing3 start*/
		IIntPhoSubSV phoSub = (IIntPhoSubSV) ServiceFactory.getService(IIntPhoSubSV.class);
		if (!m.containsKey(IBOIntPhoSubValue.S_DanishTelephoNumId)) {
			bsbs = phoSub.getBeans(userId);
		}else{
			try {
				billId = (String) m.get(IBOIntPhoSubValue.S_DanishTelephoNumId);
				if (billId == null) {
					throw new Exception();
				}
			} catch (Exception e) {
				throw new Exception("BILL_ID is not string");
			}
			bsbs = phoSub.getBeans(userId,billId);
		}
		/*modify by sunjing3 end*/
		BOResAddressBean[] rsbs = getResBeans(userId);
		if (bsbs == null || bsbs.length == 0 || rsbs == null || rsbs.length == 0) {
			throw new Exception("No Data for change");
		}
		for (BOIntPhoSubBean bsb : bsbs) {
			for( BOResAddressBean rsb :rsbs){
				String addressId =DataType.getAsString(rsb.getAddressId());
				if(String.valueOf(bsb.getSubId()).equals(addressId)){
					map2Bean(m, bsb,rsb);
					phoSub.changeBean(bsb);
					ICrm2PhoneDAO cpd = (ICrm2PhoneDAO) ServiceFactory.getService(ICrm2PhoneDAO.class);
					cpd.changeResBean(rsb);
				}					
			}				
		}

//		if (bsbs == null || bsbs.length == 0) {
//			throw new Exception("No Data for change");
//		}
//		for (BOIntPhoSubBean bsb : bsbs) {
//			map2Bean(m, bsb);
//			phoSub.changeBean(bsb);
//		}
		
	}
	public void deleteBean(String userId) throws Exception {
		if (StringUtils.isBlank(userId)) {
			throw new Exception("USER_ID is not string");
		}

		IIntPhoSubSV phoSub = (IIntPhoSubSV) ServiceFactory.getService(IIntPhoSubSV.class);
		BOIntPhoSubBean[] bsbs = phoSub.getBeans(userId);
		//modify by liaopeng
		BOResAddressBean[] rsbs = getResBeans(userId);
		if (bsbs == null || bsbs.length == 0 || rsbs == null || rsbs.length == 0) {
			return;
		}
//		for (BOIntPhoSubBean bsb : bsbs) {
//			
//			bsb.setStatus(IBOIntPhoSubValue.DELETE);
//			bsb.setCreateDate(new Timestamp(new Date().getTime()));
//			phoSub.changeBean(bsb);
//		}
		//modify by liaopeng
		for (BOIntPhoSubBean bsb : bsbs) {
			for( BOResAddressBean rsb :rsbs){
				String auserId =DataType.getAsString(rsb.getUserId());
				if(bsb.getTelephoSub().equals(auserId)){
					bsb.setStatus(IBOIntPhoSubValue.DELETE);
					bsb.setCreateDate(new Timestamp(new Date().getTime()));					
					phoSub.changeBean(bsb);					
					ICrm2PhoneDAO cpd = (ICrm2PhoneDAO) ServiceFactory.getService(ICrm2PhoneDAO.class);
					rsb.setState(bsb.getStatus());
					rsb.setCreateDate(bsb.getCreateDate());
					cpd.changeResBean(rsb);
				}
			}
			
			
		}

	}
	public void deleteBean(String userId,String billId) throws Exception {
		if (StringUtils.isBlank(userId)) {
			throw new Exception("USER_ID is not string");
		}
		if (StringUtils.isBlank(billId)) {
			throw new Exception("USER_ID is not string");
		}
		IIntPhoSubSV phoSub = (IIntPhoSubSV) ServiceFactory.getService(IIntPhoSubSV.class);
		BOIntPhoSubBean[] bsbs = phoSub.getBeans(userId,billId);
		//modify by liaopeng
		BOResAddressBean[] rsbs = getResBeans(userId);
		if (bsbs == null || bsbs.length == 0 || rsbs == null || rsbs.length == 0) {
			return;
		}
//		for (BOIntPhoSubBean bsb : bsbs) {
//			
//			bsb.setStatus(IBOIntPhoSubValue.DELETE);
//			bsb.setCreateDate(new Timestamp(new Date().getTime()));
//			phoSub.changeBean(bsb);
//		}
		//modify by liaopeng
		for (BOIntPhoSubBean bsb : bsbs) {
			for( BOResAddressBean rsb :rsbs){
				String addressId =DataType.getAsString(rsb.getAddressId());
				if(String.valueOf(bsb.getSubId()).equals(addressId)){
					bsb.setStatus(IBOIntPhoSubValue.DELETE);
					bsb.setCreateDate(new Timestamp(new Date().getTime()));					
					phoSub.changeBean(bsb);					
					ICrm2PhoneDAO cpd = (ICrm2PhoneDAO) ServiceFactory.getService(ICrm2PhoneDAO.class);
					rsb.setState(bsb.getStatus());
					rsb.setCreateDate(bsb.getCreateDate());
					cpd.changeResBean(rsb);
				}
			}
			
			
		}

	}

	@Override
	public BOIntPhoSubBean[] getBean(String userId,String billId) throws Exception {
		IIntPhoSubSV phoSub = (IIntPhoSubSV) ServiceFactory.getService(IIntPhoSubSV.class);
		return phoSub.getBeans(userId,billId);
	}
	public BOIntPhoSubBean[] getBean(String userId) throws Exception {
		IIntPhoSubSV phoSub = (IIntPhoSubSV) ServiceFactory.getService(IIntPhoSubSV.class);
		return phoSub.getBeans(userId);
	}
	
//	/**
//	 * 
//	 * @add by liaopeng
//	 * @throws Exception
//	 */
//	public void saveResBean(Map m) throws Exception{
//		String userId = null;
//		if (!m.containsKey(IBOIntPhoSubValue.S_TelephoSub)) {
//			throw new Exception("No USER_ID Param");
//		}
//		try {
//			userId = (String) m.get(IBOIntPhoSubValue.S_TelephoSub);
//			if (userId == null) {
//				throw new Exception();
//			}
//		} catch (Exception e) {
//			throw new Exception("USER_ID is not string");
//		}
//
//		IIntPhoSubSV phoSub = (IIntPhoSubSV) ServiceFactory.getService(IIntPhoSubSV.class);
//
//		QBOResAddressBean[] beans = phoSub.getQResBeans(userId);
//		if (beans != null && beans.length > 0) {
//			throw new Exception("Already have a record, cannot save!");
//		}
//
//		if (m.isEmpty()) {
//			ExceptionUtil.throwBusinessException("INS1090001", "InputParam", "Map Collection");
//		}
//		
//		BOResAddressBean br = new BOResAddressBean();
//		if (m.containsKey("CUST_ID")) {
//			map2Bean(m, null,br);
//			br.setState(IQBOResAddressValue.USED);
//			//
//			BOIntPhoSubBean[] bpho = phoSub.getBeans(userId);
//			if(null != bpho && bpho.length >0){
//				br.setAddressId(bpho[0].getSubId());
//			}
//			
//			phoSub.saveResBean(br);
//		} else {
//			ExceptionUtil.throwBusinessException("INS1090001", "Input parameter", "CUST_ID");
//		}
//	}
//
//	public void changeResBean( Map m) throws Exception{
//		String userId = null;
//		if (!m.containsKey(IBOIntPhoSubValue.S_TelephoSub)) {
//			throw new Exception("No USER_ID Param");
//		}
//		try {
//			userId = (String) m.get(IBOIntPhoSubValue.S_TelephoSub);
//			if (userId == null) {
//				throw new Exception();
//			}
//		} catch (Exception e) {
//			throw new Exception("USER_ID is not string");
//		}
//
////		IIntPhoSubSV phoSub = (IIntPhoSubSV) ServiceFactory.getService(IIntPhoSubSV.class);
////		BOIntPhoSubBean[] bsbs = phoSub.getBeans(userId);
//		
//		IIntPhoSubSV phoSub = (IIntPhoSubSV) ServiceFactory.getService(IIntPhoSubSV.class);
//		BOResAddressBean[] rsbs = phoSub.getResBeans(userId);
//		if (rsbs == null || rsbs.length == 0) {
//			throw new Exception("No Data for change");
//		}
////		for (BOIntPhoSubBean bsb : bsbs) {
////			map2Bean(m, bsb);
////			phoSub.changeBean(bsb);
////		}
//		for (BOResAddressBean rsb : rsbs) {
//			map2Bean(m,null, rsb);
//			phoSub.changeResBean(rsb);
//		}
//	}
//
//	public void deleteResBean(String userId) throws Exception{
//		if (StringUtils.isBlank(userId)) {
//			throw new Exception("USER_ID is not string");
//		}
//
//		IIntPhoSubSV phoSub = (IIntPhoSubSV) ServiceFactory.getService(IIntPhoSubSV.class);
//		BOResAddressBean[] rsbs = phoSub.getResBeans(userId);
//		if (rsbs == null || rsbs.length == 0) {
//			return;
//		}
//		for (BOResAddressBean rsb : rsbs) {
//			rsb.setState(IBOIntPhoSubValue.DELETE);
//			rsb.setCreateDate(new Timestamp(new Date().getTime()));
//			phoSub.changeResBean(rsb);
//		}
//	}
//
//	public QBOResAddressBean[] getQBOBean(String userId) throws Exception{
//		IIntPhoSubSV phoSub = (IIntPhoSubSV) ServiceFactory.getService(IIntPhoSubSV.class);
//		return phoSub.getQResBeans(userId);
//	}
	
	
	/**
	 * 从Map获取数据分表保存
	 * @modify by liaopeng 
	 * @date 2015-6-12
	 */	
	public void map2Bean(Map m, BOIntPhoSubBean bips,BOResAddressBean resb) {		
//		if (m.containsKey(IBOIntPhoSubValue.S_TelephoSub)) {
//			bips.setTelephoSub((String) m.get(IBOIntPhoSubValue.S_TelephoSub));
//		}
//		if (m.containsKey(IBOIntPhoSubValue.S_AnonymousPrepInd)) {
//			bips.setAnonymousPrepInd((String) m.get(IBOIntPhoSubValue.S_AnonymousPrepInd));
//		}
//
//		if (m.containsKey(IBOIntPhoSubValue.S_TelephoSpecUsageCode)) {
//			bips.setTelephoSpecUsageCode((String) m.get(IBOIntPhoSubValue.S_TelephoSpecUsageCode));
//		}
//		if (m.containsKey(IBOIntPhoSubValue.S_EmployPositionName)) {
//			String position = (String) m.get(IBOIntPhoSubValue.S_EmployPositionName);
//			bips.setEmployPositionName(getPosition(position));
//		}
//		if (m.containsKey(IBOIntPhoSubValue.S_OrgnizationName)) {
//			bips.setOrgnizationName((String) m.get((IBOIntPhoSubValue.S_OrgnizationName)));
//		}
//		if (m.containsKey(IBOIntPhoSubValue.S_GivenName)) {
//			bips.setGivenName((String) m.get(IBOIntPhoSubValue.S_GivenName));
//		}
//		if (m.containsKey(IBOIntPhoSubValue.S_MiddleName)) {
//			bips.setMiddleName((String) m.get(IBOIntPhoSubValue.S_MiddleName));
//		}
//		if (m.containsKey(IBOIntPhoSubValue.S_SurnameName)) {
//			bips.setSurnameName((String) m.get(IBOIntPhoSubValue.S_SurnameName));
//		}
//		if (m.containsKey(IBOIntPhoSubValue.S_DanishTelephoNumId)) {
//			bips.setDanishTelephoNumId((String) m.get(IBOIntPhoSubValue.S_DanishTelephoNumId));
//		}
//		if (m.containsKey(IBOIntPhoSubValue.S_TelephoSerTypeCode)) {
//			bips.setTelephoSerTypeCode((String) m.get(IBOIntPhoSubValue.S_TelephoSerTypeCode));
//		}
//		if (m.containsKey(IBOIntPhoSubValue.S_TelephoSubProtectCode)) {
//			bips.setTelephoSubProtectCode((String) m.get(IBOIntPhoSubValue.S_TelephoSubProtectCode));
//		}
//		if (m.containsKey(IBOIntPhoSubValue.S_AddressId)) {
//			bips.setAddressId(Long.parseLong((String) m.get(IBOIntPhoSubValue.S_AddressId)));
//		}
//		if (m.containsKey("POST_CODE_IDENTIFIER")) {
//			bips.setExt1((String) m.get("POST_CODE_IDENTIFIER"));
//		}
//		if (m.containsKey("STREET_NAME")) {
//			bips.setExt2((String) m.get("STREET_NAME"));
//		}
//		if (m.containsKey("STREET_BUILDING_IDENTIFIER")) {
//			bips.setExt3((String) m.get("STREET_BUILDING_IDENTIFIER"));
//		}
//		if (m.containsKey("DISTRICT_SUBDIVISION_IDENTIFIER")) {
//			bips.setExt4((String) m.get("DISTRICT_SUBDIVISION_IDENTIFIER"));
//		}
//		if (m.containsKey(IBOIntPhoSubValue.S_CustId)) {
//			bips.setCustId(Long.parseLong((String) m.get(IBOIntPhoSubValue.S_CustId)));
//		}
//		if (m.containsKey("MUNICIPALITY_CODE")) {
//			bips.setExt5((String) m.get("MUNICIPALITY_CODE"));
//		}
						
//		bips.setCreateDate(new Timestamp((new Date()).getTime()));
		
		
		// modify by liaopeng,从Map获取数据分表保存
		if(null != bips){
			if (m.containsKey(IQBOResAddressValue.S_TelephoSub)) {
				bips.setTelephoSub((String) m.get(IQBOResAddressValue.S_TelephoSub));
				
			}
			if (m.containsKey(IQBOResAddressValue.S_AnonymousPrepInd)) {
				bips.setAnonymousPrepInd((String) m.get(IQBOResAddressValue.S_AnonymousPrepInd));
			}

			if (m.containsKey(IQBOResAddressValue.S_TelephoSpecUsageCode)) {
				bips.setTelephoSpecUsageCode((String) m.get(IQBOResAddressValue.S_TelephoSpecUsageCode));
			}
			if (m.containsKey(IQBOResAddressValue.S_EmployPositionName)) {
				String position = (String) m.get(IQBOResAddressValue.S_EmployPositionName);
				bips.setEmployPositionName(getPosition(position));
			}
			if (m.containsKey(IQBOResAddressValue.S_OrgnizationName)) {
				bips.setOrgnizationName((String) m.get((IQBOResAddressValue.S_OrgnizationName)));
			}
			if (m.containsKey(IQBOResAddressValue.S_GivenName)) {
				bips.setGivenName((String) m.get(IQBOResAddressValue.S_GivenName));
			}
			if (m.containsKey(IQBOResAddressValue.S_MiddleName)) {
				bips.setMiddleName((String) m.get(IQBOResAddressValue.S_MiddleName));
			}
			if (m.containsKey(IQBOResAddressValue.S_SurnameName)) {
				bips.setSurnameName((String) m.get(IQBOResAddressValue.S_SurnameName));
			}
			if (m.containsKey(IQBOResAddressValue.S_DanishTelephoNumId)) {
				bips.setDanishTelephoNumId((String) m.get(IQBOResAddressValue.S_DanishTelephoNumId));
			}
			if (m.containsKey(IQBOResAddressValue.S_TelephoSerTypeCode)) {
				bips.setTelephoSerTypeCode((String) m.get(IQBOResAddressValue.S_TelephoSerTypeCode));
			}
			if (m.containsKey(IQBOResAddressValue.S_TelephoSubProtectCode)) {
				bips.setTelephoSubProtectCode((String) m.get(IQBOResAddressValue.S_TelephoSubProtectCode));
			}
			if (m.containsKey(IQBOResAddressValue.S_AddressId)) {
				bips.setAddressId(Long.parseLong((String) m.get(IQBOResAddressValue.S_AddressId)));
			}
			if (m.containsKey(IQBOResAddressValue.S_CustId)) {
				bips.setCustId(Long.parseLong((String) m.get(IQBOResAddressValue.S_CustId)));
			}
			if (m.containsKey("CARE_OF_NAME")) {
				bips.setExt1((String) m.get("CARE_OF_NAME"));
			}
			if (m.containsKey("TELEPHONE_NUMBER_RANGE_END_IDENTIFIER")) {
				bips.setExt2((String) m.get("TELEPHONE_NUMBER_RANGE_END_IDENTIFIER"));
			}
			if (m.containsKey("FURTHER_USAGE_CONSENT_INDICATOR")) {
				bips.setExt3((String) m.get("FURTHER_USAGE_CONSENT_INDICATOR"));
			}
			if (m.containsKey("FURTHER_USAGE_CONSENT_TEXT")) {
				bips.setExt4((String) m.get("FURTHER_USAGE_CONSENT_TEXT"));
			}
			bips.setCreateDate(new Timestamp((new Date()).getTime()));
		}
		if(null != resb){
			if (m.containsKey(IQBOResAddressValue.S_TelephoSub)) {
				resb.setUserId(DataType.getAsLong(m.get(IQBOResAddressValue.S_TelephoSub)));
			}
			if (m.containsKey("MUNICIPALITY_CODE")) {
				resb.setExt1((String) m.get("MUNICIPALITY_CODE"));
			}
			if (m.containsKey("STREET_CODE")) {
				resb.setExt2((String) m.get("STREET_CODE"));
			}
			if (m.containsKey("STREET_BUILDING_IDENTIFIER")) {
				resb.setExt3((String) m.get("STREET_BUILDING_IDENTIFIER"));
				resb.setExt7((String) m.get("STREET_BUILDING_IDENTIFIER"));
			}
			if (m.containsKey("MAIL_DELIVERY_SUBLOCATION_IDENTIFIER")) {
				resb.setExt4((String) m.get("MAIL_DELIVERY_SUBLOCATION_IDENTIFIER"));
			}
			if (m.containsKey("STREET_NAME")) {
				resb.setExt5((String) m.get("STREET_NAME"));
			}
			if (m.containsKey("STREET_NAME_FOR_ADDRESSING_NAME")) {
				resb.setExt6((String) m.get("STREET_NAME_FOR_ADDRESSING_NAME"));
			}	
//			if (m.containsKey("STREET_BUILDING_IDENTIFIER")) {
//				resb.setExt7((String) m.get("STREET_BUILDING_IDENTIFIER"));
//			}
			if (m.containsKey("FLOOR_IDENTIFIER")) {
				resb.setExt8((String) m.get("FLOOR_IDENTIFIER"));
			}		
			if (m.containsKey("SUITE_IDENTIFIER")) {
				resb.setExt9((String) m.get("SUITE_IDENTIFIER"));
			}
			if (m.containsKey("DISTRICT_SUBDIVISION_IDENTIFIER")) {
				resb.setExt10((String) m.get("DISTRICT_SUBDIVISION_IDENTIFIER"));
			}
			if (m.containsKey("POST_OFFICE_BOX_IDENTIFIER")) {
				resb.setExt11((String) m.get("POST_OFFICE_BOX_IDENTIFIER"));
			}		
			if (m.containsKey("POST_CODE_IDENTIFIER")) {
				resb.setExt12((String) m.get("POST_CODE_IDENTIFIER"));
			}
			if (m.containsKey("DISTRICT_NAME")) {
				resb.setExt13((String) m.get("DISTRICT_NAME"));
			}
			if (m.containsKey("POSTAL_ADDRESS_FIRST_LINE_TEXT")) {
				resb.setExt14((String) m.get("POSTAL_ADDRESS_FIRST_LINE_TEXT"));
			}
			if (m.containsKey("POSTAL_ADDRESS_SECOND_LINE_TEXT")) {
				resb.setExt15((String) m.get("POSTAL_ADDRESS_SECOND_LINE_TEXT"));
			}
			if (m.containsKey("POSTAL_ADDRESS_THIRD_LINE_TEXT")) {
				resb.setExt16((String) m.get("POSTAL_ADDRESS_THIRD_LINE_TEXT"));
			}
			if (m.containsKey("POSTAL_ADDRESS_FOURTH_LINE_TEXT")) {
				resb.setExt17((String) m.get("POSTAL_ADDRESS_FOURTH_LINE_TEXT"));
			}
			if (m.containsKey("POSTAL_ADDRESS_FIFTH_LINE_TEXT")) {
				resb.setExt18((String) m.get("POSTAL_ADDRESS_FIFTH_LINE_TEXT"));
			}
			if (m.containsKey("POSTAL_ADDRESS_SIXTH_LINE_TEXT")) {
				resb.setExt19((String) m.get("POSTAL_ADDRESS_SIXTH_LINE_TEXT"));
			}
			resb.setCreateDate(new Timestamp((new Date()).getTime()));
		}	
		
	}
	
	
	//
	private String getPosition(String position) {
		try {
			IBOBsStaticDataValue[] positions = StaticDataUtil.getStaticData("CMX_POSITION");
			Map<String, String> positionDes = new HashMap<String, String>();
			for (IBOBsStaticDataValue pos : positions) {
				String key = pos.getCodeValue();
				String i18n = pos.getCodeName();
				positionDes.put(key, i18n);
			}
			if (positionDes.containsKey(position)) {
				return positionDes.get(position);
			}
		} catch (Exception e) {
		}
		return position;
	}
	
	public static void testDeleteBean()throws Exception{
		
	}
	/*public static void main(String[] args) throws Exception {
		//		testSaveBean();
		testGetBean();
	}*/

	public static void testGetBean() throws Exception {
		ICrm2PhoneSubSV sv = (ICrm2PhoneSubSV) ServiceFactory.getService(ICrm2PhoneSubSV.class);
//		BOIntPhoSubBean[]  bean = sv.getBean("4210610000001");
//		System.out.println(bean.toString());
		sv.deleteBean("42108100000532","70707338");

	}

	public static void testSaveBean() throws Exception {
		ICrm2PhoneSubSV sv = (ICrm2PhoneSubSV) ServiceFactory.getService(ICrm2PhoneSubSV.class);
		HashMap map = new HashMap();
		map.put(IQBOResAddressValue.S_TelephoSub, "42108100000532");//
		map.put(IQBOResAddressValue.S_AnonymousPrepInd, "true");//集团传false
		map.put(IQBOResAddressValue.S_TelephoSubProtectCode, "U");//
		map.put(IQBOResAddressValue.S_EmployPositionName, "åæÆæÅ10001");//个人，集团传空
		map.put(IQBOResAddressValue.S_OrgnizationName, "åæÆæÅ10001");//个人，集团传空
		map.put(IQBOResAddressValue.S_GivenName, "åæÆæÅ10001");//个人，集团传空
		map.put(IQBOResAddressValue.S_MiddleName, "åæÆæÅ10001");//个人，集团传空
		map.put(IQBOResAddressValue.S_SurnameName, "åæÆæÅ10001");//个人，集团传空
		map.put(IQBOResAddressValue.S_DanishTelephoNumId, "70707338");//
		map.put(IQBOResAddressValue.S_TelephoSerTypeCode, "L");//
		map.put(IQBOResAddressValue.S_Status, "1");//
//		map.put(IQBOResAddressValue.S_CreateDate, new Date());//
//		map.put(IQBOResAddressValue.S_TelephoSpecUsageCode, "");
//		map.put(IQBOResAddressValue.S_OtherAddressId, null);
//		map.put(IQBOResAddressValue.S_AddressId, "");
		map.put(IQBOResAddressValue.S_CustId, "23210110000901");//
//		map.put("CARE_OF_NAME", "");
//		map.put("TELEPHONE_NUMBER_RANGE_END_IDENTIFIER", "");
//		map.put("FURTHER_USAGE_CONSENT_INDICATOR", "");
//		map.put("FURTHER_USAGE_CONSENT_TEXT", "");
		map.put("MUNICIPALITY_CODE", "1011");//
//		map.put("STREET_CODE", "");
		map.put("STREET_BUILDING_IDENTIFIER", "10010");//
//		map.put("MAIL_DELIVERY_SUBLOCATION_IDENTIFIER", "");
		map.put("STREET_NAME", "åæÆæÅ10001");//
//		map.put("STREET_NAME_FOR_ADDRESSING_NAME", "");
		map.put("STREET_BUILDING_IDENTIFIER", "000001011");//
		map.put("FLOOR_IDENTIFIER", "100001011");//
		map.put("SUITE_IDENTIFIER", "100001011");//
		map.put("DISTRICT_SUBDIVISION_IDENTIFIER", "000001011");//
//		map.put("POST_OFFICE_BOX_IDENTIFIER", "");
		map.put("POST_CODE_IDENTIFIER", "000001011");//
		map.put("DISTRICT_NAME", "åæÆæÅ123");//
//		map.put("POSTAL_ADDRESS_FIRST_LINE_TEXT", "000001011");
//		map.put("POSTAL_ADDRESS_SECOND_LINE_TEXT", "000001011");
//		map.put("POSTAL_ADDRESS_THIRD_LINE_TEXT", "000001011");
//		map.put("POSTAL_ADDRESS_FOURTH_LINE_TEXT", "000001011");
//		map.put("POSTAL_ADDRESS_FIFTH_LINE_TEXT", "000001011");
//		map.put("POSTAL_ADDRESS_SIXTH_LINE_TEXT", "000001011");
		
		//
		//		sv.changeBean(map);
		sv.saveBean(map);
	}

	public void initForeinAddressFromInsxUserAddress(Map<String, Object> m, IBOInsxUserAddressValue insxUserAddrss) {

		m.put("POSTAL_ADDRESS_FIRST_LINE_TEXT", insxUserAddrss.getStreet());
		if (StringUtils.isBlank(insxUserAddrss.getFloor()) || "null".equals(insxUserAddrss.getFloor()))
		{
			m.put("POSTAL_ADDRESS_SECOND_LINE_TEXT", insxUserAddrss.getHouseNo());
		}else {
			m.put("POSTAL_ADDRESS_SECOND_LINE_TEXT", insxUserAddrss.getHouseNo()+","+ insxUserAddrss.getFloor());
		}
		if (StringUtils.isNotBlank(insxUserAddrss.getMunicipalCode())) {
			m.put("MUNICIPALITY_CODE", insxUserAddrss.getMunicipalCode());
			m.put("POSTAL_ADDRESS_THIRD_LINE_TEXT", insxUserAddrss.getMunicipalCode());
		}
		m.put("POSTAL_ADDRESS_FOURTH_LINE_TEXT", insxUserAddrss.getZipCode());
		m.put("POSTAL_ADDRESS_FIFTH_LINE_TEXT", insxUserAddrss.getCity());
		m.put("POSTAL_ADDRESS_SIXTH_LINE_TEXT", insxUserAddrss.getCountry());
		try{
			if (StringUtils.isNotBlank(String.valueOf(insxUserAddrss.getStandardAddrId()))) {
				ICm2SoSV iCm2SoSV = (ICm2SoSV)ServiceFactory.getService(ICm2SoSV.class);
				address legalAddress = (address)iCm2SoSV.queryAddressInfo(insxUserAddrss.getStandardAddrId());
				if( legalAddress != null){
					if(StringUtils.isNotBlank(legalAddress.getCoName())){
						m.put("CARE_OF_NAME", legalAddress.getCoName());
					}else{
						m.put("CARE_OF_NAME", "");
					}
				}
			}
		}catch(Exception e){
			//log.error("GET CO_NAME ERROR"+e);
		}
	}

	public void initForeinAddressMapFromLegalAddress(Map<String, Object> m, address legalAddress) {

		m.put("POSTAL_ADDRESS_FIRST_LINE_TEXT", legalAddress.getStreetName());
		if (StringUtils.isBlank(legalAddress.getFloor()) || "null".equals(legalAddress.getFloor())) {
			m.put("POSTAL_ADDRESS_SECOND_LINE_TEXT", legalAddress.getFloor());
		}else {
			m.put("POSTAL_ADDRESS_SECOND_LINE_TEXT", legalAddress.getHouseNumber()+","+ legalAddress.getFloor());
		}
		if (StringUtils.isNotBlank(legalAddress.getMunicipality())) {
			m.put("MUNICIPALITY_CODE", legalAddress.getMunicipality());
			m.put("POSTAL_ADDRESS_THIRD_LINE_TEXT", legalAddress.getMunicipality());
		}
		m.put("POSTAL_ADDRESS_FOURTH_LINE_TEXT", legalAddress.getZipcode());
		m.put("POSTAL_ADDRESS_FIFTH_LINE_TEXT", legalAddress.getCity());
		m.put("POSTAL_ADDRESS_SIXTH_LINE_TEXT", legalAddress.getCountry());
		if(StringUtils.isNotBlank(legalAddress.getCoName())){
			m.put("CARE_OF_NAME", legalAddress.getCoName());
		}else{
			m.put("CARE_OF_NAME", "");
		}
	}
}
