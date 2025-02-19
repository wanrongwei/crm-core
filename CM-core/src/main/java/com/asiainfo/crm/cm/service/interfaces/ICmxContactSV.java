package com.asiainfo.crm.cm.service.interfaces;

import com.asiainfo.crm.cm.inner.party.ivalues.IBOCmPartyContactValue;
import com.asiainfo.crm.cm.model.ivalues.IContactValue;
import com.asiainfo.crm.cm.inner.contact.ivalues.IBOCmxGroupCustAdminValue;
import com.asiainfo.crm.cm.inner.contact.ivalues.IQBOCmxGroupContactHValue;
import com.asiainfo.crm.cm.inner.contact.ivalues.IQBOCmxGroupContactValue;

/**
 * 
 * @Copyright Copyright (c) 2012 Asiainfo-Linkage
 * 
 * @ClassName 
 * @Description 该类的功能描述
 *
 * @version v1.0.0
 * @author  mofangrui
 * @date 2012-3-28 下午07:10:27
 * <br>
 * Modification History:<br>
 * Date         Author          Version            Description<br>
 * ---------------------------------------------------------*<br>
 * 2012-3-28     mofangrui           v1.0.0               修改原因<br>
 */
public interface ICmxContactSV {
	/**
	 * 
	 * @Function queryContactById
	 * @Description  查询一组客户联系人。
	 *
	 * @param partyIds
	 * @return
	 * @throws Exception
	 *
	 * @version v1.0.0
	 * @author mofangrui
	 * @date 2012-3-28 下午07:13:32
	 * 
	 * <strong>Modification History:</strong><br>
	 * Date         Author          Version            Description<br>
	 * ---------------------------------------------------------<br>
	 * 2012-3-28     mofangrui          v1.0.0               修改原因<br>
	 */
  public IBOCmPartyContactValue[] queryContactById( long[] partyIds ) throws Exception;
  
	  /**   根据客户编号查询客户联系人信息
	 * @Function queryCustContactsByCustId
	 * @Description 
	 *
	 * @param custId
	 * @return
	 * @throws Exception
	 *
	 * @version v1.0.0
	 * @author zhangyin
	 * @date 2012-3-29 下午08:54:03
	 * 
	 * <strong>Modification History:</strong><br>
	 * Date         Author          Version            Description<br>
	 * ---------------------------------------------------------<br>
	 * 2012-3-29     zhangyin           v1.0.0               修改原因<br>
	 */
	public IContactValue queryCustContactsByCustId(long custId) throws Exception;
	
	/**   根据账户编号查询客户联系人信息
	 * @Function queryAcctContactsByAcctId
	 * @Description 
	 *
	 * @param acctId
	 * @return
	 * @throws Exception
	 *
	 * @version v1.0.0
	 * @author zhangyin
	 * @date 2012-3-30 上午09:57:27
	 * 
	 * <strong>Modification History:</strong><br>
	 * Date         Author          Version            Description<br>
	 * ---------------------------------------------------------<br>
	 * 2012-3-30     zhangyin           v1.0.0               修改原因<br>
	 */
	public IContactValue queryAcctContactsByAcctId(long acctId) throws Exception;
	
	/**
	 * 
	 * @Function queryGroupContact
	 * @Description 根据条件查询集团联系人信息
	 *
	 * @param containerDC
	 * @param starNum
	 * @param endNum
	 * @return
	 * @throws Exception
	 *
	 * @version v1.0.0
	 * @author  huaiduo
	 * @date 2012-4-15 下午01:11:16
	 * 
	 * <strong>Modification History:</strong><br>
	 * Date         Author          Version            Description<br>
	 * ---------------------------------------------------------<br>
	 * 2012-4-15     huaiduo        v1.0.0               修改原因<br>
	 */
	public IQBOCmxGroupContactValue[] queryGroupContact(String billId,long contClass,int starNum,int endNum)throws Exception;
	
	/**
	 * 
	 * @Function queryGroupContactCount
	 * @Description 根据条件查询集团联系人数量
	 *
	 * @param containerDC
	 * @return
	 * @throws Exception
	 *
	 * @version v1.0.0
	 * @author  huaiduo
	 * @date 2012-4-15 下午01:13:23
	 * 
	 * <strong>Modification History:</strong><br>
	 * Date         Author          Version            Description<br>
	 * ---------------------------------------------------------<br>
	 * 2012-4-15     huaiduo        v1.0.0               修改原因<br>
	 */
	public int queryGroupContactCount(String billId,long contClass)throws Exception;
	
	/**
	 * 
	 * @Function queryGroupContactsH
	 * @Description 查询集团主要联系人变更历史信息
	 *
	 * @param custId
	 * @param prioryLevel
	 * @return
	 * @throws Exception
	 *
	 * @version v1.0.0
	 * @author  huaiduo
	 * @date 2012-4-17 下午07:16:02
	 * 
	 * <strong>Modification History:</strong><br>
	 * Date         Author          Version            Description<br>
	 * ---------------------------------------------------------<br>
	 * 2012-4-17     huaiduo        v1.0.0               修改原因<br>
	 */
	public IQBOCmxGroupContactHValue[] queryGroupContactsH(long custId, long prioryLevel ,int starNum, int endNum)throws Exception;
	
