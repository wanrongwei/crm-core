package com.asiainfo.crm.cm.busimodel.impl.customer;

import java.util.HashMap;

import com.ai.appframe2.service.ServiceFactory;
import com.ai.common.i18n.CrmLocaleFactory;
import com.ai.common.util.ExceptionUtil;
import com.asiainfo.crm.cm.busimodel.IBusiDealModel;
import com.asiainfo.crm.cm.common.CmConstants;
import com.asiainfo.crm.cm.common.util.CmCommonUtil;
import com.asiainfo.crm.cm.inner.customer.bo.BOCmGroupManagerEngine;
import com.asiainfo.crm.cm.inner.customer.ivalues.IBOCmGroupManagerValue;
import com.asiainfo.crm.cm.inner.manager.bo.BOCmUserManagerBean;
import com.asiainfo.crm.cm.inner.manager.ivalues.IBOCmUserManagerValue;
import com.asiainfo.crm.cm.inner.util.CmInnerServiceFactory;
import com.asiainfo.crm.cm.ln.common.util.CmLnConstants;
import com.asiainfo.crm.cm.ln.customer.indiv.bo.BOCmIndivManagerEngine;
import com.asiainfo.crm.cm.ln.customer.indiv.ivalues.IBOCmIndivManagerValue;
import com.asiainfo.crm.cm.model.bean.CmDealReturnDataBean;
import com.asiainfo.crm.cm.model.ivalues.ICmDealReturnData;
import com.asiainfo.crm.cm.model.ivalues.IVOCustValue;
import com.asiainfo.crm.cm.service.interfaces.ICmCustomerSV;
public class AbstractCustManagerDealModelImpl implements IBusiDealModel{
	/**   
	 * @Copyright Copyright (c) 2012
	 * 
	 * @ClassName 
	 * @Description 客户经理处理方法
	 *
	 * @version v1.0.0
	 * @author kangzk
	 * @date 2012-9-6 上午10:31:02
	 * <br>
	 * Modification History:<br>
	 * Date         Author          Version            Description<br>
	 * ---------------------------------------------------------*<br>
	 * 2012-1-31     kangzk           v1.0.0               修改原因<br>
	 */
	public ICmDealReturnData deal(IVOCustValue custValue) throws Exception {
		return saveManager(custValue);
	}
	
	//保存关系管理对象
	public ICmDealReturnData saveManager(IVOCustValue custValue)throws Exception{
		if (custValue.getUserObject(CmConstants.ObjectKey.CM_USER_MANAGER_KEY)!=null) {
			saveUserManager(custValue);
		}else if (custValue.getUserObject(CmConstants.ObjectKey.MANAGER_KEY)!=null){
			saveCustManager(custValue);
		}
		ICmDealReturnData returnData = new CmDealReturnDataBean();
		returnData.setIsSuccess("Y");
		// 集团客户保存成功！
		returnData.setSuccessMsg(CrmLocaleFactory.getResource("CMS8000028"));
		return returnData;
	}
	
	//保存客户经理关系
	public void saveCustManager(IVOCustValue custValue) throws Exception{
		//校验方法
		int managerType = cmCustManagerCheck(custValue);
		
		if (CmConstants.ObjectKey.MANAGER_TYPE_INDIV == managerType) {
			// 个人客户经理
			saveIndivManagerRel(custValue);
		} else if (CmConstants.ObjectKey.MANAGER_TYPE_GROUP == managerType) {
			// 集团客户经理
			saveGroupManagerRel(custValue);
		} else {
			// 没有获取到要保存的对象！
			ExceptionUtil.throwBusinessException("CMS0000074");
		}
		
	}
	
