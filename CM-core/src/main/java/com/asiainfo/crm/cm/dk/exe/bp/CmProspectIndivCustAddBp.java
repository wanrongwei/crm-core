package com.asiainfo.crm.cm.dk.exe.bp;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import com.asiainfo.crm.cm.dk.common.CmDkConstants;
import org.apache.commons.lang.StringUtils;

import com.ai.appframe2.common.ServiceManager;
import com.ai.appframe2.complex.center.CenterFactory;
import com.ai.appframe2.complex.tab.split.TenantIDFactory;
import com.ai.appframe2.privilege.UserInfoInterface;
import com.ai.common.util.ExceptionUtil;
import com.asiainfo.appframe.ext.exeframe.bp.BpFrameWork;
import com.asiainfo.appframe.ext.exeframe.bp.interfaces.IBpNotify;
import com.asiainfo.appframe.ext.exeframe.bp.interfaces.IBpProcess;
import com.asiainfo.appframe.ext.exeframe.bp.po.BpCol;
import com.asiainfo.appframe.ext.exeframe.bp.po.BpInfo;
import com.asiainfo.crm.cm.common.CmConstants;
import com.asiainfo.crm.cm.common.CmServiceFactory;
import com.asiainfo.crm.cm.inner.customer.bo.BOCmCustContactMediumBean;
import com.asiainfo.crm.cm.inner.customer.ivalues.IBOCmCustContactMediumValue;
import com.asiainfo.crm.cm.model.bean.VOCustBean;
import com.asiainfo.crm.cm.model.bo.CustomerBean;
import com.asiainfo.crm.cm.model.ivalues.ICustomerValue;
import com.asiainfo.crm.cm.model.ivalues.IVOCustValue;
import com.asiainfo.crm.cm.service.interfaces.ICmCustomerSV;

public class CmProspectIndivCustAddBp implements IBpProcess, IBpNotify {

	private final static int FILE_COL_COUNT = 4;	// 上传文件每行的项目列数.

	public void processData(BpCol[][] bpCols, BpInfo bpInfo) throws Exception {
		UserInfoInterface userInfo = ServiceManager.getNewBlankUserInfo();
		userInfo.setTenantId(TenantIDFactory.getTenant());
		userInfo.setID(bpInfo.getProcessOpId());
		userInfo.setOrgId(bpInfo.getProcessOrgId());
		ServiceManager.setServiceUserInfo(userInfo);

		if (null != bpCols && bpCols.length > 0) {

			IVOCustValue voCustValue = new VOCustBean();
			String firstName = "";
			String lastName = "";
			String phone = "";
			String email = "";
			for (int i = 0; i < bpCols.length; i++)	// 按行处理每条记录
			{
				BpCol[] bpCol = bpCols[i];
				if (bpCol == null || bpCol.length != FILE_COL_COUNT)	// 行内容参数与配置的不一致
				{
					// // 记录格式错误，字段个数不等于{0}
					ExceptionUtil.throwBusinessException("AMS1600120", String.valueOf(FILE_COL_COUNT));
				}
				firstName = bpCol[0].getValue();
				lastName = bpCol[1].getValue();
				phone = bpCol[2].getValue();
				email = bpCol[3].getValue();
				// 封装客户对象
				ICustomerValue customerValue = new CustomerBean();
				customerValue.setFirstName(firstName);
				customerValue.setLastName(lastName);
				customerValue.setIsVip(1);// 特殊设置，标示潜在客户
				voCustValue.setCustomer(customerValue);
				// 封装联系媒介对象
				IBOCmCustContactMediumValue custContMediu = null;
				Pattern pattern = null;
				Matcher match = null;
				if (StringUtils.isNotBlank(phone)) {
					pattern = Pattern.compile("[0-9]*");
					match = pattern.matcher(phone);
					if (!match.matches()) {
						// 输入的手机号码不正确！
						ExceptionUtil.throwBusinessException("CMS0030177");
					}
					custContMediu = new BOCmCustContactMediumBean();
					custContMediu.setContNumber(phone);
					custContMediu.setContMedTypeId(CmDkConstants.CustContMedium.CONTACT_NUMBER);
					voCustValue.addCustContMedium(new IBOCmCustContactMediumValue[] { custContMediu });
				}
				if (StringUtils.isNotBlank(email)) {
					pattern = Pattern.compile("\\w+@(\\w+.)+[a-z]{2,3}");
					match = pattern.matcher(email);
					if (!match.matches()) {
						// 请填写正确的email地址！
						ExceptionUtil.throwBusinessException("CMS0020245");
					}
					custContMediu = new BOCmCustContactMediumBean();
					custContMediu.setEmailAddress(email);
					custContMediu.setContMedTypeId(CmDkConstants.CustContMedium.EMAIL);
					voCustValue.addCustContMedium(new IBOCmCustContactMediumValue[] { custContMediu });
				}
				ICmCustomerSV customerSV = CmServiceFactory.getCustomerSV();
				customerSV.saveIndivCustomer(voCustValue);
			}
		}
	}

	public void statusNotify(String notifyBillId, String notifyMsg) throws Exception {
		// 调用发送短信接口完成短信发送
		if (StringUtils.isNotBlank(notifyBillId) && StringUtils.isNotBlank(notifyMsg)) {
			CenterFactory.setCenterInfoByTypeAndValue(CmConstants.CenterType.BILL_ID, notifyBillId);
			CmServiceFactory.getTeamInvokeSV().sendSms(notifyBillId, notifyMsg);
		}
	}

	public static void main(String[] args) throws Exception {
		// 启动下载FTP文件入库
		// BpFrameWork.main(new String[]{"-ftp","BATCH_ADD_CUSTOMER_SEGMENT_012"});
		// 根据入库文件执行业务逻辑
		BpFrameWork.main(new String[] { "-dispatcher", "BATCH_ADD_GROUP_DEPT_USER_012:240:1:0" });
	}

}
