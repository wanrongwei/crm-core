package com.asiainfo.crm.cm.pushc.bean;

import java.io.Serializable;
import java.util.List;

public class CustomerGroup implements Serializable{
	private String eventTime;
	private long groupId;
	private String groupName;
	private long groupType;
	private long groupStatus;
	private long groupLevel;
	private long validType;
	
	private CustomerGroupAdmin newAdmin;
	private CustomerGroupAdmin admin;
	private CustomerGroupMember member;
	private CustomerGroupInvitation invitation;
	private List<OfferGroupDiscount> offerGroupDiscountList;

	public String getEventTime() {
		return eventTime;
	}
	public void setEventTime(String eventTime) {
		this.eventTime = eventTime;
	}
	public long getGroupId() {
		return groupId;
	}
	public void setGroupId(long groupId) {
		this.groupId = groupId;
	}
	public String getGroupName() {
		return groupName;
	}
	public void setGroupName(String groupName) {
		this.groupName = groupName;
	}
	public long getGroupType() {
		return groupType;
	}
	public void setGroupType(long groupType) {
		this.groupType = groupType;
	}
	public long getGroupStatus() {
		return groupStatus;
	}
	public void setGroupStatus(long groupStatus) {
		this.groupStatus = groupStatus;
	}
	public long getGroupLevel() {
		return groupLevel;
	}
	public void setGroupLevel(long groupLevel) {
		this.groupLevel = groupLevel;
	}
	public long getValidType() {
		return validType;
	}
	public void setValidType(long validType) {
		this.validType = validType;
	}
	public CustomerGroupAdmin getNewAdmin() {
		return newAdmin;
	}
	public void setNewAdmin(CustomerGroupAdmin newAdmin) {
		this.newAdmin = newAdmin;
	}
	public CustomerGroupAdmin getAdmin() {
		return admin;
	}
	public void setAdmin(CustomerGroupAdmin admin) {
		this.admin = admin;
	}
	public CustomerGroupMember getMember() {
		return member;
	}
	public void setMember(CustomerGroupMember member) {
		this.member = member;
	}
	public CustomerGroupInvitation getInvitation() {
		return invitation;
	}
	public void setInvitation(CustomerGroupInvitation invitation) {
		this.invitation = invitation;
	}
	public List<OfferGroupDiscount> getOfferGroupDiscountList() {
		return offerGroupDiscountList;
	}
	public void setOfferGroupDiscountList(List<OfferGroupDiscount> offerGroupDiscountList) {
		this.offerGroupDiscountList = offerGroupDiscountList;
	}
	
	
}
