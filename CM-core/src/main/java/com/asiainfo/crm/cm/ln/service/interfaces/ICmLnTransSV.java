package com.asiainfo.crm.cm.ln.service.interfaces;

import java.util.Map;

public interface ICmLnTransSV {

	/**
	 * <PRE>
	 * 单独起事务
	 * 1.现在提供给外围接口的集团主要联系人登录接口，需要单独起事务，防止出现抛异常，事务回滚，造成个人
	 * 业务无法记录密码登录错误次数
	 * 
	 * @param param
	 * @param methodSwitch
	 * @return
	 * @throws Exception
	 * </PRE>
	 */
	public Map doSelfTransaction(Map param, String methodSwitch) throws Exception;
}
