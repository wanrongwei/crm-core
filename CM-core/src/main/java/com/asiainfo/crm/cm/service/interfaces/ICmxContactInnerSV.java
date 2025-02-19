package com.asiainfo.crm.cm.service.interfaces;

import com.asiainfo.crm.cm.inner.party.ivalues.IBOCmPartyContactValue;
import com.asiainfo.crm.cm.inner.contact.ivalues.IBOCmGroupContactHValue;
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
public interface ICmxContactInnerSV {
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
  
  /**
   * 
   * @Function queryGroupContacts
   * @Description 查询集团联系人信息
   *
   * @param condition
   * @param parameter
   * @param startNum
   * @param endNum
   * @return
   * @throws Exception
   *
   * @version v1.0.0
   * @author  huaiduo
   * @date 2012-4-15 下午01:18:49
   * 
   * <strong>Modification History:</strong><br>
   * Date         Author          Version            Description<br>
   * ---------------------------------------------------------<br>
   * 2012-4-15     huaiduo        v1.0.0               修改原因<br>
   */
  public IQBOCmxGroupContactValue[] queryGroupContacts(String billId,long contClass,int starNum, int endNum) throws Exception;
  
  /**
   * 
   * @Function queryGroupContactCount
   * @Description 查询集团联系人数量
   *
   * @param condition
   * @param parameter
   * @return
   * @throws Exception
   *
   * @version v1.0.0
   * @author  huaiduo
   * @date 2012-4-15 下午01:19:49
   * 
   * <strong>Modification History:</strong><br>
   * Date         Author          Version            Description<br>
   * ---------------------------------------------------------<br>
   * 2012-4-15     huaiduo        v1.0.0               修改原因<br>
   */
  public int queryGroupContactCount(String billId,long contClass) throws Exception;
  
  /**
   * 
   * @Function queryGroupContactH
   * @Description 查询集团主要联系人变更历史信息
   *
   * @param custId
   * @param prioryLevel
   * @param starNum
   * @param endNum
   * @return
   * @throws Exception
   *
   * @version v1.0.0
   * @author  huaiduo
   * @date 2012-4-17 下午07:24:50
   * 
   * <strong>Modification History:</strong><br>
   * Date         Author          Version            Description<br>
   * ---------------------------------------------------------<br>
   * 2012-4-17     huaiduo        v1.0.0               修改原因<br>
   */
  public IQBOCmxGroupContactHValue[] queryGroupContactH(long custId, long prioryLevel,long custContId, int starNum, int endNum)throws Exception;
  
  /**
   * 
   * @Function queryGroupContactHCount
   * @Description 查询集团主要联系人变更历史数量
   *
   * @param custId
   * @param prioryLevel
   * @return
   * @throws Exception
   *
   * @version v1.0.0
   * @author  huaiduo
   * @date 2012-4-17 下午07:26:28
   * 
   * <strong>Modification History:</strong><br>
   * Date         Author          Version            Description<br>
   * ---------------------------------------------------------<br>
   * 2012-4-17     huaiduo        v1.0.0               修改原因<br>
   */
  public int queryGroupContactHCount(long custId, long prioryLevel, long custContId) throws Exception;
  
  /**
   * 
   * @Function queryGroupCustAdmins
   * @Description 查询集团管理员信息
   *
   * @param custId
   * @return
   * @throws Exception
   *
   * @version v1.0.0
   * @author  huaiduo
   * @date 2012-4-21 下午01:42:52
   * 
   * <strong>Modification History:</strong><br>
   * Date         Author          Version            Description<br>
   * ---------------------------------------------------------<br>
   * 2012-4-21     huaiduo        v1.0.0               修改原因<br>
   */
  public IBOCmxGroupCustAdminValue[] queryGroupCustAdmins(long custId, int starNum, int endNum)throws Exception;
  
 /**
  * 
  * @Function queryGroupCustAdminsCount
  * @Description 查询集团管理员数量
  *
  * @param custId
  * @return
  * @throws Exception
  *
  * @version v1.0.0
  * @author  huaiduo
  * @date 2012-4-21 下午01:44:45
  * 
  * <strong>Modification History:</strong><br>
  * Date         Author          Version            Description<br>
  * ---------------------------------------------------------<br>
  * 2012-4-21     huaiduo        v1.0.0               修改原因<br>
  */
  public int queryGroupCustAdminsCount(long custId)throws Exception;
  
  /**
   * 
   * @Function queryGroupCustAdmin
   * @Description 查询集团管理员信息
   *
   * @param custId
   * @param custContId
   * @return
   * @throws Exception
   *
   * @version v1.0.0
   * @author  huaiduo
   * @date 2012-4-21 下午02:08:47
   * 
   * <strong>Modification History:</strong><br>
   * Date         Author          Version            Description<br>
   * ---------------------------------------------------------<br>
   * 2012-4-21     huaiduo        v1.0.0               修改原因<br>
   */
  public IBOCmxGroupCustAdminValue[] queryGroupCustAdmin(long custId, long custContId)throws Exception;
  
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
   * @date 2012-4-21 下午03:22:08
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
   * @param custServiceId
   * @param contClass
   * @param startNum
   * @param endNum
   * @return
   * @throws Exception
   *
   * @version v1.0.0
   * @author Administrator
   * @date 2012-4-29 下午4:08:14
   * 
   * <strong>Modification History:</strong><br>
   * Date         Author          Version            Description<br>
   * ---------------------------------------------------------<br>
   * 2012-4-29      huaiduo           v1.0.0               修改原因<br>
   */
  public IQBOCmxGroupContactValue[] queryGroupAddressBook(long custServiceId , long contClass, int startNum, int endNum)throws Exception;
  
  /**
   * 
   * @Function queryGroupAddressBookCount
   * @Description  查询集团通讯录数量
   *
   * @param custServiceId
   * @param contClass
   * @return
   * @throws Exception
   *
   * @version v1.0.0
   * @author Administrator
   * @date 2012-4-29 下午4:10:14
   * 
   * <strong>Modification History:</strong><br>
   * Date         Author          Version            Description<br>
   * ---------------------------------------------------------<br>
   * 2012-4-29      huaiduo           v1.0.0               修改原因<br>
   */
  public int queryGroupAddressBookCount(long custServiceId , long contClass)throws Exception;
  
  /**
   * 
   * @Function saveGroupContactH
   * @Description 保存集团联系人历史
   *
   * @param groupContactHValues
   * @throws Exception
   *
   * @version v1.0.0
   * @author huaiduo
   * @date 2012-5-30 下午3:35:11
   * 
   * <strong>Modification History:</strong><br>
   * Date         Author          Version            Description<br>
   * ---------------------------------------------------------<br>
   * 2012-5-30      huaiduo           v1.0.0               修改原因<br>
   */
  public void saveGroupContactH(IBOCmGroupContactHValue[] groupContactHValues)throws Exception;
}
