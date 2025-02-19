package com.asiainfo.crm.ci.inter.out.bo;

import java.io.Serializable;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.commons.lang.StringUtils;

import com.asiainfo.crm.ci.interaction.ivalues.IBOCiInteractionCommentValue;

/**
 * 接触/交互接口参数对象
 * @author wangql2
 *
 */
public class CustomerInteractionBean implements Serializable{

	private long contactId;
	
	private long interactionId;
	
	private long accountId;
	
	/**
	 * 业务源系统标识
	 * 
	 * 必填，枚举类型，取值如下
	 * 
	 * CRM：		客户关系管理系统 
	 * BILLING：计费系统 
	 * C3：		融合感知中心 Convergent Context-awarness Center
	 */
	private String srcSysId;
	private String srcSysIdName;

	/**
	 * 业务源系统渠道代码。各个系统内自定义的渠道
	 * 
	 * 必填
	 */
	private String channelCode;
	private String channelName;

	private long channelId;

	/**
	 * 交互客户
	 * 
	 * 必填
	 */
	private long custId;

	/**
	 * 组织
	 * 
	 * 可填
	 */
	private long orgId;

	/**
	 * 客户区号
	 * 
	 * 可填
	 * 
	 */
	private String custRegionId;

	/**
	 * 操作员
	 * 
	 * 可填
	 */
	private long opId;

	/**
	 * 租户
	 * 
	 * 必填
	 */
	private String tenantId;

	//接触属性
	private String srcContactId;

	private long contactTime;

	private long contactCompleteTime;

	/**
	 * 接触类型
	 * 
	 * 必填，枚举类型，取值如下
	 * 
	 * 1：客户主动接触；2：客户被动接触
	 */
	private int contactType;
	private String contactTypeName;

	private long contactResult;

	private String contactResultDetail;

	//交互属性
	
	/**
	 * 源系统流水号
	 */
	private String srcInteractionId;
	
	/**
	 * 直接产生源系统流水号的实体id，比如出账，缴费，srcInteractionId为缴费业务流水号，而srcInteractionEntityId则为出账的流水号
	 */
	private String srcInteractionEntityId;
	
	private String srcInteractionRelaId;
	
	public String getSrcInteractionRelaId() {
		return srcInteractionRelaId;
	}

	public void setSrcInteractionRelaId(String srcInteractionRelaId) {
		this.srcInteractionRelaId = srcInteractionRelaId;
	}

	/**
	 * 上游交互编号
	 */
	private long upInteractionId;

	/**
	 * 用户号码
	 */
	private String msisdn;

	/**
	 * 接触媒介
	 * 
	 * 必填，枚举类型，取值如下
	 * 1：电话；2：短信；3：面对面；4：USSD；5：邮件；6：平信；7：IVR；8：彩信；9：Facebook；10：Twitter
	 */
	private String mediaType;
	private String mediaTypeName;

	/**
	 * 业务源交互类型。各个系统内对业务类型的定义
	 * 
	 * 必填
	 */
	private String srcBusiType;

	/**
	 * 交互类型
	 */
	private long interactionType;
	private String interactionTypeName;
	
	private long interactionCategoryId;
	private String interactionCategoryName;
	
	private long queryPri;

	/**
	 * 交互结果，枚举类型，取值如下
	 * 
	 * 0：成功，1：失败
	 */
	private long interactionResult;
	private String interactionResultName;
	
	private String interactionResultDetail;

	private CustomerInteractionBean[] downInteraction;
	
	private IBOCiInteractionCommentValue[] interactionComment;
	
	/**
	 * 详情页面
	 */
	private String detailPageUrl;
	
	/**
	 * 详情页面
	 */
	private String macroPageUrl;
	
	private String remark;
	
	/**
	 * 交互属性
	 */
	private List<Map<String, Object>> interactionAttrList = new ArrayList<Map<String, Object>>();
	
	public long getContactId() {
		return contactId;
	}
	
	public void setContactId(long contactId) {
		this.contactId = contactId;
	}
	
	public long getInteractionId() {
		return interactionId;
	}

	public void setInteractionId(long interactionId) {
		this.interactionId = interactionId;
	}

