package com.asiainfo.crm.cm.common.util;

import java.sql.Timestamp;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import com.ai.appframe2.complex.center.CenterFactory;
import com.ai.appframe2.service.ServiceFactory;
import com.ai.common.i18n.CrmLocaleFactory;
import com.ai.common.util.CenterUtil;
import com.ai.common.util.ExceptionUtil;
import com.ai.omframe.order.service.interfaces.IOrderCustSV;


public class ClubUtil {
	
	private transient static Log log = LogFactory.getLog(ClubUtil.class);
	
	/**
	 * 
	 * @Copyright Copyright (c) 2012 Asiainfo-Linkage
	 * 
	 * @ClassName CfgUtils
	 * @Description 该类的功能描述
	 *
	 * @version v1.0.0
	 * @author xingyh
	 * @date Feb 17, 2012 11:28:06 AM
	 * <br>
	 * Modification History:<br>
	 * Date         Author          Version            Description<br>
	 * ---------------------------------------------------------*<br>
	 * Feb 17, 2012     xingyh           v1.0.0               修改原因<br>
	 */
	public interface vipCardType {

		// 电子卡
		public static final int  CARD1 = 2;
		// 实体卡
		public static final int CARD2 = 1;
	}
	//定义页面的传递参数
	public static final  String MEMBER_ID="memberId";
	
	//定义页面的传递参数
	public static final  String USER_ID="userId";
	
	//省编码
	public static final  String Orig="010";
	
	
	
	/**
	 * 
	 * @Copyright Copyright (c) 2012 Asiainfo-Linkage
	 * 
	 * @ClassName CfgUtils
	 * @Description 会员卡发放结果
	 *
	 * @version v1.0.0
	 * @author wangxch
	 * @date Feb 17, 2012 5:07:57 PM
	 * <br>
	 * Modification History:<br>
	 * Date         Author          Version            Description<br>
	 * ---------------------------------------------------------*<br>
	 * Feb 17, 2012     wangxch           v1.0.0               修改原因<br>
	 */
	public interface vipSendResult {
		
		// 成功
		public static final String  result1 = "0";
		// 失败
		public static final String result2 = "-1";
		
		//成功
		public static final String resultState1="U";
		
