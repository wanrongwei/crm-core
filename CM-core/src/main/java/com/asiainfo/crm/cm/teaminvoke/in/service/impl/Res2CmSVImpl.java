package com.asiainfo.crm.cm.teaminvoke.in.service.impl;

import java.rmi.RemoteException;
import java.util.ArrayList;
import java.util.List;
import com.ai.omframe.util.TimeUtil;
import com.ai.appframe2.bo.DataContainer;
import com.ai.appframe2.common.DataContainerInterface;
import com.ai.appframe2.service.ServiceFactory;
import com.ai.omframe.instance.ivalues.IInsOfferValue;
import com.ai.omframe.instance.ivalues.IInsSrvAttrValue;
import com.ai.omframe.instance.ivalues.IInsUserValue;
import com.ai.omframe.instance.service.interfaces.IInstanceQrySV;
import com.ai.omframe.order.valuebean.OrderConst;
import com.ai.secframe.orgmodel.ivalues.IQBOSecOrgStaffOperValue;
import com.asiainfo.crm.cm.inner.account.ivalues.IBOCmAccountValue;
import com.asiainfo.crm.cm.ln.common.ivalues.IBOLnCmInsCmRelValue;
import com.asiainfo.crm.cm.teaminvoke.in.service.interfaces.IRes2CmSV;
import com.asiainfo.crm.common.notes.tl.util.StringUtil;
import com.asiainfo.crm.res.rescfg.ivalues.IBOResSpecValue;
import com.asiainfo.crm.res.simcard.ivalues.IBOResSimCardUsedValue;
import com.asiainfo.crm.res.teaminvoke.out.service.interfaces.IRes2InterFSV;
import com.asiainfo.crm.constant.RBossConst;
import com.asiainfo.crm.so.instance.rboss.service.interfaces.IInsQrySV;
import com.asiainfo.crm.so.teaminvoke.in.service.interfaces.ICust2CrmSV;
import com.asiainfo.crm.so.teaminvoke.in.service.interfaces.IRes2CrmSV;
import com.asiainfo.crm.so.teaminvoke.in.service.interfaces.ISec2CrmSV;

public class Res2CmSVImpl implements IRes2CmSV {
	
	private IRes2InterFSV getRes2InterFSV() throws Exception{
		return (IRes2InterFSV) ServiceFactory.getService(IRes2InterFSV.class);
	}


	public IBOResSimCardUsedValue getUsedSimCardInfoByImsi(String imsi,String regionId) throws Exception
	{
		return getRes2InterFSV().getUsedSimCardInfoByImsi(imsi, regionId);
	}


    public DataContainerInterface[] qryServiceInfoByUserId(long userId,long offerInstId) throws Exception, RemoteException {
        DataContainerInterface[] dc=new DataContainer[1];
//        String unit= RBossConst.CURRENCY_SYMBOL;
        dc[0]=new DataContainer();
        IInstanceQrySV instanceQrySV = (IInstanceQrySV)ServiceFactory.getCrossCenterService(IInstanceQrySV.class);
        IInsQrySV insQrySV = (IInsQrySV)ServiceFactory.getCrossCenterService(IInsQrySV.class);
        
        IInsUserValue insUser =  instanceQrySV.getInstUserByUserId(userId);
        if(insUser!=null){
        	dc[0].set("BILL_ID", insUser.getBillId());
        }
        IInsOfferValue insOffer = instanceQrySV.getInsOfferByUserIdAndInsOfferId(offerInstId, userId, OrderConst.VALID_TYPE_ALL);
        if(insOffer!=null){
        	dc[0].set("OFFER_NAME",insOffer.getOrderName());
        	dc[0].set("EXPIRE_DATE",insOffer.getExpireDate());
            dc[0].set("EFFECTIVE_DATE", insOffer.getEffectiveDate());
            dc[0].set("LEFT_TIME", TimeUtil.monthsBetween(TimeUtil.getDefaultSysDate(), insOffer.getExpireDate())+" Months" );
            dc[0].set("CONTRACT_TERM",  TimeUtil.monthsBetween(insOffer.getEffectiveDate(), insOffer.getExpireDate())+" Months");
        }
        IBOCmAccountValue cmAccount = insQrySV.queryAccountByUserId(userId);
        if(cmAccount!=null){
            dc[0].set("ACCOUNT_TYPE",cmAccount.getAcctType());
        }
        
        dc[0].set("SOURCE_TYPE", "Contract");

        dc[0].set("PRICE","");
        dc[0].set("USING_TIME", "");
       
        dc[0].set("ALREADY_PAID", "");
        return dc;
    }

