package com.asiainfo.crm.cm.zg.service.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.HashMap;
import java.util.Map;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import com.ai.appframe2.service.ServiceFactory;
import com.asiainfo.crm.cm.common.util.CmCommonUtil;
import com.asiainfo.crm.cm.common.util.ConnUtil;
import com.asiainfo.crm.cm.ln.account.ivalues.IBOCmIAcctCreditValue;
import com.asiainfo.crm.cm.ln.common.util.CmLnConstants;
import com.asiainfo.crm.cm.model.ivalues.IAccountValue;
import com.asiainfo.crm.cm.zg.bo.IAccBusiCreditBean;
import com.asiainfo.crm.cm.zg.bo.IRaccOperBean;
import com.asiainfo.crm.cm.zg.dao.interfaces.ICmAcctCreditDAO;
import com.asiainfo.crm.cm.zg.ivalues.IIAccBusiCreditValue;
import com.asiainfo.crm.cm.zg.ivalues.IIRaccOperValue;
import com.asiainfo.crm.cm.zg.service.interfaces.ICmAcctCreditSV;

public class CmAcctCreditSVImpl implements ICmAcctCreditSV {

	private static final Log log = LogFactory.getLog(CmAcctCreditSVImpl.class);

	private ICmAcctCreditDAO getAcctCreditDAO() {
		return (ICmAcctCreditDAO) ServiceFactory.getService(ICmAcctCreditDAO.class);
	}

	public IIAccBusiCreditValue queryAcctCredit(long acctId) throws Exception {
		StringBuffer condition = new StringBuffer();
		Map parameter = new HashMap();
		condition.append(IIAccBusiCreditValue.S_AcctId).append(" = :acctId ");
		parameter.put("acctId", Long.valueOf(acctId));
		IIAccBusiCreditValue[] accBusiCreditValues = getAcctCreditDAO().queryAcctCredit(condition.toString(), parameter);
		if (CmCommonUtil.isEmptyObject(accBusiCreditValues)) {
			return null;
		}
		return (IIAccBusiCreditValue) accBusiCreditValues[0];
	}

	public void saveAccBusiCredit(IIAccBusiCreditValue accBusiCreditValue) throws Exception {
		getAcctCreditDAO().saveAccBusiCredit(accBusiCreditValue);
	}

	public void saveIRaccOper(IIRaccOperValue raccOperValue) throws Exception {
		getAcctCreditDAO().saveIRaccOper(raccOperValue);
	}

	public void sysAcctCredit(IAccountValue accountValue) throws Exception {
		long acctId = accountValue.getAcctId();
		long creditValue = accountValue.getCreditValue();
		long creditLevel = accountValue.getCreditLevel();
		String regionId = accountValue.getRegionId();
		long sid = getSID();
		// 1.判断账户信用度I表中是否已经有记录
		IIAccBusiCreditValue accBusiCreditValue = this.queryAcctCredit(acctId);

		if (accBusiCreditValue != null) {
			// 1.1有则修改
			accBusiCreditValue.setStsToOld();
			accBusiCreditValue.setBusiCredit(creditValue);
			accBusiCreditValue.setCreditLevel(creditLevel);
			accBusiCreditValue.setRegionCode(Integer.parseInt(regionId));
		} else {
			// 1.2没有则新增
			accBusiCreditValue = new IAccBusiCreditBean();
			accBusiCreditValue.setAcctId(acctId);
			accBusiCreditValue.setCreditLevel(creditLevel);
			accBusiCreditValue.setBusiCredit(creditValue);
			accBusiCreditValue.setRegionCode(Integer.parseInt(regionId));
			accBusiCreditValue.setServiceId(CmLnConstants.acctCredit.ACCT_CREDIT_BUSI_ID);
			accBusiCreditValue.setSid(sid);
			accBusiCreditValue.setSoNbr(sid);
		}
		this.saveAccBusiCredit(accBusiCreditValue);

		// 2.往账户信用度通知I表插入记录
		IIRaccOperValue raccOperValue = new IRaccOperBean();
		raccOperValue.setAcctId(acctId);
		raccOperValue.setBusiCode(CmLnConstants.acctCredit.ACCT_CREDIT_BUSI_CODE);
		raccOperValue.setCommitDate(accountValue.getDoneDate());
		raccOperValue.setServId(CmLnConstants.acctCredit.ACCT_CREDIT_BUSI_ID);
		raccOperValue.setCustId(accountValue.getCustId());
		raccOperValue.setCountyCode(Integer.parseInt(regionId));
		raccOperValue.setRegionCode(Integer.parseInt(regionId));
		raccOperValue.setSid(sid);
		raccOperValue.setOrgId(accountValue.getOrgId());
		raccOperValue.setSoNbr(sid);
		raccOperValue.setUpField("00000000000000000000010000000000");
		this.saveIRaccOper(raccOperValue);
	}

