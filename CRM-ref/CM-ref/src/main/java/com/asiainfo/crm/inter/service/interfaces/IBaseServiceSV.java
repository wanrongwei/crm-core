package com.asiainfo.crm.inter.service.interfaces;

import java.rmi.RemoteException;
import java.util.Map;

/**
 * 3.7 基础服务类 基础服务类 接口
 * 
 * @author zhaiwg
 * 
 */
public interface IBaseServiceSV {
	
	/**
	 * 3.7.1.19 删除操作员组织
	 * 
	 * @param busiParams
	 * @return
	 * @throws Exception
	 * @throws RemoteException
	 */
	public Map deleteOperOrg(Map busiParams) throws Exception, RemoteException;

	/**
	 * 3.7.1.21 查询组织下所有工号（支持分页）
	 * 
	 * @param busiParams
	 * @return
	 * @throws Exception
	 * @throws RemoteException
	 */
	public Map getOrgOper(Map busiParams) throws Exception, RemoteException;

	/**
	 * 3.7.1.30 查询操作员菜单权限
	 * 
	 * @param busiParams
	 * @return
	 * @throws Exception
	 * @throws RemoteException
	 */
	public Map getOperMenusShow(Map busiParams) throws Exception,
			RemoteException;

	/**
	 * 3.7.1.32 查询操作员信息（批量接口）
	 * 
	 * @param busiParams
	 * @return
	 * @throws Exception
	 * @throws RemoteException
	 */
	public Map getOperInfo(Map busiParams) throws Exception, RemoteException;

	/**
	 * 3.7.2.2 查询业务代码定义信息
	 * 
	 * @param busiParams
	 * @return
	 * @throws Exception
	 * @throws RemoteException
	 */
	public Map getBusiCode(Map busiParams) throws Exception, RemoteException;

	/**
	 * 3.7.2.4 查询省份代码信息
	 * 
	 * @param busiParams
	 * @return
	 * @throws Exception
	 * @throws RemoteException
	 */
	public Map getProvince(Map busiParams) throws Exception, RemoteException;

	/**
	 * 3.7.2.5 查询国家信息
	 * 
	 * @param busiParams
	 * @return
	 * @throws Exception
	 * @throws RemoteException
	 */
	public Map getCountry(Map busiParams) throws Exception, RemoteException;

	/**
	 * 3.7.2.11 发送短信（批量）
	 * 
	 * @param busiParams
	 * @return
	 * @throws Exception
	 * @throws RemoteException
	 */
	public Map batchSendShortMessage(Map busiParams) throws Exception,
			RemoteException;

	/**
	 * 3.7.2.14 取系统参数信息
	 * 
	 * @param busiParams
	 * @return
	 * @throws Exception
	 * @throws RemoteException
	 * @author zhouts
	 */
	public Map getSysParam(Map busiParams) throws Exception, RemoteException;

	/**
	 * 3.7.3.1 查询所有主策划（或套餐）
	 * 
	 * @param busiParams
	 * @return
	 * @throws Exception
	 * @throws RemoteException
	 */
	public Map getAllMainOffer(Map busiParams) throws Exception,
			RemoteException;

	/**
	 * 3.7.3.2 查询SP信息
	 * 
	 * @param busiParams
	 * @return
	 * @throws Exception
	 * @throws RemoteException
	 */
	public Map getSPInfo(Map busiParams) throws Exception, RemoteException;

	/**
	 * 3.7.3.3 查询终端信息
	 * 
	 * @param busiParams
	 * @return
	 * @throws Exception
	 * @throws RemoteException
	 */
	public Map getTerminalInfo(Map busiParams) throws Exception,
			RemoteException;

	/**
	 * 3.7.3.4 查询促销信息
	 * 
	 * @param busiParams
	 * @return
	 * @throws Exception
	 * @throws RemoteException
	 */
	public Map getPromotionInfo(Map busiParams) throws Exception,
			RemoteException;

	/**
	 * 3.7.3.5 查询兑换方案
	 * 
	 * @param busiParams
	 * @return
	 * @throws Exception
	 * @throws RemoteException
	 */
	public Map getExchangeProject(Map busiParams) throws Exception,
			RemoteException;

	/**
	 * 3.7.3.6 查询兑换规则
	 * 
	 * @param busiParams
	 * @return
	 * @throws Exception
	 * @throws RemoteException
	 */
	public Map getExchangeRule(Map busiParams) throws Exception,
			RemoteException;

	/**
	 * 3.7.3.7 查询预缴活动信息
	 * 
	 * @param busiParams
	 * @return
	 * @throws Exception
	 * @throws RemoteException
	 */
	public Map getPrepayPloyInfo(Map busiParams) throws Exception,
			RemoteException;

	/**
	 * 3.7.3.8 查询可订购的主策划
	 * 
	 * @param busiParams
	 * @return
	 * @throws Exception
	 * @throws RemoteException
	 */
	public Map getUserAvailMainOffer(Map busiParams) throws Exception,
			RemoteException;

	/**
	 * 3.7.3.9 查询可订购的增值策划
	 * 
	 * @param busiParams
	 * @return
	 * @throws Exception
	 * @throws RemoteException
	 */
	public Map getUserAvailVasOffer(Map busiParams) throws Exception,
			RemoteException;

	/**
	 * 3.7.3.10 查询基站列表
	 * 
	 * @param busiParams
	 * @return
	 * @throws Exception
	 * @throws RemoteException
	 */
	public Map getBaseStation(Map busiParams) throws Exception, RemoteException;