    public DataContainerInterface[] qryResDetailByCustIdAndDeviceId(long userId,long offerInstId ,String imei) throws Exception, RemoteException {
    	ISec2CrmSV secSV = (ISec2CrmSV)ServiceFactory.getCrossCenterService(ISec2CrmSV.class);
    	IRes2CrmSV resSV = (IRes2CrmSV)ServiceFactory.getCrossCenterService(IRes2CrmSV.class);
    	DataContainerInterface temiInfoDc = resSV.getUsedTemiInfoByImei(imei, "");
    	DataContainerInterface[] dc=new DataContainer[1];
        dc[0]=new DataContainer();
    	if(temiInfoDc!=null){
    		IBOResSpecValue specValue = resSV.getResSpecByResSpecId(temiInfoDc.getAsString("RES_SPEC_ID"));
			if(specValue!=null){
				dc[0].set("NAME",specValue.getResSpecName());
			}
			IQBOSecOrgStaffOperValue  secOper = secSV.getOperQBOByOperId(temiInfoDc.getAsLong("OP_ID"));
			if(secOper!=null){
				dc[0].set("STAFF_NAME",  secOper.getStaffName());
			}
			dc[0].set("SUPPLIER", temiInfoDc.get("SUPPLIER"));
			dc[0].set("SERIES_NUMBER",temiInfoDc.get("SN"));
		}
        dc[0].set("DEVICE_TYPE", "Contract");
        dc[0].set("STATUS", "Normal");
        return dc;
    }

    public int qryResListCountByCustId(long custId) throws Exception, RemoteException {
        int count=2;
        //调用资源接口，查询资源列表，暂时先模拟
        return count;
    }

