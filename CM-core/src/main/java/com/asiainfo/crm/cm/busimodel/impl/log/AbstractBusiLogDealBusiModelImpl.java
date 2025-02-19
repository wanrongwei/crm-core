package com.asiainfo.crm.cm.busimodel.impl.log;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.apache.commons.lang.StringUtils;

import com.ai.common.i18n.CrmLocaleFactory;
import com.asiainfo.crm.cm.busimodel.IDealBusiModel;
import com.asiainfo.crm.cm.busimodel.impl.common.AbstractDealBusiModelImpl;
import com.asiainfo.crm.cm.common.util.CmCommonUtil;
import com.asiainfo.crm.cm.inner.log.bo.BOCmBusiLogBean;
import com.asiainfo.crm.cm.inner.util.CmInnerServiceFactory;
import com.asiainfo.crm.cm.model.bean.CmDealReturnDataBean;
import com.asiainfo.crm.cm.model.ivalues.ICmBusiLogValue;
import com.asiainfo.crm.cm.model.ivalues.ICmDealReturnData;
import com.asiainfo.crm.cm.model.ivalues.IVOBusiLogValue;
import com.asiainfo.crm.cm.model.ivalues.IValueObject;

/**
 * 
 * @Copyright Copyright (c) 2012 Asiainfo-Linkage
 * 
 * @ClassName AbstractBusiLogDealBusiModelImpl
 * @Description 业务日志业务类
 *
 * @version v1.0.0
 * @author zhaofei3
 * @Email zhaofei3@asiainfo-linkage.com
 * @company AsiaInfo
 * @date Feb 21, 2012 10:44:02 AM
 * <br>
 * Modification History:<br>
 * Date         Author          Version            Description<br>
 * ---------------------------------------------------------*<br>
 * Feb 21, 2012     zhaofei3           v1.0.0               修改原因<br>
 */
public abstract class AbstractBusiLogDealBusiModelImpl extends AbstractDealBusiModelImpl implements IDealBusiModel {

	public ICmDealReturnData deal(IValueObject valueObject) throws Exception {
		IVOBusiLogValue logValue = (IVOBusiLogValue) valueObject;
		// 验证
		validate(logValue);
		// 设置默认值
		setDefaultValue(logValue);
		/*
		 * 在调用业务处理之前的处理
		 */
		processBeforeDeal(logValue);
		//
		dealBusiLog(logValue);
		/*
		 * 处理其他业务
		 */
		dealOtherThings(logValue);
		//
		notify(logValue);
		/*
		 * 业务处理之后的操作
		 */
		processBeforeDeal(logValue);
		ICmDealReturnData returnData = new CmDealReturnDataBean();
		returnData.setIsSuccess("Y");
		returnData.setSuccessMsg(CrmLocaleFactory.getResource("CMS0010005"));
		return returnData;
	}

	/**   
	 * 同步其他
	 * 
	 * @Function notify
	 * @Description 
	 *
	 * @param logValue
	 * @throws Exception
	 *
	 * @version v1.0.0
	 * @author huzq
	 * @date 2012-7-17 下午9:41:56
	 * 
	 * <strong>Modification History:</strong><br>
	 * Date         Author          Version            Description<br>
	 * ---------------------------------------------------------<br>
	 * 2012-7-17     huzq           v1.0.0               修改原因<br>
	 */
	protected abstract void notify(IVOBusiLogValue logValue) throws Exception;

	/**   
	 * 处理其他事情
	 * 
	 * @Function dealOtherThings
	 * @Description 
	 *
	 * @param logValue
	 * @throws Exception
	 *
	 * @version v1.0.0
	 * @author huzq
	 * @date 2012-7-17 下午9:19:37
	 * 
	 * <strong>Modification History:</strong><br>
	 * Date         Author          Version            Description<br>
	 * ---------------------------------------------------------<br>
	 * 2012-7-17     huzq           v1.0.0               修改原因<br>
	 */
	protected abstract void dealOtherThings(IVOBusiLogValue logValue) throws Exception;

