package com.asiainfo.crm.cm.dk.exe.bp;

import java.sql.Timestamp;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.regex.Pattern;

import org.apache.commons.lang.StringUtils;

import com.ai.appframe2.bo.DataContainer;
import com.ai.appframe2.common.DataContainerInterface;
import com.ai.appframe2.common.DataType;
import com.ai.appframe2.common.ServiceManager;
import com.ai.appframe2.complex.center.CenterFactory;
import com.ai.appframe2.complex.tab.split.TenantIDFactory;
import com.ai.appframe2.privilege.UserInfoInterface;
import com.ai.appframe2.service.ServiceFactory;
import com.ai.common.util.ExceptionUtil;
import com.asiainfo.appframe.ext.exeframe.bp.BpFrameWork;
import com.asiainfo.appframe.ext.exeframe.bp.interfaces.IBpNotify;
import com.asiainfo.appframe.ext.exeframe.bp.interfaces.IBpProcess;
import com.asiainfo.appframe.ext.exeframe.bp.po.BpCol;
import com.asiainfo.appframe.ext.exeframe.bp.po.BpInfo;
import com.asiainfo.crm.cm.common.CmConstants;
import com.asiainfo.crm.cm.common.CmServiceFactory;
import com.asiainfo.crm.cm.common.service.interfaces.IAddressSV;
import com.asiainfo.crm.cm.common.service.interfaces.ICmCommonSV;
import com.asiainfo.crm.cm.common.util.CmCommonUtil;
import com.asiainfo.crm.cm.common.util.ws.address;
import com.asiainfo.crm.cm.inner.customer.bo.BOCmCustContactMediumBean;
import com.asiainfo.crm.cm.inner.customer.bo.BOCmGroupMemberBean;
import com.asiainfo.crm.cm.inner.customer.bo.BOCmGroupOrgStructBean;
import com.asiainfo.crm.cm.inner.customer.ivalues.IBOCmCustContactMediumValue;
import com.asiainfo.crm.cm.inner.customer.ivalues.IBOCmGroupMemberValue;
import com.asiainfo.crm.cm.inner.customer.ivalues.IBOCmIndivCustomerValue;
import com.asiainfo.crm.cm.inner.party.bo.BOCmPartyRoleBean;
import com.asiainfo.crm.cm.inner.util.CmInnerServiceFactory;
import com.asiainfo.crm.cm.ln.common.util.CmLnConstants;
import com.asiainfo.crm.cm.model.bean.VOCustBean;
import com.asiainfo.crm.cm.model.bo.CustomerBean;
import com.asiainfo.crm.cm.model.ivalues.ICustomerValue;
import com.asiainfo.crm.cm.model.ivalues.IVOCustValue;
import com.asiainfo.crm.cm.service.interfaces.ICmCustomerSV;
import com.asiainfo.crm.cm.service.interfaces.ICmIndivCustomerSV;
import com.asiainfo.crm.cm.service.interfaces.ICmPartyRoleSV;
import com.asiainfo.crm.cm.support.bce.util.CmBceSupportConstants;

public class CmBatchAddGroupMemberBP implements IBpProcess, IBpNotify {

	private final static int FILE_COL_COUNT = 5;
	private final static String dateFormat = "yyyyMMdd";

