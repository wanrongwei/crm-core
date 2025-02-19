package com.asiainfo.crm.cm.busimodel.impl.defaults;

import java.util.ArrayList;
import java.util.List;

import com.asiainfo.crm.cm.busimodel.ICmBusiLogCreator;
import com.asiainfo.crm.cm.busimodel.impl.log.AbstractBusiLogCreatorImpl;
import com.asiainfo.crm.cm.common.CmConstants;
import com.asiainfo.crm.cm.common.util.CmCommonUtil;
import com.asiainfo.crm.cm.model.ivalues.ICmBusiLogValue;
import com.asiainfo.crm.cm.model.ivalues.IValueObject;
import com.asiainfo.crm.cm.model.ivalues.IPartyContactValue;
import com.asiainfo.crm.cm.model.ivalues.IPartyRoleValue;
import com.asiainfo.crm.cm.model.ivalues.IPartyValue;
import com.asiainfo.crm.cm.model.ivalues.IVOPartyValue;

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
public class CmPartyBusiLogCreatorImpl extends AbstractBusiLogCreatorImpl implements ICmBusiLogCreator {

	protected int getBusiLogType() {
		return CmConstants.BusiLogType.PARTY_LOG;
	}

	protected ICmBusiLogValue[] createBusiLogDetails(IValueObject valueObject, ICmBusiLogValue mainBusiLogValue) throws Exception {
		List<ICmBusiLogValue> busiLogValues = new ArrayList<ICmBusiLogValue>();
		IVOPartyValue partyValue = (IVOPartyValue) valueObject;
		// 生成参与人基本信息业务日志
		createPartyBusiLog(busiLogValues, mainBusiLogValue, partyValue);
		// 返回结果
		return busiLogValues.toArray(new ICmBusiLogValue[0]);
	}

	/**   
	 * 生成参与人基本信息业务日志
	 * 
	 * @Function createPartyBusiLog
	 * @Description 
	 *
	 * @param busiLogValues
	 * @param mainBusiLogValue
	 * @param partyValue
	 *
	 * @version v1.0.0
	 * @author huzq
	 * @throws Exception 
	 * @date 2012-7-17 下午3:10:10
	 * 
	 * <strong>Modification History:</strong><br>
	 * Date         Author          Version            Description<br>
	 * ---------------------------------------------------------<br>
	 * 2012-7-17     huzq           v1.0.0               修改原因<br>
	 */
	protected void createPartyBusiLog(List<ICmBusiLogValue> busiLogValues, ICmBusiLogValue mainBusiLogValue, IVOPartyValue partyValue) throws Exception {
		IPartyValue value = partyValue.getParty();
		if (CmCommonUtil.isNotEmptyObject(value)) {
			ICmBusiLogValue busiLogValue = createBusiLogFromDC(value, mainBusiLogValue, value.getPartyId());
			if (CmCommonUtil.isNotEmptyObject(busiLogValue)) {
				busiLogValues.add(busiLogValue);
			}
		}
	}

	/**   
	 * 生成参与人联系信息业务日志
	 * 
	 * @Function createPartyContactBusiLog
	 * @Description 
	 *
	 * @param busiLogValues
	 * @param mainBusiLogValue
	 * @param partyValue
	 * @throws Exception
	 *
	 * @version v1.0.0
	 * @author huzq
	 * @date 2012-7-17 下午3:15:36
	 * 
	 * <strong>Modification History:</strong><br>
	 * Date         Author          Version            Description<br>
	 * ---------------------------------------------------------<br>
	 * 2012-7-17     huzq           v1.0.0               修改原因<br>
	 */
	protected void createPartyContactBusiLog(List<ICmBusiLogValue> busiLogValues, ICmBusiLogValue mainBusiLogValue, IVOPartyValue partyValue) throws Exception {
		if (partyValue.hasPartyContacts()) {
			IPartyContactValue[] partyContactValues = partyValue.getPartyContacts();
			for (IPartyContactValue contactValue : partyContactValues) {
				ICmBusiLogValue busiLogValue = createBusiLogFromDC(contactValue, mainBusiLogValue, contactValue.getPartyId());
				if (CmCommonUtil.isNotEmptyObject(busiLogValue)) {
					busiLogValues.add(busiLogValue);
				}
			}
		}
	}

	/**   
	 * 生成参与人角色业务日志
	 * 
	 * @Function createPartyRoleBusiLog
	 * @Description 
	 *
	 * @param busiLogValues
	 * @param mainBusiLogValue
	 * @param partyValue
	 * @throws Exception
	 *
	 * @version v1.0.0
	 * @author huzq
	 * @date 2012-7-17 下午3:23:28
	 * 
	 * <strong>Modification History:</strong><br>
	 * Date         Author          Version            Description<br>
	 * ---------------------------------------------------------<br>
	 * 2012-7-17     huzq           v1.0.0               修改原因<br>
	 */
	protected void createPartyRoleBusiLog(List<ICmBusiLogValue> busiLogValues, ICmBusiLogValue mainBusiLogValue, IVOPartyValue partyValue) throws Exception {
		if (partyValue.hasPartyRoles()) {
			IPartyRoleValue[] partyRoleValues = partyValue.getPartyRoles();
			for (IPartyRoleValue roleValue : partyRoleValues) {
				ICmBusiLogValue busiLogValue = createBusiLogFromDC(roleValue, mainBusiLogValue, roleValue.getPartyId());
				if (CmCommonUtil.isNotEmptyObject(busiLogValue)) {
					busiLogValues.add(busiLogValue);
				}
			}
		}
	}

}
