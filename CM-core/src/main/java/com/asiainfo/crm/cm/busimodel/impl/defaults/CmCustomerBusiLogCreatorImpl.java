package com.asiainfo.crm.cm.busimodel.impl.defaults;

import java.util.ArrayList;
import java.util.List;

import com.asiainfo.crm.cm.busimodel.ICmBusiLogCreator;
import com.asiainfo.crm.cm.busimodel.impl.log.AbstractBusiLogCreatorImpl;
import com.asiainfo.crm.cm.common.CmConstants;
import com.asiainfo.crm.cm.common.util.CmBusiLogFactory;
import com.asiainfo.crm.cm.common.util.CmCommonUtil;
import com.asiainfo.crm.cm.inner.customer.ivalues.IBOCmCustContactMediumValue;
import com.asiainfo.crm.cm.model.bean.VOAccountBean;
import com.asiainfo.crm.cm.model.ivalues.ICmBusiLogValue;
import com.asiainfo.crm.cm.model.ivalues.IContactValue;
import com.asiainfo.crm.cm.model.ivalues.ICustManagerValue;
import com.asiainfo.crm.cm.model.ivalues.ICustOrganizeValue;
import com.asiainfo.crm.cm.model.ivalues.ICustRelationshipValue;
import com.asiainfo.crm.cm.model.ivalues.ICustomerValue;
import com.asiainfo.crm.cm.model.ivalues.IVOAccountValue;
import com.asiainfo.crm.cm.model.ivalues.IVOBusiLogValue;
import com.asiainfo.crm.cm.model.ivalues.IVOCustAddressValue;
import com.asiainfo.crm.cm.model.ivalues.IVOCustValue;
import com.asiainfo.crm.cm.model.ivalues.IValueObject;

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
public class CmCustomerBusiLogCreatorImpl extends AbstractBusiLogCreatorImpl implements ICmBusiLogCreator {

	protected int getBusiLogType() {
		return CmConstants.BusiLogType.CUSTOMER_LOG;
	}

	/** 
	 * @Function createBusiLogValue
	 * @Description 
	 * @param valueObject
	 * @return
	 * @throws Exception
	 * @version v1.0.0
	 * @author huzq
	 * @param mainBusiLogValue 
	 * @date 2012-7-16 下午1:31:10
	 * <strong>Modification History:</strong><br>
	 * Date         Author          Version            Description<br>
	 * ---------------------------------------------------------<br>
	 * 2012-7-16     huzq           v1.0.0               修改原因<br>
	 */
	protected ICmBusiLogValue[] createBusiLogDetails(IValueObject valueObject, ICmBusiLogValue mainBusiLogValue) throws Exception {
		IVOCustValue custValue = (IVOCustValue) valueObject;
		List<ICmBusiLogValue> busiLogValues = new ArrayList<ICmBusiLogValue>();
		// 处理客户信息日志
		createCustomerBusiLog(busiLogValues, mainBusiLogValue, custValue);
		// 客户经理信息日志
		createCustManagerBusiLog(busiLogValues, mainBusiLogValue, custValue);
		// 生成客户联系人业务日志
		createContactBusiLog(busiLogValues, mainBusiLogValue, custValue);
		// 生成客户组织结构业务日志
		createCustOrganizeBusiLog(busiLogValues, mainBusiLogValue, custValue);
		// 生成客户关系业务日志
		createCustRelationshipBusiLog(busiLogValues, mainBusiLogValue, custValue);
		// 生成账户业务日志
		createAccountBusiLog(busiLogValues, mainBusiLogValue, custValue);
		// 生成客户地址业务日志
		createCustAddressBusiLog(busiLogValues, mainBusiLogValue, custValue);
		// 生成客户联系媒介日志
		createContMeidumBusiLog(busiLogValues, mainBusiLogValue, custValue);
		// 生成其他业务日志
		createOtherBusiLog(busiLogValues, mainBusiLogValue, custValue);
		// 返回结果
		return busiLogValues.toArray(new ICmBusiLogValue[0]);
	}

	protected void createCustAddressBusiLog(List<ICmBusiLogValue> busiLogValues, ICmBusiLogValue mainBusiLogValue, IVOCustValue custValue) throws Exception {
		if (custValue.hasCustAddress()) {
			IVOCustAddressValue[] voCustAddressValues = custValue.getCustAddress();
			ICmBusiLogValue busiLogValue = null;
			for (int i = 0; i < voCustAddressValues.length; i++) {
				busiLogValue = createBusiLogFromDC(voCustAddressValues[i].getContMedium(), mainBusiLogValue, voCustAddressValues[i].getContMedium().getCustId());
				if (CmCommonUtil.isNotEmptyObject(busiLogValue)) {
					busiLogValues.add(busiLogValue);
				}
			}
		}
	}