    public DataContainerInterface[] qryResListByCustId(long custId) throws Exception, RemoteException {
    	
    	ICust2CrmSV cust2CrmService = (ICust2CrmSV)ServiceFactory.getCrossCenterService(ICust2CrmSV.class);
    	IInstanceQrySV insQrySV = (IInstanceQrySV)ServiceFactory.getCrossCenterService(IInstanceQrySV.class);
    	IRes2CrmSV resSV = (IRes2CrmSV)ServiceFactory.getCrossCenterService(IRes2CrmSV.class);
    	ISec2CrmSV secSV = (ISec2CrmSV)ServiceFactory.getCrossCenterService(ISec2CrmSV.class);
    	IBOLnCmInsCmRelValue[] cmrel = cust2CrmService.queryCmInsCmRelByCustId(custId,-1);
    	List<DataContainerInterface> list = new ArrayList();
    	if(cmrel!=null){
    		for(int i=0;i<cmrel.length;i++){
    			long userId = cmrel[i].getUserId();
    			IInsSrvAttrValue[] insSrvAttrValues = insQrySV.getInstSrvAttrBatchByUserId(userId,RBossConst.PROD_ATTR_ID_IMEI);
    			if(insSrvAttrValues!=null){
    				for(int j=0;j<insSrvAttrValues.length;j++){
    					String imei = insSrvAttrValues[j].getAttrValue();
    					if(StringUtil.isNotBlank(imei)){
    						DataContainerInterface temiInfoDc = resSV.getUsedTemiInfoByImei(imei, "");
    						if(temiInfoDc!=null){
    							temiInfoDc.set("CREATE_DATE", insSrvAttrValues[j].getCreateDate());
    							IQBOSecOrgStaffOperValue  secOper = secSV.getOperQBOByOperId(temiInfoDc.getAsLong("OP_ID"));
    							if(secOper!=null){
    								temiInfoDc.set("STAFF_NAME", secOper.getStaffName());
    							}
    							IBOResSpecValue specValue = resSV.getResSpecByResSpecId(temiInfoDc.getAsString("RES_SPEC_ID"));
    							if(specValue!=null){
    								temiInfoDc.set("SPEC_NAME",specValue.getResSpecName());
    							}
    							temiInfoDc.set("OFFER_INST_ID",insSrvAttrValues[j].getOfferInstId());
    							temiInfoDc.set("USER_ID",insSrvAttrValues[j].getUserId());
    						}
    						list.add(temiInfoDc);
    					}
    				}
    			}
    		}
    	}

        //调用资源接口，查询资源列表，暂时先模拟
        DataContainerInterface[] dc=new DataContainer[list.size()];
        for (int i = 0; i < list.size(); i++) {
        	dc[i]= new DataContainer();
        	DataContainerInterface dcImei = list.get(i);
        	String detail="<a href='javascript:void(0)' class='cellpath' onclick='detailInfo(\"" +i+ "\")' style='color:blue;float:left;text-decoration:underline'>Detail</a>";
        	dc[i].set("DEVICE_ID", dcImei.get("IMEI"));
        	dc[i].set("ACTION", detail);
	        dc[i].set("SOURCE_TYPE","Contract");
	        dc[i].set("NAME",dcImei.get("SPEC_NAME"));
	        dc[i].set("PRICE",dcImei.get("TERMINAL_MARKET_PRICE"));
	        dc[i].set("CREATE_DATE",dcImei.get("CREATE_DATE"));
	        dc[i].set("STATUS","Normal");
	        dc[i].set("STAFF_NAME",dcImei.get("STAFF_NAME"));
	        dc[i].set("OFFER_INST_ID",dcImei.get("OFFER_INST_ID"));
	        dc[i].set("USER_ID",dcImei.get("USER_ID"));
		}
        
/*
        String unit=RBossConst.CURRENCY_SYMBOL;
        //*********模拟数据1开始************
        dc[0]=new DataContainer();
        String Operation="Contract";
        String detail="<a href='javascript:void(0)' class='cellpath' onclick='detailInfo(\"" +Operation+ "\")' style='color:blue;float:left;text-decoration:underline'>Detail</a>";
        dc[0].set("ACTION",detail);
        dc[0].set("SOURCE_TYPE","Leased");
        dc[0].set("NAME","Router");
        dc[0].set("PRICE",unit+"4.99/month");
        dc[0].set("CREATE_DATE","2013-02-01");
        dc[0].set("STATUS","Normal");
        dc[0].set("STAFF_NAME","Hillcrest Road Service Center");
        //*********模拟数据1结束************
        //*********模拟数据2开始************
        String Operation1="Leased";
        String detail1="<a href='javascript:void(0)' class='cellpath' onclick='detailInfo(\"" +Operation1+ "\")' style='color:blue;float:left;text-decoration:underline'>Detail</a>";
        dc[1]=new DataContainer();
        dc[1].set("ACTION",detail1);
        dc[1].set("SOURCE_TYPE","Contract");
        dc[1].set("NAME","Telephone set");
        dc[1].set("PRICE",unit+"14.99/month");
        dc[1].set("CREATE_DATE","2013-02-01");
        dc[1].set("STATUS","Normal");
        dc[1].set("STAFF_NAME","Church Road Service Center");
        //*********模拟数据2结束************
*/
        return dc;
    }
	
	
}
