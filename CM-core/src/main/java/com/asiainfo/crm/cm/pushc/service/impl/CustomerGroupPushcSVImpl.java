package com.asiainfo.crm.cm.pushc.service.impl;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import com.ai.appframe2.service.ServiceFactory;
import com.asiainfo.crm.cm.custgroup.ivalues.IBOCmCustomerGroupValue;
import com.asiainfo.crm.cm.custgroup.utils.InnerServiceFactory;
import com.asiainfo.crm.cm.model.ivalues.ICustomerValue;
import com.asiainfo.crm.cm.pushc.bean.CustomerGroup;
import com.asiainfo.crm.cm.pushc.bean.CustomerGroupAdmin;
import com.asiainfo.crm.cm.pushc.bean.CustomerGroupInvitation;
import com.asiainfo.crm.cm.pushc.bean.CustomerGroupMember;
import com.asiainfo.crm.cm.pushc.bean.OfferGroupDiscount;
import com.asiainfo.crm.cm.pushc.service.interfaces.ICustomerGroupPushcSV;
import com.asiainfo.crm.cm.teaminvoke.out.service.interfaces.ICmCustomerSV;

import net.sf.json.JSONArray;
import net.sf.json.JSONObject;

public class CustomerGroupPushcSVImpl implements ICustomerGroupPushcSV{

	private CustomerGroup getCustomerGroup(long groupId) throws Exception {
		if (groupId<=0) {
			return null;
		}
		
		CustomerGroup rtn = null;
		IBOCmCustomerGroupValue[] custGroupArr = InnerServiceFactory.getCustGroupSV().queryCmCustomerGroupByCondition(groupId, -1, -1);
		if (custGroupArr!=null && custGroupArr.length>0) {
			rtn = new CustomerGroup();
			rtn.setGroupId( custGroupArr[0].getGroupId() );
			rtn.setGroupName( custGroupArr[0].getGroupName() );
			rtn.setGroupType( custGroupArr[0].getGroupType() );
			rtn.setGroupStatus( custGroupArr[0].getGroupStatus() );
			rtn.setGroupLevel( custGroupArr[0].getGroupLevel() );
			rtn.setValidType( custGroupArr[0].getValidType() );
		}
		return rtn;
	}
	
	private List<OfferGroupDiscount> converOfferGroupDiscountList(JSONArray groupDiscount)
			throws Exception {
		List<OfferGroupDiscount> rtn = null;
		if (groupDiscount!=null && groupDiscount.length()>0) {
			rtn = new ArrayList<OfferGroupDiscount>();
			for (int i=0; i<groupDiscount.length(); i++) {
				JSONObject jsonObj = groupDiscount.getJSONObject(i);
				rtn.add( (OfferGroupDiscount) JSONObject.toBean(jsonObj, OfferGroupDiscount.class) );
			}
		}
		return rtn;
	}

	@Override
	public CustomerGroup handleStructEventParamOfAssignNewAdmin(long groupId, long admin, long newAdmin) throws Exception {
		CustomerGroup  customerGroup = getCustomerGroup(groupId);
		ICmCustomerSV customerSV = (ICmCustomerSV)ServiceFactory.getService(ICmCustomerSV.class);
		// 老管理员
		ICustomerValue adminCustomer = customerSV.queryCustomerByCustId(admin);
		if (adminCustomer!=null) {
			CustomerGroupAdmin obj = new CustomerGroupAdmin();
			obj.setCustId(adminCustomer.getCustId());
			obj.setCustName(adminCustomer.getCustName());
			customerGroup.setAdmin(obj);
		}
		// 新管理员
		ICustomerValue newAdminCustomer = customerSV.queryCustomerByCustId(newAdmin);
		if (newAdminCustomer!=null) {
			CustomerGroupAdmin obj = new CustomerGroupAdmin();
			obj.setCustId(newAdminCustomer.getCustId());
			obj.setCustName(newAdminCustomer.getCustName());
			customerGroup.setNewAdmin(obj);
		}
		return customerGroup;
	}

