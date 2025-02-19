package com.asiainfo.crm.cm.ln.service.impl;

import java.util.HashMap;
import java.util.Map;

import com.ai.appframe2.service.ServiceFactory;
import com.ai.common.util.ExceptionUtil;
import com.asiainfo.crm.cm.ln.service.interfaces.ICmLnTransSV;
import com.asiainfo.crm.so.teaminvoke.out.service.interfaces.ICrmFSV;

public class CmLnTransSVImpl implements ICmLnTransSV {

	public Map doSelfTransaction(Map param, String methodSwitch) throws Exception
	{
		Map reMap = new HashMap();
		if(null == methodSwitch || "".equals(methodSwitch))
		{
			//参数异常
			ExceptionUtil.throwBusinessException("CMS0000073");
		}
		else
		{
			//分别处理
			if(methodSwitch.equals("checkPass"))
			{
				//调用个人的接口，检验密码是否正确
				ICrmFSV crmFSV = (ICrmFSV)ServiceFactory.getService(ICrmFSV.class);
	            String billId = (String)param.get("BILL_ID");
	            String passWord = (String)param.get("PASS_WORD");
	            //reMap = crmFSV.vfyPass4SR(billId, passWord);
	            reMap = crmFSV.verifyUserPassword(billId, passWord);
	            return reMap;
			}
			else if(methodSwitch.equals("modifyPass"))
			{
				//调用个人的接口，修改密码
				ICrmFSV iCrmFSV = (ICrmFSV) ServiceFactory.getService(ICrmFSV.class);
				String serviceNum = (String)param.get("BILL_ID");
				int isVerifyOldPwd = Integer.valueOf(param.get("isVerifyOldPwd").toString()).intValue();
				String oldPwd = (String)param.get("OLD_PASS");
				String newPwd = (String)param.get("NEW_PASS");
				int isVerifyCertCard = Integer.valueOf(param.get("isVerifyCertCard").toString()).intValue(); 
				String certCardType = (String)param.get("CERT_TYPE");
				String certCardCode = (String)param.get("CERT_CODE");
				int isSMSNotify = Integer.valueOf(param.get("isSMSNotify").toString()).intValue();
				reMap = iCrmFSV.updateUserPassword(serviceNum, isVerifyOldPwd, oldPwd, newPwd, isVerifyCertCard, certCardType, certCardCode, isSMSNotify);
				return reMap;
			}
		}
		return reMap;
	}
}
