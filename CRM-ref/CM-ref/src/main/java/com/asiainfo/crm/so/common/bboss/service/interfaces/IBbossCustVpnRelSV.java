package com.asiainfo.crm.so.common.bboss.service.interfaces;

import java.util.HashMap;
import java.util.Map;

import com.ai.appframe2.common.DataContainerInterface;
import com.ai.appframe2.service.ServiceFactory;
import com.ai.omframe.instance.ivalues.IInsUserValue;
import com.asiainfo.crm.so.common.bboss.ivalues.IBOBbossStopReplyDealValue;
import com.asiainfo.crm.so.common.bboss.ivalues.IBOInsCustVpnRelValue;
import com.asiainfo.crm.so.common.bboss.ivalues.IBOInsxVpnGroupRelValue;
import com.asiainfo.crm.so.order.bboss.service.interfaces.IBbossSoVMInvokeSV;

/**
 * 
 * @author Joker
 *
 */
public interface IBbossCustVpnRelSV {

	/**
	 * 保存 VPN关系信息
	 * @param IBOInsCustVpnRelValue
	 * @throws Exception
	 */
	public void saveInsxCustVpnRelValue(IBOInsCustVpnRelValue insCustVpnRelValue) throws Exception;
	/**
	 * 删除客户与客户之间的VPN关系
	 * @param BOInsCustVpnRelValue
	 * @throws Exception
	 */
	public void delInsxCustVpnRelValues(IBOInsCustVpnRelValue insCustVpnRelValues) throws Exception;
	
	/**
	 * 获取拥有者的VPN群组关系
	 * @param ownerCustId
	 * @param benefiCustId
	 * @param opId
	 * @param orgid
	 * @return
	 * @throws Exception
	 */
	public IBOInsCustVpnRelValue[] getCustVpnRelValues(long ownerCustId,long benefiCustId,long opId,long orgid,String dealState) throws Exception;
	
	/**
	 * 拥有者客户关系信息
	 * @param custId
	 * @return
	 * @throws Exception
	 */
	public IBOInsCustVpnRelValue[] isOwnerCustVpn(long custId) throws Exception;
	/**
	 * 受惠者客户关系信息
	 * @param custId
	 * @return
	 * @throws Exception
	 */
	public IBOInsCustVpnRelValue[] isBenefiCustVpn(long custId) throws Exception;
	
	/**
	 * 是否拥有VPN关系
	 * @param custId
	 * @return
	 * @throws Exception
	 */
	public Map isHaveVpnRelationShip(long custId) throws Exception;
	
	/**
	 * 指定查询某一客户是否存在VPN关系信息
	 * @param custId
	 * @param custName
	 * @return
	 * @throws Exception
	 */
	public DataContainerInterface getCustVpnInfo(long custId) throws Exception;
	
	/**
	 * 
	 * @param custId
	 * @param custName
	 * @return
	 * @throws Exception
	 */
	public int getCustVpnRelNum(long custId) throws Exception;
	
	/**
	 * 判断是否有在途单
	 * @param custId
	 * @return
	 * @throws Exception
	 */
	public boolean hasOngoingOrder(long custId) throws Exception;
	
	
	public IBOInsCustVpnRelValue[] getInsCustVpnBeans(String condition,HashMap parameter) throws Exception;
	
	public void saveRelation(long ownerCustId,long benefiCustId,long opId,long orgid) throws Exception;
	
	public DataContainerInterface[] getCustVpnRelation(String ownerCustId,String benefiCustId,int start, int end) throws Exception;
	
	public int getCustVpnRelationCount(String ownerCustId,String benefiCustId) throws Exception;
	
	public void deleteRelation(long ownerCustId, long benefiCustId) throws Exception;
	
	public IBOInsCustVpnRelValue[] isWaitOrDealRelInfo(long ownerCustId, long benefiCustId) throws Exception;
	
	public boolean checkIfVpnMember(long custId, long billId)throws Exception;
	/**
	 * 检查是否订购了T_MOBILE
	 * @param insUserValues
	 * @return
	 * @throws Exception
	 */
	public boolean checkTMobile(IInsUserValue insUserValues) throws Exception;
	
	public DataContainerInterface[] getVpnListInfo(long custId,int start, int end) throws Exception;
	
	public int getVpnListInfoCount(long custId) throws Exception;
	
	public DataContainerInterface[] getCustVpnRelation(String custId,int start, int end) throws Exception;
	
	public int getCustVpnRelationCount(String custId) throws Exception;
	
	/**
	 * 
	 * Description: 添加VPN成员
	 * @param billId
	 * @param channelType
	 * @param shortNum
	 * @param vpnId
	 * @throws Exception
	 * @author yangjin3
	 * @date  2016年4月11日 下午6:37:51
	 */
	public void ExternalShortNumberAdd(String billId, String channelType,String shortNum,String vpnId) throws Exception;
	
	/**
	 * 
	 * Description: 删除VPN成员
	 * @param billId
	 * @param channelType
	 * @param shortNum
	 * @param vpnId
	 * @throws Exception
	 * @author yangjin3
	 * @date  2016年4月11日 下午6:37:51
	 */
	public void ExternalShortNumberRemove(String billId, String channelType) throws Exception;
}
