package com.asiainfo.crm.cm.custrel.service.interfaces;

import com.asiainfo.crm.cm.custrel.ivalues.IBOCmCustRelValue;

/**
 * User: caiwm
 * Date: 13-8-7
 * Time: 上午11:58
 */
/**
 * 新增 根据id查找cm_cust_rel表
 */
public interface ICmCustRelSV {
	/**
	 * 根据集团客户编号查询关联集团
	 * @param custId
	 * @param $STARTROWINDEX
	 * @param $ENDROWINDEX
	 * @return
	 */
	
	public  IBOCmCustRelValue[] queryCustById(long custId, int $STARTROWINDEX,int $ENDROWINDEX) throws Exception;
	/**
	 * 根据集团客户编号查询关联集团数量
	 * @param acctId
	 * @param custId
	 * @return
	 * @throws Exception
	 */
	public int queryCountById(long custId) throws Exception;
	/**
	 * 查询客户关系
	 * @param primaryKey
	 * @return
	 * @throws Exception
	 */
	public IBOCmCustRelValue[] queryByPrimraryKey(long primaryKey)throws Exception;
	/**
	 * 保存客户关系
	 * @param val
	 * @throws Exception
	 */
	public void saveCustRel(IBOCmCustRelValue val)throws Exception;
	
	/**
	 * 批量保存客户关系
	 * @param val
	 * @throws Exception
	 */
	public void saveBatchCustRel(IBOCmCustRelValue[] val)throws Exception;
	/**
	 * 验证客户关系是否已经存在
	 * @param custId
	 * @param realType
	 * @param relCustId
	 * @return
	 * @throws Exception
	 */
	public boolean isRelated(long custId,long realType,long relCustId)throws Exception;
	/**
	 * 根据集团客户编号查询关联集团
	 * @param custId
	 * @param $STARTROWINDEX
	 * @param $ENDROWINDEX
	 * @return
	 */
	public int queryCustByIdCount(long custId)throws Exception;
}
