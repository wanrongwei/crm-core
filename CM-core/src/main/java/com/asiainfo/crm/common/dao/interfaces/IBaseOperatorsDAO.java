package com.asiainfo.crm.common.dao.interfaces;

import java.util.Map;

import com.asiainfo.crm.cm.common.ivalues.IBOBsOperatorsValue;


public interface IBaseOperatorsDAO {
	/**
	 * 获取所有运营商数据	
	 * @Function getAllOperators
	 * @Description 
	 *
	 * @return
	 * @throws Exception
	 *
	 * @version v1.0.0
	 * @author yangjh
	 * @date 2014-11-27 下午2:57:52
	 * 
	 * <strong>Modification History:</strong><br>
	 * Date         Author          Version            Description<br>
	 * ---------------------------------------------------------<br>
	 * 2014-11-27     yangjh           v1.0.0               修改原因<br>
	 */
	public IBOBsOperatorsValue[] getAllOperators() throws Exception;
	
	/**   
	 * @Function getAllOperatorsByCdn
	 * @Description 
	 *
	 * @param condition
	 * @param parameter
	 * @return
	 *
	 * @version v1.0.0
	 * @author Administrator
	 * @date 2015-12-8 下午5:29:04
	 * 
	 * <strong>Modification History:</strong><br>
	 * Date         Author          Version            Description<br>
	 * ---------------------------------------------------------<br>
	 * 2015-12-8     shitian             v1.0.0               修改原因<br>
	 */
	public IBOBsOperatorsValue[] getAllOperatorsByCdn(String condition, Map parameter)throws Exception;
	
	/**   
	 * @Function saveOperators
	 * @Description 
	 *
	 * @param operationValues
	 * @throws Exception
	 *
	 * @version v1.0.0
	 * @author Administrator
	 * @date 2015-12-8 下午5:35:47
	 * 
	 * <strong>Modification History:</strong><br>
	 * Date         Author          Version            Description<br>
	 * ---------------------------------------------------------<br>
	 * 2015-12-8     shitian             v1.0.0               修改原因<br>
	 */
	public void saveOperators(IBOBsOperatorsValue[] operationValues) throws Exception;
}
