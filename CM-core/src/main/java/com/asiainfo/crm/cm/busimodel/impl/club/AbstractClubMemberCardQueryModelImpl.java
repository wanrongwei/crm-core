/**
 * Copyright: Copyright (c) 2012 Asiainfo-Linkage
 * 
 * @ClassName: AbstractClubMemberQueryModelImpl.java
 * @Description: 该类的功能描述
 * 
 * @version: v1.0.0
 * @author: LSC
 * @date: 2012-4-7 下午2:31:27
 * 
 *        Modification History:
 *        Date Author Version Description
 *        ---------------------------------------------------------*
 *        2012-4-7 LSC v1.0.0 修改原因
 */

package com.asiainfo.crm.cm.busimodel.impl.club;

import com.ai.appframe2.bo.DataContainer;
import com.ai.appframe2.common.DataContainerInterface;
import com.asiainfo.crm.cm.busimodel.IMaskBusiModel;
import com.asiainfo.crm.cm.busimodel.IQueryCountBusiModel;
import com.asiainfo.crm.cm.busimodel.IQueryDataBusiModel;
import com.asiainfo.crm.cm.busimodel.IQueryDataByIdBusiModel;
import com.asiainfo.crm.cm.busimodel.common.ParamUtil;
import com.asiainfo.crm.cm.busimodel.common.Parameter;
import com.asiainfo.crm.cm.busimodel.impl.common.AbstractQueryBusiModelImpl;
import com.asiainfo.crm.cm.common.CmConstants;
import com.asiainfo.crm.cm.common.util.CmBusiLogFactory;
import com.asiainfo.crm.cm.common.util.CmCommonUtil;
import com.asiainfo.crm.cm.inner.club.bo.BOCmClubMemberCardBean;
import com.asiainfo.crm.cm.inner.util.CmInnerServiceFactory;
import com.asiainfo.crm.cm.model.bo.ClubMemberCardBean;

