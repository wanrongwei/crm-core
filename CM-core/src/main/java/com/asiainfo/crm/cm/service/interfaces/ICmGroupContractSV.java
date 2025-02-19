package com.asiainfo.crm.cm.service.interfaces;

import com.ai.appframe2.common.DataContainerInterface;
import com.ai.appframe2.web.DataContainerList;
import com.asiainfo.crm.cm.inner.customer.ivalues.IBOCmGroupContactValue;
import com.asiainfo.crm.cm.inner.customer.ivalues.IBOCmGroupContractValue;

/**   
 * 集团合同管理服务
 * @Copyright Copyright (c) 2012 Asiainfo-Linkage
 * 
 * @ClassName ICmxGroupContractSV
 * @Description 该类的功能描述
 *
 * @version v1.0.0
 * @author huzq2
 * @date 2012-4-28 上午11:07:14
 * <br>
 * Modification History:<br>
 * Date         Author          Version            Description<br>
 * ---------------------------------------------------------*<br>
 * 2012-4-28     huzq2           v1.0.0               修改原因<br>
 */
public interface ICmGroupContractSV {

	/**   
	 * 查询集团合同信息
	 * @Function queryGroupContracts
	 * @Description 
	 *
	 * @param criteria
	 * @param startNum
	 * @param endNum
	 * @return
	 * @throws Exception
	 *
	 * @version v1.0.0
	 * @author huzq2
	 * @date 2012-4-28 上午11:08:56
	 * 
	 * <strong>Modification History:</strong><br>
	 * Date         Author          Version            Description<br>
	 * ---------------------------------------------------------<br>
	 * 2012-4-28     huzq2           v1.0.0               修改原因<br>
	 */
	public IBOCmGroupContractValue[] queryGroupContracts(String criteria, int startNum, int endNum) throws Exception;

	/**   
	 * 查询集团合同信息
	 * @Function queryGroupContracts
	 * @Description 
	 *
	 * @param criteria
	 * @param startNum
	 * @param endNum
	 * @return
	 * @throws Exception
	 *
	 * @version v1.0.0
	 * @author huzq2
	 * @date 2012-4-28 上午11:08:56
	 * 
	 * <strong>Modification History:</strong><br>
	 * Date         Author          Version            Description<br>
	 * ---------------------------------------------------------<br>
	 * 2012-4-28     huzq2           v1.0.0               修改原因<br>
	 */
	public IBOCmGroupContractValue[] queryGroupContractsInfo(String criteria, int startNum, int endNum) throws Exception;

	/**   
	 * 查询集团合同数量
	 * @Function queryGroupContractCount
	 * @Description 
	 *
	 * @param criteria
	 * @return
	 * @throws Exception
	 *
	 * @version v1.0.0
	 * @author huzq2
	 * @date 2012-4-28 上午11:09:56
	 * 
	 * <strong>Modification History:</strong><br>
	 * Date         Author          Version            Description<br>
	 * ---------------------------------------------------------<br>
	 * 2012-4-28     huzq2           v1.0.0               修改原因<br>
	 */
	public int queryGroupContractCount(String criteria) throws Exception;

	/**   
	 * 查询集团合同数量
	 * @Function queryGroupContractCount
	 * @Description 
	 *
	 * @param criteria
	 * @return
	 * @throws Exception
	 *
	 * @version v1.0.0
	 * @author huzq2
	 * @date 2012-4-28 上午11:09:56
	 * 
	 * <strong>Modification History:</strong><br>
	 * Date         Author          Version            Description<br>
	 * ---------------------------------------------------------<br>
	 * 2012-4-28     huzq2           v1.0.0               修改原因<br>
	 */
	public int queryGroupContractInfoCount(String criteria) throws Exception;

	/**   
	 * 根据样例查询集团合同信息
	 * @Function queryGroupContracts
	 * @Description 
	 *
	 * @param sample
	 * @param startNum
	 * @param endNum
	 * @return
	 * @throws Exception
	 *
	 * @version v1.0.0
	 * @author huzq2
	 * @date 2012-4-28 上午11:10:56
	 * 
	 * <strong>Modification History:</strong><br>
	 * Date         Author          Version            Description<br>
	 * ---------------------------------------------------------<br>
	 * 2012-4-28     huzq2           v1.0.0               修改原因<br>
	 */
	public IBOCmGroupContractValue[] queryGroupContracts(IBOCmGroupContractValue sample, int startNum, int endNum) throws Exception;

