package com.asiainfo.crm.cm.teaminvoke.out.service.interfaces;

import java.rmi.RemoteException;
import java.util.List;
import java.util.Map;

import com.ai.appframe2.bo.DataContainer;
import com.ai.appframe2.common.DataContainerInterface;
import com.ai.secframe.orgmodel.ivalues.IQBOSecCustManagerValue;
import com.asiainfo.crm.cm.common.ivalues.IBOCmAttachValue;
import com.asiainfo.crm.cm.common.ivalues.IBOCmCreditMappingValue;
import com.asiainfo.crm.cm.cp.ivalues.IBOCmAgentPartnerInfoValue;
import com.asiainfo.crm.cm.cp.ivalues.IBOCmPartnerInfoValue;
import com.asiainfo.crm.cm.cp.ivalues.IQBOCmPartnerInfoValue;
import com.asiainfo.crm.cm.inner.account.ivalues.IQBOCmAcctPayMentValue;
import com.asiainfo.crm.cm.inner.customer.ivalues.IBOCmCustSegmentRelaValue;
import com.asiainfo.crm.cm.inner.customer.ivalues.IBOCmGroupContactQryValue;
import com.asiainfo.crm.cm.inner.customer.ivalues.IBOCmGroupContractValue;
import com.asiainfo.crm.cm.inner.customer.ivalues.IBOCmGroupCustomerValue;
import com.asiainfo.crm.cm.inner.customer.ivalues.IBOCmGroupMemberValue;
import com.asiainfo.crm.cm.ln.account.ivalues.IBOCmxAcctBankRelValue;
import com.asiainfo.crm.cm.ln.club.ivalues.IBOLnCmUserManagerValue;
import com.asiainfo.crm.cm.ln.common.ivalues.IBOLnCmInsCmRelValue;
import com.asiainfo.crm.cm.ln.common.ivalues.IBOLnCmInsDesRelValue;
import com.asiainfo.crm.cm.ln.customer.group.ivalues.IBOLnCmGroupInfoValue;
import com.asiainfo.crm.cm.model.ivalues.IAccountProfileValue;
import com.asiainfo.crm.cm.model.ivalues.IAccountValue;
import com.asiainfo.crm.cm.model.ivalues.IAcctBillCustomizeValue;
import com.asiainfo.crm.cm.model.ivalues.IAcctBillCycleValue;
import com.asiainfo.crm.cm.model.ivalues.IAcctPaymentValue;
import com.asiainfo.crm.cm.model.ivalues.IClubMemberValue;
import com.asiainfo.crm.cm.model.ivalues.IContactValue;
import com.asiainfo.crm.cm.model.ivalues.ICustOrganizeValue;
import com.asiainfo.crm.cm.model.ivalues.ICustomerValue;
import com.asiainfo.crm.cm.model.ivalues.IGroupMemberValue;
import com.asiainfo.crm.cm.model.ivalues.IVOCustValue;
@Deprecated
public interface ICmInterfaceSV {

	/**
	 * <PRE>
	 * 根据客户标识,查询客户信息,可查询集团客户,个人客户,家庭客户,虚拟客户,能根据客户编号自动匹配
	 * 
	 * 涉及表：
	 * cm_indiv_customer 个人客户表
	 * cm_group_customer 集团客户表
	 * cm_party_contact 参与人联系信息表
	 * cm_family_customer 家庭客户表（辽宁暂未使用）
	 * cm_virtual_customer 虚拟客户表（辽宁暂未使用）
	 * 
	 * @param CustId 客户编号
	 * @return ICustomerValue 
	 * @see com.asiainfo.crm.cm.model.ivalues.ICustomerValue
	 * @throws Exception
	 * </PRE>
	 */
	public ICustomerValue queryCustotmerByCustId(long CustId) throws Exception;

	/**
	 * <PRE>
	 * 3.4.2.10 查询集团客户信息,统一接口组调用
	 * 接口编码:OI_GetGroupCustomers
	 * 
	 * 涉及表：
	 * cm_group_contact 集团联系人、关键人、家属表
	 * cm_group_manager 集团和客户经理关系表
	 * cm_group_customer 集团客户表
	 * cm_party_contact 参与人联系表
	 * sec.sec_staff 员工表
	 * sec.sec_organize 组织表
	 * sec.sec_operator 操作工号表
	 * sec.sec_oper_domain_rela 工号扩展归属系统表
	 * 
	 * 根据条件查询客户信息
	 *
	 * @param parameter {
	 *	querytype 	查询类型	1		查询类型域：
	 *		xxxxxxxxx：每位含义如下
	 *		1.联系人电话
	 *		2.集团名称（支持右模糊查询）
	 *		3.集团编号
	 *		4.客户经理编号
	 *		5.集团地址
	 *		6.集团状态
	 *		7.集团级别
	 *		8.集团类型
	 *		每位为1时表示这个查询条件有值。为0时表示没有值。
	 *	BillId		联系人电话	？		
	 *	GroupName		集团名称	？		查询模式为1时需要支持模式查询
	 *	GroupId		集团编号	？		查询模式为1时需要支持模式查询
	 *	ManagerId		客户经理编号	？
	 *	Address		集团地址	？
	 *	GroupStatus	集团状态	？
	 *	GroupLevel	集团级别	？
	 *	GroupType		集团类型	？
	 *	RegionCode	地区编码	？
	 *	CountyCode	县市编码	？
	 *	QueryMode		查询模式	1		0：精确查询		1：模式查询
	 *	BgnIndex		记录开始编号	1		
	 *		起始序号和终止序号是左闭右开。记录数从1开始，在后台判断起始为1时需要返回所有满足条件的记录总数。
	 *	EndIndex		记录结束编号	1
	 * }
	 * @return Map {
	 *		GroupBaseInfo		集团客户基本信息对象 {
	 *			GroupId 			集团编号	1
	 *			GroupName			集团名称	1
	 *			GroupAddress		公司地址	？
	 *			ZipCode				公司邮编	？
	 *			HQNum				联系电话	？
	 *			GroupFax			传真	？
	 *			ValidDate			生效时间	1
	 *			GroupWebSite		企业网址	？
	 *			CertType			证件类型	1
	 *			CertCode			证件号码	1
	 *			Status				集团状态	1
	 *			GroupLevel			集团级别	？
	 *			LegalCustName		法人代表	？
	 *			ProvinceId			省份	？
	 *			CityId				地市	？
	 *			Vaocation			所属行业	？
	 *			MainContactName		联系人	？
	 *			MainContactPhone	联系人电话	？
	 *			ManagerId			客户经理编码	？
	 *			ManagerName			客户经理名称	？
	 *			ManagerPhone		客户经理电话	？
	 *			GroupType			集团类型	？
	 *		}
	 *		Count				记录总数	？		
	 * }
	 * @throws Exception
	 * </PRE>
	 */
	public Map queryCustotmersByCondition(Map parameter) throws Exception;

	/**
	 * <PRE>
	 * 3.4.2.11 查询集团客户详细信息,统一接口组调用
	 * 接口编码:OI_GetGroupCustomerDetail
	 * 
	 * 涉及表:
	 * cm_group_customer 集团客户表
	 * cm_party_contact 参与人联系表
	 * cmx_group_customer 集团客户信息扩展表
	 * cm_group_contact 集团联系人、关键人、家属表
	 * cm_group_manager 集团客户经理关系表
	 * sec.sec_staff 员工表
	 * sec.sec_organize 组织表
	 * sec.sec_operator 操作工号表
	 * sec.sec_oper_domain_rela 工号扩展归属系统表
	 * 
	 * 根据集团编码或者集团客户标识查询客户信息(包含集团客户扩展信息,主要联系人信息,主客户经理信息)
	 * 
	 * @param custId    		根据groupId查询时,custId传输-1或0;
	 * @param groupId   		根据custId查询时,groupId传输null或""
	 * @return Map {
	 * 	Baseinfo 客户信息对象 {
	 * 		ICustomerValue对象转换成Map
	 * 		集团客户扩展信息
	 * 		MainContactName			主要联系人姓名
	 * 		MainContactPhone		主要联系人电话
	 * 		ManagerId				主客户经理编号
	 * 		ManagerName				主客户经理姓名
	 * 		ManagerPhone			主客户经理联系电话
	 * 		Linkmaninfo				客户经理对象 {
	 * 			ManagerId			客户经理编号
	 * 			ManagerName			客户经理姓名
	 * 			PhoneNum			客户经理联系电话
	 * 			OrgId				客户经理所属组织
	 * 			OpId				客户经理操作工号
	 * 			Email				客户经理EMAIL
	 * 			Gender				客户经理性别
	 * 		}
	 * 	}
	 * }
	 * @throws Exception
	 * </PRE>
	 */
	public Map queryCustotmerByCustIdOrGroupId(long custId, String groupId) throws Exception;

	/**
	 * <PRE>
	 * 根据集团客户名称,查询集团客户信息(支持全模糊)
	 * 
	 * 涉及表:
	 * cm_group_customer 集团客户表
	 * cm_party_contact 参与人联系表
	 * 
	 * @param name			集团客户名称
	 * @return ICustomerValue[]
	 * @see com.asiainfo.crm.cm.model.ivalues.ICustomerValue
	 * @throws Exception
	 * </PRE>
	 */
	public ICustomerValue[] queryCustotmerByCustName(String name) throws Exception;

	/**
	 * <PRE>
	 * 根据集团编码查询集团的关键人、联系人、家属
	 * 
	 * 涉及表:
	 * cm_group_customer 集团客户表
	 * cm_party_contact 参与人联系表
	 * cm_group_contact 集团关键人、联系人、家属表
	 * 
	 * @param custServiceId			集团客户编码
	 * @return IBOCmGroupContactQryValue[]
	 * @see com.asiainfo.crm.cm.inner.customer.ivalues.IBOCmGroupContactQryValue
	 * @throws Exception
	 * </PRE>
	 */
	public IBOCmGroupContactQryValue[] queryGroupContactByGroupId(String custServiceId) throws Exception;

	/**
	 * <PRE>
	 * 统一接口组调用了该接口，获取集团客户的客户编号CustId
	 * 
	 * 根据集团客户编码,查询集团客户信息
	 * 
	 * 涉及表:
	 * cm_group_customer 集团客户表
	 * cm_party_contact 参与人联系表
	 * 
	 * @param groupId				集团客户编码
	 * @return ICustomerValue
	 * @see com.asiainfo.crm.cm.model.ivalues.ICustomerValue
	 * @throws Exception
	 * </PRE>
	 */
	public ICustomerValue queryCustotmerByGroupId(String groupId) throws Exception;

	/**
	 * <PRE>
	 * 根据证件类型,证件号码查询个人客户信息
	 * 
	 * 涉及表:
	 * cm_indiv_customer 个人客户表
	 * 
	 * @param certType				证件类型
	 * @param certCode				证件号码
	 * @return ICustomerValue[]
	 * @see com.asiainfo.crm.cm.model.ivalues.ICustomerValue
	 * @throws Exception
	 * </PRE>
	 */
	public ICustomerValue[] queryCustotmersByCertTypeAndCertCode(int certType, String certCode) throws Exception;

	/**
	 * <PRE>
	 * 根据客户标识,校验客户实名制信息,判断cm_indiv_customer表的REAL_NAME_FLAG字段
	 * real_name_flag字段为0，表示未实名制，1，表示已经实名制；
	 * 
	 * 涉及表：
	 * cm_indiv_customer 个人客户表
	 * 
	 * @param custid				客户编号
	 * @return Boolean 				{true：客户已经实名制；false：客户未实名制；}
	 * @throws Exception
	 * </PRE>
	 */
	public Boolean checkRealNameByCustId(long custid) throws Exception;

	/**
	 * <PRE>
	 * 3.1.1.21 查询客户信息,统一接口组调用
	 * 接口编码:OI_GetCustomerInfo
	 * 
	 * 根据服务号码,用户标识,客户标识,用户密码,集团编码,查询客户信息;
	 * 
	 * 涉及表:
	 * ins_user_xxx 用户表（按地市分表）
	 * cm_indiv_customer 个人客户表
	 * cm_group_customer 集团客户表
	 * cm_party 参与人
	 * cm_indiv_party 个人客户参与人
	 * cm_party_contact 参与人联系人
	 * cm_indiv_contact 个人联系人
	 * cm_group_contact 集团联系人
	 * 
	 * @param parameter {
	 * 		ServiceNum		服务号码，当传入服务号码时，根据号码查询；
	 * 		UserId			用户编号，当传入用户编号且服务号码未传时，根据用户编号查询；
	 * 		Password		服务密码，当传入值且服务号码或者用户编号传入时，进行密码校验；
	 * 		CustId			客户编号，当传入客户编号且服务号码、用户编号未传时，根据客户编号查询；
	 * 		GroupId			集团编码，当其余参数都未传且传入集团编码时，根据集团编码查询；
	 * }
	 * @return Map {
	 * 		CustomerMap {
	 * 			com.asiainfo.crm.cm.model.ivalues.ICustomerValue转换成Map后的对象
	 * 		}
	 * }
	 * @throws Exception
	 * </PRE>
	 */
	public Map queryCustomerByCn(Map parameter) throws Exception;

	/**
	 * <PRE>
	 * 3.1.2.15 检查实名制,统一接口组调用
	 * 接口编码:OI_CheckRealName
	 * 
	 * 根据服务号码,校验客户实名制信息，判断cm_indiv_customer表的REAL_NAME_FLAG字段
	 * real_name_flag字段为0，表示未实名制，1，表示已经实名制；
	 * 
	 * 涉及表:
	 * cm_indiv_customer 个人客户表
	 * ins_user_xxx 用户表（按地市分表）
	 * 
	 * @param serviceNum			服务号码
	 * @return Boolean
	 * @throws Exception
	 * </PRE>
	 */
	public Boolean checkRealNameByServiceNum(String serviceNum) throws Exception;

	/**
	 * <PRE>
	 * 根据客户标识,查询黑名单信息
	 * 
	 * 涉及表:
	 * CM_SPECIAL_LIST 特殊名单表
	 * 
	 * @param custId				客户编号
	 * @return List {
	 * 		com.asiainfo.crm.cm.model.ivalues.ISpecialListValue对象转换成的Map
	 * }
	 * @throws Exception
	 * @deprecated 在辽宁省，不能根据custId来查询黑名单，必须使用证件类型和证件号码查询
	 * </PRE>
	 */
	public List querySpecialListByCustId(long custId) throws Exception;

	/**
	 * <PRE>
	 * 根据证件类型及证件号码,查询黑名单信息
	 * 
	 * 涉及表:
	 * CM_SPECIAL_LIST 特殊名单表
	 * 
	 * @param certType				证件类型
	 * @param certCode				证件号码
	 * @return List {
	 * 		com.asiainfo.crm.cm.model.ivalues.ISpecialListValue对象转换成的Map
	 * }
	 * @throws Exception
	 * </PRE>
	 */
	public List querySpecialListByCertTypeAndCertCode(int certType, String certCode) throws Exception;

	/**
	 * <PRE>
	 * 根据证件类型及证件号码,校验是否黑名单信息
	 * 
	 * 涉及表:
	 * CM_SPECIAL_LIST 特殊名单表
	 * 
	 * @param certType				证件类型
	 * @param certCode				证件号码
	 * @return Boolean {true：是黑名单；false：不是黑名单}
	 * @throws Exception
	 * </PRE>
	 */
	public Boolean checkSpecialListByCertTypeAndCertCode(int certType, String certCode) throws Exception;

	/**
	 * <PRE>
	 * 专门提供给帐管使用，根据证件类型、证件号码、监控子类型查询是否黑名单
	 * 
	 * 涉及表:
	 * CM_SPECIAL_LIST 特殊名单表
	 * 
	 * @param certType				证件类型
	 * @param certCode				证件号码
	 * @param listType				监控子类型
	 * @return Boolean	{true：是黑名单；false：不是黑名单}
	 * @throws Exception
	 * </PRE>
	 */
	public Boolean checkSpecialList4AMS(int certType, String certCode, String listType) throws Exception;

	/**
	 * <PRE>
	 * 根据客户标识,校验是否黑名单信息
	 * 
	 * 涉及表:
	 * CM_SPECIAL_LIST 特殊名单表
	 * 
	 * @param custId				客户编号
	 * @return Boolean {true：是黑名单；false：不是黑名单}
	 * @throws Exception
	 * @deprecated 在辽宁省，不能根据custId来查询黑名单，必须使用证件类型和证件号码查询
	 * </PRE>
	 */
	public Boolean checkSpecialListByCustId(long custId) throws Exception;

	/**
	 * <PRE>
	 * 根据服务号码,查询个人大客户信息,还会查询个人客户信息(CM_INDIV_CUSTOMER IC, CM_PARTY_CONTACT),
	 * 俱乐部信息(CM_CLUB),会员卡信息(CM_CLUB_MEMBER_CARD)
	 * 
	 * 涉及表:
	 * cm_club 俱乐部表
	 * cm_club_member 会员表
	 * cm_indiv_customer 个人客户表
	 * cm_party_contact 参与人联系表
	 * cm_club_member_card 会员卡表
	 * 
	 * @param BillId				服务号码
	 * @return List
	 * @throws	Exception
	 * </PRE>
	 */
	public List queryClubMemberByBillId(String BillId) throws Exception;

	/**
	 * <PRE>
	 * 根据集团客户标识,修改集团客户ecCode（只提供给BBOSS全网集团使用）
	 * 
	 * 涉及表：
	 * cm_group_customer 集团客户表
	 * 
	 * @param custId				集团客户编号
	 * @param ecCode				EC编码
	 * @return long
	 * @throws Exception
	 * </PRE>
	 */
	public long modifyGroupEcCodeByCustId(long custId, String ecCode) throws Exception;

	/**
	 * <PRE>
	 * 创建集团客户（只提供给集团业务使用zhouwei9）
	 * 
	 * 涉及表：
	 * cm_group_customer 集团客户表
	 * 
	 * @param Map				包含CUST_NAME,CUST_CERT_TYPE,CUST_CERT_CODE,REGION_ID,IS_VPMN(可选,但zhouwei9传输1)等信息
	 * @return long  返回的是cust_id
	 * @throws Exception
	 * @deprecated 这个方法暂时无人使用
	 * </PRE>
	 */
	public long createGroupCustomer(Map parameter) throws Exception;

	/**
	 * <PRE>
	 * 根据客户编号修改集团客户或个人客户资料
	 * 注意:和CRM外围接口规范(v2.04).docx的3.1.2.10修改客户信息章节有一定的区别
	 * 有一些客户资料是不能通过接口修改的。
	 * 接口编码：OI_UpdateCustomerInfo
	 * 
	 * 涉及表：
	 * cm_indiv_customer 个人客户表
	 * cm_group_customer 集团客户表
	 * 
	 * @param parameter {
	 * 		CustInfo {
	 * 			CustId				客户编号,数据更新的条件,必须传
	 * 			CustLanguage		客户默认语言
	 * 			CustName			客户名称    
	 * 			CustServiceLevel	客户服务级别
	 * 			CustAddress			客户地址    
	 * 			CustZipcode			邮政编码    
	 * 			CityId				地市        
	 * 			CountyId			区县        
	 * 			OpId				操作员      
	 * 			OrgId				组织单元    
	 * 			Remarks				备注        
	 * 				{		如果是个人客户，则传入参数包含下面参数
	 * 				Birthday			出生日期  
	 * 				CharacterDesc		性格描述  
	 * 				EducationLevel		学历      
	 * 				FamilyInfo			子女状况  
	 * 				Gender				客户性别  
	 * 				Hobby				个人爱好  
	 * 				IncomeLevel			收入      
	 * 				IsVip				是否大客户
	 * 				JobCompany			工作单位  
	 * 				JobPosition			职位      
	 * 				Lunar				生日类别  
	 * 				MarryStatus			婚姻状况  
	 * 				NationalType		民族      
	 * 				Occupation			所属行业  
	 * 				PoliticsFace		政治面貌  
	 * 				RealNameFlag		实名标志  
	 * 				Religion			宗教信仰  
	 * 			}
	 * 				{		如果是集团客户，则传入参数包含下面参数
	 * 				GroupFax			公司传真      
	 * 				GroupWeb			集团网址      
	 * 				HqNumber			公司总机号    
	 * 				RegAmount			注册资金      
	 * 				RegionType			集团区域类型  
	 * 				ShortName			集团简称      
	 * 				StaffAmount			集团员工数量  
	 * 				SubRegionType		集团区域子类型
	 * 				Vocation			行业类型      
	 * 				SubVocation			行业子类型    
	 * 				TownId				乡镇/街道     
	 * 				VillegeId			村            
	 * 			}
	 * 		}
	 * }
	 * @return long
	 * @throws Exception
	 * </PRE>
	 */
	public long modifyCustomerValueByCustId(Map parameter) throws Exception;

	/**
	 * <PRE>
	 * 3.1.1.27 查询VIP用户免费服务信息,统一接口组调用
	 * 接口编码:OI_GetVIPUserFreeService
	 * 
	 * 涉及表：
	 * cm_club_member 会员表
	 * cm_club_service 俱乐部服务定义表
	 * cm_club_service_adjust 俱乐部会员服务临时额度信息表
	 * cm_club_service_cycle 俱乐部服务使用周期
	 * cm_club_service_vdoing 俱乐部服务维度定义表
	 * 
	 * @param parameter {
	 * ServiceNum	用户计费号码	1
	 * ClubId	俱乐部编号	?
	 * FreeServiceType	免费服务类型	?	0：机场VIP贵宾免费服务1：火车站免费服务	不传查全部免费服务
	 * }
	 * @return Map
	 * @throws Exception
	 * </PRE>
	 */
	public Map queryClubServiceFreeTimes(Map parameter) throws Exception;

	/**
	 * <PRE>
	 * 根据custId查询客户用户关系表
	 * 
	 * 涉及表:
	 * CM_INS_CMREL 客户用户关系表
	 * 
	 * @param custid				客户编号
	 * @param userId				用户编号
	 * @return IBOLnCmInsCmRelValue[]
	 * @see com.asiainfo.crm.cm.ln.common.ivalues.IBOLnCmInsCmRelValue
	 * @throws Exception
	 * </PRE>
	 */
	public IBOLnCmInsCmRelValue[] queryCmInsCmRelByCustId(long custid, long userId) throws Exception;

	/**
	 * <PRE>
	 * 根据UserId修改客户用户关系表中数据
	 * 
	 * 涉及表:
	 * CM_INS_CMREL 客户用户关系表
	 * CM_INS_CMREL_H 用户客户关系历史表
	 * 
	 * @param value					IBOLnCmInsCmRelValue对象
	 * @see com.asiainfo.crm.cm.ln.common.ivalues.IBOLnCmInsCmRelValue
	 * @return String
	 * @throws Exception
	 * </PRE>
	 */
	public String modifyCmInsCmRel(IBOLnCmInsCmRelValue value) throws Exception;

	/**
	 * <PRE>
	 * 增加客户用户表中的数据,参数中包含有CustId,UserId UserRegionCode
	 * 
	 * 涉及表:
	 * CM_INS_CMREL 客户用户关系表
	 * 
	 * @param parameter
	 * @return String
	 * @throws Exception
	 * </PRE>
	 */
	public String addCmInsCmRel(Map parameter) throws Exception;

	/**
	 * <PRE>
	 * 根据UserId删除客户用户表中的数据
	 * 
	 * 涉及表:
	 * CM_INS_CMREL 客户用户关系表
	 * CM_INS_CMREL_H 用户客户关系历史表
	 * 
	 * @param parameter
	 * @return String
	 * @throws Exception
	 * </PRE>
	 */
	public String deleteCmInsCmRel(Map parameter) throws Exception;

	/**
	 * <PRE>
	 * 根据集团客户标识查询合同信息
	 * 
	 * 涉及表:
	 * CM_GROUP_CONTRACT 集团合同表
	 * 
	 * @param custid				集团客户编号
	 * @return IBOCmGroupContractValue[]
	 * @see com.asiainfo.crm.cm.inner.customer.ivalues.IBOCmGroupContractValue
	 * @throws Exception
	 * </PRE>
	 */
	public IBOCmGroupContractValue[] queryGroupContractByCustId(long custid) throws Exception;

