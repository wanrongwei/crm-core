package com.asiainfo.crm.cm.exe.batch.service.impl;

import java.sql.Timestamp;
import java.util.Map;

import org.apache.commons.lang.StringUtils;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import com.ai.common.i18n.CrmLocaleFactory;
import com.ai.common.util.ExceptionUtil;
import com.asiainfo.crm.cm.common.CmConstants;
import com.asiainfo.crm.cm.common.CmServiceFactory;
import com.asiainfo.crm.cm.exe.batch.service.interfaces.ICmGroupContactBatchSV;
import com.asiainfo.crm.cm.inner.customer.bo.BOCmGroupMemberBean;
import com.asiainfo.crm.cm.inner.customer.ivalues.IBOCmGroupMemberValue;
import com.asiainfo.crm.cm.model.bean.VOCustBean;
import com.asiainfo.crm.cm.model.bo.ContactBean;
import com.asiainfo.crm.cm.model.bo.CustRelationshipBean;
import com.asiainfo.crm.cm.model.ivalues.IContactValue;
import com.asiainfo.crm.cm.model.ivalues.ICustRelationshipValue;
import com.asiainfo.crm.cm.model.ivalues.IVOCustValue;

public class CmGroupContactBatchSVImpl implements ICmGroupContactBatchSV {

	private transient static Log log = LogFactory.getLog(CmGroupContactBatchSVImpl.class);

	public void importCommonContact(String[] colNames, String[] colValues, Map commonInfo) throws Exception {
		importGroupContact(colNames, colValues, commonInfo);
	}

	public void importGroupMember(String[] colNames, String[] colValues, Map commonInfo) throws Exception {
		IVOCustValue custValue = new VOCustBean();
		IBOCmGroupMemberValue cmGroupMemberValue = new BOCmGroupMemberBean();
		ICustRelationshipValue custRelValue = new CustRelationshipBean();
		for (int i = 0; i < colValues.length; i++) {
			//TODO 异常信息
			if (StringUtils.isBlank(colValues[i])) {
				if (IBOCmGroupMemberValue.S_MemberName.equals(colNames[i])) {

				} else if (IBOCmGroupMemberValue.S_CustId.equals(colNames[i])) {

				}
			} else {
				if (IBOCmGroupMemberValue.S_CustId.equals(colNames[i])) {
					cmGroupMemberValue.setCustId(Long.valueOf(colValues[i]));
				} else if (IBOCmGroupMemberValue.S_DeptId.equals(colNames[i])) {
					cmGroupMemberValue.setDeptId(Long.valueOf(colValues[i]));
				} else if (IBOCmGroupMemberValue.S_MemberCustId.equals(colNames[i])) {
					cmGroupMemberValue.setMemberCustId(Long.valueOf(colValues[i]));
				} else if (IBOCmGroupMemberValue.S_MemberName.equals(colNames[i])) {
					cmGroupMemberValue.setMemberName(colValues[i]);
				} else if (IBOCmGroupMemberValue.S_MemberPosition.equals(colNames[i])) {
					cmGroupMemberValue.setMemberPosition(colValues[i]);
				} else if (IBOCmGroupMemberValue.S_MemberRole.equals(colNames[i])) {
					cmGroupMemberValue.setMemberRole(Integer.valueOf(colValues[i]));
				} else if (IBOCmGroupMemberValue.S_MemberType.equals(colNames[i])) {
					cmGroupMemberValue.setMemberType(Integer.valueOf(colValues[i]));
				} else if (IBOCmGroupMemberValue.S_MemberStatus.equals(colNames[i])) {
					cmGroupMemberValue.setMemberStatus(Integer.valueOf(colValues[i]));
				} else if (IBOCmGroupMemberValue.S_CustRegionId.equals(colNames[i])) {
					cmGroupMemberValue.setCustRegionId(colValues[i]);
				}
			}
		}
		custRelValue.copy(cmGroupMemberValue);
		custRelValue.setRelationType(CmConstants.CustRelationShip.CUST_REL_TYPE_GROUP_MEMBER);
		custValue.addCustRel(custRelValue);
		CmServiceFactory.getCustomerSV().saveCustomer(custValue);
	}

	public void importKeyContact(String[] colNames, String[] colValues, Map commonInfo) throws Exception {
		importGroupContact(colNames, colValues, commonInfo);
	}

