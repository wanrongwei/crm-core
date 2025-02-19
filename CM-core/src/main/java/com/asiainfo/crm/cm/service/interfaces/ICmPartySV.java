package com.asiainfo.crm.cm.service.interfaces;

import com.ai.appframe2.bo.DataContainer;
import com.ai.appframe2.common.AIException;
import com.asiainfo.crm.cm.common.ivalues.IBOCMPartyAcctRelValue;
import com.asiainfo.crm.cm.common.ivalues.IQBOCmPartyValue;
import com.asiainfo.crm.cm.common.ivalues.IQBOCmPayerInfoValue;
import com.asiainfo.crm.cm.inner.customer.ivalues.IBOCmGroupContactValue;
import com.asiainfo.crm.cm.inner.customer.ivalues.IBOCmIndivContactValue;
import com.asiainfo.crm.cm.inner.customer.ivalues.IBOCmIndivCustomerValue;
import com.asiainfo.crm.cm.inner.party.bo.BOCmIndivPartyBean;
import com.asiainfo.crm.cm.inner.party.ivalues.IBOCmIndivPartyValue;
import com.asiainfo.crm.cm.inner.party.ivalues.IBOCmPartyContactValue;
import com.asiainfo.crm.cm.inner.party.ivalues.IBOCmPartyRoleValue;
import com.asiainfo.crm.cm.inner.party.ivalues.IBOCmPartyValue;
import com.asiainfo.crm.cm.model.ivalues.IPartyContactValue;
import com.asiainfo.crm.cm.model.ivalues.IPartyValue;
import com.asiainfo.crm.cm.model.ivalues.IVOPartyValue;

/**   
 * @Copyright Copyright (c) 2012 Asiainfo-Linkage
 * 
 * @ClassName 
 * @Description 该类的功能描述
 *
 * @version v1.0.0
 * @author huzq2
 * @date 2012-3-19 下午2:45:32
 * <br>
 * Modification History:<br>
 * Date         Author          Version            Description<br>
 * ---------------------------------------------------------*<br>
 * 2012-3-19     huzq2           v1.0.0               修改原因<br>
 */
public interface ICmPartySV {
	static final  int ROLE_PAYER=5;
	/**   
	 * 根据参与人编号查询参与人信息
	 * @Function queryPartyById
	 * @Description 
	 *
	 * @param partyId 参与人编号
	 * @return 符合条件的参与人信息
	 * @throws Exception
	 *
	 * @version v1.0.0
	 * @author huzq2
	 * @date 2012-3-19 下午2:46:13
	 * 
	 * <strong>Modification History:</strong><br>
	 * Date         Author          Version            Description<br>
	 * ---------------------------------------------------------<br>
	 * 2012-3-19     huzq2           v1.0.0               修改原因<br>
	 */
	public IPartyValue queryPartyById(long partyId) throws Exception;

	/**   
	 * 根据条件查询参与人信息
	 * @Function queryPartys
	 * @Description 
	 *
	 * @param conditionDC
	 * @param startNum
	 * @param endNum
	 * @return
	 * @throws Exception
	 *
	 * @version v1.0.0
	 * @author huzq2
	 * @date 2012-3-19 下午2:47:23
	 * 
	 * <strong>Modification History:</strong><br>
	 * Date         Author          Version            Description<br>
	 * ---------------------------------------------------------<br>
	 * 2012-3-19     huzq2           v1.0.0               修改原因<br>
	 */
	public IPartyValue[] queryPartys(DataContainer conditionDC, int startNum, int endNum) throws Exception;

	/**   
	 * @Function queryPartyCount
	 * @Description 
	 *
	 * @param conditionDC
	 * @return
	 * @throws Exception
	 *
	 * @version v1.0.0
	 * @author huzq2
	 * @date 2012-3-19 下午2:48:09
	 * 
	 * <strong>Modification History:</strong><br>
	 * Date         Author          Version            Description<br>
	 * ---------------------------------------------------------<br>
	 * 2012-3-19     huzq2           v1.0.0               修改原因<br>
	 */
	public int queryPartyCount(DataContainer conditionDC) throws Exception;

