package com.asiainfo.crm.cm.service.interfaces;

import com.ai.appframe2.bo.DataContainer;
import com.asiainfo.crm.cm.common.ivalues.IBOGroupInfoRelationValue;
/**
 * 
* Copyright: Copyright (c) 2012 Asiainfo-Linkage
* 
* @ClassName: ICmGroupInfoRelationSV.java
* @Description: 建档集团与在网集团客户关系处理方法
*
* @version: v1.0.0
* @author: suntao6
* @date: Aug 2, 2012 7:37:20 PM 
*
* Modification History:
* Date         Author          Version            Description
*---------------------------------------------------------*
* Aug 2, 2012      suntao6          v1.0.0             修改原因
 */
public interface ICmGroupInfoRelationSV {
    /**
     * 
    * @Function: ICmGroupInfoRelationSV.java
    * @Description: 查找建档集团与在网集团客户关系
    *
    * @param:参数描述
    * @return：返回结果描述
    * @throws：异常描述
    *
    * @version: v1.0.0
    * @author: suntao6
    * @date: Aug 2, 2012 7:37:59 PM 
    *
    * Modification History:
    * Date         Author          Version            Description
    *---------------------------------------------------------*
    * Aug 2, 2012     suntao6           v1.0.0              修改原因
     */
	public DataContainer[] queryGroupInfoRelation(String criteria, int startNum, int endNum) throws Exception;
    /**
     * 
    * @Function: ICmGroupInfoRelationSV.java
    * @Description:查找建档集团与在网集团客户关系总数
    *
    * @param:参数描述
    * @return：返回结果描述
    * @throws：异常描述
    *
    * @version: v1.0.0
    * @author: suntao6
    * @date: Aug 2, 2012 7:38:34 PM 
    *
    * Modification History:
    * Date         Author          Version            Description
    *---------------------------------------------------------*
    * Aug 2, 2012     suntao6           v1.0.0              修改原因
     */
	public int queryGroupInfoRelationCount(String criteria) throws Exception;
	/**
	 * 
	* @Function: ICmGroupInfoRelationSV.java
	* @Description: 保存建档集团与在网集团客户关系
	*
	* @param:参数描述
	* @return：返回结果描述
	* @throws：异常描述
	*
	* @version: v1.0.0
	* @author: suntao6
	* @date: Aug 2, 2012 7:39:16 PM 
	*
	* Modification History:
	* Date         Author          Version            Description
	*---------------------------------------------------------*
	* Aug 2, 2012     suntao6           v1.0.0              修改原因
	 */
	public void saveGroupInfoRelation(DataContainer[] values) throws Exception;
	/**
	 * 
	* @Function: ICmGroupInfoRelationSV.java
	* @Description: 根据集团服务ID和建档集团编码查找对应的建档集团与在网集团关系
	*
	* @param:custServerId 集团服务编码
	* @param:groupSeq 建档集团编码
	* @return：返回结果描述
	* @throws：异常描述
	*
	* @version: v1.0.0
	* @author: suntao6
	* @date: Dec 1, 2012 3:17:14 PM 
	*
	* Modification History:
	* Date         Author          Version            Description
	*---------------------------------------------------------*
	* Dec 1, 2012     suntao6           v1.0.0              修改原因
	 */
	public IBOGroupInfoRelationValue[] getGroupInfoRelation(String custServerId,String groupSeq) throws Exception; 
	/**
	 * 
	* @Function: ICmGroupInfoRelationSV.java
	* @Description: 建档集团与在网集团关系
	* @param:groupId:集团客户服务编号
	* @param:groupSeq:建档集团集团客户编号
	* @return：返回结果描述
	* @throws：异常描述
	* @version: v1.0.0
	* @author: suntao6
	* @date: Dec 15, 2012 3:19:56 PM 
	*
	* Modification History:
	* Date         Author          Version            Description
	*---------------------------------------------------------*
	* Dec 15, 2012     suntao6           v1.0.0              修改原因
	 */
	public int checkGroupInfoRelationRela(String groupId,String groupSeq) throws Exception;

}
