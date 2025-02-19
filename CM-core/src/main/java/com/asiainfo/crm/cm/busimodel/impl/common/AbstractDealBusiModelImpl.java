/**
 * 
 */
package com.asiainfo.crm.cm.busimodel.impl.common;

import java.sql.Timestamp;

import com.ai.appframe2.bo.ObjectTypeNull;
import com.ai.appframe2.common.DataStructInterface;
import com.ai.appframe2.common.ObjectType;
import com.ai.appframe2.common.ServiceManager;
import com.ai.common.util.TimeUtil;
import com.asiainfo.crm.cm.busimodel.IDealBusiModel;
import com.asiainfo.crm.cm.common.CmConstants;
import com.asiainfo.crm.cm.common.util.CmCommonUtil;

/**   
 * @Copyright Copyright (c) 2012 Asiainfo-Linkage
 * 
 * @ClassName 
 * @Description 该类的功能描述
 *
 * @version v1.0.0
 * @author huzq
 * @date 2012-7-17 下午11:39:27
 * <br>
 * Modification History:<br>
 * Date         Author          Version            Description<br>
 * ---------------------------------------------------------*<br>
 * 2012-7-17     huzq           v1.0.0               修改原因<br>
 */
public abstract class AbstractDealBusiModelImpl implements IDealBusiModel {