	@Override
	public CustomerGroup handleStructEventParamOfDeclineInvitation(long groupId, long inviter) throws Exception {
		CustomerGroup  customerGroup = getCustomerGroup(groupId);
		ICmCustomerSV customerSV = (ICmCustomerSV)ServiceFactory.getService(ICmCustomerSV.class);
		// 设置邀请参数
		ICustomerValue inviterCustomer = customerSV.queryCustomerByCustId(inviter);
		if (inviterCustomer!=null) {
			CustomerGroupInvitation invitation = new CustomerGroupInvitation();
			invitation.setInviteRefCustId(inviterCustomer.getCustId());
			invitation.setInviteRefCustName(inviterCustomer.getCustName());
			
			customerGroup.setInvitation(invitation);
		}

		return customerGroup;
	}

	@Override
	public CustomerGroup handleStructEventParamOfInviteByCode(long groupId, String invitationCode, Date expireDate) throws Exception {
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
		CustomerGroup  customerGroup = getCustomerGroup(groupId);

		// 设置邀请参数
		CustomerGroupInvitation invitation = new CustomerGroupInvitation();
		invitation.setInviteCode(invitationCode);
		invitation.setExpirationDate(sdf.format(expireDate));
		customerGroup.setInvitation(invitation);

		return customerGroup;
	}

	@Override
	public CustomerGroup handleStructEventParamOfInviteByPhone(long groupId, long admin, long inviter, JSONArray inviteeDiscountList) throws Exception {
		CustomerGroup  customerGroup = getCustomerGroup(groupId);
		ICmCustomerSV customerSV = (ICmCustomerSV)ServiceFactory.getService(ICmCustomerSV.class);
		
		// 管理员
		ICustomerValue adminCustomer = customerSV.queryCustomerByCustId(admin);
		if (adminCustomer!=null) {
			CustomerGroupAdmin obj = new CustomerGroupAdmin();
			obj.setCustId(adminCustomer.getCustId());
			obj.setCustName(adminCustomer.getCustName());
			customerGroup.setAdmin(obj);
		}
		
		// 邀请参数
		ICustomerValue inviterCustomer = customerSV.queryCustomerByCustId(inviter);
		if (inviterCustomer!=null) {
			CustomerGroupInvitation invitation = new CustomerGroupInvitation();
			invitation.setInviteRefCustId(inviterCustomer.getCustId());
			invitation.setInviteRefCustName(inviterCustomer.getCustName());
			invitation.setOfferGroupDiscountList(converOfferGroupDiscountList(inviteeDiscountList));
			customerGroup.setInvitation(invitation);
		}
		
		return customerGroup;
	}

	@Override
	public CustomerGroup handleStructEventParamOfJoinGroup(long groupId, long admin, long inviter, JSONArray groupDiscountList,
			JSONArray inviteeDiscountList) throws Exception {
		CustomerGroup  customerGroup = getCustomerGroup(groupId);
		ICmCustomerSV customerSV = (ICmCustomerSV)ServiceFactory.getService(ICmCustomerSV.class);
		
		// 管理员
		ICustomerValue adminCustomer = customerSV.queryCustomerByCustId(admin);
		if (adminCustomer!=null) {
			CustomerGroupAdmin obj = new CustomerGroupAdmin();
			obj.setCustId(adminCustomer.getCustId());
			obj.setCustName(adminCustomer.getCustName());
			customerGroup.setAdmin(obj);
		}
		
		// 邀请参数
		ICustomerValue inviterCustomer = customerSV.queryCustomerByCustId(inviter);
		if (inviterCustomer!=null) {
			CustomerGroupInvitation invitation = new CustomerGroupInvitation();
			invitation.setInviteRefCustId(inviterCustomer.getCustId());
			invitation.setInviteRefCustName(inviterCustomer.getCustName());
			invitation.setOfferGroupDiscountList(converOfferGroupDiscountList(inviteeDiscountList));
			
			customerGroup.setInvitation(invitation);
		}
		
		// 群组 折扣信息
		customerGroup.setOfferGroupDiscountList(converOfferGroupDiscountList(groupDiscountList));
		
		return customerGroup;
	}

