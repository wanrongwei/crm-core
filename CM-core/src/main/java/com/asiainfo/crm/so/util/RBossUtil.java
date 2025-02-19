package com.asiainfo.crm.so.util;

import java.math.BigDecimal;
import java.rmi.RemoteException;
import java.sql.Timestamp;
import java.text.SimpleDateFormat;
import java.util.*;

import com.ai.omframe.teaminvoke.service.interfaces.ICrmProductSV;
import com.ai.omframe.util.SoDataFactory;
import com.ai.pce.exception.PceException;
import com.ai.pce.ivalues.IOfferRelatProductValue;
import com.ai.pce.service.interfaces.IProductFSV;
import com.asiainfo.crm.constant.RBossConst;
import com.asiainfo.crm.constant.ResConst;
import com.asiainfo.crm.util.SoConstUtil;
import com.google.gson.Gson;
import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import org.apache.commons.lang.ClassUtils;
import org.apache.commons.lang.StringUtils;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.dom4j.Element;
import com.ai.appframe2.bo.DataContainer;
import com.ai.appframe2.bo.DataContainerFactory;
import com.ai.appframe2.bo.ObjectTypeNull;
import com.ai.appframe2.common.AIException;
import com.ai.appframe2.common.DataContainerInterface;
import com.ai.appframe2.common.DataType;
import com.ai.appframe2.common.SessionManager;
import com.ai.appframe2.service.ServiceFactory;
import com.ai.appframe2.util.XmlUtil;
import com.ai.bce.ivalues.IBceData;
import com.ai.bce.util.BceUtil;
import com.ai.common.i18n.CrmLocaleFactory;
import com.ai.common.ivalues.IBOBsParaDetailValue;
import com.ai.common.ivalues.IBOBsStaticDataValue;
import com.ai.common.util.CenterUtil;
import com.ai.common.util.ExceptionUtil;
import com.ai.common.util.StaticDataUtil;
import com.ai.omframe.instance.ivalues.IInsOfferValue;
import com.ai.omframe.instance.ivalues.IInsUserValue;
import com.ai.omframe.order.bo.OrdCustExtBean;
import com.ai.omframe.order.data.ivalues.ISoAttrData;
import com.ai.omframe.order.data.ivalues.ISoOrderData;
import com.ai.omframe.order.data.ivalues.ISoRoleData;
import com.ai.omframe.order.data.ivalues.ISoServiceData;
import com.ai.omframe.order.data.ivalues.ISoServicePkgData;
import com.ai.omframe.order.data.ivalues.ISoUserData;
import com.ai.omframe.order.data.valuebean.SoAttrData;
import com.ai.omframe.order.data.valuebean.SoOfferData;
import com.ai.omframe.order.ivalues.IOrdCustExtValue;
import com.ai.omframe.order.ivalues.IOrdCustValue;
import com.ai.omframe.order.valuebean.OrderConst;
import com.ai.omframe.util.InsServiceFactory;
import com.ai.omframe.util.SoServiceFactory;
import com.ai.pce.ivalues.IAttributeValue;
import com.ai.pce.ivalues.IOfferValue;
import com.ai.pce.ivalues.IUpItemFeatureValue;
import com.ai.secframe.client.OrgmodelClient;
import com.ai.secframe.orgmodel.ivalues.IBOSecOrganizeValue;
import com.asiainfo.crm.agreement.agreement.ivalues.IBOAgrOfferRlaHValue;
import com.asiainfo.crm.agreement.teaminvoke.out.service.interfaces.IAgreementFSV;
import com.asiainfo.crm.util.CrmI18nFactory;
import com.asiainfo.crm.so.common.party.ivalues.IBOInsSrvAttrIdxValue;
import com.asiainfo.crm.so.common.party.ivalues.IBOInsxRoamGprsSmsValue;
import com.asiainfo.crm.so.common.party.service.interfaces.IInsSrvAttrIdxSV;
import com.asiainfo.crm.so.order.rboss.service.interfaces.IFixedLineSV;
import com.asiainfo.crm.so.teaminvoke.in.service.interfaces.IProduct2CrmSV;

/**
 * Copyright: Copyright (c) 2012 Asiainfo-Linkage
 *
 * @ClassName: RBossUtil.java
 * @Description: 个人业务工具类
 *
 * @version: v1.0.0
 * @author: zhouwu
 * @date: Aug 30, 2012 10:39:34 AM
 *
 * Modification History:
 * Date         Author          Version            Description
 *-------------------------------------------------------------*
 * Aug 30, 2012      zhouwu           v1.0.0               修改原因
 */
public class RBossUtil {
    public static Log log =LogFactory.getLog(RBossUtil.class);
    /**
     * @Function: getBetweenMonth
     * @Description: 获得两个Date之间的月数
     *
     * @param: beginDate,endDate
     * @return：betweenMonth
     * @throws：异常描述
     *
     * @version: v1.0.0
     * @author: zhouwu
     * @date: Aug 30, 2012 10:46:42 AM
     *
     * Modification History:
     * Date         Author          Version            Description
     *-------------------------------------------------------------*
     * Aug 30, 2012      zhouwu           v1.0.0               修改原因
     */
    public static int getBetweenMonth(Date beginDate, Date endDate) throws Exception {
        Calendar beginCal = Calendar.getInstance();
        Calendar endCal = Calendar.getInstance();
        beginCal.setTime(beginDate);
        endCal.setTime(endDate);
        int m_begin = beginCal.get(Calendar.MONTH)+1;
        int m_end = endCal.get(Calendar.MONTH)+1;
        int betweenMonth = m_end-m_begin+(endCal.get(Calendar.YEAR)-beginCal.get(Calendar.YEAR))*12;
        return betweenMonth;
    }

    /**
     *
     * @Function: isNumber
     * @Description: 校验字符串是否全部为数字
     *
     * @param:str-待校验的字符串
     * @return：true-校验成功 false-校验失败
     * @throws：异常描述
     *
     * @version: v1.0.0
     * @author: fangyl
     * @date: Sep 18, 2012 7:43:05 PM
     *
     * Modification History:
     * Date         Author          Version            Description
     *---------------------------------------------------------*
     * Sep 18, 2012     fangyl           v1.0.0               修改原因
     */
    public static boolean isNumber(String str){
        String exp ="\\d*";
        if(str.matches(exp)){
            return true;
        }
        return false;
    }

    /**
     *
     * @Function: parseXmlCriteria
     * @Description: 解析XML格式
     *
     * @param:参数描述
     * @return：返回结果描述
     * @throws：异常描述
     *
     * @version: v1.0.0
     * @author: fangyl
     * @date: Sep 29, 2012 11:01:10 AM
     *
     * Modification History:
     * Date         Author          Version            Description
     *---------------------------------------------------------*
     * Sep 29, 2012     fangyl           v1.0.0               修改原因
     */
    public static DataContainer[] parseXmlCriteria(String criteria) throws Exception {
        Element params = XmlUtil.parseXmlOfString(criteria);
        List list = new ArrayList();
        for (Iterator i = params.elementIterator(); i.hasNext();) {
            Element crition = (Element) i.next();
            Class beanClazz = Class.forName(StringUtils.trim(crition.getName()));
            if (!ClassUtils.isAssignable(beanClazz, DataContainer.class)) {
                if (log.isErrorEnabled()) {
                    log.error(CrmLocaleFactory.getResource("CMS0000073"));
                }
                ExceptionUtil.throwBusinessException("CMS0000073");
            }
            DataContainer dc = (DataContainer) DataContainerFactory.createDataContainerInstance(beanClazz, null);
            for (Iterator j = crition.elementIterator(); j.hasNext();) {
                Element node = (Element) j.next();
                // 如果节点的文本信息为空，则直接跳过
                if (StringUtils.isBlank(node.getText())) {
                    continue;
                }
                // 判断dc是不是一个具体的BOBean类型，如果是则以BOBean对应字段的类型为这个属性的值的数据类型，否则默认为String类型
                if (dc.getType() instanceof ObjectTypeNull) {
                    dc.initProperty(StringUtils.trim(node.getName()), node.getText());
                } else {
                    dc.initProperty(StringUtils.trim(node.getName()), DataType.transfer(node.getText(), dc.getPropertyType(StringUtils.trim(node.getName()))));
                }
            }
            list.add(dc);
        }
        return (DataContainer[]) list.toArray(new DataContainer[0]);
    }
    /**
     *
     * @Function: compareIBOInsxRoamGprsSmsValues
     * @Description: 取固定billId在IBOInsxRoamGprsSmsValue[]中FirstRemindFlag=0或全部的totalVolume的最大值
     *
     * @param:参数描述 firstFlag 1：首次使用
     * @return：返回结果描述
     * @throws：异常描述
     *
     * @version: v1.0.0
     * @author: lisl5
     * @date: 2012-10-12 20:50:30
     *
     * Modification History:
     * Date         Author          Version            Description
     *---------------------------------------------------------*
     * 2012-10-12     lisl5           v1.0.0               修改原因
     */
    public static long compareIBOInsxRoamGprsSmsValues(IBOInsxRoamGprsSmsValue[] values,String billId,int firstFalg){
        long[] totalVolume=new long[]{-1L};
        if(values!=null&&values.length>0){
            for(int i=0;i<values.length;i++){
                if(billId.equals(values[i].getBillId())&&firstFalg==0){
                    if(values[i].getFirstRemindFlag()==0){
                        Arrays.copyOf(totalVolume, totalVolume.length+1);
                        totalVolume[totalVolume.length-1]=values[i].getTotalVolume();
                    }
                }else if(billId.equals(values[i].getBillId())){
                    Arrays.copyOf(totalVolume, totalVolume.length+1);
                    totalVolume[totalVolume.length-1]=values[i].getTotalVolume();
                }

            }
            Arrays.sort(totalVolume);
        }
        return totalVolume[totalVolume.length-1];
    }

