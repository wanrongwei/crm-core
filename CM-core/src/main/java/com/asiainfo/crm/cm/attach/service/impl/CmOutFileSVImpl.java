package com.asiainfo.crm.cm.attach.service.impl;
	
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.ai.appframe2.bo.DataContainer;
import com.ai.appframe2.common.DataContainerInterface;
import com.ai.appframe2.common.DataStructInterface;
import com.ai.appframe2.service.ServiceFactory;
import com.asiainfo.crm.cm.attach.dao.interfaces.ICmOutFileDAO;
import com.asiainfo.crm.cm.attach.service.interfaces.ICmOutFileSV;
import com.asiainfo.crm.cm.common.util.CmCommonUtil;
import com.asiainfo.crm.cm.inner.customer.bo.BOCmGroupCustomerBean;
import com.asiainfo.crm.cm.inner.customer.ivalues.IBOCmGroupCustomerValue;

public class CmOutFileSVImpl implements ICmOutFileSV {

	public Map outPutGrpCustList(Map da) throws Exception {
		DataContainer[] dt= qryGrpCustomerValue(da.get("CUST_ID").toString());
		Map map=new HashMap();
		map.put("returnObj", dt);
		return map;
	}
	
	
	
	public DataContainer[] qryGrpCustomerValue(String grpCustId)throws Exception{
		ICmOutFileDAO cmoutFileDao=(ICmOutFileDAO)ServiceFactory.getService(ICmOutFileDAO.class);
		//查询上级集团客户
		DataContainerInterface[] valuesUp = cmoutFileDao.qryGrpCustomerListUp(grpCustId);
		//查询下级客户
		DataContainerInterface[] values = cmoutFileDao.qryGrpCustomerListDown(grpCustId);
		DataContainer[] dt=ipurtGrpCustList(values,valuesUp);
		return dt;
	}

	/**
	 * 
	 * @Function: ipurtGrpCustList
	 * @Description: 封装上传对象
	 * 
	 * @param:参数描述
	 * @return：返回结果描述
	 * @throws：异常描述
	 * 
	 * @version: v1.0.0
	 * @author: kangzk
	 * @date: 2012-10-10 上午11:01:24 design
	 * 
	 * Modification History: Date Author Version Description
	 * ---------------------------------------------------------* 2011-5-1
	 * kangzk v1.0.0 修改原因
	 */
	private DataContainer[] ipurtGrpCustList(DataStructInterface[] values,DataStructInterface[] valuesUp) throws Exception {
		DataContainer dt =null;
		int len=0;
		int start=0;
		List<DataContainer> list=new ArrayList<DataContainer>();
		if (CmCommonUtil.isNotEmptyObject(valuesUp)) {
			len=valuesUp.length;
			if (len>0) {
				for (int i = 0;i<len; i++) {
					dt = new DataContainer();
					dt.copy(valuesUp[i]);
					String custName=String.valueOf(valuesUp[i].get("CUST_NAME")).trim();
					if (i==1) {
						custName=" "+custName;
					}else if (i==2){
						custName="  "+custName;
					}else if (i==3){
						custName="   "+custName;
					}else if (i==4){
						custName="    "+custName;
					}else if (i==5){
						custName="     "+custName;
					}
					dt.set(IBOCmGroupCustomerValue.S_CustName, custName);
					list.add(dt);
					start++;
				}
			}
		}
		if (CmCommonUtil.isNotEmptyObject(values)) {
			len=values.length;
			for (int innerI = 0; innerI < len; innerI++) {
				dt = new BOCmGroupCustomerBean();
				dt.copy(values[innerI]);
				String custName="     "+String.valueOf(values[innerI].get("CUST_NAME"));
				dt.set(IBOCmGroupCustomerValue.S_CustName, custName);
				list.add(dt);
			}
		}
		return list.toArray(new DataContainer[0]);
	}

}