	public void processData(BpCol[][] bpCols, BpInfo bpInfo) throws Exception {
		UserInfoInterface userInfo = ServiceManager.getNewBlankUserInfo();
		userInfo.setTenantId(TenantIDFactory.getTenant());
		userInfo.setID(bpInfo.getProcessOpId());
		userInfo.setOrgId(bpInfo.getProcessOrgId());
		ServiceManager.setServiceUserInfo(userInfo);
		if (null != bpCols && bpCols.length > 0) {

			for (int i = 0; i < bpCols.length; i++) {
				ICmCustomerSV customerSV = (ICmCustomerSV) ServiceFactory.getService(ICmCustomerSV.class);
				IVOCustValue custValue = new VOCustBean();
				BpCol[] bpCol = bpCols[i];
				if (bpCol == null || bpCol.length != FILE_COL_COUNT) // 行内容参数与配置的不一致
				{
					// // 记录格式错误，字段个数不等于{0}
					ExceptionUtil.throwBusinessException("AMS1600120", String.valueOf(FILE_COL_COUNT));
				}
				String CPRNumber = "";
				String ContactPhone = "";
				String ContactEmail = "";
				String Initials = "";
				long CustId = -1;

				for (int j = 0; j < FILE_COL_COUNT; j++) {
					switch (bpCol[j].getPosition()) // 按照顺序处理
					{
						case 1:
							if (StringUtils.isNotBlank(bpCol[j].getValue())) {
								CPRNumber = bpCol[j].getValue();
							}
							break;

						case 2:
							if (StringUtils.isNotBlank(bpCol[j].getValue())) {
								ContactPhone = bpCol[j].getValue();
							}
							break;

						case 3:
							if (StringUtils.isNotBlank(bpCol[j].getValue())) {
								ContactEmail = bpCol[j].getValue();
							}
							break;

						case 4:
							if (StringUtils.isNotBlank(bpCol[j].getValue())) {
								Initials = bpCol[j].getValue();// 1:add,2:delete
							}
							break;
						case 5:
							if (StringUtils.isNotBlank(bpCol[j].getValue())) {
								CustId = Long.parseLong(bpCol[j].getValue());
							}
							break;
						default:
							break;
					}
				}
				validateEmail(ContactEmail);
				validatePhone(ContactPhone);
				//根据集团custId获取deptId
				StringBuilder condition = new StringBuilder();
				condition.append("1=1").append(" and ").append(BOCmGroupOrgStructBean.S_RelCustId).append("=:relCustId");
				Map parameter = new HashMap();
				parameter.put("relCustId", CustId);
				BOCmGroupOrgStructBean grpOrgBean[] = (BOCmGroupOrgStructBean[]) CmInnerServiceFactory.getCommonInnerSV().getBeans(BOCmGroupOrgStructBean.class, condition.toString(),
						parameter, -1, -1);
				// 设置DeptId不存在报异常
				if (grpOrgBean == null ||grpOrgBean.length <= 0) {
					throw new Exception("Can Not Find GROUP Orgnization Information By CustId," + "Please Make Sure That The CustId Belongs To An Exsist Group Customer");
				} 
				IBOCmIndivCustomerValue[] indivCust = customerSV.queryCustomerByCPR(CPRNumber);
				if (indivCust == null || indivCust.length < 1) {
					// cpr接口
					ICmCommonSV commonSV = (ICmCommonSV) ServiceFactory.getService(ICmCommonSV.class);
					String custId = String.valueOf(commonSV.getCustId(CmConstants.CustomerType.INDIVIDUAL));
					Map tempMap = getCustInfoFromCPR(CPRNumber, custId);
					if (!tempMap.isEmpty()) {
						ICustomerValue customerValue = new CustomerBean();
						customerValue.setFirstName(DataType.getAsString(tempMap.get("FIRST_NAME")));
						customerValue.setLastName(DataType.getAsString(tempMap.get("LAST_NAME")));
						customerValue.setBirthday(getTimestamp(DataType.getAsString(tempMap.get("BIRTHDAY"))));
						// 设置客户ID201241201 YYYY-MM-DD
						customerValue.setCustId(Long.parseLong(custId));
						// 设置一些默认字段
						customerValue.setRegionId(CmCommonUtil.getDefaultRegionId());
						customerValue.setState(CmConstants.RecordState.USE);
						customerValue.setAnonymousFlag(0);
						customerValue.setCustType(CmConstants.CustomerType.INDIVIDUAL);
						customerValue.setCustStatus(CmConstants.CustomerStatus.INDIV_POTENTIAL);
						customerValue.setRealNameFlag(0);
						customerValue.setCustLanguage("1");
						customerValue.setCustCertType(CmConstants.CertificateType.CPR);
						customerValue.setCustCertCode(CPRNumber);
						// cprnumber奇数为male,偶数为female
						if (Long.parseLong(CPRNumber) % 2 == 1) {
							customerValue.setGender(1);
						} else {
							customerValue.setGender(2);
						}
						// 设置客户子类型为员工
						customerValue.setIndivCustType(String.valueOf(CmConstants.EntityType.EMPLOYEE));
						custValue.setCustomer(customerValue);
						// 设置客户扩展信息
						DataContainerInterface cmxIndiv = new DataContainer();
						cmxIndiv.set("CUST_ID", custId);
						cmxIndiv.set("REGION_ID", CmCommonUtil.getDefaultRegionId());
						cmxIndiv.set("MANUAL_COMMERCIAL_PROTECTION", 1);
						cmxIndiv.set("STATE", CmConstants.RecordState.USE);
						cmxIndiv.set("PNR", custId);
						custValue.setUserObject(CmBceSupportConstants.CmDefaultCodeValue.codeValueCmxIndivCustomer, cmxIndiv);
						// 保存客户信息
						CmServiceFactory.getCustomerSV().saveCustomer(custValue);
						// 保存使用者联系信息
						saveContact(ContactPhone, ContactEmail, custId);
						// 保存集团成员
						// 可以创建集团成员
						IBOCmGroupMemberValue groupMember = new BOCmGroupMemberBean();
						groupMember.copy(customerValue);
						groupMember.setFirstName(customerValue.getFirstName());
						groupMember.setCustRelId(CmCommonUtil.getNewSequence(BOCmGroupMemberBean.class));
						groupMember.setLastName(customerValue.getLastName());
						groupMember.setMemberName(customerValue.getCustName());
						groupMember.setMemberCustId(customerValue.getCustId());
						groupMember.setCustId(CustId);
						groupMember.setStsToNew();
						groupMember.setDeptId(grpOrgBean[0].getDeptId());
						// 往外成员
						groupMember.setMemberType(CmLnConstants.GroupContType.GROUP_MEMBER_OUTTER);
						CmInnerServiceFactory.getCommonInnerSV().saveBean((BOCmGroupMemberBean) groupMember);
					}else{
						ExceptionUtil.throwBusinessException("CMS9988801");
					}
				} else {
					// 查询当前客户已经归属于一个集团
					if (getGroupMember(indivCust[0].getCustId()) != null) {
						ExceptionUtil.throwBusinessException("CMS0012376");
					} else {
						// 可以创建集团成员
						IBOCmGroupMemberValue groupMember = new BOCmGroupMemberBean();
						groupMember.copy(indivCust[0]);
						groupMember.setCustId(CustId);
						groupMember.setCustRelId(CmCommonUtil.getNewSequence(BOCmGroupMemberBean.class));
						groupMember.setFirstName(indivCust[0].getFirstName());
						groupMember.setLastName(indivCust[0].getLastName());
						groupMember.setMemberName(indivCust[0].getCustName());
						groupMember.setMemberCustId(indivCust[0].getCustId());
						groupMember.setStsToNew();
						groupMember.setDeptId(grpOrgBean[0].getDeptId());
						if (indivCust[0].getCustStatus() == 0) {
							groupMember.setMemberType(CmLnConstants.GroupContType.GROUP_MEMBER_OUTTER);
						} else {
							groupMember.setMemberType(CmLnConstants.GroupContType.GROUP_MEMBER_INNER);
						}
						CmInnerServiceFactory.getCommonInnerSV().saveBean((BOCmGroupMemberBean) groupMember);
					}
					ICmPartyRoleSV partyRoleSV = (ICmPartyRoleSV) ServiceFactory.getService(ICmPartyRoleSV.class);
					com.asiainfo.crm.cm.common.bo.BOCmPartyRoleBean partyRoleBean = new com.asiainfo.crm.cm.common.bo.BOCmPartyRoleBean();
					partyRoleBean.setRoleType(CmConstants.PartyRoleType.EMPLOYEE);
					partyRoleBean.setPartyRoleId(CmCommonUtil.getNewSequence(BOCmPartyRoleBean.class));
					partyRoleBean.setEntityId(indivCust[0].getCustId());
					partyRoleBean.setState(CmConstants.RecordState.USE);
					partyRoleBean.setRoleStatus(CmConstants.roleStatus.ACTIVE);
					partyRoleBean.setPartyId(indivCust[0].getPartyId());
					partyRoleBean.setRegionId(CmCommonUtil.getDefaultRegionId());
					partyRoleBean.setCreateOpId(ServiceManager.getUser().getID());
					partyRoleBean.setCreateOrgId(ServiceManager.getUser().getOrgId());
					partyRoleSV.savePartyRole(partyRoleBean);
					// 保存使用者联系信息
					saveContact(ContactPhone, ContactEmail, String.valueOf(indivCust[0].getCustId()));
					
				}
			}
		}
	}
	//校验手机号码
	private void validatePhone(String ContactPhone)throws Exception{
		String check ="^[0-9]*$";
		Pattern pattern = Pattern.compile(check);
		java.util.regex.Matcher match = pattern.matcher(ContactPhone);
		if(!match.matches()){
			ExceptionUtil.throwBusinessException("Phone Number Is illegal");
		}
	}
	//校验邮箱
	private void validateEmail(String email) throws Exception{
		String check ="(?=^[\\w.@]{6,50}$)\\w+@\\w+(?:\\.[\\w]{2,3}){1,2}";
		Pattern pattern = Pattern.compile(check);
		java.util.regex.Matcher match = pattern.matcher(email);
		if(!match.matches()){
			ExceptionUtil.throwBusinessException("CMS9988933");
		}
	}
	private Timestamp getTimestamp(String dateInfo) throws Exception {
		Date date = new SimpleDateFormat(dateFormat).parse(dateInfo);
		return new Timestamp(date.getTime());
	}

