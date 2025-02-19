package com.asiainfo.crm.cm.busimodel.impl.defaults;

import java.util.ArrayList;
import java.util.List;

import com.asiainfo.crm.cm.busimodel.ICmBusiLogCreator;
import com.asiainfo.crm.cm.busimodel.impl.log.AbstractBusiLogCreatorImpl;
import com.asiainfo.crm.cm.common.CmConstants;
import com.asiainfo.crm.cm.common.util.CmCommonUtil;
import com.asiainfo.crm.cm.model.ivalues.IClubMemberCardValue;
import com.asiainfo.crm.cm.model.ivalues.IClubMemberValue;
import com.asiainfo.crm.cm.model.ivalues.IClubServiceAdjustValue;
import com.asiainfo.crm.cm.model.ivalues.ICmBusiLogValue;
import com.asiainfo.crm.cm.model.ivalues.IValueObject;
import com.asiainfo.crm.cm.model.ivalues.IVOClubMemberValue;

/** 
 * @Copyright Copyright (c) 2012 Asiainfo-Linkage
 * @ClassName 
 * @Description 该类的功能描述
 * @version v1.0.0
 * @author huzq
 * @date 2012-7-16 下午1:16:09
 * <br>
 * Modification History:<br>
 * Date         Author          Version            Description<br>
 * ---------------------------------------------------------*<br>
 * 2012-7-16     huzq           v1.0.0               修改原因<br>
 */
public class CmClubMemberBusiLogCreatorImpl extends AbstractBusiLogCreatorImpl implements ICmBusiLogCreator {

	protected int getBusiLogType() {
		return CmConstants.BusiLogType.CLUB_LOG;
	}

	protected ICmBusiLogValue[] createBusiLogDetails(IValueObject valueObject, ICmBusiLogValue mainBusiLogValue) throws Exception {
		List<ICmBusiLogValue> busiLogValues = new ArrayList<ICmBusiLogValue>();
		IVOClubMemberValue clubMemberValue = (IVOClubMemberValue) valueObject;
		// 生成俱乐部会员基本信息业务日志
		createMemberBusiLog(busiLogValues, mainBusiLogValue, clubMemberValue);
		// 生成俱乐部会员卡信息业务日志
		createMemberCardBusiLog(busiLogValues, mainBusiLogValue, clubMemberValue);
		// 生成俱乐部服务调整 的业务日志
		createServiceAdjustBusiLog(busiLogValues, mainBusiLogValue, clubMemberValue);
		// 返回结果
		return busiLogValues.toArray(new ICmBusiLogValue[0]);
	}

	/**   
	 * 生成俱乐部会员卡信息业务日志
	 * 
	 * @Function createMemberCardBusiLog
	 * @Description 
	 *
	 * @param busiLogValues
	 * @param mainBusiLogValue
	 * @param clubMemberValue
	 *
	 * @version v1.0.0
	 * @author huzq
	 * @throws Exception 
	 * @date 2012-7-17 下午1:55:08
	 * 
	 * <strong>Modification History:</strong><br>
	 * Date         Author          Version            Description<br>
	 * ---------------------------------------------------------<br>
	 * 2012-7-17     huzq           v1.0.0               修改原因<br>
	 */
	protected void createMemberCardBusiLog(List<ICmBusiLogValue> busiLogValues, ICmBusiLogValue mainBusiLogValue, IVOClubMemberValue clubMemberValue) throws Exception {
		if (clubMemberValue.hasMemberCards()) {
			IClubMemberCardValue[] memberCardValues = clubMemberValue.getClubMemberCards();
			for (IClubMemberCardValue memberCardValue : memberCardValues) {
				ICmBusiLogValue busiLogValue = createBusiLogFromDC(memberCardValue, mainBusiLogValue, memberCardValue.getMemberId());
				if (CmCommonUtil.isNotEmptyObject(busiLogValue)) {
					busiLogValues.add(busiLogValue);
				}
			}
		}
	}

	/**   
	 * 生成俱乐部会员基本信息业务日志
	 * 
	 * @Function createMemberBusiLog
	 * @Description 
	 *
	 * @param busiLogValues
	 * @param mainBusiLogValue
	 * @param clubMemberValue
	 * @throws Exception
	 *
	 * @version v1.0.0
	 * @author huzq
	 * @date 2012-7-17 下午1:54:52
	 * 
	 * <strong>Modification History:</strong><br>
	 * Date         Author          Version            Description<br>
	 * ---------------------------------------------------------<br>
	 * 2012-7-17     huzq           v1.0.0               修改原因<br>
	 */
	protected void createMemberBusiLog(List<ICmBusiLogValue> busiLogValues, ICmBusiLogValue mainBusiLogValue, IVOClubMemberValue clubMemberValue) throws Exception {
		IClubMemberValue memberValue = clubMemberValue.getClubMember();
		if (CmCommonUtil.isNotEmptyObject(memberValue)) {
			ICmBusiLogValue busiLogValue = createBusiLogFromDC(memberValue, mainBusiLogValue, memberValue.getMemberId());
			if (CmCommonUtil.isNotEmptyObject(busiLogValue)) {
				// 将前台录入的手机号码记录到主业务日志中
				mainBusiLogValue.setBillId(busiLogValue.getBillId());
				busiLogValues.add(busiLogValue);
			}
		}
	}

	/**   
	 * 生成俱乐部服务调整 的业务日志
	 * 
	 * @Function createServiceAdjustBusiLog
	 * @Description 
	 *
	 * @param busiLogValues
	 * @param mainBusiLogValue
	 * @param clubMemberValue
	 * @throws Exception
	 *
	 * @version v1.0.0
	 * @author huzq
	 * @date 2012-7-17 下午2:49:06
	 * 
	 * <strong>Modification History:</strong><br>
	 * Date         Author          Version            Description<br>
	 * ---------------------------------------------------------<br>
	 * 2012-7-17     huzq           v1.0.0               修改原因<br>
	 */
	protected void createServiceAdjustBusiLog(List<ICmBusiLogValue> busiLogValues, ICmBusiLogValue mainBusiLogValue, IVOClubMemberValue clubMemberValue) throws Exception {
		if (clubMemberValue.hasServiceAdjusts()) {
			IClubServiceAdjustValue[] serviceAdjustValues = clubMemberValue.getClubServiceAdjusts();
			for (IClubServiceAdjustValue serviceAdjustValueValue : serviceAdjustValues) {
				ICmBusiLogValue busiLogValue = createBusiLogFromDC(serviceAdjustValueValue, mainBusiLogValue, serviceAdjustValueValue.getMemberId());
				if (CmCommonUtil.isNotEmptyObject(busiLogValue)) {
					busiLogValues.add(busiLogValue);
				}
			}
		}
	}

}