	/**
	 * 3.7.3.11 查询基站下产品列表
	 * 
	 * @param busiParams
	 * @return
	 * @throws Exception
	 * @throws RemoteException
	 */
	public Map getProdOfBaseStation(Map busiParams) throws Exception,
			RemoteException;

	/**
	 * 3.7.3.12 查询集团可订购策划
	 * 
	 * @param busiParams
	 * @return
	 * @throws Exception
	 * @throws RemoteException
	 * @author zhouts
	 */
	public Map getGroupOffers(Map busiParams) throws Exception, RemoteException;

	/**
	 * 3.7.4.1 查询接触式营销活动
	 * 
	 * @param busiParams
	 * @return
	 * @throws Exception
	 * @throws RemoteException
	 */
	public Map getTouchCampaign(Map busiParams) throws Exception,
			RemoteException;

	/**
	 * 3.7.4.2 记录接触式营销活动结果
	 * 
	 * @param busiParams
	 * @return
	 * @throws Exception
	 * @throws RemoteException
	 */
	public Map returnCampaignResult(Map busiParams) throws Exception,
			RemoteException;

	/**
	 * 3.7.4.3 检查营销活动
	 * 
	 * @param busiParams
	 * @return
	 * @throws Exception
	 * @throws RemoteException
	 */
	public Map checkCampaign(Map busiParams) throws Exception, RemoteException;

	/**
	 * xiaozhibi-xialing-zhouts
	 * 
	 * @param busiParams
	 * @return
	 * @throws Exception
	 * @throws RemoteException
	 */
	public Map getUserXiao(Map busiParams) throws Exception, RemoteException;

	/**
	 * 获取系统心跳
	 * 
	 * @param busiParams
	 * @return
	 * @throws Exception
	 * @throws RemoteException
	 */
	public Map healthCheck(Map busiParams) throws Exception, RemoteException;

	/**
	 * 查询拥有指定权限实体的操作员
	 * 
	 * @param busiParams
	 * @return
	 * @throws Exception
	 * @throws RemoteException
	 */
	public Map getOperByEntityIds(Map busiParams) throws Exception,
			RemoteException;

	// -------------------------------------------
	/**
	 * 3.7.2.1 获取系统日期
	 * 
	 * @param busiParams
	 * @return
	 * @throws Exception
	 * @throws RemoteException
	 */
	public Map getSysDateTime(Map busiParams) throws Exception, RemoteException;

	/**
	 * 3.7.2.8 查询组织信息
	 * 
	 * @param busiParams
	 * @return
	 * @throws Exception
	 * @throws RemoteException
	 */
	public Map getOrgInfo(Map busiParams) throws Exception, RemoteException;

	/**
	 * 3.7.2.12 取地区信息
	 * 
	 * @param busiParams
	 * @return
	 * @throws Exception
	 * @throws RemoteException
	 * @author shaoyn
	 */
	public Map getAllRegion(Map busiParams) throws Exception, RemoteException;

	/**
	 * 3.7.2.13 取县市信息
	 * 
	 * @param busiParams
	 * @return
	 * @throws Exception
	 * @throws RemoteException
	 * @author shaoyn
	 */
	public Map getAllCounty(Map busiParams) throws Exception, RemoteException;

	/**
	 * 3.7.2.3 查询城市代码信息
	 * 
	 * @param busiParams
	 * @return
	 * @throws Exception
	 * @throws RemoteException
	 */
	public Map getCity(Map busiParams) throws Exception, RemoteException;

	/**
	 * 3.7.2.10查询手机归属地（根据局向表）
	 * 
	 * @param busiParams
	 * @return
	 * @throws Exception
	 * @author: zhouts
	 */
	public Map getUserArea(Map busiParams) throws Exception, RemoteException;

	/**
	 * 3.7.2.7 查询银行信息
	 * 
	 * @param busiParams
	 * @return
	 * @throws Exception
	 * @throws RemoteException
	 */
	public Map getBankInfo(Map busiParams) throws Exception, RemoteException;

	/**
	 * 3.7.2.6 发送短信
	 * 
	 * @param busiParams
	 * @return
	 * @throws Exception
	 * @throws RemoteException
	 */
	public Map sendShortMessage(Map busiParams) throws Exception,
			RemoteException;
	
	/**
	 *   查询SIM卡综合信息
	 * @param busiParams
	 * @return
	 * @throws Exception
	 * @throws RemoteException
	 * @author  
	 */
	public Map getRelationOfSimCardAndNumber(Map busiParams) throws Exception , RemoteException; 
	
	
	/**
	 * @description
	 * @author zoudj
	 * @date 2014-11-27
	 */
	public Map queryAddressListCount(Map busiParams) throws Exception, RemoteException;
	
	/**
	 * 
	 * @description
	 * @author zoudj
	 * @date 2014-11-27
	 */
	public Map queryAddressListByAddressType(Map busiParams) throws Exception, RemoteException;
	
	/**
	 * 统一样式获取
	 * @param busiParams
	 * @return
	 * @throws Exception
	 * @throws RemoteException 
	 */
	public Map queryVisualCfg (Map busiParams) throws Exception, RemoteException;
	
	/**
	 * 获取序列编号
	 * @param name
	 * @return
	 * @throws Exception
	 */
	public long getSeq(String name) throws Exception;
	
	/**
	 * @description
	 * @author zoudj
	 * @date 2015-03-02
	 */
	public Map queryCoList(Map busiParams) throws Exception, RemoteException;
}
