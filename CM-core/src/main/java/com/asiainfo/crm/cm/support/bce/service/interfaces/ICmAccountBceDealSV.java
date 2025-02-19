package com.asiainfo.crm.cm.support.bce.service.interfaces;

import com.ai.bce.ivalues.IBceDealReturnData;
import com.ai.bce.service.interfaces.IBceDealService;
import com.asiainfo.crm.cm.model.ivalues.IAcctPaymentValue;
import com.asiainfo.crm.cm.model.ivalues.IVOAccountValue;

import java.rmi.RemoteException;

/**
 * BCE账户业务处理
 * @Copyright Copyright (c) 2012 Asiainfo-Linkage
 * 
 * @ClassName 
 * @Description 该类的功能描述
 *
 * @version v1.0.0
 * @author zhaofei3
 * @Email zhaofei3@asiainfo-linkage.com
 * @company AsiaInfo
 * @date Jul 5, 2012 2:21:36 PM
 * <br>
 * Modification History:<br>
 * Date         Author          Version            Description<br>
 * ---------------------------------------------------------*<br>
 * Jul 5, 2012     zhaofei3           v1.0.0               修改原因<br>
 */
public interface ICmAccountBceDealSV extends IBceDealService{
	/**
	 * 新增账户的业务
	 * @Function dealCreateAccount
	 * @Description 
	 *
	 * @param voAccountValue
	 * @param bceFrameId
	 * @param businessId
	 * @return
	 * @throws Exception
	 *
	 * @version v1.0.0
	 * @author zhaofei3
	 * @date Jul 5, 2012 2:21:02 PM
	 * 
	 * <strong>Modification History:</strong><br>
	 * Date         Author          Version            Description<br>
	 * ---------------------------------------------------------<br>
	 * Jul 5, 2012     zhaofei3           v1.0.0               修改原因<br>
	 */
	public IBceDealReturnData dealCreateAccount(IVOAccountValue voAccountValue, Long bceFrameId, String businessId) throws Exception;

	/**
	 * 修改账户的业务
	 * @Function dealModifyAccount
	 * @Description 
	 *
	 * @param voAccountValue
	 * @param bceFrameId
	 * @param businessId
	 * @return
	 * @throws Exception
	 *
	 * @version v1.0.0
	 * @author zhaofei3
	 * @date Jul 5, 2012 2:21:13 PM
	 * 
	 * <strong>Modification History:</strong><br>
	 * Date         Author          Version            Description<br>
	 * ---------------------------------------------------------<br>
	 * Jul 5, 2012     zhaofei3           v1.0.0               修改原因<br>
	 */
	public IBceDealReturnData dealModifyAccount(IVOAccountValue voAccountValue, Long bceFrameId, String businessId) throws Exception;

    public void dealBankBehalfPhone(IAcctPaymentValue[] values) throws Exception,RemoteException;
}
