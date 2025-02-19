package com.asiainfo.crm.so.teaminvoke.in.service.interfaces;

import java.rmi.RemoteException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.ai.appframe2.common.DataContainerInterface;
import com.ai.secframe.orgmodel.ivalues.IQBOSecCustManagerValue;
import com.asiainfo.crm.cm.common.ivalues.IBOCmInsCmrelValue;
import com.asiainfo.crm.cm.cp.ivalues.IBOCmAgentPartnerInfoValue;
import com.asiainfo.crm.cm.customer.group.ivalues.IBoCmCustSegmentValue;
import com.asiainfo.crm.cm.inner.account.ivalues.IQBOCmAcctPayMentValue;
import com.asiainfo.crm.cm.inner.customer.ivalues.IBOCmFamilyCustomerValue;
import com.asiainfo.crm.cm.inner.customer.ivalues.IBOCmGroupCustomerValue;
import com.asiainfo.crm.cm.inner.customer.ivalues.IBOCmGroupMemberValue;
import com.asiainfo.crm.cm.ln.account.ivalues.IBOCmxAcctBankRelValue;
import com.asiainfo.crm.cm.ln.common.ivalues.IBOLnCmInsCmRelValue;
import com.asiainfo.crm.cm.ln.common.ivalues.IBOLnCmInsDesRelValue;
import com.asiainfo.crm.cm.model.ivalues.IAccountProfileValue;
import com.asiainfo.crm.cm.model.ivalues.IAccountValue;
import com.asiainfo.crm.cm.model.ivalues.IAcctBillCycleValue;
import com.asiainfo.crm.cm.model.ivalues.IAcctPaymentValue;
import com.asiainfo.crm.cm.model.ivalues.IClubMemberValue;
import com.asiainfo.crm.cm.model.ivalues.ICustomerValue;
import com.asiainfo.crm.cm.model.ivalues.IGroupMemberValue;
import com.asiainfo.crm.cm.model.ivalues.IVOAccountValue;

/**
 * Copyright: Copyright (c) 2011 Asiainfo-Linkage
 * 
 * @ClassName: ICust2CrmSV.java
 * @Description: 客户管理提供给营业的接口
 * 
 * @version: v1.0.0
 * @author: yaojx
 * @date: Dec 19, 2011 11:36:33 AM
 * 
 *        Modification History: Date Author Version Description
 *        ---------------------------------------------------------* Dec 19,
 *        2011 yaojx v1.0.0 修改原因
 */
public interface ICust2CrmSV
{
    /**
     * @Function: ICust2CrmSV.java
     * @Description: 根据账户编号，查询账户信息
     * 
     * @param acctId
     * @return
     * @throws Exception
     * @throws RemoteException
     * @return：返回结果描述
     * @throws：异常描述
     * 
     * @version: v1.0.0
     * @author: yaojx
     * @date: Dec 19, 2011 11:38:27 AM
     * 
     *        Modification History: Date Author Version Description
     *        ---------------------------------------------------------* Dec 19,
     *        2012 zhouwei9 v1.0.0 修改原因
     */
    public IAccountValue queryAcctInfoById(long acctId) throws Exception,
            RemoteException;

    /**
     * @Function: queryCustInfoByBillId
     * @Description: 根据客户编号等查询客户信息
     * 
     * @param custId
     *            客户编号。必选条件。
     * @param custType
     *            客户类型。可选条件，如果不确定客户类型时可传非正数，通过客户编号生成规则获取客户类型。
     * @param billId
     *            手机号码。可选条件，如果不传则不查询大客户资料。
     * @return ICmCustomerValue 客户信息封装类，提供给其他域调用服务的返回值。
     * @throws Exception
     * @throws RemoteException
     * 
     * @version: v1.0.0
     * @author: huzq2
     * @date: Mar 19, 2011 1:01:07 PM
     * 
     *        Modification History: Date Author Version Description
     *        ---------------------------------------------------------* Mar 19,
     *        2011 huzq2 v1.0.0 修改原因
     */
    public DataContainerInterface queryCustInfoByCustId(long custId,
            int custType, String billId) throws Exception, RemoteException;

    /**
     * @Function: queryAccountBankContactById
     * @Description: 根据账户编号查询账户、账户关联的银行账户、主要联系人信息
     * 
     * @param:参数描述
     * @return：返回结果描述
     * @throws：异常描述
     * 
     * @version: v1.0.0
     * @author: liuke
     * @date: 2011-2-21 下午03:31:19
     * 
     *        Modification History: Date Author Version Description
     *        ---------------------------------------------------------*
     *        2011-2-21 liuke v1.0.0 修改原因
     */
    public DataContainerInterface queryAccountBankContactById(long acctId)
            throws Exception, RemoteException;

    /**
     * @Function: queryIndivCustomerByVipCardCode
     * @Description: 根据VIP卡号查询该VIP信息
     * 
     * @param vipCardCode
     * @return
     * @throws Exception
     * @throws RemoteException
     * 
     * @version: v1.0.0
     * @author: DengShaoPing <dengsp3@asiainfo-linkage.com>
     * @date: 2011-12-30上午10:29:59
     * 
     *        Modification History: Date Author Version Description
     *        --------------
     *        ------------------------------------------------------
     *        ----------------* 2011-12-30上午10:29:59 DengShaoPing v1.0.0 new
     */
    public DataContainerInterface queryIndivCustomerByVipCardCode(
            String vipCardCode) throws Exception, RemoteException;

    /**
     * @Function: queryCustInfoByCustIdAndBillId
     * @Description: 根据客户编号和手机号码查询客户信息
     * 
     * @param custId
     *            客户编号。必选条件
     * @param custType
     * @param billId
     * @return
     * @throws Exception
     * @throws RemoteException
     * 
     * @version: v1.0.0
     * @author: DengShaoPing <dengsp3@asiainfo-linkage.com>
     * @date: 2011-12-30上午11:32:27
     * 
     *        Modification History: Date Author Version Description
     *        --------------
     *        ------------------------------------------------------
     *        ----------------* 2011-12-30上午11:32:27 DengShaoPing v1.0.0 new
     */
    public Map queryCustInfoByCustIdAndBillId(long custId, int custType,
            String billId) throws Exception, RemoteException;

