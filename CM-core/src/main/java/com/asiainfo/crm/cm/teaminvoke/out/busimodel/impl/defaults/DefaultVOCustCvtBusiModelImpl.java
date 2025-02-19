package com.asiainfo.crm.cm.teaminvoke.out.busimodel.impl.defaults;

import java.util.Iterator;
import java.util.Map;

import org.apache.commons.lang.StringUtils;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import com.ai.appframe2.bo.DataContainer;
import com.ai.appframe2.bo.DataContainerFactory;
import com.ai.common.i18n.CrmLocaleFactory;
import com.ai.common.util.ExceptionUtil;
import com.asiainfo.crm.cm.common.util.CmCommonUtil;
import com.asiainfo.crm.cm.model.bean.VOCustBean;
import com.asiainfo.crm.cm.model.bo.CustomerBean;
import com.asiainfo.crm.cm.model.ivalues.ICustomerValue;
import com.asiainfo.crm.cm.model.ivalues.IVOCustValue;
import com.asiainfo.crm.cm.teaminvoke.out.busimodel.IConvertBusiModel;
import com.asiainfo.crm.cm.teaminvoke.out.busimodel.impl.AbstractVOCustCvtBusiModelImpl;

public class DefaultVOCustCvtBusiModelImpl extends AbstractVOCustCvtBusiModelImpl implements IConvertBusiModel {

	private static transient Log log = LogFactory.getLog(DefaultVOCustCvtBusiModelImpl.class);

	public Object convert(Map parameter) throws Exception {
		if (!CmCommonUtil.isNotEmptyObject(parameter)) {
			if (log.isErrorEnabled()) {
				log.error(CrmLocaleFactory.getResource("CMS0022001", CrmLocaleFactory.getResource("CMS0020197")));
			}
			ExceptionUtil.throwBusinessException("CMS0022001", CrmLocaleFactory.getResource("CMS0020197"));
		}
		// 客户大对象
		IVOCustValue custValue = new VOCustBean();
		Iterator it = parameter.entrySet().iterator();
		while (it.hasNext()) {
			Map.Entry entry = (Map.Entry) it.next();
			// 转换客户信息
			if ("cmCustFrmCustInfo".equalsIgnoreCase(entry.getKey().toString())) {
				ICustomerValue customerValue = new CustomerBean();
				DataContainerFactory.transfer((DataContainer) parameter.get("cmCustFrmCustInfo"), customerValue);
				/*if(customerValue.getCustId() > 0){
					customerValue.setStsToOld();
					customerValue.setCustId(customerValue.getCustId());
				}*/
				custValue.setCustomer(customerValue);
				// 塞其他字段名称不一致的
				// 设置custType提供过户使用
				DataContainer dc = (DataContainer) parameter.get("cmCustFrmCustInfo");
				if (customerValue.getCustType() <= 0) {
					String custType = dc.getExtAttr("CUST_TYPE").toString();
					if (!StringUtils.isBlank(custType)) {
						if(dc.getAsLong("CUST_ID") <= 0){
							customerValue.setCustType(Integer.parseInt(custType));
						}else{
							customerValue.initProperty("CUST_TYPE", custType);
						}
					} else {
						// 过户时候没有获取到客户类型！
						ExceptionUtil.throwBusinessException("CMS0000111");
					}
				}
				//联系人信息
				if(dc.getExtAttr("CONT_NAME") != null)
				{
					if(dc.getAsLong("CUST_ID") <= 0)
						customerValue.setContName(dc.getExtAttr("CONT_NAME").toString());
					else
						customerValue.initProperty("CONT_NAME", dc.getExtAttr("CONT_NAME").toString());
				}
				if(dc.getExtAttr("CONT_MOBILE") != null)
				{
					if(dc.getAsLong("CUST_ID") <= 0)
						customerValue.setContMobile(dc.getExtAttr("CONT_MOBILE").toString());
					else
						customerValue.initProperty("CONT_MOBILE", dc.getExtAttr("CONT_MOBILE").toString());
				}
				
				if(log.isDebugEnabled())
				{
					log.debug("\n customreValue oldProperties:"+customerValue.getOldProperties()+"\n");
					log.debug("\n customreValue newProperties:"+customerValue.getNewProperties()+"\n");
				}
			}
			// 其他情况直接将其放在用户对象中
			else {
				custValue.setUserObject(entry.getKey(), entry.getValue());
			}
		}
		return custValue;
	}
}
