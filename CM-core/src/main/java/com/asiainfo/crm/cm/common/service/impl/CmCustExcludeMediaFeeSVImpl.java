package com.asiainfo.crm.cm.common.service.impl;

import java.rmi.RemoteException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.commons.lang.StringUtils;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import com.ai.appframe2.service.ServiceFactory;
import com.asiainfo.crm.cm.common.bo.BOCmCustExcludeMediaFeeBean;
import com.asiainfo.crm.cm.common.dao.interfaces.ICmCustExcludeMediaFeeDAO;
import com.asiainfo.crm.cm.common.ivalues.IBOCmCustExcludeMediaFeeValue;
import com.asiainfo.crm.cm.common.service.interfaces.ICmCustExcludeMediaFeeSV;
import com.asiainfo.crm.inter.exe.webservice.client.copydan.CopyDanServiceClient;

public class CmCustExcludeMediaFeeSVImpl implements ICmCustExcludeMediaFeeSV {

	private static final Log log = LogFactory.getLog(CmCustExcludeMediaFeeSVImpl.class);
	
	private static final String CVR_NUMBER = "vatRegistrationNo";
	private static final String NAME = "name";
	private static final String NAME2 = "name2";
	private static final String ADDRESS = "address";
	private static final String ADDRESS2 = "address2";
	private static final String POST_CODE = "postCode";
	private static final String APPROVAL_NUMBER = "approvalNumber";
	private static final String CITY = "city";
	private static final String REGION_CODE = "countryRegionCode";
	
	//批量插入的条数
	private static final int  saveBatchLimit = 1000;
	
	public ICmCustExcludeMediaFeeDAO getCmCustExludeMediaFeeDao() {
		return (ICmCustExcludeMediaFeeDAO) ServiceFactory.getService(ICmCustExcludeMediaFeeDAO.class);
	}
	
	@Override
	public void saveBatch(IBOCmCustExcludeMediaFeeValue[] values) throws Exception {
		ICmCustExcludeMediaFeeDAO dao = getCmCustExludeMediaFeeDao();
		dao.saveBatch(values);
	}

	@Override
	public void deleteAll() throws Exception {
		ICmCustExcludeMediaFeeDAO dao = getCmCustExludeMediaFeeDao();
		dao.deleteAll();
	}

	@Override
	public void SyncCopydanClientCVRList() throws Exception {
		List list = CopyDanServiceClient.getAllCustomers();
		if(list != null && list.size()>0) {
			log.info("customersListSize = "+ list.size());
			log.info("--- deleteAll--- start");
			deleteAll();
			log.info("--- deleteAll--- end");
			int i=1;
			List<IBOCmCustExcludeMediaFeeValue> valueList = new ArrayList<IBOCmCustExcludeMediaFeeValue>();
			for(int j=0;j<list.size();j++) {
				IBOCmCustExcludeMediaFeeValue value = parseJson(list.get(j));
				value.setId(j+1);
				valueList.add(value);
				if(i==saveBatchLimit) {
					log.info("...........saveBatch...... index: [ "+ (j+1) +" ].......start....");
					saveBatch(valueList.toArray(new IBOCmCustExcludeMediaFeeValue[0]));
					log.info("...........saveBatch...... index: [ "+ (j+1) +" ].......end......");
					valueList.clear();
					i=1;
				}else {
					i++;
				}
			}
			//保存最后剩下的数据
			saveBatch(valueList.toArray(new IBOCmCustExcludeMediaFeeValue[0]));
		}else {
			log.info("customersList is empty!");
		}
		
	}
	
	public IBOCmCustExcludeMediaFeeValue parseJson(Object obj) throws Exception{
		IBOCmCustExcludeMediaFeeValue value = new BOCmCustExcludeMediaFeeBean();
		if(obj == null) {
			return value;
		}
		Map<String,Object> map = (Map<String,Object>) obj;
		if (map.containsKey(CVR_NUMBER)) {
			value.setCvrNumber(objToString(map.get(CVR_NUMBER)));
		}
		if (map.containsKey(NAME)) {
			value.setName(objToString(map.get(NAME)));
		}
		if (map.containsKey(NAME2)) {
			value.setName2(objToString(map.get(NAME2)));
		}
		if (map.containsKey(ADDRESS)) {
			value.setAddress(objToString(map.get(ADDRESS)));
		}
		if (map.containsKey(ADDRESS2)) {
			value.setAddress2(objToString(map.get(ADDRESS2)));
		}
		if (map.containsKey(POST_CODE)) {
			value.setPostCode(objToString(map.get(POST_CODE)));
		}
		if (map.containsKey(APPROVAL_NUMBER)) {
			value.setApprovalNumber(objToString(map.get(APPROVAL_NUMBER)));
		}
		if (map.containsKey(CITY)) {
			value.setCity(objToString(map.get(CITY)));
		}
		if (map.containsKey(REGION_CODE)) {
			value.setRegionCode(objToString(map.get(REGION_CODE)));
		}
		return value;
		
	}
	
	public String objToString(Object o) {
		return o==null? "" : o.toString();
	}

	@Override
	public String isCustomerExcludeMediaFee(String cvrNumber) throws Exception, RemoteException {
		String result = "N";
		if(StringUtils.isBlank(cvrNumber)) {
			return result;
		}
		ICmCustExcludeMediaFeeDAO dao = getCmCustExludeMediaFeeDao();
		StringBuilder condition = new StringBuilder();
		HashMap map = new HashMap<>();
		condition.append(IBOCmCustExcludeMediaFeeValue.S_CvrNumber).append(" = :S_CvrNumber ");
		map.put("S_CvrNumber", cvrNumber);
		IBOCmCustExcludeMediaFeeValue[] values = dao.getCmCustExcludeMediaFeeFromWhereSql(condition.toString(), map);
		if(values != null && values.length>0) {
			result = "Y";
		}
		return result;
	}

}
