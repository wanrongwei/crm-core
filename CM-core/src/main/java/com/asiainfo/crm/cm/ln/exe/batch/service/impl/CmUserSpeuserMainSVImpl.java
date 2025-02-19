package com.asiainfo.crm.cm.ln.exe.batch.service.impl;

import java.sql.Timestamp;
import java.text.SimpleDateFormat;
import java.util.Map;

import org.apache.commons.lang.StringUtils;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import com.ai.appframe2.complex.center.CenterFactory;
import com.ai.appframe2.service.ServiceFactory;
import com.ai.common.i18n.CrmLocaleFactory;
import com.ai.common.util.CenterUtil;
import com.ai.common.util.ExceptionUtil;
import com.asiainfo.crm.cm.common.CmServiceFactory;
import com.asiainfo.crm.cm.common.ivalues.IBOCmCreditMappingValue;
import com.asiainfo.crm.cm.common.util.CmCommonUtil;
import com.asiainfo.crm.cm.common.util.CmCreditMappingUtil;
import com.asiainfo.crm.cm.customer.speusermain.bo.BOCmUserSpeuserMainBean;
import com.asiainfo.crm.cm.customer.speusermain.ivalues.IBOCmUserSpeuserMainValue;
import com.asiainfo.crm.cm.ln.common.util.CmLnCommonUtil;
import com.asiainfo.crm.cm.ln.common.util.CmLnConstants;
import com.asiainfo.crm.cm.ln.customer.indiv.service.interfaces.ICmLnIndivSV;
import com.asiainfo.crm.cm.ln.exe.batch.service.interfaces.ICmUserSpeuserMainSV;
import com.asiainfo.crm.cm.model.bean.VOAccountBean;
import com.asiainfo.crm.cm.model.bean.VOCustBean;
import com.asiainfo.crm.cm.model.bo.AccountBean;
import com.asiainfo.crm.cm.model.ivalues.IAccountProfileValue;
import com.asiainfo.crm.cm.model.ivalues.IAccountValue;
import com.asiainfo.crm.cm.model.ivalues.IVOAccountValue;
import com.asiainfo.crm.cm.model.ivalues.IVOCustValue;
import com.asiainfo.crm.cm.service.interfaces.ICmAccountSV;
import com.asiainfo.crm.cm.teaminvoke.in.service.interfaces.ICmTeamInvokeSV;
import com.asiainfo.crm.so.common.ivalues.IBOUserInfoValue;

public class CmUserSpeuserMainSVImpl implements ICmUserSpeuserMainSV{
	