	/**
	 * <PRE>
	 * 3.4.2.14 查询集团的合同信息,统一接口组调用
	 * 接口编码:OI_GetGroupContract
	 * 根据条件查询集团合同信息
	 *
	 * 涉及表:
	 * CM_GROUP_CONTRACT 集团合同表
	 * CM_GROUP_CUSTOMER 集团客户表
	 * CM_ATTACH 客户管理附件表
	 * 
	 * @param parameter {
	 *	GroupId					集团编码
	 *	OperId					操作员编码 	 集团编码和操作员编码两者选一
	 *	ContractName			合同名称	？		查询模式为1时采用模糊查询
	 *	BgnDate					开始时间	1		格式yyyy-mm-dd
	 *	EndDate					结束时间	1		格式yyyy-mm-dd
	 *	QueryMode				查询模式	1		0：精确查询 1：模糊查询 注：对所有查询条件都支持，包括编码
	 * }
	 * @return Map {
	 * ContractId	合同id	1
	 * ContractName	合同名称	1
	 * CustName	集团客户信息	1
	 * Status	合同状态	1
	 * DetailURL	合同详情URL	1   存放的是合同附件的链接
	 * CreateDate	生成时间	1
	 * OpId	受理人员标识	1
	 * FunishDate	合同完成时间	1
	 * Notes	备注	？
	 * }
	 * @throws Exception
	 * </PRE>
	 */
	public Map queryGroupContractByCnd(Map parameter) throws Exception;

	/**
	 * <PRE>
	 * 根据账户标识查询账户支付方案信息,只查询cm_acct_payment表
	 * 
	 * 涉及表:
	 * CM_ACCT_PAYMENT_XXX 账户支付表（按地市分表）
	 * 
	 * @param acctId				账户编号
	 * @return IAcctPaymentValue[]
	 * @see com.asiainfo.crm.cm.model.ivalues.IAcctPaymentValue
	 * @throws Exception
	 * </PRE>
	 */
	public IAcctPaymentValue[] queryAcctPaymentByAcctId(long acctId) throws Exception;

	/**
	 * <PRE>
	 * 根据 BankCode银行编码, RegionId地州信息, PayMethod(支付方式可选,默认托收账户) 
	 * 查询该银行所有托收信息,只查询cm_acct_payment表
	 * 
	 * 涉及表:
	 * CM_ACCT_PAYMENT_XXX 账户支付表（按地市分表）
	 * 
	 * @param parameter {
	 * 	BankCode 银行编码
	 * 	RegionId 地市ID
	 * 	PayMethod 支付方式,如果传入为空,则默认查询银行托收账户 1预付费 2现金 21银行托收 26银行代扣
	 * }
	 * @return IAcctPaymentValue
	 * @see com.asiainfo.crm.cm.model.ivalues.IAcctPaymentValue
	 * @throws Exception
	 * </PRE>
	 */
	public IAcctPaymentValue[] queryAcctPaymentByBankCode(Map parameter) throws Exception;

	/**
	 * <PRE>
	 * 3.4.2.19 查询集团帐单,统一接口组调用
	 * 接口编码:OI_GetGroupBill
	 * 
	 * 根据集团客户编码,查询集团客户账户信息,关联cm_acct_payment表
	 * 
	 * 涉及表：
	 * cm_group_customer 集团客户表
	 * cm_cust_acct_rel 客户账户关系表
	 * cm_account_xxx 账户表（按地市分表）
	 * cm_acct_payment_xxx 账户支付表（按地市分表）
	 * cm_acct_bill_cycle_xxx 账户账期表（按地市分表）
	 * 
	 * @param groupId					集团编码
	 * @return IAccountProfileValue[]
	 * @see com.asiainfo.crm.cm.model.ivalues.IAccountProfileValue
	 * @throws Exception
	 * </PRE>
	 */
	public IAccountProfileValue[] queryAccountByGroupId(String groupId) throws Exception;

	/**
	 * <PRE>
	 * 根据PaymentAccount银行账户, RegionId地州信息, PayMethod(支付方案可选,默认银行托收) 
	 * 查询账户信息,关联cm_acct_payment表
	 * 
	 * 涉及表:
	 * cm_account_xxx 账户表（按地市分表）
	 * cm_acct_payment_xxx 账户支付表（按地市分表）
	 * cm_acct_bill_cycle_xxx 账户账期表（按地市分表）
	 * CMX_ACCT_PAYMENT_ATTR 账户支付扩展表,只查询了BankBehalfPhone(银行账号代表号码)
	 * 
	 * @param parameter {
	 * 	PaymentAccount 支付帐户
	 * 	RegionId 地市ID
	 * 	PayMethod 支付方式,如果传入为空,则默认查询银行托收账户 1预付费 2现金 21银行托收 26银行代扣
	 * }
	 * @return IAccountProfileValue[]
	 * @see com.asiainfo.crm.cm.model.ivalues.IAccountProfileValue
	 * @throws Exception
	 * </PRE>
	 */
	public IAccountProfileValue[] queryAccountByPayAccount(Map parameter) throws Exception;

	/**
	 * <PRE>
	 * 根据账户标识查询账户信息,关联cm_acct_payment表查询
	 * 
	 * 涉及表:
	 * cm_account_xxx 账户表（按地市分表）
	 * cm_acct_payment_xxx 账户支付表（按地市分表）
	 * cm_acct_bill_cycle_xxx 账户账期表（按地市分表）
	 * CMX_ACCT_PAYMENT_ATTR 账户支付扩展表,只查询了BankBehalfPhone(银行账号代表号码)
	 * 
	 * @param AcctId					账户编号
	 * @return IAccountProfileValue[]
	 * @see com.asiainfo.crm.cm.model.ivalues.IAccountProfileValue
	 * @throws Exception
	 * </PRE>
	 */
	public IAccountProfileValue[] queryAccountByAccountId(long AcctId) throws Exception;

	/**
	 * <PRE>
	 * 根据客户标识查询账户信息，关联cm_acct_payment表查询
	 * 涉及表：
	 * cm_cust_acct_rel           客户账户关系表
	 * cm_account_xxx             账户主表（按地市分表）
	 * cm_acct_payment_xxx        账户支付表（按地市分表）
	 * cm_acct_bill_cycle_xxx     账户账期表（按地市分表）
	 * 
	 * @param CustId					客户编号
	 * @return IAccountProfileValue[]
	 * @see com.asiainfo.crm.cm.model.ivalues.IAccountProfileValue
	 * @throws Exception
	 * </PRE>
	 */
	public IAccountProfileValue[] queryAccountByCustId(long CustId) throws Exception;

	/**
	 * <PRE>
	 * 根据集团客户标识查询集团客户信息,包含客户经理信息
	 * 
	 * 涉及表:
	 * cm_group_customer 集团客户表
	 * cm_group_manager 集团客户经理表
	 * sec.sec_staff 员工表
	 * sec.sec_organize 组织表
	 * sec.sec_operator 操作工号表
	 * sec.sec_oper_domain_rela 工号扩展归属系统表
	 * 
	 * @param GroupCustId				集团客户编号
	 * @return Map {
	 * 	Linkmaninfo {
	 * 		MANAGER_ID 客户经理ID
	 * 		MANAGER_NAME 客户经理姓名
	 * 		BILL_ID 客户经理电话
	 * 	}
	 * 	Baseinfo {
	 * 		CUST_SERVICE_ID 集团编码
	 * 		CUST_NAME 集团名称
	 * 		CUST_ADDRESS 集团地址
	 * 		CUST_ZIPCODE 集团邮编
	 * 		HQ_NUMBER 集团联系电话
	 * 		GROUP_FAX 集团传真
	 * 		CREATE_DATE 创建日期
	 * 		GROUP_WEB 集团网站
	 * 		CUST_CERT_TYPE 证件类型
	 * 		CUST_CERT_CODE 证件号码
	 * 		CUST_STATUS 客户状态
	 * 		LEGAL_CUST_NAME 法人代表
	 * 		PROVINCE_ID 省份
	 * 		CITY_ID 地市
	 * 		REGION_ID 归属区域标识
	 * 	}
	 * }
	 * @throws Exception
	 * </PRE>
	 */
	public Map queryCustotmerByGroupCustId(long GroupCustId) throws Exception;

	/**
	 * <PRE>
	 * 3.1.1.31 查询信用度登记记录,统一接口组调用
	 * 接口编码:OI_GetCreditOpRec
	 * 
	 * 查询信用度登记信息
	 * 
	 * 涉及表:
	 * ins_user_xxx 用户表（按地市分表）
	 * CM_USER_SPEUSER_MAIN 信誉度特殊用户维护记录表
	 * 
	 * @param serviceNum				服务号码
	 * @param userId					用户编号
	 * @param queryType					查询类型 0-查当前信息，1-查历史信息，2-查全部
	 * @return Map {
	 * 		is_reg	是否已登记	1	0—否，1—是	值为1时，2和3项才有意义
	 * 		credit_class;	信用度级别	？
	 * 		credit_name;	信用度名称	？		
	 * }
	 * @throws Exception
	 * </PRE>
	 */
	public Map queryCreditByServiceNumOrUserId(String serviceNum, String userId, String queryType) throws Exception;

	/**
	 * <PRE>
	 * 根据集团客户标识查询集团客户经理信息，只有客户经理信息,不包含集团客户信息
	 * 
	 * 涉及表:
	 * cm_group_customer 集团客户表
	 * cm_group_manager 集团客户经理表
	 * 
	 * @param GroupCustId					集团客户编号
	 * @return Map {
	 * 		Linkmaninfo {
	 * 			MANAGER_NAME 客户经理姓名
	 * 			BILL_ID 客户经理手机
	 * 			OP_ID 客户经理登录工号
	 * 			ORG_ID 客户经理组织ID
	 * 		}
	 * }
	 * @throws Exception
	 * </PRE>
	 */
	public Map queryMgrByGroupCustId(long GroupCustId) throws Exception;

	/**
	 * <PRE>
	 * 根据账户标识查询账户信息，关联acct_payment表查询
	 * 
	 * 涉及表:
	 * cm_account_xxx 账户表（按地市分表）
	 * cm_acct_payment_xxx 账户支付表（按地市分表）
	 * cm_acct_bill_cycle_xxx 账户账期表（按地市分表）
	 * CMX_ACCT_PAYMENT_ATTR 账户支付扩展表,只查询了BankBehalfPhone(银行账号代表号码)
	 * 
	 * @param acctId						账户编号
	 * @return Map {
	 * 		com.asiainfo.crm.cm.model.ivalues.IAccountProfileValue[]转换后的Map对象
	 * }
	 * @throws Exception
	 * </PRE>
	 */
	public Map queryAcctPaymentAndByAcctId(long acctId) throws Exception;

	/**
	 * <PRE>
	 * 3.1.1.28 查询用户个性化帐单,统一接口组调用
	 * 接口编码:OI_GetIndividualBill
	 * 
	 * 根据服务号码查询用户个性化帐单信息
	 * 
	 * 涉及表:
	 * ins_user_xxx 用户表（按地市分表）
	 * CM_BILL_CUSTOMIZE_XXX 客户化帐单定制表(按地市分表)
	 * 
	 * @param serviceNum					服务号码
	 * @return Map {
	 * 	CustId	客户编号	1
	 * 	UserId	用户编号	1
	 * 	BillType	帐单类型	1	0：移动广告 1：汇总帐单 2：明细帐单 3：长途和漫游详单
	 * 	BillFormatId	帐单格式	1
	 * 	PostMode	帐单投递方式	+	0：短信 1：彩信 2：EMail 3：邮件
	 * 	PostCode	邮编	1
	 * 	Addressee	收件人	1
	 * 	Address	地址	1
	 * 	EMail	EMAIL	1
	 * 	Fax	传真	1	
	 * }
	 * @throws Exception
	 * </PRE>
	 */
	public Map queryCmBillCustomize(String serviceNum) throws Exception;

	/**
	 * <PRE>
	 * 3.1.2.12 受理用户个性化帐单,统一接口组调用（重复，以3.1.3.32为准）
	 * 接口编码:OI_OrderIndividualBill
	 * 3.1.3.32 设置帐单递送方式,统一接口组调用
	 * 接口编码:OI_SetBillDeliveryType
	 * 
	 * 受理用户个性化帐单信息,提供给外围接口
	 * 
	 * 涉及表:
	 * ins_user_xxx 用户表（按地市分表）
	 * CM_BILL_CUSTOMIZE_XXX 客户化帐单定制表(按地市分表)
	 * 
	 * @param parameter {
	 * 	ServiceNum	服务号码	1
	 * 	BillType	帐单类型	1	0：移动广告 1：汇总帐单 2：明细帐单 3：长途和漫游详单
	 * 	BillFormatId	账单格式	？
	 * 	ActionType	操作类型	1	0：受理 1：修改 2：取消
	 * 	PostMode	帐单投递方式	+	0：短信 1：彩信 2：Email 3：邮件
	 * 	PostCode	邮编	？
	 *  Addressee	收件人	？
	 *  Address	地址	？
	 *  Email	EMAIL	？
	 *  Fax	传真	？	
	 * }
	 * @return Map {
	 * 	DoneCode 受理业务编号
	 * }
	 * @throws Exception
	 * </PRE>
	 */
	public Map modifyCmBillCustomize(Map parameter) throws Exception;

	/**
	 * <PRE>
	 * 受理用户个性化帐单信息,提供给开户过户 ,返回是done_code
	 * 
	 * 涉及表:
	 * CM_BILL_CUSTOMIZE_XXX 客户化帐单定制表(按地市分表)
	 * ins_user_xxx 用户表（按地市分表）
	 * 
	 * @param parameter {
	 * 		inputParameter map对象 {
	 * 			页面传入的账单定制化数据
	 * 		}
	 * }
	 * @return long					返回的是done_code值
	 * @throws Exception
	 * </PRE>
	 */
	public long addCmBillCustomize(Map parameter) throws Exception;

	/**
	 * <PRE>
	 * 根据服务号码,用户标识,账户标识查询账户信息,关联cm_acct_payment表,优先顺序为服务号码,用户标识,账户标识.
	 * 
	 * 涉及表：
	 * ins_user_xxx 用户表（按地市分表）
	 * cm_account_xxx 账户表（按地市分表）
	 * cm_acct_payment_xxx 账户支付表（按地市分表）
	 * cm_acct_bill_cycle_xxx 账户账期表（按地市分表）
	 * CMX_ACCT_PAYMENT_ATTR 账户支付扩展表,只查询了BankBehalfPhone(银行账号代表号码)
	 * 
	 * @param Sn					服务号码
	 * @param acctId				账户编号
	 * @param userId				用户编号
	 * @return	Map {
	 * 	AcctInfo {
	 * 		PayMethod 支付方式
	 * 		AccId 账户ID
	 * 		CustId 客户ID
	 *		AccType 账户类型
	 *		AccStatus 账户状态
	 *		AccName 账户名称
	 *		CreditLevel 信用等级
	 *		CreditValue 信用额度
	 *		UrgeStopFlag 免催免停标志
	 *		AccCycle 账户出账日
	 *		RegionId 归属地市ID(根据服务号码和用户标识查询是,返回的是用户归属地市ID,根据账户查询时,返回的是账户归属客户的地市ID)
	 *		CountyId 归属区县ID(根据服务号码和用户标识查询是,返回的是用户归属区县ID,根据账户查询时,返回的是账户归属客户的区县ID)
	 *		AccExtendInfo 扩展信息
	 * 	}
	 * }
	 * @throws Exception
	 * @deprecated 该方法无引用
	 * </PRE>
	 */
	public Map queryAcctInfo(String Sn, String acctId, String userId) throws Exception;

	/**
	 * <PRE>
	 * 根据账户标识查询出账日期,只查询bill_cycle表
	 * 
	 * 涉及表:
	 * cm_acct_bill_cycle_xxx 账户账期表（按地市分表）
	 * 
	 * @param acctId				账户编号
	 * @return Map {
	 * 	acctBillCycle com.asiainfo.crm.cm.model.ivalues.IAcctBillCycleValue对象强制转换成的Map
	 * }
	 * @throws Exception
	 * </PRE>
	 */
	public Map queryAcctBillCycleInfo(String acctId) throws Exception;

	/**
	 * <PRE>
	 * 根据合同编码查询集团客户信息
	 * 
	 * 涉及表:
	 * cm_group_contract 集团合同表
	 * cm_group_customer 集团客户表
	 * 
	 * @param contractId			集团合同编号
	 * @return ICustomerValue		集团客户对象
	 * @see com.asiainfo.crm.cm.model.ivalues.ICustomerValue
	 * @throws Exception
	 * </PRE>
	 */
	public ICustomerValue queryCustotmerByContractId(String contractId) throws Exception;

	/**
	 * <PRE>
	 * 根据acctId判断是否集团客户账户
	 * 
	 * 涉及表:
	 * cm_cust_acct_rel 客户账户关系表
	 * 
	 * @param acctId				账户编号
	 * @return Boolean {true:是集团客户账户；false:不是集团客户账户；}
	 * @throws Exception
	 * @deprecated 方法未使用
	 * </PRE>
	 */
	public Boolean isGroupAcctByAccttId(long acctId) throws Exception;

	/**
	 * <PRE>
	 * 根据集团客户标识查询主要联系人
	 * 
	 * 涉及表:
	 * cm_group_customer 集团客户表
	 * cm_party 参与人表
	 * cm_indiv_party 个人参与人表
	 * cm_party_contact 参与人联系人表
	 * cm_group_contact 集团参与人表
	 * 
	 * @param custId				集团客户编号
	 * @return IContactValue		集团联系人对象，主要联系人只有1个
	 * @see com.asiainfo.crm.cm.model.ivalues.IContactValue
	 * @throws Exception
	 * </PRE>
	 */
	public IContactValue queryMainGroupContactByCustId(long custId) throws Exception;

	/**
	 * <PRE>
	 * 根据集团客户标识查询所有联系人信息
	 * 
	 * 涉及表:
	 * cm_group_customer 集团客户表
	 * cm_party 参与人表
	 * cm_indiv_party 个人参与人表
	 * cm_party_contact 参与人联系人表
	 * cm_group_contact 集团参与人表
	 * 
	 * @param custId				集团客户编号
	 * @return IContactValue[]
	 * @see com.asiainfo.crm.cm.model.ivalues.IContactValue
	 * @throws Exception
	 * </PRE>
	 */
	public IContactValue[] queryAllGroupContactByCustId(long custId) throws Exception;

	/**
	 * <PRE>   
	 * @Function queryGroupCustByCdn
	 * @Description 查询集团客户信息
	 *
	 * 涉及表：
	 * ins_user_xxx 用户表（按地市分表）
	 * cm_group_member 集团成员表
	 * cm_group_customer 集团客户表
	 * cm_group_manager 集团客户经理表
	 * sec.sec_staff 员工表
	 * sec.sec_organize 组织表
	 * sec.sec_operator 操作工号表
	 * sec.sec_oper_domain_rela 工号扩展归属系统表
	 * 
	 * @param qryType {取值如下：
	 * 	1       成员手机号
	 * 	2       集团名称（只支持右端模糊）
	 * 	3       集团编号
	 * }
	 * @param qryValue {
	 * 	当qryType为1时，qryValue值是成员手机号码；
	 * 	当qryType为2时，qryValue值是集团名称；
	 * 	当qryType为3时，qryValue值是集团编号；
	 * }   
	 * @return map {
	 * 	GroupCustId 集团编码
	 * 	CustName 集团名称
	 * 	CustAddr 集团地址
	 * 	CustManagerName 客户经理名称
	 * 	CustManagerPhone 客户经理电话
	 * }
	 * @throws Exception
	 *
	 * @version v1.0.0
	 * @author shitian
	 * @date Sep 12, 2012 2:55:00 PM
	 * 
	 * <strong>Modification History:</strong><br>
	 * Date         Author          Version            Description<br>
	 * ---------------------------------------------------------<br>
	 * Sep 12, 2012     shitian           v1.0.0               修改原因<br>
	 * </PRE>
	 */
	public Map queryGroupCustByCdn(int qryType, String qryValue) throws Exception;

	/**
	 * <PRE>
	 * 银行账号绑定代扣,提供给外围统一接口调用:3.2.2.7 用户银行帐号绑定
	 * 接口编码：OI_UserBindBankAccount
	 * 
	 * 涉及表：
	 * ins_user_xxx 用户表（按地市分表）
	 * ins_accrel_xxx 用户账户付费关系表（按地市分表）
	 * cm_account_xxx 账户表（按地市分表）
	 * cm_acct_payment_xxx 账户支付表（按地市分表）
	 * cm_acct_bill_cycle_xxx 账户帐期表（按地市分表）
	 * cm_indiv_customer 个人客户表
	 * cmx_acct_payment_attr 账户支付扩展表
	 * 
	 * @param parameter {
	 * 	ServiceNum	手机号码
	 * 	AcctId	账户编号
	 * 	OpFlag	密码验证标志 标志=1 需要验证工号密码。标志=0 不需要验证工号密码。
	 * 		注意：这个密码校验，是统一接口组在调用客户管理接口之前进行校验的，校验通过，才调用客管接口
	 * 	OpId	工号
	 *  PassWord	工号密码 OpFlag=1时必填
	 *  Region	地区代码 用户的归属地市代码
	 *  BankId	银行代码
	 *  BankAccount	银行帐号
	 *  BusiReqTime	交易请求时间
	 *  OriginSeq	交易请求流水
	 *  BusiType	业务类型 1：代扣2：托收
	 *  OnceFee	每次扣款金额
	 *  MinFee	最低扣款金额
	 * } 
	 * @return Map {
	 * 	ServiceNum	手机号码
	 *  CustName	客户姓名
	 *  BusiSeq	BOSS侧交易流水
	 * }
	 * @throws Exeption
	 * </PRE>
	 */
	public Map bindingBankAcctPayment(Map parameter) throws Exception;

	/**
	 * <PRE>
	 * 银行账号解绑，提供给外围统一接口调用：3.2.2.8 用户银行帐号去绑定
	 * 接口编码：OI_CancelBindBankAccount
	 * 
	 * 涉及表：
	 * ins_user_xxx 用户表（按地市分表）
	 * ins_accrel_xxx 用户账户付费关系表（按地市分表）
	 * cm_account_xxx 账户表（按地市分表）
	 * cm_acct_payment_xxx 账户支付表（按地市分表）
	 * cm_acct_bill_cycle_xxx 账户帐期表（按地市分表）
	 * cm_indiv_customer 个人客户表
	 * cmx_acct_payment_attr 账户支付扩展表
	 *  
	 * @param parameter {
	 * 	ServiceNum	手机号码	？		手机号码和账户编号两者取一
	 * 	AcctId	账户编号	？
	 * 	OpFlag	密码验证标志	1		标志=1 需要验证工号密码。标志=0 不需要验证工号密码。
	 * 		注意：这个密码校验，是统一接口组在调用客户管理接口之前进行校验的，校验通过，才调用客管接口
	 * 	OpId	工号	？
	 * 	PassWord	工号密码	？		OpFlag=1时必填
	 * 	Region	地区代码	1		用户的归属地市代码
	 * 	BankId	银行代码	1
	 * 	BankAccount	银行帐号	1
	 * 	BusiReqTime	交易请求时间	1		客户端请求时间
	 * 	OriginSeq	交易请求流水	1		客户端交易流水
	 * 	BusiType	业务类型			1：代扣2：托收
	 * }
	 * @return Map {
	 * 	ServiceNum	手机号码
	 * 	CustName	客户姓名
	 * 	BusiSeq	BOSS侧交易流水
	 * }
	 * @throws Exception
	 * </PRE>
	 */
	public Map unbindingBankAcctPayment(Map parameter) throws Exception;

	/**
	 * <PRE>
	 * 根据账户编号查询每次邮政代扣额度,查询CM_ACCT_PAYMENT、CMX_ACCT_PAYMENT_ATTR表
	 * 
	 * 涉及表：
	 * cm_account_xxx 账户表（按地市分表）
	 * cm_acct_payment_xxx 账户支付表（按地市分表）
	 * cm_acct_bill_cycle_xxx 账户帐期表（按地市分表）
	 * cm_indiv_customer 个人客户表
	 * cmx_acct_payment_attr 账户支付扩展表
	 * 
	 * @param acctId			账户编号
	 * @return Map {
	 * 	returnCode
	 * 	OnceFee  每次扣款金额
	 * 	returnMsg
	 * }
	 * @throws Exception
	 * </PRE>
	 */
	public Map queryBankAcctPaymentInfo(Long acctId) throws Exception;

	/**
	 * <PRE>   
	 * @Function userReceipt
	 * @Description 用户撤单
	 * 
	 * 涉及表:
	 * cm_ins_cmrel 客户用户关系表
	 * ins_accrel_xxx 用户账户付费关系表（按地市分表）
	 * cm_account_xxx 账户表（按地市分表）
	 * cm_acct_payment_xxx 账户支付表（按地市分表）
	 * cm_acct_bill_cycle_xxx 账户账期表（按地市分表）
	 * CMX_ACCT_PAYMENT_ATTR 账户支付扩展表,只查询了BankBehalfPhone(银行账号代表号码)
	 * cm_club_member 大客户表
	 * cm_user_manager 大客户电话经理表
	 * cm_group_member 集团成员表
	 * CM_BILL_CUSTOMIZE_XXX 客户化帐单定制表(按地市分表)
	 * cm_indiv_customer 个人客户表
	 *
	 * @param custId			客户编号
	 * @param acctId			账户编号
	 * @param userId			用户编号
	 * @return Boolean {true:成功；false:失败}
	 * @throws Exception
	 *
	 * @version v1.0.0
	 * @author shitian
	 * @date Sep 8, 2012 2:11:59 PM
	 * 
	 * <strong>Modification History:</strong><br>
	 * Date         Author          Version            Description<br>
	 * ---------------------------------------------------------<br>
	 * Sep 8, 2012     shitian           v1.0.0               修改原因<br>
	 * </PRE>
	 */
	public Boolean userReceipt(long custId, long acctId, long userId) throws Exception;