    /**
     * @Function: getYYYYMM
     * @Description: 根据Timestamp获得时间格式：yyyy-MM的字符串
     *
     * @param:Timestamp ts
     * @return：String
     * @throws：异常描述
     *
     * @version: v1.0.0
     * @author: zhouwu
     * @date: Nov 13, 2012 7:15:30 PM
     *
     * Modification History:
     * Date         Author          Version            Description
     *---------------------------------------------------------*
     * Nov 13, 2012      zhouwu           v1.0.0               修改原因
     */
    public static String getYYYYMM(Timestamp ts) {
        Date date = new Date(ts.getTime());
        SimpleDateFormat sf = new SimpleDateFormat("yyyy-MM");
        return sf.format(date);
    }

    /**
     * @Function: getFloat
     * @Description: 获得制定精度的浮点数
     *
     * @param:newScale 精度,f 浮点数
     * @return：float
     * @throws：异常描述
     *
     * @version: v1.0.0
     * @author: zhouwu
     * @date: Nov 30, 2012 4:31:40 PM
     *
     * Modification History:
     * Date         Author          Version            Description
     *---------------------------------------------------------*
     * Nov 30, 2012      zhouwu           v1.0.0               修改原因
     */
    public static float getFloat(int newScale, float f) {
        return BigDecimal.valueOf(f).setScale(newScale, BigDecimal.ROUND_HALF_UP).floatValue();
    }

    /**
     * 判断基本策划是否是便利卡策划
     * true:是，false: 不是
     * @author anwx@asiainfo-linkage.com @ 2012-12-28
     *
     * @param baseOfferId
     * @return
     * @throws RemoteException
     * @throws Exception
     *
     */
    public static boolean checkBaseOfferIsBLKKind(long baseOfferId) throws RemoteException, Exception {
        boolean flag = false;
		/*IItemRelatValue[] itemValue = SoServiceFactory.getCrmProductServce().getItemRelatByItemIdAndRelatKind(baseOfferId,
				ProdItemRelatKindEnum.OFFER_PLAN_INCLUDED_OFFER_KIND.getName());
		if (null!=itemValue && itemValue.length>0) {
			for (int i = 0; i < itemValue.length; i++) {
				if (itemValue[i].getRelatProductItemId()==200000000094L) {
					flag = true;
					break;
				}
			}
		}*/

        return flag;
    }

    /**
     * @Description: 判断当前号是否归属代销商组织
     *
     * @param billId
     * @return
     * @throws RemoteException
     * @throws Exception
     *
     * @version: v1.0.0
     * @author:  MAJUN
     * @date: 2013-1-23 下午07:22:29
     *
     * Modification History:
     * Date         Author          Version            Description
     *---------------------------------------------------------*
     * 2013-1-23      MAJUN           v1.0.0               修改原因
     */
    public static boolean checkAgentOrganize(String billId) throws RemoteException, Exception {

        IInsUserValue insUserValue = InsServiceFactory.getInstanceQueryService().getInstUserByBillId(billId);
        IBOSecOrganizeValue organizeValue = OrgmodelClient.getOrganizeByOrgId(insUserValue.getCreateOrgId());

        //判断是否归属代销商组织
        if(organizeValue!=null && organizeValue.getOrgRoleTypeId() == 90102L){
            return true;
        }

        return false;
    }

    /**
     * @Function: RBossUtil.java
     * @Description: 调计费接口开关
     *
     * @return
     * @throws RemoteException
     * @throws Exception
     * @return：返回结果描述
     * @throws：异常描述
     *
     * @version: v1.0.0
     * @author: yaojx
     * @date: May 19, 2014 3:27:31 PM
     *
     * Modification History:
     * Date         Author          Version            Description
     *---------------------------------------------------------*
     * May 19, 2014     yaojx           v1.0.0               修改原因
     */
    public static boolean billingCtrl()throws RemoteException, Exception {
        boolean sendFlag = true;
        IBOBsStaticDataValue[] busiOperData = StaticDataUtil.getStaticData("SO_BILL_CONTROL");
        if(busiOperData!=null && busiOperData.length>0){
            if ("-1".equals(busiOperData[0].getCodeValue()))
                sendFlag = false;
        }
        return sendFlag;
    }


    public static boolean SapCtrl()throws RemoteException, Exception {
        boolean sendFlag = true;
        IBOBsStaticDataValue[] busiOperData = StaticDataUtil.getStaticData("SO_SAP_CONTROL");
        if(busiOperData!=null && busiOperData.length>0){
            if ("-1".equals(busiOperData[0].getCodeValue()))
                sendFlag = false;
        }
        return sendFlag;
    }


    public static boolean sap169Ctrl()throws RemoteException, Exception {
        boolean sendFlag = true;
        IBOBsStaticDataValue[] busiOperData = StaticDataUtil.getStaticData("SO_CR169_CONTROL");
        if(busiOperData!=null && busiOperData.length>0){
            if ("-1".equals(busiOperData[0].getCodeValue()))
                sendFlag = false;
        }
        return sendFlag;
    }
    public static boolean validateIotBillIdCtrl()throws RemoteException, Exception {
        boolean validateFlag = true;
        IBOBsStaticDataValue[] busiOperData = StaticDataUtil.getStaticData("IOT_VALIDATE_CONTROL");
        if(busiOperData!=null && busiOperData.length>0){
            if ("Y".equals(busiOperData[0].getCodeValue()))
                validateFlag = false;
        }
        return validateFlag;
    }

    /**
     * order summary switch
     * @param controlKey
     * @return
     * @throws Exception
     */
    public static boolean getOrderSummaryCtrl(String controlKey) throws Exception {
        boolean summaryControl = false;
        IBOBsStaticDataValue[] staiticValues = StaticDataUtil.getStaticData(controlKey);
        if(staiticValues != null && staiticValues.length > 0 && "Y".equals(staiticValues[0].getCodeValue())) {
            summaryControl = true;
        }
        return summaryControl;
    }
    /**
     * NP batch cr switch
     * @param controlKey
     * @return
     * @throws Exception
     */
    public static boolean getNpBatchCRCtrl(String controlKey) throws Exception {
        boolean control = false;
        IBOBsStaticDataValue[] staiticValues = StaticDataUtil.getStaticData(controlKey);
        if(staiticValues != null && staiticValues.length > 0 && "Y".equals(staiticValues[0].getCodeValue())) {
            control = true;
        }
        return control;
    }
    public static boolean getSaveEshopSingleOrderCtrl(String controlKey) throws Exception {
        boolean saveEshopSingleOrderCtrl = false;
        IBOBsStaticDataValue[] staiticValues = StaticDataUtil.getStaticData(controlKey);
        if(staiticValues != null && staiticValues.length > 0 && "Y".equals(staiticValues[0].getCodeValue())) {
            saveEshopSingleOrderCtrl = true;
        }
        return saveEshopSingleOrderCtrl;
    }
    /**
     * CR开关控制
     * 没配或非Y表示关闭
     * 配Y表示打开
     * @param controlKey
     * @return
     * @throws Exception
     */
    public static boolean getCRCtrl(String controlKey) throws Exception {
        boolean control = false;
        IBOBsStaticDataValue[] staiticValues = StaticDataUtil.getStaticData(controlKey);
        if(staiticValues != null && staiticValues.length > 0 && "Y".equals(staiticValues[0].getCodeValue())) {
            control = true;
        }
        return control;
    }
    /**
     * @Description: CVS-52 switch
     * @return boolean
     * @author Yan_zt
     * @date 2023/2/16 15:23
     */
//    public static boolean getCVS52Ctrl() throws Exception {
//        boolean cvs52Control = false;
//        IBOBsStaticDataValue[] staiticValues = StaticDataUtil.getStaticData(RBossConst.CVS_52_SWITCH);
//        if(staiticValues != null && staiticValues.length > 0 && RBossConst.SO_Yes.equals(staiticValues[0].getCodeValue())) {
//            cvs52Control = true;
//        }
//        return cvs52Control;
//    }

    /**
     * @Description: 根据codeType查询codeValue
     * @param codeType
     * @return String
     * @author Yan_zt
     * @date 2023/2/20 17:49
     */
    public static String getCodeValue(String codeType) throws Exception{
        IBOBsStaticDataValue[] staiticValues = StaticDataUtil.getStaticData(codeType);
        if(staiticValues != null && staiticValues.length > 0) {
            return staiticValues[0].getCodeValue();
        }
        return null;
    }
    /**
     * 调用billing tariff 接口开关控制
     * @return
     * @throws Exception
     */
    public static boolean getCallTarifferInfoFormBillingCtrl() throws Exception {
        boolean swhichControl = false;
        IBOBsStaticDataValue[] staiticValues = StaticDataUtil.getStaticData("CALL_TARIFF_FROM_BILLING_SWITCH");
        if(staiticValues != null && staiticValues.length > 0 && RBossConst.SO_Yes.equals(staiticValues[0].getCodeValue())) {
            swhichControl = true;
        }
        return swhichControl;
    }

