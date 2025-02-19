/**
 * 
 */
package com.asiainfo.crm.cm.dk.service.interfaces;

import com.asiainfo.crm.cm.inner.customer.ivalues.IBOCmCustPerferInfoValue;
import com.asiainfo.crm.cm.inner.customer.ivalues.IBOCmCustPerferInfomationValue;

/**   
 * @Copyright Copyright (c) 2014 Asiainfo-Linkage
 * 
 * @ClassName 
 * @Description 该类的功能描述
 *
 * @version v1.0.0
 * @author mael
 * @date 2014-9-1 下午4:06:26
 * <br>
 * Modification History:<br>
 * Date         Author          Version            Description<br>
 * ---------------------------------------------------------*<br>
 * 2014-9-1     mael           v1.0.0               修改原因<br>
 */
public interface ICmCustPreferenceInfoSV {

	/**
	 * 
	 * @Function queryCustPreferInformation
	 * @Description 
	 *
	 * @param custId
	 * @return
	 * @throws Exception
	 *
	 * @version v1.0.0
	 * @author mael
	 * @date 2014-9-2 上午10:22:19
	 * 
	 * <strong>Modification History:</strong><br>
	 * Date         Author          Version            Description<br>
	 * ---------------------------------------------------------<br>
	 * 2014-9-2     mael           v1.0.0               修改原因<br>
	 */
	public IBOCmCustPerferInfomationValue[] queryCustPreferInformation(long custId, int start, int end) throws Exception;

	/**
	 * 
	 * @Function queryCustPreferInformationCount
	 * @Description 
	 *
	 * @param custId
	 * @return
	 * @throws Exception
	 *
	 * @version v1.0.0
	 * @author mael
	 * @date 2014-9-2 上午10:22:25
	 * 
	 * <strong>Modification History:</strong><br>
	 * Date         Author          Version            Description<br>
	 * ---------------------------------------------------------<br>
	 * 2014-9-2     mael           v1.0.0               修改原因<br>
	 */
	public int queryCustPreferInformationCount(long custId) throws Exception;

	/**
	 * 
	 * @Function queryCustPreferTimeInfor
	 * @Description 
	 *
	 * @param preferChannelId
	 * @param start
	 * @param end
	 * @return
	 * @throws Exception
	 *
	 * @version v1.0.0
	 * @author mael
	 * @date 2014-9-4 上午10:20:21
	 * 
	 * <strong>Modification History:</strong><br>
	 * Date         Author          Version            Description<br>
	 * ---------------------------------------------------------<br>
	 * 2014-9-4     mael           v1.0.0               修改原因<br>
	 */
	public IBOCmCustPerferInfoValue[] queryCustPreferTimeInfor(long preferChannelId, int start, int end) throws Exception;

	/**
	 * 
	 * @Function queryCustPreferTimeInforCount
	 * @Description 
	 *
	 * @param preferChannelId
	 * @return
	 * @throws Exception
	 *
	 * @version v1.0.0
	 * @author mael
	 * @date 2014-9-4 上午10:20:28
	 * 
	 * <strong>Modification History:</strong><br>
	 * Date         Author          Version            Description<br>
	 * ---------------------------------------------------------<br>
	 * 2014-9-4     mael           v1.0.0               修改原因<br>
	 */
	public int queryCustPreferTimeInforCount(long preferChannelId) throws Exception;

	/**
	 * 
	 * @Function queryCustPreferTimeInforDeal
	 * @Description 
	 *
	 * @param preferChannelId
	 * @param start
	 * @param end
	 * @return
	 * @throws Exception
	 *
	 * @version v1.0.0
	 * @author mael
	 * @date 2014-9-5 下午3:43:51
	 * 
	 * <strong>Modification History:</strong><br>
	 * Date         Author          Version            Description<br>
	 * ---------------------------------------------------------<br>
	 * 2014-9-5     mael           v1.0.0               修改原因<br>
	 */
	public IBOCmCustPerferInfoValue[] queryCustPreferTimeInforDeal(long preferChannelId, int start, int end) throws Exception;

	/**   
	 * @Function queryCustPreferInforDeal
	 * @Description 
	 *
	 * @param custId
	 * @param start
	 * @param end
	 * @return
	 * @throws Exception
	 *
	 * @version v1.0.0
	 * @author Administrator
	 * @date 2014-9-17 下午3:52:14
	 * 
	 * <strong>Modification History:</strong><br>
	 * Date         Author          Version            Description<br>
	 * ---------------------------------------------------------<br>
	 * 2014-9-17     shitian             v1.0.0               修改原因<br>
	 */
	public IBOCmCustPerferInfomationValue[] queryCustPreferInforDeal(long custId, int start, int end) throws Exception;

	/**   
	 * @Function queryCustPreferInformation
	 * @Description 按优先级从高到低排序
	 *
	 * @param custId
	 * @param perferType
	 * @return
	 * @throws Exception
	 *
	 * @version v1.0.0
	 * @author Administrator
	 * @date 2015-9-15 下午4:02:03
	 * 
	 * <strong>Modification History:</strong><br>
	 * Date         Author          Version            Description<br>
	 * ---------------------------------------------------------<br>
	 * 2015-9-15     shitian             v1.0.0               修改原因<br>
	 */
	public IBOCmCustPerferInfoValue[] queryCustPrefer(long custId, int perferType) throws Exception;
}