    /**
     * @Function: ICust2CrmSV.java
     * @Description: 根据账户编号，查询账户信息
     * 
     * @param acctId
     * @return
     * @throws Exception
     * @throws RemoteException
     * @return：返回结果描述
     * @throws：异常描述
     * 
     * @version: v1.0.0
     * @author: yaojx
     * @date: Dec 19, 2011 11:38:27 AM
     * 
     *        Modification History: Date Author Version Description
     *        ---------------------------------------------------------* Dec 19,
     *        2011 yaojx v1.0.0 修改原因
     */
    public IAccountValue queryAccountById(long acctId) throws Exception,
            RemoteException;

    /**
     * 该服务主要用于通过客户编号查询客户基本信息
     * 
     * @Function: queryCustomerById
     * @Description:
     * 
     * @param custId
     *            客户编号
     * @return
     * @throws Exception
     * @throws RemoteException
     * 
     * @version: v1.0.0
     * @author: ganliang <ganliang3@asiainfo-linkage.com>
     * @date: 2012-1-4上午10:32:24
     * 
     *        Modification History: Date Author Version Description
     *        --------------
     *        ------------------------------------------------------
     *        ----------------* 2012-1-4上午10:32:24 ganliang v1.0.0 new
     */
    public ICustomerValue queryCustomerById(long custId) throws Exception,
            RemoteException;

    /**
     * 该服务主要用于通过证件信息查询客户基本信息数量
     * 
     * @Function: queryCustomerCountByCert
     * @Description:
     * 
     * @param custCertType
     * @param custCertCode
     * @return
     * @throws Exception
     * @throws RemoteException
     * 
     * @version: v1.0.0
     * @author: ganliang <ganliang3@asiainfo-linkage.com>
     * @date: 2012-1-4上午10:34:21
     * 
     *        Modification History: Date Author Version Description
     *        --------------
     *        ------------------------------------------------------
     *        ----------------* 2012-1-4上午10:34:21 ganliang v1.0.0 new
     */
    public int queryCustomerCountByCert(int custCertType, String custCertCode)
            throws Exception, RemoteException;

    /**
     * 该服务主要用于通过证件信息查询客户基本信息列表
     * 
     * @Function: queryCustomersByCert
     * @Description:
     * 
     * @param custCertType
     *            证件类型
     * @param custCertCode
     *            证件号码
     * @param startNum
     *            分页参数 不分页传-1
     * @param endNum
     *            分页参数 不分页传-1
     * @return
     * @throws Exception
     * @throws RemoteException
     * 
     * @version: v1.0.0
     * @author: ganliang <ganliang3@asiainfo-linkage.com>
     * @date: 2012-1-4上午10:35:58
     * 
     *        Modification History: Date Author Version Description
     *        --------------
     *        ------------------------------------------------------
     *        ----------------* 2012-1-4上午10:35:58 ganliang v1.0.0 new
     */
    public ICustomerValue[] queryCustomersByCert(int custCertType,
            String custCertCode, int startNum, int endNum) throws Exception,
            RemoteException;

    /**
     * 该服务主要用于查询完整的账户信息服务
     * 
     * @Function: queryVOAccountByAcctId
     * @Description: 该服务主要用于查询完整的账户信息服务。 该服务返回账户的所有信息，包含账户下的所有支付方案和联系人信息。
     *               调用需谨慎，如果不需要查询账户的所有信息请选择查询对应的服务： 1、根据账户编号查询账户基本信息
     * 
     * @param acctId
     *            账户编号
     * @return 账户大对象
     * @throws Exception
     * @throws RemoteException
     * 
     * @version: v1.0.0
     * @author: ganliang <ganliang3@asiainfo-linkage.com>
     * @date: 2012-1-4上午10:37:32
     * 
     *        Modification History: Date Author Version Description
     *        --------------
     *        ------------------------------------------------------
     *        ----------------* 2012-1-4上午10:37:32 ganliang v1.0.0 new
     */
    public IAccountValue queryVOAccountByAcctId(long acctId) throws Exception,
            RemoteException;

    /**
     * 根据客户编号查询客户VO大对象
     * 
     * @Function: queryVOCustomerByCustId
     * @Description: 根据客户编号查询客户VO大对象。
     *               该方法主要用于需要同时查询客户的基本信息以及客户联系人列表、参与人信息时使用，使用需谨慎。
     *               如果只是需要查询客户的基本信息，则调用根据客户编号查询客户基本信息。
     * 
     * @param custId
     *            客户编号
     * @return 客户大对象
     * @throws Exception
     * @throws RemoteException
     * 
     * @version: v1.0.0
     * @author: ganliang <ganliang3@asiainfo-linkage.com>
     * @date: 2012-1-4上午10:39:03
     * 
     *        Modification History: Date Author Version Description
     *        --------------
     *        ------------------------------------------------------
     *        ----------------* 2012-1-4上午10:39:03 ganliang v1.0.0 new
     */
    public ICustomerValue queryVOCustomerByCustId(long custId)
            throws Exception, RemoteException;

    /**
     * 保存账户资料
     * 
     * @Function: saveAccount
     * @Description: 保存账户资料，包括账户信息（账户基本信息、账户支付方案）和账户联系人信息。
     *               参数为客户管理中定义的账户大对象，这样便于以后的业务的扩展，
     *               比如：账户的支付方案由一个账户一种支付方案变化为一个账户多种支付方案的变化等。
     * @param aObj
     *            账户对象
     * @return 账户编号
     * @throws Exception
     * @throws RemoteException
     * 
     * @version: v1.0.0
     * @author: ganliang <ganliang3@asiainfo-linkage.com>
     * @date: 2012-1-4上午10:41:09
     * 
     *        Modification History: Date Author Version Description
     *        --------------
     *        ------------------------------------------------------
     *        ----------------* 2012-1-4上午10:41:09 ganliang v1.0.0 new
     */
    public long saveAccount(IVOAccountValue aObj) throws Exception,
            RemoteException;

    /*
     * 根据集团客户名称,查询集团客户信息(全模糊)
     */
    public ICustomerValue[] queryCustotmerByCustName(String name)
            throws Exception, RemoteException;