	/**   
	 * 设置创建时间、工号等信息。
	 * 
	 * @Function setCommonValue
	 * @Description 
	 *
	 * @param dsi
	 * @throws Exception
	 *
	 * @version v1.0.0
	 * @author huzq
	 * @date 2012-7-18 上午12:11:12
	 * 
	 * <strong>Modification History:</strong><br>
	 * Date         Author          Version            Description<br>
	 * ---------------------------------------------------------<br>
	 * 2012-7-18     huzq           v1.0.0               修改原因<br>
	 */
	protected void setCommonValue(DataStructInterface dsi) throws Exception {
		ObjectType objectType = dsi.getObjectType();
		// 对于没有具体的BO类型的不处理
		if (objectType instanceof ObjectTypeNull) {
			return;
		}
		// 无任何值改变则跳过
		if (!dsi.isNew() && !dsi.isModified() && dsi.isDeleted()) {
			return;
		}
		Timestamp currDatetime = ServiceManager.getOpDateTime();
		if (dsi.isNew()) {
			// 创建时间
			if (objectType.hasProperty(S_CREATE_DATE) && dsi.get(S_CREATE_DATE) == null) {
				dsi.set(S_CREATE_DATE, currDatetime);
			}
			// 创建操作员、创建组织
			if (ServiceManager.getUser() != null) {
				if (objectType.hasProperty(S_CREATE_OP_ID) && dsi.get(S_CREATE_OP_ID) == null) {
					dsi.set(S_CREATE_OP_ID, ServiceManager.getUser().getID());
				}
				if (objectType.hasProperty(S_CREATE_ORG_ID) && dsi.get(S_CREATE_ORG_ID) == null) {
					dsi.set(S_CREATE_ORG_ID, ServiceManager.getUser().getOrgId());
				}
			}
			// 地市
			if (objectType.hasProperty(S_REGION_ID) && dsi.get(S_REGION_ID) == null) {
				dsi.set(S_REGION_ID, CmCommonUtil.getDefaultRegionId());
			}
			// 记录状态
			if (objectType.hasProperty(S_STATE) && dsi.get(S_STATE) == null) {
				dsi.set(S_STATE, CmConstants.RecordState.USE);
			}
			// 失效时间
			if (objectType.hasProperty(S_EXPIRE_DATE) && dsi.get(S_EXPIRE_DATE) == null) {
				dsi.set(S_EXPIRE_DATE, TimeUtil.getMaxExpire());
			}
			// 当前业务操作员、创建组织
			if (ServiceManager.getUser() != null) {
				if (objectType.hasProperty(S_OP_ID) && dsi.get(S_OP_ID) == null) {
					dsi.set(S_OP_ID, ServiceManager.getUser().getID());
				}
				if (objectType.hasProperty(S_ORG_ID) && dsi.get(S_ORG_ID) == null) {
					dsi.set(S_ORG_ID, ServiceManager.getUser().getOrgId());
				}
			}
			// 业务流水号
			if (objectType.hasProperty(S_DONE_CODE) && dsi.get(S_DONE_CODE) == null) {
				dsi.set(S_DONE_CODE, ServiceManager.getDoneCode());
			}
			// 当前业务操作时间
			if (objectType.hasProperty(S_DONE_DATE) && dsi.get(S_DONE_DATE) == null) {
				dsi.set(S_DONE_DATE, currDatetime);
			}
			// 生效时间
			if (objectType.hasProperty(S_EFFECTIVE_DATE) && dsi.get(S_EFFECTIVE_DATE) == null) {
				dsi.set(S_EFFECTIVE_DATE, currDatetime);
			}
		} else if (dsi.isModified()) {
			// 逻辑删除时置失效时间
			if (objectType.hasProperty(S_STATE) && dsi.isPropertyModified(S_STATE) && CmConstants.RecordState.ERASE.equals((String) dsi.get(S_STATE))) {
				if (objectType.hasProperty(S_EXPIRE_DATE) && !dsi.isPropertyModified(S_EXPIRE_DATE)) {
					dsi.set(S_EXPIRE_DATE, currDatetime);
				}
			}
			// 当前业务操作员、创建组织
			if (ServiceManager.getUser() != null) {
				if (objectType.hasProperty(S_OP_ID) && !dsi.isPropertyModified(S_OP_ID)) {
					dsi.set(S_OP_ID, ServiceManager.getUser().getID());
				}
				if (objectType.hasProperty(S_ORG_ID) && !dsi.isPropertyModified(S_ORG_ID)) {
					dsi.set(S_ORG_ID, ServiceManager.getUser().getOrgId());
				}
			}

			// 业务流水号
			if (objectType.hasProperty(S_DONE_CODE) && !dsi.isPropertyModified(S_DONE_CODE)) {
				dsi.set(S_DONE_CODE, ServiceManager.getDoneCode());
			}
			// 当前业务操作时间
			if (objectType.hasProperty(S_DONE_DATE) && !dsi.isPropertyModified(S_DONE_DATE)) {
				dsi.set(S_DONE_DATE, currDatetime);
			}
			// 生效时间
			// if (objectType.hasProperty(S_EFFECTIVE_DATE) && !dsi.isPropertyModified(S_EFFECTIVE_DATE)) {
			// dsi.set(S_EFFECTIVE_DATE, currDatetime);
			// }
			// 失效时间
			if (objectType.hasProperty(S_EXPIRE_DATE) && dsi.get(S_EXPIRE_DATE) == null) {
				dsi.set(S_EXPIRE_DATE, TimeUtil.getMaxExpire());
			}
			// effictive_date
			// if(objectType.hasProperty(S_EFFECTIVE_DATE)){
			// dsi.set(S_EFFECTIVE_DATE,currDatetime);
			// }
			// 增加对REGION_ID的特殊处理:如果REGION_ID为空，则为了记录历史表能正常记录，暂时使用此方法来屏蔽因为记录历史表出错导致业务异常，但不是万全之策，需要具体的业务中控制REGION_ID在新增时就记录。
			if (objectType.hasProperty(S_REGION_ID) && dsi.get(S_REGION_ID) == null) {
				dsi.initProperty(S_REGION_ID, CmCommonUtil.getDefaultRegionId());
			}
		} else if (dsi.isDeleted()) {
			// 增加对REGION_ID的特殊处理:如果REGION_ID为空，则为了记录历史表能正常记录，暂时使用此方法来屏蔽因为记录历史表出错导致业务异常，但不是万全之策，需要具体的业务中控制REGION_ID在新增时就记录。
			if (objectType.hasProperty(S_REGION_ID) && dsi.get(S_REGION_ID) == null) {
				dsi.initProperty(S_REGION_ID, CmCommonUtil.getDefaultRegionId());
			}
			// 失效时间
			if (objectType.hasProperty(S_EXPIRE_DATE) && !dsi.isPropertyModified(S_EXPIRE_DATE)) {
				dsi.set(S_EXPIRE_DATE, currDatetime);
			}
			// 记录状态
			if (objectType.hasProperty(S_STATE) && !dsi.isPropertyModified(S_STATE)) {
				dsi.set(S_STATE, CmConstants.RecordState.ERASE);
			}
			// 当前业务操作员、创建组织
			if (ServiceManager.getUser() != null) {
				if (objectType.hasProperty(S_OP_ID) && !dsi.isPropertyModified(S_OP_ID)) {
					dsi.set(S_OP_ID, ServiceManager.getUser().getID());
				}
				if (objectType.hasProperty(S_ORG_ID) && !dsi.isPropertyModified(S_ORG_ID)) {
					dsi.set(S_ORG_ID, ServiceManager.getUser().getOrgId());
				}
			}
			// 业务流水号
			if (objectType.hasProperty(S_DONE_CODE) && !dsi.isPropertyModified(S_DONE_CODE)) {
				dsi.set(S_DONE_CODE, ServiceManager.getDoneCode());
			}
			// 当前业务操作时间
			if (objectType.hasProperty(S_DONE_DATE) && !dsi.isPropertyModified(S_DONE_DATE)) {
				dsi.set(S_DONE_DATE, currDatetime);
			}
		}
	}
}