	public long getAccountId() {
		return accountId;
	}

	public void setAccountId(long accountId) {
		this.accountId = accountId;
	}
	
	public String getSrcInteractionEntityId() {
		return srcInteractionEntityId;
	}

	public void setSrcInteractionEntityId(String srcInteractionEntityId) {
		this.srcInteractionEntityId = srcInteractionEntityId;
	}

	public String getSrcSysId() {
		return srcSysId;
	}

	public void setSrcSysId(String srcSysId) {
		this.srcSysId = srcSysId;
	}
	
	public String getSrcSysIdName() {
		return srcSysIdName;
	}

	public void setSrcSysIdName(String srcSysIdName) {
		this.srcSysIdName = srcSysIdName;
	}

	public String getChannelCode() {
		return channelCode;
	}

	public void setChannelCode(String channelCode) {
		this.channelCode = channelCode;
	}
	
	public String getChannelName() {
		return channelName;
	}

	public void setChannelName(String channelName) {
		this.channelName = channelName;
	}

	public long getChannelId() {
		return channelId;
	}

	public void setChannelId(long channelId) {
		this.channelId = channelId;
	}
	
	public long getCustId() {
		return custId;
	}

	public void setCustId(long custId) {
		this.custId = custId;
	}
	
	public long getOrgId() {
		return orgId;
	}

	public void setOrgId(long orgId) {
		this.orgId = orgId;
	}
	
	public String getCustRegionId() {
		return custRegionId;
	}

	public void setCustRegionId(String custRegionId) {
		this.custRegionId = custRegionId;
	}
	
	public long getOpId() {
		return opId;
	}

	public void setOpId(long opId) {
		this.opId = opId;
	}

	public String getTenantId() {
		return tenantId;
	}

	public void setTenantId(String tenantId) {
		this.tenantId = tenantId;
	}
	
	public String getSrcContactId() {
		return srcContactId;
	}

	public void setSrcContactId(String srcContactId) {
		this.srcContactId = srcContactId;
	}
	
	public long getContactTime() {
		return contactTime;
	}

	public void setContactTime(Timestamp contactTime) {
		this.contactTime = contactTime.getTime();
	}

	public void setContactTime(long contactTime) {
		this.contactTime = contactTime;
	}
	
	public long getContactCompleteTime() {
		return contactCompleteTime;
	}

	public void setContactCompleteTime(Timestamp contactCompleteTime) {
		if(contactCompleteTime == null)
			return;
		this.contactCompleteTime = contactCompleteTime.getTime();
	}
	
	public void setContactCompleteTime(long contactCompleteTime) {
		this.contactCompleteTime = contactCompleteTime;
	}
	
	public int getContactType() {
		return contactType;
	}

	public void setContactType(int contactType) {
		this.contactType = contactType;
	}
	
	public String getContactTypeName() {
		return contactTypeName;
	}

	public void setContactTypeName(String contactTypeName) {
		this.contactTypeName = contactTypeName;
	}

	public long getContactResult() {
		return contactResult;
	}

	public void setContactResult(long contactResult) {
		this.contactResult = contactResult;
	}

	public String getInteractionResultName() {
		return interactionResultName;
	}

	public void setInteractionResultName(String interactionResultName) {
		this.interactionResultName = interactionResultName;
	}

	public String getContactResultDetail() {
		return contactResultDetail;
	}

	public void setContactResultDetail(String contactResultDetail) {
		this.contactResultDetail = contactResultDetail;
	}
	
	public String getSrcInteractionId() {
		return srcInteractionId;
	}

	public void setSrcInteractionId(String srcInteractionId) {
		this.srcInteractionId = srcInteractionId;
	}

	private long interactionTime;
	
	public long getInteractionTime() {
		return interactionTime;
	}

	public void setInteractionTime(Timestamp interactionTime) {
		if(interactionTime == null)
			return;
		this.interactionTime = interactionTime.getTime();
	}

	public void setInteractionTime(long interactionTime) {
		this.interactionTime = interactionTime;
	}
	
	private long interactionCompleteTime;

