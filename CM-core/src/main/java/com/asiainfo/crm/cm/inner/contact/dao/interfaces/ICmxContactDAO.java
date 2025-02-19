package com.asiainfo.crm.cm.inner.contact.dao.interfaces;

import java.util.Map;

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
 * @date 2012-3-28 下午07:18:21
 * <br>
 * Modification History:<br>
 * Date         Author          Version            Description<br>
 * ---------------------------------------------------------*<br>
 * 2012-3-28     mofangrui           v1.0.0               修改原因<br>
 */
public interface ICmxContactDAO {
	/**
	 * 
	 * @Function queryCustContact
	 * @Description 
	 *
	 * @param condition
	 * @param paramerMap
	 * @return
	 * @throws Exception
	 *
	 * @version v1.0.0
	 * @author mofangrui
	 * @date 2012-3-28 下午07:18:30
	 * 
	 * <strong>Modification History:</strong><br>
	 * Date         Author          Version            Description<br>
	 * ---------------------------------------------------------<br>
	 * 2012-3-28     mofangrui          v1.0.0               修改原因<br>
	 */
   public IBOCmPartyContactValue[] queryCustContact(String condition, Map paramerMap ) throws Exception ;
   
   /**
    * 
    * @Function queryGroupContacts
    * @Description 查询集团联系人信息
    *
    * @param cols
    * @param condition
    * @param parameter
    * @param startNum
    * @param endNum
    * @return
    * @throws Exception
    *
    * @version v1.0.0
    * @author  huaiduo
    * @date 2012-4-15 下午01:26:34
    * 
    * <strong>Modification History:</strong><br>
    * Date         Author          Version            Description<br>
    * ---------------------------------------------------------<br>
    * 2012-4-15     huaiduo        v1.0.0               修改原因<br>
    */
   public IQBOCmxGroupContactValue[] queryGroupContacts(String[] cols, String condition, Map parameter, int startNum, int endNum) throws Exception;
   
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
    * @date 2012-4-15 下午01:24:42
    * 
    * <strong>Modification History:</strong><br>
    * Date         Author          Version            Description<br>
    * ---------------------------------------------------------<br>
    * 2012-4-15     huaiduo        v1.0.0               修改原因<br>
    */
   public int queryGroupContactCount(String condition, Map parameter) throws Exception;
   
   /**
    * 
    * @Function queryGroupContactH
    * @Description 查询集团主要联系人变更历史信息
    *
    * @param cols
    * @param condition
    * @param parameter
    * @param startNum
    * @param endNum
    * @return
    * @throws Exception
    *
    * @version v1.0.0
    * @author  huaiduo
    * @date 2012-4-17 下午07:30:23
    * 
    * <strong>Modification History:</strong><br>
    * Date         Author          Version            Description<br>
    * ---------------------------------------------------------<br>
    * 2012-4-17     huaiduo        v1.0.0               修改原因<br>
    */
   public IQBOCmxGroupContactHValue[] queryGroupContactH(String[] cols, String condition, Map parameter, int startNum, int endNum) throws Exception;
   
   /**
    * 
    * @Function queryGroupContactHCount
    * @Description 查询集团主要联系人变更历史数量
    *
    * @param condition
    * @param parameter
    * @return
    * @throws Exception
    *
    * @version v1.0.0
    * @author  huaiduo
    * @date 2012-4-17 下午07:31:56
    * 
    * <strong>Modification History:</strong><br>
    * Date         Author          Version            Description<br>
    * ---------------------------------------------------------<br>
    * 2012-4-17     huaiduo        v1.0.0               修改原因<br>
    */
   public int queryGroupContactHCount(String condition, Map parameter) throws Exception;
  
   /**
    * 
    * @Function queryGroupCustAdmins
    * @Description 查询集团管理员信息 
    *
    * @param cols
    * @param condition
    * @param parameter
    * @param startNum
    * @param endNum
    * @return
    * @throws Exception
    *
    * @version v1.0.0
    * @author  huaiduo
    * @date 2012-4-21 下午01:47:53
    * 
    * <strong>Modification History:</strong><br>
    * Date         Author          Version            Description<br>
    * ---------------------------------------------------------<br>
    * 2012-4-21     huaiduo        v1.0.0               修改原因<br>
    */
   public IBOCmxGroupCustAdminValue[] queryGroupCustAdmins(String[] cols, String condition, Map parameter, int startNum, int endNum)throws Exception;
   
   /**
    * 
    * @Function queryCmxGroupAdminsCount
    * @Description 查询集团管理员数量
    *
    * @param condition
    * @param parameter
    * @return
    * @throws Exception
    *
    * @version v1.0.0
    * @author  huaiduo
    * @date 2012-4-21 下午01:49:27
    * 
    * <strong>Modification History:</strong><br>
    * Date         Author          Version            Description<br>
    * ---------------------------------------------------------<br>
    * 2012-4-21     huaiduo        v1.0.0               修改原因<br>
    */
   public int queryCmxGroupAdminsCount(String condition ,Map parameter)throws Exception;
   
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
    * @date 2012-4-21 下午03:25:03
    * 
    * <strong>Modification History:</strong><br>
    * Date         Author          Version            Description<br>
    * ---------------------------------------------------------<br>
    * 2012-4-21     huaiduo        v1.0.0               修改原因<br>
    */
   public void saveGroupCustAdmin(IBOCmxGroupCustAdminValue  groupCustAdminValue)throws Exception;
   
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
    * @date 2012-5-30 下午3:36:55
    * 
    * <strong>Modification History:</strong><br>
    * Date         Author          Version            Description<br>
    * ---------------------------------------------------------<br>
    * 2012-5-30      huaiduo           v1.0.0               修改原因<br>
    */
   public void saveGroupContactH(IBOCmGroupContactHValue[] groupContactHValues)throws Exception;
}