	/**
	 * <PRE>
	 * 3.1.3.25 开通信用度登记,统一接口组调用
	 * 接口编码:OI_OrderCreditRegister
	 *    
	 * 开通信用度登记
	 * @Function createParty
	 * @Description 创建参与人信息<br>
	 * 
	 * 涉及表:
	 * ins_user_xxx 用户表（按地市分表）
	 * CM_USER_SPEUSER_MAIN 信誉度特殊用户维护记录表
	 * cm_indiv_customer 个人客户表
	 * cm_account_xxx 账户表（按地市分表）
	 * 
	 * @param serviceNum 手机号码   如果没有此值 请传递 -1
	 * @param userId 用户编号	      如果没有此值 请传递 -1
	 * @param actType 			  操作类型 0开通，1取消
	 * @return 处理结果 {
	 *  retCode   0     成功
	 *            1001  服务号码{0}不存在 
	 *            1002  已经开通，无需办理
	 *            1003  未开通，无需取消
	 *            1004  其它错误
	 *  retMsg  错误信息
	 * }
	 * @throws Exception 
	 * 
	 * @version v1.0.0
	 * @author kangzk
	 * @date 2012-9-11 下午12:28:14
	 * 
	 * <strong>Modification History:</strong><br>
	 * Date         Author          Version            Description<br>
	 * ---------------------------------------------------------<br>
	 * 2012-9-11     kangzk           v1.0.0               修改原因<br>
	 * </PRE>
	 */
	public Map dredgeCreditEnter(long serviceNum, long userId, long actType) throws Exception;

	/**
	 * <PRE>
	 * 提供给外围是否降零账户接口
	 * 
	 * 涉及表：
	 * CM_USER_CREDIT_LEVEL_TEMP 用户信誉等级调整信息临时表
	 * 
	 * @param acctId			账户编号
	 * @return Boolean {true:是降零账户；false:不是降零账户；}
	 * @throws Exception
	 * </PRE>
	 */
	public Boolean checkCreditLevelByAcctId(long acctId) throws Exception;

	/**   
	 * <PRE>
	 * 3.4.2.16 查询集团帐单寄送信息,统一接口组调用
	 * 接口编码:OI_GetGroupBillPost
	 * 
	 * 涉及表:
	 * cm_group_customer 集团客户表
	 * cm_cust_acct_rel 客户账户关系表
	 * CM_BILL_CUSTOMIZE_XXX 客户化帐单定制表(按地市分表)
	 * 
	 * @Function queryGrpCustAcctBill
	 * @Description 
	 * 
	 * @param parameter {
	 * 		GroupId		集团编码
	 * }
	 * @return 处理结果
	 * @throws Exception 
	 * @version v1.0.0
	 * @author kangzk
	 * @date 2012-9-11 下午12:28:14
	 * 
	 * <strong>Modification History:</strong><br>
	 * Date         Author          Version            Description<br>
	 * ---------------------------------------------------------<br>
	 * 2012-9-11     kangzk           v1.0.0               修改原因<br>
	 * </PRE>
	 */
	public Map queryGrpCustAcctBill(Map parameter) throws Exception;

	/**   
	 * <PRE>
	 * 根据合同编号查询合同URL地址
	 * @Function queryCmGrpContractURL
	 * @Description
	 * 
	 * 涉及表：
	 * cm_group_contract 集团合同表
	 * cm_attach 客户管理附件表
	 * 
	 * @param parameter {
	 *  	  attachId  合同编号
	 * }
	 * @return {
	 * 		url 合同附件的url地址
	 * 		CONTRACT_NAME 合同名称
	 * 		FILE_SIZE 附件文件大小
	 * }
	 * @throws Exception 
	 * @version v1.0.0
	 * @author kangzk
	 * @date 2012-9-11 下午12:28:14
	 * 
	 * <strong>Modification History:</strong><br>
	 * Date         Author          Version            Description<br>
	 * ---------------------------------------------------------<br>
	 * 2012-9-11     kangzk           v1.0.0               修改原因<br>
	 * </PRE>
	 */
	public List queryCmGrpContractURL(String attachId) throws Exception;

	/** 
	 * <PRE>  
	 * 3.4.2.18 查询集团信用信息,统一接口组调用
	 * 接口编码:OI_GetGroupCredit
	 * 
	 * @Function queryGrpCustCredirMessage
	 * @Description <br>
	 * 
	 * 涉及表:
	 * cm_group_customer 集团客户表
	 * 
	 * @param parameter {
	 *  			GroupId  集团编码
	 *  }
	 * @return {
	 * 	CustId	客户标识
	 * 	CreditLevel	客户信用等级
	 * 	CreditValue	客户信用度
	 * }
	 * @throws Exception 
	 * @version v1.0.0
	 * @author kangzk
	 * @date 2012-9-11 下午12:28:14
	 * 
	 * <strong>Modification History:</strong><br>
	 * Date         Author          Version            Description<br>
	 * ---------------------------------------------------------<br>
	 * 2012-9-11     kangzk           v1.0.0               修改原因<br>
	 * </PRE>
	 */
	public Map queryGrpCustCredirMessage(Map parameter) throws Exception;

	/**
	 * <PRE>
	 * 新增黑名单客户
	 * 
	 * 涉及表:
	 * cm_special_list 特殊名单表
	 * cm_indiv_customer 个人客户表
	 * CM_PARTY_CONTACT 参与人联系信息
	 * 
	 * @param parameter {
	 * 		CUST_ID 客户编码
	 * 		USER_ID 用户编码
	 * 		BILL_ID 手机号码
	 * 		CUST_NAME 客户名称
	 * 		CERT_TYPE 证件类型
	 * 		CERT_CODE 证件号码
	 * 		ADD_REASON 加入原因
	 * }
	 * @return long
	 * @throws Exception
	 * </PRE>
	 */
	public long addSpecialCustomer(Map parameter) throws Exception;

	/**
	 * <PRE>
	 * 删除黑名单客户
	 *
	 * 涉及表:
	 * cm_special_list 特殊名单表
	 * 
	 * @param certType				证件类型
	 * @param certCode				证件号码
	 * @param listType				特殊客户类型？
	 * @param userId				用户编号
	 * @return long
	 * @throws Exception
	 * </PRE>
	 */
	public long delSpecialCustomer(long certType, String certCode, String listType, long userId) throws Exception;

	/**
	 * <PRE>   
	 * 根据地市编码查询该地市下的托收银行 返回银行编码列表
	 * @Function queryBankCodeByRegionIdAndPayMethod
	 * @Description 根据地市编码查询该地市下的托收银行
	 * 
	 * 涉及表：
	 * CM_ACCT_PAYMENT_XXX 账户支付表(按地市分表)
	 * 
	 * @param regionId 			地市编号
	 * @param payType 			支付方式
	 * @return IAcctPaymentValue[]
	 * @see com.asiainfo.crm.cm.model.ivalues.IAcctPaymentValue
	 * @throws Exception 
	 *
	 * @version v1.0.0
	 * @author kangzk
	 * @date 2012-9-11 下午12:28:14
	 * 
	 * <strong>Modification History:</strong><br>
	 * Date         Author          Version            Description<br>
	 * ---------------------------------------------------------<br>
	 * 2012-9-11     kangzk           v1.0.0               修改原因<br>
	 * </PRE>
	 */
	public IAcctPaymentValue[] queryBankCodeByRegionIdAndPayMethod(String regionId, int payMethod) throws Exception;

	/**
	 * <PRE>
	 * 3.1.1.22 查询帐户信息,统一接口组调用
	 * 接口编码:OI_GetAccountInfo
	 * (集团网厅)3.3.1.1 查询帐户名称列表 
	 * 
	 * 根据根据ServiceNum,UserId,CustId,AcctId查询账户信息
	 * 
	 * 涉及表:
	 * ins_user_xxx 用户表（按地市分表）
	 * ins_accrel_xxx 用户账户付费关系表（按地市分表）
	 * cm_cust_acct_rel 客户账户关系表
	 * cm_account_xxx 账户表（按地市分表）
	 * cm_acct_payment_xxx 账户支付表（按地市分表）
	 * cm_acct_bill_cycle_xxx 账户账期表（按地市分表）
	 * CMX_ACCT_PAYMENT_ATTR 账户支付扩展表,只查询了BankBehalfPhone(银行账号代表号码)
	 * 
	 * @param parameter {
	 * 	ServiceNum 手机号码
	 * 	UserId 用户编号
	 * 	CustId 客户编号
	 * 	AcctId 账户编号
	 * }
	 * @return Map {
	 * 		AccId	帐户编号	1
	 * 		CustId	客户编号	1
	 * 		AccType	帐户类型	1	1：金卡专用帐户此类帐户为金卡神州行某一用户专用2：公用帐户可以给多个用户使用
	 * 		AccStatus	帐户状态	1	0：历史1：正常2：预销4：注销
	 * 		AccName	帐户名称	1
	 * 		PayMethod	支付方式	1
	 * 		AccCycle	帐期	1
	 * 		CreditLevel	信用等级	?
	 * 		CreditValue	信用额度/透支额度	?
	 * 		UrgeStopFlag	免催免停标志	?
	 *		RegionId	地区代码	?		客户归属的地区
	 *		CountyId	县市代码	?		客户归属的县市
	 *		AccExtendInfo	帐户扩展信息	?		帐户扩展表数据
	 *		MainNum	主付费号码	？
	 *		BankId	银行编号	？
	 *		BankAccount	银行账号	？
	 *		CrtLevelName	信用等级名称	？		
	 * }
	 * @throws Exception
	 * </PRE>
	 */
	public Map queryAcctPayment(Map parameter) throws Exception;

	/**
	 * <PRE>
	 * 根据根据ecCode查询集团客户信息
	 * 
	 * 涉及表:
	 * CM_GROUP_CUSTOMER 集团客户表
	 * CM_PARTY_CONTACT 参与人联系信息
	 * 
	 * @param ecCode					全网集团编码
	 * @return ICustomerValue
	 * @see com.asiainfo.crm.cm.model.ivalues.ICustomerValue
	 * @throws Exception
	 * </PRE>
	 */
	public ICustomerValue queryCustotmerByEcCode(String ecCode) throws Exception;

	/**
	 * <PRE>
	 * 新增账户信息(专为总部下发集团客户新建集团账户)
	 * 
	 * 涉及表:
	 * cm_cust_acct_rel 客户账户关系表
	 * cm_account_xxx 账户表（按地市分表）
	 * cm_acct_payment_xxx 账户支付表（按地市分表）
	 * cm_acct_bill_cycle_xxx 账户账期表（按地市分表）
	 * 
	 * @param parameter {
	 * 		CustId 集团客户编号
	 * 		AcctName 账户名称
	 * 		AcctType 账户类型
	 * 		RegionID 账户归属地市
	 * }
	 * @return long 返回的是新增成功的账户编号
	 * @throws Exception
	 * </PRE>
	 */
	public long saveAccount4BBoss(Map parameter) throws Exception;

	/**
	 * <PRE>   
	 * @Function queryCustDesUsers 操作CM_INS_DES_CMREL
	 * @Description 根据客户编号查询已经成功销户的用户信息
	 *
	 * 涉及表:
	 * CM_INS_DES_CMREL 用户回收表
	 * 
	 * @param custId				客户编号
	 * @return IBOLnCmInsDesRelValue[]
	 * @see com.asiainfo.crm.cm.ln.common.ivalues.IBOLnCmInsDesRelValue
	 * @throws Exception
	 *
	 * @version v1.0.0
	 * @author shitian
	 * @date Oct 1, 2012 8:51:53 PM
	 * 
	 * <strong>Modification History:</strong><br>
	 * Date         Author          Version            Description<br>
	 * ---------------------------------------------------------<br>
	 * Oct 1, 2012     shitian           v1.0.0               修改原因<br>
	 * </PRE>
	 */
	public IBOLnCmInsDesRelValue[] queryCustDesUsers(long custId) throws Exception;

	/**
	 * <PRE>   
	 * @Function saveDesUsers 操作CM_INS_DES_CMREL
	 * @Description 保存销户用户信息
	 *
	 * 涉及表:
	 * CM_INS_DES_CMREL 用户回收表
	 * 
	 * @param insDesRelValues
	 * @see com.asiainfo.crm.cm.ln.common.ivalues.IBOLnCmInsDesRelValue
	 * @return Boolean
	 * @throws Exception
	 *
	 * @version v1.0.0
	 * @author shitian
	 * @date Oct 1, 2012 8:53:59 PM
	 * 
	 * <strong>Modification History:</strong><br>
	 * Date         Author          Version            Description<br>
	 * ---------------------------------------------------------<br>
	 * Oct 1, 2012     shitian           v1.0.0               修改原因<br>
	 * </PRE>
	 */
	public Boolean saveDesUsers(IBOLnCmInsDesRelValue[] insDesRelValues) throws Exception;

	/**
	 * <PRE>   
	 * @Function queryDesUsers 操作cm_ins_cmrel
	 * @Description 查询已经销户的用户信息(只查state为0的数据)
	 *
	 * 涉及表:
	 * CM_INS_CMREL 用户客户关系表
	 * 
	 * @param custId				客户编号
	 * @return IBOLnCmInsCmRelValue[]		客户用户关系对象,只返回STATE为0的数据
	 * @see com.asiainfo.crm.cm.ln.common.ivalues.IBOLnCmInsCmRelValue
	 * @throws Exception
	 *
	 * @version v1.0.0
	 * @author shitian
	 * @date Oct 1, 2012 8:46:40 PM
	 * 
	 * <strong>Modification History:</strong><br>
	 * Date         Author          Version            Description<br>
	 * ---------------------------------------------------------<br>
	 * Oct 1, 2012     shitian           v1.0.0               修改原因<br>
	 * </PRE>
	 */
	public IBOLnCmInsCmRelValue[] queryDesUsers(long custId) throws Exception;

	/** 
	 * <PRE>
	 * 3.4.2.28 查询集团联系人信息,统一接口组调用
	 * 接口编码:OI_GetGroupLinkMan
	 * 
	 * 查询集团联系人FOR CBOSS
	 * @Function queryContactInfo4CBOSS
	 * @Description 查询集团联系人FOR CBOSS
	 * 
	 * 涉及表:
	 * cm_group_customer 集团客户表
	 * cm_party_contact 参与人联系表
	 * cm_party 参与人表
	 * cm_indiv_party 个人客户参与人表
	 * cm_group_contact 集团客户参与人表
	 * cm_club_member 大客户表
	 * 
	 * @param serviceNum 			手机号码   
	 * @param groupId     			集团编号  必传
	 * @param bgnIndex				查询起始记录数
	 * @param endIndex				查询结束记录数
	 * @return Map {
	 *  	retCode   0为成功，其他值为失败；
	 *  	retMsg    错误信息
	 *  	LinkManInfo {
	 *  		Name	姓名
	 *  		ServiceNum	手机号码
	 *  		LinkManLevel	联系人级别
	 *  		IsMain	是否主要联系人
	 *  		ClassFlag	大客户标志
	 *  		ClassLevel	大客户级别
	 *  		vipLevel	客户VIP级别
	 *  		CreateDate	加入集团时间
	 *  		BrandName	品牌
	 *  		PlanName	套餐
	 *  	}
	 *  }
	 * @throws Exception 
	 * @version v1.0.0
	 * @author zouty
	 * @date 2012-9-11 下午12:28:14
	 * 
	 * <strong>Modification History:</strong><br>
	 * Date         Author          Version            Description<br>
	 * ---------------------------------------------------------<br>
	 * 2012-10-1     zouty           v1.0.0               修改原因<br>
	 * </PRE>
	 */
	public Map queryContactInfo4CBOSS(String groupId, String serviceNum, int bgnIndex, int endIndex) throws Exception;

	/**
	 * <PRE>
	 * 3.4.2.27 查询集团关键人信息,统一接口组调用
	 * 接口编码:OI_GetGroupKeyMan
	 *    
	 * 查询集团关键人FOR CBOSS
	 * @Function queryKeyInfo4CBOSS
	 * @Description 查询集团关键人FOR CBOSS<br>
	 * 
	 * 涉及表:
	 * cm_group_customer 集团客户表
	 * cm_party_contact 参与人联系表
	 * cm_party 参与人表
	 * cm_indiv_party 个人客户参与人表
	 * cm_group_contact 集团客户参与人表
	 * 
	 * @param KeyManName  手机号码   
	 * @param groupId     集团编号  
	 * @param BgnIndex    开始记录号  
	 * @param EndIndex    结束记录号
	 * @return Map {
	 *  		retCode   0     成功
	 *  		retMsg    错误信息
	 * 			Count 记录总数
	 * 			KeyManInfo {
	 * 				Name	姓名
	 * 				ServiceNum	服务号码
	 * 				VipLevel	客户VIP级别
	 * 				CreateDate	加入时间
	 * 				MemberType	成员类型
	 * 				Position	职位
	 * 				Brand	品牌
	 * 				PlanId	套餐
	 * 				KeyLevel	关键人级别
	 * 				KeyType	关键人类型
	 * 				UserStatus	用户状态 
	 * 		}
	 *  }
	 * @throws Exception 
	 * @version v1.0.0
	 * @author zouty
	 * @date 2012-9-11 下午12:28:14
	 * 
	 * <strong>Modification History:</strong><br>
	 * Date         Author          Version            Description<br>
	 * ---------------------------------------------------------<br>
	 * 2012-10-1     zouty           v1.0.0               修改原因<br>
	 * </PRE>
	 */
	public Map queryKeyInfo4CBOSS(String groupId, String name, int bgnIndex, int endIndex) throws Exception;

	/**
	 * <PRE>   
	 * 3.4.2.21 查询集团成员基本资料,统一接口组调用
	 * 接口编码:OI_GetGroupMemberInfo
	 * 
	 * @Function queryCmGrpMember
	 * @Description 
	 * 
	 * 涉及表:
	 * ins_user_xxx 用户表（按地市分表）
	 * cm_indiv_customer 个人客户表
	 * cm_group_member 集团成员表
	 * cm_group_customer 集团客户表
	 * sec.sec_staff 员工表
	 * sec.sec_organize 组织表
	 * sec.sec_operator 操作工号表
	 * sec.sec_oper_domain_rela 工号扩展归属系统表
	 * 
	 * @param parameter map对象 {
	 * 		UserId 用户编号
	 * }
	 * @return Map {
	 * 		UserId	用户编号
	 * 		CustName	成员姓名
	 * 		Position	职位
	 * 		RegionCode	归属区域
	 * 		ModuleName	评估价值
	 * 		Gendor	性别
	 * 		ServiceNum	服务号码
	 * 		ManagerId	客户经理
	 * 		Department	所在部门
	 * 		UserStatus	用户状态
	 * 		ManagerPhone	客户经理电话
	 * 		IsBind	是否捆绑
	 * 		Birthday	生日
	 * 		Vocation	职业
	 * 		BrandId	用户品牌
	 * }
	 * @throws Exception 
	 * @version v1.0.0
	 * @author kangzk
	 * @date 2012-9-11 下午12:28:14
	 * 
	 * <strong>Modification History:</strong><br>
	 * Date         Author          Version            Description<br>
	 * ---------------------------------------------------------<br>
	 * 2012-9-11     kangzk           v1.0.0               修改原因<br>
	 * </PRE>
	 */
	public Map queryCmGrpMember(Map parameter) throws Exception;

	/**
	 * <PRE>   
	 * 3.4.2.7 查询集团成员信息,统一接口组调用
	 * 接口编码：OI_GetGroupMember
	 * 
	 * @Function queryCmGrpMember
	 * @Description 
	 * 
	 * 涉及表：
	 * cm_group_customer 集团客户表
	 * CM_PARTY_CONTACT 参与人联系人
	 * cm_group_member 集团成员表
	 * cm_group_manager 集团客户经理关系表
	 * cm_club_member 大客户表
	 * 
	 * @param parameter map对象 {
	 * 		GroupId	集团编号	1
	 * 		ServiceNum	成员服务号码	?		成员号码和客户姓名是或的关系
	 * 		CustName	成员客户姓名	？
	 * 		VIPFlag	重要成员标识	1
	 * 		BgnIndex	开始记录数	1		当开始记录数为1时需要返回总记录数。
	 * 		EndIndex	结束记录数	1		
	 * }
	 * @return Map {
	 * 		Count	总记录数	？		开始记录数为1时返回
	 * 		MemberInfo	成员信息	*		参见附录集团成员信息 {
	 * 			GroupId	集团客户编码	1	
	 * 			CustId	成员客户标识	1
	 * 			MemberKind	成员类型	1
	 * 			UserId	用户编号	1
	 * 			Department	部门	1	
	 * 			Job	职位	1
	 * 			VipFlag	是否大客户	1	0：非大客户1：大客户
	 * 			CustManagerId	客户经理编号	1
	 * 			MembertName	成员名称	1
	 * 			RegionCode	地市编号	1
	 * 			CountyCode	县市编号	1
	 * 			GroupMode	集团类型	1
	 * 			ClassId	VIP级别标识	1
	 * 			State	成员状态	1
	 * 			CreateDate	成员加入时间	1	YYYYmmDDHH24MMSS
	 * 			BrandName	品牌名称	？
	 * 			BrandId	品牌标识	？
	 * 			PlanName	套餐名称	？
	 * 			PlanId	套餐标识	？	
	 * 		}
	 * }
	 * @throws Exception 
	 * @version v1.0.0
	 * @author kangzk
	 * @date 2012-9-11 下午12:28:14
	 * 
	 * <strong>Modification History:</strong><br>
	 * Date         Author          Version            Description<br>
	 * ---------------------------------------------------------<br>
	 * 2012-9-11     kangzk           v1.0.0               修改原因<br>
	 * </PRE>
	 */
	public Map queryCmGrpMemberList(Map parameter) throws Exception;

	/**
	 * <PRE>   
	 * @Function getOneCreditMapping
	 * @Description 查询单个
	 *
	 * 涉及表：
	 * CM_CREDIT_MAPPING 信用等级映射表
	 * 
	 * @param regionId 归属地市
	 * @param custType 客户类型
	 * @param creditLevel 信用等级
	 * @return IBOCmCreditMappingValue
	 * @see com.asiainfo.crm.cm.common.ivalues.IBOCmCreditMappingValue
	 * @throws Exception
	 *
	 * @version v1.0.0
	 * @author shitian
	 * @date Oct 4, 2012 11:59:32 AM
	 * 
	 * <strong>Modification History:</strong><br>
	 * Date         Author          Version            Description<br>
	 * ---------------------------------------------------------<br>
	 * Oct 4, 2012     shitian           v1.0.0               修改原因<br>
	 * </PRE>
	 */
	public IBOCmCreditMappingValue getOneCreditMapping(String regionId, int custType, int creditLevel) throws Exception;

	/**
	 * <PRE>   
	 * <b>
	 * 查询账户当前账期和未生效账期信息，按生效日期倒序排列<br>
	 * queryNextAcctBillCyclesByAcctId
	 * </b>
	 *
	 * 涉及表:
	 * CM_ACCT_BILL_CYCLE_XXX 账户帐期表（按地市分表）
	 * 
	 * @param acctId 			账户ID
	 * @return IAcctBillCycleValue[]
	 * @see com.asiainfo.crm.cm.model.ivalues.IAcctBillCycleValue
	 * @throws Exception
	 * @version v1.0
	 * @author caiyu
	 * @date 2012-10-04
	 * 
	 * <strong>Modification History:</strong><br>
	 * Date         Author          Version            Description<br>
	 * ---------------------------------------------------------<br>
	 * 2012-10-4     caiyu           v1.0.0               修改原因<br>
	 * </PRE>
	 */
	public IAcctBillCycleValue[] queryNextAcctBillCyclesByAcctId(long acctId) throws Exception;