    /*
     * 根据集团客户编码,查询集团客户信息
     */
    public ICustomerValue queryCustotmerByGroupId(String groupId)
            throws Exception, RemoteException;

    /*
     * 根据客户标识,查询客户信息,可查询集团客户,个人客户,家庭客户,虚拟客户,能根据客户表示自动匹配
     */
    public ICustomerValue queryCustotmerByCustId(long CustId) throws Exception;

    // 根据集团主要联系人手机号码查询集团客户信息
    public ICustomerValue queryGroupCustByKeyBillId(String billId)
            throws Exception;

    /**
     * 保存账户资料
     * 
     * @Function: saveAccount
     * @Description: 保存账户信息。 与业务受理侧开户等地方需要创建或者修改账户信息的功能点相关， 为了使得功能比较易于扩展，
     *               暂定为使用Map传递参数，Map中存放页面上各个表单（表格） 中的数据（DataContainer）
     *               ，Map的key为表单（表格）的ID，后台根据约定进行解析，然后再封装到VO对象中，传递给后台Service处理。
     * 
     * @param acctInfoMap
     *            账户信息Map
     * @return 账户编号
     * @throws Exception
     * @throws RemoteException
     * 
     * @version: v1.0.0
     * @author: ganliang <ganliang3@asiainfo-linkage.com>
     * @date: 2012-1-6下午19:41:09
     * 
     *        Modification History: Date Author Version Description
     *        --------------
     *        ------------------------------------------------------
     *        ----------------* 2012-1-6下午19:41:09 ganliang v1.0.0 new
     */
    public long saveAccount(Map acctInfoMap) throws Exception, RemoteException;

    /**
     * 1.2.10 保存客户资料
     * 
     * @Function: saveCustomer
     * @Description:保存客户信息。使用Map作为参数，方便功能的扩展， 
     *                                        Map的key使用页面上的表单（表格）的ID，值为该表格（表单）的数据
     *                                        ，使用DataContainer作为数据传递工具。
     * 
     * @param custInfoMap
     * @throws Exception
     * @throws RemoteException
     * 
     * @version: v1.0.0
     * @author: ganliang <ganliang3@asiainfo-linkage.com>
     * @date: 2012-1-6下午19:43:04
     * 
     *        Modification History: Date Author Version Description
     *        --------------
     *        ------------------------------------------------------
     *        ----------------* 2012-1-6下午19:43:04 ganliang v1.0.0 new
     */
    public long saveCustomer(Map custInfoMap) throws Exception, RemoteException;

    /**
     * 1.2.11 用户状态变更通知
     * 
     * @Function: userStateChangeNotice
     * @Description: 用户状态变更通知 个人用户的状态变更时需要通知客户管理，
     *               客户管理需要根据当前用户状态变更客户管理域中与该用户相关的信息， 该接口供营业用户状态变更时调用。
     * @param userId
     *            用户对象 必须
     * @param custId
     *            客户编号 必须
     * @param userState
     *            用户状态 必须
     * 
     * @throws Exception
     * @throws RemoteException
     * 
     * @version: v1.0.0
     * @author: ganliang <ganliang3@asiainfo-linkage.com>
     * @date: 2012-1-4上午10:46:06
     * 
     *        Modification History: Date Author Version Description
     *        --------------
     *        ------------------------------------------------------
     *        ----------------* 2012-1-4上午10:46:06 ganliang v1.0.0 new
     */
    public void userStateChangeNotice(long userId, long custId, String userState)
            throws Exception, RemoteException;

    /**
     * @Function querySpecialListByCertInfo
     * @Description 根据证件信息查询该客户是否在黑名单中
     * 
     * @param certType
     *            必填
     * @param certCode
     *            必填
     * @return true:在黑名单中 ; false:不在
     * @throws Exception
     * 
     * @version v1.0.0
     * @author shitian
     * @date Feb 13, 2012 2:35:17 PM
     * 
     *       <strong>Modification History:</strong><br>
     *       Date Author Version Description<br>
     *       ---------------------------------------------------------<br>
     *       Feb 13, 2012 shitian v1.0.0 修改原因<br>
     */
    public boolean querySpecialListByCertInfo(int certType, String certCode)
            throws Exception, RemoteException;

    /**
     * 根据客户编号查询客户信息
     * 
     * @param custId
     * @return
     * @throws Exception
     * @throws RemoteException
     */
    public ICustomerValue queryCustInfoById(long custId) throws Exception,
            RemoteException;

    /**
     * @Function: ICust2CrmSV.java
     * @Description: 根据集团编号，查询集团信息
     * 
     * @param groupId
     * @return
     * @throws Exception
     * @throws RemoteException
     * @return：返回结果描述
     * @throws：异常描述
     * 
     * @version: v1.0.0
     * @author: yaojx
     * @date: May 26, 2011 7:29:33 PM
     * 
     *        Modification History: Date Author Version Description
     *        ---------------------------------------------------------* May 26,
     *        2011 yaojx v1.0.0 修改原因
     */
    public IBOCmGroupCustomerValue queryGroupCustomerByGroupId(long groupId)
            throws Exception, RemoteException;

    /**
     * 
     * @Function: querySpecialListByCustId
     * @Description: 查询特殊名单
     * 
     * @param:参数描述
     * @return：返回结果描述
     * @throws：异常描述
     * 
     * @version: v1.0.0
     * @author: yal.fang
     * @date: Sep 4, 2012 10:48:43 AM
     * 
     *        Modification History: Date Author Version Description
     *        ---------------------------------------------------------*
     */
    public List querySpecialListByCustId(String custId) throws Exception;

    /**
     * 
     * @Function: getCustById
     * @Description: 根据客户ID返回客户信息
     * 
     * @param:参数描述
     * @return：返回结果描述
     * @throws：异常描述
     * 
     * @version: v1.0.0
     * @author: yal.fang
     * @date: Aug 3, 2012 4:45:11 PM
     * 
     *        Modification History: Date Author Version Description
     *        ---------------------------------------------------------* Aug 3,
     *        2012 yal.fang v1.0.0 修改原因
     */
    public ICustomerValue getCustById(long custId) throws Exception;

