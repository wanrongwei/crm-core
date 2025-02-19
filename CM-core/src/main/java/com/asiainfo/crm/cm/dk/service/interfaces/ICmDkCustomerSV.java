package com.asiainfo.crm.cm.dk.service.interfaces;

import java.util.Date;
import java.util.List;
import java.util.Map;

import com.ai.appframe2.bo.DataContainer;
import com.ai.appframe2.common.DataContainerInterface;
import com.asiainfo.crm.cm.common.ivalues.IBOCmInsCmrelValue;
import com.asiainfo.crm.cm.common.ivalues.IBOIdentificationValue;
import com.asiainfo.crm.cm.common.ivalues.IQBOCmPayerInfoValue;
import com.asiainfo.crm.cm.common.util.ws.address;
import com.asiainfo.crm.cm.inner.customer.ivalues.IBOCmCustRequestTaskValue;
import com.asiainfo.crm.cm.inner.customer.ivalues.IQBOCmCustContMediumAndTypeValue;
import com.asiainfo.crm.cm.model.ivalues.IContactValue;
import com.asiainfo.crm.cm.model.ivalues.ICustOrganizeValue;
import com.asiainfo.crm.cm.model.ivalues.IGroupMemberValue;
import com.asiainfo.crm.cm.model.ivalues.IVOCustValue;
import com.asiainfo.crm.cm.model.ivalues.IVOPartyValue;

public interface ICmDkCustomerSV {

	/**   
	 * @Function queryIndivCustomerDtl
	 * @Description 查询个人客户的信息，地址，联系信息
	 * 地址枚举CONT_MED_TYPE_ID：
	 * voCustValue.getCustAddress()
	 * 12：邮寄地址
	 * 14：送货地址
	 * 11：法律地址
	 * 15：农场地址
	 * 16：联系地址
	 * 
	 * 联系方式枚举CONT_MED_TYPE_ID：
	 * voCustValue.getCustContMedium()
	 * 21：传真
	 * 31：EMAIL
	 * 32：联系电话
	 * 33：短信
	 * 35：紧急联系
	 * 36：平信
	 * 37：彩信
	 * 
	 * 客户多认证枚举值IDEN_TYPE：
	 * voCustValue.getCustIdentification()
	 * 1:	facebook
	 * 2:	twitter
	 * 3:	google
	 * 8:	CPR
	 * 17:	KOB
	 *
	 * @param custId
	 * @param cprNo
	 * @param firstName
	 * @param lastName
	 * @param birthday
	 * @param address
	 * @return
	 * @throws Exception
	 *
	 * @version v1.0.0
	 * @author Administrator
	 * @date 2014-9-17 下午2:56:50
	 * 
	 * <strong>Modification History:</strong><br>
	 * Date         Author          Version            Description<br>
	 * ---------------------------------------------------------<br>
	 * 2014-9-17     shitian             v1.0.0               修改原因<br>
	 */
	public IVOCustValue queryIndivCustomerDtl(long custId, String cprNo, String firstName, String lastName, Date birthday, address address) throws Exception;
	
	/**
	 *  针对OSE，提供Birthday 为可选条件查询个人客户信息
	* <p>Title: </p>
	* <p>Description: </p>
	* <p>Company: AsiaInfo</p> 
	* @author YuJing
	* @date 2019-12-16
	* CmDkCustomerSVImpl
	 */
	public IVOCustValue queryIndivCustomerDtlForOSE(long custId, String cprNo, String firstName, String lastName, Date birthday, address address) throws Exception ;
	
	/**
	 * 根据partyId 查询party 对应的相关信息
	* <p>Title: </p>
	* <p>Description: </p>
	* <p>Company: AsiaInfo</p> 
	* @author YuJing
	* @date 2019-12-12
	* ICmDkCustomerSV
	 */
	public IVOPartyValue queryPartyInfo(String partyId) throws Exception;

	/**   
	 * @Function queryCustIdentifications
	 * @Description 查询客户多认证
	 *
	 * @param partyId
	 * @param idenType
	 * @param idenCode
	 * @return
	 * @throws Exception
	 *
	 * @version v1.0.0
	 * @author Administrator
	 * @date 2014-9-17 下午4:19:53
	 * 
	 * <strong>Modification History:</strong><br>
	 * Date         Author          Version            Description<br>
	 * ---------------------------------------------------------<br>
	 * 2014-9-17     shitian             v1.0.0               修改原因<br>
	 */
	public IBOIdentificationValue[] queryCustIdentifications(long partyId, int idenType, String idenCode) throws Exception;

	/**   
	 * @Function saveCustIdentification
	 * @Description 
	 *
	 * @param custIdentificationValues
	 * @throws Exception
	 *
	 * @version v1.0.0
	 * @author Administrator
	 * @date 2014-9-17 下午4:21:05
	 * 
	 * <strong>Modification History:</strong><br>
	 * Date         Author          Version            Description<br>
	 * ---------------------------------------------------------<br>
	 * 2014-9-17     shitian             v1.0.0               修改原因<br>
	 */
	public void saveCustIdentification(IBOIdentificationValue[] custIdentificationValues) throws Exception;

