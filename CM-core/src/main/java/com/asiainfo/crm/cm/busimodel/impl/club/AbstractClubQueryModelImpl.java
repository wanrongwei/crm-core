/**
 * 
 */
package com.asiainfo.crm.cm.busimodel.impl.club;

import java.util.Map;

import com.ai.appframe2.bo.DataContainer;
import com.asiainfo.crm.cm.busimodel.IQueryCountBusiModel;
import com.asiainfo.crm.cm.busimodel.IQueryDataBusiModel;
import com.asiainfo.crm.cm.busimodel.common.ParamUtil;
import com.asiainfo.crm.cm.busimodel.common.Parameter;
import com.asiainfo.crm.cm.busimodel.impl.common.AbstractQueryBusiModelImpl;
import com.asiainfo.crm.cm.common.CmConstants;
import com.asiainfo.crm.cm.common.util.CmCommonUtil;
import com.asiainfo.crm.cm.inner.club.bo.BOCmClubBean;
import com.asiainfo.crm.cm.inner.club.ivalues.IBOCmClubValue;
import com.asiainfo.crm.cm.inner.util.CmInnerServiceFactory;
import com.asiainfo.crm.cm.model.bo.ClubBean;
import com.asiainfo.crm.cm.model.ivalues.IClubValue;

/**   
 * @Copyright Copyright (c) 2012 Asiainfo-Linkage
 * 
 * @ClassName 
 * @Description 该类的功能描述
 *
 * @version v1.0.0
 * @author huzq2
 * @date 2012-2-17 下午5:24:02
 * <br>
 * Modification History:<br>
 * Date         Author          Version            Description<br>
 * ---------------------------------------------------------*<br>
 * 2012-2-17     huzq2           v1.0.0               修改原因<br>
 */
public abstract class AbstractClubQueryModelImpl extends AbstractQueryBusiModelImpl implements IQueryCountBusiModel, IQueryDataBusiModel {

	protected Class getReturnObjectClass() {
		return ClubBean.class;
	}

	/**
	 * 支持对俱乐部名称的模糊查询
	 * @param conditionDCs
	 * @return
	 * @throws Exception
	 * @Function: illegeQuery
	 * @author: LSC
	 * @date: 2012-4-6 下午3:31:47 
	 *
	 * <strong>Modification history</Strong>
	 * Date          Author         Version        Description
	 * -------------------------------------------------------
	 * 2012-4-6       LSC         v1.0.0               修改原因
	 */
	public final DataContainer[] illegeQuery(DataContainer[] conditionDCs, DataContainer illegeParame, int startNum, int endNum) throws Exception {
		// 构造查询条件
		Parameter parameter = this.buildParameter(conditionDCs);
		Map parameMap = parameter.getParameter();
		StringBuilder conditionStr = new StringBuilder(parameter.getCondition());

		String[] properNames = illegeParame.getPropertyNames();
		for (int i = 0; i < properNames.length; i++) {
			if (illegeParame.get(properNames[i]) != null) {
				conditionStr.append(" AND ").append(properNames[i]).append(" like :").append(properNames[i]).append(" ");
				parameMap.put(properNames[i], "%" + illegeParame.get(properNames[i]) + "%");
			}
		}

		IBOCmClubValue[] boClubValues = (IBOCmClubValue[]) CmInnerServiceFactory.getCommonInnerSV().getBeans(BOCmClubBean.class, conditionStr.toString(), parameMap, startNum,
				endNum);
		if (!CmCommonUtil.isNotEmptyObject(boClubValues)) {
			return new ClubBean[0];
		}
		IClubValue[] clubValues = new ClubBean[boClubValues.length];
		// 数据类型转换
		for (int i = 0; i < clubValues.length; i++) {
			clubValues[i] = new ClubBean();
			clubValues[i].copy(boClubValues[i]);
		}
		return (DataContainer[]) clubValues;
	}

	/**   
	 * @Function buildQueryCondition
	 * @Description 构造俱乐部信息查询条件。该方法可被重写以支持扩展。
	 *
	 * @param conditionDCs 前台传入的查询条件
	 * @return 
	 * @version v1.0.0
	 * @author huzq2
	 * @throws Exception 
	 * @date 2012-2-20 下午2:56:16
	 * 
	 * <strong>Modification History:</strong><br>
	 * Date         Author          Version            Description<br>
	 * ---------------------------------------------------------<br>
	 * 2012-2-20     huzq2           v1.0.0               修改原因<br>
	 */
	protected Parameter buildParameter(DataContainer[] conditionDCs) throws Exception {
		Parameter parameter = ParamUtil.buildParameter(new DataContainer[] { conditionDCs[0] }, BOCmClubBean.class);
		StringBuilder condition = new StringBuilder();
		condition.append(IBOCmClubValue.S_State).append(" = :state ").append(" AND ").append(parameter.getCondition());
		parameter.setCondition(condition.toString());
		parameter.getParameter().put("state", CmConstants.RecordState.USE);
		return parameter;
	}
}