	@Override
	public CustomerGroup handleStructEventParamOfQuitGroup(long groupId, long admin, long member, JSONArray groupDiscountList,
			JSONArray memberDiscountList) throws Exception {
		CustomerGroup  customerGroup = getCustomerGroup(groupId);
		ICmCustomerSV customerSV = (ICmCustomerSV)ServiceFactory.getService(ICmCustomerSV.class);
		
		// 管理员
		ICustomerValue adminCustomer = customerSV.queryCustomerByCustId(admin);
		if (adminCustomer!=null) {
			CustomerGroupAdmin obj = new CustomerGroupAdmin();
			obj.setCustId(adminCustomer.getCustId());
			obj.setCustName(adminCustomer.getCustName());
			customerGroup.setAdmin(obj);
		}
		
		// 成员参数
		ICustomerValue memberCustomer = customerSV.queryCustomerByCustId(member);
		if (memberCustomer!=null) {
			CustomerGroupMember obj = new CustomerGroupMember();
			obj.setCustId(memberCustomer.getCustId());
			obj.setCustName(memberCustomer.getCustName());
			obj.setOfferGroupDiscountList(converOfferGroupDiscountList(memberDiscountList));
			customerGroup.setMember(obj);
		}
		
		// 群组 折扣信息
		customerGroup.setOfferGroupDiscountList(converOfferGroupDiscountList(groupDiscountList));
		return customerGroup;
	}

	@Override
	public CustomerGroup handleStructEventParamOfRemoveMember(long groupId, long admin, long member, JSONArray groupDiscountList,
			JSONArray memberDiscountList) throws Exception {
		CustomerGroup  customerGroup = getCustomerGroup(groupId);
		ICmCustomerSV customerSV = (ICmCustomerSV)ServiceFactory.getService(ICmCustomerSV.class);
		
		// 管理员
		ICustomerValue adminCustomer = customerSV.queryCustomerByCustId(admin);
		if (adminCustomer!=null) {
			CustomerGroupAdmin obj = new CustomerGroupAdmin();
			obj.setCustId(adminCustomer.getCustId());
			obj.setCustName(adminCustomer.getCustName());
			customerGroup.setAdmin(obj);
		}
		
		// 成员参数
		ICustomerValue memberCustomer = customerSV.queryCustomerByCustId(member);
		if (memberCustomer!=null) {
			CustomerGroupMember obj = new CustomerGroupMember();
			obj.setCustId(memberCustomer.getCustId());
			obj.setCustName(memberCustomer.getCustName());
			obj.setOfferGroupDiscountList(converOfferGroupDiscountList(memberDiscountList));
			customerGroup.setMember(obj);
		}
		
		// 群组 折扣信息
		customerGroup.setOfferGroupDiscountList(converOfferGroupDiscountList(groupDiscountList));
		return customerGroup;
	}

	@Override
	public CustomerGroup handleStructEventParamOfChangeNegotiation(long member, JSONArray memberDiscountList) throws Exception {
		ICmCustomerSV customerSV = (ICmCustomerSV)ServiceFactory.getService(ICmCustomerSV.class);
		CustomerGroup  customerGroup = new CustomerGroup();

		// 成员参数
		ICustomerValue memberCustomer = customerSV.queryCustomerByCustId(member);
		if (memberCustomer!=null) {
			CustomerGroupMember obj = new CustomerGroupMember();
			obj.setCustId(memberCustomer.getCustId());
			obj.setCustName(memberCustomer.getCustName());
			obj.setOfferGroupDiscountList(converOfferGroupDiscountList(memberDiscountList));
			customerGroup.setMember(obj);
		}
		return customerGroup;
	}

}