	/**
	 * List Department
	 * @param custId
	 * @return
	 * @throws Exception
	 */
	public ICustOrganizeValue[] listDepartment(long custId,String name) throws Exception;
	
	/**
	 * 根据部门id查部门信息
	 * @param deptId
	 * @return
	 * @throws Exception
	 */
	public ICustOrganizeValue queryDepartmentById(long deptId) throws Exception;
	/**   
	 * @Function queryCustRootOrganize
	 * @Description 查询集团根节点部门
	 *
	 * @param custId
	 * @return
	 * @throws Exception
	 *
	 * @version v1.0.0
	 * @author Administrator
	 * @date 2014-9-18 上午11:37:06
	 * 
	 * <strong>Modification History:</strong><br>
	 * Date         Author          Version            Description<br>
	 * ---------------------------------------------------------<br>
	 * 2014-9-18     shitian             v1.0.0               修改原因<br>
	 */
	public ICustOrganizeValue queryCustRootOrganize(long custId) throws Exception;

	/**   
	 * @Function queryCustOrganizesByParentId
	 * @Description 
	 *
	 * @param parentDeptId
	 * @param deptType
	 * @param startNum
	 * @param endNum
	 * @return
	 * @throws Exception
	 *
	 * @version v1.0.0
	 * @author Administrator
	 * @date 2014-9-18 下午2:11:41
	 * 
	 * <strong>Modification History:</strong><br>
	 * Date         Author          Version            Description<br>
	 * ---------------------------------------------------------<br>
	 * 2014-9-18     shitian             v1.0.0               修改原因<br>
	 */
	public ICustOrganizeValue[] queryCustOrganizesByParentId(long parentDeptId, int deptType, int startNum, int endNum) throws Exception;

	/**   
	 * @Function queryGroupDeptBills
	 * @Description 查询集团部门与号码关系
	 *
	 * @param criteria
	 * @param startNum
	 * @param endNum
	 * @return
	 * @throws Exception
	 *
	 * @version v1.0.0
	 * @author Administrator
	 * @date 2014-9-21 下午2:40:58
	 * 
	 * <strong>Modification History:</strong><br>
	 * Date         Author          Version            Description<br>
	 * ---------------------------------------------------------<br>
	 * 2014-9-21     shitian             v1.0.0               修改原因<br>
	 */
	public IGroupMemberValue[] queryGroupDeptBills(String criteria, int startNum, int endNum) throws Exception;

	/**   
	 * @Function queryGroupDeptBillsCount
	 * @Description 查询集团部门与号码关系数量
	 *
	 * @param criteria
	 * @return
	 * @throws Exception
	 *
	 * @version v1.0.0
	 * @author Administrator
	 * @date 2014-9-21 下午2:41:29
	 * 
	 * <strong>Modification History:</strong><br>
	 * Date         Author          Version            Description<br>
	 * ---------------------------------------------------------<br>
	 * 2014-9-21     shitian             v1.0.0               修改原因<br>
	 */
	public int queryGroupDeptBillsCount(String criteria) throws Exception;

	/**   
	 * @Function queryCustomerByIdenInfo
	 * @Description 
	 *
	 * @return
	 * @throws Exception
	 *
	 * @version v1.0.0
	 * @author Administrator
	 * @date 2014-9-21 下午4:54:34
	 * 
	 * <strong>Modification History:</strong><br>
	 * Date         Author          Version            Description<br>
	 * ---------------------------------------------------------<br>
	 * 2014-9-21     shitian             v1.0.0               修改原因<br>
	 */
	public IVOCustValue queryCustomerByIdenInfo(int idenType, String idenCode) throws Exception;

	/**   
	 * @Function queryGroupDeptUser
	 * @Description 查询集团名下所有号码，以及与部门的分配关系
	 *
	 * @param custId
	 * @param startNum
	 * @param endNum
	 * @return
	 * @throws Exception
	 *
	 * @version v1.0.0
	 * @author Administrator
	 * @date 2014-9-22 上午10:12:17
	 * 
	 * <strong>Modification History:</strong><br>
	 * Date         Author          Version            Description<br>
	 * ---------------------------------------------------------<br>
	 * 2014-9-22     shitian             v1.0.0               修改原因<br>
	 */
	public IBOCmInsCmrelValue[] queryGroupDeptUser(long custId, String billId, int startNum, int endNum) throws Exception;

	/**   
	 * @Function queryGroupDeptUserCount
	 * @Description 
	 *
	 * @param custId
	 * @return
	 * @throws Exception
	 *
	 * @version v1.0.0
	 * @author Administrator
	 * @date 2014-9-22 上午10:13:12
	 * 
	 * <strong>Modification History:</strong><br>
	 * Date         Author          Version            Description<br>
	 * ---------------------------------------------------------<br>
	 * 2014-9-22     shitian             v1.0.0               修改原因<br>
	 */
	public int queryGroupDeptUserCount(long custId, String billId) throws Exception;

