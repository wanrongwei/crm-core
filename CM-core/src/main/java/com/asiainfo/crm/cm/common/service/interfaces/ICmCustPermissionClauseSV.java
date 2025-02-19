package com.asiainfo.crm.cm.common.service.interfaces;

import com.asiainfo.crm.cm.common.ivalues.IBOCmCustPermissionClauseValue;

/**
 * permission条款维护
 * @Copyright Copyright (c) 2014 Asiainfo-Linkage
 * 
 * @ClassName 
 * @Description 该类的功能描述
 *
 * @version v1.0.0
 * @author lism
 * @date 2014-11-27 上午11:27:16
 * <br>
 * Modification History:<br>
 * Date         Author          Version            Description<br>
 * ---------------------------------------------------------*<br>
 * 2014-5-8     lism           v1.0.0               修改原因<br>
 */
public interface ICmCustPermissionClauseSV {
	
	/**
	 * 
	 * @Function qryCmCustPermissionClause
	 * @Description 
	 * 根据父节点条款ID查询条款信息
	 * @param parentClauseId
	 * @return
	 * @throws Exception
	 *
	 * @version v1.0.0
	 * @author lism
	 * @date 2014-11-27 上午11:27:16
	 * 
	 * <strong>Modification History:</strong><br>
	 * Date         Author          Version            Description<br>
	 * ---------------------------------------------------------<br>
	 * 2014-11-27     lism           v1.0.0               修改原因<br>
	 */
	public  IBOCmCustPermissionClauseValue[] qryCmCustPermissionClause(String parentClauseId,int startIndex,int endIndex) throws Exception;
	/**
	 * 
	 * @Function qryCmCustPermissionClauseCount
	 * @Description 
	 * 根据父节点条款ID查询条款信息的数目
	 * @param parentClauseId
	 * @return
	 * @throws Exception
	 *
	 * @version v1.0.0
	 * @author lism
	 * @date 2014-11-27 上午11:27:16
	 * 
	 * <strong>Modification History:</strong><br>
	 * Date         Author          Version            Description<br>
	 * ---------------------------------------------------------<br>
	 * 2014-11-27     lism           v1.0.0               修改原因<br>
	 */
	public int qryCmCustPermissionClauseCount(String parentClauseId)throws Exception;
	/**
	 * 
	 * @Function qryCmCustPermissionClauseCount
	 * @Description 
	 * 保存
	 * @param values
	 * @return
	 * @throws Exception
	 *
	 * @version v1.0.0
	 * @author lism
	 * @date 2014-11-27 上午11:27:16
	 * 
	 * <strong>Modification History:</strong><br>
	 * Date         Author          Version            Description<br>
	 * ---------------------------------------------------------<br>
	 * 2014-11-27     lism           v1.0.0               修改原因<br>
	 */
	public void saveCustPermission(IBOCmCustPermissionClauseValue[] values)throws Exception;
	/**
	 * 
	 * @Function qryCmCustPermissionClauseCount
	 * @Description 
	 * 根据条款ID查询条款信息
	 * @param clauseId
	 * @return
	 * @throws Exception
	 *
	 * @version v1.0.0
	 * @author lism
	 * @date 2014-11-27 上午11:27:16
	 * 
	 * <strong>Modification History:</strong><br>
	 * Date         Author          Version            Description<br>
	 * ---------------------------------------------------------<br>
	 * 2014-12-1     lism           v1.0.0               修改原因<br>
	 */
	public  IBOCmCustPermissionClauseValue qryCmCustPermissionInfo(String clauseId) throws Exception;
}
