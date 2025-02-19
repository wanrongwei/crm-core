package com.asiainfo.crm.cm.teaminvoke.out.busimodel.impl.defaults;

import java.sql.Timestamp;
import java.util.Iterator;
import java.util.Map;

import org.apache.commons.lang.StringUtils;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import com.ai.appframe2.bo.DataContainer;
import com.ai.appframe2.bo.DataContainerFactory;
import com.ai.common.i18n.CrmLocaleFactory;
import com.ai.common.util.ExceptionUtil;
import com.ai.common.util.TimeUtil;
import com.asiainfo.crm.cm.common.util.CmCommonUtil;
import com.asiainfo.crm.cm.model.bean.VOAccountBean;
import com.asiainfo.crm.cm.model.bo.AccountBean;
import com.asiainfo.crm.cm.model.bo.AcctBillCustomizeBean;
import com.asiainfo.crm.cm.model.bo.AcctBillCycleBean;
import com.asiainfo.crm.cm.model.bo.AcctPaymentBean;
import com.asiainfo.crm.cm.model.ivalues.IAccountValue;
import com.asiainfo.crm.cm.model.ivalues.IAcctBillCustomizeValue;
import com.asiainfo.crm.cm.model.ivalues.IAcctBillCycleValue;
import com.asiainfo.crm.cm.model.ivalues.IAcctPaymentValue;
import com.asiainfo.crm.cm.model.ivalues.IVOAccountValue;
import com.asiainfo.crm.cm.teaminvoke.out.busimodel.IConvertBusiModel;
import com.asiainfo.crm.cm.teaminvoke.out.busimodel.impl.AbstractVOAccountCvtBusiModelImpl;

public class DefaultVOAccountCvtBusiModelImpl extends AbstractVOAccountCvtBusiModelImpl implements IConvertBusiModel {

	private static transient Log log = LogFactory.getLog(DefaultVOAccountCvtBusiModelImpl.class);