	/**   
	 * @Function queryCmInsCmrel
	 * @Description 根据关系类型查询客户名下用户
	 *
	 * @param custId
	 * @param relType
	 * CmConstants.RelaType
	 * 1	使用者
	 * 2	拥有者
	 * @param userId
	 * @return
	 * @throws Exception
	 *
	 * @version v1.0.0
	 * @author Administrator
	 * @date 2014-9-22 上午10:20:45
	 * 
	 * <strong>Modification History:</strong><br>
	 * Date         Author          Version            Description<br>
	 * ---------------------------------------------------------<br>
	 * 2014-9-22     shitian             v1.0.0               修改原因<br>
	 */
	public IBOCmInsCmrelValue[] queryCmInsCmrel(long custId, long userId, int relType, int start, int end) throws Exception;

	/**   
	 * @Function queryCmInsCmrelCount
	 * @Description 
	 *
	 * @param custId
	 * @param relType
	 * @return
	 * @throws Exception
	 *
	 * @version v1.0.0
	 * @author Administrator
	 * @date 2014-9-22 上午10:43:10
	 * 
	 * <strong>Modification History:</strong><br>
	 * Date         Author          Version            Description<br>
	 * ---------------------------------------------------------<br>
	 * 2014-9-22     shitian             v1.0.0               修改原因<br>
	 */
	public int queryCmInsCmrelCount(long custId, long userId, int relType) throws Exception;

	/**   
	 * @Function queryIndivCustByNumber
	 * @Description 根据电话号码查询使用者/归属者客户信息
	 *
	 * @param serviceNumber
	 * @param relaType
	 * CmConstants.RelaType
	 * 1	使用者
	 * 2	归属者
	 * @return
	 * @throws Exception
	 *
	 * @version v1.0.0
	 * @author Administrator
	 * @date 2014-9-23 下午2:26:06
	 * 
	 * <strong>Modification History:</strong><br>
	 * Date         Author          Version            Description<br>
	 * ---------------------------------------------------------<br>
	 * 2014-9-23     shitian             v1.0.0               修改原因<br>
	 */
	public IVOCustValue queryIndivCustByNumber(String serviceNumber, int relaType) throws Exception;

	/**   
	 * @Function queryCustRequestTasks
	 * @Description 
	 *
	 * @param custId
	 * @param requestType
	 * CmConstants.RequestType
	 * 1	删除
	 * 4	新增
	 * @return
	 * @throws Exception
	 *
	 * @version v1.0.0
	 * @author Administrator
	 * @date 2014-9-23 下午4:35:51
	 * 
	 * <strong>Modification History:</strong><br>
	 * Date         Author          Version            Description<br>
	 * ---------------------------------------------------------<br>
	 * 2014-9-23     shitian             v1.0.0               修改原因<br>
	 */
	public IBOCmCustRequestTaskValue[] queryCustRequestTasks(long custId, int requestType) throws Exception;

	/**   
	 * @Function sendAOContactToSec
	 * @Description 创建AO联系人需要送权限
	 *
	 * @param partyDC
	 * @param mediums
	 * @throws Exception
	 *
	 * @version v1.0.0
	 * @author Administrator
	 * @date 2014-9-25 上午10:28:55
	 * 
	 * <strong>Modification History:</strong><br>
	 * Date         Author          Version            Description<br>
	 * ---------------------------------------------------------<br>
	 * 2014-9-25     shitian             v1.0.0               修改原因<br>
	 */
	public long sendAOContactToSec(DataContainerInterface partyDC, long custContId) throws Exception;

	/**   
	 * @Function queryCustomerContacts
	 * @Description 查询客户联系人信息
	 * 个人客户就查询客户本身的联系信息；集团客户返回集团的联系人信息
	 *
	 * @param custId
	 * @param contType	CmConstants.GroupContType
	 * 1	普通联系人
	 * 2	决策人
	 * 3	AO联系人
	 * 5	法人
	 * @return
	 * @throws Exception
	 *
	 * @version v1.0.0
	 * @author Administrator
	 * @date 2014-9-28 下午3:01:14
	 * 
	 * <strong>Modification History:</strong><br>
	 * Date         Author          Version            Description<br>
	 * ---------------------------------------------------------<br>
	 * 2014-9-28     shitian             v1.0.0               修改原因<br>
	 */
	public IContactValue[] queryCustomerContacts(long custId, int contType) throws Exception;

	/**   
	 * @Function queryCustomerContacts
	 * @Description 根据联系人类型查询客户联系人信息
	 *
	 * @param custId
	 * @param contType	CmConstants.GroupContType
	 * 1	普通联系人
	 * 2	决策人
	 * 17	AO联系人
	 * 5	法人
	 * @return
	 * @throws Exception
	 *
	 * @version v1.0.0
	 * @author Administrator
	 * @date 2014-9-28 下午5:02:56
	 * 
	 * <strong>Modification History:</strong><br>
	 * Date         Author          Version            Description<br>
	 * ---------------------------------------------------------<br>
	 * 2014-9-28     shitian             v1.0.0               修改原因<br>
	 */
	public IContactValue[] queryGroupCustomerContacts(long custId, int contType) throws Exception;

