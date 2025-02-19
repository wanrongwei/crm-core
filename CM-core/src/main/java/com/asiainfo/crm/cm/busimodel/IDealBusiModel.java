package com.asiainfo.crm.cm.busimodel;

import com.asiainfo.crm.cm.model.ivalues.ICmDealReturnData;
import com.asiainfo.crm.cm.model.ivalues.IValueObject;

/**   
 * @Copyright Copyright (c) 2011 Asiainfo-Linkage
 * 
 * @ClassName IDealBusiModel
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
public interface IDealBusiModel {

	public static final String S_OP_ID = "OP_ID";
	public static final String S_ORG_ID = "ORG_ID";
	public static final String S_DONE_CODE = "DONE_CODE";
	public static final String S_DONE_DATE = "DONE_DATE";
	public static final String S_CREATE_DATE = "CREATE_DATE";
	public static final String S_EFFECTIVE_DATE = "EFFECTIVE_DATE";
	public static final String S_EXPIRE_DATE = "EXPIRE_DATE";
	public static final String S_CREATE_OP_ID = "CREATE_OP_ID";
	public static final String S_CREATE_ORG_ID = "CREATE_ORG_ID";
	public static final String S_REGION_ID = "REGION_ID";
	public static final String S_STATE = "STATE";

	/**   
	 * 该方法主要实现具体的业务逻辑处理。方法默认实现为空，需要在具体的业务实现类中进行重载，实现具体的业务逻辑。
	 * 如：创建客户的业务实现类，则需要重载这个方法，在该方法中实现调用创建客户基本资料、创建联系人等的业务逻辑。
	 * @Function deal
	 * @Description 
	 *
	 * @param valueObject
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
	ICmDealReturnData deal(IValueObject valueObject) throws Exception;
}