	/**   
	 * 处理业务日志
	 * 
	 * @Function dealBusiLog
	 * @Description 
	 *
	 * @param logValue
	 *
	 * @version v1.0.0
	 * @author huzq
	 * @throws Exception 
	 * @date 2012-7-17 下午9:19:49
	 * 
	 * <strong>Modification History:</strong><br>
	 * Date         Author          Version            Description<br>
	 * ---------------------------------------------------------<br>
	 * 2012-7-17     huzq           v1.0.0               修改原因<br>
	 */
	protected void dealBusiLog(IVOBusiLogValue logValue) throws Exception {
		List<BOCmBusiLogBean> list = new ArrayList<BOCmBusiLogBean>();
		String busiDetail = null;
		if (logValue.getMainBusiLog() != null) {
			BOCmBusiLogBean bean = new BOCmBusiLogBean();
			bean.copy(logValue.getMainBusiLog());
			busiDetail = bean.getBusiDetail();
			if(StringUtils.isNotBlank(busiDetail)&&busiDetail.length()>4000){
				busiDetail = busiDetail.substring(0, 4000);
				bean.setBusiDetail(busiDetail);
			}
			list.add(bean);
		}
		if (logValue.hasBusiLogDetails()) {
			Iterator it = logValue.getBusiLogDetailList().iterator();
			while (it.hasNext()) {
				ICmBusiLogValue busiLogValue = (ICmBusiLogValue) it.next();
				BOCmBusiLogBean bean = new BOCmBusiLogBean();
				bean.copy(busiLogValue);
				busiDetail = bean.getBusiDetail();
				if(StringUtils.isNotBlank(busiDetail)&&busiDetail.length()>4000){
					busiDetail = busiDetail.substring(0, 4000);
					bean.setBusiDetail(busiDetail);
				}
				list.add(bean);
			}
		}
		if (CmCommonUtil.isNotEmptyObject(list)) {
			CmInnerServiceFactory.getCommonInnerSV().saveBeans(list.toArray(new BOCmBusiLogBean[0]));
		}
	}

	/**   
	 * 
	 * @Function processBeforeDeal
	 * @Description 
	 *
	 * @param logValue
	 * @throws Exception
	 *
	 * @version v1.0.0
	 * @author huzq
	 * @date 2012-7-17 下午9:29:35
	 * 
	 * <strong>Modification History:</strong><br>
	 * Date         Author          Version            Description<br>
	 * ---------------------------------------------------------<br>
	 * 2012-7-17     huzq           v1.0.0               修改原因<br>
	 */
	protected abstract void processBeforeDeal(IVOBusiLogValue logValue) throws Exception;

	/**   
	 * 设置默认值
	 * 
	 * @Function setDefaultValue
	 * @Description 
	 *
	 * @param logValue
	 *
	 * @version v1.0.0
	 * @author huzq
	 * @date 2012-7-17 下午9:29:41
	 * 
	 * <strong>Modification History:</strong><br>
	 * Date         Author          Version            Description<br>
	 * ---------------------------------------------------------<br>
	 * 2012-7-17     huzq           v1.0.0               修改原因<br>
	 */
	protected void setDefaultValue(IVOBusiLogValue logValue) {

	}

	/**   
	 * 验证数据有效性
	 * 
	 * @Function validate
	 * @Description 
	 *
	 * @param logValue
	 *
	 * @version v1.0.0
	 * @author huzq
	 * @date 2012-7-17 下午9:42:16
	 * 
	 * <strong>Modification History:</strong><br>
	 * Date         Author          Version            Description<br>
	 * ---------------------------------------------------------<br>
	 * 2012-7-17     huzq           v1.0.0               修改原因<br>
	 */
	protected void validate(IVOBusiLogValue logValue) {

	}

}