	/**   
	 * 保存参与人信息
	 * @Function saveParty
	 * @Description 
	 *
	 * @param partyValue
	 * @throws Exception
	 *
	 * @version v1.0.0
	 * @author huzq2
	 * @date 2012-3-19 下午4:56:43
	 * 
	 * <strong>Modification History:</strong><br>
	 * Date         Author          Version            Description<br>
	 * ---------------------------------------------------------<br>
	 * 2012-3-19     huzq2           v1.0.0               修改原因<br>
	 */
	public void saveParty(IVOPartyValue partyValue) throws Exception;

	/**
	 * 保存参与人信息,增加返回值
	 * @param partyValue
	 * @return
	 * @throws Exception
	 */
	IVOPartyValue savePartyNew(IVOPartyValue partyValue) throws Exception;

	/**   
	 * 保存参与人信息(单独保存)
	 * @Function saveParty
	 * @Description 
	 *
	 * @param partyValue
	 * @throws Exception
	 *
	 * @version v1.0.0
	 * @author huzq2
	 * @date 2012-3-19 下午4:56:58
	 * 
	 * <strong>Modification History:</strong><br>
	 * Date         Author          Version            Description<br>
	 * ---------------------------------------------------------<br>
	 * 2012-3-19     huzq2           v1.0.0               修改原因<br>
	 */
	public void saveParty(IPartyValue partyValue) throws Exception;

	/**   
	 * 根据条件查询参与人联系信息
	 * @Function queryPartyContacts
	 * @Description 
	 *
	 * @param conditionDC
	 * @param startNumq
	 * @param endNum
	 * @return
	 * @throws Exception
	 *
	 * @version v1.0.0
	 * @author huzq
	 * @date 2012-6-6 下午4:17:59
	 * 
	 * <strong>Modification History:</strong><br>
	 * Date         Author          Version            Description<br>
	 * ---------------------------------------------------------<br>
	 * 2012-6-6     huzq           v1.0.0               修改原因<br>
	 */
	public IPartyContactValue[] queryPartyContacts(DataContainer conditionDC, int startNum, int endNum) throws Exception;

	/**   
	 * 根据条件查询参与人联系信息数量
	 * @Function queryPartyContactCount
	 * @Description 
	 *
	 * @param conditionDC
	 * @return
	 * @throws Exception
	 *
	 * @version v1.0.0
	 * @author huzq
	 * @date 2012-6-6 下午4:18:40
	 * 
	 * <strong>Modification History:</strong><br>
	 * Date         Author          Version            Description<br>
	 * ---------------------------------------------------------<br>
	 * 2012-6-6     huzq           v1.0.0               修改原因<br>
	 */
	public int queryPartyContactCount(DataContainer conditionDC) throws Exception;

