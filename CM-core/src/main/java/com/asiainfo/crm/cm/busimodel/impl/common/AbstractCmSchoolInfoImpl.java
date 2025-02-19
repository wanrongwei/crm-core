package com.asiainfo.crm.cm.busimodel.impl.common;

import java.util.HashMap;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import com.ai.appframe2.bo.DataContainer;
import com.ai.appframe2.common.AIException;
import com.ai.appframe2.common.DataContainerInterface;
import com.asiainfo.crm.cm.busimodel.IQueryCountBusiModel;
import com.asiainfo.crm.cm.busimodel.IQueryDataBusiModel;
import com.asiainfo.crm.cm.busimodel.common.ParamUtil;
import com.asiainfo.crm.cm.busimodel.common.Parameter;
import com.asiainfo.crm.cm.common.bo.BOAccBankBean;
import com.asiainfo.crm.cm.common.bo.BOCmGsBaseStationBean;
import com.asiainfo.crm.cm.common.bo.BOCmGsBaseStationEngine;
import com.asiainfo.crm.cm.common.bo.BOCmGsChanInfoBean;
import com.asiainfo.crm.cm.common.bo.BOCmGsChanMemberBean;
import com.asiainfo.crm.cm.common.bo.BOCmGsChanTeamBean;
import com.asiainfo.crm.cm.common.bo.BOCmGsKeymanBean;
import com.asiainfo.crm.cm.common.bo.BOCmGsScheduleInfoBean;
import com.asiainfo.crm.cm.common.bo.BOCmGsStudInfoBean;
import com.asiainfo.crm.cm.common.bo.BOCmGsTchrInfoBean;
import com.asiainfo.crm.cm.common.bo.BOCmGslCardInfoBean;
import com.asiainfo.crm.cm.common.ivalues.IBOCmGsBaseStationValue;
import com.asiainfo.crm.cm.common.util.CmCommonUtil;
import com.asiainfo.crm.cm.inner.util.CmInnerServiceFactory;

public class AbstractCmSchoolInfoImpl implements IQueryCountBusiModel, IQueryDataBusiModel 
{

