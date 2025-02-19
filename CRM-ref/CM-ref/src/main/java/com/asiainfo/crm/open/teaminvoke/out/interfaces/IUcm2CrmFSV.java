package com.asiainfo.crm.open.teaminvoke.out.interfaces;

import java.rmi.RemoteException;
import java.util.Map;

import com.ai.omframe.instance.ivalues.IInsUserValue;
import com.ai.omframe.order.ivalues.IOVOrderCustomer;
import com.ai.omframe.order.ivalues.IOVOrderOffer;
import com.asiainfo.crm.open.core.bo.IIOpenCrmWaitValue;
import com.asiainfo.crm.open.core.bo.IIOpenProvisionWait;
import com.asiainfo.crm.open.frame.table.tn.ott.bo.IIOpenOttOrderValue;

/**
 * <p>Title: crm-core-trunk</p>
 * <p>Description: 统一接口组提供给CRM的接口类</p>
 * <p>Copyright: Copyright (c) 2011-12-28</p>
 * <p>Company: AI(NanJing)</p>
 * @author maohuiyun
 * @version 2.0 
 *
 */
public interface IUcm2CrmFSV {
	/**
	 * 
	 * @param aICustomerL
	 * @param aIUom2StubLL
	 * @throws java.rmi.RemoteException
	 * @throws Exception
	 */
	public void unifyopen( IOVOrderCustomer aICustomerL , 
			java.util.HashMap aIUom2StubLL ) throws java.rmi.RemoteException,Exception;
	/**
	 * 
	 * @param aBusinessId
	 * @param aIUom2StubLL
	 * @throws RemoteException
	 * @throws Exception
	 */
	public void unifyopen(long aBusinessId, java.util.HashMap aIUom2StubLL) throws RemoteException, Exception;
	/**
	 * 
	 * @Description
	 * @param aICustomerL
	 * @param aIUom2StubLL
	 * @throws java.rmi.RemoteException
	 * @throws Exception
	 * @author maohuiyun
	 * @date 2012-1-9 上午09:04:53
	 */
	public void unifyrollbopen( IOVOrderCustomer aICustomerL , 
			java.util.HashMap aIUom2StubLL ) throws java.rmi.RemoteException,Exception;
	/**
	 * 
	 * @param aIInsUserL
	 * @param aBusinessId
	 * @param aIUom2StubLL
	 * @throws java.rmi.RemoteException
	 * @throws Exception
	 */
	public void unifyopen( IInsUserValue aIInsUserL[] , 
			long aBusinessId , 
			java.util.HashMap aIUom2StubLL ) throws java.rmi.RemoteException,Exception;
	/**
	 * 交换机稽核
	 * @Description
	 * @param aUSER_ID
	 * @return
	 * @throws java.rmi.RemoteException
	 * @throws Exception
	 * @author maohuiyun
	 * @date 2012-1-11 上午03:41:04
	 */
	public String switchVerify( long aUSER_ID ) throws java.rmi.RemoteException,Exception;
	/**
	 * 查询异步网元结果
	 * @param aVM_ORDER_ID
	 * @return
	 * @throws java.rmi.RemoteException
	 * @throws Exception
	 */
	public java.util.HashMap getUnifyTarget( String aVM_ORDER_ID ) throws java.rmi.RemoteException,Exception;
	/**
	 * 
	 * @Description
	 * @param aUSER_ID
	 * @return
	 * @throws java.rmi.RemoteException
	 * @throws Exception
	 * @author maohuiyun
	 * @date 2012-1-9 上午09:18:05
	 */
	public IIOpenProvisionWait[] getUnifyWait( long aUSER_ID ) throws java.rmi.RemoteException,Exception;
	 /**
     * 
     * @Function: IUcm2CrmFSV::qryFvpnGrpMemb
     * @Description: 该函数的功能描述
     * @param aMainBillId
     * @param aMemberBillId
     * @param aQryKind
     * @return
     * @throws java.rmi.RemoteException
     * @throws Exception
     * @version: v1.1.0
     * @author: chenzuojia
     * @date: 2012-9-21 下午05:12:12 
     *
     * Modification History:
     * Date         Author          Version            Description
     *-------------------------------------------------------------
     * 2012-9-21     chenzuojia          v1.1.0               修改原因
     */
	 public java.util.HashMap qryFvpnGrpMemb( String  aMainBillId , String aMemberBillId , boolean  aQryKind ) throws java.rmi.RemoteException,Exception;