	/**
	 * <PRE>   
	 * 2021跨区入网客户积分和等级转入和冲正接口，统一接口组调用
	 * 接口编码：2021
	 * 
	 * @Function transferCustScoreAndGrade
	 * @Description 
	 * 
	 * 涉及表:
	 * cm_indiv_customer 个人客户表
	 * ins_user_xxx 用户表（按地市分表）
	 * cm_vip_element 大客户因子表
	 * cm_club_member 大客户表
	 * cm_group_contact 集团关键人、联系人、家属表
	 * 还需要调用积分的接口
	 * TransferResultDataBean com.asiainfo.crm.score.teaminvoke.out.service.interfaces.IScoreCMSV
	 * 		.transferScore(CustScoreAndGradeInfoDataBean inBean) throws Exception
	 * 
	 * @param parameter map对象 {
	 * 		newBillId	转入手机号码	String	
	 * 		oldBillId	归属地手机号码	String		客户原归属地手机号码
	 * 		allConScore	总消费积分	String		总消费积分（M值）
	 * 		Type	积分类型	short		0－全球通积分；1－动感地带
	 * 		Level	客户级别	short		0－普通用户（动感地带用户为普通用户）	1－银卡2－金卡3－钻石卡
	 * 		levelDate	客户级别有效期	String	Y	YYYYMMDD 客户级别是VIP（钻石卡，金卡，银卡）时填写
	 * 		oprCode	操作类型	short		0—积分转入,1—冲正
	 * 		procId	交易流水号	long		CBOSS交易流水号（用于冲正）
	 * 		effectDate	被冲正交易日期	String	Y	格式yyyyMMdd（冲正时填写）
	 * 		Scores	年积分信息	List<Score>	Y	ScoreYear是年份，如下的年消费积分、奖励积分、已兑换积分、可兑换积分都是该年份所对应的积分。
	 * 		{
	 * 			scoreYear	年份	String		YYYY，如2008年，此处输入2008
	 * 			yearConScore	年消费积分(M值)	String
	 * 			awardScore	奖励积分（M值）	String
	 * 			useScore	已兑换积分(M值)	String
	 * 			ableScore	可兑换积分(M值)	String		
	 * 		}
	 * }
	 * @return 处理结果 {
	 * 		Result	二级返回码	String		参见返回值定义
	 * 		resultDesc	失败原因描述	String	Y	成功时不填，失败时填写原始失败原因（如：异常信息）
	 * 		otherInfo	扩展信息	Map<String,String>	Y	备用 {
	 * 		}
	 * }
	 * @throws Exception 
	 * @version v1.0.0
	 * @author kangzk
	 * @date 2012-9-11 下午12:28:14
	 * 
	 * <strong>Modification History:</strong><br>
	 * Date         Author          Version            Description<br>
	 * ---------------------------------------------------------<br>
	 * 2012-9-11     kangzk           v1.0.0               修改原因<br>
	 * </PRE>
	 */
	public Map transferCustScoreAndGrade(Map parameter) throws Exception;

	/**
	 * <PRE>
	 * 3.4.2.38 查询下级集团信息,统一接口调用,提供给ESOP
	 * 接口编码：OI_GetNextLevelGroup
	 *    
	 * 查询集团客户的下级集团
	 * @Function qrySubordinateGrpCust
	 * @Description 
	 * 
	 * 涉及表：
	 * CM_GROUP_CUSTOMER 集团客户表 
	 * CM_PARTY_CONTACT 参与人联系表
	 * 
	 * @param CustId 集团客户编号
	 * @return 处理结果{
	 * 	CustId	集团客户编码	1	
	 * 	CustName	集团客户名称	1
	 * 	CustLevel	客户层次	？	0	总部级客户1	省级客户2	市级客户3	县级客户4	乡镇级客户
	 * 	CustStatus	客户状态	1	0	历史1	正常2	潜在3	注销4	竞争对手
	 * }
	 * @throws Exception 
	 * @version v1.0.0
	 * @author kangzk
	 * @date 2012-9-11 下午12:28:14
	 * 
	 * <strong>Modification History:</strong><br>
	 * Date         Author          Version            Description<br>
	 * ---------------------------------------------------------<br>
	 * 2012-9-11     kangzk           v1.0.0               修改原因<br>
	 * </PRE>
	 */
	public Map qrySubordinateGrpCust(long CustId) throws Exception;

	/**
	 * <PRE>   
	 * 火车站VIP服务鉴权，统一接口组调用该接口
	 * 接口编码：2018
	 * 
	 * @Function checkTrainService
	 * @Description 
	 * 
	 * 涉及表：
	 * 调用营业个人的手机号码、密码校验接口
	 * ins_user_xxx 用户表（按地市分表）
	 * cm_indiv_customer 个人客户表
	 * cm_club_member 大客户表
	 * CM_CLUB_SERVICE 俱乐部服务定义表
	 * cm_club_service_adjust 俱乐部会员服务临时额度信息表
	 * cm_club_service_cycle 俱乐部服务使用周期
	 * cm_club_service_vdoing 俱乐部服务维度定义表
	 * 
	 * @param parameter map对象 {
	 * 		mobileNum	手机号码	String
	 * 		password	客服密码	String	Y
	 * 		idCardInfo	客户证件	List<IdCardInfo>	Y {
	 * 			idCardType	证件类型	String
	 * 			idCardNum	证件号码	String
	 * 		}
	 * 		svcLevel	服务级别	int
	 * 		attendants	随员人数	int	Y
	 * 		otherInfo	扩展信息	Map<String,String>	Y	备用
	 * }
	 * @return 处理结果 {
	 * 		result	二级返回码	String		参见返回值定义
	 * 		resultDesc	失败原因描述	String	Y	成功时不填，失败时填写原始失败原因（如：异常信息）
	 * 		mobileNum	手机号码	String
	 * 		rspInfo	鉴权返回信息	CustVipInfo	Y {
	 * 			name	客户姓名	String
	 * 			idCardInfo	客户证件	List<IdCardInfo>
	 * 			userStatus	用户状态	String
	 * 			userRank	客户级别	String
	 * 			svcPhNum	大客户经理电话	String
	 * 			userScore	客户可用积分余额	String
	 * 		}
	 * 		otherInfo	扩展信息	Map<String,String>	Y	备用
	 * }
	 * @throws Exception 
	 * @version v1.0.0
	 * @author xiezl
	 * @date 2012-9-11 下午12:28:14
	 * 
	 * <strong>Modification History:</strong><br>
	 * Date         Author          Version            Description<br>
	 * ---------------------------------------------------------<br>
	 * 2012-10-6     xiezl           v1.0.0               修改原因<br>
	 * </PRE>
	 */
	public Map checkTrainService(Map bean) throws Exception;

	/**
	 * <PRE>   
	 * 机场VIP服务鉴权，统一接口组调用该接口
	 * 接口编码：2016
	 * 
	 * @Function checkAirportService
	 * @Description 
	 * 
	 * 涉及表：
	 * 调用营业个人的手机号码、密码校验接口
	 * ins_user_xxx 用户表（按地市分表）
	 * cm_indiv_customer 个人客户表
	 * cm_club_member 大客户表
	 * CM_CLUB_SERVICE 俱乐部服务定义表
	 * cm_club_service_adjust 俱乐部会员服务临时额度信息表
	 * cm_club_service_cycle 俱乐部服务使用周期
	 * cm_club_service_vdoing 俱乐部服务维度定义表
	 * 
	 * @param parameter map对象 {
	 * 	mobileNum	手机号码	String
	 * 	password	客服密码	String
	 * 	idCardInfo	客户证件	List<IdCardInfo> {
	 * 		idCardType	证件类型	String
	 * 		idCardNum	证件号码	String
	 * 	}
	 * 	svcLevel	服务级别	int
	 * 	attendants	随员人数	int
	 * 	otherInfo	扩展信息	Map<String,String>
	 * }
	 * @return 处理结果 {
	 * 	result	二级返回码	String
	 * 	resultDesc	失败原因描述	String
	 * 	mobileNum	手机号码	String
	 * 	rspInfo	鉴权返回信息	CustVipInfo {
	 * 		name	客户姓名	String
	 * 		idCardInfo	客户证件	List<IdCardInfo>
	 * 		userStatus	用户状态	String
	 * 		userRank	客户级别	String
	 * 		svcPhNum	大客户经理电话	String
	 * 		userScore	客户可用积分余额	String
	 * 		freeTimes	客户可用免费次数	String
	 * 	}
	 * 	otherInfo	扩展信息	Map<String,String>
	 * }
	 * @throws Exception 
	 * @version v1.0.0
	 * @author xiezl
	 * @date 2012-9-11 下午12:28:14
	 * 
	 * <strong>Modification History:</strong><br>
	 * Date         Author          Version            Description<br>
	 * ---------------------------------------------------------<br>
	 * 2012-10-6     xiezl           v1.0.0               修改原因<br>
	 * </PRE>
	 */
	public Map checkAirportService(Map bean) throws Exception;

	/**
	 * <PRE>   
	 * 机场VIP服务记帐接口，统一接口组调用该接口
	 * 接口编码：2017
	 * 
	 * @Function recordAirportService
	 * @Description 
	 * 
	 * 涉及表：
	 * 调用营业个人的手机号码、密码校验接口
	 * ins_user_xxx 用户表（按地市分表）
	 * cm_indiv_customer 个人客户表
	 * cm_club_member 大客户表
	 * CM_CLUB_SERVICE 俱乐部服务定义表
	 * cm_club_service_adjust 俱乐部会员服务临时额度信息表
	 * cm_club_service_cycle 俱乐部服务使用周期
	 * cm_club_service_vdoing 俱乐部服务维度定义表
	 * CM_CLUB_SERVICE_REC 俱乐部会员服务记录
	 * 
	 * @param parameter map对象 {
	 * 	donecode	交易流水号	String		CBOSS交易流水号
	 * 	mobileNum	手机号码	String
	 * 	password	客服密码	String	Y
	 * 	idCardInfo	客户证件	List<IdCardInfo>	Y
	 * 	enterTime	进入时间	String		YYYYMMDDhhmmss
	 * 	leaveTime	离开时间	String		YYYYMMDDhhmmss
	 * 	svcLevel	服务级别	int
	 * 	svcRecords	统计项目集合	List<VipServiceDiscData>	Y {
	 * 		svcCode	统计项目编码	String
	 * 		svcDisc	统计项目内容	String	Y	统计项目编码为06时该字段必须出现
	 * 		subItem	二级项目	List<VipServiceDiscSubItem>	Y {
	 * 			itemId	统计项目编码	String
	 * 			itemValue	统计项目内容	String	Y	统计项目编码为06时该字段必须出现
	 * 		}
	 * 		price	金额	int	Y	该统计项目折合人民币金额，单位厘
	 * 		score	折合应扣积分	long	Y	统计项目的所有积分
	 * 	}
	 * 	amount	总金额	int	Y	所有统计项目折合人民币金额，单位厘
	 * 	totalScore	折合应扣总积分	long	Y
	 * 	totalTimes	应扣免费次数	int	Y
	 * 	otherInfo	扩展信息	Map<String,String>	Y	备用
	 * }
	 * @return 处理结果 {
	 * 	result	二级返回码	String		参见返回值定义
	 * 	resultDesc	失败原因描述	String	Y	成功时不填，失败时填写原始失败原因（如：异常信息）
	 * 	otherInfo	扩展信息	Map<String,String>	Y	备用
	 * }
	 * @throws Exception 
	 * @version v1.0.0
	 * @author xiezl
	 * @date 2012-9-11 下午12:28:14
	 * 
	 * <strong>Modification History:</strong><br>
	 * Date         Author          Version            Description<br>
	 * ---------------------------------------------------------<br>
	 * 2012-10-6     xiezl           v1.0.0               修改原因<br>
	 * </PRE>
	 */
	public Map recordAirportService(Map bean) throws Exception;

	/**
	 * <PRE>   
	 * 火车站VIP服务记帐接口，统一接口组调用该接口
	 * 接口编码：2019
	 * 
	 * 涉及表：
	 * 调用营业个人的手机号码、密码校验接口
	 * ins_user_xxx 用户表（按地市分表）
	 * cm_indiv_customer 个人客户表
	 * cm_club_member 大客户表
	 * CM_CLUB_SERVICE 俱乐部服务定义表
	 * cm_club_service_adjust 俱乐部会员服务临时额度信息表
	 * cm_club_service_cycle 俱乐部服务使用周期
	 * cm_club_service_vdoing 俱乐部服务维度定义表
	 * CM_CLUB_SERVICE_REC 俱乐部会员服务记录
	 * 
	 * @Function recordTrainService
	 * @Description 
	 * 
	 * @param parameter map对象 {
	 * 	donecode	交易流水号	String		CBOSS交易流水号
	 * 	mobileNum	手机号码	String
	 * 	password	客服密码	String	Y
	 * 	idCardInfo	客户证件	List<IdCardInfo>	Y
	 * 	enterTime	进入时间	String		YYYYMMDDhhmmss
	 * 	leaveTime	离开时间	String		YYYYMMDDhhmmss
	 * 	svcLevel	服务级别	int		
	 * 	svcRecords	统计项目集合	List<VipServiceDiscData>	Y {
	 * 		svcCode	统计项目编码	String
	 * 		svcDisc	统计项目内容	String	Y	统计项目编码为06时该字段必须出现
	 * 		subItem	二级项目	List<VipServiceDiscSubItem>	Y {
	 * 			itemId	统计项目编码	String
	 * 			itemValue	统计项目内容	String	Y	统计项目编码为06时该字段必须出现
	 * 		}
	 * 		price	金额	int	Y	该统计项目折合人民币金额，单位厘
	 * 		score	折合应扣积分	long	Y	统计项目的所有积分
	 * 	}
	 * 	amount	总金额	int	Y	所有统计项目折合人民币金额，单位厘
	 * 	totalScore	折合应扣总积分	long	Y
	 * 	wetherData	天气预报信息	VipServiceWetherData	Y {
	 * 		destProv	目的地省份	String		目的地省份编码
	 * 		destCity	目的地城市	String		目的地城市编码
	 * 		destDate1	目的地当天天气预报日期	String		YYYYMMDD
	 * 		destDate2	目的地第二天天气预报日期	String		YYYYMMDD
	 * 	}
	 * 	otherInfo	扩展信息	Map<String,String>	Y	备用
	 * }
	 * @return 处理结果 {
	 * 	result	二级返回码	String		参见返回值定义
	 * 	resultDesc	失败原因描述	String	Y	成功时不填，失败时填写原始失败原因（如：异常信息）
	 * 	otherInfo	扩展信息	Map<String,String>	Y	备用
	 * }
	 * @throws Exception 
	 * @version v1.0.0
	 * @author xiezl
	 * @date 2012-9-11 下午12:28:14
	 * 
	 * <strong>Modification History:</strong><br>
	 * Date         Author          Version            Description<br>
	 * ---------------------------------------------------------<br>
	 * 2012-10-6     xiezl           v1.0.0               修改原因<br>
	 * </PRE>
	 */
	public Map recordTrainService(Map bean) throws Exception;

	/**
	 * <PRE>
	 * 当操作员工号注销时或者取消客户经理、电话经理工号类型时调用
	 * 清除该工号下维系的客户关系
	 * 因为系统管理是jar包，因此这个接口被封装到客户管理的普通类的静态方法里面提供给系统管理调用
	 * public static Boolean com.asiainfo.crm.cm.ln.common.util.CmLnCommonUtil
	 * 	.delManagerRel(long managerId, String managerType) throws Exception
	 * 
	 * 涉及表：
	 * cm_group_manager 集团客户经理表
	 * cm_user_manager 大客户电话经理表
	 * 
	 * @param managerId  客户经理、电话经理编码
	 * @param managerType  工号类型： 0  全部类型  1 客户经理  2 电话经理  
	 * @return  执行成功返回：true；  失败：false；
	 * @throws Exception
	 * </PRE>
	 */
	public Boolean delManagerRel(long managerId, String managerType) throws Exception;

	/**
	 * <PRE>
	 * 提供给cboss使用查询钻金银卡信息,统一接口组也调用了这个接口
	 * 接口编码：1021
	 * 
	 * 涉及表:
	 * ins_user_xxx 用户表（按地市分表）
	 * cm_club_member 大客户表
	 * cm_club_member_card 大客户卡信息表
	 * 
	 * @param billId				服务号码
	 * @return Map {
	 * 		homeProvice	归属省代码	String
	 * 		misisdn	手机号码	String	加密该字段。
	 * 		cardNum	VIP卡号	String	鉴权成功后必须填写，否则不填。加密该字段。
	 * 		grade	VIP级别	String	1－钻石卡 2－金卡 3－银卡。鉴权成功后必须填写，否则不填。加密该字段。
	 * 		valiDate	VIP有效期	java.util.Date	加密 YYMM 如0606表示06年6月
	 * 		reserve	保留	String	为空
	 * 		result	鉴权结果	String	鉴权成功后不填写，否则填错误理由	01－非VIP用户02－非钻、金卡用户
	 * 		resultDesc	鉴权结果描述	String	鉴权结果描述
	 * 		otherInfo	Map	扩展信息	
	 * }
	 * @throws Exception
	 * </PRE>
	 */
	public Map qryVipCardInfo(String billId) throws Exception;

	/**
	 * <PRE>   
	 * @Function queryGroupCustByBillId
	 * @Description 根据手机号码查询归属集团信息
	 *
	 * 涉及表：
	 * ins_user_xxx 用户表（按地市分表）
	 * cm_group_member 集团成员表
	 * cm_group_customer 集团客户表
	 * 
	 * @param billId 手机号码
	 * @return IBOCmGroupCustomerValue
	 * @see com.asiainfo.crm.cm.inner.customer.ivalues.IBOCmGroupCustomerValue
	 * @throws Exception
	 *
	 * @version v1.0.0
	 * @author shitian
	 * @date Oct 8, 2012 7:40:10 PM
	 * 
	 * <strong>Modification History:</strong><br>
	 * Date         Author          Version            Description<br>
	 * ---------------------------------------------------------<br>
	 * Oct 8, 2012     shitian           v1.0.0               修改原因<br>
	 * </PRE>
	 */
	public IBOCmGroupCustomerValue queryGroupCustByBillId(String billId) throws Exception;

	/**
	 * <PRE>   
	 * @Function queryCmInsCmRelByCds
	 * @Description 根据条件查询客户用户关系表
	 * 
	 * 涉及表:
	 * CM_INS_CMREL 客户用户关系表
	 *
	 * @param custId 客户编号
	 * @param userId 用户编号
	 * @param state 0:销户；1：正常；-1：全部
	 * @return IBOLnCmInsCmRelValue[]
	 * @see com.asiainfo.crm.cm.ln.common.ivalues.IBOLnCmInsCmRelValue
	 * @throws Exception
	 *
	 * @version v1.0.0
	 * @author shitian
	 * @date Oct 5, 2012 8:38:28 PM
	 * 
	 * <strong>Modification History:</strong><br>
	 * Date         Author          Version            Description<br>
	 * ---------------------------------------------------------<br>
	 * Oct 5, 2012     shitian           v1.0.0               修改原因<br>
	 * </PRE>
	 */
	public IBOLnCmInsCmRelValue[] queryCmInsCmRelByCds(long custId, long userId, int state) throws Exception;

	/**
	 * <PRE>   
	 * @Function saveCmInsCmRelValues
	 * @Description 保存客户用户关系信息
	 *
	 * 涉及表:
	 * CM_INS_CMREL 客户用户关系表
	 *
	 * @param lnCmInsCmRelValues
	 * @see com.asiainfo.crm.cm.ln.common.ivalues.IBOLnCmInsCmRelValue
	 * @throws Exception
	 *
	 * @version v1.0.0
	 * @author shitian
	 * @date Aug 25, 2012 12:13:52 PM
	 * 
	 * <strong>Modification History:</strong><br>
	 * Date         Author          Version            Description<br>
	 * ---------------------------------------------------------<br>
	 * Aug 25, 2012     shitian           v1.0.0               修改原因<br>
	 * </PRE>
	 */
	public void saveCmInsCmRelValues(IBOLnCmInsCmRelValue[] lnCmInsCmRelValues) throws Exception;

	/**
	 * <PRE>   
	 * @Function queryAcctBankRel
	 * @Description 根据手机号码查询签约关系
	 *
	 * 涉及表：
	 * CMX_ACCT_BANK_REL 账户与银行关联关系表 （浦发银行签约的类型为2330001003；手机支付的类型为2330001004）
	 * 
	 * @param billId 手机号码
	 * @return IBOCmxAcctBankRelValue[]
	 * @see com.asiainfo.crm.cm.ln.account.ivalues.IBOCmxAcctBankRelValue
	 * @throws Exception
	 *
	 * @version v1.0.0
	 * @author shitian
	 * @date Oct 5, 2012 4:34:04 PM
	 * 
	 * <strong>Modification History:</strong><br>
	 * Date         Author          Version            Description<br>
	 * ---------------------------------------------------------<br>
	 * Oct 5, 2012     shitian           v1.0.0               修改原因<br>
	 * </PRE>
	 */
	public IBOCmxAcctBankRelValue[] queryAcctBankRel(String billId) throws Exception;

	/**
	 * <PRE>
	 * 3.4.2.37 查询集团客户根节点信息（层次信息）,统一接口组调用,提供给ESOP使用
	 * 接口编码：OI_GetGroupCustomerLevel
	 *    
	 * 涉及表：
	 * cm_group_customer 集团客户表
	 *    
	 * 根据CustId查询集团客户的根结点
	 * @Function queryRootGrpCustomers
	 * @Description 
	 * 
	 * @param custId 集团客户编号
	 * @return {
	 * 	CustId	集团客户编码	1
	 * 	CustName	集团客户名称	1
	 * 	CustLevel	客户层次	？	0	总部级客户1	省级客户2	市级客户3	县级客户4	乡镇级客户
	 * 	CustStatus	客户状态	1	0	历史1	正常2	潜在3	注销4	竞争对手
	 * }
	 * @throws Exception 
	 * @version v1.0.0
	 * @author zouty
	 * @date 2012-10-8 下午12:28:14
	 * 
	 * <strong>Modification History:</strong><br>
	 * Date         Author          Version            Description<br>
	 * ---------------------------------------------------------<br>
	 * 2012-10-6     zouty           v1.0.0               修改原因<br>
	 * </PRE>
	 */
	public List queryRootGrpCustomers(long custId) throws Exception;

	/**
	 * <PRE>   
	 * 销户调用接口
	 * @Function cancelLationOfUser
	 * @Description 
	 * 
	 * 涉及表:
	 * cm_ins_cmrel 客户用户关系表
	 * cm_indiv_customer 个人客户表
	 * cm_club_member 大客户表
	 * cm_user_manager 大客户电话经理表
	 * cm_group_member 集团成员表
	 * cm_group_contact 集团关键人、联系人、家属表
	 * 
	 * @param parameter {
	 * 	CustId 客户编号
	 * 	UserId 用户编号
	 * 	AcctId 账户编号
	 * }
	 * @return { true:成功; false:失败;}
	 * @throws Exception 
	 * @version v1.0.0
	 * @author zouty
	 * @date 2012-10-8 下午12:28:14
	 * 
	 * <strong>Modification History:</strong><br>
	 * Date         Author          Version            Description<br>
	 * ---------------------------------------------------------<br>
	 * 2012-10-6     zouty           v1.0.0               修改原因<br>
	 * </PRE>
	 */
	public Boolean cancelLationOfUser(Map parameter) throws Exception;

	/**
	 * <PRE>   
	 * @Function queryAcctAndPayments
	 * @Description 查询银行信息
	 *
	 * 涉及表:
	 * cm_account_xxx 账户表（按地市分表）
	 * cm_acct_payment_xxx 账户支付表（按地市分表）
	 * CMX_ACCT_PAYMENT_ATTR 账户支付扩展表,只查询了BankBehalfPhone(银行账号代表号码)
	 * 
	 * @param bankAccount 支付帐户
	 * @param regionId 管理区域标识
	 * @param payMethod 付费方式
	 * @return IAccountProfileValue[]
	 * @see com.asiainfo.crm.cm.model.ivalues.IAccountProfileValue
	 * @throws Exception
	 *
	 * @version v1.0.0
	 * @author shitian
	 * @date Oct 9, 2012 6:10:53 PM
	 * 
	 * <strong>Modification History:</strong><br>
	 * Date         Author          Version            Description<br>
	 * ---------------------------------------------------------<br>
	 * Oct 9, 2012     shitian           v1.0.0               修改原因<br>
	 * </PRE>
	 */
	public IAccountProfileValue[] queryAcctAndPayments(String bankAccount, String regionId, long payMethod) throws Exception;