	/**   
	 * 根据联系信息编号查询参与人联系信息
	 * @Function queryPartyContactById
	 * @Description 
	 *
	 * @param contId
	 * @return
	 * @throws Exception
	 *
	 * @version v1.0.0
	 * @author huzq
	 * @date 2012-6-9 下午3:33:29
	 * 
	 * <strong>Modification History:</strong><br>
	 * Date         Author          Version            Description<br>
	 * ---------------------------------------------------------<br>
	 * 2012-6-9     huzq           v1.0.0               修改原因<br>
	 */
	public IPartyContactValue queryPartyContactById(long contId) throws Exception;
	/**   
	 * 根据contId查询参与人信息
	 * @Function queryPartyInfo
	 * @Description 
	 *
	 * @param contId
	 * @return
	 * @throws Exception
	 *
	 * @version v1.0.0
	 * @author huzq
	 * @date 2012-6-9 下午3:33:29
	 * 
	 * <strong>Modification History:</strong><br>
	 * Date         Author          Version            Description<br>
	 * ---------------------------------------------------------<br>
	 * 2012-6-9     huangqun           v1.0.0               修改原因<br>
	 */
	public IQBOCmPartyValue queryPartyInfo(long partyId)throws Exception;
	/**   
	 * 根据partyName查询参与人信息
	 * @Function queryPartyByName
	 * @Description 
	 *
	 * @param contId
	 * @return
	 * @throws Exception
	 *
	 * @version v1.0.0
	 * @author huzq
	 * @date 2012-6-9 下午3:33:29
	 * 
	 * <strong>Modification History:</strong><br>
	 * Date         Author          Version            Description<br>
	 * ---------------------------------------------------------<br>
	 * 2013-6-9     huangqun           v1.0.0               修改原因<br>
	 */
	public IBOCmPartyValue[] queryPartyByName(String partyName,int startNum,int endNum)throws Exception;
	/**   
	 * 根据partyId查询参与人联系信息
	 * @Function queryPartyContactByPartyId
	 * @Description 
	 *
	 * @param partyId
	 * @return
	 * @throws Exception
	 *
	 * @version v1.0.0
	 * @author huzq
	 * @date 2012-6-9 下午3:33:29
	 * 
	 * <strong>Modification History:</strong><br>
	 * Date         Author          Version            Description<br>
	 * ---------------------------------------------------------<br>
	 * 2014-6-3     huangqun           v1.0.0               修改原因<br>
	 */
	public long queryPartyContactByPartyId(long partyId)throws Exception;
	/**   
	 * 根据partyId,custId查询集团客户联系信息
	 * @Function queryGroupContactByCustIdAndPartyId
	 * @Description 
	 *
	 * @param partyId
	 * @return
	 * @throws Exception
	 *
	 * @version v1.0.0
	 * @author huzq
	 * @date 2012-6-9 下午3:33:29
	 * 
	 * <strong>Modification History:</strong><br>
	 * Date         Author          Version            Description<br>
	 * ---------------------------------------------------------<br>
	 * 2014-6-3     huangqun           v1.0.0               修改原因<br>
	 */
	public IBOCmGroupContactValue[] queryGroupContactByCustIdAndPartyId(long custId,long partyId,long contType)throws Exception;
	/**   
	 * 根据partyName查询参与人信息
	 * @Function queryPartyByNameCount
	 * @Description 
	 *
	 * @param partyId
	 * @return
	 * @throws Exception
	 *
	 * @version v1.0.0
	 * @author huzq
	 * @date 2012-6-9 下午3:33:29
	 * 
	 * <strong>Modification History:</strong><br>
	 * Date         Author          Version            Description<br>
	 * ---------------------------------------------------------<br>
	 * 2014-6-3     huangqun           v1.0.0               修改原因<br>
	 */
	public int queryPartyByNameCount(String partyName)throws Exception;
	/**   
	 * 根据partyName查询参与人信息
	 * @Function queryIndivContactByCustIdAndPartyId
	 * @Description 
	 *
	 * @param partyId
	 * @return
	 * @throws Exception
	 *
	 * @version v1.0.0
	 * @author huzq
	 * @date 2012-6-9 下午3:33:29
	 * 
	 * <strong>Modification History:</strong><br>
	 * Date         Author          Version            Description<br>
	 * ---------------------------------------------------------<br>
	 * 2014-6-3     huangqun           v1.0.0               修改原因<br>
	 */
	public IBOCmIndivContactValue[] queryIndivContactByCustIdAndPartyId(long custId,long partyId)throws Exception;
	
	/**   
	 * @Function queryPartyRole
	 * @Description 
	 *
	 * @param partyId
	 * @return
	 * @throws Exception
	 *
	 * @version v1.0.0
	 * @author Administrator
	 * @date 2014-9-11 下午3:02:20
	 * 
	 * <strong>Modification History:</strong><br>
	 * Date         Author          Version            Description<br>
	 * ---------------------------------------------------------<br>
	 * 2014-9-11     shitian           v1.0.0               修改原因<br>
	 */
	public IBOCmPartyRoleValue[] queryPartyRole(long partyId)throws Exception;
	/**
	 * 根据证件类型和证件号码查找party作为payer
	 * @param certType
	 * @param certCode
	 * @param STARTROWINDEX
	 * @param ENDROWINDEX
	 * @return
	 * @throws Exception
	 */
	public IBOCmPartyValue[] queryPartyByCertTypeAndCertCode(int certType,String certCode,int STARTROWINDEX, int ENDROWINDEX)throws Exception; 
	public int queryCountByCertTypeAndCertCode(int certType,String certCode)throws Exception; 
	/**
	 * 根据条件查询cpr系统或者kob系统将结果作为参与人展示
	 * @param xmlCondtion
	 * @param $STARTROWINDEX
	 * @param $ENDROWINDEX
	 * @return
	 * @throws Exception
	 */
	public IQBOCmPartyValue queryAsPartyByCertCode(String xmlCondtion,int $STARTROWINDEX, int $ENDROWINDEX)throws Exception;