    /**
     * 根据证件号码、证件类型查询客户信息
     * 
     * @author anwx@asiainfo-linkage.com @ 2012-8-7
     * @param certType
     * @param certCode
     * @return
     * @throws Exception
     * 
     */
    public ICustomerValue[] queryCustsByCert(int certType, String certCode)
            throws Exception;

    /**
     * @Function: queryCmInsCmRelByCustId
     * @Description: 查询客户ID下的所有用户
     * 
     * @param: custId
     * @return：IBOLnCmInsCmRelValue[]
     * @throws：异常描述
     * 
     * @version: v1.0.0
     * @author: zhouwu
     * @date: Sep 1, 2012 4:56:43 PM
     * 
     *        Modification History: Date Author Version Description
     *        -------------------------------------------------------------* Sep
     *        1, 2012 zhouwu v1.0.0 修改原因
     */
    public IBOLnCmInsCmRelValue[] queryCmInsCmRelByCustId(long custId,
            long userId) throws Exception;

    /**
     * @Function: queryClubMemberByBillId
     * @Description: 根据服务号码,查询个人大客户信息
     * 
     * @param:BillId
     * @return：List
     * @throws：Exception
     * 
     * @version: v1.0.0
     * @author: zhouwu
     * @date: Sep 12, 2012 9:52:53 AM
     * 
     *        Modification History: Date Author Version Description
     *        ---------------------------------------------------------* Sep 12,
     *        2012 zhouwu v1.0.0 修改原因
     */
    public List queryClubMemberByBillId(String BillId) throws Exception;

    /**
     * @Function: CmInsCmRel
     * @Description: 新增客户用户关系
     * 
     * @param:BillId
     * @return：List
     * @throws：Exception
     * 
     * @version: v1.0.0
     * @author: zhouwu
     * @date: Sep 12, 2012 9:52:53 AM
     * 
     *        Modification History: Date Author Version Description
     *        ---------------------------------------------------------* Sep 12,
     *        2012 anwx v1.0.0 修改原因
     * */
    public void addCmInsCmRel(long userId, long custId, String regionId,
            int userType, int relType) throws Exception;

    /**
     * @Function: CmInsCmRel
     * @Description: 新增客户用户关系
     *
     * @param:BillId
     * @return：List
     * @throws：Exception
     *
     * @version: v1.0.0
     * @author: zhouwu
     * @date: Sep 12, 2012 9:52:53 AM
     *
     * Modification History:
     * Date         Author          Version            Description
     *---------------------------------------------------------*
     * Sep 12, 2012      anwx           v1.0.0               修改原因
     *  */
    public void addCmInsCmRel(long userId, long custId, String regionId,int userType,int relType,HashMap param)throws Exception;

    /**
     * 
     * @Function: addCmBillCustomize
     * @Description: 保存个性化账单信息
     * 
     * @param:传入用户编号-USER_ID
     * @return：返回结果描述
     * @throws：异常描述
     * 
     * @version: v1.0.0
     * @author: fangyl
     * @date: Sep 14, 2012 3:43:28 PM
     * 
     *        Modification History: Date Author Version Description
     *        ---------------------------------------------------------* Sep 14,
     *        2012 fangyl v1.0.0 修改原因
     */
    public long addCmBillCustomize(Map paraMap) throws Exception;

    public int queryAccountCountByCustId(long acctId) throws Exception,
            RemoteException;

    public IAccountValue[] queryAccountsByCustId(long custId, int startNum,
            int endNum) throws Exception, RemoteException;

    /**
     * @Function: deleteCmInsCmRel
     * @Description: 根据UserId删除客户用户表中的数据
     * 
     * @param:
     * @return：
     * @throws：
     * 
     * @version: v1.0.0
     * @author: xiaozhibi
     * @date: 2012-9-17下午08:34:10
     * 
     *        Modification History: Date Author Version Description
     *        ---------------------------------------------------------*
     *        2012-9-17 xiaozhibi v1.0.0 修改原因
     */
    public String deleteCmInsCmRel(Map parameter) throws RemoteException,
            Exception;

    /**
     * @Function: checkRealNameByCustId
     * @Description: 根据客户ID校验是否实名制
     * 
     * @param:
     * @return：
     * @throws：异常描述
     * 
     * @version: v1.0.0
     * @author: liuke
     * @date: 2012-9-18 下午09:11:45
     * 
     *        Modification History: Date Author Version Description
     *        ---------------------------------------------------------*
     *        2012-9-18 liuke v1.0.0 修改原因
     */
    public boolean checkRealNameByCustId(long custId) throws RemoteException,
            Exception;

    /**
     * 
     * @Function: modifyUserAndCustRel
     * @Description: 修改用户和客户关系
     * 
     * @param:userId-用户编号
     * @param:custId-新的客户编号
     * @param:regionCode-地市编号
     * @return：返回结果描述
     * @throws：异常描述
     * 
     * @version: v1.0.0
     * @author: fangyl
     * @date: Sep 21, 2012 8:32:22 PM
     * 
     *        Modification History: Date Author Version Description
     *        ---------------------------------------------------------* Sep 21,
     *        2012 fangyl v1.0.0 修改原因
     */
    public void modifyUserAndCustRel(IBOLnCmInsCmRelValue cmInsCmRelValues)
            throws RemoteException, Exception;

    /**
     * 3.4.1 特殊名单维护<br>
     * 添加、删除特殊名单时根据证件号码、证件类型、监控类型、监控子类型、区域唯一确定一条记录。
     * 
     * @Function saveSpecialList
     * @Description 添加、删除特殊名单时根据证件号码、证件类型唯一确定一条记录。
     * 
     * @param parameter
     * @return
     * @throws Exception
     * 
     * @version v1.0.0
     * @author xiaozb
     * @date 2012-9-22 下午2:00:46
     * 
     *       <strong>Modification History:</strong><br>
     *       Date Author Version Description<br>
     *       ---------------------------------------------------------<br>
     *       2012-9-22 xiaozb v1.0.0 修改原因<br>
     */
    public long saveSpecialList(Map parameter) throws RemoteException,
            Exception;