	protected void createContMeidumBusiLog(List<ICmBusiLogValue> busiLogValues, ICmBusiLogValue mainBusiLogValue, IVOCustValue custValue) throws Exception {
		if (custValue.hasCustContMedium()) {
			IBOCmCustContactMediumValue[] custContMedius = custValue.getCustContMedium();
			ICmBusiLogValue busiLogValue = null;
			for (int i = 0; i < custContMedius.length; i++) {
				busiLogValue = createBusiLogFromDC(custContMedius[i], mainBusiLogValue, custContMedius[i].getCustId());
				if (CmCommonUtil.isNotEmptyObject(busiLogValue)) {
					busiLogValues.add(busiLogValue);
				}
			}
		}
	}

	/**   
	 * 生成其他的业务日志
	 * 
	 * @Function createOtherBusiLog
	 * @Description 
	 *
	 * @param busiLogValues
	 * @param mainBusiLogValue
	 * @param custValue
	 *
	 * @version v1.0.0
	 * @author huzq
	 * @date 2012-7-17 下午1:47:59
	 * 
	 * <strong>Modification History:</strong><br>
	 * Date         Author          Version            Description<br>
	 * ---------------------------------------------------------<br>
	 * 2012-7-17     huzq           v1.0.0               修改原因<br>
	 */
	protected void createOtherBusiLog(List<ICmBusiLogValue> busiLogValues, ICmBusiLogValue mainBusiLogValue, IVOCustValue custValue) {
		//创建日志
	}

	/**   
	 * 创建客户对象操作业务日志
	 * @Function createCustomerBusiLog
	 * @Description 
	 *
	 * @param busiLogValues
	 * @param mainBusiLogValue
	 * @param custValue
	 *
	 * @version v1.0.0
	 * @author huzq
	 * @throws Exception 
	 * @date 2012-7-16 下午5:55:09
	 * 
	 * <strong>Modification History:</strong><br>
	 * Date         Author          Version            Description<br>
	 * ---------------------------------------------------------<br>
	 * 2012-7-16     huzq           v1.0.0               修改原因<br>
	 */
	protected void createCustomerBusiLog(List<ICmBusiLogValue> busiLogValues, ICmBusiLogValue mainBusiLogValue, IVOCustValue custValue) throws Exception {
		ICustomerValue customerValue = custValue.getCustomer();
		if (CmCommonUtil.isNotEmptyObject(customerValue)) {
			// 如果对象状态没有改变则不需要记录日志
			ICmBusiLogValue busiLogValue = createBusiLogFromDC(customerValue, mainBusiLogValue, customerValue.getCustId());
			if (CmCommonUtil.isNotEmptyObject(busiLogValue)) {
				busiLogValues.add(busiLogValue);
			}
		}
	}

	/**   
	 * 创建客户经理对象操作业务日志
	 * @Function createCustManagerBusiLog
	 * @Description 
	 *
	 * @param busiLogValues
	 * @param mainBusiLogValue
	 * @param custValue
	 *
	 * @version v1.0.0
	 * @author huzq
	 * @throws Exception 
	 * @date 2012-7-16 下午5:55:43
	 * 
	 * <strong>Modification History:</strong><br>
	 * Date         Author          Version            Description<br>
	 * ---------------------------------------------------------<br>
	 * 2012-7-16     huzq           v1.0.0               修改原因<br>
	 */
	protected void createCustManagerBusiLog(List<ICmBusiLogValue> busiLogValues, ICmBusiLogValue mainBusiLogValue, IVOCustValue custValue) throws Exception {
		// 客户经理信息
		if (custValue.hasCustManagers()) {
			ICustManagerValue[] custManagerValues = custValue.getCustManagers();
			for (ICustManagerValue custManagerValue : custManagerValues) {
				ICmBusiLogValue busiLogValue = createBusiLogFromDC(custManagerValue, mainBusiLogValue, custManagerValue.getCustId());
				if (CmCommonUtil.isNotEmptyObject(busiLogValue)) {
					busiLogValues.add(busiLogValue);
				}
			}
		}
	}

	/**   
	 * 创建联系人操作业务日志
	 * 
	 * @Function createContactBusiLog
	 * @Description 
	 *
	 * @param busiLogValues
	 * @param mainBusiLogValue
	 * @param customerValue
	 *
	 * @version v1.0.0
	 * @author huzq
	 * @throws Exception 
	 * @date 2012-7-16 下午5:56:48
	 * 
	 * <strong>Modification History:</strong><br>
	 * Date         Author          Version            Description<br>
	 * ---------------------------------------------------------<br>
	 * 2012-7-16     huzq           v1.0.0               修改原因<br>
	 */
	protected void createContactBusiLog(List<ICmBusiLogValue> busiLogValues, ICmBusiLogValue mainBusiLogValue, IVOCustValue custValue) throws Exception {
		if (custValue.hasContacts()) {
			IContactValue[] contactValues = custValue.getContacts();
			for (IContactValue contactValue : contactValues) {
				ICmBusiLogValue busiLogValue = createBusiLogFromDC(contactValue, mainBusiLogValue, contactValue.getCustId());
				if (CmCommonUtil.isNotEmptyObject(busiLogValue)) {
					busiLogValues.add(busiLogValue);
				}
			}
		}
	}