	/**   
	 * @Function queryIndivCustomers
	 * @Description 
	 *
	 * @param legalAddressId
	 * @param firstName
	 * @param laseName
	 * @param contactPhoneNumber
	 * @param Segment
	 * @param categroy
	 * @return
	 *  CUST_ID                                           CUSTID                      
		FIRST_NAME                                        FIRSTNAME                   
		LAST_NAME                                         LASTNAME                              
		CUST_CERT_CODE                                    CPRNUMBER                   
		PERSON_STATUS                                     CPRSTATUS                   
		STATUS_EFF_DATE                                   CPRSTATUSDATE               
		CREATE_DATE                                       CREATEDDATE                 
		CUST_STATUS                                       CUSTOMERSTATUS              
		GENDER                                            GENDER                      
		BIRTHDAY                                          BIRTHDAY                    
		PHYSIOLOGICAL_STATE                               PHYSIOLOGYSTATUS            
		SEGMENT_ID                                        SEGMENT                     
		CONT_NAME                                         LEGALGUARDIAN               
		EFFECTIVE_DATE                                    LEGALGUARDIANUPDATEDATE     
		CUR_RESIDENCE_STR_DATE                            MOVEDATE                    
		DIRECT_MARKETING_PROTECTION                       COMMERCIALPROTECTION        
		PROTECT_EFF_DATE                                  PROTECTEFFECTIVEDATE        
		PROTECT_EXPIRE_DATE                               PROTECTEXPIREDATE           
		MANUAL_COMMERCIAL_PROTECTION                      PERMISSIONPROPOSAL          
		MANUAL_PROTECT_EFFECTIVE_DATE                     EFFECTIVEDATE               
		MANUAL_PROTECT_EXPIRE_DATE                        EXPIRATIONDATE              
		PROTECT_STAUS   (0否，1是)                         PROTECTSTATUS               
		ADDRESS_DETAIL                                 	  CUSTOMERLEGALADDRESS  
		REGION_ID										  REGION_ID
														  SEGMENT_NAME
	 * @throws Exception
	 *
	 * @version v1.0.0
	 * @author Administrator
	 * @date 2014-10-28 下午5:01:12
	 * 
	 * <strong>Modification History:</strong><br>
	 * Date         Author          Version            Description<br>
	 * ---------------------------------------------------------<br>
	 * 2014-10-28     shitian             v1.0.0               修改原因<br>
	 */
	public DataContainerInterface[] queryIndivCustomers(long custIds[], String state, int custStatus, long legalAddressId, String firstName, String laseName,
			String contactPhoneNumber, long segment, long categroy, String custServiceId, int start, int end) throws Exception;

	/**   
	 * @Function queryIndivCustomersCount
	 * @Description 查询数量
	 *
	 * @param legalAddressId
	 * @param firstName
	 * @param laseName
	 * @param contactPhoneNumber
	 * @param segment
	 * @param categroy
	 * @param start
	 * @param end
	 * @return
	 * @throws Exception
	 *
	 * @version v1.0.0
	 * @author Administrator
	 * @date 2014-10-29 上午10:08:38
	 * 
	 * <strong>Modification History:</strong><br>
	 * Date         Author          Version            Description<br>
	 * ---------------------------------------------------------<br>
	 * 2014-10-29     shitian             v1.0.0               修改原因<br>
	 */
	public int queryIndivCustomersCount(long custIds[], String state, int custStatus, long legalAddressId, String firstName, String laseName, String contactPhoneNumber,
			long segment, long categroy, String custServiceId) throws Exception;

	/**   
	 * @Function queryGroupCustomers
	 * @Description 
	 *
	 * @param cvrNo
	 * @param shortName
	 * @param companyName
	 * @param legalAddressId
	 * @param contPhone
	 * @param managerId			客户经理ID
	 * @param managerGroupId	客户经理组ID
	 * @param segment
	 * @param category
	 * @return
	 *  CUSTID											CUST_ID,                    
		COMPANYNAME                                     CUST_NAME,                  
		SHORTNAME                                       SHORT_NAME,                 
		CVRNUMBER                                	    TAX_ID,       		       
		KOBNUMBER                                       CUST_CERT_CODE,             
		SEGMENT                                         SEGMENT_ID,                 
		CATEGORY                                        CUST_SERVICE_LEVEL,         
		SUBSEGMENT                                      GROUP_SUB_TYPE,             
		LEGALPERSONID                                   LEGAL_CUST_ID,              
		WEBSITE                                         GROUP_WEB,                  
		STATUS                                          CUST_STATUS,                
		ACCOUNTMANAGER                                  MANAGER_ID,                 
		CONTACTPOINT                                    IS_CONTACT_POINT,           
		PASSWORD                                        CUST_PASSWORD,              
		CUSTOMERLEGALADDRESS                            ADDRESS_DETAIL,             
		BICOMPANYNAME                                   BI_COMPANY_NAME,            
		LEGALFORM                                       LEGAL_FORM,                 
		RATING                                          RATING_CODE,                
		COMPANYTYPE                                     GROUP_TYPE,                 
		REGISTRATIONDATE                                REGISTRATION_DATE,          
		MKTPERMISSION                                   DIRECT_MARKETING_PROTECTION,
		AKSSTATUS                                       AKS_STATUS,                 
		AKSREGISTRATIONDATE                             AKS_REGISTRATION_DATE,      
		CREDITCLASS                                     CREDIT_LEVEL,               
		CREDITMAX                                       CREDIT_VALUE,               
		EMPLOYEENUMBERRANGE                             STAFF_AMOUNT_TYPE,          
		EMPLOYEENUMBER                                  STAFF_AMOUNT,               
		EMPLOYEEHISTORICAL                              LAST_YEAR_EMPLOYEES,        
		REMARKS                                         REMARKS  
		  												SEGMENT_NAME
		  												MANAGER_NAME
	 * @throws Exception
	 *
	 * @version v1.0.0
	 * @author Administrator
	 * @date 2014-10-29 下午3:17:34
	 * 
	 * <strong>Modification History:</strong><br>
	 * Date         Author          Version            Description<br>
	 * ---------------------------------------------------------<br>
	 * 2014-10-29     shitian             v1.0.0               修改原因<br>
	 */
	public DataContainerInterface[] queryGroupCustomers(long custIds[], String state, int custStatus, String cvrNo, String shortName, String companyName, long legalAddressId,
			String contPhone, long managerId, long managerGroupId, long segment, long category, String custServiceId, int start, int end) throws Exception;

