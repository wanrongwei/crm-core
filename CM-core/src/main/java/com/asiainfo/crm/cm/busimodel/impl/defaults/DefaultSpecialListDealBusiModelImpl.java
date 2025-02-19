package com.asiainfo.crm.cm.busimodel.impl.defaults;

import com.ai.appframe2.bo.DataContainer;
import com.ai.common.util.ExceptionUtil;
import com.asiainfo.crm.cm.busimodel.IDealBusiModel;
import com.asiainfo.crm.cm.busimodel.impl.evaluation.AbstractSpecialListDealBusiModelImpl;
import com.asiainfo.crm.cm.common.CmConstants;
import com.asiainfo.crm.cm.common.CmServiceFactory;
import com.asiainfo.crm.cm.common.util.CmCommonUtil;
import com.asiainfo.crm.cm.model.ivalues.ISpecialListValue;
import com.asiainfo.crm.cm.model.ivalues.IVOSpecialListValue;
import com.asiainfo.crm.cm.service.interfaces.ICmSpecialListSV;


public class DefaultSpecialListDealBusiModelImpl extends AbstractSpecialListDealBusiModelImpl implements IDealBusiModel {

	

	protected void processBeforeDeal(IVOSpecialListValue specialListValue) throws Exception {
		//add By huangxl 重复添加黑名单拦截
		if (specialListValue.hasSpecialLists()) {
			ISpecialListValue[] specialListValues = specialListValue.getSpecialLists();
			ICmSpecialListSV cmSpecialListSV = CmServiceFactory.getSpecialListSV();
			for (int i = 0; i < specialListValues.length; i++) {
				if (specialListValues[i].isNew()) {
					DataContainer conditionDC = new DataContainer();
					conditionDC.set(ISpecialListValue.S_CustId, specialListValues[i].getCustId());
					conditionDC.set(ISpecialListValue.S_ListSource, specialListValues[i].getListSource());
					conditionDC.set(ISpecialListValue.S_MonType, specialListValues[i].getMonType());
					conditionDC.set(ISpecialListValue.S_State, CmConstants.RecordState.USE);
					ISpecialListValue listValue = cmSpecialListSV.querySpecialList(conditionDC); 
					if(CmCommonUtil.isNotEmptyObject(listValue)){
						//该用户已被添加！无需重复添加
						ExceptionUtil.throwBusinessException("CMS9978706");
					}
				}
			}
		}
	}

	@Override
	protected void setOtherDefaultValue(IVOSpecialListValue specialListValue) throws Exception {
		// TODO Auto-generated method stub
		
	}

	@Override
	protected void dealOtherThings(IVOSpecialListValue specialListValue) throws Exception {
		// TODO Auto-generated method stub
		
	}

	@Override
	protected void notify(IVOSpecialListValue specialListValue) throws Exception {
		// TODO Auto-generated method stub
		
	}

	@Override
	protected void processAfterDeal(IVOSpecialListValue specialListValue) throws Exception {
		// TODO Auto-generated method stub
		
	}

	@Override
	protected void validateOtherThings(IVOSpecialListValue specialListValue) throws Exception {
		// TODO Auto-generated method stub
		
	}

	

}
