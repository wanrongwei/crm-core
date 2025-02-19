package com.asiainfo.crm.ci.inter.out.service.interfaces;

import java.util.Date;

import com.ai.appframe2.bo.DataContainer;
import com.ai.appframe2.service.ServiceFactory;
import com.asiainfo.crm.ci.inter.out.bo.CustomerInteractionBean;
import com.asiainfo.crm.ci.interaction.ivalues.IBOCiInteractionCommentValue;
import com.asiainfo.crm.ci.interaction.ivalues.IBOCiInteractionRelValue;
import com.asiainfo.crm.ci.interaction.ivalues.IBOCiInteractionValue;
import com.asiainfo.crm.ci.spec.ivalues.IBOCiChannelValue;
import com.asiainfo.crm.ci.spec.ivalues.IBOCiInteractionCategoryValue;
import com.asiainfo.crm.ci.spec.ivalues.IBOCiInteractionTypeValue;
import com.asiainfo.crm.ci.spec.service.interfaces.IChannelSV;
import com.asiainfo.crm.ci.spec.service.interfaces.ICiInteractionTypeSV;
import com.asiainfo.crm.ci.spec.service.interfaces.IInteractionCfgSV;

public interface ICustomerInteractionSV {

	/**
	 * 创建客户交互信息
	 * 当调用方无法界定接触与交互，接触的开始/结束时间时调用此接口。该接口负责接触与交互的生成。调用放无需关心
	 * 接触与交互的区别，以及开始/结束
	 * @param interaction
	 * @throws Exception
	 */
	public void createCustomerInteraction(CustomerInteractionBean interaction) throws Exception;
	
	/**
	 * 客户接触开始接口
	 * 当调用方能够明确的界定接触与交互，并且可以界定开始时间，则可以调用此接口
	 * @param contact
	 * @throws Exception
	 */
	public void createCustomerContact(CustomerInteractionBean contact) throws Exception;
	
	/**
	 * 客户接触结束接口
	 * 当调用方能够明确的界定接触与交互，并且可以界定结束时间，则可以调用此接口
	 * @param contact
	 * @throws Exception
	 */
	public void finishCustomerContact(CustomerInteractionBean contact) throws Exception;
	
	/**
	 * @param custId
	 * @param startDate
	 * @param endDate
	 * @param srcSysId	业务源系统
	 * @param channelCode	渠道代码
	 * @param srcBusiType	业务类型编码
	 * @param opId
	 * @return
	 * @throws Exception
	 */
//	@Deprecated
	public CustomerInteractionBean[] queryCustomerInteraction(long custId,Date startDate,Date endDate,String srcSysId,String channelCode,String srcBusiType,long opId) throws Exception;
	
	/**
	 * 查询交互的注释，
	 * @param interactionId
	 * @param tenantId，可填，默认获取当前上下文的tenantId
	 * @return
	 * @throws Exception
	 */
	public IBOCiInteractionCommentValue[] getInteractionComment(long interactionId,String tenantId) throws Exception;
	
	/**
	 * 获取交互的下游关联交互
	 * @param interactionId
	 * @param tenantId，可填，默认获取当前上下文的tenantId
	 * @return
	 * @throws Exception
	 */
	public IBOCiInteractionRelValue[] getInteractionRel(long interactionId,String tenantId) throws Exception;
	
	/**
	 * 给客户交互添加注释
	 * @param comment
	 * @throws Exception
	 */
	public void createInteractionComment(IBOCiInteractionCommentValue comment) throws Exception;
	
	/**
	 * 
	 * @param custId	必填
	 * @param msisdn
	 * @param srcSysId
	 * @param categoryId
	 * @param interactionTypeId
	 * @param channelId
	 * @param startDate
	 * @param endDate
	 * @param queryPri
	 * @param accountId--8.2为王坤提供
	 * @return
	 * @throws Exception
	 */
	public int queryCustomerInteractionCount(long custId,String msisdn,String srcSysId,long categoryId,long interactionTypeId,long channelId,Date startDate,Date endDate,long queryPri,long accountId) throws Exception;
	public CustomerInteractionBean[] queryCustomerInteraction(long custId,String msisdn,String srcSysId,long categoryId,long interactionTypeId,long channelId,Date startDate,Date endDate,long queryPri,long accountId,long first,long step) throws Exception;
	
	
	/**
	 * 查询交互分类
	 * @return
	 * @throws Exception
	 */
	public IBOCiInteractionCategoryValue[] getInteractionCategory() throws Exception;
	
	/**
	 * 查询交互渠道
	 * @return
	 * @throws Exception
	 */
	public IBOCiChannelValue[] getInteractionChannel() throws Exception;
	
	/**
	 * 查询交互类型
	 * @param srcSysId
	 * @return
	 * @throws Exception
	 */
	public IBOCiInteractionTypeValue[] getInteractionType(String srcSysId) throws Exception;
	
    /**
     * 手工增加log  该接口为ose提供
     * @param value
     * @return
     * @throws Exception
     */
	public String saveManuInteraction4OSE(IBOCiInteractionValue value)
			throws Exception;

  
}