	/**
	 * 新增接口 获取ext15有值的former集团客户
	 * @param custStatus
	 * @param start
	 * @param end
	 * @return
	 * @throws Exception
	 */
	public DataContainerInterface[] queryHasExt15FormerGroupCustomers(int start, int end) throws Exception;
	/**   
	 * @Function queryGroupCustomersCount
	 * @Description 
	 *
	 * @param cvrNo
	 * @param shortName
	 * @param companyName
	 * @param legalAddressId
	 * @param contPhone
	 * @param managerId
	 * @param managerGroupId
	 * @param segment
	 * @param category
	 * @return
	 * @throws Exception
	 *
	 * @version v1.0.0
	 * @author Administrator
	 * @date 2014-10-29 下午5:07:18
	 * 
	 * <strong>Modification History:</strong><br>
	 * Date         Author          Version            Description<br>
	 * ---------------------------------------------------------<br>
	 * 2014-10-29     shitian             v1.0.0               修改原因<br>
	 */
	public int queryGroupCustomersCount(long custIds[], String state, int custStatus, String cvrNo, String shortName, String companyName, long legalAddressId, String contPhone,
			long managerId, long managerGroupId, long segment, long category, String custServiceId) throws Exception;

	/**   
	 * @Function queryCustByAddressId
	 * @Description 
	 *
	 * @param addressIds
	 * @param addressType
	 * @return
	 * @throws Exception
	 *
	 * @version v1.0.0
	 * @author Administrator
	 * @date 2014-12-5 上午10:27:11
	 * 
	 * <strong>Modification History:</strong><br>
	 * Date         Author          Version            Description<br>
	 * ---------------------------------------------------------<br>
	 * 2014-12-5     shitian             v1.0.0               修改原因<br>
	 */
	public IQBOCmCustContMediumAndTypeValue[] queryCustByAddressId(long[] addressIds, int addressType) throws Exception;

	/**   
	 * @Function queryCustomerByAddress
	 * @Description 
	 *
	 * @param addressIds
	 * @param addressType
	 * @return
	 * @throws Exception
	 *
	 * @version v1.0.0
	 * @author Administrator
	 * @date 2014-12-5 上午10:52:12
	 * 
	 * <strong>Modification History:</strong><br>
	 * Date         Author          Version            Description<br>
	 * ---------------------------------------------------------<br>
	 * 2014-12-5     shitian             v1.0.0               修改原因<br>
	 */
	public DataContainerInterface[] queryCustomerByAddress(long[] addressIds, int addressType) throws Exception;

	/**   
	 * @Function queryBillingAddress
	 * @Description 
	 *
	 * @param custId
	 * @param acctId
	 * @return
	 * @throws Exception
	 *
	 * @version v1.0.0
	 * @author Administrator
	 * @date 2014-12-24 下午5:27:13
	 * 
	 * <strong>Modification History:</strong><br>
	 * Date         Author          Version            Description<br>
	 * ---------------------------------------------------------<br>
	 * 2014-12-24     shitian             v1.0.0               修改原因<br>
	 */
	public Map queryBillingAddress(long custId, long acctId) throws Exception;

	/**   
	 * @Function queryCmInsCmrel
	 * @Description 
	 *
	 * @param userId
	 * @return
	 * @throws Exception
	 *
	 * @version v1.0.0
	 * @author Administrator
	 * @date 2014-01-15 下午5:27:13
	 * 
	 * <strong>Modification History:</strong><br>
	 * Date         Author          Version            Description<br>
	 * ---------------------------------------------------------<br>
	 * 2014-01-15     huangqun            v1.0.0               修改原因<br>
	 */
	public IBOCmInsCmrelValue[] queryCmInsCmrel(long userId, int startIndex, int endIndex) throws Exception;

	/**   
	 * @Function queryCmInsCmrelCount
	 * @Description 
	 *
	 * @param userId
	 * @return
	 * @throws Exception
	 *
	 * @version v1.0.0
	 * @author Administrator
	 * @date 2014-01-15 下午5:27:13
	 * 
	 * <strong>Modification History:</strong><br>
	 * Date         Author          Version            Description<br>
	 * ---------------------------------------------------------<br>
	 * 2014-01-15     huangqun            v1.0.0               修改原因<br>
	 */
	public int queryCmInsCmrelCount(long userId) throws Exception;

