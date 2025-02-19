package com.asiainfo.crm.so.teaminvoke.in.service.interfaces;

import java.rmi.RemoteException;

import com.ai.appframe2.privilege.UserInfoInterface;
import com.ai.secframe.orgmodel.ivalues.IBOSecOperatorValue;
import com.ai.secframe.orgmodel.ivalues.IBOSecOrganizeValue;
import com.ai.secframe.orgmodel.ivalues.IDistrictValue;
import com.ai.secframe.orgmodel.ivalues.IQBOSecOpStationOrgValue;
import com.ai.secframe.orgmodel.ivalues.IQBOSecOrgStaffOperValue;

public interface ISec2CrmSV {

    /**
     * 根据当前组织ID来获取对应的行政区域信息
     * @param organizeId
     * @return
     * @throws Exception
     * @throws RemoteException
     */
    public IDistrictValue getDistrictByOrgId(long organizeId) throws Exception,RemoteException;
    
    public IBOSecOrganizeValue getSecOrganizeById(long organizeId)throws Exception, RemoteException;
    
    public IBOSecOperatorValue getOperatorById(long operId)throws Exception, RemoteException ;
    
    public IBOSecOperatorValue getOperatorByCode(String operCode)throws Exception, RemoteException ;
    
    public IQBOSecOrgStaffOperValue getOperQBOByOperId(long operId)throws Exception, RemoteException ;
    
    public  UserInfoInterface setUserInfo(long operId) throws Exception, RemoteException;
    
 	/**   
 	 * @Function: ISec2CrmSV.java
 	 * @Description: 根据opID取 操作员可以操作的组织列表
 	 *
 	 * @param operId
 	 * @return
 	 * @throws Exception
 	 * @throws RemoteException
 	 *
 	 * @version: v1.0.0
 	 * @author:  <liufr@asiainfo.com>
 	 * @date: 2011-5-30 下午02:13:04 
 	 *
 	 * Modification History:
 	 * Date         Author          Version            Description
 	 *---------------------------------------------------------*
 	 * 2011-5-30     liufr           v1.0.0               修改原因
 	 */
 	public  IQBOSecOpStationOrgValue[] getOpStationQBOsByOperId(long operId) throws Exception, RemoteException ;
 	
 	/**
 	 * 
 	* @Function: checkEntityPermission 
 	* @Description: 校验操作员是否具备某权限
 	*
 	* @param:operId-操作员ID operatorId
 	* @param:entId-权限实体ID
 	* @param:privId-优先级，可传-1
 	* @return：返回结果描述
 	* @throws：异常描述
 	*
 	* @version: v1.0.0
 	* @author: fangyl
 	* @date: Nov 19, 2012 10:25:00 AM 
 	*
 	* Modification History:
 	* Date         Author          Version            Description
 	*---------------------------------------------------------*
 	* Nov 19, 2012     fangyl           v1.0.0               修改原因
 	 */
 	public boolean  checkEntityPermission(long operId, long entId, long privId) throws Exception, RemoteException ;


}
