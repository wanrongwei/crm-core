package com.asiainfo.crm.cm.busimodel.impl.club;

import org.apache.commons.lang.StringUtils;

import com.ai.appframe2.common.DataContainerInterface;
import com.ai.appframe2.common.ServiceManager;
import com.ai.common.i18n.CrmLocaleFactory;
import com.asiainfo.crm.cm.busimodel.IDealBusiModel;
import com.asiainfo.crm.cm.busimodel.impl.common.AbstractDealBusiModelImpl;
import com.asiainfo.crm.cm.common.CmConstants;
import com.asiainfo.crm.cm.common.util.CmCommonUtil;
import com.asiainfo.crm.cm.inner.club.bo.BOCmClubBean;
import com.asiainfo.crm.cm.inner.club.ivalues.IBOCmClubValue;
import com.asiainfo.crm.cm.inner.util.CmInnerServiceFactory;
import com.asiainfo.crm.cm.model.bean.CmDealReturnDataBean;
import com.asiainfo.crm.cm.model.ivalues.IClubValue;
import com.asiainfo.crm.cm.model.ivalues.ICmDealReturnData;
import com.asiainfo.crm.cm.model.ivalues.IVOClubMemberValue;
import com.asiainfo.crm.cm.model.ivalues.IValueObject;

/**
 * 
 * @Copyright Copyright (c) 2012 Asiainfo-Linkage
 * 
 * @ClassName AbstractClubActionDealModelImpl
 * @Description 俱乐部业务逻辑实现
 *
 * @version v1.0.0
 * @author zhangyin3
 * @Email zhangyin3@asiainfo-linkage.com
 * @company AsiaInfo
 * @date Jan 11, 2012 10:48:04 AM
 * <br>
 * Modification History:<br>
 * Date         Author          Version            Description<br>
 * ---------------------------------------------------------*<br>
 * Jan 11, 2012     zhangyin3           v1.0.0               修改原因<br>
 */
public abstract class AbstractClubDealModelImpl extends AbstractDealBusiModelImpl implements IDealBusiModel {

	public final ICmDealReturnData deal(IValueObject valueObject) throws Exception {
		IVOClubMemberValue clubMemberValue = (IVOClubMemberValue) valueObject;
		
		preposeExtThings(clubMemberValue);

		saveClub(clubMemberValue);

		doOtherThings(clubMemberValue);

		ICmDealReturnData returnData = new CmDealReturnDataBean();
		returnData.setIsSuccess("Y");
		// 俱乐部信息保存成功！
		returnData.setSuccessMsg(CrmLocaleFactory.getResource("CMS0020169"));
		return returnData;
	}

	/**   
	 * @Function saveClub
	 * @Description 保存俱乐部信息
	 *
	 * @param clubMemberValue
	 * @throws Exception
	 *
	 * @version v1.0.0
	 * @author zhangyin
	 * @date 2012-1-11 下午05:39:40
	 * 
	 * <strong>Modification History:</strong><br>
	 * Date         Author          Version            Description<br>
	 * ---------------------------------------------------------<br>
	 * 2012-1-11     zhangyin           v1.0.0               修改原因<br>
	 */
	private void saveClub(IVOClubMemberValue clubMemberValue) throws Exception {
		// int[] args = { CmConstants.ValidateClubMemberData.CLUB };
		// ValidateData.validateClubMemberData(clubMemberValue, args);
		IClubValue clubValue = clubMemberValue.getClub();
		IBOCmClubValue cmClubValue = new BOCmClubBean();
		cmClubValue.copy(clubValue);
		//CmClubBusiRule.validateClubFilled(cmClubValue);
		if (clubValue.isNew()) {
			if (cmClubValue.getClubId() <= 0) {
				cmClubValue.setClubId(CmCommonUtil.getNewSequence(BOCmClubBean.class));
			}
			if (StringUtils.isBlank(cmClubValue.getState())) {
				cmClubValue.setState(CmConstants.RecordState.USE);
			}
		} else if (clubValue.isDeleted()) {
			cmClubValue.setExpireDate(CmCommonUtil.getSysDate());
		}
		if (cmClubValue.isNew()) {
			if (ServiceManager.getUser() != null) {
				cmClubValue.setCreateOpId(ServiceManager.getUser().getID());
				cmClubValue.setCreateOrgId(ServiceManager.getUser().getOrgId());
			}
		}
		extBeforeSave(clubMemberValue);
		CmInnerServiceFactory.getCommonInnerSV().saveBean((DataContainerInterface) cmClubValue);
	}

	/**   
	 * @Function preposeExtThings
	 * @Description 前置的扩展方法，支持在处理基础版本的业务逻辑之前扩展本地业务逻辑
	 *
	 * @param clubMemberValue
	 *
	 * @version v1.0.0
	 * @author zhangyin
	 * @date 2012-1-11 下午05:47:10
	 * 
	 * <strong>Modification History:</strong><br>
	 * Date         Author          Version            Description<br>
	 * ---------------------------------------------------------<br>
	 * 2012-1-11     zhangyin           v1.0.0               修改原因<br>
	 */
	protected void preposeExtThings(IVOClubMemberValue clubMemberValue) {
	}

	/**   
	 * @Function doOtherThings
	 * @Description 提供外围扩展的处理方法
	 *
	 * @param clubMemberValue
	 * @throws Exception
	 *
	 * @version v1.0.0
	 * @author zhangyin
	 * @date 2012-1-11 下午05:47:17
	 * 
	 * <strong>Modification History:</strong><br>
	 * Date         Author          Version            Description<br>
	 * ---------------------------------------------------------<br>
	 * 2012-1-11     zhangyin           v1.0.0               修改原因<br>
	 */
	protected void doOtherThings(IVOClubMemberValue clubMemberValue) throws Exception {
	}

	/**   
	 * @Function extBeforeSave
	 * @Description 在核心版本保存对象前，提供扩展地市个性化校验或者赋值等操作，主键已经生成，可以直接获取
	 *
	 * @param clubMemberValue
	 * @throws Exception
	 *
	 * @version v1.0.0
	 * @author zhangyin
	 * @date 2012-1-11 下午05:47:26
	 * 
	 * <strong>Modification History:</strong><br>
	 * Date         Author          Version            Description<br>
	 * ---------------------------------------------------------<br>
	 * 2012-1-11     zhangyin           v1.0.0               修改原因<br>
	 */
	protected void extBeforeSave(IVOClubMemberValue clubMemberValue) throws Exception {
	}
}