	/**   
	 * @Function queryGroupMember
	 * @Description 
	 *
	 * @param 
	 * @return
	 * @throws Exception
	 *
	 * @version v1.0.0
	 * @author Administrator
	 * @date 2014-04-15 下午5:27:13
	 * 
	 * <strong>Modification History:</strong><br>
	 * Date         Author          Version            Description<br>
	 * ---------------------------------------------------------<br>
	 * 2014-04-15     huangqun            v1.0.0               修改原因<br>
	 */
	public DataContainer[] queryGroupDeptBill(String criteria, int startNum, int endNum) throws Exception;

	/**   
	 * @Function queryGroupMemberCount
	 * @Description 
	 *
	 * @param 
	 * @return
	 * @throws Exception
	 *
	 * @version v1.0.0
	 * @author Administrator
	 * @date 2014-04-15 下午5:27:13
	 * 
	 * <strong>Modification History:</strong><br>
	 * Date         Author          Version            Description<br>
	 * ---------------------------------------------------------<br>
	 * 2014-04-15     huangqun            v1.0.0               修改原因<br>
	 */
	public int queryGroupDeptBillCount(String criteria) throws Exception;

	/**
	 * 提供给OSE查询部门的userList接口
	 * @param custId
	 * @param deptId
	 * @param limit
	 * @param offset
	 * @return
	 * @throws Exception
	 */
	public DataContainer[] queryGroupDeptBill4Ose(Long custId, Long deptId , int limit, int offset) throws Exception;
	/**   
	 * @Function queryCustomersByCustNameAndAddress
	 * @Description 
	 *
	 * @param 
	 * @return
	 * @throws Exception
	 *
	 * @version v1.0.0
	 * @author Administrator
	 * @date 2014-04-27 下午5:27:13
	 * 
	 * <strong>Modification History:</strong><br>
	 * Date         Author          Version            Description<br>
	 * ---------------------------------------------------------<br>
	 * 2014-04-27     huangqun            v1.0.0               修改原因<br>
	 */
	public DataContainer[] queryCustomersByCustNameAndAddress(String custName, long[] adaddressIds) throws Exception;

	/**   
	 * @Function queryPartyList
	 * @Description 
	 *
	 * @param criteria
	 * @param startNum
	 * @param endNum
	 * @return
	 * @throws Exception
	 *
	 * @version v1.0.0
	 * @author Administrator
	 * @date 2015-9-10 下午3:08:05
	 * 
	 * <strong>Modification History:</strong><br>
	 * Date         Author          Version            Description<br>
	 * ---------------------------------------------------------<br>
	 * 2015-9-10     shitian             v1.0.0               修改原因<br>
	 */
	public DataContainerInterface[] queryPartyList(String criteria, int startNum, int endNum) throws Exception;

	/**   
	 * @Function queryPartyListCount
	 * @Description 
	 *
	 * @param criteria
	 * @return
	 * @throws Exception
	 *
	 * @version v1.0.0
	 * @author Administrator
	 * @date 2015-9-10 下午3:08:23
	 * 
	 * <strong>Modification History:</strong><br>
	 * Date         Author          Version            Description<br>
	 * ---------------------------------------------------------<br>
	 * 2015-9-10     shitian             v1.0.0               修改原因<br>
	 */
	public int queryPartyListCount(String criteria) throws Exception;

	/**   
	 * @Function queryPartyView
	 * @Description 
	 *
	 * @param partyId
	 * @param partyType
	 * @return
	 * @throws Exception
	 *
	 * @version v1.0.0
	 * @author Administrator
	 * @date 2015-9-14 上午10:28:46
	 * 
	 * <strong>Modification History:</strong><br>
	 * Date         Author          Version            Description<br>
	 * ---------------------------------------------------------<br>
	 * 2015-9-14     shitian             v1.0.0               修改原因<br>
	 */
	public DataContainerInterface queryPartyView(long partyId, int partyType,String operType) throws Exception;

	/**   
	 * @Function maskCustCertCode
	 * @Description 
	 *
	 * @param custType
	 * @param certCode
	 * @return
	 * @throws Exception
	 *
	 * @version v1.0.0
	 * @author Administrator
	 * @date 2015-9-14 上午11:06:10
	 * 
	 * <strong>Modification History:</strong><br>
	 * Date         Author          Version            Description<br>
	 * ---------------------------------------------------------<br>
	 * 2015-9-14     shitian             v1.0.0               修改原因<br>
	 */
	public String maskCustCertCode(int custType, String certCode) throws Exception;

	/**   
	 * @Function queryPersonView
	 * @Description 
	 *
	 * @param partyId
	 * @param custId
	 * @param onlyPayer
	 * @return
	 * @throws Exception
	 *
	 * @version v1.0.0
	 * @author Administrator
	 * @date 2015-9-15 上午11:17:34
	 * 
	 * <strong>Modification History:</strong><br>
	 * Date         Author          Version            Description<br>
	 * ---------------------------------------------------------<br>
	 * 2015-9-15     shitian             v1.0.0               修改原因<br>
	 */
	public DataContainerInterface queryPersonView(long partyId, long custId, boolean onlyPayer) throws Exception;

