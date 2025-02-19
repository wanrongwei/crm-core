package com.asiainfo.crm.cm.service.interfaces;

import com.ai.appframe2.bo.DataContainer;
import com.asiainfo.crm.cm.common.ivalues.IBOFactoryInfoValue;
import com.asiainfo.crm.cm.model.ivalues.ICmParaMaintainValue;

/**   
 * @Copyright Copyright (c) 2012 Asiainfo-Linkage
 * 
 * @ClassName 
 * @Description 设备厂商维修点维护
 *
 * @version v1.0.0
 * @author suntao6
 * @date 2012-7-10 下午5:29:46
 * <br>
 * Modification History:<br>
 * Date         Author          Version            Description<br>
 * ---------------------------------------------------------*<br>
 * 2012-7-10    suntao6          v1.0.0               修改原因<br>
 */
public interface ICmEquRepareCenterSV {

/**
 * 
* @Function: ICmEquRepareCenterSV.java
* @Description: 根据条件查找设备厂商维修点
*
* @param:criteria  查询条件
* @param:startNum  分页
* @param:endNum 分页
* @return：返回设备维修点数组
* @throws：异常描述
*
* @version: v1.0.0
* @author: suntao6
* @date: Jul 10, 2012 7:43:23 PM 
*
* Modification History:
* Date         Author          Version            Description
*---------------------------------------------------------*
* Jul 10, 2012     suntao6           v1.0.0               修改原因
 */
public ICmParaMaintainValue[] queryEquRepareCenter(String criteria, int startNum, int endNum) throws Exception;

/**
 * 
* @Function: ICmEquRepareCenterSV.java
* @Description: 记录数
*
* @param:查询条件
* @return：记录条数
* @throws：
*
* @version: v1.0.0
* @author: suntao6
* @date: Jul 10, 2012 7:54:57 PM 
*
* Modification History:
* Date         Author          Version            Description
*---------------------------------------------------------*
* Jul 10, 2012     suntao6           v1.0.0               修改原因
 */
public int queryEquRepareCenterCount(String criteria) throws Exception;
/**
 * 
* @Function: ICmEquRepareCenterSV.java
* @Description: 保存
*
* @param:参数描述
* @return：返回结果描述
* @throws：异常描述
*
* @version: v1.0.0
* @author: suntao6
* @date: Jul 12, 2012 3:58:21 PM 
*
* Modification History:
* Date         Author          Version            Description
*---------------------------------------------------------*
* Jul 12, 2012     suntao6           v1.0.0               修改原因
 */
public void saveEquRepareCenters(ICmParaMaintainValue[] values)throws Exception;

/**
 * 
* @Function: ICmEquRepareCenterSV.java
* @Description: 查找所有的设备厂商
*
* @param:参数描述
* @return：返回结果描述
* @throws：异常描述
*
* @version: v1.0.0
* @author: suntao6
* @date: Jul 14, 2012 3:21:49 PM 
*
* Modification History:
* Date         Author          Version            Description
*---------------------------------------------------------*
* Jul 14, 2012     suntao6           v1.0.0               修改原因
 */
public IBOFactoryInfoValue[] findEquRepareCentersById()throws Exception;


}