		//失败
		public static final String resultState2="X";
		
	}
	/**
	 * 
	 * 卡号一共16位，其中第5、6位如果为01则为积分，为08则为套餐

			另：第1、2位为固定值01，

			第3、4位为会员年份的后2位，如2012年会员则第3、4位就是12

			第5、6位如果为01则为积分，为08则为套餐

			第7位代表卡别：1、2、3分别为钻、金、银，7为体验金、8为体验银

			第8位代表类别：1为个人，0为集团

			后面8位为不重复的随机码
	 */
	/**
	 * 根据卡号判断是套餐还是积分
	 * @Function rdSourceByCardNum
	 * @Description 
	 *
	 * @param cradNum
	 * @return 1、积分 2、套餐 0 卡号有误
	 *
	 * @version v1.0.0
	 * @author xingyh
	 * @date Feb 17, 2012 12:47:11 PM
	 * 
	 * <strong>Modification History:</strong><br>
	 * Date         Author          Version            Description<br>
	 * ---------------------------------------------------------<br>
	 * Feb 17, 2012     xingyh           v1.0.0               修改原因<br>
	 */
	public static  int getCardSourceByCardNum(String cradNum){
		 int  cardSource=0;
		 if(cradNum.length()==16){//卡号长度
			 String cradSrc=cradNum.substring(4, 6);
			 //01 标识积分
			 if("01".equals(cradSrc)){ //  标识积分
				 cardSource=1;
			 }else if("08".equals(cradSrc)){  //08 标识套餐
				 cardSource=2;
			 }else{
				 cardSource=0;
			 }
		}else{
			 cardSource=0;
		 }
		return cardSource;
	}
	/**
	 * 根据卡号判断是个人还是集团
	 * @Function rdSourceByCardNum
	 * @Description 
	 *
	 * @param cradNum
	 * @return 1 个人 2 集团  0卡号有误
	 *
	 * @version v1.0.0
	 * @author xingyh
	 * @date Feb 17, 2012 12:47:11 PM
	 * 
	 * <strong>Modification History:</strong><br>
	 * Date         Author          Version            Description<br>
	 * ---------------------------------------------------------<br>
	 * Feb 17, 2012     xingyh           v1.0.0               修改原因<br>
	 */
	public static  int getCustTypeByCardNum(String cradNum){
		 int  custType=0;
		 if(cradNum.length()==16){//卡号长度
			 String cradSrc=cradNum.substring(7, 8);
			 //1 个人
			 if("1".equals(cradSrc)){
				 custType=1;
			 }else if("0".equals(cradSrc)){  //0 标识集团
				 custType=2;
			 }else{
				 custType=0;
			 }
		}else{
			custType=0;
		 }
		return custType;
	}
	/**
	 *  根据卡号获得卡别
	 * @Function getcardLevelByCardNum
	 * @Description 
	 *
	 * @param cradNum
	 * @return
	 *
	 * @version v1.0.0
	 * @author wangxch
	 * @date Feb 17, 2012 12:52:12 PM
	 * 
	 * <strong>Modification History:</strong><br>
	 * Date         Author          Version            Description<br>
	 * ---------------------------------------------------------<br>
	 * Feb 17, 2012     wangxch           v1.0.0               修改原因<br>
	 */
	public static  int getcardLevelByCardNum(String cradNum){
		 int  cardLevel=0;
		 if(cradNum.length()==16){//卡号长度
			 String cradSrc=cradNum.substring(6, 7);
			 //1钻卡
			 if("1".equals(cradSrc)){//1 钻卡
				 cardLevel=1;
			 }else if("2".equals(cradSrc)){  //2 金卡
				 cardLevel=2;
			 }else if("3".equals(cradSrc)){//3 银卡
				 cardLevel=3;
			 }else if("7".equals(cradSrc)){//7 体验金卡
				 cardLevel=7;
			 }else if("8".equals(cradSrc)){//8 体验银卡
				 cardLevel=8;
			 }else{
				 cardLevel=0;
			 }
		}else{
			cardLevel=0;
		 }
		return cardLevel;
	}
	/**
	 *  根据卡号获得年份
	 * @Function getcardLevelByCardNum
	 * @Description 
	 *
	 * @param cradNum
	 * @return
	 *
	 * @version v1.0.0
	 * @author xingyh
	 * @date Feb 17, 2012 12:52:12 PM
	 * 
	 * <strong>Modification History:</strong><br>
	 * Date         Author          Version            Description<br>
	 * ---------------------------------------------------------<br>
	 * Feb 17, 2012     xingyh           v1.0.0               修改原因<br>
	 */
	public static  String getcardYearByCardNum(String cradNum){
		 String  cardYear="";
		 
		 if(cradNum.length()==16){//卡号长度
			  cardYear=cradNum.substring(2, 4); //返回卡的年份
		}else{
			cardYear="0";
		 }
		return cardYear;
	}
	/**
	 * 判断字符串是否是整数
	 * @Function checkStrIsInt
	 * @Description 
	 *
	 * @param str
	 *
	 *@return true 是数字 ，false 不是数字
	 * @version v1.0.0
	 * @author xingyh
	 * @date Feb 17, 2012 5:28:58 PM
	 * 
	 * <strong>Modification History:</strong><br>
	 * Date         Author          Version            Description<br>
	 * ---------------------------------------------------------<br>
	 * Feb 17, 2012     xingyh           v1.0.0               修改原因<br>
	 */
	public static boolean checkStrIsNum(String str){
		boolean check=false;
		try{
			Long.valueOf(str);
			check=true;
		}catch(Exception e){
			log.info(e.getMessage(), e);
			check=false;
		}
		return check;
		
	}
	/**
	 * 通过卡的名称获得卡的类型
	 * @Function getCardTypeByCardName
	 * @Description 
	 *
	 * @param cardName
	 *
	 * @version v1.0.0
	 * @author wangxch
	 * @date Feb 17, 2012 7:10:36 PM
	 * 
	 * <strong>Modification History:</strong><br>
	 * Date         Author          Version            Description<br>
	 * ---------------------------------------------------------<br>
	 * Feb 17, 2012     wangxch           v1.0.0               修改原因<br>
	 */
	public static String getCardTypeByCardName(String cardName){
		 String cardType="";
		if(CrmLocaleFactory.getResource("CMS0080200").equals(cardName)){//钻卡
			cardType="1";
		}else if(CrmLocaleFactory.getResource("CMS0080201").equals(cardName)){//金卡
			cardType="2";
		}else if(CrmLocaleFactory.getResource("CMS0080202").equals(cardName)){//银卡
			cardType="3";
		}else{
			cardType="0"; //不存在则返回0
		}
		return cardType;
		
		
	}
	/**
	 * 
	 * @Function formatDate
	 * @Description DATE型转为Timestamp
	 *
	 * @param date
	 * @return
	 *
	 * @version v1.0.0
	 * @author jiangxy
	 * @date 2012-2-20 下午12:25:51
	 * 
	 * <strong>Modification History:</strong><br>
	 * Date         Author          Version            Description<br>
	 * ---------------------------------------------------------<br>
	 * 2012-2-20     jiangxy           v1.0.0               修改原因<br>
	 */
	public static Timestamp formatDate(Date date){
		DateFormat dateFormat2 = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		String date2 = dateFormat2.format(date);
		return Timestamp.valueOf(date2);
	}
	/**
	 * 
	 * @Function getYear
	 * @Description 获得当前年份
	 *
	 * @return
	 *
	 * @version v1.0.0
	 * @author jiangxy
	 * @date 2012-2-23 下午07:47:04
	 * 
	 * <strong>Modification History:</strong><br>
	 * Date         Author          Version            Description<br>
	 * ---------------------------------------------------------<br>
	 * 2012-2-23     jiangxy           v1.0.0               修改原因<br>
	 */
	public static String getYear(){
		DateFormat dateFormat2 = new SimpleDateFormat("yyyy");
		String date2 = dateFormat2.format(new Date());
		return date2;
	}
	
	
	