	/**   
	 * @Function queryOrgView
	 * @Description 
	 *
	 * @param custId
	 * @return
	 * @throws Exception
	 *
	 * @version v1.0.0
	 * @author Administrator
	 * @date 2015-9-16 下午9:17:54
	 * 
	 * <strong>Modification History:</strong><br>
	 * Date         Author          Version            Description<br>
	 * ---------------------------------------------------------<br>
	 * 2015-9-16     shitian             v1.0.0               修改原因<br>
	 */
	public DataContainerInterface queryOrgView(long custId) throws Exception;

	/**   
	 * @Function queryPayerView
	 * @Description 
	 *
	 * @param partyId
	 * @param custId
	 * @return
	 * @throws Exception
	 *
	 * @version v1.0.0
	 * @author Administrator
	 * @date 2015-9-17 下午2:44:44
	 * 
	 * <strong>Modification History:</strong><br>
	 * Date         Author          Version            Description<br>
	 * ---------------------------------------------------------<br>
	 * 2015-9-17     shitian             v1.0.0               修改原因<br>
	 */
	public DataContainerInterface queryPayerView(long partyId, long custId) throws Exception;

	/**   
	 * @Function queryUserNumbers
	 * @Description 
	 *
	 * @param custId
	 * @param start
	 * @param end
	 * @return
	 * @throws Exception
	 *
	 * @version v1.0.0
	 * @author Administrator
	 * @date 2015-9-17 下午7:29:28
	 * 
	 * <strong>Modification History:</strong><br>
	 * Date         Author          Version            Description<br>
	 * ---------------------------------------------------------<br>
	 * 2015-9-17     shitian             v1.0.0               修改原因<br>
	 */
	public DataContainerInterface[] queryUserNumbers(long custId, int start, int end) throws Exception;

	/**   
	 * @Function queryUserNumbersCount
	 * @Description 
	 *
	 * @param custId
	 * @return
	 * @throws Exception
	 *
	 * @version v1.0.0
	 * @author Administrator
	 * @date 2015-9-17 下午7:29:59
	 * 
	 * <strong>Modification History:</strong><br>
	 * Date         Author          Version            Description<br>
	 * ---------------------------------------------------------<br>
	 * 2015-9-17     shitian             v1.0.0               修改原因<br>
	 */
	public int queryUserNumbersCount(long custId) throws Exception;

	/**   
	 * @Function queryEmployeeView
	 * @Description 
	 *
	 * @param custId
	 * @return
	 * @throws Exception
	 *
	 * @version v1.0.0
	 * @author Administrator
	 * @date 2015-9-18 上午11:08:06
	 * 
	 * <strong>Modification History:</strong><br>
	 * Date         Author          Version            Description<br>
	 * ---------------------------------------------------------<br>
	 * 2015-9-18     shitian             v1.0.0               修改原因<br>
	 */
	public DataContainerInterface queryEmployeeView(long custId) throws Exception;

	/**   
	 * @Function queryAcctUserRel
	 * @Description 
	 *
	 * @param partyId
	 * @param start
	 * @param end
	 * @return
	 * @throws Exception
	 *
	 * @version v1.0.0
	 * @author Administrator
	 * @date 2015-10-8 下午4:12:39
	 * 
	 * <strong>Modification History:</strong><br>
	 * Date         Author          Version            Description<br>
	 * ---------------------------------------------------------<br>
	 * 2015-10-8     shitian             v1.0.0               修改原因<br>
	 */
	public DataContainerInterface[] queryAcctUserRel(long partyId, int start, int end) throws Exception;

	/**   
	 * @Function queryAcctUserRelCount
	 * @Description 
	 *
	 * @param partyId
	 * @return
	 * @throws Exception
	 *
	 * @version v1.0.0
	 * @author Administrator
	 * @date 2015-10-8 下午4:13:18
	 * 
	 * <strong>Modification History:</strong><br>
	 * Date         Author          Version            Description<br>
	 * ---------------------------------------------------------<br>
	 * 2015-10-8     shitian             v1.0.0               修改原因<br>
	 */
	public int queryAcctUserRelCount(long partyId) throws Exception;

	/**   
	 * @Function validateCustomerName
	 * @Description 
	 *
	 * @param custId
	 * @param custName
	 * @return
	 * @throws Exception
	 *
	 * @version v1.0.0
	 * @author Administrator
	 * @date 2015-10-22 下午4:14:32
	 * 
	 * <strong>Modification History:</strong><br>
	 * Date         Author          Version            Description<br>
	 * ---------------------------------------------------------<br>
	 * 2015-10-22     shitian             v1.0.0               修改原因<br>
	 */
	public boolean validateCustomerName(long custId, String custName) throws Exception;

	/**   
	 * @Function queryPayerInfo
	 * @Description 根据cpr查询纯payer，如果有其他角色，不返回null
	 *
	 * @param cpr
	 * @return	
	 * @throws Exception
	 *
	 * @version v1.0.0
	 * @author Administrator
	 * @date 2015-10-30 下午3:40:00
	 * 
	 * <strong>Modification History:</strong><br>
	 * Date         Author          Version            Description<br>
	 * ---------------------------------------------------------<br>
	 * 2015-10-30     shitian             v1.0.0               修改原因<br>
	 */
	public IQBOCmPayerInfoValue queryPayerInfo(String cpr) throws Exception;

