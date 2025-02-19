package com.asiainfo.crm.cm.ln.account.service.impl;

import java.util.HashMap;
import java.util.Map;

import com.ai.appframe2.bo.DataContainer;
import com.ai.appframe2.complex.center.CenterFactory;
import com.ai.appframe2.service.ServiceFactory;
import com.ai.common.util.CenterUtil;
import com.ai.common.util.ExceptionUtil;
import com.ai.omframe.common.service.interfaces.CenterConst;
import com.ai.omframe.instance.ivalues.IInsAccrelValue;
import com.asiainfo.crm.cm.busimodel.common.ParamUtil;
import com.asiainfo.crm.cm.busimodel.impl.common.AbstractCmCommonDealModelImpl;
import com.asiainfo.crm.cm.common.CmConstants;
import com.asiainfo.crm.cm.common.CmServiceFactory;
import com.asiainfo.crm.cm.common.bo.BOAccBankBean;
import com.asiainfo.crm.cm.common.util.CmCommonUtil;
import com.asiainfo.crm.cm.ln.account.bo.BOCmBillCustomizeBean;
import com.asiainfo.crm.cm.ln.account.ivalues.IBOCmBillCustomizeValue;
import com.asiainfo.crm.cm.ln.account.service.interfaces.ICmBillCustomizeSV;
import com.asiainfo.crm.cm.model.ivalues.ISoUserValue;
import com.asiainfo.crm.cm.teaminvoke.in.service.interfaces.ICmTeamInvokeSV;
import com.asiainfo.crm.so.query.ivalues.IQUserBaseInfoValue;
import com.asiainfo.crm.so.teaminvoke.out.service.interfaces.ICrmFSV;

public class CmBillCustomizeSVImpl implements ICmBillCustomizeSV{


	public void saveData(DataContainer[] values) throws Exception {
		// TODO Auto-generated method stub
		for(DataContainer value:values)
		{	
			long seq = Long.valueOf(CmCommonUtil.getNewSequence(BOCmBillCustomizeBean.class));
			if(value.isNew()){
				((BOCmBillCustomizeBean)value).setCustomizeId(seq);
				((BOCmBillCustomizeBean)value).setState(CmConstants.RecordState.USE);
				//接口录入的账单信息无acct_id,这边回设一下
				if(((BOCmBillCustomizeBean)value).getAcctId() == 0)
				{
					IInsAccrelValue[] acctValues = ((ICrmFSV)ServiceFactory.getService(ICrmFSV.class)).getInstAccrel(((BOCmBillCustomizeBean)value).getUserId(), "");
					if(CmCommonUtil.isNotEmptyObject(acctValues))
					{
						for(IInsAccrelValue accValue:acctValues){				
							if(accValue.getPayType() == 1){
								((BOCmBillCustomizeBean)value).setAcctId(accValue.getAcctId());
								break;
							}				
						}
					}
				}
			}
		}
		((AbstractCmCommonDealModelImpl) CmServiceFactory.getBusiMode(AbstractCmCommonDealModelImpl.class)).saveData(values);
	}

	public DataContainer[] queryData(String criteria, int startNum, int endNum)
			throws Exception {
		// TODO Auto-generated method stub
		DataContainer[] containers = ParamUtil.parseXmlCriteria_new(criteria);
		return ((AbstractCmCommonDealModelImpl) CmServiceFactory.getBusiMode(AbstractCmCommonDealModelImpl.class)).queryData(containers,new String[]{"RECIPIENTS"}, startNum, endNum);
	}

	public int queryDataCount(String criteria) throws Exception {
		// TODO Auto-generated method stub
		DataContainer[] containers = ParamUtil.parseXmlCriteria_new(criteria);
		return ((AbstractCmCommonDealModelImpl) CmServiceFactory.getBusiMode(AbstractCmCommonDealModelImpl.class)).queryCount(containers,new String[]{"RECIPIENTS"});
	
	}

	public ISoUserValue getUserValue(String billId) throws Exception {
		// TODO Auto-generated method stub
		return CmServiceFactory.getTeamInvokeSV().getSoUserByBillId(billId);
	}

	public void delCmBillCustomizeByUserId(long usrId) throws Exception{
		if (isEmpty(usrId))
			ExceptionUtil.throwBusinessException("CMS95000082");//CMS95000082 用户编码不能为空 
		DataContainer[] values = findCmBillCustomizById(usrId);
		
		//20121002修改，当查到个性化账单数据，才进行删除，没有找到数据不进行处理,不抛出异常。
//		if(values==null || values.length<=0){
//			throwException("CmBillCustomize删除,给定userId没有数据","");
//		}else{
		if(values!=null && values.length>0)
		{
			BOCmBillCustomizeBean bean = new BOCmBillCustomizeBean();
			bean.copy(values[0]);
			bean.delete();
			saveData(new DataContainer[]{bean});
		}
		
	}
	private Boolean isEmpty(Object obj) {
		if (obj == null || "".equals(obj))
			return true;
		return false;
	}

	public DataContainer[] findCmBillCustomizById(long usrId) throws Exception {
		Map map=new HashMap<String, String>();
		//因为页面测试报错，所以在userId在前面增加"";
		//java.lang.ClassCastException: java.lang.Long cannot be cast to java.lang.String
		//       at com.asiainfo.crm.cm.busimodel.common.ParamUtil.buildQueryXml(ParamUtil.java:114)
		//       at com.asiainfo.crm.cm.ln.account.service.impl.CmBillCustomizeSVImpl.findCmBillCustomizById(CmBillCustomizeSVImpl.java:92)
		//       at com.asiainfo.crm.cm.ln.account.service.impl.CmBillCustomizeSVImpl.delCmBillCustomizeByUserId(CmBillCustomizeSVImpl.java:63)		
		map.put("USER_ID", ""+usrId);
		return ((AbstractCmCommonDealModelImpl) CmServiceFactory.getBusiMode(AbstractCmCommonDealModelImpl.class)).
		 queryData(ParamUtil.buildQueryXml("com.asiainfo.crm.cm.ln.account.bo.BOCmBillCustomizeBean", map), -1, -1);
	}
	
	public DataContainer[] findCmBillCustomizById(long usrId,String regionId) throws Exception {
		Map map=new HashMap<String, String>();
		//因为页面测试报错，所以在userId在前面增加"";
		//java.lang.ClassCastException: java.lang.Long cannot be cast to java.lang.String
		//       at com.asiainfo.crm.cm.busimodel.common.ParamUtil.buildQueryXml(ParamUtil.java:114)
		//       at com.asiainfo.crm.cm.ln.account.service.impl.CmBillCustomizeSVImpl.findCmBillCustomizById(CmBillCustomizeSVImpl.java:92)
		//       at com.asiainfo.crm.cm.ln.account.service.impl.CmBillCustomizeSVImpl.delCmBillCustomizeByUserId(CmBillCustomizeSVImpl.java:63)		
		map.put("USER_ID", ""+usrId);
		map.put("REGION_ID", regionId);
		return ((AbstractCmCommonDealModelImpl) CmServiceFactory.getBusiMode(AbstractCmCommonDealModelImpl.class)).
		 queryData(ParamUtil.buildQueryXml("com.asiainfo.crm.cm.ln.account.bo.BOCmBillCustomizeBean", map), -1, -1);
	}
}