	public long getInteractionCompleteTime() {
		return interactionCompleteTime;
	}

	public void setInteractionCompleteTime(Timestamp interactionCompleteTime) {
		this.interactionCompleteTime = interactionCompleteTime.getTime();
	}
	
	public void setInteractionCompleteTime(long interactionCompleteTime) {
		this.interactionCompleteTime = interactionCompleteTime;
	}
	
	public String getMsisdn() {
		return msisdn;
	}

	public void setMsisdn(String msisdn) {
		this.msisdn = msisdn;
	}
	
	public String getMediaType() {
		return mediaType;
	}

	public void setMediaType(String mediaType) {
		this.mediaType = mediaType;
	}
	
	public String getMediaTypeName() {
		return mediaTypeName;
	}

	public void setMediaTypeName(String mediaTypeName) {
		this.mediaTypeName = mediaTypeName;
	}

	public String getSrcBusiType() {
		return srcBusiType;
	}

	public void setSrcBusiType(String srcBusiType) {
		this.srcBusiType = srcBusiType;
	}
	
	public long getInteractionType() {
		return interactionType;
	}

	public void setInteractionType(long interactionType) {
		this.interactionType = interactionType;
	}
	
	public String getInteractionTypeName() {
		return interactionTypeName;
	}

	public void setInteractionTypeName(String interactionTypeName) {
		this.interactionTypeName = interactionTypeName;
	}

	public long getInteractionCategoryId() {
		return interactionCategoryId;
	}

	public void setInteractionCategoryId(long interactionCategoryId) {
		this.interactionCategoryId = interactionCategoryId;
	}

	public String getInteractionCategoryName() {
		return interactionCategoryName;
	}

	public void setInteractionCategoryName(String interactionCategoryName) {
		this.interactionCategoryName = interactionCategoryName;
	}

	public long getInteractionResult() {
		return interactionResult;
	}

	public void setInteractionResult(long interactionResult) {
		this.interactionResult = interactionResult;
	}
	
	public String getInteractionResultDetail() {
		return interactionResultDetail;
	}

	public void setInteractionResultDetail(String interactionResultDetail) {
		this.interactionResultDetail = interactionResultDetail;
	}

	public String getRemark() {
		return remark;
	}

	public void setRemark(String remark) {
		this.remark = remark;
	}

	public List<Map<String, Object>> getInteractionAttrList() {
		return interactionAttrList;
	}

	public void setInteractionAttrList(List<Map<String, Object>> interactionAttrList) {
		this.interactionAttrList = interactionAttrList;
	}

	public void addInteractionAttr(String attrCode,String attrValue){
		if(interactionAttrList == null)
			interactionAttrList = new ArrayList<Map<String, Object>>();
		if(StringUtils.isNotBlank(attrCode) && StringUtils.isNotBlank(attrValue)){
			HashMap<String, Object> map = new HashMap<String, Object>();
			map.put(attrCode.trim(), attrValue.trim());
			interactionAttrList.add(map);
		}
	}

	public IBOCiInteractionCommentValue[] getInteractionComment() {
		return interactionComment;
	}

	public void setInteractionComment(
			IBOCiInteractionCommentValue[] interactionComment) {
		this.interactionComment = interactionComment;
	}

	public long getUpInteractionId() {
		return upInteractionId;
	}

	public void setUpInteractionId(long upInteractionId) {
		this.upInteractionId = upInteractionId;
	}

	public long getQueryPri() {
		return queryPri;
	}

	public void setQueryPri(long queryPri) {
		this.queryPri = queryPri;
	}

	public CustomerInteractionBean[] getDownInteraction() {
		return downInteraction;
	}

	public void setDownInteraction(CustomerInteractionBean[] downInteraction) {
		this.downInteraction = downInteraction;
	}

	public String getDetailPageUrl() {
		return detailPageUrl;
	}

	public void setDetailPageUrl(String detailPageUrl) {
		this.detailPageUrl = detailPageUrl;
	}

	public String getMacroPageUrl() {
		return macroPageUrl;
	}

	public void setMacroPageUrl(String macroPageUrl) {
		this.macroPageUrl = macroPageUrl;
	}
}