	/**   
	 * @Function queryPayerByAddress
	 * @Description 
	 *
	 * @param addressIds
	 * @param custName
	 * @return
	 * @throws Exception
	 *
	 * @version v1.0.0
	 * @author Administrator
	 * @date 2015-10-30 下午3:47:55
	 * 
	 * <strong>Modification History:</strong><br>
	 * Date         Author          Version            Description<br>
	 * ---------------------------------------------------------<br>
	 * 2015-10-30     shitian             v1.0.0               修改原因<br>
	 */
	public IQBOCmPayerInfoValue[] queryPayerByAddress(long[] addressIds, String custName) throws Exception;

	/**
	 * 查询客户下面的用户
	 * @Function queryGroupDeptUserForFY
	 * @Description 
	 *
	 * @param custId
	 * @param startNum
	 * @param endNum
	 * @return
	 * @throws Exception
	 *
	 * @version v1.0.0
	 * @author yangjh
	 * @date 2016-3-14 下午5:42:46
	 * 
	 * <strong>Modification History:</strong><br>
	 * Date         Author          Version            Description<br>
	 * ---------------------------------------------------------<br>
	 * 2016-3-14     yangjh           v1.0.0               修改原因<br>
	 */
	public IBOCmInsCmrelValue[] queryGroupDeptUserForFY(long custId, int startNum, int endNum) throws Exception;

	/**
	 *  查询客户下面的用户数量
	 * @Function queryGroupDeptUserForFYCount
	 * @Description 
	 *
	 * @param custId
	 * @return
	 * @throws Exception
	 *
	 * @version v1.0.0
	 * @author yangjh
	 * @date 2016-3-14 下午5:43:07
	 * 
	 * <strong>Modification History:</strong><br>
	 * Date         Author          Version            Description<br>
	 * ---------------------------------------------------------<br>
	 * 2016-3-14     yangjh           v1.0.0               修改原因<br>
	 */
	public int queryGroupDeptUserForFYCount(long custId) throws Exception;

	/**   
	 * @Function getInsAccrelsByAcct
	 * @Description 
	 *
	 * @param acctId
	 * @param payerName	不作为查询条件
	 * @param startIdx
	 * @param endIdx
	 * @return
	 * @throws Exception
	 *
	 * @version v1.0.0
	 * @author shitian
	 * @date 2016-6-27 下午4:02:42
	 * 
	 * <strong>Modification History:</strong><br>
	 * Date         Author          Version            Description<br>
	 * ---------------------------------------------------------<br>
	 * 2016-6-27      shitian           v1.0.0               修改原因<br>
	 */
	public DataContainerInterface[] getInsAccrelsByAcct(long acctId, String payerName, int startIdx, int endIdx) throws Exception;

	/**   
	 * @Function getInsAccrelsCountByAcct
	 * @Description 
	 *
	 * @param acctId
	 * @param payerName	不作为查询条件
	 * @return
	 * @throws Exception
	 *
	 * @version v1.0.0
	 * @author shitian
	 * @date 2016-6-27 下午4:03:22
	 * 
	 * <strong>Modification History:</strong><br>
	 * Date         Author          Version            Description<br>
	 * ---------------------------------------------------------<br>
	 * 2016-6-27      shitian           v1.0.0               修改原因<br>
	 */
	public int getInsAccrelsCountByAcct(long acctId, String payerName) throws Exception;
	
	
	/**   
	 * @Function queryOrgViewAndLog
	 * @Description 
	 *
	 * @param custId
	 * @return
	 * @throws Exception
	 *
	 * @version v1.0.0
	 * @author Administrator
	 * @date 2015-9-16 下午9:17:54
	 */
	public DataContainerInterface queryOrgViewAndLog(long custId) throws Exception;
	
	/**   
	 * @Function queryPersonViewAndLog
	 * @Description 
	 *
	 * @param partyId
	 * @param custId
	 * @param onlyPayer
	 * @return
	 * @throws Exception
	 */
	public DataContainerInterface queryPersonViewAndLog(long partyId, long custId, boolean onlyPayer) throws Exception;
	
	/**   
	 * @Function queryIndivCustomerDtlById
	 * @Description 查询个人客户的信息
	 */
	public IVOCustValue queryIndivCustomerDtlById(long custId, String cprId) throws Exception;
	
	/**
	 * 
	 * <p>Title: queryByPartyName</p>  
	 * <p>Description: </p>  
	 * @param partName
	 * @param startIndex
	 * @param pageSize
	 * @return
	 * @throws Exception  
	 * @author Yang Jieee  
	 * @date 2021年7月5日  
	 * @version V1.0
	 */
	public List<IVOPartyValue> queryPartyByPartyName(String partName,int startIndex,int pageSize) throws Exception;
	
	  /**
     * 
     * <p>Title: queryPartyByPartyNameCount</p>  
     * <p>Description: </p>  
     * @param partName
     * @return
     * @throws Exception  
     * @author Yang Jieee  
     * @date 2021年7月7日  
     * @version V1.0
     */
    public int queryPartyByPartyNameCount(String partName) throws Exception;
}
