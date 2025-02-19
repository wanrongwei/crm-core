package com.asiainfo.crm.bill.teaminvoke.out.interfaces;

import com.ai.omframe.order.ivalues.IOVOrderCustomer;
import com.asiainfo.crm.cm.model.ivalues.IVOCustValue;

import java.util.Map;

public interface IInterfaceBillCrmSV {
    /**
     * @Description  普通业务调用计费接口方法
     * @param order 订单对象
     * @throws Exception
     * @author dizl
     */
	public void sendOrderInfoToBilling(IOVOrderCustomer order) throws Exception;
    /**
     * @Description: 开户调用计费接口方法
     * @param: order 订单对象
     * @param: custValue crm客户对象
     * @throws: Exception
     * @version: v1.0.0
     * @author: dizl
     * @date: 2012-3-12 上午11:37:46
     */
	public void sendOrderInfoToBilling(IOVOrderCustomer order, IVOCustValue custValue) throws Exception;
    /**
     * @Function: sendOrderInfoToBilling
     * @Description: 修改、删除客户帐户资料发送计费接口方法
     * @param: custValue crm客户对象
     * @param regionId 不用
     * @return: void
     * @throws: Exception
     * @version: v1.0.0
     * @author: dizl
     * @date: 2012-3-9 下午02:25:48
     */
	public void sendCustOrderInfoToBilling(IVOCustValue custValue, String regionId) throws Exception;
    /**
     * @Description  将IOVOrderOffer中的数据拆成多条订单进行调用，该方法主要用于动力100产品新装、债权转让
     * @param order 订单对象
     * @throws Exception
     * @author dizl
     * */
    public void sendOrderInfoToBillingSplit(IOVOrderCustomer order) throws Exception;
    /**
     * SP扣费确认、二次扣费确认、反向停开机、终端资料等不走订单调用计费接口方法
     * */
 	public void sendMapOrderInfoToBilling(Map map) throws Exception;
    /**
     * 用UserId进行设置中心
     * */
	public void sendMapOrderInfoToBilling(Map map, long userId) throws Exception;

}