	/**   
	 * 根据样例查询集团合同信息数量
	 * @Function queryGroupContractCount
	 * @Description 
	 *
	 * @param sample
	 * @return
	 * @throws Exception
	 *
	 * @version v1.0.0
	 * @author huzq2
	 * @date 2012-4-28 上午11:11:38
	 * 
	 * <strong>Modification History:</strong><br>
	 * Date         Author          Version            Description<br>
	 * ---------------------------------------------------------<br>
	 * 2012-4-28     huzq2           v1.0.0               修改原因<br>
	 */
	public int queryGroupContractCount(IBOCmGroupContractValue sample) throws Exception;

	/**   
	 * 根据主键查询集团合同信息
	 * @Function queryGroupContractById
	 * @Description 
	 *
	 * @param contractId
	 * @return
	 * @throws Exception
	 *
	 * @version v1.0.0
	 * @author huzq2
	 * @date 2012-4-28 上午11:12:13
	 * 
	 * <strong>Modification History:</strong><br>
	 * Date         Author          Version            Description<br>
	 * ---------------------------------------------------------<br>
	 * 2012-4-28     huzq2           v1.0.0               修改原因<br>
	 */
	public IBOCmGroupContractValue queryGroupContractById(long contractId) throws Exception;

	/**   
	 * 保存集团合同信息
	 * @Function saveGroupContract
	 * @Description 
	 *
	 * @param groupCustContractValue
	 * @return
	 * @throws Exception
	 *
	 * @version v1.0.0
	 * @author huzq2
	 * @date 2012-4-28 下午5:13:42
	 * 
	 * <strong>Modification History:</strong><br>
	 * Date         Author          Version            Description<br>
	 * ---------------------------------------------------------<br>
	 * 2012-4-28     huzq2           v1.0.0               修改原因<br>
	 */
	public void saveGroupContract(IBOCmGroupContractValue groupCustContractValue) throws Exception;

	/**   
	 * 根据传入的合同编号删除对应的合同信息以及其子合同信息
	 * @Function deleteGroupContract
	 * @Description 
	 *
	 * @param contractId
	 * @throws Exception
	 *
	 * @version v1.0.0
	 * @author huzq2
	 * @date 2012-4-30 下午2:01:25
	 * 
	 * <strong>Modification History:</strong><br>
	 * Date         Author          Version            Description<br>
	 * ---------------------------------------------------------<br>
	 * 2012-4-30     huzq2           v1.0.0               修改原因<br>
	 */
	public void deleteGroupContract(long contractId) throws Exception;

	/**
	 * 根据条件查询联系人信息
	 * @Function queryCustContInfo
	 * @Description 
	 *
	 * @param partyId
	 * @param contId
	 * @param custId
	 * @param contType
	 * @return
	 * @throws Exception
	 *
	 * @version v1.0.0
	 * @author yangjh
	 * @date 2014-11-26 下午3:10:34
	 * 
	 * <strong>Modification History:</strong><br>
	 * Date         Author          Version            Description<br>
	 * ---------------------------------------------------------<br>
	 * 2014-11-26     yangjh           v1.0.0               修改原因<br>
	 */
	public IBOCmGroupContactValue[] queryCustContInfo(long partyId, long contId, long custId, int[] contType) throws Exception;

	/**
	 * 保持联系人信息
	 * @Function saveGroupContact
	 * @Description 
	 *
	 * @param custContId
	 * @param contId
	 * @param dcLists
	 * @throws Exception
	 *
	 * @version v1.0.0
	 * @author yangjh
	 * @date 2014-12-5 下午5:55:56
	 * 
	 * <strong>Modification History:</strong><br>
	 * Date         Author          Version            Description<br>
	 * ---------------------------------------------------------<br>
	 * 2014-12-5     yangjh           v1.0.0               修改原因<br>
	 */
	public void saveGroupContact(long custContId, long contId, DataContainerList[] dcLists) throws Exception;

	/**
	 * 丹麦保持联系人信息
	 * @Function saveDkCmGroupContact
	 * @Description 
	 *
	 * @param dcLists
	 * @param groupMemberDC
	 * @param regionId
	 * @param priorLevel
	 * @param custContId
	 * @throws Exception
	 *
	 * @version v1.0.0
	 * @author yangjh
	 * @date 2014-12-8 下午6:42:41
	 * 
	 * <strong>Modification History:</strong><br>
	 * Date         Author          Version            Description<br>
	 * ---------------------------------------------------------<br>
	 * 2014-12-8     yangjh           v1.0.0               修改原因<br>
	 */
	public void saveDkCmGroupContact(DataContainerList[] dcLists, DataContainerInterface[] groupMemberDC, String regionId, long priorLevel, long custContId) throws Exception;
}
