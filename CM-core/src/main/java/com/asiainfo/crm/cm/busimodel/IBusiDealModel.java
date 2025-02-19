package com.asiainfo.crm.cm.busimodel;

import com.asiainfo.crm.cm.model.ivalues.ICmDealReturnData;
import com.asiainfo.crm.cm.model.ivalues.IVOCustValue;

/**   
 * @Copyright Copyright (c) 2011 Asiainfo-Linkage
 * 
 * @ClassName IBusiDealModel
 * @Description 该类的功能描述
 *
 * @version v1.0.0
 * @author Xiaohu
 * @date 2011-11-29 下午5:15:13 
 *
 * Modification History:
 * Date         Author          Version            Description
 * ---------------------------------------------------------*
 * 2011-11-29     Xiaohu           v1.0.0               修改原因
 */
public interface IBusiDealModel {
	/**   
	 * @Function deal
	 * @Description 
	 * 该方法主要实现具体的业务逻辑处理。方法默认实现为空，需要在具体的业务实现类中进行重载，实现具体的业务逻辑。
	 * 如：创建客户的业务实现类，则需要重载这个方法，在该方法中实现调用创建客户基本资料、创建联系人等的业务逻辑。
	 *
	 * @param custValue
	 * @return {@link ICmDealReturnData}
	 * @throws Exception
	 *
	 * @version v1.0.0
	 * @author Xiaohu
	 * @date 2011-11-29 下午5:20:44 
	 * 
	 * <strong>Modification History:</strong><br>
	 * Date         Author          Version            Description<br>
	 * ---------------------------------------------------------<br>
	 * 2011-11-29     Xiaohu           v1.0.0               修改原因
	 */
	public ICmDealReturnData deal(IVOCustValue custValue) throws Exception;
}