    public static boolean DM002Ctrl()throws RemoteException, Exception {
        boolean sendFlag = false;
        IBOBsStaticDataValue[] busiOperData = StaticDataUtil.getStaticData("SO_NEW_BB_DM002");
        if(busiOperData!=null && busiOperData.length>0){
            if (RBossConst.SO_Yes.equals(busiOperData[0].getCodeValue()))
                sendFlag = true;
        }
        return sendFlag;
    }

    public static boolean SwitchDM002Ctrl()throws RemoteException, Exception {
        boolean sendFlag = true;
        IBOBsStaticDataValue[] busiOperData = StaticDataUtil.getStaticData("SO_DSL_SWITCH_DM002");
        if(busiOperData!=null && busiOperData.length>0){
            if (RBossConst.SO_No.equals(busiOperData[0].getCodeValue()))
                sendFlag = false;
        }
        return sendFlag;
    }

    public static boolean TransactCtrl()throws RemoteException, Exception {
        boolean sendFlag = true;
        IBOBsStaticDataValue[] busiOperData = StaticDataUtil.getStaticData("SO_TRANSACT_CONTROL");
        if(busiOperData!=null && busiOperData.length>0){
            if ("-1".equals(busiOperData[0].getCodeValue()))
                sendFlag = false;
        }
        return sendFlag;
    }

    public static boolean NPCtrl()throws RemoteException, Exception {
        boolean sendFlag = true;
        IBOBsStaticDataValue[] busiOperData = StaticDataUtil.getStaticData("SO_NP_CONTROL");
        if(busiOperData!=null && busiOperData.length>0){
            if ("-1".equals(busiOperData[0].getCodeValue()))
                sendFlag = false;
        }
        return sendFlag;
    }

    public static boolean OseXdslNpCtrl()throws RemoteException, Exception {
        boolean sendFlag = true;
        IBOBsStaticDataValue[] busiOperData = StaticDataUtil.getStaticData("SO_OSE_XDSL_NP_CONTROL");
        if(busiOperData!=null && busiOperData.length>0){
            if (RBossConst.SO_No.equals(busiOperData[0].getCodeValue()))
                sendFlag = false;
        }
        return sendFlag;
    }

    public static boolean AdjustMultiBillCtrl()throws RemoteException, Exception {
        boolean sendFlag = true;
        IBOBsStaticDataValue[] busiOperData = StaticDataUtil.getStaticData("SO_AJUSTBILL_CONTROL");
        if(busiOperData!=null && busiOperData.length>0){
            if ("-1".equals(busiOperData[0].getCodeValue()))
                sendFlag = false;
        }
        return sendFlag;
    }
    /***
     * 根据addon号码获取其主号码路由的regionId,如果传入主号码，则返回主号码的regionId
     * @param addOnNum
     * @return
     * @throws Exception
     * @throws RemoteException
     */
    public static String getCauRegionByBillid(String billId)throws Exception,RemoteException{
        String regionId = CenterUtil.getRegionIdByBillId(billId);
        if (org.apache.commons.lang.StringUtils.isNotBlank(regionId)) {
            return regionId;
        }
        IBOBsStaticDataValue[] addonAttrCodeDates = StaticDataUtil.getStaticData(RBossConst.SO_ADD_ON_ATTR_CODE);
        if(addonAttrCodeDates!=null&&addonAttrCodeDates.length>0){
            for(int i=0;i<addonAttrCodeDates.length;i++){
                IInsSrvAttrIdxSV serv = (IInsSrvAttrIdxSV)ServiceFactory.getService(IInsSrvAttrIdxSV.class);
                IBOInsSrvAttrIdxValue[] insSrvAttrIdxValues = serv.getInsSrvAttrIdxByAttrIdAndAttrValue(addonAttrCodeDates[i].getCodeValue(),billId);
                if(insSrvAttrIdxValues!=null&&insSrvAttrIdxValues.length>0){
                    return insSrvAttrIdxValues[0].getRegionId();
                }
            }
        }else {
            return regionId;
        }
        return regionId;
    }

    public static boolean isViceBillIdCancel(String billId)throws Exception,RemoteException{
        IBOBsStaticDataValue[] addonAttrCodeDates = StaticDataUtil.getStaticData(RBossConst.SO_ADD_ON_ATTR_CODE);
        if(addonAttrCodeDates!=null&&addonAttrCodeDates.length>0){
            for(int i=0;i<addonAttrCodeDates.length;i++){
                IInsSrvAttrIdxSV serv = (IInsSrvAttrIdxSV)ServiceFactory.getService(IInsSrvAttrIdxSV.class);
                IBOInsSrvAttrIdxValue[] insSrvAttrIdxValues = serv.getInsSrvAttrIdxByAttrIdAndAttrValue(addonAttrCodeDates[i].getCodeValue(),billId);
                if(insSrvAttrIdxValues!=null&&insSrvAttrIdxValues.length>0){
                    return false;
                }
            }
        }
        return true;
    }
    public static IInsOfferValue getOfferInstInfoByViceBill(String billId)throws Exception,RemoteException{
//    	String regionId = CenterUtil.getRegionIdByBillId(billId);
        IInsOfferValue iInsOfferValue = null;
        IBOBsStaticDataValue[] addonAttrCodeDates = StaticDataUtil.getStaticData(RBossConst.SO_ADD_ON_ATTR_CODE);
        if(addonAttrCodeDates!=null&&addonAttrCodeDates.length>0){
            for(int i=0;i<addonAttrCodeDates.length;i++){
                IInsSrvAttrIdxSV serv = (IInsSrvAttrIdxSV)ServiceFactory.getService(IInsSrvAttrIdxSV.class);
                IBOInsSrvAttrIdxValue[] insSrvAttrIdxValues = serv.getInsSrvAttrIdxByAttrIdAndAttrValue(addonAttrCodeDates[i].getCodeValue(),billId);
                if(insSrvAttrIdxValues!=null&&insSrvAttrIdxValues.length>0){
                    for(IBOInsSrvAttrIdxValue insSrvAttrIdxValue :insSrvAttrIdxValues){
                        long offerInstId = insSrvAttrIdxValue.getOfferInstId();
                        long userId = insSrvAttrIdxValue.getUserId();
                        iInsOfferValue = SoServiceFactory.getInstanceQrySV().getInsOfferByUserIdAndInsOfferId(offerInstId, userId, OrderConst.VALID_TYPE_NOW);
                        if(null != iInsOfferValue){
                            return iInsOfferValue;
                        }
                    }
                }
            }
        }
        return iInsOfferValue;
    }

    /**
     * 根据副号码查询主用户insUser信息
     * @param billId
     * @return
     * @throws Exception
     * @throws RemoteException
     */
    public static IInsUserValue getInsUserByViceBillId(String billId)throws Exception,RemoteException{
        IBOBsStaticDataValue[] addonAttrCodeDates = StaticDataUtil.getStaticData(RBossConst.SO_ADD_ON_ATTR_CODE);
        if(addonAttrCodeDates!=null&&addonAttrCodeDates.length>0){
            for(int i=0;i<addonAttrCodeDates.length;i++){
                IInsSrvAttrIdxSV serv = (IInsSrvAttrIdxSV)ServiceFactory.getService(IInsSrvAttrIdxSV.class);
                IBOInsSrvAttrIdxValue[] insSrvAttrIdxValues = serv.getInsSrvAttrIdxByAttrIdAndAttrValue(addonAttrCodeDates[i].getCodeValue(),billId);
                if(insSrvAttrIdxValues!=null&&insSrvAttrIdxValues.length>0){
                    long userId = insSrvAttrIdxValues[0].getUserId();
                    IInsUserValue[] insValue = SoServiceFactory.getInstanceQrySV().getInstUserByUserId(userId, OrderConst.VALID_TYPE_NOW);
                    if(insValue!=null&&insValue.length>0)
                        return insValue[0];
                }
            }
        }else {
            return null;
        }
        return null;
    }
    /**
     * 根据对端运营商编码获取其邮箱地址
     * @param currentSp
     * @return
     * @throws Exception
     * @throws RemoteException
     */
    public static String getEmailByOperatorId(String currentSp)throws Exception,RemoteException{
        IBOBsStaticDataValue[] operatorEmailDatas = StaticDataUtil.getStaticData(currentSp);
        if(operatorEmailDatas!=null&&operatorEmailDatas.length>0)
            return operatorEmailDatas[0].getCodeValue();
        return "";
    }


    public static boolean isBaseOfferByOfferType(String offerType) throws RemoteException, Exception {
        boolean rtn=false;
        if(offerType.contains("OFFER_PLAN_GSM")){
            rtn=true;
        }
        return rtn;
    }

    public static boolean isBaseOfferByOfferId(long offerId) throws RemoteException, Exception {
        boolean rtn=false;
        IProduct2CrmSV productFSV = (IProduct2CrmSV) ServiceFactory.getService(IProduct2CrmSV.class);
        IOfferValue offerValue=productFSV.getOfferById(offerId);
        if(offerValue!=null){
            rtn=isBaseOfferByOfferType(offerValue.getOfferType());
        }
        return rtn;
    }

    public static boolean PSTNNPControl()throws RemoteException, Exception {
        boolean sendFlag = true;
        IBOBsStaticDataValue[] busiOperData = StaticDataUtil.getStaticData("SO_PSTN_NP_CONTROL");
        if(busiOperData!=null && busiOperData.length>0){
            if ("-1".equals(busiOperData[0].getCodeValue()))
                sendFlag = false;
        }
        return sendFlag;
    }

