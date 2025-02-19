package com.asiainfo.crm.cm.exe.task;


import java.util.HashMap;

import com.asiainfo.crm.inter.sms.service.interfaces.SMSConstants;
import org.apache.commons.lang.StringUtils;

import com.ai.appframe2.common.ServiceManager;
import com.ai.appframe2.privilege.UserInfoInterface;
import com.ai.appframe2.service.ServiceFactory;
import com.ai.common.util.TimeUtil;
import com.asiainfo.appframe.ext.exeframe.task.interfaces.ITask;
import com.asiainfo.appframe.ext.exeframe.task.query.ivalues.IBOCfgTaskParamValueValue;
import com.asiainfo.appframe.ext.exeframe.task.query.service.interfaces.ITaskSV;
import com.asiainfo.crm.cm.exe.task.bi.business.GtoneVipPdProcess;
import com.asiainfo.crm.cm.exe.task.bi.business.GtoneVipPdProcessBean;
import com.asiainfo.crm.cm.exe.task.bi.business.GtoneVipPdSmsNotifyBean;
import com.asiainfo.crm.constant.RBossConst;
import com.asiainfo.crm.so.common.service.interfaces.ISmsSendCenterSV;

public class VipPdProcessTask implements ITask
{

	public String doTask(long taskId) throws Exception
	{
		//2011-09-04，add by xialing，设置操作员信息
		UserInfoInterface userinfo = ServiceManager.getNewBlankUserInfo();
		userinfo.setID(9999);
		userinfo.setOrgId(-1);
		ServiceManager.setServiceUserInfo(userinfo);
		//add end
		
		//解析task中参数
		ITaskSV taskSV = (ITaskSV)ServiceFactory.getService(ITaskSV.class);
		IBOCfgTaskParamValueValue[] params = taskSV.getCfgTaskParamValueByTaskId(taskId);
		String[] allParams = params[0].getParamValue().split("\\^");	//参数根据^分隔，没有值的也要提供占位符，格式：dbCode^fetchSize^
		int fetchSize = 100;	//默认为100
		if(!StringUtils.isBlank(allParams[1])) {
			fetchSize = Integer.parseInt(allParams[1]);
		}
		
		//生成评定处理的bean对象
		GtoneVipPdProcessBean processBean = new GtoneVipPdProcessBean(allParams[0], fetchSize);
		
		String rtnMsg = GtoneVipPdProcess.getInstance().mainProcess(processBean);
		
		//查询需要发送短信的人员名单信息,给地市管理员发送短信，内容：****年**月的全球通88系列套餐VIP评定已经完成，请进行后续操作
		ISmsSendCenterSV smsSV = (ISmsSendCenterSV)ServiceFactory.getService(ISmsSendCenterSV.class);
		//短信发送类型
		//操作代码
		String optCode = "4000000003";
		//模板ID
		String templateId = "400000000003";		//短信模板
		//模板参数
		HashMap rtnDataMap = new HashMap();
		String yearAndMonth = TimeUtil.getYYYYMM(ServiceManager.getIdGenerator().getSysDate());
		rtnDataMap.put("YEAR", yearAndMonth.substring(0, 4));
		rtnDataMap.put("MONTH", yearAndMonth.substring(4));
		
		//生成短信内容对象
		HashMap smsMap = new HashMap();
		smsMap.put(SMSConstants.SMS_OPTCODE, optCode);
		smsMap.put(SMSConstants.SMS_TEMPLATE_ID, templateId);
		smsMap.put(RBossConst.SMS_PARAM_MAP, rtnDataMap);	//参数key值常量使用RBoss中的值
		//发送短信
		GtoneVipPdSmsNotifyBean[] notifyBeans = GtoneVipPdProcess.getInstance().getAllBillIdForSms(processBean);
		for(int i=0,len=notifyBeans.length; i<len; i++) {
			smsMap.put(SMSConstants.SMS_DESTNUM, notifyBeans[i].getBillId());
			smsMap.put(SMSConstants.SMS_REGION_ID, notifyBeans[i].getRegionId());
			smsSV.sendSmsForCBoss(smsMap);
		}
		
		return rtnMsg;
	}
	
	public static void main(String[] args) throws Exception {
		new VipPdProcessTask().doTask(1000001495L);
	}

}
