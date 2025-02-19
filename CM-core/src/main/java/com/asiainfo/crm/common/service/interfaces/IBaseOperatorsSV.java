package com.asiainfo.crm.common.service.interfaces;

import java.util.Map;

import com.asiainfo.crm.cm.common.ivalues.IBOBsOperatorsValue;

public interface IBaseOperatorsSV {

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
	 * 按条件查询运营商数据
	 * @Function queryOperatorsByCond
	 * @Description 
	 *
	 * @param operatorsId
	 * @param operatorName
	 * @param operatorGroup
	 * @param operatorType
	 * @return
	 * @throws Exception
	 *
	 * @version v1.0.0
	 * @author yangjh
	 * @date 2014-11-27 下午3:34:47
	 * 
	 * <strong>Modification History:</strong><br>
	 * Date         Author          Version            Description<br>
	 * ---------------------------------------------------------<br>
	 * 2014-11-27     yangjh           v1.0.0               修改原因<br>
	 */
	public IBOBsOperatorsValue[] queryOperatorsByCond(long operatorsId, String operatorCode, String operatorName) throws Exception;

	/**
	 * 从Billing同步运营商信息
	 * @Function SyncBsOperatorsFromBilling
	 * @Description 
	 *
	 * @param plmnId(运营商编号)
	 * @param OperatorsInfo{CUSTOMER_TYPE,NAME,PLMN_ID,REMARK}
	 * @throws Exception
	 *
	 * @version v1.0.0
	 * @author yangjh
	 * @date 2015-12-8 上午9:08:23
	 * 
	 * <strong>Modification History:</strong><br>
	 * Date         Author          Version            Description<br>
	 * ---------------------------------------------------------<br>
	 * 2015-12-8     yangjh           v1.0.0               修改原因<br>
	 */
	public void SyncBsOperatorsFromBilling(String plmnId, Map OperatorsInfo) throws Exception;
}