	private transient static Log log = LogFactory.getLog(CmUserSpeuserMainSVImpl.class);
	public void importUserSperUserMain(String[] colNames, String[] colValues,Map commonInfo) throws Exception {
		IBOCmUserSpeuserMainValue cmUserSpeuserMainValue=new BOCmUserSpeuserMainBean();
		String billId = "";
		int creatLevel=0;
		SimpleDateFormat df1 = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss"); 
		for (int i = 0; i < colValues.length; i++) {
			if (StringUtils.isBlank(colValues[i])) {
				if ("PHONE_ID".equals(colNames[i])) {
					log.error(CrmLocaleFactory.getResource("CMS5000087")); // 手机号码不能为空！
					ExceptionUtil.throwBusinessException("CMS5000087");
				}
			} else {
				if ("PHONE_ID".equals(colNames[i])) {
					billId = colValues[i];
					cmUserSpeuserMainValue.setPhoneId(Long.valueOf(colValues[i]));
				}else if ("EFFECTIVE_DATE".equals(colNames[i])) {
					if (colValues[i]==null || "".equals(colValues[i])) {
						cmUserSpeuserMainValue.setEffectiveDate(CmLnCommonUtil.getSysDateTime());
					}else {
						cmUserSpeuserMainValue.setEffectiveDate(Timestamp.valueOf(df1.format(df1.parse(colValues[i].toString()+" 00:00:00"))));
					}
				}else if ("EXPIRE_DATE".equals(colNames[i])) {
					if (colValues[i]==null || "".equals(colValues[i])) {
						cmUserSpeuserMainValue.setEffectiveDate(CmLnCommonUtil.getMaxDate());
					}else {
						cmUserSpeuserMainValue.setExpireDate(Timestamp.valueOf(df1.format(df1.parse(colValues[i].toString()+" 59:59:59"))));
					}
				}else if ("CREDIT_LEVEL".equals(colNames[i])) {
					if (colValues[i]==null || "".equals(colValues[i])) {
						cmUserSpeuserMainValue.setCreditLevel(0);
					}else {
						cmUserSpeuserMainValue.setCreditLevel(Long.valueOf(colValues[i]));
						creatLevel=Integer.valueOf(colValues[i]);
					}
				}else if ("REMARKS".equals(colNames[i])) {
					if (colValues[i]!=null && !"".equals(colValues[i])) {
						cmUserSpeuserMainValue.setRemarks(colValues[i]);
					}
				}
			}
		}
		if (creatLevel>65 || creatLevel<50) {
			throw new Exception("Credit rating is not between 50-65, please change the trust level!");
		}
		
		IVOCustValue iCustValue= new VOCustBean();
		//获得用户信息
		ICmTeamInvokeSV teamInvokeSV = (ICmTeamInvokeSV) ServiceFactory.getService(ICmTeamInvokeSV.class);
		 CenterFactory.setCenterInfoByTypeAndValue(CenterUtil.BILL_ID,billId);
		IBOUserInfoValue userValue = teamInvokeSV.queryUserInfoByBillId(billId);
		if (userValue == null) {
			// 根据手机号码[{0}]没有查询到客户信息！
			ExceptionUtil.throwBusinessException("CMS5000088", billId);
		}
		ICmLnIndivSV cmLnIndiv=(ICmLnIndivSV)ServiceFactory.getService(ICmLnIndivSV.class);
		IBOCmUserSpeuserMainValue[] iboCmUserSpeMainValue=cmLnIndiv.queryCmUserSpeuserMainByMobile(userValue.getAcctId(), Long.valueOf(billId));
		if (!CmCommonUtil.isEmptyObject(iboCmUserSpeMainValue)) {
			throw new Exception("The user["+billId+"]has special users!");
			//ExceptionUtil.throwBusinessException("CMS8000045", billId);
			//修改特殊信誉度账户信息
		/*	iboCmUserSpeMainValue[0].isModified();
			iboCmUserSpeMainValue[0].setAcctId(userValue.getAcctId());
			iboCmUserSpeMainValue[0].setRegionId(userValue.getRegionId());
			iboCmUserSpeMainValue[0].setState(CmLnConstants.GroupManagerState.State_U);
			iboCmUserSpeMainValue[0].setCreditLevel(creatLevel);
			iboCmUserSpeMainValue[0].setEffectiveDate(cmUserSpeuserMainValue.getEffectiveDate());
			iboCmUserSpeMainValue[0].setExpireDate(cmUserSpeuserMainValue.getExpireDate());
			iboCmUserSpeMainValue[0].setRemarks(cmUserSpeuserMainValue.getRemarks());
			iCustValue.setUserObject(CmLnConstants.MainMeth.CM_USER_SPEUSERMAIN, new IBOCmUserSpeuserMainValue[]{iboCmUserSpeMainValue[0]}); //信用度等级设置
*/		}else {
			cmUserSpeuserMainValue.setSpeuserId(CmCommonUtil.getNewSequence(BOCmUserSpeuserMainBean.class));
			cmUserSpeuserMainValue.setAcctId(userValue.getAcctId());
			cmUserSpeuserMainValue.setRegionId(userValue.getRegionId());
			cmUserSpeuserMainValue.setState(CmLnConstants.GroupManagerState.State_U);
			iCustValue.setUserObject(CmLnConstants.MainMeth.CM_USER_SPEUSERMAIN, new IBOCmUserSpeuserMainValue[]{cmUserSpeuserMainValue}); //信用度等级设置
		
			//根据账户编号查询账户信息
			ICmAccountSV cmAccount=(ICmAccountSV)ServiceFactory.getService(ICmAccountSV.class);
			IAccountProfileValue[] accountValue=cmAccount.queryAcctDtsById(userValue.getAcctId(),-1,-1,-1);
			if (null==accountValue) {
				ExceptionUtil.throwBusinessException("CMS8000050");//账户信息不存在
			}
			//账户信息
			IVOAccountValue ivoAccount=new VOAccountBean();
			accountValue[0].setStsToOld();
			accountValue[0].setCreditLevel(creatLevel);
			IBOCmCreditMappingValue cmCrewdit=CmCreditMappingUtil.getOneCreditMapping(userValue.getRegionId(),CmLnConstants.CustType.CUST_TYPE_INDIVE,Integer.valueOf(creatLevel));
			//dt.set(CmLnConstants.CM_SEND_CODE.CREDIT_FEE,(cmCrewdit.getCreditValue()/100));
			if (CmCommonUtil.isNotEmptyObject(cmCrewdit)) {
				accountValue[0].setCreditValue(cmCrewdit.getCreditValue());
			}
			IAccountValue accountValu=new AccountBean();
			accountValu.copy(accountValue[0]);
			ivoAccount.setAccount(accountValu);
			iCustValue.addAccount(ivoAccount);
			CmServiceFactory.getCustomerSV().saveCustomer(iCustValue);
		}
	}

}
