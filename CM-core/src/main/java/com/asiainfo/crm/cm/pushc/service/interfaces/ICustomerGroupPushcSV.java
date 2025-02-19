package com.asiainfo.crm.cm.pushc.service.interfaces;

import java.util.Date;
import java.util.Map;

import com.asiainfo.crm.cm.pushc.bean.CustomerGroup;

import net.sf.json.JSONArray;

public interface ICustomerGroupPushcSV {
	
	public CustomerGroup handleStructEventParamOfAssignNewAdmin(long groupId, long admin, long newAdmin)throws Exception;
	public CustomerGroup handleStructEventParamOfDeclineInvitation(long groupId, long inviter)throws Exception;
	public CustomerGroup handleStructEventParamOfInviteByCode(long groupId, String invitationCode, Date expireDate)throws Exception;
	public CustomerGroup handleStructEventParamOfInviteByPhone(long groupId, long admin, long inviter, JSONArray inviteeDiscountList)throws Exception;
	public CustomerGroup handleStructEventParamOfJoinGroup(long groupId, long admin, long inviter, JSONArray groupDiscountList, JSONArray inviteeDiscountList)throws Exception;
	public CustomerGroup handleStructEventParamOfQuitGroup(long groupId, long admin, long member, JSONArray groupDiscountList, JSONArray memberDiscountList)throws Exception;
	public CustomerGroup handleStructEventParamOfRemoveMember(long groupId, long admin, long member, JSONArray groupDiscountList, JSONArray memberDiscountList)throws Exception;
	public CustomerGroup handleStructEventParamOfChangeNegotiation(long member, JSONArray memberDiscountList) throws Exception;
}