    public static boolean cr17Control()throws RemoteException, Exception {
        boolean sendFlag = true;
        IBOBsStaticDataValue[] busiOperData = StaticDataUtil.getStaticData("SO_CR17_CONTROL");
        if(busiOperData!=null && busiOperData.length>0){
            if ("-1".equals(busiOperData[0].getCodeValue()))
                sendFlag = false;
        }
        return sendFlag;
    }

    public static boolean cr88Control()throws RemoteException, Exception {
        boolean sendFlag = true;
        IBOBsStaticDataValue[] busiOperData = StaticDataUtil.getStaticData("SO_CR88_CONTROL");
        if(busiOperData!=null && busiOperData.length>0){
            if ("-1".equals(busiOperData[0].getCodeValue()))
                sendFlag = false;
        }
        return sendFlag;
    }

    /**
     * 判断扩展属性是否为空
     * @param ordCustExtValues
     * @param attrCode
     * @return
     * @throws Exception
     * @throws RemoteException
     * @version: v1.0.0
     * @date: 2014-6-13
     */
    public static boolean isCustExtBlank(IOrdCustExtValue[] ordCustExtValues,String attrCode) throws Exception,RemoteException {
        boolean rtn = true;
        for(int i=0;ordCustExtValues!=null && i<ordCustExtValues.length;i++){
            IOrdCustExtValue ordCustExtValue=ordCustExtValues[i];
            if(StringUtils.equals(ordCustExtValue.getAttrCode(),attrCode) && !StringUtils.isBlank(ordCustExtValue.getAttrValue())){
                rtn = false;
            }
        }
        return rtn;
    }
    /**
     * 判断扩展属性是否为空
     * @param ordCustExtValues
     * @param attrCode
     * @return
     * @throws Exception
     * @throws RemoteException
     * @version: v1.0.0
     * @date: 2014-6-13
     */
    public static boolean isFutureOrder(IOrdCustExtValue[] ordCustExtValues,String attrCode) throws Exception,RemoteException {
        boolean rtn = false;
        for(int i=0;ordCustExtValues!=null && i<ordCustExtValues.length;i++){
            IOrdCustExtValue ordCustExtValue=ordCustExtValues[i];
            if(StringUtils.equals(ordCustExtValue.getAttrCode(),attrCode) && (StringUtils.equals(ordCustExtValue.getAttrValue(), RBossConst.HANDSET_PRE_ORDER) || StringUtils.equals(ordCustExtValue.getAttrValue(), RBossConst.HANDSET_FUTURE_ORDER))){
                rtn = true;
                break;
            }
        }
        return rtn;
    }
    /**
     * 判断扩展属性是否为空
     * @param ordCustExtValues
     * @param attrCode
     * @return
     * @throws Exception
     * @throws RemoteException
     * @version: v1.0.0
     * @date: 2014-6-13
     */
    public static boolean isFutureOrder(ISoOrderData soOrderData) throws Exception,RemoteException {
        boolean rtn = false;
        if(soOrderData!=null){
            DataContainerInterface[] dataContainerInterface = soOrderData.getNormalRowsetInfo("tblNormal_customer_order_ext_info");
            if(dataContainerInterface != null && dataContainerInterface.length > 0){
                for (DataContainerInterface dc : dataContainerInterface) {
//					String singleOrderType = dc.getAsString(RBossConst.HANDSET_ORDER_TYPE);
                    String handsetOrderType = dc.getAsString("ATTR_CODE");
                    String singleOrderType = dc.getAsString("ATTR_VALUE");
                    if(StringUtils.isNotBlank(handsetOrderType) &&
                            StringUtils.equals(handsetOrderType, RBossConst.HANDSET_ORDER_TYPE) &&
                            (StringUtils.equals(singleOrderType, RBossConst.HANDSET_PRE_ORDER) || StringUtils.equals(singleOrderType, RBossConst.HANDSET_FUTURE_ORDER))){

                        return true;
                    }
                }
            }
        }
        return rtn;
    }

    /**
     * 根据用户获取扩展属性
     * @param customerOrderId
     * @param userId
     * @return
     * @throws Exception
     * @throws RemoteException
     * @version: v1.0.0
     * @date: 2014-8-15
     */
    public static IOrdCustExtValue[] getCustExts(long customerOrderId,long userId) throws Exception,RemoteException {

        IFixedLineSV fixedlineSV = (IFixedLineSV)ServiceFactory.getService(IFixedLineSV.class);
        IOrdCustExtValue[] ordCustExtValues=fixedlineSV.getOrderCustExts(customerOrderId);
        return ordCustExtValues;
    }

    public static String getCustExtAttrValue(long customerOrderId,String attrCode) throws Exception,RemoteException {

        IFixedLineSV fixedlineSV = (IFixedLineSV)ServiceFactory.getService(IFixedLineSV.class);
        IOrdCustExtValue[] ordCustExtValues=fixedlineSV.getOrderCustExts(customerOrderId);
        for(int i=0;ordCustExtValues!=null && i<ordCustExtValues.length;i++){
            IOrdCustExtValue ordCustExtValue=ordCustExtValues[i];
            if(StringUtils.equals(ordCustExtValue.getAttrCode(),attrCode)){
                return ordCustExtValue.getAttrValue();
            }
        }
        return "";
    }

    public static boolean fmcCtrl()throws RemoteException, Exception {
        boolean sendFlag = true;
        IBOBsStaticDataValue[] busiOperData = StaticDataUtil.getStaticData("SO_FMC_CONTROL");
        if(busiOperData!=null && busiOperData.length>0){
            if ("N".equals(busiOperData[0].getCodeValue()))
                sendFlag = false;
        }
        return sendFlag;
    }

    /**
     * custGroup客户群业务开关
     * @author huanglun
     * @date 2018年9月6日 下午2:26:55
     * @return
     * @throws RemoteException
     * @throws Exception
     */
    public static boolean fmcCustGroupCtrl()throws RemoteException, Exception {
        boolean sendFlag = true;
        IBOBsStaticDataValue[] busiOperData = StaticDataUtil.getStaticData("SO_FMC_CUST_GROUP_CONTROL");
        if(busiOperData!=null && busiOperData.length>0){
            if ("N".equals(busiOperData[0].getCodeValue()))
                sendFlag = false;
        }
        return sendFlag;
    }

    public static boolean fmcPushCCtrl()throws RemoteException, Exception {
        boolean sendFlag = true;
        IBOBsStaticDataValue[] busiOperData = StaticDataUtil.getStaticData("FMC_PUSHC_CONTROL");
        if(busiOperData!=null && busiOperData.length>0){
            if ("N".equals(busiOperData[0].getCodeValue()))
                sendFlag = false;
        }
        return sendFlag;
    }

    public static boolean fmcAgrCtrl()throws RemoteException, Exception {
        boolean sendFlag = true;
        IBOBsStaticDataValue[] busiOperData = StaticDataUtil.getStaticData("FMC_AGR_CONTROL");
        if(busiOperData!=null && busiOperData.length>0){
            if ("N".equals(busiOperData[0].getCodeValue()))
                sendFlag = false;
        }
        return sendFlag;
    }

    /**
     * CR127开关(未配置  或者 配置为N 表示关闭CR127)
     * @return
     * @throws RemoteException
     * @throws Exception
     */
    public static boolean fmcCR127Ctrl()throws RemoteException, Exception {
        boolean sendFlag = true;
        IBOBsStaticDataValue[] busiOperData = StaticDataUtil.getStaticData("SO_CR127_CONTROL");
        if(busiOperData==null || busiOperData.length == 0){
            sendFlag = false;
        }else if(busiOperData!=null && busiOperData.length>0){
            if ("N".equals(busiOperData[0].getCodeValue()))
                sendFlag = false;
        }
        return sendFlag;
    }

    /**
     * CR57 email校验业务开关
     * @return
     * @throws RemoteException
     * @throws Exception
     */
    public static boolean emailWhiteListsCtrl()throws RemoteException, Exception {
        //bs_static_data表的code_value字段值为1代表开关打开，其他值，开关关闭
        boolean sendFlag = false;
        IBOBsStaticDataValue[] busiOperData = StaticDataUtil.getStaticData("SO_EMAILWHITELISTS_CONTROL");
        if(busiOperData!=null && busiOperData.length>0){
            if ("1".equals(busiOperData[0].getCodeValue()))
                sendFlag = true;
        }
        return sendFlag;
    }

    /**
     *
     * <p>Title: buildOrdCustExt</p>
     * <p>Description: </p>
     * @param aOrdCustValue
     * @param attrCode
     * @param attrValue
     * @return
     * @throws AIException
     * @throws Exception
     * @author YangJie
     * @date 2018年12月24日
     * @version SR 0.83
     */
    public static IOrdCustExtValue buildOrdCustExt(IOrdCustValue aOrdCustValue,String attrCode, String attrValue) throws AIException, Exception {
        IOrdCustExtValue aOrdCustExtValue = new OrdCustExtBean();
        aOrdCustExtValue.setAttrCode(attrCode);
        aOrdCustExtValue.setAttrValue(attrValue);
        aOrdCustExtValue.setAttrName(attrCode);
        aOrdCustExtValue.setCustOrderExtId(SoServiceFactory.getOrderCustExtSV().getOrdCustExtExtNewId());
        aOrdCustExtValue.setCustomerOrderId(aOrdCustValue.getCustomerOrderId());
        aOrdCustExtValue.setRegionId(aOrdCustValue.getCustRegionId());
        aOrdCustExtValue.setState(OrderConst.DATA_NEW_STATE);
        aOrdCustExtValue.setOrderState(OrderConst.DATA_NEW_STATE);
        aOrdCustExtValue.setOpId(SessionManager.getUser().getID());
        aOrdCustExtValue.setOrgId(SessionManager.getUser().getOrgId());
        aOrdCustExtValue.setEffectiveDate(aOrdCustValue.getEffectiveDate());
        aOrdCustExtValue.setExpireDate(aOrdCustValue.getExpireDate());
        return aOrdCustExtValue;
    }

