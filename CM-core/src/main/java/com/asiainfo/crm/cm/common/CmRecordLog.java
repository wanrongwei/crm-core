package com.asiainfo.crm.cm.common;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.commons.lang.StringUtils;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import com.ai.appframe2.common.ServiceManager;
import com.ai.appframe2.complex.tab.split.TenantIDFactory;
import com.ai.appframe2.service.ServiceFactory;
import com.asiainfo.crm.ci.inter.out.bo.CustomerInteractionBean;
import com.asiainfo.crm.ci.inter.out.service.interfaces.ICustomerInteractionSV;
import com.asiainfo.crm.cm.service.interfaces.ICmCustomerSV;

public class CmRecordLog {

	private static final Log log = LogFactory.getLog(CmRecordLog.class);

	/**
	 * 记录交互记录
	 * 
	 * @Function saveRecord
	 * @Description
	 * 
	 * @param busiId
	 *            业务编码（必填）
	 * @param mainObjId
	 *            业务对象（必填，客户为CustId,账户为AcctId,使用者为UserId，Payer为PartyId）
	 * @param detailInfo
	 *            可填(此参数为String[],如:修改客户信息,String[0]=Old Customer
	 *            Attributes:cust2,String[1]=New Customer Attributes:cust3)
	 * @throws Exception
	 * 
	 * @version v1.0.0
	 * @author yangjh
	 * @date 2014-12-10 下午12:40:34
	 * 
	 *       <strong>Modification History:</strong><br>
	 *       Date Author Version Description<br>
	 *       ---------------------------------------------------------<br>
	 *       2014-12-10 yangjh v1.0.0 修改原因<br>
	 */
	public static void saveRecord(long busiId, long mainObjId, String[] detailInfo) throws Exception {
		// 记录接触日志
		try {
			ICustomerInteractionSV sv = (ICustomerInteractionSV) ServiceFactory.getService(ICustomerInteractionSV.class);
			ICmCustomerSV cmSv = (ICmCustomerSV) ServiceFactory.getService(ICmCustomerSV.class);
			CustomerInteractionBean interaction = new CustomerInteractionBean();
			interaction.setSrcSysId("CRM");
			interaction.setChannelCode("CustMgnt");
			interaction.setCustId(mainObjId);
			interaction.setTenantId(TenantIDFactory.getTenant());
			// 1：客户主动接触；2：客户被动接触
			interaction.setContactType(1);
			// 1：电话；2：短信；3：面对面；4：USSD；5：邮件；6：平信；7：IVR；8：彩信；9：Facebook；10：Twitter；11：便签；12：提醒；13：公告；14：传真
			interaction.setMediaType("3");
			interaction.setSrcBusiType(String.valueOf(busiId));
			// 外系统业务流水号
			interaction.setSrcInteractionId(cmSv.getInteractionId());
			// 0：成功，1：失败
			interaction.setInteractionResult(0);
			if (detailInfo != null && detailInfo.length > 0) {
				Map<String, Object> map = new HashMap<>();
				for (String s : detailInfo) {
					if (StringUtils.split(s, ":").length > 1) {
						map.put(StringUtils.split(s, ":")[0].trim(), StringUtils.split(s, ":")[1].trim());
					}
				}
				List<Map<String, Object>> interactionAttrList = new ArrayList<>();
				interactionAttrList.add(map);
				interaction.setInteractionAttrList(interactionAttrList);
			}

			try {
				interaction.setInteractionTime(ServiceManager.getOpDateTime());
				interaction.setInteractionCompleteTime(ServiceManager.getOpDateTime());
				interaction.setOpId(ServiceManager.getUser().getID());
				interaction.setOrgId(ServiceManager.getUser().getOrgId());
			} catch (Exception e) {
				log.error("saveMsmLog inner error.", e);
			}
			sv.createCustomerInteraction(interaction);
		} catch (Exception e) {
			log.error("saveMsmLog error.", e);
		}
	}

}
