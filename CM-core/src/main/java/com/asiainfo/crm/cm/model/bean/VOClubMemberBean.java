package com.asiainfo.crm.cm.model.bean;

import java.util.ArrayList;
import java.util.List;

import com.ai.common.util.ExceptionUtil;
import com.asiainfo.crm.cm.common.util.CmCommonUtil;
import com.asiainfo.crm.cm.model.bo.ClubActionRecBean;
import com.asiainfo.crm.cm.model.bo.ClubMemberCardBean;
import com.asiainfo.crm.cm.model.bo.ClubServiceAdjustBean;
import com.asiainfo.crm.cm.model.bo.ClubServiceRecBean;
import com.asiainfo.crm.cm.model.ivalues.IClubActionRecValue;
import com.asiainfo.crm.cm.model.ivalues.IClubMemberCardValue;
import com.asiainfo.crm.cm.model.ivalues.IClubMemberValue;
import com.asiainfo.crm.cm.model.ivalues.IClubServiceAdjustValue;
import com.asiainfo.crm.cm.model.ivalues.IClubServiceRecValue;
import com.asiainfo.crm.cm.model.ivalues.IClubValue;
import com.asiainfo.crm.cm.model.ivalues.ICustomerValue;
import com.asiainfo.crm.cm.model.ivalues.IPartyValue;
import com.asiainfo.crm.cm.model.ivalues.IVOClubMemberValue;

/**   
 * @Copyright Copyright (c) 2012 Asiainfo-Linkage
 * 
 * @ClassName 
 * @Description 该类的功能描述
 *
 * @version v1.0.0
 * @author huzq2
 * @date 2012-1-8 下午10:19:37
 * <br>
 * Modification History:<br>
 * Date         Author          Version            Description<br>
 * ---------------------------------------------------------*<br>
 * 2012-1-8     Xiaohu           v1.0.0               修改原因<br>
 */
public class VOClubMemberBean extends ValueObjectBean implements IVOClubMemberValue {

	/**
	 * 
	 */
	private static final long serialVersionUID = -3028026422248710137L;
	private IClubMemberValue clubMemberValue;
	private IClubValue clubValue;
	private ICustomerValue customerValue;
	private IPartyValue partyValue;
	private List<IClubMemberCardValue> memberCardValues = new ArrayList<IClubMemberCardValue>();
	private List<IClubServiceAdjustValue> serviceAdjustValues = new ArrayList<IClubServiceAdjustValue>();
	private List<IClubServiceRecValue> serviceRecValues = new ArrayList<IClubServiceRecValue>();
	private List<IClubActionRecValue> actionRecValues = new ArrayList<IClubActionRecValue>();

	public IClubValue getClub() throws Exception {
		return this.clubValue;
	}

	public IClubMemberValue getClubMember() throws Exception {
		return this.clubMemberValue;
	}

	public ICustomerValue getCustomer() throws Exception {
		return this.customerValue;
	}

	public long getMemberId() {
		if (this.clubMemberValue != null) {
			return this.clubMemberValue.getMemberId();
		}
		return 0;
	}

	public IPartyValue getParty() throws Exception {
		return this.partyValue;
	}

	public long setClub(IClubValue clubValue) throws Exception {
		this.clubValue = clubValue;
		if (this.clubValue != null) {
			return this.clubValue.getClubId();
		}
		return -1;
	}

	public long setClubMember(IClubMemberValue clubMemberValue) throws Exception {
		this.clubMemberValue = clubMemberValue;
		if (this.clubMemberValue != null) {
			return this.clubMemberValue.getMemberId();
		}
		return -1;
	}

	public long setCustomer(ICustomerValue customerValue) throws Exception {
		this.customerValue = customerValue;
		if (this.customerValue != null) {
			return this.customerValue.getCustId();
		}
		return -1;
	}

	public long setParty(IPartyValue partyValue) throws Exception {
		this.partyValue = partyValue;
		if (this.partyValue != null) {
			return this.partyValue.getPartyId();
		}
		return -1;
	}

	public long getClubId() {
		if (this.clubMemberValue != null) {
			return this.clubMemberValue.getClubId();
		}
		return 0;
	}

