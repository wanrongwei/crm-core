package com.asiainfo.crm.cm.customer.group.service.interfaces;

import com.ai.appframe2.bo.DataContainer;
import com.asiainfo.crm.cm.model.ivalues.IGroupMemberValue;

import java.rmi.RemoteException;

/**
 * User: caiwm
 * Date: 13-8-16
 * Time: 下午1:57
 */
public interface ICmGroupOrgSV {

    /**
     * 根据集团组织编号查询集团组织详情。在需要把集团组织
     * 信息展示在Form中的时候需要使用这个方法。
     *
     * @param deptId 集团组织编号
     * @return 因为客户关系接口返回的对象无法跟页面SET完全映射
     *         所以在服务里做了一次转换
     * @throws Exception
     * @throws RemoteException
     */
    public DataContainer queryGrpOrgById(long deptId) throws Exception, RemoteException;

    /**
     * 根据集团组织编号和用户的计费号查询成员信息。页面在Form中
     * 展示成员详情的时候，使用这个方法。
     *
     * @param deptId 集团组织编号
     * @param billId 要查询用户的计费号码
     * @return
     * @throws Exception
     * @throws RemoteException
     */
    public IGroupMemberValue queryGroupCustMember(long deptId, String billId) throws Exception, RemoteException;

    /**
     * 查询集团客户下所有的组织信息。在添加组织成员的时候，为了页面的友好
     * 不能直接把组织编号展示在页面上，需要做显示值与实际值分离。这个方法
     * 在构造集团客户组织列表DS的时候使用。
     *
     * @param groupCustId 集团客户编号
     * @return 集团组织列表
     * @throws Exception
     * @throws RemoteException
     */
    public DataContainer[] getDeptByGroupCustId(long groupCustId) throws Exception, RemoteException;
}