	/**
	 * 根据PartyId和证件类型查询Payer信息,如果不存在Payer角色返回null
	 * @return
	 * @throws Exception
	 */
	public  IQBOCmPayerInfoValue[] queryPayerInfoByCertCode(long partyId,String certCode)throws Exception;
	/**
	 * 查询集团类的Payer
	 * @param partyId
	 * @param certCode
	 * @return
	 * @throws Exception
	 */
	public  IQBOCmPartyValue queryGroupPayer(long partyId,String certCode,IQBOCmPartyValue value)throws Exception;
	/**
	 * 查询个人类的payer
	 * @param partyId
	 * @param certCode
	 * @return
	 * @throws Exception
	 */
	public  IQBOCmPartyValue queryIndivPayer(long partyId,String certCode,IQBOCmPartyValue value)throws Exception;
	/**   
	 * @Function queryPartyAcctRel
	 * @Description 根据partyId查询partyAcctrel
	 *
	 * @param partyId
	 * @return
	 * @throws Exception
	 *
	 * @version v1.0.0
	 * @author Administrator
	 * @date 2014-11-10 下午3:02:20
	 * 
	 */
	public  IBOCMPartyAcctRelValue[] queryPartyAcctRel(long partyId)throws Exception;
	
	/**   
	 * @Function queryPartyByCdns
	 * @Description 
	 *
	 * @param conditions
	 * @param startNum
	 * @param endNum
	 * @return
	 * @throws Exception
	 *
	 * @version v1.0.0
	 * @author Administrator
	 * @date 2014-12-2 下午5:10:17
	 * 
	 * <strong>Modification History:</strong><br>
	 * Date         Author          Version            Description<br>
	 * ---------------------------------------------------------<br>
	 * 2014-12-2     shitian             v1.0.0               修改原因<br>
	 */
	public IPartyValue[] queryPartyByCdns(String conditions, int startNum, int endNum) throws Exception;
	
	/**   
	 * @Function queryPartyByCdnsCount
	 * @Description 
	 *
	 * @param conditions
	 * @return
	 * @throws Exception
	 *
	 * @version v1.0.0
	 * @author Administrator
	 * @date 2014-12-2 下午5:10:20
	 * 
	 * <strong>Modification History:</strong><br>
	 * Date         Author          Version            Description<br>
	 * ---------------------------------------------------------<br>
	 * 2014-12-2     shitian             v1.0.0               修改原因<br>
	 */
	public int queryPartyByCdnsCount(String conditions) throws Exception;
	/**   
	 * @Function queryPartyContact
	 * @Description 根据partyId查partyContact
	 *
	 * @param partyId
	 * @return
	 * @throws Exception
	 *
	 * @version v1.0.0
	 * @author Administrator
	 * @date 2014-12-2 下午5:10:20
	 * 
	 * <strong>Modification History:</strong><br>
	 * Date         Author          Version            Description<br>
	 * ---------------------------------------------------------<br>
	 * 2014-12-29  sunqi            v1.0.0               修改原因<br>
	 */
	public IBOCmPartyContactValue[] queryPartyContact(long partyId) throws Exception;
	