    public static boolean isGeneralOttProduct(long productId)throws Exception{

        IProduct2CrmSV sv = (IProduct2CrmSV)ServiceFactory.getService(IProduct2CrmSV.class);
        IUpItemFeatureValue itemFeature = sv.getItemFeatureByProdAndFeatureId(productId, 2700336L);
        if(itemFeature !=null && StringUtils.isNotBlank(itemFeature.getFeatureValue())){

            return true;
        }
        return false;
    }

    public static boolean fmcAmountAuditCtrl()throws RemoteException, Exception {
        boolean sendFlag = true;
        IBOBsStaticDataValue[] busiOperData = StaticDataUtil.getStaticData("SO_VALIDAMOUNTAUDIT_CONTROL");
        if(busiOperData==null || busiOperData.length == 0){
            sendFlag = false;
        }else if(busiOperData!=null && busiOperData.length>0){
            if ("N".equals(busiOperData[0].getCodeValue()))
                sendFlag = false;
        }
        return sendFlag;
    }


    public static boolean isLikeCBBSO(String recSp) throws Exception {
        boolean isLikeCBBNO = false;
        IBOBsStaticDataValue cbbSpValue = StaticDataUtil.getStaticData("SO_NP_SERVICE_CBB_OPERATOR_CODE_TN", recSp);
        if(cbbSpValue!=null) {

            isLikeCBBNO = true;
        }
        return isLikeCBBNO;
    }


    public static int iotB2BEshopDealCount() throws Exception {
        IBOBsStaticDataValue[] attrValues = StaticDataUtil.getStaticData("B2B_ESHOP_IOT_BATCH_DEAL_COUNT");
        if(attrValues !=null && attrValues.length>0) {
            return Integer.parseInt(attrValues[0].getCodeValue());
        }
        return 100;
    }

    public static int b2bEshopHandseOfferCount() throws Exception {
        IBOBsStaticDataValue[] attrValues = StaticDataUtil.getStaticData("B2B_ESHOP_HANDSET_OFFER_GROUP_COUNT");
        if(attrValues !=null && attrValues.length>0) {
            return Integer.parseInt(attrValues[0].getCodeValue());
        }
        return 2;
    }

    /**
     * 根据offerId判断是否是配件
     * @return
     * @throws Exception
     * @throws PceException
     * @throws RemoteException
     */
    public static boolean judgeIsAccessoriesByOfferId(long offerId) throws RemoteException, PceException, Exception{
        IProductFSV productSV = (IProductFSV) ServiceFactory.getService(IProductFSV.class);
        ICrmProductSV ICrmProductSV = (ICrmProductSV) ServiceFactory.getService(ICrmProductSV.class);
        IOfferRelatProductValue[] offerRelatProducts = productSV.getProductByOfferId(offerId);
        if(offerRelatProducts != null){
            for (int i = 0; i < offerRelatProducts.length; i++) {
                long upcResId = 0;
                if ( null!=offerRelatProducts[i].getProductValue() && offerRelatProducts[i].getProductValue().getExtendId()>0 ){
                    upcResId = offerRelatProducts[i].getProductValue().getExtendId();
                    //资源上的特征：990200000009
                    IUpItemFeatureValue itemFeatureValueResource = ICrmProductSV.getItemFeatureByProdAndFeatureId(upcResId, 990200000009L);
                    IUpItemFeatureValue itemFeatureValueResource1 = ICrmProductSV.getItemFeatureByProdAndFeatureId(upcResId, 990100000012L);

                    if (null != itemFeatureValueResource) {
                        String resourceType = itemFeatureValueResource.getFeatureValue();
                        //102:Accessories
                        if ("102".equals(resourceType)){
                            if (null != itemFeatureValueResource1) {
                                String resourceType1 = itemFeatureValueResource1.getFeatureValue();
                                //102:Accessories
                                if ("Y".equals(resourceType1)){

                                    return false;
                                }
                            }
                            return true;
                        }
                    }
                }
            }
        }
        return false;
    }