    /**
     * @Function userReceipt
     * @Description 用户回单
     * 
     * @param custId
     * @param acctId
     * @param userId
     * @throws Exception
     * 
     * @version v1.0.0
     * @author shitian
     * @date Sep 8, 2012 2:11:59 PM
     * 
     *       <strong>Modification History:</strong><br>
     *       Date Author Version Description<br>
     *       ---------------------------------------------------------<br>
     *       Sep 8, 2012 shitian v1.0.0 修改原因<br>
     */
    public Boolean userReceipt(long custId, long acctId, long userId)
            throws RemoteException, Exception;

    /**
     * @Function: saveInsDesCmRel
     * @Description: 号码回收时，保存客户用户关系到销户表
     * 
     * @param:
     * @return：
     * @throws：
     * 
     * @version: v1.0.0
     * @author: xiaozhibi
     * @date: 2012-10-2下午05:23:46
     * 
     *        Modification History: Date Author Version Description
     *        ---------------------------------------------------------*
     *        2012-10-2 xiaozhibi v1.0.0 修改原因
     */
    public Boolean saveInsDesCmRel(IBOLnCmInsDesRelValue[] insDesRelValues)
            throws RemoteException, Exception;

    /**
     * @Function: actionCmInsCmRel
     * @Description: 客户用户关系表数据操作方法
     * 
     * @param:
     * @return：
     * @throws：
     * 
     * @version: v1.0.0
     * @author: xiaozhibi
     * @date: 2012-10-2下午07:03:34
     * 
     *        Modification History: Date Author Version Description
     *        ---------------------------------------------------------*
     *        2012-10-2 xiaozhibi v1.0.0 修改原因
     */
    public Map actionCmInsCmRel(Map parameter) throws RemoteException,
            Exception;

    /**
     * @Function: queryAcctBillCycleInfo
     * @Description: 根据账户标识查询出账日期,只查询bill_cycle表
     * 
     * @param:
     * @return：
     * @throws：
     * 
     * @version: v1.0.0
     * @author: zhuyd3
     * @date: 2012-10-6
     * 
     *        Modification History: Date Author Version Description
     *        ---------------------------------------------------------*
     *        2012-10-6 zhuyd3 v1.0.0 修改原因
     */
    public int queryAcctBillCycleInfo(long acctId) throws Exception;

    /**
     * 查询账户当前账期和未生效账期信息，按生效日期倒序排列
     * 
     * @Function queryCurrAcctBillCyclesByAcctId
     * @Description
     * 
     * @param acctId
     * @return
     * @throws Exception
     * 
     * @version v1.0.0
     * @author caiyu
     * @date 2012-10-4 s <strong>Modification History:</strong><br>
     *       Date Author Version Description<br>
     *       ---------------------------------------------------------<br>
     *       2012-10-4 caiyu v1.0.0 修改原因<br>
     */
    public IAcctBillCycleValue[] queryNextAcctBillCyclesByAcctId(long acctId)
            throws Exception;

    /**
     * 根据信用级别查询对应的信用度
     * 
     * @Function getCreditValueByCreditLevel
     * @Description
     * 
     * @param acctId
     * @return
     * @throws Exception
     * 
     * @version v1.0.0
     * @author caiyu
     * @date 2012-10-4 s <strong>Modification History:</strong><br>
     *       Date Author Version Description<br>
     *       ---------------------------------------------------------<br>
     *       2012-10-4 caiyu v1.0.0 修改原因<br>
     */
    public HashMap getCreditValueByCreditLevel(String regionId, long offerId)
            throws Exception, RemoteException;

    /**
     * @Function queryCmInsCmRelByCds
     * @Description 根据条件查询客户用户关系表
     * 
     * @param custId
     * @param userId
     * @param state
     *            0:销户；1：正常；-1：全部
     * @return
     * @throws Exception
     * 
     * @version v1.0.0
     * @author shitian
     * @date Oct 5, 2012 8:38:28 PM
     * 
     *       <strong>Modification History:</strong><br>
     *       Date Author Version Description<br>
     *       ---------------------------------------------------------<br>
     *       Oct 5, 2012 shitian v1.0.0 修改原因<br>
     */
    public IBOLnCmInsCmRelValue[] queryCmInsCmRelByCds(long custId,
            long userId, int state) throws Exception;

    /**
     * @Function: queryGroupCustByBillId
     * @Description: 根据手机号码查询对应集团客户信息
     * 
     * @param:
     * @return：
     * @throws：异常描述
     * 
     * @version: v1.0.0
     * @author: liuke
     * @date: 2012-10-10 下午02:42:39
     * 
     *        Modification History: Date Author Version Description
     *        ---------------------------------------------------------*
     *        2012-10-10 liuke v1.0.0 修改原因
     */
    public IBOCmGroupCustomerValue queryGroupCustByBillId(String billId)
            throws Exception, RemoteException;

    /**
     * 根据手机号码和账户编号查询浦发银行签约关系
     * 
     * @param billId
     *            手机号码
     * @return IBOCmxAcctBankRelValue 签约关系
     * @throws Exception
     * @throws RemoteException
     */
    public IBOCmxAcctBankRelValue[] queryAcctBankRel(String billId)
            throws Exception, RemoteException;

    /**
     * 根据客户标识查询账户信息，关联<code>cm_acct_payment</code>表查询
     * 
     * @param custId
     *            客户标识
     * @return <code>IAccountProfileValue[]</code>
     * @throws Exception
     * @throws RemoteException
     */
    public IAccountProfileValue[] queryAccountByCustId(long custId)
            throws Exception, RemoteException;

    /**
     * @Function: queryAcctPayMentByAcctId
     * @Description: 查询账户的付费类型等信息
     * 
     * @param:
     * @return：
     * @throws：异常描述
     * 
     * @version: v1.0.0
     * @author: liuke
     * @date: 2012-10-11 下午07:12:03
     * 
     *        Modification History: Date Author Version Description
     *        ---------------------------------------------------------*
     *        2012-10-11 liuke v1.0.0 修改原因
     */
    public IQBOCmAcctPayMentValue queryAcctPayMentByAcctId(long acctId)
            throws Exception, RemoteException;

    /**
     * 
     * @Function:
     * @Description: 根据账户标识查询账户支付方案信息,只查询cm_acct_payment表
     * 
     * @param:
     * @return：
     * @throws：异常描述
     * 
     * @version: v1.0.0
     * @author: xuwenbin
     * @date: 2012-10-15 下午09:16:40
     * 
     *        Modification History: Date Author Version Description
     *        ---------------------------------------------------------*
     *        2012-10-15 xuwenbin v1.0.0 修改原因
     */
    public IAcctPaymentValue[] queryAcctPaymentByAcctId(long acctId)
            throws Exception;