public abstract class AbstractClubMemberCardQueryModelImpl extends AbstractQueryBusiModelImpl implements IQueryCountBusiModel, IQueryDataBusiModel, IMaskBusiModel,
		IQueryDataByIdBusiModel {

	/**   
	 * 构造根据一组俱乐部会员编号查询会员卡信息的批量查询条件
	 * 
	 * @Function buildBatchMemberIdParam
	 * @Description 
	 *
	 * @param memberIds
	 * @param clubId
	 * @param isOnlyValidated
	 * @param sMemberid
	 * @return
	 * @throws Exception
	 *
	 * @version v1.0.0
	 * @author huzq
	 * @date 2012-7-6 下午9:23:51
	 * 
	 * <strong>Modification History:</strong><br>
	 * Date         Author          Version            Description<br>
	 * ---------------------------------------------------------<br>
	 * 2012-7-6     huzq           v1.0.0               修改原因<br>
	 */
	protected abstract Parameter buildBatchMemberIdParam(long[] memberIds, long clubId, boolean isOnlyValidated, String sMemberid) throws Exception;

	/**   
	 * 查询出俱乐部会员基本信息之后的处理<br>
	 * 如查询俱乐部会员扩展信息，然后封装到俱乐部会员信息中.
	 * 目前已实现查询会员卡信息、客户经理信息等。
	 * @Function doAfterQueryMemberById
	 * @Description 
	 *
	 * @param clubMemberValue
	 * @throws Exception
	 *
	 * @version v1.0.0
	 * @author huzq
	 * @date 2012-7-6 下午8:55:23
	 * 
	 * <strong>Modification History:</strong><br>
	 * Date         Author          Version            Description<br>
	 * ---------------------------------------------------------<br>
	 * 2012-7-6     huzq           v1.0.0               修改原因<br>
	 */
	protected abstract void doAfterQueryById(ClubMemberCardBean clubMemberValue) throws Exception;

	/**   
	 * 获取查询俱乐部会员卡信息的查询BOBean的class
	 * @Function getQueryBOBeanClass
	 * @Description 
	 *
	 * @param clubId
	 * @return
	 * @throws Exception
	 *
	 * @version v1.0.0
	 * @author huzq
	 * @date 2012-7-7 下午4:27:52
	 * 
	 * <strong>Modification History:</strong><br>
	 * Date         Author          Version            Description<br>
	 * ---------------------------------------------------------<br>
	 * 2012-7-7     huzq           v1.0.0               修改原因<br>
	 */
	protected abstract Class getQueryBOBeanClass(long clubId) throws Exception;

	/**   
	 * 根据成员编号批量查询俱乐部会员卡信息
	 * @Function queryClubMemberCardCountByMemberIds
	 * @Description 
	 *
	 * @param memberIds
	 * @param clubId
	 * @param isOnlyValidated
	 * @return
	 * @throws Exception
	 *
	 * @version v1.0.0
	 * @author huzq
	 * @date 2012-7-6 下午9:30:51
	 * 
	 * <strong>Modification History:</strong><br>
	 * Date         Author          Version            Description<br>
	 * ---------------------------------------------------------<br>
	 * 2012-7-6     huzq           v1.0.0               修改原因<br>
	 */
	public final int queryClubMemberCardCountByMemberIds(long memberIds[], long clubId, boolean isOnlyValidated) throws Exception {
		Parameter parameter = buildBatchMemberIdParam(memberIds, clubId, isOnlyValidated, BOCmClubMemberCardBean.S_MemberId);
		if (parameter == null) {
			parameter = ParamUtil.buildInParameter(memberIds, BOCmClubMemberCardBean.S_MemberId);
		}
		if (parameter.getBeanClass() == null) {
			parameter.setBeanClass(BOCmClubMemberCardBean.class);
		}
		return CmInnerServiceFactory.getCommonInnerSV().getBeanCount(parameter.getBeanClass(), parameter.getCondition(), parameter.getParameter());
	}

	/**
	 * 通过一组会员编码数组批量查询会员卡
	 * @param memberIds
	 * @param clubId
	 * @param isOnlyValidated 是否查询当前有效的记录
	 * @param startNum
	 * @param endNum
	 * @return
	 * @throws Exception
	 * @version:v1.0.0
	 * @author:liaosc
	 * @date:2012-4-17
	 */
	public final DataContainer[] queryClubMemberCardsByMemberIds(long memberIds[], long clubId, boolean isOnlyValidated, int startNum, int endNum) throws Exception {
		Parameter parameter = buildBatchMemberIdParam(memberIds, clubId, isOnlyValidated, BOCmClubMemberCardBean.S_MemberId);
		if (parameter == null) {
			parameter = ParamUtil.buildInParameter(memberIds, BOCmClubMemberCardBean.S_MemberId);
		}
		if (parameter.getBeanClass() == null) {
			parameter.setBeanClass(BOCmClubMemberCardBean.class);
		}
		DataContainerInterface[] boclubMemberCardValue = CmInnerServiceFactory.getCommonInnerSV().getBeans(parameter.getBeanClass(), parameter.getCondition(),
				parameter.getParameter(), startNum, endNum);
		if (!CmCommonUtil.isNotEmptyObject(boclubMemberCardValue)) {
			return new ClubMemberCardBean[0];
		}
		ClubMemberCardBean[] clubMemberCardValue = new ClubMemberCardBean[boclubMemberCardValue.length];
		for (int i = 0; i < clubMemberCardValue.length; i++) {
			clubMemberCardValue[i] = new ClubMemberCardBean();
			clubMemberCardValue[i].copy(boclubMemberCardValue[i]);
		}
		return clubMemberCardValue;
	}

	protected Class getReturnObjectClass() {
		return ClubMemberCardBean.class;
	}
	
	protected void saveQueryBusiLog(Parameter parameter) throws Exception {
		// 记录业务日志
		CmBusiLogFactory.log(parameter, CmConstants.BusiLogType.CLUB_LOG);
	}

	public final DataContainerInterface queryDataById(long objectId) throws Exception {
		return queryMemberCardById(objectId);
	}

	/**
	 * 通过会员编码查询会员信息
	 * @param recordId
	 * @return
	 * @throws Exception
	 * @version:v1.0.0
	 * @author:liaosc
	 * @date:2012-5-5
	 */
	protected DataContainerInterface queryMemberCardById(long recordId) throws Exception {
		BOCmClubMemberCardBean bean = new BOCmClubMemberCardBean();
		bean.setRecordId(recordId);
		DataContainerInterface bocmClubMemberValue = CmInnerServiceFactory.getCommonInnerSV().getBean(bean);
		if (!CmCommonUtil.isNotEmptyObject(bocmClubMemberValue)) {
			return null;
		}
		ClubMemberCardBean clubMemberValue = new ClubMemberCardBean();
		clubMemberValue.copy(bocmClubMemberValue);
		doAfterQueryById(clubMemberValue);
		// 模糊化
		mask(clubMemberValue);
		return clubMemberValue;
	}

}
