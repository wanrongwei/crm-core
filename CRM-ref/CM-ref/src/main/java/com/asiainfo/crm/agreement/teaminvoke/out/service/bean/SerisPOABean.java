/**
 * 
 */
package com.asiainfo.crm.agreement.teaminvoke.out.service.bean;

import com.ai.appframe2.bo.DataContainer;

/**
 * For order usage
 * @author zhangfh3
 *
 */
public class SerisPOABean extends DataContainer {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 295898632975227200L;
	
	/**
	 * 合同id
	 */
	private long agreementId;
	/**
	 * 合同item id
	 */
	private long agreementItemId;
	/**
	 * 客户id
	 */
	private long ownerId;
	/**
	 * 手机号码
	 */
	private String phoneNumber;
	/**
	 * 主号码
	 */
	private String leadingNumber;
	/**
	 * 运营商
	 */
	private String telecomCompany;
	
	/**
	 * 起始号码
	 */
	private String startNum;
	/**
	 * 截止号码
	 */
	private String endNum;
	/**
	 * sim卡号码
	 */
	private String ICCID;
	/**
	 * 相当于我们客户id，页面手动输入的
	 */
	private String accountNum;
	/**
	 * 批量导入的号码信息
	 */
	private String serisPoaCustomerId;
	
	/**
	 * @return
	 */
	public String getSerisPoaCustomerId() {
		return this.getAsString("SERIS_POA_CUSTOMER_ID");
	}
	/**
	 * @param serisPoaCustomerId
	 */
	public void setSerisPoaCustomerId(String serisPoaCustomerId) {
		this.set("SERIS_POA_CUSTOMER_ID", serisPoaCustomerId);
	}
	/**
	 * @return the agreementId 合同id
	 */
	public long getAgreementId() {
		return this.getAsLong("AGREEMENT_ID");
	}
	/**
	 * @param agreementId the agreementId 合同id to set
	 */
	public void setAgreementId(long agreementId) {
		this.set("AGREEMENT_ID", agreementId);
	}
	/**
	 * @return the agreementItemId 合同itemid
	 */
	public long getAgreementItemId() {
		return this.getAsLong("AGREEMENT_ITEM_ID");
	}
	/**
	 * @param agreementItemId the 合同itemid to set
	 */
	public void setAgreementItemId(long agreementItemId) {
		this.set("AGREEMENT_ITEM_ID", agreementItemId);
	}
	/**
	 * @return the ownerId 客户id
	 */
	public long getOwnerId() {
		return this.getAsLong("OWNER_ID");
	}
	/**
	 * @param ownerId the ownerId 客户id to set
	 */
	public void setOwnerId(long ownerId) {
		this.set("OWNER_ID", ownerId);
	}
	/**
	 * @return the phoneNumber 手机号码
	 */
	public String getPhoneNumber() {
		return this.getAsString("PHONE_NUMBER");
	}
	/**
	 * @param phoneNumber the phoneNumber 手机号码  to set
	 */
	public void setPhoneNumber(String phoneNumber) {
		this.set("PHONE_NUMBER", phoneNumber);
	}
	/**
	 * @return leading number
	 */
	public String getLeadingNumber() {
		return this.getAsString("LEADING_NUMBER");
	}
	/**
	 * @param leadingNumber
	 */
	public void setLeadingNumber(String leadingNumber) {
		this.set("LEADING_NUMBER", leadingNumber);
	}
	/**
	 * @return the telecomCompany 运营商
	 */
	public String getTelecomCompany() {
		return this.getAsString("TELECOM_COMPANY");
	}
	/**
	 * @param telecomCompany the 运营商  to set
	 */
	public void setTelecomCompany(String telecomCompany) {
		this.set("TELECOM_COMPANY", telecomCompany);
	}
	/**
	 * @return the startNum 起始号码
	 */
	public String getStartNum() {
		return this.getAsString("START_NUM");
	}
	/**
	 * @param startNum the 起始号码  to set
	 */
	public void setStartNum(String startNum) {
		this.set("START_NUM", startNum);
	}
	/**
	 * @return the endNum 截止号码
	 */
	public String getEndNum() {
		return this.getAsString("END_NUM");
	}
	/**
	 * @param endNum the 截止号码  to set
	 */
	public void setEndNum(String endNum) {
		this.set("END_NUM", endNum);
	}
	/**
	 * @return the iCCID sim卡号码
	 */
	public String getICCID() {
		return this.getAsString("ICCID");
	}
	/**
	 * @param iCCID the iCCID sim卡号码 to set
	 */
	public void setICCID(String iCCID) {
		this.set("ICCID", iCCID);
	}
	/**
	 * @return the accountNum 账户号码
	 */
	public String getAccountNum() {
		return this.getAsString("ACCOUNT_NUM");
	}
	/**
	 * @param accountNum the 账户号码 to set
	 */
	public void setAccountNum(String accountNum) {
		this.set("ACCOUNT_NUM", accountNum);
	}
	
}