	/**
	 * 
	 * @Function queryGroupContactHCount
	 * @Description 查询集团主要联系人变更数量
	 *
	 * @param custId
	 * @param prioryLevel
	 * @return
	 * @throws Exception
	 *
	 * @version v1.0.0
	 * @author  huaiduo
	 * @date 2012-4-17 下午07:18:45
	 * 
	 * <strong>Modification History:</strong><br>
	 * Date         Author          Version            Description<br>
	 * ---------------------------------------------------------<br>
	 * 2012-4-17     huaiduo        v1.0.0               修改原因<br>
	 */
	public int queryGroupContactHCount(long custId, long prioryLevel) throws Exception;
	
	/**
	 * 
	 * @Function queryGroupAdmin
	 * @Description 根据条件查询集团管理员信息
	 *
	 * @param criteria
	 * @param starNum
	 * @param endNum
	 * @return
	 * @throws Exception
	 *
	 * @version v1.0.0
	 * @author  huaiduo
	 * @date 2012-4-19 下午07:35:46
	 * 
	 * <strong>Modification History:</strong><br>
	 * Date         Author          Version            Description<br>
	 * ---------------------------------------------------------<br>
	 * 2012-4-19     huaiduo        v1.0.0               修改原因<br>
	 */
	public IBOCmxGroupCustAdminValue[] queryGroupAdmins(long custId,int startNum,int endNum)throws Exception; 
	
	/**
	 * 
	 * @Function queryGroupAdminCount
	 * @Description 根据条件查询集团管理员数量
	 *
	 * @param criteria
	 * @return
	 * @throws Exception
	 *
	 * @version v1.0.0
	 * @author  huaiduo
	 * @date 2012-4-19 下午07:37:31
	 * 
	 * <strong>Modification History:</strong><br>
	 * Date         Author          Version            Description<br>
	 * ---------------------------------------------------------<br>
	 * 2012-4-19     huaiduo        v1.0.0               修改原因<br>
	 */
	public int queryGroupAdminsCount(long custId)throws Exception;
	
	/**
	 * 
	 * @Function queryGroupCustAdmin
	 * @Description 查询集团管理员信息
	 *
	 * @param custId
	 * @return
	 * @throws Exception
	 *
	 * @version v1.0.0
	 * @author  huaiduo
	 * @date 2012-4-21 下午02:01:34
	 * 
	 * <strong>Modification History:</strong><br>
	 * Date         Author          Version            Description<br>
	 * ---------------------------------------------------------<br>
	 * 2012-4-21     huaiduo        v1.0.0               修改原因<br>
	 */
	public IBOCmxGroupCustAdminValue[] queryGroupCustAdmin(long custId,long custContId)throws Exception;
	
	/**
	 * 
	 * @Function saveGroupCustAdmin
	 * @Description 保存集团管理员
	 *
	 * @param groupCustAdminValue
	 * @throws Exception
	 *
	 * @version v1.0.0
	 * @author  huaiduo
	 * @date 2012-4-21 下午03:10:07
	 * 
	 * <strong>Modification History:</strong><br>
	 * Date         Author          Version            Description<br>
	 * ---------------------------------------------------------<br>
	 * 2012-4-21     huaiduo        v1.0.0               修改原因<br>
	 */
	public void saveGroupCustAdmin(IBOCmxGroupCustAdminValue groupCustAdminValue)throws Exception;
	
	/**
	 * 
	 * @Function queryGroupAddressBook
	 * @Description 查询集团通讯录信息
	 *
	 * @param custServerId
	 * @param contClass
	 * @param startNum
	 * @param endNum
	 * @return
	 * @throws Exception
	 *
	 * @version v1.0.0
	 * @author Administrator
	 * @date 2012-4-29 下午3:33:35
	 * 
	 * <strong>Modification History:</strong><br>
	 * Date         Author          Version            Description<br>
	 * ---------------------------------------------------------<br>
	 * 2012-4-29     huaiduo           v1.0.0               修改原因<br>
	 */
	public IQBOCmxGroupContactValue[] queryGroupAddressBook(long custServiceId ,long contClass, int startNum, int endNum)throws Exception;
	
	/**
	 * 
	 * @Function quertGroupAddressBookCount
	 * @Description 查询集团通讯录数量
	 *
	 * @param custServiceId
	 * @param contClass
	 * @return
	 * @throws Exception
	 *
	 * @version v1.0.0
	 * @author Administrator
	 * @date 2012-4-29 下午3:40:05
	 * 
	 * <strong>Modification History:</strong><br>
	 * Date         Author          Version            Description<br>
	 * ---------------------------------------------------------<br>
	 * 2012-4-29      huaiduo           v1.0.0               修改原因<br>
	 */
	public int quertGroupAddressBookCount(long custServiceId, long contClass)throws Exception;
	
	/**
	 * 
	 * @Function queryG1G2Info
	 * @Description 查询G1G2信息
	 *
	 * @return
	 * @throws Exception
	 *
	 * @version v1.0.0
	 * @author huaiduo
	 * @date 2012-7-4 下午8:44:58
	 * 
	 * <strong>Modification History:</strong><br>
	 * Date         Author          Version            Description<br>
	 * ---------------------------------------------------------<br>
	 * 2012-7-4     huaiduo          v1.0.0               修改原因<br>
	 */
	public String queryG1G2Info(String billId) throws Exception;
	
}
