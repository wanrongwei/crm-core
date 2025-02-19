package com.asiainfo.crm.cm.customer.group.service.impl;

import com.ai.appframe2.bo.DataContainer;
import com.ai.appframe2.service.ServiceFactory;
import com.asiainfo.crm.cm.customer.group.service.interfaces.ICmGroupOrgSV;
import com.asiainfo.crm.cm.model.bo.GroupMemberBean;
import com.asiainfo.crm.cm.model.ivalues.ICustOrganizeValue;
import com.asiainfo.crm.cm.model.ivalues.IGroupMemberValue;
import com.asiainfo.crm.cm.teaminvoke.out.service.interfaces.ICmInterfaceSV;
import com.asiainfo.crm.so.teaminvoke.out.service.interfaces.ICrmFSV;
import org.apache.commons.lang.StringUtils;

import java.rmi.RemoteException;
import java.util.ArrayList;
import java.util.List;

/**
 * User: caiwm
 * Date: 13-8-16
 * Time: 下午1:58
 */
public class CmGroupOrgSVImpl implements ICmGroupOrgSV {

    public DataContainer queryGrpOrgById(long deptId) throws Exception, RemoteException {

        ICmInterfaceSV iCmInterfaceSV = (ICmInterfaceSV) ServiceFactory.getService(ICmInterfaceSV.class);
        ICustOrganizeValue orgValue = iCmInterfaceSV.queryCustOrganizeById(deptId);

        DataContainer dc = new DataContainer();
        dc.copy(orgValue);
        dc.set("NOTES", orgValue.getRemarks());
        dc.set("GROUP_CUST_ID", orgValue.getCustId());
        return dc;
    }

    public IGroupMemberValue queryGroupCustMember(long deptId, String billId) throws Exception, RemoteException {
        ICmInterfaceSV iCmInterfaceSV = (ICmInterfaceSV) ServiceFactory.getService(ICmInterfaceSV.class);
        IGroupMemberValue[] values = iCmInterfaceSV.queryGroupMembers(deptId, StringUtils.EMPTY, billId, 0,
                iCmInterfaceSV.queryGroupMembersCount(deptId, StringUtils.EMPTY, billId)
        );
        if (null == values || values.length < 1) {
            //如果没查到组织成员，则校验一下用户的手机号码
            ICrmFSV iCrmFSV = (ICrmFSV) ServiceFactory.getService(ICrmFSV.class);
            //直接查，如果查询不到用户，服务里会抛出异常。
            iCrmFSV.queryUserInfo4CM(billId);
            return new GroupMemberBean();
        }
        return values[0];
    }

    public DataContainer[] getDeptByGroupCustId(long groupCustId) throws Exception, RemoteException {
        ICmInterfaceSV iCmInterfaceSV = (ICmInterfaceSV) ServiceFactory.getService(ICmInterfaceSV.class);
        ICustOrganizeValue[] orgValues = iCmInterfaceSV.queryCustOrganizesById(groupCustId, 0L, 0,
                iCmInterfaceSV.queryCustOrganizesCountById(groupCustId, 0L));

        List<DataContainer> list = new ArrayList<DataContainer>();
        if (null != orgValues && orgValues.length > 0) {
            for (ICustOrganizeValue v : orgValues) {
                DataContainer dc = new DataContainer();
                dc.copy(v);
                list.add(dc);
                List<DataContainer> tmp = getDeptDeeply(groupCustId, v.getDeptId());
                if (null != tmp) list.addAll(tmp);
            }
        }
        return list.toArray(new DataContainer[0]);
    }

    private List<DataContainer> getDeptDeeply(long groupCustId, long pDeptId) throws Exception, RemoteException {
        List<DataContainer> list = null;
        ICmInterfaceSV iCmInterfaceSV = (ICmInterfaceSV) ServiceFactory.getService(ICmInterfaceSV.class);
        ICustOrganizeValue[] orgValues = iCmInterfaceSV.queryCustOrganizesById(groupCustId, pDeptId, 0,
                iCmInterfaceSV.queryCustOrganizesCountById(groupCustId, pDeptId));
        if (null != orgValues && orgValues.length > 0) {
            list = new ArrayList<DataContainer>();
            for (ICustOrganizeValue v : orgValues) {
                DataContainer dc = new DataContainer();
                dc.copy(v);
                list.add(dc);
                List<DataContainer> tmp = getDeptDeeply(v.getCustId(), v.getDeptId());
                if (null != tmp) list.addAll(tmp);
            }
        }
        return list;
    }
}