    /**
     * @Function: queryVipInfoByBillId
     * @Description: 根据手机号码，查询VIP信息
     * 
     * @param:
     * @return： 返回的值 returnMap.put("returnObj",
     *          IClubMemberValue);IClubMemberValue 对象 * VIP级别 MEMBER_LEVEL： 1
     *          钻石卡 2 金卡，3 银卡，4 大客户， 5 个人贵宾卡， 6 集团贵宾卡
     * @throws：异常描述
     * 
     * @version: v1.0.0
     * @author: liuke
     * @date: 2012-10-15 上午10:11:28
     * 
     *        Modification History: Date Author Version Description
     *        ---------------------------------------------------------*
     *        2012-10-15 liuke v1.0.0 修改原因
     */
    public IClubMemberValue queryVipInfoByBillId(String billId)
            throws Exception, RemoteException;

    /**
     * 销户调用接口
     * 
     * @Function cancelLationOfUser
     * @Description
     * 
     * @param parameter
     *            Map(CustId,UserId,AcctId)
     * @return 处理结果
     * @throws Exception
     * @version v1.0.0
     * @author zouty
     * @date 2012-10-8 下午12:28:14
     * 
     *       <strong>Modification History:</strong><br>
     *       Date Author Version Description<br>
     *       ---------------------------------------------------------<br>
     *       2012-10-6 zouty v1.0.0 修改原因<br>
     */
    public Boolean cancelLationOfUser(Map parameter) throws Exception;

    /**
     * 
     * @Function:
     * @Description: 根据账户标识查询账户信息,关联cm_acct_payment表查询 封装客管
     *               com.asiainfo.crm.cm.teaminvoke
     *               .out.service.interfaces.ICmInterfaceSV
     *               queryAccountByAccountId
     * @param:
     * @return：
     * @throws：异常描述
     * 
     * @version: v1.0.0
     * @author: lipj
     * @date: Oct 18, 2012 10:17:08 AM
     * 
     *        Modification History: Date Author Version Description
     *        ---------------------------------------------------------* Oct 18,
     *        2012 lipj v1.0.0 修改原因
     */
    public IAccountProfileValue queryAccountByAccountId(long AcctId)
            throws Exception;

    /**
     * @Function: addCmInsAndCmRel
     * @Description: 新增用户客户关系表
     * 
     * @param:参数描述
     * @return：返回结果描述
     * @throws：异常描述
     * 
     * @version: v1.0.0
     * @author: lizhaoqing
     * @date: 2012-9-12
     * 
     *        Modification History: Date Author Version Description
     *        ---------------------------------------------------------*
     *        2012-9-12 lizhaoqing v1.0.0 修改原因
     */
    public void addCmInsAndCmRelRel(long CustId, long UserId,
            String UserRegionCode) throws Exception;

    /**
     * @Function: updateAcctBehalfPhoneNum
     * @Description: 修改账户代表号码
     * 
     * @param:参数描述
     * @return：返回结果描述
     * @throws：异常描述
     * 
     * @version: v1.0.0
     * @author: lizhaoqing
     * @date: 2012-10-24
     * 
     *        Modification History: Date Author Version Description
     *        ---------------------------------------------------------*
     *        2012-10-24 lizhaoqing v1.0.0 修改原因
     */
    public void updateAcctBehalfPhoneNum(long acctId, String acctBehalfPhone)
            throws Exception;

    /**
     * @Function: queryAcctDtsByCustId
     * @Description: 查询账户信息根据客户ID
     * 
     * @param:参数描述
     * @return：返回结果描述
     * @throws：异常描述
     * 
     * @version: v1.0.0
     * @author: zhuyu
     * @date: 2012-10-24
     * 
     *        Modification History: Date Author Version Description
     *        ---------------------------------------------------------*
     *        2012-10-24 zhuyu v1.0.0 修改原因
     */
    public IAccountProfileValue[] queryAcctDtsByCustId(long custId,
            String regionId, int start, int end) throws Exception;

    public int queryAcctDtsCountByCustId(long custId, String regionId)
            throws Exception;

    /**
     * 
     * @Function:
     * @Description: 账务携转轨迹表
     * 
     * @param:
     * @return：
     * @throws：异常描述
     * 
     * @version: v1.0.0
     * @author: xuwenbin
     * @date: 2012-10-26 上午10:45:41
     * 
     *        Modification History: Date Author Version Description
     *        ---------------------------------------------------------*
     *        2012-10-26 xuwenbin v1.0.0 修改原因
     */
    public void acctTransTrack(long acctId, String outRegionId,
            String inRegionId) throws Exception;

    /**
     * 
     * @Function:
     * @Description: 新增VIP成员
     * 
     * @param:
     * @return：
     * @throws：异常描述
     * 
     * @version: v1.0.0
     * @author: zhuyu
     * @date: 2012-11-03 上午10:45:41
     * 
     *        Modification History: Date Author Version Description
     *        ---------------------------------------------------------*
     *        2012-11-03 zhuyu v1.0.0 修改原因
     */
    public Boolean modVipClubMember(String billId, String memberLevel,
            String doneCode) throws Exception;

    /**
     * @Function: queryUserManagerInfo
     * @Description: 根据用户ID查询用户级的客户经理、vip卡号、集团客户经理等信息
     * 
     * @param:userId
     * @return：Map
     * @throws：Exception
     * 
     * @version: v1.0.0
     * @author: zhouwu
     * @date: Nov 3, 2012 2:35:51 PM
     * 
     *        Modification History: Date Author Version Description
     *        ---------------------------------------------------------* Nov 3,
     *        2012 zhouwu v1.0.0 修改原因
     */
    public Map queryUserManagerInfo(long userId) throws Exception;