	/**
	 * 
	* @Function: AbstractCmSchoolInfoImpl.java
	* @Description:保存校园基站信息
	*
	* @param:参数描述
	* @return：返回结果描述
	* @throws：异常描述
	*
	* @version: v1.0.0
	* @author: suntao6
	* @date: Aug 27, 2012 2:38:52 PM 
	*
	* Modification History:
	* Date         Author          Version            Description
	*---------------------------------------------------------*
	* Aug 27, 2012     suntao6           v1.0.0              修改原因
	 */
	public final void saveSchoolInfo(DataContainer[] values) throws Exception 
	{
		for (int i = 0; i < values.length; i++) 
		{
			if(values[i].isNew()){
				String baseStationName = values[i].getAsString("BASE_CNAME");
				int count = getBaseStationByName(baseStationName);
				if(count > 0){
				throw new AIException("The base station Chinese name can not be repeated !");
				}
			// 设置主键
		((BOCmGsBaseStationBean)values[i]).setBaseStationId(CmCommonUtil.getNewSequence(BOCmGsBaseStationBean.class));
			}
			CmInnerServiceFactory.getCommonInnerSV().saveBean(values[i]);
		}
	}
    /**
     * 
    * @Function: CmSchoolInfoManagerSVImpl.java
    * @Description: 根据基站的中文名称查找对应的基站信息
    *
    * @param:参数描述
    * @return：返回结果描述
    * @throws：异常描述
    *
    * @version: v1.0.0
    * @author: suntao6
    * @date: Nov 12, 2012 9:07:30 PM 
    *
    * Modification History:
    * Date         Author          Version            Description
    *---------------------------------------------------------*
    * Nov 12, 2012     suntao6           v1.0.0              修改原因
     */
    public int getBaseStationByName(String baseStationName)
	throws Exception {
	 StringBuilder condition = new StringBuilder();
	 HashMap paraMap = new HashMap();
	 condition.append(" 1=1 ");
	 if(!"".equals(baseStationName)&&!"null".equals(baseStationName)&&baseStationName!=null){
	  condition.append(" and "+IBOCmGsBaseStationValue.S_BaseCname + "  = :baseStationName ");
	  paraMap.put("baseStationName", baseStationName);
	 }
	 IBOCmGsBaseStationValue[] values =   BOCmGsBaseStationEngine.getBeans(condition.toString(),paraMap);
	 int count = values.length;
	 return count;
}

/**
 * 
* @Function: AbstractCmSchoolInfoImpl.java
* @Description: 保存校园渠道信息
*
* @param:参数描述
* @return：返回结果描述
* @throws：异常描述
*
* @version: v1.0.0
* @author: suntao6
* @date: Aug 27, 2012 2:39:20 PM 
*
* Modification History:
* Date         Author          Version            Description
*---------------------------------------------------------*
* Aug 27, 2012     suntao6           v1.0.0              修改原因
 */	
	public final void saveGsChanInfo(DataContainer[] values) throws Exception 
	{
		for (int i = 0; i < values.length; i++) 
		{
			if(values[i].isNew()){
			// 设置主键
		((BOCmGsChanInfoBean)values[i]).setSaleId(CmCommonUtil.getNewSequence(BOCmGsChanInfoBean.class));
			}
			CmInnerServiceFactory.getCommonInnerSV().saveBean(values[i]);
		}
	}
/**
 * 
* @Function: AbstractCmSchoolInfoImpl.java
* @Description:保存校园直销队信息
*
* @param:参数描述
* @return：返回结果描述
* @throws：异常描述
*
* @version: v1.0.0
* @author: suntao6
* @date: Aug 27, 2012 2:39:41 PM 
*
* Modification History:
* Date         Author          Version            Description
*---------------------------------------------------------*
* Aug 27, 2012     suntao6           v1.0.0              修改原因
 */	
	public final void saveChanTeam(DataContainer[] values) throws Exception 
	{
		for (int i = 0; i < values.length; i++) 
		{
			if(values[i].isNew()){
			// 设置主键
		((BOCmGsChanTeamBean)values[i]).setTeamId(CmCommonUtil.getNewSequence(BOCmGsChanTeamBean.class));
			}
			CmInnerServiceFactory.getCommonInnerSV().saveBean(values[i]);
		}
	}
/**
 * 
* @Function: AbstractCmSchoolInfoImpl.java
* @Description: 保存校园联系人
*
* @param:参数描述
* @return：返回结果描述
* @throws：异常描述
*
* @version: v1.0.0
* @author: suntao6
* @date: Aug 29, 2012 4:18:08 PM 
*
* Modification History:
* Date         Author          Version            Description
*---------------------------------------------------------*
* Aug 29, 2012     suntao6           v1.0.0              修改原因
 */
	public final void saveKeyMan(DataContainer[] values) throws Exception 
	{
		for (int i = 0; i < values.length; i++) 
		{
			if(values[i].isNew()){
			// 设置主键
		((BOCmGsKeymanBean)values[i]).setKeymanId(CmCommonUtil.getNewSequence(BOCmGsKeymanBean.class));
			}
			CmInnerServiceFactory.getCommonInnerSV().saveBean(values[i]);
		}
	}
/**
*
* @Function: AbstractCmSchoolInfoImpl.java
* @Description: 保存校园直销员信息
*
* @param:参数描述
* @return：返回结果描述
* @throws：异常描述
*
* @version: v1.0.0
* @author: suntao6
* @date: Aug 28, 2012 3:43:19 PM 
*
* Modification History:
* Date         Author          Version            Description
*---------------------------------------------------------*
* Aug 28, 2012     suntao6           v1.0.0              修改原因
 */
	public final void saveChanMember(DataContainer[] values) throws Exception 
	{
		for (int i = 0; i < values.length; i++) 
		{
			if(values[i].isNew()){
			// 设置主键
		((BOCmGsChanMemberBean)values[i]).setMemberId(CmCommonUtil.getNewSequence(BOCmGsChanMemberBean.class));
			}
			CmInnerServiceFactory.getCommonInnerSV().saveBean(values[i]);
		}
	}
/**
 * 
* @Function: AbstractCmSchoolInfoImpl.java
* @Description: 保存校园夹寄卡信息
*
* @param:参数描述
* @return：返回结果描述
* @throws：异常描述
*
* @version: v1.0.0
* @author: suntao6
* @date: Aug 30, 2012 2:07:52 PM 
*
* Modification History:
* Date         Author          Version            Description
*---------------------------------------------------------*
* Aug 30, 2012     suntao6           v1.0.0              修改原因
 */
	public final void saveGslCardInfo(DataContainer[] values) throws Exception 
	{
		for (int i = 0; i < values.length; i++) 
		{
			if(values[i].isNew()){
			// 设置主键
		((BOCmGslCardInfoBean)values[i]).setCardId(CmCommonUtil.getNewSequence(BOCmGsChanMemberBean.class));
			}
			CmInnerServiceFactory.getCommonInnerSV().saveBean(values[i]);
		}
	}	
/**
 * 
* @Function: AbstractCmSchoolInfoImpl.java
* @Description: 保存校园学生信息
*
* @param:参数描述
* @return：返回结果描述
* @throws：异常描述
*
* @version: v1.0.0
* @author: suntao6
* @date: Sep 3, 2012 4:01:03 PM 
*
* Modification History:
* Date         Author          Version            Description
*---------------------------------------------------------*
* Sep 3, 2012     suntao6           v1.0.0              修改原因
 */
	public final void saveGsStudInfo(DataContainer[] values) throws Exception 
	{
		for (int i = 0; i < values.length; i++) 
		{
			if(values[i].isNew()){
			// 设置主键
		((BOCmGsStudInfoBean)values[i]).setStudId(CmCommonUtil.getNewSequence(BOCmGsStudInfoBean.class));
			}
			CmInnerServiceFactory.getCommonInnerSV().saveBean(values[i]);
		}
	}
/**
 * 
* @Function: AbstractCmSchoolInfoImpl.java
* @Description: 校园教职工信息保存
*
* @param:参数描述
* @return：返回结果描述
* @throws：异常描述
*
* @version: v1.0.0
* @author: suntao6
* @date: Aug 31, 2012 2:21:12 PM 
*
* Modification History:
* Date         Author          Version            Description
*---------------------------------------------------------*
* Aug 31, 2012     suntao6           v1.0.0              修改原因
 */
	public final void saveGsTchrInfo(DataContainer[] values) throws Exception 
	{
		for (int i = 0; i < values.length; i++) 
		{
			if(values[i].isNew()){
			// 设置主键
		((BOCmGsTchrInfoBean)values[i]).setTchrId(CmCommonUtil.getNewSequence(BOCmGsTchrInfoBean.class));
			}
			CmInnerServiceFactory.getCommonInnerSV().saveBean(values[i]);
		}
	}
/**
 * 
* @Function: AbstractCmSchoolInfoImpl.java
* @Description: 保存放号营销类信息
*
* @param:参数描述
* @return：返回结果描述
* @throws：异常描述
*
* @version: v1.0.0
* @author: suntao6
* @date: Sep 5, 2012 4:54:00 PM 
*
* Modification History:
* Date         Author          Version            Description
*---------------------------------------------------------*
* Sep 5, 2012     suntao6           v1.0.0              修改原因
 */
	public final void saveGsScheduleInfo(DataContainer[] values) throws Exception 
	{
		for (int i = 0; i < values.length; i++) 
		{
			if(values[i].isNew()){
			// 设置主键
		((BOCmGsScheduleInfoBean)values[i]).setInstId(CmCommonUtil.getNewSequence(BOCmGsScheduleInfoBean.class));
			}
			CmInnerServiceFactory.getCommonInnerSV().saveBean(values[i]);
		}
	}
	
	
	public DataContainer[] queryData(String criteria, int startNum, int endNum) throws Exception 
	{
		return queryData(ParamUtil.parseXmlCriteria(criteria), startNum, endNum);
	}