	public Object convert(Map parameter) throws Exception {
		if (!CmCommonUtil.isNotEmptyObject(parameter)) {
			if (log.isErrorEnabled()) {
				log.error(CrmLocaleFactory.getResource("CMS0022001", CrmLocaleFactory.getResource("CMS0021008")));
			}
			ExceptionUtil.throwBusinessException("CMS0022001", CrmLocaleFactory.getResource("CMS0021008"));
		}
		// 账户大对象
		IVOAccountValue acctValue = new VOAccountBean();
		Iterator it = parameter.entrySet().iterator();
		while (it.hasNext()) {
			Map.Entry entry = (Map.Entry) it.next();
			if ("cmAcctFrmAccount".equalsIgnoreCase(entry.getKey().toString())) {
				IAccountValue accountValue = new AccountBean();
				if (parameter.get("cmAcctFrmAccount").getClass().isArray()) {
					DataContainerFactory.transfer(((DataContainer[]) parameter.get("cmAcctFrmAccount"))[0], accountValue);
				} else {
					DataContainerFactory.transfer((DataContainer) parameter.get("cmAcctFrmAccount"), accountValue);
				}

				if (log.isDebugEnabled()) {
					log.debug("\naccountValue oldProperties:" + accountValue.getOldProperties() + "\n");
					log.debug("\naccountValue newProperties:" + accountValue.getNewProperties() + "\n");
				}
				/*
				 * if(accountValue.getAcctId() > 0){ accountValue.setStsToOld();
				 * accountValue.setAcctId(accountValue.getAcctId()); }
				 */
				acctValue.setAccount(accountValue);
				// 账户支付方案信息
				IAcctPaymentValue acctPaymentValue = new AcctPaymentBean();
				if (parameter.get("cmAcctFrmAccount").getClass().isArray()) {
					DataContainerFactory.transfer(((DataContainer[]) parameter.get("cmAcctFrmAccount"))[0], acctPaymentValue);
				} else {
					DataContainerFactory.transfer((DataContainer) parameter.get("cmAcctFrmAccount"), acctPaymentValue);
				}
				if (log.isDebugEnabled()) {
					log.debug("\nacctPaymentValue oldProperties:" + acctPaymentValue.getOldProperties() + "\n");
					log.debug("\nacctPaymentValue newProperties:" + acctPaymentValue.getNewProperties() + "\n");
				}
				// 增加银行代表号码维护
				if (parameter.get("cmAcctFrmAccount").getClass().isArray()) {
					acctPaymentValue.setExtAttr("BANK_BEHALF_PHONE", (((DataContainer[]) parameter.get("cmAcctFrmAccount"))[0]).getExtAttr("BANK_BEHALF_PHONE"));
				} else {
					acctPaymentValue.setExtAttr("BANK_BEHALF_PHONE", ((DataContainer) parameter.get("cmAcctFrmAccount")).getExtAttr("BANK_BEHALF_PHONE"));
				}

				acctValue.addPayment(acctPaymentValue);
				/*
				 * // 账户账期信息 IAcctBillCycleValue billCycleValue = new AcctBillCycleBean();
				 * DataContainerFactory.transfer((DataContainer) parameter.get("cmAcctFrmAccount"), billCycleValue);
				 * acctValue.setBillCycle(billCycleValue); // 账户扩展信息 Class[] cmCfgClasses =new
				 * Class[]{BOCmGroupContAttrBean.class,BOCmGroupCustAttrBean.class,BOCmAccountAttrBean.class};
				 * DataContainerInterface[] attrValues = CmCommonUtil.getAttrValuesFromDC((DataContainer)
				 * parameter.get("cmAcctFrmAccount"), cmCfgClasses); if(CmCommonUtil.isNotEmptyObject(attrValues)) {
				 * acctValue.addAttrValues(attrValues); }
				 */
			}
			// 账户个性化账单信息
			else if ("cmAcctFrmCustomize".equalsIgnoreCase(entry.getKey().toString())) {
				IAcctBillCustomizeValue billCustomizeValue = new AcctBillCustomizeBean();
				if (parameter.get("cmAcctFrmCustomize").getClass().isArray()) {
					DataContainerFactory.transfer(((DataContainer[]) parameter.get("cmAcctFrmCustomize"))[0], billCustomizeValue);
				} else {
					DataContainerFactory.transfer((DataContainer) parameter.get("cmAcctFrmCustomize"), billCustomizeValue);
				}

				acctValue.addBillCustomize(billCustomizeValue);
			}
			// 账户账期信息
			else if ("cmAcctFrmBillCycle".equalsIgnoreCase(entry.getKey().toString())) {
				// 账户账期信息
				IAcctBillCycleValue billCycleValue = new AcctBillCycleBean();
				if (parameter.get("cmAcctFrmBillCycle").getClass().isArray()) {
					DataContainerFactory.transfer(((DataContainer[]) parameter.get("cmAcctFrmBillCycle"))[0], billCycleValue);
				} else {
					DataContainerFactory.transfer((DataContainer) parameter.get("cmAcctFrmBillCycle"), billCycleValue);
					DataContainer dc = (DataContainer) parameter.get("cmAcctFrmBillCycle");
					String effTime = dc.getAsString("EFFECTIVE_DATE");
					Timestamp effDate = null;
					if (StringUtils.isNotBlank(effTime)) {
						if (effTime.length() == 10) {
							effDate = TimeUtil.getTimstampByString(effTime,"yyyy-MM-dd");
						} else {
							effDate = dc.getAsDateTime("EFFECTIVE_DATE");
						}
					}else{
						effDate = com.ai.omframe.util.TimeUtil.getDefaultSysDate();
					}
					billCycleValue.setEffectiveDate(effDate);
				}
				//如果账期cycle_type没有值默认塞个‘月’
				if(billCycleValue.getCycleType()<=0){
					billCycleValue.setCycleType(5);
				}
				acctValue.setBillCycle(billCycleValue);

			}
			// 其他情况直接将其放在用户对象中
			else {
				DataContainer dc = (DataContainer) entry.getValue();
				acctValue.setUserObject(entry.getKey(), dc);
			}
		}
		return acctValue;
	}
}