	//保存电话经理关系
	public void saveUserManager(IVOCustValue custValue) throws Exception{
		IBOCmUserManagerValue[] cmUserManager=(IBOCmUserManagerValue[])custValue.getUserObject(CmConstants.ObjectKey.CM_USER_MANAGER_KEY);
		if (CmCommonUtil.isNotEmptyObject(cmUserManager)) {
			BOCmUserManagerBean[] cmUserBean=new BOCmUserManagerBean[cmUserManager.length];
			for (int i = 0; i < cmUserManager.length; i++) {
				cmUserBean[i]=new BOCmUserManagerBean();
				cmUserBean[i].copy(cmUserManager[i]);
			}
			CmInnerServiceFactory.getCommonInnerSV().saveBeans(cmUserBean);
		}
	}
	//校验方法
	public int cmCustManagerCheck(IVOCustValue custValue) throws Exception {
		//判断传入的对象是否为空
		if(null==custValue){
			// 传入数据为空，无法操作！
			ExceptionUtil.throwBusinessException("CMS8000023");
		}
		String postType=custValue.getUserObject(CmConstants.ObjectKey.MANAGER_TOPE_TYPE).toString();
		int managerType = Integer.parseInt(custValue.getUserObject(CmConstants.ObjectKey.MANAGER_TYPE_KEY).toString());
		if (postType.equals(CmLnConstants.DealCustInfo.OP_DEL)) {
			return managerType;
		}
		StringBuilder condition = new StringBuilder();
		condition.append(" 1=1 ");
	    HashMap paraMap = new HashMap();
		//判断是否存在此关系
		if (CmConstants.ObjectKey.MANAGER_TYPE_INDIV == managerType) {
			IBOCmIndivManagerValue[] iboCmIndivManager=(IBOCmIndivManagerValue[]) custValue.getUserObject(CmConstants.ObjectKey.MANAGER_KEY);
		    condition.append(" and ").append(IBOCmIndivManagerValue.S_CustId).append(" =:custId");
			paraMap.put("custId", iboCmIndivManager[0].getCustId());
			int relType= iboCmIndivManager[0].getRelType();
		    IBOCmIndivManagerValue[] cmIndivManager= BOCmIndivManagerEngine.getBeans(null, condition.toString(), paraMap, -1, -1, false);
			for (int i = 0;cmIndivManager!=null && cmIndivManager.length>0 && i < cmIndivManager.length; i++) {
				if (iboCmIndivManager[0].getCustId()==cmIndivManager[i].getCustId() && iboCmIndivManager[0].getManagerId()==cmIndivManager[i].getManagerId()) {
					ExceptionUtil.throwBusinessException("CMS8000032");//请重新给客户分配客户经理,此客户已经归属此客户经理了
				}
				if (relType==CmLnConstants.CmRelType.RELTYPE1 && cmIndivManager[i].getRelType()==CmLnConstants.CmRelType.RELTYPE1) {
					ExceptionUtil.throwBusinessException("CMS1100124");//客户已经存在主要服务！
				}
			}
		} else if (CmConstants.ObjectKey.MANAGER_TYPE_GROUP == managerType) {
			IBOCmGroupManagerValue[] iboCmGrpManager=(IBOCmGroupManagerValue[]) custValue.getUserObject(CmConstants.ObjectKey.MANAGER_KEY);
		    condition.append(" and ").append(IBOCmIndivManagerValue.S_CustId).append(" =:custId");
			paraMap.put("custId", iboCmGrpManager[0].getCustId());
			int relType= iboCmGrpManager[0].getRelType();
		    IBOCmGroupManagerValue[] cmGrpManager= BOCmGroupManagerEngine.getBeans(null, condition.toString(), paraMap, -1, -1, false);
			for (int i = 0; i < cmGrpManager.length; i++) {
				if (iboCmGrpManager[0].getCustId()==cmGrpManager[i].getCustId() && iboCmGrpManager[0].getManagerId()==cmGrpManager[i].getManagerId()) {
					ExceptionUtil.throwBusinessException("CMS8000032");//请重新给客户分配客户经理,此客户已经归属此客户经理了
				}
				if (relType==CmLnConstants.CmRelType.RELTYPE1 && cmGrpManager[i].getRelType()==CmLnConstants.CmRelType.RELTYPE1) {
					ExceptionUtil.throwBusinessException("CMS1100124");//客户关系只能存在一个主要服务！
				}
			}
		} else {
			// 没有获取到要保存的对象！
			ExceptionUtil.throwBusinessException("CMS0000074");
		}
		return managerType;
	}
	/**   
	 * @Function saveIndivManagerRel
	 * @Description 保存个人客户经理关系
	 *
	 * @param custValue
	 * @throws Exception
	 *
	 * @version v1.0.0
	 * @author kangzk
	 * @date Jan 17, 2012 3:27:45 PM
	 * 
	 * <strong>Modification History:</strong><br>
	 * Date         Author          Version            Description<br>
	 * ---------------------------------------------------------<br>
	 * Jan 17, 2012     kangzk           v1.0.0               修改原因<br>
	 */
	public void saveIndivManagerRel(IVOCustValue custValue) throws Exception {
		ICmCustomerSV icmCustomer = (ICmCustomerSV) ServiceFactory.getService(ICmCustomerSV.class);
		IBOCmIndivManagerValue[] iboCmIndivManager=(IBOCmIndivManagerValue[]) custValue.getUserObject(CmConstants.ObjectKey.MANAGER_KEY);
		icmCustomer.saveCustManagerIndiv(iboCmIndivManager);
	}

	/**   
	 * @Function saveGroupManagerRel
	 * @Description 保存集团客户经理关系
	 *
	 * @param custValue
	 * @throws Exception
	 *
	 * @version v1.0.0
	 * @author kangzk
	 * @date Jan 17, 2012 3:28:01 PM
	 * 
	 * <strong>Modification History:</strong><br>
	 * Date         Author          Version            Description<br>
	 * ---------------------------------------------------------<br>
	 * Jan 17, 2012     kangzk           v1.0.0               修改原因<br>
	 */
	public void saveGroupManagerRel(IVOCustValue custValue) throws Exception {
		ICmCustomerSV icmCustomer = (ICmCustomerSV)ServiceFactory.getService(ICmCustomerSV.class);
		IBOCmGroupManagerValue[] iboCmGrpManager=(IBOCmGroupManagerValue[]) custValue.getUserObject(CmConstants.ObjectKey.MANAGER_KEY);
		icmCustomer.saveCustManagerGroup(iboCmGrpManager);
	}


}