	/**
	 * <PRE>
	 * @Function ICmPartnerBusiSV.java
	 * @Description 多表联合查询SI信息
	 * 
	 * 涉及表：
	 * cm_partner_info 合作伙伴表
	 * cm_partner_busi_info 合作伙伴业务信息表
	 * cm_PARTNER_BUSI_TYPE_DTL 合作伙伴业务明细类型
	 * 
	 * @param partnerTypeDtl 类型明细
	 * @param partnerType 伙伴类型
	 * @param statusType 状态类型
	 * @param typeDesc 明细类型描述
	 * @param start 开始记录数
	 * @param end 结束记录数
	 * @return IQBOCmPartnerInfoValue[]
	 * @see com.asiainfo.crm.cm.cp.ivalues.IQBOCmPartnerInfoValue
	 * @throws Exception
	 * 
	 * @version v1.0.0
	 * @author qiangkz
	 * @date Oct 9, 2012 2:03:37 PM
	 * 
	 * Modification History  Oct 9, 2012 qiangkz Version Description
	 * </PRE>
	 */
	public IQBOCmPartnerInfoValue[] queryMPartnerInfo(String partnerTypeDtl, String partnerType, String statusType, String typeDesc, int start, int end) throws Exception;

	/**
	 * <PRE>
	 * @Function ICmPartnerBusiSV.java
	 * @Description 单表查询SI信息
	 * 
	 * 涉及表：
	 * CM_PARTNER_INFO 合作伙伴
	 * 
	 * @param partnerTypeDtl 类型明细
	 * @param partnerType 伙伴类型
	 * @param statusType 状态类型
	 * @param siIntroNum SI/EC基本接入号
	 * @param start 开始记录数
	 * @param end 结束记录数
	 * @return IBOCmPartnerInfoValue[]
	 * @see com.asiainfo.crm.cm.cp.ivalues.IBOCmPartnerInfoValue
	 * @throws Exception
	 * 
	 * @version v1.0.0
	 * @author qiangkz
	 * @date Oct 9, 2012 2:14:15 PM
	 * 
	 * Modification History  Oct 9, 2012 qiangkz Version Description
	 * </PRE>
	 */
	public IBOCmPartnerInfoValue[] querySPartnerInfo(String partnerTypeDtl, String partnerType, String statusType, String siIntroNum, int start, int end) throws Exception;

	/**
	 * <PRE>
	 * @Function  ICmPartnerBusiSV.java
	 * @Description  单表查询SI信息
	 * 
	 * 涉及表：
	 * CM_PARTNER_INFO 合作伙伴
	 * 
	 * @param partnerTypeDtl 类型明细
	 * @param partnerType 伙伴类型
	 * @param siIntroNum SI/EC基本接入号
	 * @param start 开始记录数
	 * @param end 结束记录数
	 * @return IBOCmPartnerInfoValue[]
	 * @see com.asiainfo.crm.cm.cp.ivalues.IBOCmPartnerInfoValue
	 * @throws Exception
	 * 
	 * @version  v1.0.0
	 * @author  qiangkz
	 * @date  Oct 9, 2012 2:14:15 PM
	 * 
	 * Modification History  Oct 9, 2012 qiangkz Version Description
	 * </PRE>
	 */
	public IBOCmPartnerInfoValue[] querySPartnerInfo(String partnerTypeDtl, String partnerType, String siIntroNum, int start, int end) throws Exception;

	/**
	 * <PRE>   
	 * 3.4.2.15 查询集团付费计划信息,统一接口组调用
	 * 接口编码:OI_GetGroupPayPlan
	 * 
	 * 集团付费计划信息
	 * 
	 * 涉及表：
	 * CM_GROUP_CUSTOMER 集团客户表
	 * CM_PARTY_CONTACT 参与人联系表
	 * cm_account_xxx 账户表（按地市分表）
	 * cm_acct_payment_xxx 账户支付表（按地市分表）
	 * cm_acct_bill_cycle_xxx 账户账期表（按地市分表）
	 * CMX_ACCT_PAYMENT_ATTR 账户支付扩展表,只查询了BankBehalfPhone(银行账号代表号码)
	 * 
	 * @Function getGroupPayPlan
	 * @Description 
	 * 
	 * @param custServiceId	集团编码
	 * @return Map {
	 * 		Count	记录总数
	 * 		PayPlanInfo 集团付费计划信息 {
	 * 			PAYMENT_ID	支付方案标识	1		主键
	 * 			ACCT_ID	账户编号	1		账户唯一标识
	 * 			PAY_METHOD	付费方式	?		记录付款方式，包括现金方式、银行转账方式、信用卡方式等。
	 * 			BANK_CONTRACT	银行协议号	?		银行协议号
	 * 			PAYMENT_BANK_CODE	支付银行编码	?		该支付方案的帐户提供标识，当为现金时不填，为托收时，填对应的银行标识，为信用卡时，填对应的卡银行标识，等等
	 * 			PAYMENT_ACCOUNT	支付帐户	?		该支付方式下对应的帐号，现金方式不用填写，托收方式填写银行帐号，信用卡方式填写信用卡号
	 * 			PAYMENT_ACCOUNT_NAME	支付帐户名称	?		当支付方式为银行转账方式和信用卡方式的时候，记录银行帐户名称。
	 * 			PAYMENT_ACCOUNT_TYPE	支付帐户类型	?
	 * 			PAYMENT_ACCOUNT_EXPIRE_DATE	支付账户失效日期	?		支付账户失效日期
	 * 			PRIORITY	优先级	?		当前帐户所定制的各付款方式的优先级
	 * 		}
	 * }
	 * @throws Exception 
	 * @version v1.0.0
	 * @author zouty
	 * @date 2012-10-8 下午12:28:14
	 * <strong>Modification History:</strong><br>
	 * Date         Author          Version            Description<br>
	 * ---------------------------------------------------------<br>
	 * 2012-10-6     zouty           v1.0.0               修改原因<br>
	 * </PRE>
	 */
	public Map getGroupPayPlan4BBoss(String custServiceId) throws Exception;

	/** 
	 * <PRE>  
	 * 3.4.2.39 统计客户经理操作的集团,给统一接口组用,ESOP需要该接口
	 * 接口编码：OI_StatisticManagerGroups
	 * 
	 * 根据客户经理编码查询前一天新建集团客户数、删除集团客户数、新建集团成员数、删除集团成员数
	 * 接口提供给ESOP
	 * 
	 * 涉及表：
	 * CM_GROUP_CUSTOMER 集团客户表
	 * CM_PARTY_CONTACT 参与人联系表
	 * cm_group_member 集团成员表
	 * CM_GROUP_MEMBER_H_xxxx 集团成员历史表（按年份分表）
	 * 
	 * @Function getGrpCountInfoByMgrId
	 * @Description 
	 * 
	 * @param managerId				客户经理ID
	 * @return Map {
	 * 		ADD_COUNT			新建集团客户数
	 * 		DEL_COUNT			删除集团客户数
	 * 		ADD_MEMBER_COUNT		新建集团成员数
	 * 		DEL_MEMBER_COUNT		删除集团成员数
	 * }
	 * @throws Exception 
	 * @version v1.0.0
	 * @author zouty
	 * @date 2012-10-8 下午12:28:14
	 * <strong>Modification History:</strong><br>
	 * Date         Author          Version            Description<br>
	 * ---------------------------------------------------------<br>
	 * 2012-10-6     zouty           v1.0.0               修改原因<br>
	 * </PRE>
	 */
	public Map getGrpCountInfoByMgrId(long managerId) throws Exception;

	/**
	 * <PRE>
	 * 3.8.2.44 导出客户上下级关系，统一接口调用，提供给ESOP
	 * 接口编码：OI_ExportGroupCustomer
	 *    
	 * 根据集团编号导出集团树形数据信息至服务器并下载
	 * 
	 * 涉及表:
	 * cm_group_customer 集团客户表
	 * CM_ATTACH 客户管理附件表
	 *
	 * @Function outPutGrpCustList
	 * @Description 
	 * 
	 * @param	grpCustId 集团编号
	 * @param	opId 操作员编号
	 * @param	orgId 组织编号
	 * @return 
	 * @throws Exception 
	 * @version v1.0.0
	 * @author kangzk
	 * @date 2012-9-11 下午12:28:14
	 * 
	 * <strong>Modification History:</strong><br>
	 * Date         Author          Version            Description<br>
	 * ---------------------------------------------------------<br>
	 * 2012-9-11     kangzk           v1.0.0               修改原因<br>
	 * </PRE>
	 */
	public void outPutGrpCustList(long grpCustId, long opId, long orgId) throws Exception;

	/**
	 * <PRE>   
	 * @Function queryGroupCustomerByGroupId
	 * @Description 根据集团编号查询集团信息
	 *
	 * 涉及表:
	 * CM_GROUP_CUSTOMER 集团客户表
	 * CM_PARTY_CONTACT 参与人联系表
	 * 
	 * @param groupId
	 * @return ICustomerValue
	 * @see com.asiainfo.crm.cm.model.ivalues.ICustomerValue
	 * @throws Exception
	 *
	 * @version v1.0.0
	 * @author shitian
	 * @date Oct 11, 2012 9:55:08 AM
	 * 
	 * <strong>Modification History:</strong><br>
	 * Date         Author          Version            Description<br>
	 * ---------------------------------------------------------<br>
	 * Oct 11, 2012     shitian           v1.0.0               修改原因<br>
	 * </PRE>
	 */
	public ICustomerValue queryGroupCustomerByGroupId(long groupId) throws Exception;

	/**
	 * <PRE>   
	 * @Function signBank
	 * @Description 银行签约(和默认付费账户)
	 *
	 * 涉及表:
	 * ins_accrel_xxx 用户账户付费关系表（按地市分表）
	 * cm_account_xxx 账户表（按地市分表）
	 * CMX_ACCT_BANK_REL 账户与银行关联关系表 （浦发银行签约的类型为2330001003；手机支付的类型为2330001004）
	 * ins_user_xxx 用户表（按地市分表）
	 * CM_ACCT_PAYMENT_xxx 账户支付表（按地市分表）
	 * 
	 * @param tradeSeq 签约流水
	 * @param billId 手机号码
	 * @param bankCode 银行编码
	 * @param actionDate 操作请求日期（日期格式：YYYYMMDD）
	 * @return 
	 * @throws Exception
	 *
	 * @version v1.0.0
	 * @author shitian
	 * @date Oct 5, 2012 3:50:03 PM
	 * 
	 * <strong>Modification History:</strong><br>
	 * Date         Author          Version            Description<br>
	 * ---------------------------------------------------------<br>
	 * Oct 5, 2012     shitian           v1.0.0               修改原因<br>
	 * </PRE>
	 */
	public String signBank(String tradeSeq, String billId, String bankCode, String actionDate) throws Exception;

	/**
	 * <PRE>   
	 * @Function fireBank
	 * @Description 解约
	 *
	 * 涉及表:
	 * CMX_ACCT_BANK_REL 账户与银行关联关系表 （浦发银行签约的类型为2330001003；手机支付的类型为2330001004）
	 * CM_ACCT_PAYMENT_xxx 账户支付表（按地市分表）
	 * 
	 * @param billId 手机号码
	 * @param acctId 默认付费账户
	 * @return
	 * @throws Exception
	 *
	 * @version v1.0.0
	 * @author shitian
	 * @date Oct 5, 2012 4:32:37 PM
	 * 
	 * <strong>Modification History:</strong><br>
	 * Date         Author          Version            Description<br>
	 * ---------------------------------------------------------<br>
	 * Oct 5, 2012     shitian           v1.0.0               修改原因<br>
	 * </PRE>
	 */
	public String fireBank(String billId, long acctId) throws Exception;

	/**
	 * <PRE>   
	 * @Function queryAcctAndPaymentById
	 * @Description 根据账户编号查询账户和支付方案信息
	 * 
	 * 涉及表:
	 * cm_account_xxx 账户表（按地市分表）
	 * cm_acct_payment_xxx 账户支付表（按地市分表）
	 * CM_CREDIT_MAPPING 信用等级映射表
	 *
	 * @param acctId 账户编号
	 * @return IQBOCmAcctPayMentValue
	 * @see com.asiainfo.crm.cm.inner.account.ivalues.IQBOCmAcctPayMentValue
	 * @throws Exception
	 *
	 * @version v1.0.0
	 * @author shitian
	 * @date Oct 11, 2012 2:04:35 PM
	 * 
	 * <strong>Modification History:</strong><br>
	 * Date         Author          Version            Description<br>
	 * ---------------------------------------------------------<br>
	 * Oct 11, 2012     shitian           v1.0.0               修改原因<br>
	 * </PRE>
	 */
	public IQBOCmAcctPayMentValue queryAcctAndPaymentById(long acctId) throws Exception;

	/**
	 * <PRE>   
	 * @Function queryContactByContId
	 * @Description 根据联系人编号查询联系人信息
	 * 
	 * 涉及表:
	 * CM_PARTY_CONTACT 集团关键人、联系人、家属表
	 *
	 * @param contId 联系人编号
	 * @return IContactValue
	 * @see com.asiainfo.crm.cm.model.ivalues.IContactValue
	 * @throws Exception
	 *
	 * @version v1.0.0
	 * @author shitian
	 * @date Oct 11, 2012 2:24:28 PM
	 * 
	 * <strong>Modification History:</strong><br>
	 * Date         Author          Version            Description<br>
	 * ---------------------------------------------------------<br>
	 * Oct 11, 2012     shitian           v1.0.0               修改原因<br>
	 * </PRE>
	 */
	public IContactValue queryContactByContId(long contId) throws Exception;

	/**
	 * <PRE>
	 * 根据客户编号查询客户联系人信息列表。<br>
	 * <em>该方法实现了按照联系人的优先级进行排序.</em>
	 * @Function queryContactsByCustId
	 * @Description 根据客户编号查询客户联系人信息列表。
	 * 
	 * 涉及表：
	 * CM_PARTY 参与人
	 * CM_INDIV_PARTY 个人参与人
	 * CM_PARTY_CONTACT 参与人联系表
	 * CM_GROUP_CONTACT 集团联系人
	 *
	 * @param custId 客户编号
	 * @return IContactValue[]
	 * @see com.asiainfo.crm.cm.model.ivalues.IContactValue
	 * @throws Exception
	 *
	 * @version v1.0.0
	 * @author huzq2
	 * @date 2011-12-28 下午3:54:40
	 * 
	 * <strong>Modification History:</strong><br>
	 * Date         Author          Version            Description<br>
	 * ---------------------------------------------------------<br>
	 * 2011-12-28     huzq2           v1.0.0               修改原因
	 * </PRE>
	 */
	public IContactValue[] queryCustContactsByCustId(long custId) throws Exception;

	/**
	 * <PRE>   
	 * 1032浦发银行代缴话费需求—签约/解约，统一接口组调用该接口
	 * 接口编码：1032
	 * 
	 * 涉及表:
	 * ins_accrel_xxx 用户账户付费关系表（按地市分表）
	 * cm_account_xxx 账户表（按地市分表）
	 * CMX_ACCT_BANK_REL 账户与银行关联关系表 （浦发银行签约的类型为2330001003；手机支付的类型为2330001004）
	 * ins_user_xxx 用户表（按地市分表）
	 * CM_ACCT_PAYMENT_xxx 账户支付表（按地市分表）
	 * 
	 * @Function singOrFireBank
	 * @Description 浦发签约解约
	 *
	 * @param paraMap {
	 * 	seq	交易流水号	String
	 * 	idValue	被缴费手机号码	String
	 * 	bankName	银行名称	String
	 * 	actionDate	操作请求日期	String	YYYYMMDD
	 * 	flag	签约解约标志	String	“QY”--签约 “JY”--解约
	 * }
	 * @return Map {
	 * 	result	返回码	String	消息返回码
	 * 	resultDesc	信息描述	String	消息内容
	 * }
	 * @throws Exception
	 *
	 * @version v1.0.0
	 * @author shitian
	 * @date Oct 12, 2012 10:42:39 AM
	 * 
	 * <strong>Modification History:</strong><br>
	 * Date         Author          Version            Description<br>
	 * ---------------------------------------------------------<br>
	 * Oct 12, 2012     shitian           v1.0.0               修改原因<br>
	 * </PRE>
	 */
	public Map singOrFireBank(Map paraMap) throws Exception;

	/**
	 * <PRE>   
	 * 手机支付—签约/解约，统一接口组调用该接口
	 * 接口编码：1032
	 * 
	 * @Function singOrFireMobile
	 * @Description 手机支付
	 * 
	 * 涉及表：
	 * ins_accrel_xxx 用户账户付费关系表（按地市分表）
	 * cm_account_xxx 账户表（按地市分表）
	 * CMX_ACCT_BANK_REL 账户与银行关联关系表 （浦发银行签约的类型为2330001003；手机支付的类型为2330001004）
	 * ins_user_xxx 用户表（按地市分表）
	 * CM_ACCT_PAYMENT_xxx 账户支付表（按地市分表）
	 *
	 * @param paraMap {
	 * 	idValue	被缴费手机号码	String
	 * 	flag	签约解约标志	String	“QY”--签约 “JY”--解约
	 * }
	 * @return Map {
	 * 	result	返回码	String	消息返回码
	 * 	resultDesc	信息描述	String	消息内容
	 * }
	 * @throws Exception
	 *
	 * @version v1.0.0
	 * @author xiezl
	 * @date Oct 12, 2012 10:42:39 AM
	 * 
	 * <strong>Modification History:</strong><br>
	 * Date         Author          Version            Description<br>
	 * ---------------------------------------------------------<br>
	 * Oct 12, 2012     xiezl           v1.0.0               修改原因<br>
	 * </PRE>
	 */
	public Map singOrFireMobile(Map paraMap) throws Exception;

	/**
	 * <PRE>   
	 * 手机支付查询接口
	 * 
	 * 涉及表：
	 * ins_user_xxx 用户表（按地市分表）
	 * ins_accrel_xxx 用户账户付费关系表（按地市分表）
	 * CMX_ACCT_BANK_REL 账户与银行关联关系表 （浦发银行签约的类型为2330001003；手机支付的类型为2330001004）
	 * 
	 * @Function isMobilePayUser
	 * @Description 手机支付查询接口
	 *
	 * @param paraMap {
	 * 	idValue 手机号码
	 * }
	 * @return Map {
	 * 	signStatus 是否手机支付用户 0：已与手机支付签约；1：未签约；2：已经与其他缴费渠道办理了签约；9：手机号码不存在
	 * }
	 * @throws Exception
	 *
	 * @version v1.0.0
	 * @author xiezl
	 * @date Oct 12, 2012 10:42:39 AM
	 * 
	 * <strong>Modification History:</strong><br>
	 * Date         Author          Version            Description<br>
	 * ---------------------------------------------------------<br>
	 * Oct 12, 2012     xiezl           v1.0.0               修改原因<br>
	 * </PRE>
	 */
	public Map isMobilePayUser(Map paraMap) throws Exception;

	/**
	 * <PRE>
	 * 2001客户资料查询接口，统一接口组调用；提供CBOSS查询客户信息
	 * 接口编码：2001
	 * 
	 * 涉及表：
	 * ins_user_xxx 用户表（按地市分表）
	 * cm_indiv_customer 个人客户表
	 * cm_account_xxx 账户表（按地市分表）
	 * cm_club_member 大客户表
	 * 
	 * @param parameter {
	 * 	idType	用户标识类型	String		用户标识类型编码
	 * 	idValue	用户标识号码	String		根据此号码定位一个用户
	 * 	Password	客服密码	String	Y	客服密码
	 * 	idCardType	用户证件类型	String	Y	用户证件类型
	 * 	idCardNum	用户证件号码	String		用户证件号码
	 * 	infoTypes	资料类型代码集合	List<String>		查询的资料类型，至少1个，可以有多个
	 * 	dateFrom	起始日期	Date	Y	起始时间约束（>=）
	 * 	dateTo	终止日期	Date		终止时间约束（<=）
	 * 	otherInfo	扩展信息	Map<String,String>	Y	备用
	 * }
	 * @return Map {
	 * 	Result	二级返回码	String		参见返回值定义
	 * 	resultDesc	失败原因描述	String	Y	成功时不填，失败时填写原始失败原因（如：异常信息）
	 * 	Puk	PUK码	String		PUK码
	 * 	pointBalance	可兑换积分(或M值)	int		可兑换积分(或M值)
	 * 	Credit	信誉额度	String		信誉额度
	 * 	Balance	客户余额	int	Y	单位厘
	 * 	debtBalance	欠费金额	int	Y	单位厘
	 * 	Level	客户级别	int
	 * 	userMgr	经理姓名	String	Y	VIP客户（含集团客户）填写
	 * 	userMgrNum	经理电话	String	Y	VIP客户（含集团客户）填写
	 * 	servOpr	基本服务开放情况	String		描述已开通的基本服务
	 * 	basicOpr	基本业务开放情况	String
	 * 	increOpr	增值业务开放情况	String
	 * 	Status	客户状态	String
	 * 	username	客户姓名	String
	 * 	userAdd	联系地址	String
	 * 	userNum	联系电话	String
	 * 	idCardType	证件类型	String
	 * 	idCardNum	证件号码	String
	 * 	brand	用户品牌	String
	 * 	oprTime	入网时间	Date
	 * 	homeProv	归属地	String		归属省+地市名称
	 * 	infoCont	资料内容	List<CustInfoCont >		每种资料类型一组数据（如账单，受理）{
	 * 		infoTypeId	资料类型 	String		参见资料类型编码
	 * 		infoItems	资料条目	List<CustInfoItem>		每个资料条目一组数据 {
	 * 			itemId	条目代码	String
	 * 			itemCont	内容值	String
	 * 			childItems	二级条目	Map<String,String>	Y	key:二级条目编码，value:内容值
	 *		} 
	 * 	}
	 * 	otherInfo	扩展信息	Map<String,String>		备用
	 * }
	 * @throws Exception
	 * </PRE>
	 */
	public Map queryDiffAreaCustInfo(Map parameter) throws Exception;

	/**
	 * <PRE>
	 * 根据手机号码查询VIP客户信息
	 * 
	 * @param billId	服务号码
	 * @return IClubMemberValue
	 * @see com.asiainfo.crm.cm.model.ivalues.IClubMemberValue 
	 * 返回的结果 判断为NULL 时不是VIP客户,如果有数据,但是member_level为0时，也不是VIP客户
	 * VIP级别 MEMBER_LEVEL：
	 *  1  钻石卡            
	 *  2  金卡
	 *  3  银卡
	 *  4  大客户
	 *  5  个人贵宾卡
	 *  6  集团贵宾卡
	 * 
	 * @throws Exception
	 * </PRE>
	 */
	public IClubMemberValue qryVipInfo(String billId) throws Exception;

	/**
	 * <PRE>   
	 * 根据客户用户编号查询地市是否需要跨中心,统一接口组调用
	 * 
	 * 涉及表：
	 * CM_INS_CMREL 客户用户关系表
	 * 
	 * @Function outPutGrpCustList
	 * @Description 
	 * 
	 * @param	custid 客户编号
	 * @param	userId 用户编号
	 * @return {	 
	 *       retCode  0  存在客户账户信息   1 不存在客户账户信息
	 *       retMsg 描述
	 *       left   是否需要跨中心  true  同一个中心   false 需要跨中心
	 *       regionId  不需要跨中心的时候 取中心值
	 * }
	 * @throws Exception 
	 * @version v1.0.0
	 * @author kangzk
	 * @date 2012-9-11 下午12:28:14
	 * 
	 * <strong>Modification History:</strong><br>
	 * Date         Author          Version            Description<br>
	 * ---------------------------------------------------------<br>
	 * 2012-9-11     kangzk           v1.0.0               修改原因<br>
	 * </PRE>
	 */
	public Map queryCmAcctRegion(long custid, long userId) throws Exception;

	/**
	 * <PRE>   
	 * @Function queryAcctDtsById
	 * @Description 根据账户编号查询账户详细信息
	 * 
	 * 涉及表：
	 * cm_cust_acct_rel 客户账户关系表
	 * cm_account_xxx 账户表（按地市分表）
	 * cm_acct_payment_xxx 账户支付表（按地市分表）
	 * cm_acct_bill_cycle_xxx 账户账期表（按地市分表）
	 *
	 * @param acctId 账户编号
	 * @return IAccountProfileValue
	 * @see com.asiainfo.crm.cm.model.ivalues.IAccountProfileValue
	 * @throws Exception
	 *
	 * @version v1.0.0
	 * @author shitian
	 * @date Oct 17, 2012 4:39:19 PM
	 * 
	 * <strong>Modification History:</strong><br>
	 * Date         Author          Version            Description<br>
	 * ---------------------------------------------------------<br>
	 * Oct 17, 2012     shitian           v1.0.0               修改原因<br>
	 * </PRE>
	 */
	public IAccountProfileValue queryAcctDtsById(long acctId) throws Exception;