	public IClubMemberCardValue[] getClubMemberCards() throws Exception {
		return this.memberCardValues.toArray(new ClubMemberCardBean[0]);
	}

	public long setClubMemberCard(IClubMemberCardValue memberCardValue) throws Exception {
		if (memberCardValue == null) {
			// 如果参数为null，抛出业务异常：传入的数据对象错误。
			ExceptionUtil.throwBusinessException("CMS0030015");
		}
		this.memberCardValues.add(memberCardValue);
		return memberCardValue.getRecordId();
	}

	public IClubMemberCardValue removeClubMemberCard(IClubMemberCardValue memberCardValue) throws Exception {
		this.memberCardValues.remove(memberCardValue);
		return memberCardValue;
	}

	public IClubServiceAdjustValue[] getClubServiceAdjusts() throws Exception {
		return this.serviceAdjustValues.toArray(new ClubServiceAdjustBean[0]);
	}

	public long setClubServiceAdjust(IClubServiceAdjustValue serviceAdjustValue) throws Exception {
		if (serviceAdjustValue == null) {
			// 如果参数为null，抛出业务异常：传入的数据对象错误。
			ExceptionUtil.throwBusinessException("CMS0030015");
		}
		this.serviceAdjustValues.add(serviceAdjustValue);
		return serviceAdjustValue.getRecordId();
	}

	public IClubServiceAdjustValue removeClubServiceAdjust(IClubServiceAdjustValue serviceAdjustValue) throws Exception {
		if (serviceAdjustValue == null) {
			// 如果参数为null，抛出业务异常：传入的数据对象错误。
			ExceptionUtil.throwBusinessException("CMS0030015");
		}
		this.serviceAdjustValues.remove(serviceAdjustValue);
		return serviceAdjustValue;
	}

	public IClubServiceRecValue[] getClubServiceRecs() throws Exception {
		return this.serviceRecValues.toArray(new ClubServiceRecBean[0]);
	}

	public long setClubServiceRec(IClubServiceRecValue serviceRecValue) throws Exception {
		if (serviceRecValue == null) {
			// 如果参数为null，抛出业务异常：传入的数据对象错误。
			ExceptionUtil.throwBusinessException("CMS0030015");
		}
		this.serviceRecValues.add(serviceRecValue);
		return serviceRecValue.getRecordId();
	}

	public IClubServiceRecValue removeClubServiceRec(IClubServiceRecValue serviceRecValue) throws Exception {
		if (serviceRecValue == null) {
			// 如果参数为null，抛出业务异常：传入的数据对象错误。
			ExceptionUtil.throwBusinessException("CMS0030015");
		}
		this.serviceRecValues.remove(serviceRecValue);
		return serviceRecValue;
	}

	public IClubActionRecValue[] getClubActionRecs() throws Exception {
		return this.actionRecValues.toArray(new ClubActionRecBean[0]);
	}

	public long setClubActionRec(IClubActionRecValue actionRecValue) throws Exception {
		if (actionRecValue == null) {
			// 如果参数为null，抛出业务异常：传入的数据对象错误。
			ExceptionUtil.throwBusinessException("CMS0030015");
		}
		this.actionRecValues.add(actionRecValue);
		return actionRecValue.getRecordId();
	}

	public IClubActionRecValue removeClubActionRec(IClubActionRecValue actionRecValue) throws Exception {
		if (actionRecValue == null) {
			// 如果参数为null，抛出业务异常：传入的数据对象错误。
			ExceptionUtil.throwBusinessException("CMS0030015");
		}
		this.actionRecValues.remove(actionRecValue);
		return actionRecValue;
	}

	public boolean hasActivityRecords() throws Exception {
		return CmCommonUtil.isNotEmptyObject(actionRecValues);
	}

	public boolean hasMemberCards() throws Exception {
		return CmCommonUtil.isNotEmptyObject(memberCardValues);
	}

	public boolean hasServiceRecords() throws Exception {
		return CmCommonUtil.isNotEmptyObject(serviceRecValues);
	}

	public boolean hasServiceAdjusts() throws Exception {
		return CmCommonUtil.isNotEmptyObject(serviceAdjustValues);
	}

	public long getId() {
		return getMemberId();
	}
}