	public final DataContainer[] queryData(DataContainer[] conditionDCs, int startNum, int endNum) throws Exception 
	{
		// 构造查询条件
		Parameter parameter = buildQueryCondition(conditionDCs);
		DataContainerInterface[] values = CmInnerServiceFactory.getCommonInnerSV().getBeans(parameter.getBeanClass(), parameter.getCondition(),
				parameter.getParameter(), startNum, endNum);
		if (!CmCommonUtil.isNotEmptyObject(values)) {
			return new DataContainer[0];
		}
		return (DataContainer[]) values;
	}

	public int queryCount(String criteria) throws Exception 
	{
		return queryCount(ParamUtil.parseXmlCriteria(criteria));
	}
	
	public final int queryCount(DataContainer[] conditionDCs) throws Exception 
	{
		// 构造查询条件
		Parameter parameter = buildQueryCondition(conditionDCs);
		return CmInnerServiceFactory.getCommonInnerSV().getBeanCount(parameter.getBeanClass(), parameter.getCondition(), parameter.getParameter());
	}


	public Parameter buildQueryCondition(DataContainer[] conditionDCs) throws Exception 
	{
		Parameter parameter = ParamUtil.buildParameter(new DataContainer[] { conditionDCs[0] }, conditionDCs[0].getClass());
		return parameter;
	}

	public DataContainerInterface[] queryData(String[] cols,
			DataContainer[] criteria, int startNum, int endNum)
			throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

}