	/**
	 * 根据cont_id 查询cm_party_contact记录
	* <p>Title: </p>
	* <p>Description: </p>
	* <p>Company: AsiaInfo</p> 
	* @author YuJing
	* @date 2019-12-24
	* CmPartySVImpl
	 */
	public IBOCmPartyContactValue[] queryPartyContactByContId(long contId) throws Exception;
	/**   
	 * @Function queryMaskPartyById
	 * @Description 根据partyId查party信息
	 *
	 * @param partyId
	 * @return
	 * @throws Exception
	 *
	 * @version v1.0.0
	 * @author Administrator
	 * @date 2014-12-2 下午5:10:20
	 * 
	 * <strong>Modification History:</strong><br>
	 * Date         Author          Version            Description<br>
	 * ---------------------------------------------------------<br>
	 * 2015-01-20  huangqun            v1.0.0               修改原因<br>
	 */
	public IPartyValue queryMaskPartyById(long partyId) throws Exception;
	/**   
	 * @Function queryPartyInfo
	 * @Description 查询party信息
	 *
	 * @param code
	 * @return
	 * @throws Exception
	 *
	 * @version v1.0.0
	 * @author Administrator
	 * @date 2014-01-21 下午8:02:52
	 * 
	 * <strong>Modification History:</strong><br>
	 * Date         Author          Version            Description<br>
	 * ---------------------------------------------------------<br>
	 * 2015-01-21     huangqun             v1.0.0               修改原因<br>
	 */
	public DataContainer[] queryPartyInfoForUser(String partyName,String certType,String certCode,String cvr,String firstName, String lastName, String custId,String partyId,int startIndex,int endIndex)throws Exception;
	/**   
	 * @Function queryPartyInfo
	 * @Description 查询party信息
	 *
	 * @param code
	 * @return
	 * @throws Exception
	 *
	 * @version v1.0.0
	 * @author Administrator
	 * @date 2014-01-21 下午8:02:52
	 * 
	 * <strong>Modification History:</strong><br>
	 * Date         Author          Version            Description<br>
	 * ---------------------------------------------------------<br>
	 * 2015-01-21     huangqun             v1.0.0               修改原因<br>
	 */
	public int queryPartyInfoForUserCount(String partyName,String certType,String certCode,String cvr,String firstName, String lastName, String custId,String partyId)throws Exception;
	/**   
	 * @Function queryMaskPartyByName
	 * @Description 查询party信息
	 *
	 * @param code
	 * @return
	 * @throws Exception
	 *
	 * @version v1.0.0
	 * @author Administrator
	 * @date 2014-01-22 下午8:02:52
	 * 
	 * <strong>Modification History:</strong><br>
	 * Date         Author          Version            Description<br>
	 * ---------------------------------------------------------<br>
	 * 2015-01-22     huangqun             v1.0.0               修改原因<br>
	 */
	public IPartyValue[] queryMaskPartyByName(String partyName,int startIndex,int endIndex)throws Exception;
	/**   
	 * @Function queryMaskPartyByNameCount
	 * @Description 查询party信息
	 *
	 * @param code
	 * @return
	 * @throws Exception
	 *
	 * @version v1.0.0
	 * @author Administrator
	 * @date 2014-01-22 下午8:02:52
	 * 
	 * <strong>Modification History:</strong><br>
	 * Date         Author          Version            Description<br>
	 * ---------------------------------------------------------<br>
	 * 2015-01-22     huangqun             v1.0.0               修改原因<br>
	 */
	public int queryMaskPartyByNameCount(String partyName)throws Exception;
	/**   
	 * @Function queryCustIdForUser
	 * @Description 分配使用者的时候查询custId
	 *
	 * @param code
	 * @return
	 * @throws Exception
	 *
	 * @version v1.0.0
	 * @author Administrator
	 * @date 2014-01-22 下午8:02:52
	 * 
	 * <strong>Modification History:</strong><br>
	 * Date         Author          Version            Description<br>
	 * ---------------------------------------------------------<br>
	 * 2015-01-22     huangqun             v1.0.0               修改原因<br>
	 */
	public long queryCustIdForUser(long partyId)throws Exception;
	/**   
	 * @Function queryPayerByPartyId
	 * @Description 根据partyId查payer
	 *
	 * @param code
	 * @return
	 * @throws Exception
	 *
	 * @version v1.0.0
	 * @author Administrator
	 * @date 2014-01-22 下午8:02:52
	 * 
	 * <strong>Modification History:</strong><br>
	 * Date         Author          Version            Description<br>
	 * ---------------------------------------------------------<br>
	 * 2015-01-22     huangqun             v1.0.0               修改原因<br>
	 */
	public IQBOCmPartyValue queryPayerByPartyId(long partyId)throws Exception;
	/**   
	 * @Function queryPayerbyCustId
	 * @Description 根据custId查payer, 创建账户时默认的代付代付账户的payer
	 *
	 * @param code
	 * @return
	 * @throws Exception
	 *
	 * @version v1.0.0
	 * @author Administrator
	 * @date 2014-01-22 下午8:02:52
	 * 
	 * <strong>Modification History:</strong><br>
	 * Date         Author          Version            Description<br>
	 * ---------------------------------------------------------<br>
	 * 2015-01-22     huangqun             v1.0.0               修改原因<br>
	 */
	public IQBOCmPartyValue queryPayerbyCustId(long custId)
			throws AIException, Exception;
	/**   
	 * @Function createPayerByCds
	 * @Description 提供个ose使用创建默认的代付账户的payer
	 *
	 * @param value
	 * @return
	 * @throws Exception
	 *
	 * @version v1.0.0
	 * @author Administrator
	 * @date 2014-01-22 下午8:02:52
	 * 
	 * <strong>Modification History:</strong><br>
	 * Date         Author          Version            Description<br>
	 * ---------------------------------------------------------<br>
	 * 2015-01-22     huangqun             v1.0.0               修改原因<br>
	 */
	public void createPayerByCds(IQBOCmPartyValue value)
			throws AIException, Exception;
	/**
	 * 根据payer信息查询账户信息
	 * @param custType 客户类型
	 * @param custId 客户id
	 * @param firstName 
	 * @param LastName
	 * @param cpr 个人客户证件号码
	 * @param birthDay 生日
	 * @param addressId 地址Id
	 * @param companyName 集团客户名
	 * @param kob 集团客户证件号码
	 * @param cvr 税号
	 * @param start
	 * @param end
	 * @return
	 * @throws AIException
	 * @throws Exception
	 */
    public DataContainer[] queryPayerByDts(int custType,long custId,String firstName,String LastName,String cpr,String birthDay,long addressId,String companyName,
    		String kob,String cvr,String insglags[],int start,int end)
		    throws AIException, Exception;
    public DataContainer[] queryPayerByDts(int custType,long custId,String firstName,String LastName,String cpr,String birthDay,long addressId,String companyName,
    		String kob,String cvr,int start,int end)
    				throws AIException, Exception;
    /**
	 * 根据payer信息查询账户信息count
	 * @param custType 客户类型
	 * @param custId 客户id
	 * @param firstName 
	 * @param LastName
	 * @param cpr 个人客户证件号码
	 * @param birthDay 生日
	 * @param addressId 地址Id
	 * @param companyName 集团客户名
	 * @param kob 集团客户证件号码
	 * @param cvr 税号
	 * @return
	 * @throws AIException
	 * @throws Exception
	 */
    public int queryPayerByDtsCount(int custType,long custId,String firstName,String LastName,String cpr,String birthDay,long addressId,String companyName,
    		String kob,String cvr,String insglags[])
    				throws AIException, Exception;
    public int queryPayerByDtsCount(int custType,long custId,String firstName,String LastName,String cpr,String birthDay,long addressId,String companyName,
    		String kob,String cvr)
    				throws AIException, Exception;
    /**
     * 根据名称生日地址查询payer
     * @param name
     * @param birth
     * @param addressId
     * @return
     * @throws Exception
     */
    public IQBOCmPartyValue queryPayerByNBA(String name, String birth, long addressId) throws Exception;
    
