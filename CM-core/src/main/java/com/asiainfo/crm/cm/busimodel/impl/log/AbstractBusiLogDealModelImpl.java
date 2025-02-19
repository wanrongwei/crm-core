package com.asiainfo.crm.cm.busimodel.impl.log;

import com.ai.appframe2.common.DataContainerInterface;
import com.ai.appframe2.common.ServiceManager;
import com.ai.common.i18n.CrmLocaleFactory;
import com.asiainfo.crm.cm.inner.log.ivalues.IBOCmBusiLogValue;
import com.asiainfo.crm.cm.inner.util.CmInnerServiceFactory;
import com.asiainfo.crm.cm.model.bean.CmDealReturnDataBean;
import com.asiainfo.crm.cm.model.ivalues.ICmDealReturnData;

/**
 * 
 * @Copyright Copyright (c) 2012 Asiainfo-Linkage
 * 
 * @ClassName AbstractBusiLogDealModelImpl
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
public abstract class AbstractBusiLogDealModelImpl {

	public final ICmDealReturnData deal(IBOCmBusiLogValue busiLogValue) throws Exception {
		preposeExtThings(busiLogValue);

		saveBusiLog(busiLogValue);

		doOtherThings(busiLogValue);
		ICmDealReturnData returnData = new CmDealReturnDataBean();
		returnData.setIsSuccess("Y");
		returnData.setSuccessMsg(CrmLocaleFactory.getResource("CMS0010031"));
		return returnData;
	}

	/**
	 * 
	 * @Function doOtherThings
	 * @Description 后置扩展
	 *
	 * @param busiLogValue
	 *
	 * @version v1.0.0
	 * @author zhaofei3
	 * @date Feb 21, 2012 10:39:34 AM
	 * 
	 * <strong>Modification History:</strong><br>
	 * Date         Author          Version            Description<br>
	 * ---------------------------------------------------------<br>
	 * Feb 21, 2012     zhaofei3           v1.0.0               修改原因<br>
	 */
	protected void doOtherThings(IBOCmBusiLogValue busiLogValue) throws Exception {

	}

	/**
	 * 
	 * @Function saveBusiLog
	 * @Description 保存业务日志
	 *
	 * @param busiLogValue
	 *
	 * @version v1.0.0
	 * @author zhaofei3
	 * @date Feb 21, 2012 10:39:40 AM
	 * 
	 * <strong>Modification History:</strong><br>
	 * Date         Author          Version            Description<br>
	 * ---------------------------------------------------------<br>
	 * Feb 21, 2012     zhaofei3           v1.0.0               修改原因<br>
	 */
	private void saveBusiLog(IBOCmBusiLogValue busiLogValue) throws Exception {
		if (busiLogValue.isNew()) {
			if (ServiceManager.getUser() != null) {
				busiLogValue.setCreateOpId(ServiceManager.getUser().getID());
				busiLogValue.setCreateOrgId(ServiceManager.getUser().getOrgId());
			}
		}
		CmInnerServiceFactory.getCommonInnerSV().saveBean((DataContainerInterface) busiLogValue);
	}

	/**
	 * 
	 * @Function preposeExtThings
	 * @Description 前置扩展方法
	 *
	 * @param busiLogValue
	 *
	 * @version v1.0.0
	 * @author zhaofei3
	 * @date Feb 21, 2012 10:39:45 AM
	 * 
	 * <strong>Modification History:</strong><br>
	 * Date         Author          Version            Description<br>
	 * ---------------------------------------------------------<br>
	 * Feb 21, 2012     zhaofei3           v1.0.0               修改原因<br>
	 */
	protected void preposeExtThings(IBOCmBusiLogValue busiLogValue) throws Exception {

	}

	/**
	 * 
	 * @Function extBeforeSave
	 * @Description 保存前扩展
	 *
	 * @param busiLogValue
	 *
	 * @version v1.0.0
	 * @author zhaofei3
	 * @date Feb 21, 2012 10:39:48 AM
	 * 
	 * <strong>Modification History:</strong><br>
	 * Date         Author          Version            Description<br>
	 * ---------------------------------------------------------<br>
	 * Feb 21, 2012     zhaofei3           v1.0.0               修改原因<br>
	 */
	protected void extBeforeSave(IBOCmBusiLogValue busiLogValue) throws Exception {

	}
}