	private Map getCustInfoFromCPR(String cprNum, String custId) throws Exception {
		Map map = new HashMap();
		ICmCustomerSV service = (ICmCustomerSV) ServiceFactory.getService(ICmCustomerSV.class);
		ICmIndivCustomerSV indivService = (ICmIndivCustomerSV) ServiceFactory.getService(ICmIndivCustomerSV.class);
		IBOCmIndivCustomerValue[] values = service.queryCustomerByCPR(cprNum);
		if (null != values && values.length > 0) {
			// CPR在CRM进行验证客户是否存在，存在则不进行创建
			ExceptionUtil.throwBusinessException("CMS9988771");
		}
		Map params = new HashMap();
		params.put("PNR", cprNum);
		// 送CPR进行校验
		Map cprData = indivService.validateCPR(params);
		String FEJLNR = (String) cprData.get("FEJLNR");
		if (!FEJLNR.equals("00")) {
			// CPR在CPR系统中不存在。
			ExceptionUtil.throwBusinessException("CMS9988772");
		}
		Map data1 = (Map) cprData.get("DATA");
		Map data2 = (Map) data1.get("INFO");
		Map currentData = (Map) data2.get("Current_data");
		// 是否受保护
		String isProtected = (String) currentData.get("NVNADRBESKHAENSTART");
		// isProtected="1231234";
		String var = "[0]*";
		if (!isProtected.matches(var)) {
			// 受保护
			ExceptionUtil.throwBusinessException("CMS9988770");
		} else {
			// 从CPR返回的客户名称
			String firstName = (String) currentData.get("FORNVN");
			String lastName = (String) currentData.get("EFTERNVN");
			// 从CPR返回的生日
			String birthDay = (String) currentData.get("FOEDDTO");
			// 从CPR返回的地址
			String houseNum = ((String) currentData.get("HUSNR")).trim();
			String floor = (String) currentData.get("ETAGE");
			String sideOrApartNum = (String) currentData.get("SIDEDOER");
			String buildNum = (String) currentData.get("SIDEDOER");
			String streetName = (String) currentData.get("VEJADRNVN");
			String city = (String) currentData.get("POSTDISTTXT");
			String smallCity = (String) currentData.get("BYNVN");
			String postCode = (String) currentData.get("POSTNR");
			String coName = (String) currentData.get("CONVN");
			String munici = (String) currentData.get("KOMKOD");
			String personStatus= (String) currentData.get("STATUS");
			if("80".equals(personStatus)){
				//客户移民
				ExceptionUtil.throwBusinessException("CMS9988946");
			}
			if("70".equals(personStatus)){
				//客户消失
				ExceptionUtil.throwBusinessException("CMS9988947");
			}
			// 不受保护
			map.put("FIRST_NAME", CmCommonUtil.capitalizeFirstLetter(firstName));
			map.put("LAST_NAME", CmCommonUtil.capitalizeFirstLetter(lastName));
			map.put("BIRTHDAY", birthDay);
			address address = new address();
			address.setAddressType(CmConstants.Address.ADDRESSTYPE);
			address.setDistrictId(CmConstants.Address.DISTRICTID);
			if(StringUtils.isNotBlank(houseNum)){
				if(Character.isLetter(houseNum.charAt(houseNum.length()-1))){
					address.setHouseNumber(String.valueOf(Integer.valueOf(houseNum.substring(0,houseNum.length()-1).trim())));
					address.setHouseLetter(String.valueOf(houseNum.charAt(houseNum.length()-1)));
				}else{
					address.setHouseNumber(String.valueOf(Integer.valueOf(houseNum.trim())));
					address.setHouseLetter("");
				}
			}
			if (StringUtils.isNotBlank(floor)) {
				address.setFloor(floor.trim());
			} else {
				address.setFloor("");
			}
			if (StringUtils.isNotBlank(streetName)) {
				address.setStreetName(streetName.trim());
			} else {
				address.setStreetName("");
			}
			if (StringUtils.isNotBlank(city)) {
				address.setCity(city.trim());
			} else {
				address.setCity("");
			}
			if (StringUtils.isNotBlank(smallCity)) {
				address.setCounty(smallCity.trim());
			} else {
				address.setCounty("");
			}
			if (StringUtils.isNotBlank(postCode)) {
				address.setZipcode(postCode);
			} else {
				address.setZipcode("");
			}
			if (StringUtils.isNotBlank(munici)) {
				address.setMunicipality(munici);
			} else {
				address.setMunicipality("");
			}
			//根据特殊规则判断sidedoer的走向
			if(StringUtils.isNotBlank(sideOrApartNum)){
				if(CmCommonUtil.validateSidedoer(sideOrApartNum)){
					address.setApartment(sideOrApartNum.trim());
					address.setDoorNumber("");
				}else{
					address.setDoorNumber(sideOrApartNum.trim());
					address.setApartment("");
				}
			}else{
				address.setApartment("");
				address.setDoorNumber("");
			}
			//if (StringUtils.isNotBlank(addressDesc)) {
			//	address.setAddrDesc(addressDesc);
			//} else {
			address.setAddrDesc("");
			//}
			address.setMainDoor("");
			
			//地址层级中增加CO_NAME
			if(StringUtils.isNotBlank(coName)){
				address.setCoName(coName);
			}else{
				address.setCoName("");
			}
			// 保存地址信息
			IAddressSV service1 = (IAddressSV) ServiceFactory.getService(IAddressSV.class);
			long addressId = service1.saveAddress(address);
			ICmCustomerSV service2 = (ICmCustomerSV) ServiceFactory.getService(ICmCustomerSV.class);
			ArrayList<IBOCmCustContactMediumValue> list = new ArrayList<IBOCmCustContactMediumValue>();
			IBOCmCustContactMediumValue value = new BOCmCustContactMediumBean();
			value.setCustId(DataType.getAsLong(custId));
			value.setContMedTypeId(CmConstants.AddressId.legalAddress);
			value.setAddressId(addressId);
			value.setRegionId((String) CmCommonUtil.getDefaultRegionId());
			address realAddress = service1.getAddress(addressId, "012002002");
			value.setAddressDetail(realAddress.getAddrDesc());
			list.add(value);
			service2.saveCustContMedium(list.toArray(new BOCmCustContactMediumBean[0]));
		}
		return map;
	}