    /**
     * 查询所有状态payer
     * @Function querySpecialPayerInfoByCertCode
     * @Description 
     *
     * @param partyId
     * @param certCode
     * @return
     * @throws Exception
     *
     * @version v1.0.0
     * @author yangjh
     * @date 2015-12-31 上午10:48:57
     * 
     * <strong>Modification History:</strong><br>
     * Date         Author          Version            Description<br>
     * ---------------------------------------------------------<br>
     * 2015-12-31     yangjh           v1.0.0               修改原因<br>
     */
    public IQBOCmPayerInfoValue[] querySpecialPayerInfoByCertCode(long partyId, String certCode) throws Exception;
    
    /**   
     * @Function createPayer
     * @Description 
     *
     * @param cprNo
     * @throws Exception
     *
     * @version v1.0.0
     * @author Administrator
     * @date 2016-4-27 下午3:16:54
     * 
     * <strong>Modification History:</strong><br>
     * Date         Author          Version            Description<br>
     * ---------------------------------------------------------<br>
     * 2016-4-27     shitian             v1.0.0               修改原因<br>
     */
    public long createPayer(String cprNo)throws Exception;
    
    
    /**   
     * @Function queryAsPartyByCertCodeAndLog
     * @Description 
     *
     * @param xmlCondition
     * @throws Exception
     */
    public IQBOCmPartyValue queryAsPartyByCertCodeAndLog(String xmlCondition, int $startrowindex, int $endrowindex) throws Exception; 
    