    /**
     * @Function: updateAcctBehalfPhoneNum
     * @Description: 查询账户代表号码
     * 
     * @param:参数描述
     * @return：返回结果描述
     * @throws：异常描述
     * 
     * @version: v1.0.0
     * @author: zhuyu
     * @date: 2012-11-10
     * 
     *        Modification History: Date Author Version Description
     *        ---------------------------------------------------------*
     *        2012-11-10 zhuyu v1.0.0 修改原因
     */
    public IAccountProfileValue queryAccountProfileByAcctId(long acctId)
            throws Exception;

    /**
     * 
     * @Function:
     * @Description: 修改客户的状态(个人客户状态：0历史；1在用；2删除)
     * 
     * @param:
     * @return：
     * @throws：异常描述
     * 
     * @version: v1.0.0
     * @author: lizhaoqing
     * @date: 2012-11-19
     * 
     *        Modification History: Date Author Version Description
     *        ---------------------------------------------------------*
     *        2012-11-19 lizhaoqing v1.0.0 修改原因
     */
    public void updateCustsStatus(long custId, int newStatus, int oldStatus)
            throws Exception;

    /**
     * <PRE>
     * 当用户由别的品牌变更为全球通，或者新增全球通用户时，要求营业调用该接口，
     * 用来在cm_club_member表中增加一条member_level为0（普通用户）的全球通会员记录，该记录
     * 在本地全球通用户享受机场、火车站服务时，需要判断全球通品牌和入网时长，扣减积分。
     * 
     * @Function addGlobalClubMember
     * @Description 新增全球通俱乐部成员
     * 
     * @param  billId,doneCode
     * @return
     * @throws Exception
     * 
     * @version v1.0.0
     * @author 
     * @date Mar 15, 2012 11:33:24 AM
     * 
     * <strong>Modification History:</strong><br>
     * Date         Author          Version            Description<br>
     * ---------------------------------------------------------<br>
     * Mar 15, 2012     zhuyu           v1.0.0               修改原因<br>
     * </PRE>
     */
    public Boolean modGlobalClubMember(String billId, long offerId,
            String doneCode) throws Exception;

    /**
     * @Function: queryAgentPartnerInfo
     * @Description: 查询代销商合作伙伴
     * 
     * @param:
     * @return：
     * @throws：异常描述
     * 
     * @version: v1.0.0
     * @author: liuke
     * @date: 2012-11-28 下午08:52:36
     * 
     *        Modification History: Date Author Version Description
     *        ---------------------------------------------------------*
     *        2012-11-28 liuke v1.0.0 修改原因
     */
    public IBOCmAgentPartnerInfoValue[] queryAgentPartnerInfo(String regionId,
            long channelId) throws Exception, RemoteException;

    /**
     * @Function: queryCustUnionInfo
     * @Description: 查询客户首页的客户扩展信息
     * 
     * @param:@param parameter:传入的key有：custId，userId,acctId
     * @param:@return
     * @param:@throws Exception
     * @param:@throws RemoteException
     * @return：Map
     * @throws：
     * 
     * @version: v1.0.0
     * @author: xiaozhibi
     * @date: 2012-12-22下午05:23:19
     * 
     *        Modification History: Date Author Version Description
     *        ---------------------------------------------------------*
     *        2012-12-22 xiaozhibi v1.0.0 修改原因
     */
    public Map queryCustUnionInfo(long custId, long userId, long acctId)
            throws Exception, RemoteException;

    /**
     * 
     * @Function:
     * @Description: 查询集团网内成员
     * 
     * @param:
     * @return：
     * @throws：异常描述
     * 
     * @version: v1.0.0
     * @author: xuwenbin
     * @date: 2013-1-8 下午08:17:36
     * 
     *        Modification History: Date Author Version Description
     *        ---------------------------------------------------------*
     *        2013-1-8 xuwenbin v1.0.0 修改原因
     */
    public IGroupMemberValue qryGrpMem(long userId) throws Exception,
            RemoteException;

    /**
     * @Function: qryCustManagerByBillId
     * @Description: 根据号码查询对应集团的客户经理
     * 
     * @param:
     * @return：
     * @throws：异常描述
     * 
     * @version: v1.0.0
     * @author: liuke
     * @date: 2013-1-18 上午10:49:46
     * 
     *        Modification History: Date Author Version Description
     *        ---------------------------------------------------------*
     *        2013-1-18 liuke v1.0.0 修改原因
     */
    public IQBOSecCustManagerValue[] qryCustManagerByBillId(String billId)
            throws Exception, RemoteException;

    /**
     * 根据家庭客户ID查询家庭客户信息
     * 
     * @param long familyCustId
     * @return
     * @throws Exception
     * @throws RemoteException
     */
    public IBOCmFamilyCustomerValue queryFamilyCustInfoByFamilyCustId(
            long familyCustId) throws Exception, RemoteException;

    /**
     * @Function queryCmInsCmRelValues
     * @Description 根据客户编号和用户编号查询客户用户关系
     * @param custId
     * @param userId
     * @param start
     * @param end
     * @return
     * @throws Exception
     */
    public IBOLnCmInsCmRelValue[] queryCmInsCmRelValues(long custId,
            long userId, int start, int end) throws Exception;

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
     *       <strong>Modification History:</strong><br>
     *       Date Author Version Description<br>
     *       ---------------------------------------------------------<br>
     *       2013-8-5 shitian v1.0.0 修改原因<br>
     */
    public int queryCmInsCmRelValuesCount(long custId, long userId)
            throws Exception;

    /**
     * @Function queryCustomerByCdns
     * @Description
     * 
     * @param custId
     * @param custType
     *            1:individual 3:group
     * @param certType
     * @param certCode
     * @param custName
     * @return
     * @throws Exception
     * 
     * @version v1.0.0
     * @author lizy5
     * @date 2013-8-7 上午10:53:33
     * 
     *       <strong>Modification History:</strong><br>
     *       Date Author Version Description<br>
     *       ---------------------------------------------------------<br>
     *       2013-8-7 lizy5 v1.0.0 修改原因<br>
     */
    public ICustomerValue[] queryCustomerByCdns(long custId, int custType,
            int certType, String certCode, String custName, int start, int end)
            throws Exception, RemoteException;

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
     * @author lizy5
     * @date 2013-8-7 上午11:22:21
     * 
     *       <strong>Modification History:</strong><br>
     *       Date Author Version Description<br>
     *       ---------------------------------------------------------<br>
     *       2013-8-7 lizy5 v1.0.0 修改原因<br>
     */
    public int queryCustomerCountByCdns(long custId, int custType,
            int certType, String certCode, String custName) throws Exception,
            RemoteException;

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
     * @author lizy5
     * @date Oct 16, 2012 11:23:38 AM
     * 
     *       <strong>Modification History:</strong><br>
     *       Date Author Version Description<br>
     *       ---------------------------------------------------------<br>
     *       Oct 16, 2012 lizy5 v1.0.0 修改原因<br>
     */
    public IAccountValue[] queryAcctsById(long custId, int startIndex,
            int endIndex) throws Exception, RemoteException;