	/**
	 * <PRE>   
	 * 集团下发集团客户信息新增
	 * 
	 * 涉及表：
	 * cm_group_customer 集团客户表
	 * CMX_GROUP_CUSTOMER 集团客户扩展表
	 * cm_group_contact 集团关键人、联系人、家属表
	 * cm_party 参与人表
	 * 
	 * 
	 * @Function addGrpCustomer4BBoss
	 * @Description 
	 * 
	 * @param	parameter {
	 * 	
	 * }
	 * @return 	Map {
	 * 
	 * }
	 * @throws Exception 
	 * @version v1.0.0
	 * @author zouty
	 * @date 2012-10-15 下午12:28:14
	 * 
	 * <strong>Modification History:</strong><br>
	 * Date         Author          Version            Description<br>
	 * ---------------------------------------------------------<br>
	 * 2012-10-15     zouty           v1.0.0               修改原因<br>
	 * </PRE>
	 */
	public Map addGrpCustomer4BBoss(Map parameter) throws Exception;

	/**
	 * <PRE> 
	 * 根据用户编号(userId)删除大客户信息
	 *   
	 * @Function delVipInfo
	 * @Description 删除VIP信息
	 *
	 * @param userId 用户编号
	 * @throws Exception
	 *
	 * @version v1.0.0
	 * @author shitian
	 * @date Oct 20, 2012 4:48:42 PM
	 * 
	 * <strong>Modification History:</strong><br>
	 * Date         Author          Version            Description<br>
	 * ---------------------------------------------------------<br>
	 * Oct 20, 2012     shitian           v1.0.0               修改原因<br>
	 * </PRE>
	 */
	public void delVipInfo(long userId) throws Exception;

	/**
	 * <PRE> 
	 * 3.1.1.8	集团网厅登陆接口,统一接口组调用
	 * 接口编码：OI_GroupLoginOfPhoneId
	 *
	 * 涉及表:
	 * ins_user_xxx 用户表（按地市分表）
	 * cm_indiv_customer 个人客户表
	 * cm_group_contact 集团关键人、联系人、家属表
	 * cm_group_customer 集团客户表
	 * 
	 * @Function queryGroupByKeyBillId
	 * @Description 根据关键人手机号码查询集团客户信息
	 *
	 * @param billId 手机号码
	 * @param password 服务密码
	 * @param LoginFlag   当标记为1是,不需要密码直接取客户信息
	 * @return Map {
	 * 	msg	错误信息
	 * 	GroupCustInfo	客户信息 {
	 * 		group_id 集团编号
	 * 		group_name 集团名称
	 * 		group_city 集团城市编码
	 * 		group_county 集团县区编码
	 * 		group_area 集团片区编码
	 * 		group_level 集团级别
	 * 		group_linker 集团联系人
	 * 		group_linkPhone 集团联系人号码
	 * 		group_address 集团联系地址
	 * 		group_status 集团当前状态值
	 * 		group_type 集团类型
	 * 		vpmn_id 集团下V网ID
	 * 		group_custId 集团客户ID
	 * 	}
	 * }
	 * @throws Exception
	 *
	 * @version v1.0.0
	 * @author shitian
	 * @date Oct 22, 2012 9:28:56 AM
	 * 
	 * <strong>Modification History:</strong><br>
	 * Date         Author          Version            Description<br>
	 * ---------------------------------------------------------<br>
	 * Oct 22, 2012     shitian           v1.0.0               修改原因<br>
	 * </PRE>
	 */
	public Map queryGroupByKeyBillId(String billId, String password, int LoginFlag) throws Exception;

	/**
	 * <PRE>   
	 * @Function queryGroupCustByKeyBillId
	 * @Description 根据集团主要联系人手机号码查询集团客户信息
	 *
	 * 涉及表：
	 * ins_user_xxx 用户表（按地市分表）
	 * cm_indiv_customer 个人客户表
	 * cm_group_contact 集团关键人、联系人、家属表
	 * cm_group_customer 集团客户表
	 * 
	 * @param billId 手机号码
	 * @return ICustomerValue
	 * @see com.asiainfo.crm.cm.model.ivalues.ICustomerValue
	 * @throws Exception
	 *
	 * @version v1.0.0
	 * @author shitian
	 * @date Oct 23, 2012 9:26:56 AM
	 * 
	 * <strong>Modification History:</strong><br>
	 * Date         Author          Version            Description<br>
	 * ---------------------------------------------------------<br>
	 * Oct 23, 2012     shitian           v1.0.0               修改原因<br>
	 * </PRE>
	 */
	public ICustomerValue queryGroupCustByKeyBillId(String billId) throws Exception;

	/**
	 * <PRE>
	 * (集团网厅)3.1.1.4 经理人信息,统一接口组调用
	 * 接口编码：
	 * <B>接口已经作废</B>
	 * 
	 * 涉及表：
	 * 调用系统管理的接口，只查询了集团客户经理的数据，不能查询电话经理   
	 *    
	 * @Function queryManagerById
	 * @Description 根据客户经理编号查询客户经理
	 * @deprecated 
	 * @param managerId 必填
	 * @return
	 * @throws Exception
	 *
	 * @version v1.0.0
	 * @author shitian
	 * @date Oct 23, 2012 10:28:01 AM
	 * 
	 * <strong>Modification History:</strong><br>
	 * Date         Author          Version            Description<br>
	 * ---------------------------------------------------------<br>
	 * Oct 23, 2012     shitian           v1.0.0               修改原因<br>
	 * </PRE>
	 */
	public Map queryManagerById(long managerId) throws Exception;

	/**
	 * <PRE>   
	 * @Function queryAcctDtsByCustId
	 * @Description 根据客户编号地市查询账户信息
	 * 
	 * 涉及表：
	 * cm_cust_acct_rel 客户账户关系表
	 * cm_account_xxx 账户表（按地市分表）
	 * cm_acct_payment_xxx 账户支付表（按地市分表）
	 * cm_acct_bill_cycle_xxx 账户帐期表（按地市分表）
	 * 
	 * @param custId 客户编号
	 * @param regionId 地市ID
	 * @param start 开始记录数
	 * @param end 结束记录数
	 * @return IAccountProfileValue[]
	 * @see com.asiainfo.crm.cm.model.ivalues.IAccountProfileValue
	 * @throws Exception
	 *
	 * @version v1.0.0
	 * @author shitian
	 * @date Oct 23, 2012 2:47:48 PM
	 * 
	 * <strong>Modification History:</strong><br>
	 * Date         Author          Version            Description<br>
	 * ---------------------------------------------------------<br>
	 * Oct 23, 2012     shitian           v1.0.0               修改原因<br>
	 * </PRE>
	 */
	public IAccountProfileValue[] queryAcctDtsByCustId(long custId, String regionId, int start, int end) throws Exception;

	/**
	 * <PRE>   
	 * @Function queryAcctDtsCountByCustId
	 * @Description 根据客户编号地市查询账户信息数量
	 *
	 * 涉及表：
	 * cm_cust_acct_rel 客户账户关系表
	 * cm_account_xxx 账户表（按地市分表）
	 * cm_acct_payment_xxx 账户支付表（按地市分表）
	 * cm_acct_bill_cycle_xxx 账户帐期表（按地市分表）
	 * 
	 * @param custId 客户编号
	 * @param regionId 地市ID
	 * @return 查询的记录总数
	 * @throws Exception
	 *
	 * @version v1.0.0
	 * @author shitian
	 * @date Oct 23, 2012 2:48:03 PM
	 * 
	 * <strong>Modification History:</strong><br>
	 * Date         Author          Version            Description<br>
	 * ---------------------------------------------------------<br>
	 * Oct 23, 2012     shitian           v1.0.0               修改原因<br>
	 * </PRE>
	 */
	public int queryAcctDtsCountByCustId(long custId, String regionId) throws Exception;

	/**
	 * <PRE>   
	 * @Function updateAcctBehalfPhone
	 * @Description 修改账户代表号码
	 *
	 * 涉及表:
	 * cm_account_xxx 账户表（按地市分表）
	 * CMX_ACCT_PAYMENT_ATTR 账户支付扩展表,修改ATTR_CODE='BankBehalfPhone'的数据
	 * 
	 * @param acctId 账户编号
	 * @param acctBehalfPhone 传空则为清空，传具体的值则修改
	 * @throws Exception
	 *
	 * @version v1.0.0
	 * @author shitian
	 * @date Oct 23, 2012 4:19:27 PM
	 * 
	 * <strong>Modification History:</strong><br>
	 * Date         Author          Version            Description<br>
	 * ---------------------------------------------------------<br>
	 * Oct 23, 2012     shitian           v1.0.0               修改原因<br>
	 * </PRE>
	 */
	public void updateAcctBehalfPhone(long acctId, String acctBehalfPhone) throws Exception;

	/**
	 * <PRE>   
	 * @Function queryAcctAndPayments
	 * @Description 查询账户和支付方案信息
	 *
	 * 涉及表:
	 * cm_account_xxx 账户表（按地市分表）
	 * cm_acct_payment_xxx 账户支付表（按地市分表）
	 * cmx_acct_payment_attr 账户支付扩展表，只查询BankBehalfPhone的数据
	 * 
	 * @param bankAccount 支付帐户
	 * @param regionId 地市ID
	 * @param payMethod 支付方式
	 * @param start 开始记录数
	 * @param end 结束记录数
	 * @return IAccountProfileValue[]
	 * @see com.asiainfo.crm.cm.model.ivalues.IAccountProfileValue
	 * @throws Exception
	 *
	 * @version v1.0.0
	 * @author shitian
	 * @date Oct 9, 2012 4:06:24 PM
	 * 
	 * <strong>Modification History:</strong><br>
	 * Date         Author          Version            Description<br>
	 * ---------------------------------------------------------<br>
	 * Oct 9, 2012     shitian           v1.0.0               修改原因<br>
	 * </PRE>
	 */
	public IAccountProfileValue[] queryAcctAndPayments(String bankAccount, String regionId, long payMethod, int start, int end) throws Exception;

	/**
	 * <PRE>   
	 * @Function queryAcctAndPaymentsCount
	 * @Description 查询账户和支付方案信息数量
	 *
	 * 涉及表:
	 * cm_account_xxx 账户表（按地市分表）
	 * cm_acct_payment_xxx 账户支付表（按地市分表）
	 * cmx_acct_payment_attr 账户支付扩展表，只查询BankBehalfPhone的数据
	 * 
	 * @param bankAccount 支付账户
	 * @param regionId 地市ID
	 * @param payMethod 支付方式
	 * @return 符合条件的记录数
	 * @throws Exception
	 *
	 * @version v1.0.0
	 * @author shitian
	 * @date Oct 24, 2012 8:36:43 PM
	 * 
	 * <strong>Modification History:</strong><br>
	 * Date         Author          Version            Description<br>
	 * ---------------------------------------------------------<br>
	 * Oct 24, 2012     shitian           v1.0.0               修改原因<br>
	 * </PRE>
	 */
	public int queryAcctAndPaymentsCount(String bankAccount, String regionId, long payMethod) throws Exception;

	/**
	 * <PRE>
	 * 3.1.2.10 修改客户信息,统一接口组调用
	 * 接口编码:OI_UpdateCustomerInfo
	 * 
	 * 涉及表:
	 * cm_group_customer 集团客户表
	 * ins_user_xxx 用户表（按地市分表）
	 * cm_indiv_customer 个人客户表
	 * CM_PARTY 参与人表
	 * CM_INDIV_PARTY 个人参与人
	 * CM_PARTY_CONTACT 参与人联系表
	 * CM_INDIV_CONTACT 个人联系表
	 * CM_GROUP_CONTACT 集团联系表
	 * 
	 * @Function updateCustInfo
	 * @Description 修改客户资料（OI_UpdateCustomerInfo）
	 *
	 * @param paraMap {
	 * 		ServiceNum	服务号码	？	两者任取一个
	 * 		GroupId	集团编号	？
	 * 		CustInfo	客户信息	1		参见附录4.1.2客户信息 参数名称标注为红色部分不可修改
	 * 		CustExtInfo	客户扩展信息	?		扩展属性自定义
	 * }
	 * @throws Exception
	 *
	 * @version v1.0.0
	 * @author shitian
	 * @date Oct 25, 2012 10:04:20 AM
	 * 
	 * <strong>Modification History:</strong><br>
	 * Date         Author          Version            Description<br>
	 * ---------------------------------------------------------<br>
	 * Oct 25, 2012     shitian           v1.0.0               修改原因<br>
	 * </PRE>
	 */
	public void updateCustInfo(Map paraMap) throws Exception;

	/**
	 * <PRE>
	 * (集团网厅)3.6.3.2 修改集团客户资料接口  ,统一接口组调用
	 * 接口编码:OI_UpGroupCustomerDetailTemp
	 * 
	 * @Function upGrpCustomerDetailTemp
	 * @Description 3.6.3.2	修改集团客户资料接口
	 *
	 * 涉及表：
	 * cm_group_customer 集团客户表
	 * cm_group_manager 集团客户经理表
	 * CM_GROUP_CUSTOMER_AUDIT 集团客户信息审核表
	 * 
	 * @param parameter {
	 * 		CustId	集团客户编码
	 * 		GroupPostCode	集团邮编
	 * 		GroupAddress	集团地址
	 * 		PhoneNum	联系电话
	 * }
	 * @return Map {
	 * 		SequenceNo	待审核的序列号
	 * }
	 * @throws Exception
	 *
	 * @version v1.0.0
	 * @author 
	 * @date Mar 15, 2012 11:33:24 AM
	 * 
	 * <strong>Modification History:</strong><br>
	 * Date         Author          Version            Description<br>
	 * ---------------------------------------------------------<br>
	 * Mar 15, 2012     kangzk           v1.0.0               修改原因<br>
	 * </PRE>
	 */
	public Map upGrpCustomerDetailTemp(Map parameter) throws Exception;

	/**
	 * <PRE>
	 * (集团网厅)3.6.4.1 修改集团密码接口 ,统一接口组调用
	 * 接口编码:OI_ChangePwd
	 * 
	 * 涉及表:
	 * ins_user_xxx 用户表（按地市分表）
	 * cm_indiv_customer 个人客户表
	 * 需要调用营业接口修改用户服务密码,注意,需要另起事务来调用,保证营业的接口不抛异常
	 * 
	 * @Function upGrpChangePwd
	 * @Description 3.6.4.1	修改集团密码接口
	 *
	 * @param parameter {
	 * 		OldPassword	旧密码	1		主要联系人旧的服务密码
	 * 		NewPassword	新密码	1		主要联系人新的服务密码
	 * 		ServiceNum	手机号码	1		集团主要联系人手机号码
	 * }
	 * @return Map
	 * @throws Exception
	 *
	 * @version v1.0.0
	 * @author 
	 * @date Mar 15, 2012 11:33:24 AM
	 * 
	 * <strong>Modification History:</strong><br>
	 * Date         Author          Version            Description<br>
	 * ---------------------------------------------------------<br>
	 * Mar 15, 2012     kangzk           v1.0.0               修改原因<br>
	 * </PRE>
	 */
	public Map upGrpChangePwd(Map parameter) throws Exception;

	/**
	 * <PRE>
	 * 3.6.1.2	 集团成员的批量预增加,删除,接口.
	 * 接口编码：OI_AcceptGrpMemTemp
	 * 
	 * 涉及表：
	 * cm_group_manager 集团客户经理表
	 * cm_group_customer_audit 集团客户信息审核表
	 * 
	 * @Function acceptProdMemTemp
	 * @Description3.6.1.2	 集团成员的批量预增加,删除,接口.
	 * @param parameter {
	 * 		SGroupInfoTemp	需要保存的信息	*		参见附录集团成员信息 {
	 * 			GroupId	集团客户编码	1
	 * 			CustId	成员客户标识	1
	 * 			MemberKind	成员类型	1
	 * 			UserId	用户编号	1
	 * 			ServiceNum	成员服务号码	1
	 * 			ShortNum	成员短号	?
	 * 			Department	部门	?
	 * 			Job	职位	?
	 * 			VipFlag	是否大客户	1	0：非大客户 1：大客户
	 * 			CustManagerId	客户经理编号	?
	 * 			MembertName	成员名称	?
	 * 			RegionCode	地市编号	1
	 * 			CountyCode	县市编号	1
	 * 			GroupMode	集团类型	?
	 * 			ClassId	VIP级别标识	?
	 * 			State	成员状态	1
	 * 			CreateDate	成员加入时间	?	YYYYMMDD
	 * 			BrandName	品牌名称	?
	 * 			BrandId	品牌标识	?
	 * 			PlanName	套餐名称	?
	 * 			PlanId	套餐标识	?	
	 * 		}
	 * 		OperCode	操作码	1	0：添加 1：删除	
	 * }
	 * @return Map {
	 * 		SequenceNos	序列号结构列表	*	批量增加,删除 待审核的序列号. 单个就只一个.	序列号结构 {
	 * 			SequenceNo	序列号	1	
	 * 			Result	处理结果	1	0:成功 1:失败
	 * 			Msg	结果信息	?	
	 * 		}
	 * }
	 * @throws Exception
	 *
	 * @version v1.0.0
	 *  return sequenceNos 序列号结构列表
	 * @author 
	 * @date Mar 15, 2012 11:33:24 AM
	 * 
	 * <strong>Modification History:</strong><br>
	 * Date         Author          Version            Description<br>
	 * ---------------------------------------------------------<br>
	 * Mar 15, 2012     kangzk           v1.0.0               修改原因<br>
	 * </PRE>
	 */
	public Map acceptGrpMemTemp(Map parameter) throws Exception;

	/**
	 * <PRE>
	 * (集团网厅)3.6.2.1 产品管理员查询  ,统一接口组调用
	 * 接口编码:OI_QryProdMgntMem
	 * 
	 * 涉及表：
	 * cm_group_member 集团成员表（注意：辽宁用member_status来存放角色类型）
	 * 
	 * @Function acceptProdMemTemp
	 * @Description3.6.2.1	产品管理员查询
	 *   网内成员的一种角色,按产品管理员查询出来.(主要传入roleId=9)查出所有的产品
	 * @param parameter {
	 * 		GroupId	集团编号	1
	 * 		ServiceNum	成员服务号码	?		成员和号码间的关系是或的关系
	 * 		CustName	成员客户姓名	?
	 * 		roleId	角色类型	1	2.主要联系人3.普通成员.9.产品管理员7.帐详单联系人
	 * 		BgnIndex	开始记录数	1		当开始记录数为0时需要返回总记录数。
	 * 		EndIndex	结束记录数	1		
	 * }
	 * @return Map {
	 * 		MemberInfo	成员信息	*		参见附录集团成员信息 {
	 * 			GroupId	集团客户编码	1
	 * 			CustId	成员客户标识	1
	 * 			MemberKind	成员类型	1
	 * 			UserId	用户编号	1
	 * 			ServiceNum	成员服务号码	1
	 * 			ShortNum	成员短号	?
	 * 			Department	部门	?
	 * 			Job	职位	?
	 * 			VipFlag	是否大客户	1	0：非大客户1：大客户
	 * 			CustManagerId	客户经理编号	?
	 * 			MembertName	成员名称	?
	 * 			RegionCode	地市编号	1
	 * 			CountyCode	县市编号	1
	 * 			GroupMode	集团类型	?
	 * 			ClassId	VIP级别标识	?
	 * 			State	成员状态	1
	 * 			CreateDate	成员加入时间	?	YYYYMMDD
	 * 			BrandName	品牌名称	?
	 * 			BrandId	品牌标识	?
	 * 			PlanName	套餐名称	?
	 * 			PlanId	套餐标识	?	
	 * 		}
	 * 		Count	总记录数	?		开始记录数为1时返回
	 * }
	 * @throws Exception
	 *
	 * @version v1.0.0
	 * @author 
	 * @date Mar 15, 2012 11:33:24 AM
	 * 
	 * <strong>Modification History:</strong><br>
	 * Date         Author          Version            Description<br>
	 * ---------------------------------------------------------<br>
	 * Mar 15, 2012     kangzk           v1.0.0               修改原因<br>
	 * </PRE>
	 */
	public Map qryProdMgntMem(Map parameter) throws Exception;

	/**
	 * <PRE> 
	 * 3.1.2.21 VIP用户免费服务使用(易登机),统一接口组调用
	 * 接口编码:OI_VIPUserUseFreeService
	 * 
	 * 涉及表：
	 * ins_user_xxx 用户表（按地市分表）
	 * cm_club_member 会员表
	 * cm_club_service 俱乐部服务定义表
	 * cm_club_service_adjust 俱乐部会员服务临时额度信息表
	 * cm_club_service_cycle 俱乐部服务使用周期
	 * cm_club_service_vdoing 俱乐部服务维度定义表
	 * CM_CLUB_SERVICE_REC 俱乐部会员服务记录
	 * 
	 * @Function vipUserFreeService
	 * @Description 返回享受一次免费服务后剩余次数
	 *
	 * @param paraMap {
	 * 		ServiceNum	服务号码	1
	 * 		ServiceId	VIP免费服务编号	1	1.机场VIP服务2.火车站VIP服务
	 * }
	 * @return Map {
	 * 		FreeTimes	当前免费次数	？
	 * }
	 * @throws Exception
	 *
	 * @version v1.0.0
	 * @author shitian
	 * @date Oct 26, 2012 10:56:49 AM
	 * 
	 * <strong>Modification History:</strong><br>
	 * Date         Author          Version            Description<br>
	 * ---------------------------------------------------------<br>
	 * Oct 26, 2012     shitian           v1.0.0               修改原因<br>
	 * </PRE>
	 */
	public Map vipUserFreeService(Map paraMap) throws Exception;

	/**
	 * <PRE>
	 * 根据集团客户编码与用户编码查询集团家属信息CONT_TYPE=3
	 * 
	 * 涉及表：
	 * CM_PARTY 参与人表
	 * CM_INDIV_PARTY 个人参与人表
	 * CM_PARTY_CONTACT 参与人联系表
	 * CM_GROUP_CONTACT 集团联系人、关键人、家属表
	 * 
	 * @param parameter {
	 * 		客户编码 CustId  
	 * 		用户编码 UserId
	 * }
	 * @return IContactValue
	 * @see com.asiainfo.crm.cm.model.ivalues.IContactValue
	 * @throws Exception
	 * </PRE>
	 */
	public IContactValue qryGroupContact(Map parameter) throws Exception;

	/**
	 * <PRE>
	 * 根据集团客户编码与用户编码查询集团网内成员信息
	 * 
	 * 涉及表:
	 * cm_group_member 集团成员表
	 * 
	 * @param parameter {
	 * 		客户编码 CustId  
	 * 		用户编码 UserId
	 * }
	 * @return IGroupMemberValue
	 * @see com.asiainfo.crm.cm.model.ivalues.IGroupMemberValue
	 * @throws Exception
	 * </PRE>
	 */
	public IGroupMemberValue qryGrpMem(Map parameter) throws Exception;

	/**
	 * <PRE>
	 * 查询集团客户信息包含扩展信息
	 * 
	 * 涉及表:
	 * CM_GROUP_CUSTOMER 集团客户表
	 * CMX_GROUP_CUSTOMER 集团客户扩展表
	 * 
	 * @param parameter {
	 * 		客户编码 CustId
	 * }
	 * @return IBOLnCmGroupInfoValue
	 * @see com.asiainfo.crm.cm.ln.customer.group.ivalues.IBOLnCmGroupInfoValue
	 * @throws Exception
	 * </PRE>
	 */
	public IBOLnCmGroupInfoValue qryGroupInfo(Map parameter) throws Exception;

	/**
	 * <PRE>
	 * 3.4.2.36 查询集团客户信息（根据成员信息）
	 * 接口编码：OI_GetGroupCustomerByMember
	 * 
	 * 涉及表：
	 * 根据手机号码查询用户加入了哪些集团的集团业务
	 * CM_GROUP_CUSTOMER 集团客户表
	 * CMX_GROUP_CUSTOMER 集团客户扩展表
	 * cm_group_contact 集团联系人、关键人、家属表
	 * cm_group_manager 集团客户经理表
	 * sec.sec_staff 员工表
	 * sec.sec_organize 组织表
	 * sec.sec_operator 操作工号表
	 * sec.sec_oper_domain_rela 工号扩展归属系统表
	 * 
	 * 根据成员手机号码查询集团客户信息 提供给客服
	 * @param billId 手机号码
	 * @returns Map {
	 * 		GroupBaseInfos {
	 * 			集团客户和集团客户扩展信息对象转换为Map
	 * 			MainContactName 主联系人姓名
	 * 			MainContactPhone 主联系人电话
	 * 			ManagerId 客户经理ID
	 * 			ManagerName 客户经理姓名
	 * 			ManagerPhone 客户经理电话
	 * 		}
	 * }
	 * @throws Exception
	 * </PRE>
	 */
	public Map qryGroupInfos(String billId) throws Exception;