	/**
	 * 
	 * @Function checkVipCode
	 * @Description 校验卡号
	 *
	 * @param cardCode 卡号
	 * @param cardType 卡别 
	 * @param custId   客户编号
	 * @param source   来源 1：积分。2：套餐
	 * @return
	 * @throws Exception
	 *
	 * @version v1.0.0
	 * @author jiangxy
	 * @date Mar 26, 2012 4:45:06 PM
	 * 
	 * <strong>Modification History:</strong><br>
	 * Date         Author          Version            Description<br>
	 * ---------------------------------------------------------<br>
	 * Mar 26, 2012     jiangxy           v1.0.0               修改原因<br>
	 */
	public static void checkVipCode(String cardCode,String cardType,Long custId,int source) throws Exception {
		Calendar c=Calendar.getInstance();
		// 校验卡号
		if(!String.valueOf(c.get(Calendar.YEAR)).substring(2,4).equals(cardCode.substring(2,4))){
			log.error(CrmLocaleFactory.getResource("CMS0080411",cardCode) );
			ExceptionUtil.throwBusinessException("CMS0080411",cardCode);//卡号的3、4为对应的年不正确！{0}，卡号
		}
	}
		
	
	/**
	 * 
	 * @Function checkBillId
	 * @Description 校验手机号码
	 *
	 * @param billId
	 * @return
	 * @throws Exception
	 *
	 * @version v1.0.0
	 * @author jiangxy
	 * @date Apr 24, 2012 3:18:37 PM
	 * 
	 * <strong>Modification History:</strong><br>
	 * Date         Author          Version            Description<br>
	 * ---------------------------------------------------------<br>
	 * Apr 24, 2012     jiangxy           v1.0.0               修改原因<br>
	 * 7.9, 2012     xingyh            v2.0.0               去掉手机号码的校验<br>
	 */
	public static boolean checkBillId(String billId)throws Exception{
//		String reg = CmBjConstants.VipCustomer.PHONE_REG;
//		Pattern p = Pattern.compile(reg);
//		Matcher m = p.matcher(billId);
		//return m.matches();
		return true;
	}
	/**
	 * 获得25位流水号
	 * @Function getNewPeerSeqString
	 * @Description 
	 *
	 * @return
	 * @throws Exception
	 *
	 * @version v1.0.0
	 * @author xingyh
	 * @date Apr 25, 2012 9:38:11 AM
	 * 
	 * <strong>Modification History:</strong><br>
	 * Date         Author          Version            Description<br>
	 * ---------------------------------------------------------<br>
	 * Apr 25, 2012     xingyh          v1.0.0               修改原因<br>
	 */
	public static String getNewPeerSeqString() throws Exception {
		 String[] regionId = CenterUtil.getAllRegionIds(); //获取所有的地市列表
		 CenterFactory.setCenterInfoByTypeAndValue(CenterUtil.REGION_ID,regionId[0]); //取一个地市设置中心。
		 return (String)((IOrderCustSV) ServiceFactory.getService(IOrderCustSV.class)).createOrderCode();
	}
	public interface airportService {