    /**
     * 获取操作员的channelType，判断是否来自ose
     * @return
     * @throws Exception
     */
    public static boolean judgeOSEChannel() throws Exception {
        Object channelTypeObj = SessionManager.getUser().get(RBossConst.PUBINFO_CHANNEL_TYPE);
        String channelType = new String(ResConst.RES_CHANNEL_NORMAL);
        if (channelTypeObj != null) {
            channelType = channelTypeObj.toString();
        }
        if(RBossConst.SO_CHANNEL_RETAILER_OSE.equals(channelType) || RBossConst.SO_CHANNEL_POINT_OF_SALES.equals(channelType)
                || RBossConst.SO_CHANNEL_ESHOP.equals(channelType) || RBossConst.SO_CHANNEL_SELFCARE.equals(channelType) || RBossConst.SO_CHANNEL_EXTERNAL_DEALER.equals(channelType)){
            return true;
        }else {
            return false;
        }
    }
    /**
     * 将文件导入的groupid，解析map
     * @param offerNegotiateGroupId(offer1:group1,offer2:group2,offer3:group3)
     * @return
     * @throws Exception
     */
    public static HashMap getGroupId(String offerNegotiateGroupId)throws Exception {
        HashMap m = new HashMap();
        if(StringUtils.isNotBlank(offerNegotiateGroupId)) {
            String[] offerGroupId = offerNegotiateGroupId.split(",");
            for(int i=0;i<offerGroupId.length;i++) {
                String[] offerIdGroupId = offerGroupId[i].split(":");
                if(offerIdGroupId.length==2) {
                    m.put(Long.parseLong(offerIdGroupId[0]), offerIdGroupId[1]);
                }
                if(offerIdGroupId.length==1) {//合同级，没有指定groupid
                    m.put(Long.parseLong(offerIdGroupId[0]), "");
                }
            }
        }
        return m;
    }
    /**
     * 根据文件导入的group id，查询议价
     * @param custId
     * @param agrId
     * @param groupIdMap
     * @param offerData
     * @throws Exception
     */
    public static void setNegotiateFee(long custId,long agrId,HashMap groupIdMap,IBceData offerData[]) throws Exception {
        if(agrId>0) {
            IAgreementFSV agreementFsv=(IAgreementFSV)ServiceFactory.getService(IAgreementFSV.class);
            for (int i = 0; i < offerData.length; i++) {
                SoOfferData soOfferData2 = (SoOfferData) offerData[i];
                ISoRoleData soRoleData[] = soOfferData2.getSoRoleData();
                if(!groupIdMap.containsKey(soOfferData2.getOfferId())) {
                    continue;
                }
                String groupId = String.valueOf(groupIdMap.get(soOfferData2.getOfferId()));
                String negotiateFee = "";
                IBOAgrOfferRlaHValue[] rals = agreementFsv.getOfferBargainParamsByGroupId(custId, agrId, soOfferData2.getOfferId(),groupId);
                if (null != rals && rals.length >0) {
                    for(IBOAgrOfferRlaHValue ral : rals){
                        if(ral.getAttrId() == 0){
                            continue;
                        }
                        IAttributeValue at = SoServiceFactory.getCrmProductServce().getAttrbuteByAttributeId(ral.getAttrId());
                        if(at==null){
                            continue;
                        }
                        negotiateFee = String.valueOf(ral.getRcValue());
                    }
                }else {
                    groupIdMap.remove(soOfferData2.getOfferId());//文件输入的group，在合同不存在，使用页面的group
                    continue;
                }
                String licenseNumber = getLicenseNumberByOfferData(soOfferData2);
                if(StringUtils.isNotBlank(licenseNumber)) {
                    String licenseRc = getLicenseOfferRcByFormula(StringUtils.isNotBlank(negotiateFee)?Long.parseLong(negotiateFee):-1, soOfferData2.getOfferId(), agrId, licenseNumber);
                    if(StringUtils.isNotBlank(licenseRc)) {
                        negotiateFee = licenseRc;
                    }
                }
                boolean hasGroupAttr = false;
                ISoAttrData groupAttr = null;
                for (int z = 0; z < soRoleData.length; z++) {
                    ISoUserData soUserData[] = soRoleData[z].getSoUserData();
                    for (int k = 0; k < soUserData.length; k++) {
                        ISoServicePkgData soServicePkgData[] = soUserData[k].getSoServicePkgData();
                        for (int j = 0; j < soServicePkgData.length; j++) {
                            ISoServiceData soServiceData[] = soServicePkgData[j].getServiceData();
                            for (int y = 0; y < soServiceData.length; y++) {
                                ISoAttrData attrData[]  = soServiceData[y].getServiceAttrDatas();
                                for (int t = 0; t < attrData.length; t++) {
                                    if(groupAttr==null&&attrData[t].getAttrId()==RBossConst.SO_NEGTIATION_MEASUREMENT_FEE_ATTR) {
                                        groupAttr = new SoAttrData();
                                        groupAttr.setEffType(attrData[t].getEffType());
                                        groupAttr.setExpireDate(attrData[t].getExpireDate());
                                        groupAttr.setState(attrData[t].getState());
                                        groupAttr.setValidDate(attrData[t].getValidDate());
                                    }
                                    if (attrData[t].getAttrId() == RBossConst.SO_NEGTIATION_FEE_ATTR) {
                                        attrData[t].setNewText(negotiateFee);
                                        attrData[t].setNewValue(negotiateFee);
                                    }
                                    if (attrData[t].getAttrId() == RBossConst.SO_NEGTIATION_GROUP_ID_ATTR) {
                                        attrData[t].setNewText(groupId);
                                        attrData[t].setNewValue(groupId);
                                        hasGroupAttr = true;
                                    }
                                }
                            }
                        }
                    }
                }
                if(!hasGroupAttr&&StringUtils.isNotBlank(groupId)) {//文件指定了groupid ,页面没有选择group，报文没有attr,需要构建一个
                    if(groupAttr!=null) {
                        groupAttr.setAttrId(RBossConst.SO_NEGTIATION_GROUP_ID_ATTR);
                        groupAttr.setNewText(groupId);
                        groupAttr.setNewValue(groupId);
                        for (int z = 0; z < soRoleData.length; z++) {
                            ISoUserData soUserData[] = soRoleData[z].getSoUserData();
                            for (int k = 0; k < soUserData.length; k++) {
                                ISoServicePkgData soServicePkgData[] = soUserData[k].getSoServicePkgData();
                                for (int j = 0; j < soServicePkgData.length; j++) {
                                    ISoServiceData soServiceData[] = soServicePkgData[j].getServiceData();
                                    for (int y = 0; y < soServiceData.length; y++) {
                                        ISoAttrData attrData[]  = soServiceData[y].getServiceAttrDatas();
                                        for (int t = 0; t < attrData.length; t++) {
                                            if(attrData[t].getAttrId()==RBossConst.SO_NEGTIATION_MEASUREMENT_FEE_ATTR) {
                                                soServiceData[y].addSubData(groupAttr);
                                                groupAttr.setParentBceData(soServiceData[y]);
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
    }
    public static String getLicenseNumberByOfferData(SoOfferData soOfferData) throws Exception {
        String licenseNumber = "";
        ISoRoleData soRoleData[] = soOfferData.getSoRoleData();
        for (int z = 0; z < soRoleData.length; z++) {
            ISoUserData soUserData[] = soRoleData[z].getSoUserData();
            for (int k = 0; k < soUserData.length; k++) {
                ISoServicePkgData soServicePkgData[] = soUserData[k].getSoServicePkgData();
                for (int j = 0; j < soServicePkgData.length; j++) {
                    ISoServiceData soServiceData[] = soServicePkgData[j].getServiceData();
                    for (int y = 0; y < soServiceData.length; y++) {
                        ISoAttrData attrData[]  = soServiceData[y].getServiceAttrDatas();
                        for (int t = 0; t < attrData.length; t++) {
                            if (attrData[t].getAttrId() == RBossConst.PROD_ATTR_ID_LICENSE_NUM) {
                                licenseNumber = attrData[t].getNewValue();
                            }
                        }
                    }
                }
            }
        }
        return licenseNumber;
    }
    /**
     * 文件没有导入的groupid，根据页面获取
     * @param groupIdMap
     * @param offerData
     * @throws Exception
     */
    public static void setGroupIdByOfferData(HashMap groupIdMap,IBceData offerData[]) throws Exception {
        for (int i = 0; i < offerData.length; i++) {
            SoOfferData soOfferData2 = (SoOfferData) offerData[i];
            ISoRoleData soRoleData[] = soOfferData2.getSoRoleData();
            if(groupIdMap.containsKey(soOfferData2.getOfferId())) {
                continue;
            }
            for (int z = 0; z < soRoleData.length; z++) {
                ISoUserData soUserData[] = soRoleData[z].getSoUserData();
                for (int k = 0; k < soUserData.length; k++) {
                    ISoServicePkgData soServicePkgData[] = soUserData[k].getSoServicePkgData();
                    for (int j = 0; j < soServicePkgData.length; j++) {
                        ISoServiceData soServiceData[] = soServicePkgData[j].getServiceData();
                        for (int y = 0; y < soServiceData.length; y++) {
                            ISoAttrData attrData[]  = soServiceData[y].getServiceAttrDatas();
                            for (int t = 0; t < attrData.length; t++) {
                                if (attrData[t].getAttrId() == RBossConst.SO_NEGTIATION_GROUP_ID_ATTR) {
                                    groupIdMap.put(soOfferData2.getOfferId(), attrData[t].getNewValue());
                                }
                            }
                        }
                    }
                }
            }
            if(!groupIdMap.containsKey(soOfferData2.getOfferId())) {//前台没有选group，attrData没有,指定查询合同级
                groupIdMap.put(soOfferData2.getOfferId(), "");
            }
        }
    }
    /**
     * license offer 根据formula 计算rc
     * @param negotiateRc -1:使用offer原价
     * @param offerId
     * @param agrId
     * @param licenseNumber
     * @return null:不用根据formula计算
     * @throws Exception
     */
    public static String getLicenseOfferRcByFormula(long negotiateRc,long offerId,long agrId,String licenseNumber)throws Exception {
        if(agrId<1) {
            return null;
        }
        String formula = "";
        IAgreementFSV agreementFsv=(IAgreementFSV)ServiceFactory.getService(IAgreementFSV.class);
        IProduct2CrmSV product2CrmSV = (IProduct2CrmSV)ServiceFactory.getService(IProduct2CrmSV.class);
        IUpItemFeatureValue licenseFormula = product2CrmSV.getItemFeatureByProdAndFeatureId(offerId,2700372L);
        if(licenseFormula==null || StringUtils.isBlank(licenseFormula.getFeatureValue())) {
            return null;
        }
        formula = licenseFormula.getFeatureValue().replace(" ", "");//去掉所有空格
        int flag = agreementFsv.getLicenseStaircaseFlag(agrId, offerId);
        if(flag!=1) {//1：开  2：关
            return null;
        }
        if(negotiateRc<0) {//取offer原价计算
            IUpItemFeatureValue feature=product2CrmSV.getItemFeatureByProdAndFeatureId(offerId,200005L);
            negotiateRc = Long.parseLong(feature.getFeatureValue());
        }
        /**
         *  T1|[1,20]|X-0;T2|[21,60]|X-10;T3|[61,120]|X-20
         *	T1|[1,20]|X*1;T2|[21,60]|X*0.9;T3|[61,120]|X*0.8
         */
        String[] t = formula.split(";");
        for(int i=0;i<t.length;i++) {
            String[] detail = t[i].split("\\|");
            String[] numberScope = detail[1].substring(1, detail[1].length()-1).split(",");
            if(Integer.parseInt(numberScope[0])<=Integer.parseInt(licenseNumber) && Integer.parseInt(numberScope[1])>=Integer.parseInt(licenseNumber)) {
                String expression = detail[2].replaceAll("X", String.valueOf(negotiateRc));
                char c = getChar(expression);
                float result = getResult(expression, c);
                if(detail.length == 4 && StringUtils.isNotEmpty(detail[3])) {//配置了保底价格，如：T1|[1,20]|X-0|5配置了5块钱保底
                    float minimumPrice = Float.parseFloat(detail[3])*100;//配置的是元，用分来比较
                    if(result < minimumPrice) {
                        result = minimumPrice;
                    }
                }
                return String.valueOf((long)result);
            }
        }
        return null;
    }

    public static double getLicenseOfferRcByCondition(double rcPrice,long licenseOfferQuantity,long agreementId,long offerId) throws Exception {
        int staircaseFlag;
        IAgreementFSV agreementFSV = (IAgreementFSV) ServiceFactory.getService(IAgreementFSV.class);
        staircaseFlag = agreementFSV.getLicenseStaircaseFlag(agreementId, offerId);
        if (1 == staircaseFlag) {
            IProduct2CrmSV product2CrmSV = (IProduct2CrmSV)ServiceFactory.getService(IProduct2CrmSV.class);
            IUpItemFeatureValue feature = product2CrmSV.getItemFeatureByProdAndFeatureId(offerId,2700372L);
            String staircaseFutureValue = feature.getFeatureValue();
            if (StringUtils.isNotBlank(staircaseFutureValue)) {
                return calculateLicenseOfferRc(rcPrice,licenseOfferQuantity,staircaseFutureValue);
            }
        }
        return rcPrice;
    }

    public static double calculateLicenseOfferRc(double rcPrice,long licenseOfferQuantity,String rcFormula)throws Exception {
        String [] resultByComma = rcFormula.split(";");
        for(String item : resultByComma) {
            String [] resultByVerticalLine = item.split("\\|");
            String secondTempString = resultByVerticalLine[1].replace("[","").replace("]","");
            String [] secondTempNumberString = secondTempString.split(",");
            int[]  secondTempNumberInt = new int[]{Integer.parseInt(secondTempNumberString[0]),Integer.parseInt(secondTempNumberString[1])};

            if (secondTempNumberInt[0] <= licenseOfferQuantity && secondTempNumberInt[1] >= licenseOfferQuantity) {
                if (resultByVerticalLine[2].contains("-")) {
                    String [] xValue = resultByVerticalLine[2].trim().split("-");
                    rcPrice -= Integer.parseInt(xValue[1]);
                }
                if (resultByVerticalLine[2].contains("*")) {
                    String [] xValue = resultByVerticalLine[2].trim().split("\\*");
                    rcPrice *= Double.parseDouble(xValue[1]);
                }
                break;
            }
        }
        return rcPrice;
    }

    /**
     * 此方法接受一个字符串, 返回的是运算符
     * 1, 返回值           char
     * 2, 参数列表          String str
     */

    public static char getChar(String str){
        char cc = ' ';

        // 1. 将传入的字符串拆分成字符数组
        char[] cArr = str.toCharArray();
        for (int i = 0; i < cArr.length; i++) {
            char c = cArr[i];
            // 2. 拿着每一个字符判断是否是数字字符, 只要不是数字字符就说明当前数据是运算符
            if(!((c >= '0' && c <= '9') || c=='.')){
                cc = c;
            }
        }

        return cc;
    }
    /**
     * 5+5
     * 5+5=10
     * str: 代表传递过来的字符串
     * c  : 传递过来的四则运算符
     * @throws Exception
     */
    public static float getResult(String str, char c) throws Exception{
        // 1. 根据传递的字符切割字符串
        String[] split = str.split("\\" + c);
        // 2. 将切割出来的数据转换成整数
        long left = Long.parseLong(split[0]);
        float right = Float.parseFloat(split[1]);

        float result = 0L;
        // 3. 根据传第过来的远算符进行匹配
        switch (c) {
            case '+':
                result = left + right * SoConstUtil.getCurrencyScalingRatio();
                break;
            case '-':
                result = left - right * SoConstUtil.getCurrencyScalingRatio();
                break;
            case '*':
                result = left * right;
                break;
            case '/':
                result = left / right;
                break;
        }

        // 4. 将传递过来的字符串拼接上结果, 返回
        return result;
    }

    /**
     * kob业务开关
     * @param ctrlParam
     * @return
     * @throws RemoteException
     * @throws Exception
     */
    public static boolean kobBusinessCtrl(String ctrlParam)throws RemoteException, Exception {
        boolean ctrlFlag = true;
        IBOBsStaticDataValue[] busiOperData = StaticDataUtil.getStaticData(ctrlParam);
        if(busiOperData==null || busiOperData.length == 0){
            ctrlFlag = false;
        }else if(busiOperData!=null && busiOperData.length>0){
            if ("N".equals(busiOperData[0].getCodeValue()))
                ctrlFlag = false;
        }
        return ctrlFlag;
    }


    public static boolean cr347Switch()throws RemoteException, Exception {
        boolean cr347Flag = false;
        IBOBsStaticDataValue[] busiOperData = StaticDataUtil.getStaticData("SO_CR347_CONTROL");
        if(busiOperData!=null && busiOperData.length>0){
            if ("1".equals(busiOperData[0].getCodeValue()))
                cr347Flag = true;
        }
        return cr347Flag;
    }

    public static boolean b2bEshopPuhCtrl()throws RemoteException, Exception {
        boolean sendFlag = true;
        IBOBsStaticDataValue[] busiOperData = StaticDataUtil.getStaticData("SO_CR324_PUSHC_CONTROL");
        if(busiOperData!=null && busiOperData.length>0){
            if ("-1".equals(busiOperData[0].getCodeValue()))
                sendFlag = false;
        }
        return sendFlag;
    }

    public static boolean sapOrderIdCtrl()throws RemoteException, Exception {
        boolean sendFlag = true;
        IBOBsStaticDataValue[] busiOperData = StaticDataUtil.getStaticData("SO_BRMT2244_CONTROL");
        if(busiOperData!=null && busiOperData.length>0){
            if ("-1".equals(busiOperData[0].getCodeValue()))
                sendFlag = false;
        }
        return sendFlag;
    }

    public static void getNewOfferMap(HashMap newOfferMap,long offerId,Timestamp validDate, Timestamp expireDate,int dateType) throws Exception {
        HashMap dataMap = new HashMap();
        Timestamp sysDate = com.ai.omframe.util.TimeUtil.getDefaultSysDate();
        if(validDate == null) {
            validDate = sysDate;
        }
        if(expireDate == null) {
            expireDate = com.ai.common.util.TimeUtil.getMaxExpire();
        }
        int validType = OrderConst.VALID_TYPE_NOW;
        if(validDate.after(sysDate)) {
            validType = OrderConst.VALID_TYPE_NEXT;
        }
        dataMap.put("VALID_DATE", validDate);
        dataMap.put("EXPIRE_DATE", expireDate);
        dataMap.put("VALID_TYPE",String.valueOf(validType));
        dataMap.put("OFFER_ID", String.valueOf(offerId));
        dataMap.put("STATE", String.valueOf(dateType));//OrderConst.DATA_NEW_STATE));
        String strOfferId = String.valueOf(offerId);
        List dataList = (List)newOfferMap.get(strOfferId);
        if(dataList == null){
            dataList = new ArrayList();
            newOfferMap.put(strOfferId, dataList);
        }
        dataList.add(dataMap);
    }

    public static HashMap getOldOfferMap(long userId) throws Exception {
        HashMap oldOfferMap = new HashMap();
        if(userId <= 0) {
            return oldOfferMap;
        }
        Timestamp sysDate= com.ai.omframe.util.TimeUtil.getDefaultSysDate();
        IInsOfferValue insOffs[] = SoServiceFactory.getInstanceQrySV().getInsOfferByUserId(userId, "", OrderConst.VALID_TYPE_ALL);
        for(int i=0;i<insOffs.length;i++){
            HashMap dataMap = new HashMap();
            String strOfferId = String.valueOf(insOffs[i].getOfferId());
            dataMap.put("VALID_DATE", insOffs[i].getEffectiveDate());
            dataMap.put("EXPIRE_DATE", insOffs[i].getExpireDate());
            dataMap.put("OFFER_INST_ID", String.valueOf(insOffs[i].getOfferInstId()));
            dataMap.put("OFFER_ID", String.valueOf(insOffs[i].getOfferId()));
            //数据状态
            dataMap.put("STATE", String.valueOf(OrderConst.DATA_OLD_STATE));
            List dataList = (List)oldOfferMap.get(strOfferId);
            if(dataList == null){
                dataList = new ArrayList();
                oldOfferMap.put(strOfferId, dataList);
            }
            dataList.add(dataMap);
        }
        return oldOfferMap;
    }

    public static String getInsuranceTerminateDate() throws Exception {
        IBOBsStaticDataValue[] staticDatas = StaticDataUtil.getStaticData("INSURANCE_TRERMINATE_PERIOD");
        int days = 0;
        if(staticDatas !=null && staticDatas.length > 0) {
            days = Integer.valueOf(staticDatas[0].getCodeValue());
        }
        Timestamp systemTime = new Timestamp(System.currentTimeMillis());
        Timestamp bookingDate = com.ai.omframe.util.TimeUtil.getDateOfCurrentStartDay(com.ai.omframe.util.TimeUtil.addOrMinusDays(systemTime.getTime(), days));
        SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");
        String reserveDate = format.format(bookingDate);
        return reserveDate;
    }

    public static int getValidateVPNMemberCount() throws Exception {
        IBOBsStaticDataValue[] staticDatas = StaticDataUtil.getStaticData("VPN_MEM_COUNT");
        int days = 0;
        if(staticDatas !=null && staticDatas.length > 0) {
            days = Integer.valueOf(staticDatas[0].getCodeValue());
        }
        return days;
    }

    public static String getDefaultIotFileUrl() throws Exception {
        IBOBsParaDetailValue bsParaDetailValue = BceUtil.getParaDetailValue("X", "SIM_FILE", "BASEURL");
        if(bsParaDetailValue!=null && StringUtils.isNotBlank(bsParaDetailValue.getPara1())) {
            return bsParaDetailValue.getPara1();
        }
        return null;
    }

    public static boolean getInsuranceProvisionCtrl() throws Exception {
        boolean insuranceProvisionControl = false;
        IBOBsStaticDataValue[] staiticValues = StaticDataUtil.getStaticData("INSURANCE_PROVISION_CONTROL");
        if(staiticValues != null && staiticValues.length > 0 && RBossConst.SO_Yes.equals(staiticValues[0].getCodeValue())) {
            insuranceProvisionControl = true;
        }
        return insuranceProvisionControl;
    }
    public static boolean getInsuranceUpdateCtrl() throws Exception {
        boolean insuranceProvisionControl = false;
        IBOBsStaticDataValue[] staiticValues = StaticDataUtil.getStaticData("INSURANCE_UPDATE_CONTROL");
        if(staiticValues != null && staiticValues.length > 0 && RBossConst.SO_Yes.equals(staiticValues[0].getCodeValue())) {
            insuranceProvisionControl = true;
        }
        return insuranceProvisionControl;
    }
    public static boolean isSquareTradeScreenInsurance(long offerId)throws Exception{

        IProduct2CrmSV sv = (IProduct2CrmSV)ServiceFactory.getService(IProduct2CrmSV.class);
        IUpItemFeatureValue item = sv.getItemFeatureByProdAndFeatureId(offerId, 2700054L);
        if(item !=null && "3".equals(item.getFeatureValue())){
            return true;
        }
        return false;
    }

    public static String getStaticDataName(String codeType,String codeValue)throws Exception{

        IBOBsStaticDataValue aStaticDataValue = StaticDataUtil.getStaticData(codeType,codeValue);
        if(aStaticDataValue!=null && StringUtils.isNotBlank(aStaticDataValue.getCodeName())) {
            String codeName = CrmI18nFactory.getJavaI18nResource(aStaticDataValue.getCodeName());
            if(StringUtils.isNotBlank(codeName)) {
                return codeName;
            }
            return aStaticDataValue.getCodeName();
        }
        return null;
    }

    /**
     * BMRT-3691 Cloud PBX开关，Value值是Y开关打开走Cloud PBX新增逻辑，默认关闭
     *
     * @return
     * @throws Exception
     */
    public static boolean cloudPBXControl() throws Exception {
        boolean flag = false;
        IBOBsStaticDataValue[] staticValues = StaticDataUtil.getStaticData("CLOUD_PBX_CONTROL");
        if(staticValues != null && staticValues.length > 0 && RBossConst.SO_Yes.equals(staticValues[0].getCodeValue())) {
            flag = true;
        }
        return flag;
    }

    /**
     * B2B客户新建时默认的偏好平台值
     * @return
     * @throws Exception
     */
    public static String getCustDefaultPlatform() throws Exception {
        String platform = "CloudPBX";
        IBOBsStaticDataValue[] staticValues = StaticDataUtil.getStaticData("CUST_DEFAULT_PLATFORM");
        if(staticValues != null && staticValues.length > 0) {
            platform = staticValues[0].getCodeValue();
        }
        return platform;
    }

    public static boolean cvs1281Control() throws Exception {
        boolean flag = false;
        IBOBsStaticDataValue[] staticValues = StaticDataUtil.getStaticData("CVS1281_CONTROL");
        if(staticValues != null && staticValues.length > 0 && RBossConst.SO_Yes.equals(staticValues[0].getCodeValue())) {
            flag = true;
        }
        return flag;
    }

    /**
     * prod-1033 开关
     * @return
     * @throws Exception
     */
    public static boolean wholesaleVmsControl() throws Exception {
        boolean flag = false;
        IBOBsStaticDataValue[] staticValues = StaticDataUtil.getStaticData("NEW_VMS_WHOLESALE");
        if(staticValues != null && staticValues.length > 0 && RBossConst.SO_Yes.equals(staticValues[0].getCodeValue())) {
            flag = true;
        }
        return flag;
    }

    public static boolean tnVmsControl() throws Exception {
        boolean flag = false;
        IBOBsStaticDataValue[] staticValues = StaticDataUtil.getStaticData("NEW_VMS_TELENOR");
        if(staticValues != null && staticValues.length > 0 && RBossConst.SO_Yes.equals(staticValues[0].getCodeValue())) {
            flag = true;
        }
        return flag;
    }

    /**
     * AI-18048,cloud pbx割接功能开关
     * @author: huanglun
     * @date:   2024年1月12日 下午3:50:38
     * @Description:
     */
    public static boolean pbxCutoverControl() throws Exception {
        boolean flag = false;
        IBOBsStaticDataValue[] staticValues = StaticDataUtil.getStaticData("PBX_CUTOVER_CONTROL");
        if(staticValues != null && staticValues.length > 0 && RBossConst.SO_Yes.equals(staticValues[0].getCodeValue())) {
            flag = true;
        }
        return flag;
    }

    public static boolean unsubTrialWimpCtrl() throws Exception {
        boolean flag = false;
        IBOBsStaticDataValue[] staticValues = StaticDataUtil.getStaticData("WIMP_TRIAL_CONTROL");
        if(staticValues != null && staticValues.length > 0 && RBossConst.SO_Yes.equals(staticValues[0].getCodeValue())) {
            flag = true;
        }
        return flag;
    }

    /**
     * 	double 类型数据做乘法计算
     * @param dataOne
     * @param dataTwo
     * @return
     * @throws Exception
     */
    public static BigDecimal doubleDataMultiply(double dataOne,double dataTwo) throws Exception {
        BigDecimal bigDecimalOne = new BigDecimal(Double.toString(dataOne));
        BigDecimal bigDecimalTwo = new BigDecimal(Double.toString(dataTwo));
        return bigDecimalOne.multiply(bigDecimalTwo).setScale(0, BigDecimal.ROUND_HALF_UP);
    }

    public static BigDecimal doubleDataDiv(double dataOne,double dataTwo) throws Exception {
        BigDecimal bigDecimalOne = new BigDecimal(Double.toString(dataOne));
        BigDecimal bigDecimalTwo = new BigDecimal(Double.toString(dataTwo));
        return bigDecimalOne.divide(bigDecimalTwo).setScale(0, BigDecimal.ROUND_HALF_UP);
    }
    /**
     * BMRT-5030 判断操作员是否有Add VPN Mobile Member按钮权限
     *
     * @return
     * @throws Exception
     */
//    public static boolean judgeAddVpnMemberSec() throws Exception {
//        long opId = SessionManager.getUser().getID();
//        return SecframeClient.checkEntityPermission(opId, RBossConst.ADD_VPN_MEMBER_ENTID, RBossConst.ADD_VPN_MEMBER_ENTID);
//    }

    public static boolean isEshopChannel(long customerOrderId)throws Exception {
        boolean isOseChannel = false;
        ISoOrderData soOrderData = SoDataFactory.getSoOrderData(customerOrderId);
        DataContainerInterface[] dcs = soOrderData.getNormalRowsetInfo("frmNormal_Delivery");
        if (dcs == null) {
            dcs = soOrderData.getNormalRowsetInfo("frmNormalDelivery");
        }
        if (dcs != null) {
            for (DataContainerInterface dc : dcs) {
                String oseChannel = dc.getAsString("ORDER_CHANNEL");
                if ((oseChannel != null && "OSE".equals(oseChannel))) {
                    isOseChannel = true;
                    break;
                }
            }
        }
        return isOseChannel;
    }

    public static  String updateJsonString(long userId, long offerId, String effDate, String expDate, String offerJson) {
        Gson gson = new Gson();
        //["offerId1":[{"userId":"userId1","effDate":"","expDate":""},{"userId":"userId2","effDate":"","expDate":""}],]
        JsonArray jsonArray = gson.fromJson(offerJson, JsonArray.class);
        for(JsonElement memberObj :jsonArray){
            if(memberObj.isJsonObject()){
                JsonObject offerObj = memberObj.getAsJsonObject();
                if(offerObj.has(String.valueOf(offerId))){
                    JsonArray userSubArray = (JsonArray)offerObj.get(String.valueOf(offerId));
                    JsonObject newJsonObj = new JsonObject();
                    newJsonObj.addProperty("userId", String.valueOf(userId));
                    newJsonObj.addProperty("effDate", effDate);
                    newJsonObj.addProperty("expDate", expDate);
                    userSubArray.add(newJsonObj);
                }else{
                    JsonArray userSubArray = new JsonArray();
                    JsonObject newJsonObj = new JsonObject();
                    newJsonObj.addProperty("userId", String.valueOf(userId));
                    newJsonObj.addProperty("effDate", effDate);
                    newJsonObj.addProperty("expDate", expDate);
                    userSubArray.add(newJsonObj);
                    offerObj.add(String.valueOf(offerId),userSubArray);
                }
            }
        }
        String retJson = gson.toJson(jsonArray);
        return retJson;
    }

    public static String newJsonString(long userId, long offerId, String effDate, String expDate) {
        Gson gson = new Gson();
        JsonObject newOfferObj = new JsonObject();
        JsonArray parentArray = new JsonArray();
        JsonArray userSubArray = new JsonArray();
        JsonObject newJsonObj = new JsonObject();
        newJsonObj.addProperty("userId", String.valueOf(userId));
        newJsonObj.addProperty("effDate", effDate);
        newJsonObj.addProperty("expDate", expDate);
        userSubArray.add(newJsonObj);
        newOfferObj.add(String.valueOf(offerId),userSubArray);
        parentArray.add(newOfferObj);
        String addJsonString = gson.toJson(parentArray);
        return addJsonString;
    }

    public static String getWholesaleBlockPages() throws Exception {
        IBOBsParaDetailValue bsParaDetailValue = BceUtil.getParaDetailValue("X", "WHOLESALE_BLOCK_PAGES", "WHOLESALE_BLOCK_PAGES");
        String pageMenuIds = "";
        if(bsParaDetailValue != null && StringUtils.isNotBlank(bsParaDetailValue.getPara1())) {
            pageMenuIds = bsParaDetailValue.getPara1();
        }
        if(bsParaDetailValue != null && StringUtils.isNotBlank(bsParaDetailValue.getPara2())) {
            pageMenuIds = pageMenuIds + "," + bsParaDetailValue.getPara2();
        }
        if(bsParaDetailValue != null && StringUtils.isNotBlank(bsParaDetailValue.getPara3())) {
            pageMenuIds = pageMenuIds + "," + bsParaDetailValue.getPara3();
        }
        if(bsParaDetailValue != null && StringUtils.isNotBlank(bsParaDetailValue.getPara4())) {
            pageMenuIds = pageMenuIds + "," + bsParaDetailValue.getPara4();
        }
        if(bsParaDetailValue != null && StringUtils.isNotBlank(bsParaDetailValue.getPara5())) {
            pageMenuIds = pageMenuIds + "," + bsParaDetailValue.getPara5();
        }
        return pageMenuIds;
    }

    public static boolean control_cr387() throws Exception {
        IBOBsStaticDataValue[] busiOperData = StaticDataUtil.getStaticData("CONTROL_CR387");
        boolean control = true;
        if(busiOperData != null && busiOperData.length > 0 && "-1".equals(busiOperData[0].getCodeValue())){//-1是关，其他都是开
            control = false;
        }
        return control;
    }
}