package com.asiainfo.crm.constant;
import com.asiainfo.crm.util.SoConstUtil;
public interface CmxInterConstants {
    public static final String PUBINFO_CHANNEL_TYPE = "CHANNEL_TYPE";
    public static final String SO_Yes = "Y";
    public static final long PROD_CATALOG_GSM = 171000000001L;//普通GSM规格
    public static String TASK_INTER_FLAG = "TASK_INTER_FLAG";//后台进程和接口标识，"Y"表示是
    public static final int CRM_CALL_OUT = 1;//CRM 主动调用
    //用户状态
    public static final String USER_STATE_NORMAL="1"; //在用
    public static final String SO_BUSIID_CFG_REGID = "X";
    public static final String SO_BUSIID_CFG = "SO_BUSIID_CFG";
    /***********************SR0.3.2 策划编号bs_para_detail配置*********************/
    public static final String SO_OFFERID_CFG_REGID = "X";
    public static final String SO_OFFERID_CFG = "SO_OFFERID_CFG";
    public static final String SO_PRODID_CFG = "SO_PRODID_CFG";

    public static String SO_CHANNEL_CFG = "SO_CHANNEL_CFG";
    /***********************SR0.3.2 PushC bs_para_detail配置*********************/
    public static final String SO_PUSHC_CFG_REGID = "X";
    public static final String SO_PUSHC_CFG = "SO_PUSHC_CFG";

    public interface AppleDep {
        public static final long FREAURE_ID_APPLE_DEP = 35000001L;//Offer需要发APPLE DEP注册
        public static final String FREAURE_VALUE_APPLE_DEP = "APPLE_DEP";//Offer需要发APPLE DEP注册
        public static final String TIMEZONE_CET = "-60";//时区 Central European Time
        public static final String APPLE_DEP_RESELLER_ID =SoConstUtil.getParaDetailValueByCondition4AppleDep("APPLE_DEP_RESELLER_ID");
        public static final String APPLE_DEP_SHIPTO =SoConstUtil.getParaDetailValueByCondition4AppleDep("APPLE_DEP_SHIPTO");
        public static final String INSURANCE_OFFER =  "INSURANCE_OFFER";
    }

}