package com.asiainfo.crm.common.service.impl;
import java.rmi.RemoteException;
import com.asiainfo.crm.common.ivalues.IBOBsCommonDistrictValue;
import com.ai.appframe2.complex.cache.CacheFactory;
import com.ai.appframe2.service.ServiceFactory;
import com.ai.common.ivalues.IBOBsParaDetailValue;
import com.ai.common.ivalues.IBOBsStaticDataValue;
import com.asiainfo.crm.common.dao.interfaces.IBaseDAO;
import com.asiainfo.crm.common.ivalues.IBOBsOperationValue;
import com.asiainfo.crm.common.ivalues.IBOBsSoOrdDepositeCfgValue;
import com.asiainfo.crm.common.service.interfaces.IBaseSV;

/**
 * 静态数据表的查询服务
 * 
 * @author linzhaoming 2010-12-27
 * 
 */
public class BaseSVImpl implements IBaseSV {
	
	public IBOBsParaDetailValue[] getAllBsParaDetail() throws Exception,
	RemoteException {
		IBaseDAO baseDao = (IBaseDAO) ServiceFactory.getService(IBaseDAO.class);
		return baseDao.getAllBsParaDetail();
	}
	

	

	public IBOBsOperationValue[] getAllBsOperation() throws Exception,
			RemoteException {
		IBaseDAO baseDao = (IBaseDAO) ServiceFactory.getService(IBaseDAO.class);
		return baseDao.getAllBsOperation();
	}

	
	public IBOBsSoOrdDepositeCfgValue[] getAllBsSoOrdDepositeCfgs() throws Exception, RemoteException {
		IBaseDAO baseDao = (IBaseDAO) ServiceFactory.getService(IBaseDAO.class);
		return baseDao.getAllBsSoOrdDepositeCfgs();
	}

	public IBOBsCommonDistrictValue[] queryAllCommonDistricts() throws Exception {
		IBaseDAO dao = (IBaseDAO)ServiceFactory.getService(IBaseDAO.class);
		return dao.queryAllCommonDistricts();
	}

	public IBOBsStaticDataValue[] getStaticData(String codeType)
			throws RemoteException, Exception {
        return (IBOBsStaticDataValue[])(IBOBsStaticDataValue[])CacheFactory.get(com.ai.common.cache.StaticDataCacheImpl.class, "_CT^" + codeType);
	}

	public IBOBsStaticDataValue getStaticData(String codeType, String codeValue)
			throws RemoteException, Exception {
        return (IBOBsStaticDataValue)CacheFactory.get(com.ai.common.cache.StaticDataCacheImpl.class, codeType + "^" + codeValue);
	}

}
