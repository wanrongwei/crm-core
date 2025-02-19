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

import java.util.Iterator;
import java.util.Map;

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
import com.asiainfo.crm.cm.inner.club.bo.BOCmClubMemberBean;
import com.asiainfo.crm.cm.inner.club.ivalues.IBOCmClubMemberValue;
import com.asiainfo.crm.cm.inner.util.CmInnerServiceFactory;
import com.asiainfo.crm.cm.model.bo.ClubMemberBean;

public abstract class AbstractClubMemberQueryModelImpl extends AbstractQueryBusiModelImpl implements IQueryCountBusiModel, IQueryDataBusiModel, IMaskBusiModel,
		IQueryDataByIdBusiModel {

	/**   
	 * 构造根据一批客户编号查询俱乐部会员信息查询条件
	 * @Function buildBatchCustIdParam
	 * @Description 
	 *
	 * @param custId
	 * @param clubId
	 * @return
	 * @throws Exception
	 *
	 * @version v1.0.0
	 * @author huzq
	 * @date 2012-7-6 下午9:46:52
	 * 
	 * <strong>Modification History:</strong><br>
	 * Date         Author          Version            Description<br>
	 * ---------------------------------------------------------<br>
	 * 2012-7-6     huzq           v1.0.0               修改原因<br>
	 */
	protected abstract Parameter buildBatchCustIdParam(long[] custId, long clubId) throws Exception;

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
	protected abstract void doAfterQueryById(ClubMemberBean clubMemberValue) throws Exception;

	/**   
	 * 根据俱乐部编号获取对应的查询BOBean的class，由于不同的俱乐部可能存在不同的扩展信息，因此开放此接口便于使用自定的查询BO进行数据的查询。
	 * 
	 * @Function getQueryBOBeanClassByClubId
	 * @Description 
	 *
	 * @param clubId
	 * @return
	 * @throws Exception
	 *
	 * @version v1.0.0
	 * @author huzq
	 * @date 2012-7-6 下午5:35:47
	 * 
	 * <strong>Modification History:</strong><br>
	 * Date         Author          Version            Description<br>
	 * ---------------------------------------------------------<br>
	 * 2012-7-6     huzq           v1.0.0               修改原因<br>
	 */
	protected abstract Class getQueryBOBeanClassByClubId(long clubId) throws Exception;

	/**   
	 * 通过一组客户编码查询会员信息数量
	 * 
	 * @Function queryClubMemberCountByCustIds
	 * @Description 
	 *
	 * @param custId
	 * @param clubId
	 * @return
	 * @throws Exception
	 *
	 * @version v1.0.0
	 * @author huzq
	 * @date 2012-7-6 下午9:57:36
	 * 
	 * <strong>Modification History:</strong><br>
	 * Date         Author          Version            Description<br>
	 * ---------------------------------------------------------<br>
	 * 2012-7-6     huzq           v1.0.0               修改原因<br>
	 */
	public final int queryClubMemberCountByCustIds(long custId[], long clubId) throws Exception {
		Parameter parameter = buildBatchCustIdParam(custId, clubId);
		if (parameter == null) {
			parameter = ParamUtil.buildInParameter(custId, ClubMemberBean.S_CustId);
		}
		if (parameter.getBeanClass() == null) {
			parameter.setBeanClass(BOCmClubMemberBean.class);
		}
		// 避免无条件查询
		ParamUtil.validateParameter(parameter);
		return CmInnerServiceFactory.getCommonInnerSV().getBeanCount(parameter.getBeanClass(), parameter.getCondition(), parameter.getParameter());
	}

	/**
	 * 通过一组客户编码查询会员信息
	 * @param custId
	 * @param startNum
	 * @param endNum
	 * @return
	 * @throws Exception
	 * @version:v1.0.0
	 * @author:liaosc
	 * @date:2012-4-17
	 */
	public final DataContainer[] queryClubMembersByCustIds(long custId[], long clubId, int startNum, int endNum) throws Exception {
		Parameter parameter = buildBatchCustIdParam(custId, clubId);
		if (parameter == null) {
			parameter = ParamUtil.buildInParameter(custId, ClubMemberBean.S_CustId);
		}
		if (parameter.getBeanClass() == null) {
			parameter.setBeanClass(BOCmClubMemberBean.class);
		}
		// 避免无条件查询
		ParamUtil.validateParameter(parameter);
		// 记录业务日志
		CmBusiLogFactory.log(parameter, CmConstants.BusiLogType.CLUB_LOG);
		DataContainerInterface[] boclubMemberValue = CmInnerServiceFactory.getCommonInnerSV().getBeans(parameter.getBeanClass(), parameter.getCondition(),
				parameter.getParameter(), startNum, endNum);
		if (!CmCommonUtil.isNotEmptyObject(boclubMemberValue)) {
			return new ClubMemberBean[0];
		}
		ClubMemberBean[] clubMemberValues = new ClubMemberBean[boclubMemberValue.length];
		for (int i = 0; i < clubMemberValues.length; i++) {
			clubMemberValues[i] = new ClubMemberBean();
			Iterator it = boclubMemberValue[i].getProperties().entrySet().iterator();
			while (it.hasNext()) {
				Map.Entry entry = (Map.Entry) it.next();
				clubMemberValues[i].initProperty(String.valueOf(entry.getKey()), entry.getValue());
			}
			// 模糊化处理
			mask(clubMemberValues[i]);
		}
		return clubMemberValues;
	}

	protected Class getReturnObjectClass() {
		return ClubMemberBean.class;
	}

	protected void saveQueryBusiLog(Parameter parameter) throws Exception {
		// 记录业务日志
		CmBusiLogFactory.log(parameter, CmConstants.BusiLogType.CLUB_LOG);
	}

	public final DataContainerInterface queryDataById(long objectId) throws Exception {
		return queryMemberById(objectId);
	}

	/**
	 * 通过会员编码查询会员信息
	 * @param memberId
	 * @return
	 * @throws Exception
	 * @version:v1.0.0
	 * @author:liaosc
	 * @date:2012-5-5
	 */
	protected DataContainerInterface queryMemberById(long memberId) throws Exception {
		BOCmClubMemberBean bean = new BOCmClubMemberBean();
		bean.setMemberId(memberId);
		IBOCmClubMemberValue bocmClubMemberValue = (IBOCmClubMemberValue) CmInnerServiceFactory.getCommonInnerSV().getBean(bean);
		if (!CmCommonUtil.isNotEmptyObject(bocmClubMemberValue)) {
			return null;
		}
		ClubMemberBean clubMemberValue = new ClubMemberBean();
		clubMemberValue.copy(bocmClubMemberValue);
		doAfterQueryById(clubMemberValue);
		// 模糊化
		mask(clubMemberValue);
		return clubMemberValue;
	}
}