	/**   
	 * 创建客户组织结构的业务日志
	 * 
	 * @Function createCustOrganizeBusiLog
	 * @Description 
	 *
	 * @param busiLogValues
	 * @param mainBusiLogValue
	 * @param customerValue
	 *
	 * @version v1.0.0
	 * @author huzq
	 * @throws Exception 
	 * @date 2012-7-16 下午5:58:48
	 * 
	 * <strong>Modification History:</strong><br>
	 * Date         Author          Version            Description<br>
	 * ---------------------------------------------------------<br>
	 * 2012-7-16     huzq           v1.0.0               修改原因<br>
	 */
	protected void createCustOrganizeBusiLog(List<ICmBusiLogValue> busiLogValues, ICmBusiLogValue mainBusiLogValue, IVOCustValue custValue) throws Exception {
		if (custValue.hasCustOrganize()) {
			ICustOrganizeValue[] organizeValues = custValue.getCustOrganizes();
			for (ICustOrganizeValue organizeValue : organizeValues) {
				ICmBusiLogValue busiLogValue = createBusiLogFromDC(organizeValue, mainBusiLogValue, organizeValue.getCustId());
				if (CmCommonUtil.isNotEmptyObject(busiLogValue)) {
					busiLogValues.add(busiLogValue);
				}
			}
		}
	}

	/**   
	 * 创建客户关系操作业务日志
	 * 
	 * @Function createCustRelationshipBusiLog
	 * @Description 
	 *
	 * @param busiLogValues
	 * @param mainBusiLogValue
	 * @param customerValue
	 *
	 * @version v1.0.0
	 * @author huzq
	 * @throws Exception 
	 * @date 2012-7-16 下午7:13:12
	 * 
	 * <strong>Modification History:</strong><br>
	 * Date         Author          Version            Description<br>
	 * ---------------------------------------------------------<br>
	 * 2012-7-16     huzq           v1.0.0               修改原因<br>
	 */
	protected void createCustRelationshipBusiLog(List<ICmBusiLogValue> busiLogValues, ICmBusiLogValue mainBusiLogValue, IVOCustValue custValue) throws Exception {
		if (custValue.hasCustRel()) {
			ICustRelationshipValue[] relationshipValues = custValue.getCustRels();
			for (ICustRelationshipValue relationshipValue : relationshipValues) {
				ICmBusiLogValue busiLogValue = createBusiLogFromDC(relationshipValue, mainBusiLogValue, relationshipValue.getCustId());
				if (CmCommonUtil.isNotEmptyObject(busiLogValue)) {
					busiLogValues.add(busiLogValue);
				}
			}
		}
	}

	/**   
	 * 生成账户的业务日志<br>
	 * 采用循环客户大对象中已关联的所有的账户大对象，调用账户的日志生成器生成账户的业务日志。并将生成的日志添加到日志明细list中。
	 * 
	 * @Function createAccountBusiLog
	 * @Description 
	 *
	 * @param busiLogValues
	 * @param mainBusiLogValue
	 * @param custValue
	 * @throws Exception
	 *
	 * @version v1.0.0
	 * @author huzq
	 * @date 2012-7-17 下午1:15:55
	 * 
	 * <strong>Modification History:</strong><br>
	 * Date         Author          Version            Description<br>
	 * ---------------------------------------------------------<br>
	 * 2012-7-17     huzq           v1.0.0               修改原因<br>
	 */
	protected void createAccountBusiLog(List<ICmBusiLogValue> busiLogValues, ICmBusiLogValue mainBusiLogValue, IVOCustValue custValue) throws Exception {
		if (custValue.hasAccounts()) {
			ICmBusiLogCreator busiLogCreator = CmBusiLogFactory.getBusiLogCreator(VOAccountBean.class.getName());
			if (busiLogCreator != null) {
				IVOAccountValue[] accountValues = custValue.getAccounts();
				for (IVOAccountValue accountValue : accountValues) {
					IVOBusiLogValue logValue = busiLogCreator.createBusiLogValue(accountValue);
					ICmBusiLogValue acctMainBusiLogValue = logValue.getMainBusiLog();
					if (CmCommonUtil.isNotEmptyObject(acctMainBusiLogValue)) {
						acctMainBusiLogValue.setParentLogId(mainBusiLogValue.getBusiLogId());
						busiLogValues.add(acctMainBusiLogValue);
					}
					if (logValue.hasBusiLogDetails()) {
						busiLogValues.addAll(logValue.getBusiLogDetailList());
					}
					// 标记一下已经被记录日志了，避免重复记录
					accountValue.setUserObject("S_HAS_LOGGED", true);
				}
			}
		}
	}

}
