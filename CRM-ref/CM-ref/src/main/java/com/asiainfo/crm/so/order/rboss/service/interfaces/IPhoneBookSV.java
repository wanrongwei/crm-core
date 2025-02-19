package com.asiainfo.crm.so.order.rboss.service.interfaces;

import java.rmi.RemoteException;
import java.util.Map;

import com.ai.omframe.order.ivalues.IOVOrderCustomer;
import com.asiainfo.crm.so.order.rboss.ivalues.IBOOrdPhoneBookValue;

public interface IPhoneBookSV {
	public void startDealPhoneBook(IOVOrderCustomer aOVOrderCustomer,boolean isQuit) throws RemoteException, Exception;
	//public void dealPhoneBook(IOVOrderCustomer aOVOrderCustomer, boolean isQuit) throws RemoteException, Exception;
	public void dealPhoneBooKByOrderId(long customerOrderId, boolean isQuit) throws RemoteException, Exception;
	public void dealPhoneBooKForChgAddress(long customerOrderId, boolean isQuit) throws RemoteException, Exception;
	public void modifyCustomerCVRState(long custId,long sUserId) throws Exception;
	public void modifyCustInfo(long custId) throws RemoteException, Exception;
	public void savePhoneBook(IBOOrdPhoneBookValue  phoneBookValue)throws RemoteException, Exception;
	public void batchSavePhoneBook(IBOOrdPhoneBookValue[] IordPhoneBookValues) throws RemoteException, Exception;
	public void dealPhoneBookWithOrderOffer(long customerOrderId, boolean isQuit,String orderOfferIds) throws RemoteException, Exception;
//	public void startDealPhoneBook(IOVOrderCustomer aOVOrderCustomer,boolean isQuit) throws RemoteException, Exception;
	//public Map getParamForPhoneBook(long customerOrderId,String ordOffers) throws Exception;
	public Map getIsShowFlag(long custId, long userId,long phoneBookAttrId, long offerInsId) throws Exception;
	public Map getPhoneBookFlag(long offerId) throws RemoteException, Exception;
	public void deletePhoneBook(long userId, String billId, long customerOrderId) throws Exception;
	public void saveOrChangePhoneBook(Map<String, String> m, long userId,
			String billId, long customerOrderId) throws Exception;
	public void changePhonebookWhenModifyAddress(long custId,long addressId) throws Exception;
}