	/*
	 * 保存客户电话email信息
	 */
	private void saveContact(String phone, String email, String custId) throws Exception {
		// 保存联系电话
		IBOCmCustContactMediumValue phoneValue = new BOCmCustContactMediumBean();
		phoneValue.setCustId(Long.parseLong(custId));
		phoneValue.setContMedTypeId(31);
		phoneValue.setContNumber(phone);
		phoneValue.setCustContRelaId(CmCommonUtil.getNewSequence(BOCmCustContactMediumBean.class));
		phoneValue.setState(CmConstants.RecordState.USE);
		phoneValue.setRegionId(CmCommonUtil.getDefaultRegionId());
		// 保存email
		IBOCmCustContactMediumValue emailValue = new BOCmCustContactMediumBean();
		emailValue.setCustId(Long.parseLong(custId));
		emailValue.setContMedTypeId(21);
		emailValue.setEmailAddress(email);
		emailValue.setCustContRelaId(CmCommonUtil.getNewSequence(BOCmCustContactMediumBean.class));
		emailValue.setState(CmConstants.RecordState.USE);
		emailValue.setRegionId(CmCommonUtil.getDefaultRegionId());
		ICmCustomerSV custSV = (ICmCustomerSV) ServiceFactory.getService(ICmCustomerSV.class);
		List<IBOCmCustContactMediumValue> list = new ArrayList<IBOCmCustContactMediumValue>();
		list.add(phoneValue);
		list.add(emailValue);
		// 保存联系信息
		custSV.saveCustContMedium(list.toArray(new IBOCmCustContactMediumValue[0]));
	}