	/**
	 * <PRE>
	 * 根据用户的 VIP信息 集团成员 客户经理信息查询
	 * 
	 * 涉及表：
	 * cm_club_member 会员表
	 * cm_club_member_card 会员卡号表
	 * cm_user_manager 大客户电话经理表
	 * sec.sec_staff 员工表
	 * sec.sec_organize 组织表
	 * sec.sec_operator 操作工号表
	 * sec.sec_oper_domain_rela 工号扩展归属系统表
	 * cm_group_member 集团成员表
	 * cm_group_customer 集团客户表
	 * cm_group_manager 集团客户经理表
	 * 
	 * @param userId 用户编号
	 * @return Map {
	 * 		MEMBER_NAME 大客户名称
	 * 		MEMBER_LEVEL 大客户级别
	 * 		CARD_CODE 大客户卡号
	 * 		ManagerName 电话经理名称
	 * 		ManagerPhone 电话经理联系电话
	 * 		HAS_PHOTO 是否拍照集团成员
	 * 		GrpManagerName 集团客户经理名称
	 * 		GrpManagerPhone 集团经理联系电话
	 * }
	 * @throws Exception
	 * </PRE>
	 */
	public Map qryUserInfo(long userId) throws Exception;

	/**
	 * <PRE> 
	 * 3.6.2.2	产品管理员增加,删除
	 * 接口编码：OI_AcceptProdMemTemp
	 * 
	 * @Function acceptProdMemTemp
	 * @Description 3.6.2.2	产品管理员增加,删除
	 * 
	 * 涉及表:
	 * ins_user_xxx 用户表（按地市分表）
	 * cm_group_contact 集团联系人、关键人、家属表（产品管理员不能是主要联系人）
	 * cm_group_member 集团成员表
	 *
	 * @param parameter {
	 * 		GroupId	集团编号	1	
	 * 		ServiceNum	成员服务号码	1
	 * 		RoleId	角色类型	1	2.主要联系人3.普通成员.9.产品管理员7.帐详单联系人	变更的角色id(暂时只变3,9)
	 * }
	 * @return Map 
	 * @throws Exception
	 *
	 * @version v1.0.0
	 * @author 
	 * @date Mar 15, 2012 11:33:24 AM
	 * 
	 * <strong>Modification History:</strong><br>
	 * Date         Author          Version            Description<br>
	 * ---------------------------------------------------------<br>
	 * Mar 15, 2012     kangzk           v1.0.0               修改原因<br>
	 * </PRE>
	 */
	public Map acceptProdMemTemp(Map parameter) throws Exception;

	/**
	 * <PRE> 
	 * @Function modVipClubMember
	 * @Description 新增VIP成员（特殊套餐因子）
	 * 
	 * 涉及表:
	 * ins_user_xxx 用户表（按地市分表）
	 * cm_indiv_customer 个人客户表
	 * cm_vip_element 大客户因子表
	 * cm_club_member 大客户表
	 * cm_club_member_card 大客户卡信息表
	 * cm_user_manager 大客户电话经理关系表
	 *
	 * @param billId            手机号码
	 * @param memberLevel       会员级别
	 * @param doneCode          业务处理编码
	 * @return {true:成功；flase:失败；}
	 * @throws Exception
	 *
	 * @version v1.0.0
	 * @author 
	 * @date Mar 15, 2012 11:33:24 AM
	 * 
	 * <strong>Modification History:</strong><br>
	 * Date         Author          Version            Description<br>
	 * ---------------------------------------------------------<br>
	 * Mar 15, 2012     kangzk           v1.0.0               修改原因<br>
	 * </PRE>
	 */
	public Boolean modVipClubMember(String billId, String memberLevel, String doneCode) throws Exception;

	/**
	 * <PRE>
	 * 方法提供给营业，当用户由别的品牌变更为全球通，或者新增全球通用户时，要求营业调用该接口，
	 * 用来在cm_club_member表中增加一条member_level为0（普通用户）的全球通会员记录，该记录
	 * 在本地全球通用户享受机场、火车站服务时，需要判断全球通品牌和入网时长，扣减积分。
	 * 
	 * @Function modGlobalClubMember
	 * @Description 新增全球通俱乐部成员
	 * 
	 * 涉及表：
	 * 营业的用户表ins_user_xxx
	 * cm_indiv_customer     个人客户表
	 * cm_club_member        大客户表
	 * cm_club_member_card   大客户卡号表
	 * cm_vip_element        大客户因子表
	 * CM_KERNEL_CLASS_CFG   VIP等级评定规则表
	 *
	 * @param  billId                手机号码
	 * @param  offId                 用户策划ID
	 * @param  doneCode              业务处理编码
	 * @return {true:表示成功；false:表示失败； }
	 * @throws Exception
	 *
	 * @version v1.0.0
	 * @author 
	 * @date Mar 15, 2012 11:33:24 AM
	 * 
	 * <strong>Modification History:</strong><br>
	 * Date         Author          Version            Description<br>
	 * ---------------------------------------------------------<br>
	 * Mar 15, 2012     kangzk           v1.0.0               修改原因<br>
	 * </PRE>
	 */
	public Boolean modGlobalClubMember(String billId, long offId, String doneCode) throws Exception;

	/**
	 * <PRE>
	 * 查询pay_method=21银行托收的集团账户
	 *    
	 * @Function queryBankAcctsByCustId
	 * @Description 集团对公托收查询（即查询集团下面的托收账户信息）
	 * 
	 * 涉及表:
	 * cm_group_customer               集团客户表
	 * cm_cust_acct_rel                客户账户关系表
	 * cm_account_xxx                  账户主表（按地市分表）
	 * cm_acct_payment_xxx             账户支付表（按地市分表）
	 * cm_acct_bill_cycle_xxx          账户帐期表（按地市分表）
	 *
	 * @param paraMap {
	 * 		GroupId		集团客户编号，对应表的cust_id
	 * }
	 * @return Map {
	 * 		CommonUserInfo  List结构体 {
	 * 			CustName		集团名称
	 * 			AcctId			账户编号
	 * 			AcctName		账户名称
	 * 			CreateDate		新建日期
	 * 			MonthBill		这个字段，客户管理无数据，直接返回的空字符串
	 * 		}
	 * }
	 * @throws Exception
	 *
	 * @version v1.0.0
	 * @author shitian
	 * @date Nov 2, 2012 4:05:14 PM
	 * 
	 * <strong>Modification History:</strong><br>
	 * Date         Author          Version            Description<br>
	 * ---------------------------------------------------------<br>
	 * Nov 2, 2012     shitian           v1.0.0               修改原因<br>
	 * </PRE>
	 */
	public Map queryBankAcctsByCustId(Map paraMap) throws Exception;

	/**
	 * <PRE>   
	 * @Function qryVipMangerInfo
	 * @Description 根据用户的服务号码或者用户编码查询电话经理及电话经理组信息
	 * 
	 * 涉及表：
	 * cm_club_member		    VIP客户表
	 * cm_user_manager		    VIP客户电话经理关系表
	 * cm_cust_manager_team_rel 电话经理组和电话经理关系表
	 *
	 * @param userID 用户编码  
	 * @param BillId 手机号码 
	 * @return Map {
	 * 		ManagerId      电话经理ID
	 * 		ManagerGroupId 电话经理组ID
	 * }
	 * @throws Exception
	 *
	 * @version v1.0.0
	 * @author 
	 * @date Nov 2, 2012 4:05:14 PM
	 * 
	 * <strong>Modification History:</strong><br>
	 * Date         Author          Version            Description<br>
	 * ---------------------------------------------------------<br>
	 * </PRE>
	 */
	public Map qryVipMangerInfo(long userId, String billId) throws Exception;

	/**
	 * <PRE>   
	 * 3.8.2.45 查询客户经理审核记录
	 * 原来是提供给ESOP和集团网厅公用,现在集团网厅因为查询条件有要求,而单独提供接口,
	 * 现在这个接口只有ESOP使用.
	 * 
	 * 涉及表:
	 * CM_GROUP_CUSTOMER_AUDIT     集团客户信息审核表
	 * 
	 * @Function queryAuditValues
	 * @Description 根据客户经理编码查询需要审核的数据
	 *
	 * @param managerId 客户经理编码  type 查询类型  0 查询未审核 1 查询所有
	 * @param paraMap {
	 * 1	managerId	集团客户经理Id	1     
	 * 2	queryType	查询标志	1	1：查询所有；0：查询未审核的；
	 * 3	startIndex	查询开始记录	1		开始记录从1开始
	 * 4	endIndex	查询结束记录	1
	 * }
	 * @return Map {
	 * Count	总记录数	？		当startIndex为1时，才会返回Count值，值为记录总数。
	 * CustManagerAuditRec {	集团客户经理审核信息	+		参考客户经理审核记录信息
	 * 		{
	 * 			AuditID	审核序列号	1		审核序列号
	 * 			AuditType	审核类型	1		审核类型		1：集团客户2：集团成员
	 * 			CustId	客户编号	1		客户编号
	 * 			ZIPCode	客户邮编	?		客户邮编
	 * 			Address	客户地址	?		客户地址
	 * 			ContactPhone	客户联系电话	?		客户联系电话
	 * 			MemberCustId	成员客户编号	?		成员客户编号
	 * 			MemberType	成员类型	?		成员类型
	 * 			UserId	用户编号	?		用户编号
	 * 			BillId	成员服务号码	?		成员服务号码
	 * 			Department	部门	?		部门
	 * 			JOB	职位	?		职位
	 * 			ManagerId	客户经理编号	?		客户经理编号
	 * 			MemberName	成员名称	?		成员名称
	 * 			RegionCode	地市编号	?		地市编号
	 * 			CountyCode	县市编号	?		县市编号
	 * 			GroupType	集团类型	?		集团类型
	 * 			MemberStatus	成员状态	?		成员状态
	 * 			MemberCreateDate	成员加入时间	?		成员加入时间
	 * 			OpType	操作类型	1		操作类型1：新增2：修改3：删除4：查询
	 * 			AuditStatus	审核状态	1		审核状态1：未审核2：审核通过3：审核不通过
	 * 			AuditDesc	审核说明	?		审核说明
	 * 			Remark	备注	?		备注
	 * 			AuditManagerId	审核经理	?		审核经理
	 * 		}
	 * }
	 * @throws Exception
	 *
	 * @version v1.0.0
	 * @author 
	 * @date Nov 2, 2012 4:05:14 PM
	 * 
	 * <strong>Modification History:</strong><br>
	 * Date         Author          Version            Description<br>
	 * ---------------------------------------------------------<br>
	 * </PRE>
	 */
	public Map queryAuditValues(Map paraMap) throws Exception;

	/**
	 * <PRE>
	 * 根据客户编号和账户编号删除对应的客户和账户的相应记录
	 * 这个接口专门提供给营业个人
	 * 用来删除个人网上开户后撤单后删除垃圾客户和账户信息
	 * 
	 * 涉及表(其中xxx是数字型地市编码):
	 * cm_indiv_customer              个人客户表
	 * cm_account_xxx                 账户主表(按地市分表)
	 * cm_acct_payment_xxx            账户支付表(按地市分表)
	 * CMX_ACCT_PAYMENT_ATTR          账户支付扩展表
	 * cm_acct_bill_cycle_xxx         账户账期表(按地市分表)
	 * cm_bill_customize_xxx          定制化账单表(按地市分表)
	 * CM_CUST_ACCT_REL	              个人客户和账户关系表
	 * 
	 * @Function delCustAndAcct
	 * @Description 删除对应的客户和账户信息
	 *
	 * @param custId
	 * @param acctId
	 * @throws Exception
	 *
	 * @version v1.0.0
	 * @author shitian
	 * @date Nov 12, 2012 8:50:47 PM
	 * 
	 * <strong>Modification History:</strong><br>
	 * Date         Author          Version            Description<br>
	 * ---------------------------------------------------------<br>
	 * Nov 12, 2012     shitian           v1.0.0               修改原因<br>
	 * </PRE>
	 */
	public void delCustAndAcct(long custId, long acctId) throws Exception;

	/**
	 * <PRE>
	 * 根据支付账户，管理区域标识，付费方式，支付银行编码查询账户和支付方案信息接口
	 *    
	 * 提供给帐管
	 * 
	 * @Function queryAcctAndPayments
	 * @Description 查询账户和支付方案信息
	 * 
	 * 涉及表:
	 * cm_account_xxx              账户主表（按地市分表)
	 * cm_acct_payment_xxx         账户支付表（按地市分表）
	 * cmx_acct_payment_attr       账户支付扩展表（不分表）只取了attr_code='BankBehalfPhone'的数据
	 *
	 * @param bankAccount          支付账户
	 * @param regionId             管理区域标识
	 * @param payMethod            付费方式
	 * @param bankCode             支付银行编码
	 * @return IAccountProfileValue[]
	 * @see com.asiainfo.crm.cm.model.ivalues.IAccountProfileValue
	 * @throws Exception
	 *
	 * @version v1.0.0
	 * @author shitian
	 * @date Oct 9, 2012 4:06:24 PM
	 * 
	 * <strong>Modification History:</strong><br>
	 * Date         Author          Version            Description<br>
	 * ---------------------------------------------------------<br>
	 * Oct 9, 2012     shitian           v1.0.0               修改原因<br>
	 * </PRE>
	 */
	public IAccountProfileValue[] queryAcctAndPayments(String bankAccount, String regionId, long payMethod, String bankCode, int start, int end) throws Exception;

	/**
	 * <PRE>
	 * 根据支付账户，管理区域标识，付费方式，支付银行编码查询账户和支付方案信息的数量
	 * 
	 * 提供给帐管   
	 * @Function queryAcctAndPaymentsCount
	 * @Description 查询账户和支付方案信息数量
	 *
	 * @param bankAccount             支付账户
	 * @param regionId                管理区域标识
	 * @param payMethod               付费方式
	 * @param bankCode                支付银行编码
	 * @return
	 * @throws Exception
	 *
	 * @version v1.0.0
	 * @author shitian
	 * @date Oct 24, 2012 8:36:43 PM
	 * 
	 * <strong>Modification History:</strong><br>
	 * Date         Author          Version            Description<br>
	 * ---------------------------------------------------------<br>
	 * Oct 24, 2012     shitian           v1.0.0               修改原因<br>
	 * </PRE>
	 */
	public int queryAcctAndPaymentsCount(String bankAccount, String regionId, long payMethod, String bankCode) throws Exception;

	/**
	 * <PRE>
	 * 修改客户的状态，老状态可以不传，如果传了值，则根据客户编号和老状态来修改客户状态为新状态
	 * 在新CRM系统中，客户状态如下：
	 * {个人客户状态：0历史；1在用；2删除；   集团客户状态：0在网集团客户；1潜在集团客户；2竞争对手集团客户 }
	 * 涉及表:
	 * cm_indiv_customer 个人客户表
	 * cm_group_customer 集团客户表
	 * 
	 * @param custId		客户编号（不区分个人和集团）
	 * @param newStatus		客户新状态 
	 * @param oldStatus		客户老状态
	 * @throws Exception
	 * </PRE>
	 */
	public void updateCustStatus(long custId, int newStatus, int oldStatus) throws Exception;

	/**
	 * <PRE>
	 * 集团网厅接口：3.2.6.2	客户经理审核记录查询
	 * 接口编码：OI_QryManagerApplyInfo
	 * 这个接口是专为集团网厅新开发的.
	 * 涉及表:
	 * CM_GROUP_CUSTOMER_AUDIT     集团客户信息审核表
	 *    
	 * @Function queryAuditValuesNew
	 * @Description 3.2.6.2	客户经理审核记录查询
	 *
	 * @param Map {
	 * 		GroupId			集团编号
	 * 		QueryType 		查询标志  1：查询所有；0：查询未审核的；
	 * 		StartIndex		查询开始记录    开始记录从1开始
	 * 		EndIndex		查询结束记录
	 * 		AuditType		审核类型  1：集团客户 2：集团成员
	 * 		BgnDate			开始时间（创建日期）
	 * 		EndDate			结束时间（创建日期）
	 * }
	 * @return Map {
	 *  Count	总记录数	？		当StartIndex为1时，才会返回Count值，值为记录总数。
	 * 	ManagerApplyInfo	集团客户经理审核信息	*		参考客户经理审核记录信息
	 *	{注意:返回的字段可能存在差异,统一接口进行了转换.
	 *		AuditID	审核序列号	1		审核序列号
	 *		AuditType	审核类型	1		审核类型		1：集团客户2：集团成员
	 *		CustId	客户编号	1		客户编号
	 *		ZIPCode	客户邮编	?		客户邮编
	 *		Address	客户地址	?		客户地址
	 *		ContactPhone	客户联系电话	?		客户联系电话
	 *		MemberCustId	成员客户编号	?		成员客户编号
	 *		MemberType	成员类型	?		成员类型
	 *		UserId	用户编号	?		用户编号
	 *		BillId	成员服务号码	?		成员服务号码
	 *		Department	部门	?		部门
	 *		Job	职位	?		职位
	 *		ManagerId	客户经理编号	?		客户经理编号
	 *		MemberName	成员名称	?		成员名称
	 *		RegionCode	地市编号	?		地市编号
	 *		CountyCode	县市编号	?		县市编号
	 *		GroupType	集团类型	?		集团类型
	 *		MemberStatus	成员状态	?		成员状态
	 *		MemberCreateDate	成员加入时间	?		成员加入时间
	 *		OpType	操作类型	1		操作类型1：新增2：修改3：删除4：查询
	 *		AuditStatus	审核状态	1		审核状态1：未审核2：审核通过3：审核不通过
	 *		AuditDesc	审核说明	?		审核说明
	 *		Remark	备注	?		备注
	 *		AuditManagerId	审核经理	?		审核经理
	 *	} 
	 * }
	 * @throws Exception
	 *
	 * @version v1.0.0
	 * @author 
	 * @date Nov 2, 2012 4:05:14 PM
	 * 
	 * <strong>Modification History:</strong><br>
	 * Date         Author          Version            Description<br>
	 * ---------------------------------------------------------<br>
	 * </PRE>
	 */
	public Map queryAuditValuesNew(Map paraMap) throws Exception;

	/**
	 * <PRE>
	 * 根据账户标识查询账户支付方案信息,只查询cm_acct_payment表
	 * 涉及表：
	 * CM_ACCT_PAYMENT_XXX     账户支付表（按地市分表）
	 * 
	 * @param acctId				账户编号
	 * @return IAcctPaymentValue
	 * @see com.asiainfo.crm.cm.model.ivalues.IAcctPaymentValue
	 * @throws Exception
	 * </PRE>
	 */
	public IAcctPaymentValue qryAcctPaymentByAcctId(long acctId) throws Exception;

	/**
	 * <PRE>
	 * 根据channel_city和partner_org_id查询CM_AGENT_PARTNER_INFO 表数据
	 * 营业调用该接口
	 * 
	 * 涉及表：
	 * CM_AGENT_PARTNER_INFO        资金物流平台代理商组织关系表
	 * 
	 * @param channelCity  地市编码
	 * @param PartnerId    代理商组织编号
	 * @return IBOCmAgentPartnerInfoValue
	 * @see com.asiainfo.crm.cm.cp.ivalues.IBOCmAgentPartnerInfoValue
	 * @throws Exception
	 * </PRE>
	 */
	public IBOCmAgentPartnerInfoValue[] queryAgentPartnerInfo(long channelCity, long partnerId) throws Exception;

	/**
	 * <PRE>
	 * 根据BUSI_SHEET_ID和STATE查询集团合同附件信息
	 * 涉及表:CM_ATTACH
	 * 注意：如果BUSI_SHEET_ID的传入是：
	 * contract_id，则查询合同附件
	 * cont_id，则查询集团联系人附件
	 * cust_service_id，则查询集团客户的附件
	 *    
	 * @Function queryAttacthByid
	 * @Description 根据主键查询合同信息
	 *
	 * @param busiSheetId 附件关联ID
	 * @return IBOCmAttachValue[]
	 * @see com.asiainfo.crm.cm.common.ivalues.IBOCmAttachValue
	 * @throws Exception
	 *
	 * @version v1.0.0
	 * @author shitian
	 * @date Dec 2, 2012 3:40:11 PM
	 * 
	 * <strong>Modification History:</strong><br>
	 * Date         Author          Version            Description<br>
	 * ---------------------------------------------------------<br>
	 * Dec 2, 2012     shitian           v1.0.0               修改原因<br>
	 * </PRE>
	 */
	public IBOCmAttachValue[] queryAttacthByid(long busiSheetId) throws Exception;

	/**
	 * 根据集团客户编号和手机号码判断这个手机号码是该集团的网内成员或者家属，以及是否大客户等信息
	 * 
	 * 接口提供给集团业务使用
	 * 
	 * @param custId		集团客户编号
	 * @param billId		手机号码
	 * @return Map {
	 * 		CUST_ID   集团客户id
	 * 		CUST_NAME   集团客户名称
	 * 		CUST_SERVICE_ID   集团编码
	 * 		CUST_SERVICE_LEVEL   集团级别
	 * 		IS_INNER_MEMBER   是否网内成员：1表示集团网内成员,0表示不是网内成员
	 * 		MEMBER_CUST_NAME   成员姓名
	 * 		MEMBER_USER_ID   成员用户编号
	 * 		MEMBER_BILL_ID   成员手机号码
	 * 		MEMBER_STATUS   成员角色：辽宁特殊处理：用来标识这个成员是普通成员还是产品管理员	产品管理员：9 普通成员：3
	 * 		IS_GROUP_FAMILY_CONTACT   是否集团家属：1表示集团家属，0表示不是集团家属
	 * 		CONT_NAME   家属姓名
	 * 		CONT_USER_ID   家属用户编号
	 * 		CONT_BILL_ID   家属手机号码
	 * 		IS_VIP   是否是VIP客户，1表示是VIP，0表示不是VIP
	 * 		CLUB_VIP_LEVEL   VIP级别,1钻，2金，3银，4大客户，5个人贵宾卡，6集团贵宾卡
	 * 		CLUB_BILL_ID   手机号码
	 * 		CLUB_MEMBER_NAME   会员名称
	 * }
	 * @throws Exception
	 */
	public Map queryGMBorContact(long custId, String billId) throws Exception;

	/**
	 * <PRE>
	 * 根据custId查询集团客户成员
	 * 涉及表：
	 * CM_GROUP_MEMBER
	 * 
	 * @param custId   集团客户编码
	 * @param action   操作标识   0  查下级客户成员数量（包含本集团），1 查询本集团成员数量
	 * @return Map {
	 * 				
	 * 			Count 集团成员数  
	 * )
	 * @see queryGroupMemberByCustId
	 * @throws Exception
	 * </PRE>
	 */
	public int queryGroupMemberByCustId(long custId, String action) throws Exception;

	/**
	 * <PRE>
	 * @Function queryCustUnionInfo
	 * @Description 获取用户的扩展信息
	 * 
	 * 涉及表:
	 * cm_indiv_customer 个人客户表
	 * cm_cust_acct_rel 客户账户关系表
	 * cm_account_xxx 账户表（按地市分表）
	 * cm_acct_payment_xxx 账户支付表（按地市分表）
	 * cm_acct_bill_cycle_xxx 账户账期表（按地市分表）
	 * CM_CUST_UNION_INFO 客户综合信息
	 * 
	 * @param custId   客户编码
	 * @param userId   用户编码
	 * @param acctId   用户默认账户编码
	 * @return Map {
	 *  CUST_NAME 客户名称
	 *  BIRTHDAY 客户生日
	 *  PAY_METHOD 支付类型   
	 *  CREDIT_LEVEL 信誉等级  
	 *  CREDIT_VALUE 信誉额度  数据返回单位为分，如果页面展示请除100按元展示
	 *  OUTLINE_ALARM 离网预警
	 *  AVG_ARPU 平均ARPU
	 *  CURRENT_TERMINAL 当前终端品牌 
	 *  FLUX_USE 流量使用   月GPRS流量 单位KB 页面展示请除以1024 单位M
	 *  AVG_CALL_TIMES_DAY 月通话时长 单位分钟
	 *  FIELD_1 预留字段1   终端类型
	 *  FIELD_2 预留字段2   月短信使用条数 
	 *  FIELD_3 预留字段3   换机倾向指数
	 *  FIELD_4 预留字段4
	 *  FIELD_5 预留字段5
	 *  FIELD_6 预留字段6
	 *  FIELD_7 预留字段7
	 *  FIELD_8 预留字段8
	 *  FIELD_9 预留字段9
	 *  FIELD_10 预留字段10		
	 * }
	 * @throws Exception
	 * </PRE>
	 */
	public Map queryCustUnionInfo(long custId, long userId, long acctId) throws Exception;