		// 积分值 国内航班、第一类服务
		public static final int  scoreValue1 = 2000;
		// 积分值 国内航班、第二类服务
		public static final int scoreValue2 = 3000;
		
		// 积分值 国际航班、第一类服务
		public static final int  scoreValue3 = 5000;
		// 积分值 国际航班、第二类服务
		public static final int  scoreValue4 = 8000;
		
		//服务类型 --第一类服务
		public static final int serviceType1=1;
		//服务类型--第一类二类
		public static final int serviceType2=2;
		
		//航班类型 --国内航班
		public static final int flightType1=1;
		//航班类型--国际航班
		public static final int flightType2=2;
		
		// 国内航班第一类服务
		public static final int serviceLevel1=1;
		// 国内航班第二类服务
		public static final int serviceLevel2=2;
		// 国际航班第一类服务
		public static final int serviceLevel3=3;
		// 国际航班第二类服务
		public static final int serviceLevel4=4;
	}
	
	
	private static final String[][] AIRpORT_SERVICE = { { CrmLocaleFactory.getResource("CMS0080338"), "2" }, { CrmLocaleFactory.getResource("CMS0080339"), "2" },
			{ CrmLocaleFactory.getResource("CMS0080340"), "2" }, { CrmLocaleFactory.getResource("CMS0080341"), "2" }, { CrmLocaleFactory.getResource("CMS0080342"), "2" },
			{ CrmLocaleFactory.getResource("CMS0080343"), "2" } };
	
	/**
	 * 套餐会员级别
	 * @Copyright Copyright (c) 2012 Asiainfo-Linkage
	 * 
	 * @ClassName CfgUtils
	 * @Description 该类的功能描述
	 *
	 * @version v1.0.0
	 * @author xingyh
	 * @date May 31, 2012 7:56:49 PM
	 * <br>
	 * Modification History:<br>
	 * Date         Author          Version            Description<br>
	 * ---------------------------------------------------------*<br>
	 * May 31, 2012     xingyh           v1.0.0               修改原因<br>
	 */
	public interface packAgeLevel{
		//钻卡
		public static final String packAgeLevel1="1";
		// 金卡
		public static final String packAgeLevel2="2";
		// 银卡
		public static final String packAgeLevel3="3";
		
	}
	
}