	/**
	 * 
	 * @Function importGroupContact
	 * @Description 导入集团联系人信息
	 *
	 * @param colNames
	 * @param colValues
	 * @param commonInfo
	 * @throws Exception
	 *
	 * @version v1.0.0
	 * @author zhaofei3
	 * @date Jul 24, 2012 9:37:49 PM
	 * 
	 * <strong>Modification History:</strong><br>
	 * Date         Author          Version            Description<br>
	 * ---------------------------------------------------------<br>
	 * Jul 24, 2012     zhaofei3           v1.0.0               修改原因<br>
	 */
	private void importGroupContact(String[] colNames, String[] colValues, Map commonInfo) throws Exception {
		IVOCustValue custValue = new VOCustBean();
		IContactValue iContactValue = new ContactBean();
		for (int i = 0; i < colValues.length; i++) {
			//TODO 异常信息
			if (StringUtils.isBlank(colValues[i])) { // 以下字段不可为空
				if (IContactValue.S_PartyName.equals(colNames[i])) {
					log.error(CrmLocaleFactory.getResource("CMS0020241")); // 使用者姓，不能为空！
					ExceptionUtil.throwBusinessException("CMS0020241");
				} else if (IContactValue.S_Gender.equals(colNames[i])) {

				} else if (IContactValue.S_PrioryLevel.equals(colNames[i])) {

				} else if (IContactValue.S_ContType.equals(colNames[i])) {

				} else if (IContactValue.S_JobPosition.equals(colNames[i])) {

				} else if (IContactValue.S_CertType.equals(colNames[i])) {

				} else if (IContactValue.S_CertCode.equals(colNames[i])) {

				} else if (IContactValue.S_OfficeTel.equals(colNames[i])) {

				} else if (IContactValue.S_ContMobile.equals(colNames[i])) {

				}
			} else {
				if (IContactValue.S_PartyName.equals(colNames[i])) {
					iContactValue.setPartyName(colValues[i]);
				} else if (IContactValue.S_Gender.equals(colNames[i])) {
					iContactValue.setGender(Integer.valueOf(colValues[i]));
				} else if (IContactValue.S_PrioryLevel.equals(colNames[i])) {
					iContactValue.setPrioryLevel(Integer.valueOf(colValues[i]));
				} else if (IContactValue.S_ContLevel.equals(colNames[i])) {
					iContactValue.setContLevel(Integer.valueOf(colValues[i]));
				} else if (IContactValue.S_JobPosition.equals(colNames[i])) {
					iContactValue.setJobPosition(colValues[i]);
				} else if (IContactValue.S_JobDesc.equals(colNames[i])) {
					iContactValue.setJobDesc(colValues[i]);
				} else if (IContactValue.S_ContType.equals(colNames[i])) {
					iContactValue.setContType(Integer.valueOf(colValues[i]));
				} else if (IContactValue.S_Birthday.equals(colNames[i])) {
					iContactValue.setBirthday(Timestamp.valueOf(colValues[i]));
				} else if (IContactValue.S_CertType.equals(colNames[i])) {
					iContactValue.setCertType(Integer.valueOf(colValues[i]));
				} else if (IContactValue.S_CertCode.equals(colNames[i])) {
					iContactValue.setCertCode(colValues[i]);
				} else if (IContactValue.S_CertExpireDate.equals(colNames[i])) {
					iContactValue.setCertExpireDate(Timestamp.valueOf(colValues[i]));
				} else if (IContactValue.S_MarryStatus.equals(colNames[i])) {
					iContactValue.setMarryStatus(Integer.valueOf(colValues[i]));
				} else if (IContactValue.S_NationalType.equals(colNames[i])) {
					iContactValue.setNationalType(Integer.valueOf(colValues[i]));
				} else if (IContactValue.S_Religion.equals(colNames[i])) {
					iContactValue.setReligion(colValues[i]);
				} else if (IContactValue.S_EducationLevel.equals(colNames[i])) {
					iContactValue.setEducationLevel(Integer.valueOf(colValues[i]));
				} else if (IContactValue.S_IncomeLevel.equals(colNames[i])) {
					iContactValue.setIncomeLevel(Integer.valueOf(colValues[i]));
				} else if (IContactValue.S_OfficeTel.equals(colNames[i])) {
					iContactValue.setOfficeTel(colValues[i]);
				} else if (IContactValue.S_ContMobile.equals(colNames[i])) {
					iContactValue.setContMobile(colValues[i]);
				} else if (IContactValue.S_HomeTel.equals(colNames[i])) {
					iContactValue.setHomeTel(colValues[i]);
				} else if (IContactValue.S_ContEmail.equals(colNames[i])) {
					iContactValue.setContEmail(colValues[i]);
				} else if (IContactValue.S_ContFax.equals(colNames[i])) {
					iContactValue.setContFax(colValues[i]);
				} else if (IContactValue.S_ContAddress.equals(colNames[i])) {
					iContactValue.setContAddress(colValues[i]);
				} else if (IContactValue.S_PostCode.equals(colNames[i])) {
					iContactValue.setPostCode(colValues[i]);
				} else if (IContactValue.S_SecurityId.equals(colNames[i])) {
					iContactValue.setSecurityId(colValues[i]);
				} else if (IContactValue.S_CarNo.equals(colNames[i])) {
					iContactValue.setCarNo(colValues[i]);
				} else if (IContactValue.S_PoliticsFace.equals(colNames[i])) {
					iContactValue.setPoliticsFace(Integer.valueOf(colValues[i]));
				} else if (IContactValue.S_CharacterDesc.equals(colNames[i])) {
					iContactValue.setCharacterDesc(colValues[i]);
				} else if (IContactValue.S_JobCompany.equals(colNames[i])) {
					iContactValue.setJobCompany(colValues[i]);
				} else if (IContactValue.S_FamilyInfo.equals(colNames[i])) {
					iContactValue.setFamilyInfo(colValues[i]);
				} else if (IContactValue.S_AlarmBillId.equals(colNames[i])) {
					iContactValue.setAlarmBillId(colValues[i]);
				} else if (IContactValue.S_Nationality.equals(colNames[i])) {
					iContactValue.setNationality(colValues[i]);
				} else if (IContactValue.S_ProvinceId.equals(colNames[i])) {
					iContactValue.setProvinceId(colValues[i]);
				} else if (IContactValue.S_CityId.equals(colNames[i])) {
					iContactValue.setCityId(colValues[i]);
				} else if (IContactValue.S_RegionType.equals(colNames[i])) {
					iContactValue.setRegionType(colValues[i]);
				} else if (IContactValue.S_SubRegionType.equals(colNames[i])) {
					iContactValue.setSubRegionType(colValues[i]);
				} else if (IContactValue.S_Remarks.equals(colNames[i])) {
					iContactValue.setRemarks(colValues[i]);
				}

			}
		}
		custValue.addContact(iContactValue);
		CmServiceFactory.getContactSV().saveCustContact(custValue);
	}
}
