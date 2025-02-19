package com.asiainfo.crm.cm.inner.customer.dao.impl;

import java.util.Map;

import com.asiainfo.crm.cm.inner.customer.bo.BOCmIndivCustomerEngine;
import com.asiainfo.crm.cm.inner.customer.ivalues.IBOCmIndivCustomerValue;
import com.asiainfo.crm.cm.inner.customer.bo.BOCmIndivCustomerBean;
import com.asiainfo.crm.cm.inner.customer.bo.BOCmIndivCustomerHEngine;
import com.asiainfo.crm.cm.inner.customer.bo.BOCmxCustLanguageEngine;
import com.asiainfo.crm.cm.inner.customer.bo.BOCmxCustRealNameInfoEngine;
import com.asiainfo.crm.cm.inner.customer.bo.BOCmxCustSecondCardInfoEngine;
import com.asiainfo.crm.cm.inner.customer.bo.BOCmxIndivCustExtEngine;
import com.asiainfo.crm.cm.inner.customer.bo.BOCmxIndivCustHisEngine;
import com.asiainfo.crm.cm.inner.customer.bo.QBOCmxCustomerRelEngine;
import com.asiainfo.crm.cm.inner.customer.dao.interfaces.ICmxIndivCustDAO;
import com.asiainfo.crm.cm.inner.customer.ivalues.IBOCmIndivCustomerHValue;
import com.asiainfo.crm.cm.inner.customer.ivalues.IBOCmxCustLanguageValue;
import com.asiainfo.crm.cm.inner.customer.ivalues.IBOCmxCustRealNameInfoValue;
import com.asiainfo.crm.cm.inner.customer.ivalues.IBOCmxCustSecondCardInfoValue;
import com.asiainfo.crm.cm.inner.customer.ivalues.IBOCmxIndivCustExtValue;
import com.asiainfo.crm.cm.inner.customer.ivalues.IBOCmxIndivCustHisValue;
import com.asiainfo.crm.cm.inner.customer.ivalues.IQBOCmxCustomerRelValue;


/**   
 * @Copyright Copyright (c) 2012 Asiainfo-Linkage
 * 
 * @ClassName CmxIndivCustDAOImpl
 * @Description 上海个人客户扩展信息相关数据实现类
 *
 * @version v1.0.0
 * @author zhangyin
 * @date 2012-3-14 上午09:56:55
 * <br>
 * Modification History:<br>
 * Date         Author          Version            Description<br>
 * ---------------------------------------------------------*<br>
 * 2012-3-14     zhangyin           v1.0.0               修改原因<br>
 */
public class CmxIndivCustDAOImpl implements ICmxIndivCustDAO {

	public void saveIndivCustExt(IBOCmxIndivCustExtValue cmxIndivCustExtValue) throws Exception {
		if (cmxIndivCustExtValue != null) {
			BOCmxIndivCustExtEngine.save(cmxIndivCustExtValue);
		}
	}

	public IBOCmxIndivCustExtValue[] queryIndivCustExt(String[] cols,String condition, Map parameter, int startNum, int endNum) throws Exception {
		return BOCmxIndivCustExtEngine.getBeans(cols, condition, parameter, startNum, endNum, false);
	}

	public IQBOCmxCustomerRelValue[] queryIndivCustomer(String[] cols,String condition, Map parameter, int startNum, int endNum) throws Exception {
		return QBOCmxCustomerRelEngine.getBeans(cols, condition, parameter, startNum, endNum, false);
	}

	public int queryIndivCustomerCount(String condition, Map parameter) throws Exception {
		return QBOCmxCustomerRelEngine.getBeansCount(condition, parameter);
	}

	public IBOCmIndivCustomerValue[] queryCmIndivCust(String condition, Map parameter) throws Exception {
		
		return BOCmIndivCustomerEngine.getBeans(condition, parameter);
	}

	public void saveIndivCustHis(IBOCmxIndivCustHisValue indivCustHisValue)	throws Exception {
		if (indivCustHisValue != null) {
			BOCmxIndivCustHisEngine.save(indivCustHisValue);
		}
	}

	public IBOCmIndivCustomerHValue[] queryIndivCustHis(String sql, Map parameter) throws Exception {
		return BOCmIndivCustomerHEngine.getBeansFromSql(sql, parameter);
	}

	public void saveCustRealNameInfo(IBOCmxCustRealNameInfoValue cmxCustRealNameInfoValue) throws Exception {
		if(cmxCustRealNameInfoValue != null){
			BOCmxCustRealNameInfoEngine.save(cmxCustRealNameInfoValue);
		}
	}

	public IBOCmxCustLanguageValue[] queryCustLanguage(String condition, Map parameter) throws Exception {
		return BOCmxCustLanguageEngine.getBeans(condition, parameter);
	}

	public void saveCustLanguage(IBOCmxCustLanguageValue custLanguageValue) throws Exception {
		if (custLanguageValue != null) {
			BOCmxCustLanguageEngine.save(custLanguageValue);
		}
	}

	public IBOCmxCustRealNameInfoValue[] queryCustRealNameInfo(String condition, Map parameter) throws Exception {
		return BOCmxCustRealNameInfoEngine.getBeans(condition, parameter);
	}

	public IBOCmxCustSecondCardInfoValue[] queryCustSecondCardInfo(String condition, Map parameter) throws Exception {
		return BOCmxCustSecondCardInfoEngine.getBeans(condition, parameter);
	}

	public void saveCustSecondCardInfo(IBOCmxCustSecondCardInfoValue custSecondCardInfoValue) throws Exception {
		if (custSecondCardInfoValue != null) {
			BOCmxCustSecondCardInfoEngine.save(custSecondCardInfoValue);
		}
	}

}