	private long getSID() throws Exception {
		Connection conn = null;
		PreparedStatement pstmt = null;
		long sid = 0;
		ResultSet rs = null;
		try {
			conn = ConnUtil.getWriteAbleZgConn();
			String sql = "SELECT ZG.SID$SEQ.NEXTVAL FROM DUAL";
			pstmt = conn.prepareStatement(sql);
			rs = pstmt.executeQuery();
			while (rs.next()) {
				sid = rs.getLong(1);
			}
			return sid;
		} catch (Exception e) {
			log.info(e.getMessage(), e);
			if (log.isErrorEnabled()) {
				log.error(e.getMessage());
			}

			return sid;
		} finally {
			if (rs != null) {
				rs.close();
			}
			if (pstmt != null) {
				pstmt.close();
			}
			if (conn != null) {
				conn.close();
			}
		}
	}

	public void sysAcctCredit(IBOCmIAcctCreditValue acctCreditValue) throws Exception {
		long acctId = acctCreditValue.getAcctId();
		long creditValue = acctCreditValue.getBusiCredit();
		long creditLevel = acctCreditValue.getCreditLevel();
		int regionId = acctCreditValue.getRegionCode();
		long sid = getSID();
		// 1.判断账户信用度I表中是否已经有记录
		IIAccBusiCreditValue accBusiCreditValue = this.queryAcctCredit(acctId);

		if (accBusiCreditValue != null) {
			// 1.1有则修改
			accBusiCreditValue.setStsToOld();
			accBusiCreditValue.setBusiCredit(creditValue);
			accBusiCreditValue.setCreditLevel(creditLevel);
			accBusiCreditValue.setRegionCode(regionId);
		} else {
			// 1.2没有则新增
			accBusiCreditValue = new IAccBusiCreditBean();
			accBusiCreditValue.setAcctId(acctId);
			accBusiCreditValue.setCreditLevel(creditLevel);
			accBusiCreditValue.setBusiCredit(creditValue);
			accBusiCreditValue.setRegionCode(regionId);
			accBusiCreditValue.setServiceId(acctCreditValue.getServId());
			accBusiCreditValue.setSid(sid);
			accBusiCreditValue.setSoNbr(sid);
		}
		this.saveAccBusiCredit(accBusiCreditValue);

		// 2.往账户信用度通知I表插入记录
		IIRaccOperValue raccOperValue = new IRaccOperBean();
		raccOperValue.setAcctId(acctId);
		raccOperValue.setBusiCode(CmLnConstants.acctCredit.ACCT_CREDIT_BUSI_CODE);
		raccOperValue.setCommitDate(acctCreditValue.getCommitDate());
		raccOperValue.setServId(acctCreditValue.getServId());
		raccOperValue.setCustId(acctCreditValue.getCustId());
		raccOperValue.setCountyCode(regionId);
		raccOperValue.setRegionCode(regionId);
		raccOperValue.setSid(sid);
		raccOperValue.setOrgId(acctCreditValue.getOrgId());
		raccOperValue.setSoNbr(sid);
		raccOperValue.setUpField("00000000000000000000010000000000");
		raccOperValue.setUpDate(acctCreditValue.getUpDate());
		this.saveIRaccOper(raccOperValue);

	}
}