    /**
          *   查询partyList
     * @param xmlCondition
     * @param $startrowindex
     * @param $endrowindex
     * @return
     * @throws Exception
     */
    public IQBOCmPartyValue[] queryPartyByCondition(String xmlCondition, int $startrowindex, int $endrowindex) throws Exception; 
    
    /**
          * 查询partyList
     * @param xmlCondition
     * @return
     * @throws Exception
     */
    public int queryPartyByConditionCount(String xmlCondition) throws Exception; 
      
    /**   
     * @Function queryPartyAcctRel
     * @Description 
     *
     * @param partyId
     * @param acctIds
     * @return
     * @throws Exception
     *
     * @version v1.0.0
     * @author shitian
     * @date 2017-2-14 下午5:15:58
     * 
     * <strong>Modification History:</strong><br>
     * Date         Author          Version            Description<br>
     * ---------------------------------------------------------<br>
     * 2017-2-14      shitian           v1.0.0               修改原因<br>
     */
    public IBOCMPartyAcctRelValue[] queryPartyAcctRel(long partyId,long[] acctIds) throws Exception;

    
    public DataContainer[] queryAcctInfoByPartyId(long custId, long partyId,long acctId) throws Exception;

    /**
          * 查询客户与账户的关系(只管有效的)
     * @param customerId
     * @param accountId
     *  @author yujing
     * @return
     */
    public DataContainer[] queryCustomerAndAccountRelationship(long customerId,long accountId) throws Exception;
     
    
	/**
	 *  查询 Party 按照条件
	 * @param name
	 * @param birth
	 * @param addressId
	 * @param certType
	 * @param certCode
	 * @param partyName
	 * @param partyId
	 * @param partyType
	 * @param queryFlag 1:查询数量  2：查询所有数据 3：分页查询
	 * @param startNum
	 * @param endNum
	 * @return
	 * @throws Exception
	 */
	public Object queryPartysByCondition(String firstName,String lastName,String birth, long addressId,int certType, String certCode,String partyName,long partyId,String partyType,int queryFlag, int startNum,int endNum) throws Exception;

	/**
	 * 根据CprNumber 查询是否客户存在
	 * @param certCode
	 * @return
	 * @throws Exception 
	 */
	public IQBOCmPartyValue checkIsHasParty(String certCode) throws Exception ;
	
	/**
	 * 新增cm_indiv_party
	 * @param bean
	 * @throws Exception
	 */
	public void saveCmIndivParty(BOCmIndivPartyBean bean) throws Exception;
	
	public IBOCmIndivPartyValue[] queryCmIndivPartyByPartyId(long partyId) throws Exception;
	
	public void dealCmIndivPartyForContact(long partyId,int operationType,String regionId,IBOCmIndivPartyValue cmIndivPartyValue) throws Exception;
	
	/**
	 * 失效party相关资料 cm_party，cm_party_contact, cm_party_role，cm_indiv_party
	 * @param partyId
	 * @throws Exception 
	 */
	public void expirePartyInfo(long partyId) throws Exception;
	
	/**
	 * 修改payer相关资料
	 * @param partyId
	 * @param firstName
	 * @param lastName
	 * @param birthday
	 * @param addressId
	 * @param addressDetail
	 * @param certCode
	 * @return
	 * @throws Exception
	 */
	long modifyPartyInformation(Long partyId, String firstName, String lastName, String birthday, Long addressId, String addressDetail, int gender, String certCode) throws Exception;

	/**
	 * 根据partyId查个人客户
	 *
	 * @param partyId
	 * @return
	 * @throws Exception
	 */
	IBOCmIndivCustomerValue[] queryCustByPartyId(long partyId) throws Exception;

	/**
	 * 根据partyId查询CM_PARTY、CM_INDIV_PARTY、CM_PARTY_CONTACT
	 *
	 * @param partyId
	 * @return
	 * @throws Exception
	 */
	IQBOCmPayerInfoValue queryPartyInfoByPartyId(long partyId) throws Exception;

	/**
	 * 根据partyId查询CM_PARTY_CONTACT
	 *
	 * @param partyId
	 * @return
	 * @throws Exception
	 */
	IBOCmPartyContactValue queryPartyContactInfoByPartyId(long partyId) throws Exception;
}