	/**
	 * 根据userId查询大客户经理关系表
	 * 专门提供给营销管理使用,只做单表查询，对象不为null且length>0才表示有客户经理
	 * 
	 * 涉及表：
	 * cm_user_manager 大客户经理表
	 * 
	 * @param userId 用户编号
	 * @return IBOLnCmUserManagerValue[]
	 * @see com.asiainfo.crm.cm.ln.club.ivalues.IBOLnCmUserManagerValue
	 * @throws Exception
	 */
	public IBOLnCmUserManagerValue[] queryCmUserManagerByUserId(long userId) throws Exception;

	/**
	 * <PRE>
	 * 根据userId查询集团网内成员信息,如果返回null，则表示不是网内成员，否则是网内成员
	 * 
	 * 涉及表:
	 * cm_group_member 集团成员表
	 * 
	 * @param userId 用户编码
	 * @return IGroupMemberValue
	 * @see com.asiainfo.crm.cm.model.ivalues.IGroupMemberValue
	 * @throws Exception
	 * </PRE>
	 */
	public IGroupMemberValue qryGrpMem(long userId) throws Exception;

	/**
	 * 
	* @Function: ICm2InterFSV.java
	* @Description: 根据手机号码，查询所属集团的客户经理 未排重
	*
	* @param:billId 手机号码
	* @return：返回结果电话经理信息 
	* @throws：异常描述
	*
	* @version: v1.0.0
	* @author: suntao6
	* @date: Jan 17, 2013 2:46:53 PM 
	*
	* Modification History:
	* Date         Author          Version            Description
	*---------------------------------------------------------*
	* Jan 17, 2013     suntao6           v1.0.0              修改原因
	*/
	public IQBOSecCustManagerValue[] qryGroupMangerInfoByBillId(String billId) throws Exception;

	/**
	 * 
	* @Function: ICmInterfaceSV.java
	* @Description: 同步客户信息（party.CM_CLUB_MEMBER、party.CM_GROUP_CONTACT、party.CM_GROUP_MEMBER）
	*
	* @param:phoneNum 手机号 oldCustId 过户前custId  newCustId 过户后custId
	* @return：返回结果描述
	* @throws：异常描述
	*
	* @version: v1.0.0
	* @author: guansj
	* @date: 2013-1-23 下午02:16:35 
	*
	* Modification History:
	* Date         Author          Version            Description
	*---------------------------------------------------------*
	* 2013-1-23      guansj           v1.0.0              修改原因
	 */
	public void synCustInfo(long phoneNum, long oldCustId, long newCustId) throws Exception;

	/**
	 * 
	 * @Function queryCmInsCmRelValues
	 * @Description 根据客户编号和用户编号查询客户用户关系
	 *
	 * @param custId
	 * @param userId
	 * @param start
	 * @param end
	 * @return
	 * @throws Exception
	 *
	 * @version v1.0.0
	 * @author shitian
	 * @date 2013-8-5 下午2:50:05
	 * 
	 * <strong>Modification History:</strong><br>
	 * Date         Author          Version            Description<br>
	 * ---------------------------------------------------------<br>
	 * 2013-8-5     shitian           v1.0.0               修改原因<br>
	 */
	public IBOLnCmInsCmRelValue[] queryCmInsCmRelValues(long custId, long userId, int start, int end) throws Exception;

	/**   
	 * @Function queryCmInsCmRelValuesCount
	 * @Description 根据客户编号和用户编号查询客户用户关系数量
	 *
	 * @param custId
	 * @param userId
	 * @return
	 * @throws Exception
	 *
	 * @version v1.0.0
	 * @author shitian
	 * @date 2013-8-5 下午2:57:40
	 * 
	 * <strong>Modification History:</strong><br>
	 * Date         Author          Version            Description<br>
	 * ---------------------------------------------------------<br>
	 * 2013-8-5     shitian           v1.0.0               修改原因<br>
	 */
	public int queryCmInsCmRelValuesCount(long custId, long userId) throws Exception;

	/**   
	 * @Function queryCustomerByCdns
	 * @Description 
	 *
	 * @param billId
	 * @param customerName
	 * @param custType
	 * @param custId
	 * @param status
	 * @param certCode
	 * @param startIndex
	 * @param endIndex
	 * @return
	 * @throws Exception
	 *
	 * @version v1.0.0
	 * @author shitian
	 * @date 2013-8-5 下午4:28:43
	 * 
	 * <strong>Modification History:</strong><br>
	 * Date         Author          Version            Description<br>
	 * ---------------------------------------------------------<br>
	 * 2013-8-5     shitian           v1.0.0               修改原因<br>
	 */
	public ICustomerValue[] queryCustomerByCdns(String billId, String customerName, int custType, long custId, int status, String certCode, int startIndex, int endIndex)
			throws Exception;

	/**   
	 * @Function queryCustomerByCdnsCount
	 * @Description 
	 *
	 * @param billId
	 * @param customerName
	 * @param custType
	 * @param custId
	 * @param status
	 * @param certCode
	 * @return
	 * @throws Exception
	 *
	 * @version v1.0.0
	 * @author shitian
	 * @date 2013-8-5 下午4:28:50
	 * 
	 * <strong>Modification History:</strong><br>
	 * Date         Author          Version            Description<br>
	 * ---------------------------------------------------------<br>
	 * 2013-8-5     shitian           v1.0.0               修改原因<br>
	 */
	public int queryCustomerByCdnsCount(String billId, String customerName, int custType, long custId, int status, String certCode) throws Exception;

	/**   
	 * @Function queryIndivCustAndContact
	 * @Description 
	 *
	 * @param custId
	 * @return
	 * @throws Exception
	 *
	 * @version v1.0.0
	 * @author shitian
	 * @date 2013-8-5 下午5:12:41
	 * 
	 * <strong>Modification History:</strong><br>
	 * Date         Author          Version            Description<br>
	 * ---------------------------------------------------------<br>
	 * 2013-8-5     shitian           v1.0.0               修改原因<br>
	 */
	public IVOCustValue queryIndivCustAndContact(long custId) throws Exception;

	/**   
	 * @Function queryCustomerByCdns
	 * @Description 
	 *
	 * @param custId
	 * @param custType	1:individual  3:group
	 * @param certType
	 * @param certCode
	 * @param custName
	 * @return
	 * @throws Exception
	 *
	 * @version v1.0.0
	 * @author shitian
	 * @date 2013-8-7 上午10:53:33
	 * 
	 * <strong>Modification History:</strong><br>
	 * Date         Author          Version            Description<br>
	 * ---------------------------------------------------------<br>
	 * 2013-8-7     shitian           v1.0.0               修改原因<br>
	 */
	public ICustomerValue[] queryCustomerByCdns(long custId, int custType, int certType, String certCode, String custName, int start, int end) throws Exception;

	/**   
	 * @Function queryCustomerCountByCdns
	 * @Description 
	 *
	 * @param custId
	 * @param custType
	 * @param certType
	 * @param certCode
	 * @param custName
	 * @return
	 * @throws Exception
	 *
	 * @version v1.0.0
	 * @author shitian
	 * @date 2013-8-7 上午11:22:21
	 * 
	 * <strong>Modification History:</strong><br>
	 * Date         Author          Version            Description<br>
	 * ---------------------------------------------------------<br>
	 * 2013-8-7     shitian           v1.0.0               修改原因<br>
	 */
	public int queryCustomerCountByCdns(long custId, int custType, int certType, String certCode, String custName) throws Exception;

	/**   
	 * @Function saveCustomer
	 * @Description 
	 *
	 * @param customerValue
	 * @return
	 * @throws Exception
	 *
	 * @version v1.0.0
	 * @author shitian
	 * @date 2013-8-7 上午11:10:37
	 * 
	 * <strong>Modification History:</strong><br>
	 * Date         Author          Version            Description<br>
	 * ---------------------------------------------------------<br>
	 * 2013-8-7     shitian           v1.0.0               修改原因<br>
	 */
	public long saveCustomer(ICustomerValue customerValue) throws Exception;

	/**   
	 * @Function queryAcctsByCustId
	 * @Description 
	 *
	 * @param custId
	 * @param start
	 * @param end
	 * @return
	 * @throws Exception
	 *
	 * @version v1.0.0
	 * @author shitian
	 * @date 2013-8-12 下午5:02:47
	 * 
	 * <strong>Modification History:</strong><br>
	 * Date         Author          Version            Description<br>
	 * ---------------------------------------------------------<br>
	 * 2013-8-12     shitian           v1.0.0               修改原因<br>
	 */
	public IAccountProfileValue[] queryAcctsByCustId(long custId, int start, int end) throws Exception;

	/**   
	 * @Function queryAcctsCountByCustId
	 * @Description 
	 *
	 * @param custId
	 * @return
	 * @throws Exception
	 *
	 * @version v1.0.0
	 * @author shitian
	 * @date 2013-8-12 下午5:02:52
	 * 
	 * <strong>Modification History:</strong><br>
	 * Date         Author          Version            Description<br>
	 * ---------------------------------------------------------<br>
	 * 2013-8-12     shitian           v1.0.0               修改原因<br>
	 */
	public int queryAcctsCountByCustId(long custId) throws Exception;

	/**   
	 * @Function saveAccount
	 * @Description if delete : new IAccountValue and need only to set acctId
	 *
	 * @param accountValue
	 * @param isDelete
	 * @return
	 * @throws Exception
	 *
	 * @version v1.0.0
	 * @author shitian
	 * @date 2013-8-12 下午5:17:51
	 * 
	 * <strong>Modification History:</strong><br>
	 * Date         Author          Version            Description<br>
	 * ---------------------------------------------------------<br>
	 * 2013-8-12     shitian           v1.0.0               修改原因<br>
	 */
	public long saveAccount(IAccountValue accountValue, boolean isDelete) throws Exception;

	/**   
	 * @Function queryAcctCustomize
	 * @Description 
	 *
	 * @param acctId
	 * @return
	 * @throws Exception
	 *
	 * @version v1.0.0
	 * @author shitian
	 * @date 2013-8-12 下午5:22:08
	 * 
	 * <strong>Modification History:</strong><br>
	 * Date         Author          Version            Description<br>
	 * ---------------------------------------------------------<br>
	 * 2013-8-12     shitian           v1.0.0               修改原因<br>
	 */
	public IAcctBillCustomizeValue queryAcctCustomize(long acctId) throws Exception;

	/**   
	 * @Function checkCustCertInfo
	 * @Description 
	 *
	 * @param billId
	 * @param certType
	 * @param certCode
	 * @return
	 * @throws Exception
	 *
	 * @version v1.0.0
	 * @author shitian
	 * @date 2013-8-13 上午9:25:36
	 * 
	 * <strong>Modification History:</strong><br>
	 * Date         Author          Version            Description<br>
	 * ---------------------------------------------------------<br>
	 * 2013-8-13     shitian           v1.0.0               修改原因<br>
	 */
	public boolean checkCustCertInfo(String billId, int certType, String certCode) throws Exception;

	/**   
	 * @Function queryAcctsByCustId
	 * @Description 根据账户，客户编号查询账户信息（使用客户账户关系表）
	 *
	 * @param custId 
	 * @param startIndex
	 * @param endIndex
	 * @return
	 *
	 * @version v1.0.0
	 * @author shitian
	 * @date Oct 16, 2012 11:23:38 AM
	 * 
	 * <strong>Modification History:</strong><br>
	 * Date         Author          Version            Description<br>
	 * ---------------------------------------------------------<br>
	 * Oct 16, 2012     shitian           v1.0.0               修改原因<br>
	 */
	public IAccountValue[] queryAcctsById(long custId, int startIndex, int endIndex) throws Exception;

	/**   
	 * @Function queryAcctsCountByCustId
	 * @Description 根据客户编号查询账户信息数量（使用客户账户关系表）
	 *
	 * @param custId
	 * @return
	 *
	 * @version v1.0.0
	 * @author shitian
	 * @date Oct 16, 2012 11:24:07 AM
	 * 
	 * <strong>Modification History:</strong><br>
	 * Date         Author          Version            Description<br>
	 * ---------------------------------------------------------<br>
	 * Oct 16, 2012     shitian           v1.0.0               修改原因<br>
	 */
	public int queryAcctsCountById(long custId) throws Exception;

	/**   
	 * @Function queryCustOrganizesById
	 * @Description 根据集团客户编号和父组织编号查询集团组织
	 *
	 * @param groupCustId
	 * @param parentDeptId
	 * @param start
	 * @param end
	 * @return
	 * @throws Exception
	 *
	 * @version v1.0.0
	 * @author shitian
	 * @date 2013-8-14 上午9:41:33
	 * 
	 * <strong>Modification History:</strong><br>
	 * Date         Author          Version            Description<br>
	 * ---------------------------------------------------------<br>
	 * 2013-8-14     shitian           v1.0.0               修改原因<br>
	 */
	public ICustOrganizeValue[] queryCustOrganizesById(long groupCustId, long parentDeptId, int start, int end) throws Exception;

	/**   
	 * @Function queryCustOrganizesCountById
	 * @Description 根据集团客户编号和父组织编号查询集团组织数量
	 *
	 * @param groupCustId
	 * @param parentDeptId
	 * @return
	 * @throws Exception
	 *
	 * @version v1.0.0
	 * @author shitian
	 * @date 2013-8-14 上午9:43:04
	 * 
	 * <strong>Modification History:</strong><br>
	 * Date         Author          Version            Description<br>
	 * ---------------------------------------------------------<br>
	 * 2013-8-14     shitian           v1.0.0               修改原因<br>
	 */
	public int queryCustOrganizesCountById(long groupCustId, long parentDeptId) throws Exception;

	/**   
	 * @Function queryCustOrganizeById
	 * @Description 根据组织编号，查询组织信息
	 *
	 * @param deptId
	 * @return
	 * @throws Exception
	 *
	 * @version v1.0.0
	 * @author shitian
	 * @date 2013-8-14 上午9:53:25
	 * 
	 * <strong>Modification History:</strong><br>
	 * Date         Author          Version            Description<br>
	 * ---------------------------------------------------------<br>
	 * 2013-8-14     shitian           v1.0.0               修改原因<br>
	 */
	public ICustOrganizeValue queryCustOrganizeById(long deptId) throws Exception;

	/**   
	 * @Function saveCustOrganize
	 * @Description 集团组织管理，如果是删除，则只需要new一个ICustOrganizeValue，然后塞一个deptId就行
	 *
	 * @param custOrganizeValue
	 * @param isDelete
	 * @return
	 * @throws Exception
	 *
	 * @version v1.0.0
	 * @author shitian
	 * @date 2013-8-14 上午10:24:34
	 * 
	 * <strong>Modification History:</strong><br>
	 * Date         Author          Version            Description<br>
	 * ---------------------------------------------------------<br>
	 * 2013-8-14     shitian           v1.0.0               修改原因<br>
	 */
	public long saveCustOrganize(ICustOrganizeValue custOrganizeValue, boolean isDelete) throws Exception;

	/**   
	 * @Function queryGroupMembers
	 * @Description 
	 *
	 * @param deptId
	 * @param memberName
	 * @param billId
	 * @param start
	 * @param end
	 * @return
	 * @throws Exception
	 *
	 * @version v1.0.0
	 * @author shitian
	 * @date 2013-8-14 上午10:38:23
	 * 
	 * <strong>Modification History:</strong><br>
	 * Date         Author          Version            Description<br>
	 * ---------------------------------------------------------<br>
	 * 2013-8-14     shitian           v1.0.0               修改原因<br>
	 */
	public IGroupMemberValue[] queryGroupMembers(long deptId, String memberName, String billId, int start, int end) throws Exception;

	/**
	 * 通过集团客户编号查询集团下所有的组织成员。这个接口
	 * 在360视图的employee management中使用的。之前
	 * 没有这个接口，所以在这个地方添加一个。
	 * <p/>
	 * <p>Contact Me: caiwm@asiainfo-linkage.com</p>
	 *
	 * @param groupCustId 集团客户编号
	 * @param start       记录起始编号
	 * @param end         记录结束编号
	 * @return
	 * @throws Exception
	 */
	public IGroupMemberValue[] queryGroupMembersByCustId(long groupCustId, String memberName, String billId, int start, int end) throws Exception;

	/**
	 * 根据集团客户编号查询集团下组织成员的个数。在
	 * employee management视图中分页要使用到。
	 *
	 * @param groupCustId 集团客户编号
	 * @return
	 * @throws Exception
	 */
	public int queryGroupMembersCountByCustId(long groupCustId, String memberName, String billId) throws Exception;

	/**
	 * @Function queryGroupMembersCount
	 * @Description 
	 *
	 * @param deptId
	 * @param memberName
	 * @param billId
	 * @return
	 * @throws Exception
	 *
	 * @version v1.0.0
	 * @author shitian
	 * @date 2013-8-14 上午10:39:28
	 * 
	 * <strong>Modification History:</strong><br>
	 * Date         Author          Version            Description<br>
	 * ---------------------------------------------------------<br>
	 * 2013-8-14     shitian           v1.0.0               修改原因<br>
	 */
	public int queryGroupMembersCount(long deptId, String memberName, String billId) throws Exception;

	/**   
	 * @Function saveGroupMember
	 * @Description 
	 *
	 * @param groupMemberValues
	 * @param 1:add 2:modify 3:delete
	 * @throws Exception
	 *
	 * @version v1.0.0
	 * @author shitian
	 * @date 2013-8-15 下午7:36:01
	 * 
	 * <strong>Modification History:</strong><br>
	 * Date         Author          Version            Description<br>
	 * ---------------------------------------------------------<br>
	 * 2013-8-15     shitian           v1.0.0               修改原因<br>
	 */
	public void saveGroupMember(IBOCmGroupMemberValue[] groupMemberValues, int operType) throws Exception;

	public DataContainer[] query360AcctsByCustId(long custId, int start, int end) throws Exception, RemoteException;

	/**   
	 * @Function queryGroupMembers
	 * @Description 
	 *
	 * @param condition
	 * @param startNum
	 * @param endNum
	 * @return
	 * @throws Exception
	 *
	 * @version v1.0.0
	 * @author shitian
	 * @date 2013-8-30 下午2:46:26
	 * 
	 * <strong>Modification History:</strong><br>
	 * Date         Author          Version            Description<br>
	 * ---------------------------------------------------------<br>
	 * 2013-8-30     shitian           v1.0.0               修改原因<br>
	 */
	public IGroupMemberValue[] queryGroupMembers(DataContainer condition, int startNum, int endNum) throws Exception;

	/**   
	 * @Function queryGroupMembersCount
	 * @Description 
	 *
	 * @param condition
	 * @return
	 * @throws Exception
	 *
	 * @version v1.0.0
	 * @author shitian
	 * @date 2013-8-30 下午2:46:43
	 * 
	 * <strong>Modification History:</strong><br>
	 * Date         Author          Version            Description<br>
	 * ---------------------------------------------------------<br>
	 * 2013-8-30     shitian           v1.0.0               修改原因<br>
	 */
	public int queryGroupMembersCount(DataContainer condition) throws Exception;

	/**   
	 * @Function save360Account
	 * @Description 
	 *
	 * @param accountProfileValue
	 * @throws Exception
	 * @throws RemoteException
	 *
	 * @version v1.0.0
	 * @author shitian
	 * @date Sep 9, 2013 9:23:16 AM
	 * 
	 * <strong>Modification History:</strong><br>
	 * Date         Author          Version            Description<br>
	 * ---------------------------------------------------------<br>
	 * Sep 9, 2013     shitian           v1.0.0               修改原因<br>
	 */
	public void save360Account(DataContainerInterface accountProfileValue) throws Exception, RemoteException;

	/**   
	 * @Function queryGroupTopOrganize
	 * @Description 查询集团一级部门
	 *
	 * @param groupCustId
	 * @return
	 * @throws Exception
	 *
	 * @version v1.0.0
	 * @author shitian
	 * @date Sep 6, 2013 10:00:50 AM
	 * 
	 * <strong>Modification History:</strong><br>
	 * Date         Author          Version            Description<br>
	 * ---------------------------------------------------------<br>
	 * Sep 6, 2013     shitian           v1.0.0               修改原因<br>
	 */
	public ICustOrganizeValue[] queryGroupTopOrganize(long groupCustId) throws Exception;

	/**   
	 * @Function queryGroupOrganizesById
	 * @Description 
	 *
	 * @param groupCustId
	 * @param parentDeptId
	 * @param start
	 * @param end
	 * @return
	 * @throws Exception
	 *
	 * @version v1.0.0
	 * @author shitian
	 * @date 2013-8-15 下午8:13:49
	 * 
	 * <strong>Modification History:</strong><br>
	 * Date         Author          Version            Description<br>
	 * ---------------------------------------------------------<br>
	 * 2013-8-15     shitian           v1.0.0               修改原因<br>
	 */
	public ICustOrganizeValue[] queryGroupOrganizesById(long groupCustId, long parentDeptId, int start, int end) throws Exception;

	/**   
	 * @Function saveGroupOrganize
	 * @Description 
	 *
	 * @param groupOrgStructValue
	 * @param operType 1:add 2:modify 3:delete
	 * @return
	 * @throws Exception
	 *
	 * @version v1.0.0
	 * @author shitian
	 * @date 2013-8-15 下午8:09:29
	 * 
	 * <strong>Modification History:</strong><br>
	 * Date         Author          Version            Description<br>
	 * ---------------------------------------------------------<br>
	 * 2013-8-15     shitian           v1.0.0               修改原因<br>
	 */
	public long saveGroupOrganize(ICustOrganizeValue groupOrgStructValue, int operType) throws Exception;

	/**   
	 * @Function saveGroupMember
	 * @Description 
	 *
	 * @param groupMemberValue
	 * @return
	 * @throws Exception
	 *
	 * @version v1.0.0
	 * @author shitian
	 * @date Sep 9, 2013 9:28:33 AM
	 * 
	 * <strong>Modification History:</strong><br>
	 * Date         Author          Version            Description<br>
	 * ---------------------------------------------------------<br>
	 * Sep 9, 2013     shitian           v1.0.0               修改原因<br>
	 */
	public long saveGroupMember(IGroupMemberValue groupMemberValue) throws Exception;
	
	/**   
	 * @Function queryGroupOrganizeByDeptId
	 * @Description 
	 *
	 * @param deptId
	 * @return
	 * @throws Exception
	 *
	 * @version v1.0.0
	 * @author shitian
	 * @date Sep 11, 2013 9:26:20 AM
	 * 
	 * <strong>Modification History:</strong><br>
	 * Date         Author          Version            Description<br>
	 * ---------------------------------------------------------<br>
	 * Sep 11, 2013     shitian           v1.0.0               修改原因<br>
	 */
	public ICustOrganizeValue queryGroupOrganizeByDeptId(long deptId)throws Exception;
	
	/**   
	 * @Function querySegmentRelaByCustId
	 * @Description 
	 *
	 * @param custId
	 * @return
	 * @throws Exception
	 *
	 * @version v1.0.0
	 * @author zhuyy
	 * @date Sep 11, 2014 9:26:20 AM
	 * 
	 * <strong>Modification History:</strong><br>
	 * Date         Author          Version            Description<br>
	 * ---------------------------------------------------------<br>
	 * Sep 11, 2014     zhuyy           v1.0.0               修改原因<br>
	 */
	public IBOCmCustSegmentRelaValue querySegmentRelaByCustId(long custId)throws Exception; 
	
	/**   
	 * @Function getKobData
	 * @Description 
	 *
	 * @param mInput
	 * @return
	 * @throws Exception
	 *
	 * @version v1.0.0
	 * @author zhuyy
	 * @date Sep 11, 2014 9:26:20 AM
	 * 
	 * <strong>Modification History:</strong><br>
	 * Date         Author          Version            Description<br>
	 * ---------------------------------------------------------<br>
	 * Sep 11, 2014     zhuyy           v1.0.0               修改原因<br>
	 */
	public Map getKobData(Map mInput)throws Exception; 
	
	/**   
	 * @Function queryCustomerByCustId
	 * @Description 
	 *
	 * @param custId
	 * @param state
	 * @return
	 * @throws Exception
	 *
	 * @version v1.0.0
	 * @author Administrator
	 * @date 2014-11-6 上午9:47:11
	 * 
	 * <strong>Modification History:</strong><br>
	 * Date         Author          Version            Description<br>
	 * ---------------------------------------------------------<br>
	 * 2014-11-6     shitian             v1.0.0               修改原因<br>
	 */
	public ICustomerValue queryCustomerByCustId(long custId, String state) throws Exception;
	
	/**
	 * OSE查询客户信息
	* <p>Title: </p>
	* <p>Description: </p>
	* <p>Company: AsiaInfo</p> 
	* @author YuJing
	* @date 2018-7-20
	* ICmInterfaceSV
	 */
	public ICustomerValue queryCustomerByCustIdForOSE(long custId, String state) throws Exception;
	
}