    /**
     * 根据合同，客户编号查询账户信息（使用客户账户关系表）
     * @param custId
     * @param agrId
     * @param startIndex
     * @param endIndex
     * @return
     * @throws Exception
     * @throws RemoteException
     * @author zhangxy13
     * @date 20151214
     */
    public IAccountValue[] queryAcctsByCustIdAndAgrId(long custId, long agrId, int startIndex,
            int endIndex) throws Exception, RemoteException;

    /**
     * 根据合同，客户编号查询账户信息（使用客户账户关系表）
     * @param custId
     * @param agrId
     * @param insFlag,普通账户=0
     * @param startIndex
     * @param endIndex
     * @return
     * @throws Exception
     * @throws RemoteException
     */
    public IAccountValue[] queryAcctsByCustIdAndAgrIdAndInsFlag(long custId, long agrId,int insFlag,
            int startIndex, int endIndex) throws Exception, RemoteException;
    public int queryAcctsCountByCustIdAndAgrIdAndinsFlag(long custId, long agrId,int insFlag) throws Exception, RemoteException;
    
    /**
     * @Function queryAcctsCountByCustId
     * @Description 根据客户编号查询账户信息数量（使用客户账户关系表）
     * 
     * @param custId
     * @return
     * 
     * @version v1.0.0
     * @author lizy5
     * @date Oct 16, 2012 11:24:07 AM
     * 
     *       <strong>Modification History:</strong><br>
     *       Date Author Version Description<br>
     *       ---------------------------------------------------------<br>
     *       Oct 16, 2012 lizy5 v1.0.0 修改原因<br>
     */
    public int queryAcctsCountById(long custId) throws Exception,
            RemoteException;

    /**
     * 根据合同，客户编号查询账户信息数量（使用客户账户关系表）
     * @param custId
     * @param agrId
     * @param startIndex
     * @param endIndex
     * @return
     * @throws Exception
     * @throws RemoteException
     * @author zhangxy13
     * @date 20151214
     */
    public int queryAcctsCountByCustIdAndAgrId(long custId, long agrId) throws Exception, RemoteException;

    public void updateCustStatus(long custId, int newStatus, int oldStatus)
            throws Exception, RemoteException;

    /**
     * @Function: ICust2CrmSV.java
     * @Description: 判断是否黑名单客户
     * 
     * @param custId
     * @return
     * @throws Exception
     * @throws RemoteException
     * @return：返回结果描述
     * @throws：异常描述
     * 
     * @version: v1.0.0
     * @author: yaojx
     * @date: May 6, 2014 3:06:24 PM
     * 
     *        Modification History: Date Author Version Description
     *        ---------------------------------------------------------* May 6,
     *        2014 yaojx v1.0.0 修改原因
     */
    public boolean isBlackUser(long custId) throws Exception, RemoteException;

    /**
     * 查询客户联系信息
     * @return
     * @throws Exception
     * @throws RemoteException
     */
    public String queryAddressByCustId(long custId)
            throws Exception, RemoteException;

    /**
	 * 
	 * @Function queryAnonymousCustInfo()
	 * @Description 得到一个全局的匿名客户
	 *
	 * @param 
	 * @throws Exception
	 *
	 * @version v1.0.0
	 * @author longmin
	 * @date 2014-9-9 下午7:51:37
	 * 
	 * <strong>Modification History:</strong><br>
	 * Date         Author          Version            Description<br>
	 * ---------------------------------------------------------<br>
	 * 2014-9-9     longmin           v1.0.0               修改原因<br>
	 */
	public ICustomerValue queryAnonymousCustInfo()throws Exception;
	
	/**
	 * 修改客户用户使用者关系
	 * @Function modifyCmInsCmrelValue
	 * @Description 
	 *
	 * @param cmInsCmrelValues
	 * @throws Exception
	 *
	 * @version v1.0.0
	 */
	public void modifyCmInsCmrelValue (IBOCmInsCmrelValue[] cmInsCmrelValues) throws Exception;
	
	/**
	 * 根据账户id查询账户信息
	 * @param acctId
	 * @return
	 * @throws Exception
	 */
	public IAccountProfileValue getAccountById(long acctId, String regionId) throws Exception;
	
	/**
	 *分配使用者
	 * @param cmInsCmrelValues
	 * @throws Exception
	 */
	public void createCmInsCmrelValue(IBOCmInsCmrelValue cmInsCmrelValues) throws Exception;
	
	/**
	 * 保存部门信息
	 * @param groupMemberValues
	 * @throws Exception
	 */
	public void saveGroupMembers(IBOCmGroupMemberValue[] groupMemberValues)throws Exception;
	
	/**
	 * 删除部门信息
	 * @param groupCustId
	 * @param billId
	 * @throws Exception
	 */
	public void delGroupNumMember(long groupCustId,String billId)throws Exception;
	
	/**
	 * 变更部门信息
	 * @param srcDeptId
	 * @param destDeptId
	 * @param billId
	 * @throws Exception
	 */
	public void modifyGroupNumMember(long srcDeptId, long destDeptId, String billId) throws Exception;
	
	/**
	 * 查询账户支付方式
	 * @param accountId
	 * @throws Exception
	 */
	public int queryAcctPaymentType(long accountId) throws Exception;
	
	/**
	 * 根据客户编号，获取CustSegment 信息
	 * @param custId
	 * @param inMap
	 * @return
	 * @throws Exception
	 * 2016-01-12 20:29
	 */
	public IBoCmCustSegmentValue queryCmCustSegmentByRelCustId(long custId, Map inMap) throws Exception;
	
}
