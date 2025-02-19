/**
 * 
 */
package com.asiainfo.crm.cm.busimodel.impl.customer;
import com.ai.appframe2.bo.DataContainer;
import com.ai.common.util.ExceptionUtil;
import com.asiainfo.crm.cm.busimodel.IQueryCountBusiModel;
import com.asiainfo.crm.cm.busimodel.IQueryDataBusiModel;
import com.asiainfo.crm.cm.busimodel.common.ParamUtil;
import com.asiainfo.crm.cm.busimodel.impl.common.AbstractMaskBusiModel;
import com.asiainfo.crm.cm.common.util.CmCommonUtil;


/**
 * 该业务模型实现客户信息的综合查询功能。在这一层统一屏蔽了具体类型客户的概念，对外而言，所有类型的客户都是客户，不需要对不同类型的客户区别对待，使用统一的
 * 业务实体对象，实现model与数据模型的分离，尽可能降低因底层数据模型发生变化而引起外部接口调用的影响。
 * @Copyright Copyright (c) 2012 Asiainfo-Linkage
 * 
 * @ClassName 
 * @Description 客户查询
 *
 * @version v1.0.0
 * @author zhangwei21
 * @date 2012-3-29 上午11:16:47
 * <br>
 * Modification History:<br>
 * Date         Author          Version            Description<br>
 * ---------------------------------------------------------*<br>
 * 2012-3-29     zhangwei21        v1.0.0               修改原因<br>
 */
public abstract class AbstractCustomerQueryBusiModelForSHImpl extends AbstractMaskBusiModel implements IQueryDataBusiModel, IQueryCountBusiModel {

	/**
	 *    
	 * @Function queryCustomers
	 * @Description 	 
	 * 根据预先准备好的查询条件查询客户信息
	 * 该方法需要被根据具体的业务需求来实现。该类中不提供实现。
	 *
	 * @param conditionDCs
	 * @param startNum
	 * @param endNum
	 * @return
	 * @throws Exception
	 *
	 * @version v1.0.0
	 * @author zhangwei21
	 * @date 2012-3-17 下午12:03:19
	 * 
	 * <strong>Modification History:</strong><br>
	 * Date         Author          Version            Description<br>
	 * ---------------------------------------------------------<br>
	 * 2012-3-17    zhangwei21         v1.0.0               修改原因<br>
	 */
	public abstract DataContainer[] queryCustomers(DataContainer[] conditionDCs, int startNum, int endNum) throws Exception;
	/**
	 * 
	 * @Function queryData
	 * @Description 根据查询条件DCs查询客户信息
	 *
	 * @param conditionDCs
	 * @param startNum
	 * @param endNum
	 * @return
	 * @throws Exception
	 *
	 * @version v1.0.0
	 * @author zhangwei21
	 * @date 2012-3-20 下午03:50:11
	 * 
	 * <strong>Modification History:</strong><br>
	 * Date         Author          Version            Description<br>
	 * ---------------------------------------------------------<br>
	 * 2012-3-20    zhangwei21         v1.0.0               修改原因<br>
	 */
	public final DataContainer[] queryData(DataContainer[] conditionDCs, int startNum, int endNum) throws Exception {
		// 查询客户信息
		return (DataContainer[]) queryCustomers(conditionDCs, startNum, endNum);
	}
	/**
	 * 
	 * @Function queryData
	 * @Description 根据查询条件查询客户信息
	 *
	 * @param criteria
	 * @param startNum
	 * @param endNum
	 * @return
	 * @throws Exception
	 *
	 * @version v1.0.0
	 * @author zhangwei21
	 * @date 2012-3-20 下午03:50:11
	 * 
	 * <strong>Modification History:</strong><br>
	 * Date         Author          Version            Description<br>
	 * ---------------------------------------------------------<br>
	 * 2012-3-20    zhangwei21         v1.0.0               修改原因<br>
	 */
	
	public final DataContainer[] queryData(String criteria, int startNum, int endNum) throws Exception {
		return queryData(ParamUtil.parseXmlCriteria(criteria), startNum, endNum);
	}
	public final int queryCount(String criteria) throws Exception {
		return queryCount(parseCriteria(criteria));
	}
	/**
	 * 
	 * @Function parseCriteria
	 * @Description 查询条件
	 *
	 * @param criteria
	 * @return
	 * @throws Exception
	 *
	 * @version v1.0.0
	 * @author zhangwei21
	 * @date 2012-4-21 下午02:18:24
	 * 
	 * <strong>Modification History:</strong><br>
	 * Date         Author          Version            Description<br>
	 * ---------------------------------------------------------<br>
	 * 2012-4-21    zhangwei21         v1.0.0               修改原因<br>
	 */
	public DataContainer[] parseCriteria(String criteria) throws Exception {
		return ParamUtil.parseXmlCriteria(criteria);
	}
	/**
	 * 
	 * @Function queryCount
	 * @Description 相关客户 查询的数量
	 *
	 * @param conditionDCs
	 * @return
	 * @throws Exception
	 *
	 * @version v1.0.0
	 * @author zhangwei21
	 * @date 2012-4-21 下午02:18:15
	 * 
	 * <strong>Modification History:</strong><br>
	 * Date         Author          Version            Description<br>
	 * ---------------------------------------------------------<br>
	 * 2012-4-21    zhangwei21         v1.0.0               修改原因<br>
	 */
	public final int queryCount(DataContainer[] conditionDCs) throws Exception {
		// 准备查询条件
		prepareCondition(conditionDCs);
		// 查询客户数量
		return queryCustomerCount(conditionDCs);
	}
	public abstract void prepareCondition(DataContainer[] conditionDCs) throws Exception;
	/**
	 * 
	 * @Function queryCustomerCount
	 * @Description 
	 *
	 * @param conditionDCs
	 * @return
	 * @throws Exception
	 *
	 * @version v1.0.0
	 * @author zhangwei21
	 * @date 2012-4-21 下午02:17:40
	 * 
	 * <strong>Modification History:</strong><br>
	 * Date         Author          Version            Description<br>
	 * ---------------------------------------------------------<br>
	 * 2012-4-21    zhangwei21         v1.0.0               修改原因<br>
	 */
	public int queryCustomerCount(DataContainer[] conditionDCs) throws Exception {
		int count = 0;
		// 如果查询条件为空，则报错。
		if (CmCommonUtil.isNotEmptyObject(conditionDCs) && conditionDCs[0].getPropertyNames().length > 0) {
			// 默认实现认为前台传入的条件
			DataContainer dc = conditionDCs[0];
			count = queryIndivCustomersCount(dc);
		} else {
			ExceptionUtil.throwBusinessException("");// TODO 增加国际化资源配置
		}
		return count;
	}
	/**
	 * 
	 * @Function queryIndivCustomersCount
	 * @Description 相关客户 查询的数量
	 *
	 * @param dcs
	 * @return
	 * @throws Exception
	 *
	 * @version v1.0.0
	 * @author zhangwei21
	 * @date 2012-4-21 下午02:17:59
	 * 
	 * <strong>Modification History:</strong><br>
	 * Date         Author          Version            Description<br>
	 * ---------------------------------------------------------<br>
	 * 2012-4-21    zhangwei21         v1.0.0               修改原因<br>
	 */
	public abstract int queryIndivCustomersCount(DataContainer dcs) throws Exception;

}