	 public java.util.HashMap qryVpnGrpInfo( String  aVpmnCode , String aVpmnType ) throws java.rmi.RemoteException,Exception;
	 
	 public java.util.HashMap qryVpnGrpMemberInfo( String  aVpmnCode , String aVpmnType ,String aVpmnPhNum ,String aVpmnNum ) throws java.rmi.RemoteException,Exception;
	 
	 public java.util.HashMap qryVpnGrpListInfo( String  PROVINCE , String SERVAREA, String GRPNUM, String GRPNAME, String OVERDUE,String STARTDATE,String ENDDATE) throws java.rmi.RemoteException,Exception;
	 
	 public java.util.HashMap qryVpnGrpMemberListInfo(String  GRPID , String DEPT ,String OVERDUE ,String STARTDATE ,String ENDDATE ) throws java.rmi.RemoteException,Exception;
	 
	 public java.util.HashMap qryFvpnInfo( String  MAINNO ) throws java.rmi.RemoteException,Exception;
	 
	 public java.util.HashMap qryFvpnLogInfo( String  MAINNO ,String STARTDATE , String ENDDATE,String GRPOPRKIND) throws java.rmi.RemoteException,Exception;
	 
	 public java.util.HashMap qryFvpnMembLogInfo( String  MEMBERNO ,String STARTDATE , String ENDDATE,String USEROPRKIND) throws java.rmi.RemoteException,Exception;
	 
	 public java.util.HashMap doScpRenewClear( String  SEQUENCE , String ACNTSTOP , boolean  aQryKind ) throws java.rmi.RemoteException,Exception;
	 
	 /**
	  * 提供给order，获取开通状态，是否成功
	  * @param aOFFER_ORDER_ID
	  * @param aBILL_ID
	  * @param aCREATE_DATE eg:201608xxxxx  至少包含年月6位长度字符串
	  * @return
	  * @throws java.rmi.RemoteException
	  * @throws Exception
	  */
	 public Map<String, String> queryUnifyopenStatus( long aOFFER_ORDER_ID , String aBILL_ID, String aCREATE_DATE) throws java.rmi.RemoteException,Exception;
	 
	 public Map<Long,Boolean> queryFailedOffer( IOVOrderCustomer orderCustomer,  String billID , String  create_date ,Map<Long,Boolean> mainOfferProvStatus) throws Exception;
	 
	 public Map<Long,Boolean> isNewConnSucc(String billID, String create_date,IOVOrderOffer[] ordOffers) throws Exception;
	 
	 public void unifyRollBack(IOVOrderCustomer aICustomerL, java.util.HashMap aIUom2StubLL) throws Exception;
	 
	 /**
	  * new ott 需求新增接口
	  * 通过uip接收 O2P/UAPI 侧异步返回的开通数据结果
	  * 入参Map中参数：(*：必传)
	  * 		orderId	：Crm的订单号									*
	  * 		orderLineId	：offer instance id						*
	  * 		uapiEventId	：UAPI event ID							*
	  * 		statusCode ：开通响应结果码								*
	  * 		status ：开通结果，processed：开通成功,failed：开通失败		*
	  * 		description ：开通失败信息
	  * 出参Map中参数：
	  * 		result ：Ucm处理结果，true：处理成功 ，false：处理失败			*
	  * @return
	  * @throws RemoteException
	  * @throws Exception
	  */
	public Map ottOrderCallback(Map map) throws RemoteException,Exception;
	
	/**
	 * 根据UAPI返回的响应码处理工单表数据
	 * @param responseCode
	 * @param ottOrderValue
	 * @return
	 * @throws Exception
	 */
	public void dealDataByResponseCode(String responseCode,IIOpenOttOrderValue ottOrderValue) throws Exception;


	/**
	 * 安全产品开通接口
	 * @param customerOrderId
	 * @param paramMap
	 * @return Map  key:ErrorCode    value:0000-success key:ErrMsg  value:error message if failed
	 * @throws Exception
	 */
	public Map unifyopen(long customerOrderId ,Map paramMap) throws  Exception;
}