	public IBOCmGroupMemberValue getGroupMember(long memberCustId) throws Exception {
		if (memberCustId > 0) {
			StringBuilder condition = new StringBuilder();
			condition.append("1=1").append(" and ").append(IBOCmGroupMemberValue.S_MemberCustId).append("=:memberCustId").append(" and ").append(IBOCmGroupMemberValue.S_State)
					.append("='U'");
			Map parameter = new HashMap();
			parameter.put("memberCustId", memberCustId);
			IBOCmGroupMemberValue value[] = (IBOCmGroupMemberValue[]) CmInnerServiceFactory.getCommonInnerSV().getBeans(BOCmGroupMemberBean.class, condition.toString(), parameter,
					-1, -1);
			if (value != null && value.length > 0) {
				return value[0];
			} else {
				return null;
			}

		} else {
			ExceptionUtil.throwBusinessException("CMS0076044");
		}
		return null;
	}

	public void statusNotify(String notifyBillId, String notifyMsg) throws Exception {
		// 调用发送短信接口完成短信发送
		if (StringUtils.isNotBlank(notifyBillId) && StringUtils.isNotBlank(notifyMsg)) {
			CenterFactory.setCenterInfoByTypeAndValue(CmConstants.CenterType.BILL_ID, notifyBillId);
			CmServiceFactory.getTeamInvokeSV().sendSms(notifyBillId, notifyMsg);
		}
	}

	public static void main(String[] args) throws Exception {
		// 启动下载FTP文件入库
		 BpFrameWork.main(new String[] { "-ftp", "BATCH_ADD_GROUP_MEMBER_21" });
		// 根据入库文件执行业务逻辑
		//BpFrameWork.main(new String[] { "-dispatcher", "BATCH_ADD_GROUP_MEMBER_21:21:1:0" });
	}

}
