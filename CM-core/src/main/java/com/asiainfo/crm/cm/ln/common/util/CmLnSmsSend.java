package com.asiainfo.crm.cm.ln.common.util;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.asiainfo.crm.inter.sms.service.interfaces.SMSConstants;
import org.apache.commons.lang.StringUtils;

import com.ai.appframe2.bo.DataContainer;
import com.ai.appframe2.common.ServiceManager;
import com.ai.appframe2.complex.center.CenterFactory;
import com.ai.appframe2.service.ServiceFactory;
import com.ai.common.util.CenterUtil;
import com.ai.common.util.ExceptionUtil;
import com.asiainfo.crm.cm.common.CmxConstants;
import com.asiainfo.crm.cm.common.CmConstants.CenterType;
import com.asiainfo.crm.inter.sms.so.service.interfaces.ISmsPendingSV;
import com.asiainfo.crm.inter.sms.so.service.interfaces.ISoSmsPendingSV;

public class CmLnSmsSend {

	/**   
	 * @Function sendSms
	 * @Description 发送短信
	 *
	 * @param billId
	 * @param smsContent
	 * @throws Exception
	 *
	 * @version v1.0.0
	 * @author shitian
	 * @date Oct 5, 2012 4:42:25 PM
	 * 
	 * <strong>Modification History:</strong><br>
	 * Date         Author          Version            Description<br>
	 * ---------------------------------------------------------<br>
	 * Oct 5, 2012     shitian           v1.0.0               修改原因<br>
	 */
	public static void sendSms(String billId, String smsContent) throws Exception {
		if (StringUtils.isBlank(billId) || StringUtils.isBlank(smsContent)) {
			// 输入参数不合法！
			ExceptionUtil.throwBusinessException("CMS0000073");
		}
		HashMap smsMap = new HashMap();
		HashMap sendPackage = new HashMap();
		sendPackage.put("DESTNUM", billId);
		sendPackage.put("REGION_ID", CenterUtil.getRegionIdByBillId(billId));
		sendPackage.put("TEMPLATE_ID", String.valueOf(CmxConstants.Common.COMMON_SMS_TEMPLATE_ID));
		sendPackage.put("SENDDATE", ServiceManager.getOpDateTime());
		smsMap.put("SMS_TXT", smsContent);
		sendPackage.put("RTNDATA", smsMap);
		ISmsPendingSV smsPendingSV = (ISmsPendingSV) ServiceFactory.getService(ISmsPendingSV.class);
		smsPendingSV.saveSmsPending(SMSConstants.SMS_FAST_PENDING, sendPackage);
	}
	
	
	/**   
	 * @Function sendSmsPendIng
	 * @Description 单个下发定时短信
	 *
	 * @param billId
	 * @param smsContent
	 * @throws Exception
	 *
	 * @version v1.0.0
	 * @author kangzk
	 * @date Oct 5, 2012 4:42:25 PM
	 * 
	 * <strong>Modification History:</strong><br>
	 * Date         Author          Version            Description<br>
	 * ---------------------------------------------------------<br>
	 * Oct 5, 2012     kangzk           v1.0.0               修改原因<br>
	 */
	public static void sendSmsPendIng(String billId, String templateId,Map msgMap)
			throws Exception {
		HashMap<String, Object> sendPackage = new HashMap<String, Object>();
		String regionId = CenterUtil.getRegionIdByBillId(billId); // 根据手机号获取地市
		// 短信模板赋值
		sendPackage.put("DESTNUM", billId);//下发号码
		sendPackage.put("OPTCODE", "2001");// 短信KEY String开发组根据数字型业务编解码BusinessID转换
		sendPackage.put("REGION_ID",regionId); // 地市
		sendPackage.put(SMSConstants.SMS_TEMPLATE_ID, templateId);
		sendPackage.put("RTNDATA", msgMap);
			
		ISoSmsPendingSV smsPendingSV = (ISoSmsPendingSV) ServiceFactory.getService(ISoSmsPendingSV.class);
		//smsPendingSV.saveSmsPending(SMSConstants.SMS_FAST_PENDING, sendPackage);
		smsPendingSV.saveSmsPending(SMSConstants.SMS_FAST_PENDING, sendPackage);

		
	}
	
	/**   
	 * 此方法提供客户管理内部批量下发短信实用
	 * @Function businessSendSms
	 * @Description 批量下发短信
	 * 
	 * dt:
	 *    BRAND  			品牌
	 *    CREDIT_CLASS  	等级
	 *    CREDIT_FEE		透支额度
	 *    OLD_CREDIT_CLASS  老等级
	 *    NEW_CREDIT_CLASS  新等级
	 *    尊敬的{BRAND}客户，感谢您多年来对中国移动的支持，根据您的号码使用时间、消费情况及近期交费情况，您的信用度等级本月将提升为{CREDIT_CLASS}级，本月可享受透支{CREDIT_FEE}元话费的特权服务。信用度等级每月将自动调整，调整后将执行新的等级和透支额度，请您在每月11日前补清所有欠费，以免信用度等级和透支额度下降影响正常通信。如您不想参与，回复QXXYD即可取消信用度等级的优惠特权，详询10086。
		  尊敬的{BRAND}客户，感谢您对中国移动的支持，根据您近期的消费行为，您的信用度等级本月将由{OLD_CREDIT_CLASS}级调整为{NEW_CREDIT_CLASS}级，本月可享受透支{CREDIT_FEE}元话费的特权服务。信用度等级每月将自动调整，调整后将执行新的等级和透支额度。如您不想参与，回复QXXYD即可取消信用度等级的优惠特权，详询10086。
		  尊敬的{BRAND}客户，感谢您多年来对中国移动的支持，根据您的号码使用时间及消费情况，为了避免话费余额不足立即停机给您带来不便，中国移动特为您量身定制了信用度为{CREDIT_CLASS}级，本月可享受透支{CREDIT_FEE}元话费的特权服务。信用度等级每月将自动调整，调整后将执行新的等级和透支额度，请您在每月11日前补清所有欠费，以免信用度等级和透支额度下降影响正常通信。如您不想参与，回复QXXYD即可取消信用度等级的优惠特权，详询10086。"
		  尊敬的客户，感谢您对中国移动的长期支持，根据您的在网时长、品牌和消费等情况，您的信用度等级将由{OLD_CREDIT_CLASS}级提升为{NEW_CREDIT_CLASS}级，可享受免租金办理日韩国际漫游租机的特权服务。信用度等级每月自动调整，当您达到7级及以上时，可以享受担保本人或他人欠费开机、免押金办理国际及港澳台长途和漫游等特权服务。如您不想参与，回复QXXYD即可取消信用度等级的特权服务，详询10086。
		  尊敬的{BILLID}客户，感谢您对中国移动的长期支持，根据您的在网时长、品牌和消费等情况，您的信用度等级将由{OLD_CREDIT_CLASS}级提升为{NEW_CREDIT_CLASS}级，可享受担保本人或他人欠费开机及免押金办理国际及港澳台长途和漫游的特权服务。信用度等级每月自动调整，调整后可享受新信用度等级的特权服务。如您不想参与，回复QXXYD即可取消信用度等级的特权服务，详询10086。
		  尊敬的客户，感谢您对中国移动的长期支持，根据您的在网时长、品牌和消费等情况，您的信用度等级由{OLD_CREDIT_CLASS}级调整为{NEW_CREDIT_CLASS}级，可享受免租金办理日韩国际漫游租机的特权服务。信用度等级每月自动调整，当您达到7级及以上时，可以享受担保本人或他人欠费开机、免押金办理国际及港澳台长途和漫游等特权服务。如您不想参与，回复QXXYD即可取消信用度等级的特权服务，详询10086。
		  尊敬的客户，感谢您对中国移动的长期支持，根据您的在网时长、品牌和消费等情况，您的信用度等级由{OLD_CREDIT_CLASS}级调整为{NEW_CREDIT_CLASS}级，可享受担保本人或他人欠费开机及免押金办理国际及港澳台长途和漫游的特权服务。信用度等级每月自动调整，调整后可享受新信用度等级的特权服务。如您不想参与，回复QXXYD即可取消信用度等级的特权服务，详询10086。
		  尊敬的客户，为感谢您对中国移动的长期支持，我公司推出客户信用度服务，您目前的信用度等级为{CREDIT_CLASS}级，可享受免租金办理日韩国际漫游租机的特权服务。信用度等级将随着您的在网时长、品牌和消费等情况动态调整，当您达到7级及以上时可以享受担保本人或他人欠费开机、免押金办理国际及港澳台长途和漫游的特权服务。如您不想参与，回复QXXYD即可取消信用度等级特权服务，详询10086。
		  尊敬的客户，为感谢您对中国移动的长期支持，我公司推出客户信用度服务，您目前的信用度等级为{CREDIT_CLASS}级，可享受担保本人或他人欠费开机及免押金办理国际及港澳台长途和漫游的特权服务。信用度等级将随着您的在网时长、品牌和消费等情况动态调整，调整后可享受新信用度等级的特权服务。如您不想参与，回复QXXYD即可取消信用度等级特权服务，详询10086。
		  尊敬的{BRAND}客户，根据您近期的消费行为，您的信用度等级本月将调整为0级，本月不享受话费透支的特权服务。信用度等级每月自动调整，调整后将执行新的等级和透支额度。如您不想参与，回复QXXYD即可取消信用度等级的优惠特权，详询10086。
		  尊敬的{BRAND}客户，您尚未结清上月话费账单，请您在本月16日前交清欠费。逾期未交，本月信用度等级将降为0级，您将无法享受话费透支的特权服务，手机也将停机。您的信用度降为0级后只要交清欠费并保持正常通信，次月还将参与信用度等级的自动评定。如您不想参与，回复QXXYD即可取消信用度等级的优惠特权，详询10086。
	 * @version v1.0.0
	 * @author kangzk
	 * @date Oct 5, 2012 4:42:25 PM
	 * 
	 * <strong>Modification History:</strong><br>
	 * Date         Author          Version            Description<br>
	 * ---------------------------------------------------------<br>
	 * Oct 5, 2012     kangzk           v1.0.0               修改原因<br>
	 */
	public static void businessSendSms(List sendList) throws Exception {
		List mapList=new ArrayList();
		for (int i = 0; i < sendList.size(); i++) {
			Map sendMap=(Map)sendList.get(i);
			String billId=String.valueOf(sendMap.get("billId"));
			String sendType=String.valueOf(sendMap.get("sendType"));
			DataContainer dt=(DataContainer)sendMap.get("dt");
			Map msgMap=new HashMap();
			int sendTypeInter=Integer.valueOf(sendType);
			switch (sendTypeInter) {
				case CmLnConstants.CM_SEND_TYPE.CODE_18000003://预存款信用度升级
					msgMap.put(CmLnConstants.CM_SEND_CODE.BRAND, dt.get(CmLnConstants.CM_SEND_CODE.BRAND));
					msgMap.put(CmLnConstants.CM_SEND_CODE.CREDIT_CLASS, dt.get(CmLnConstants.CM_SEND_CODE.CREDIT_CLASS));
					msgMap.put(CmLnConstants.CM_SEND_CODE.CREDIT_FEE, dt.get(CmLnConstants.CM_SEND_CODE.CREDIT_FEE));
					break;
				case CmLnConstants.CM_SEND_TYPE.CODE_18000004://预存款信用度降级
					msgMap.put(CmLnConstants.CM_SEND_CODE.BRAND, dt.get(CmLnConstants.CM_SEND_CODE.BRAND));
					msgMap.put(CmLnConstants.CM_SEND_CODE.OLD_CREDIT_CLASS, dt.get(CmLnConstants.CM_SEND_CODE.OLD_CREDIT_CLASS));
					msgMap.put(CmLnConstants.CM_SEND_CODE.NEW_CREDIT_CLASS, dt.get(CmLnConstants.CM_SEND_CODE.NEW_CREDIT_CLASS));
					msgMap.put(CmLnConstants.CM_SEND_CODE.CREDIT_FEE, dt.get(CmLnConstants.CM_SEND_CODE.CREDIT_FEE));
					break;
				case CmLnConstants.CM_SEND_TYPE.CODE_18000005://预存款信用度初始：
					msgMap.put(CmLnConstants.CM_SEND_CODE.BRAND, dt.get(CmLnConstants.CM_SEND_CODE.BRAND));
					msgMap.put(CmLnConstants.CM_SEND_CODE.CREDIT_CLASS, dt.get(CmLnConstants.CM_SEND_CODE.CREDIT_CLASS));
					msgMap.put(CmLnConstants.CM_SEND_CODE.CREDIT_FEE, dt.get(CmLnConstants.CM_SEND_CODE.CREDIT_FEE));
					break;
				case CmLnConstants.CM_SEND_TYPE.CODE_18000006://托收信用度升级：
					msgMap.put(CmLnConstants.CM_SEND_CODE.OLD_CREDIT_CLASS, dt.get(CmLnConstants.CM_SEND_CODE.OLD_CREDIT_CLASS));
					msgMap.put(CmLnConstants.CM_SEND_CODE.NEW_CREDIT_CLASS, dt.get(CmLnConstants.CM_SEND_CODE.NEW_CREDIT_CLASS));
					break;
				case CmLnConstants.CM_SEND_TYPE.CODE_18000007://托收信用度升级：
					msgMap.put(CmLnConstants.CM_SEND_CODE.BILLID, dt.get(CmLnConstants.CM_SEND_CODE.BRAND));
					msgMap.put(CmLnConstants.CM_SEND_CODE.BRAND, dt.get(CmLnConstants.CM_SEND_CODE.BRAND));
					msgMap.put(CmLnConstants.CM_SEND_CODE.OLD_CREDIT_CLASS, dt.get(CmLnConstants.CM_SEND_CODE.OLD_CREDIT_CLASS));
					msgMap.put(CmLnConstants.CM_SEND_CODE.NEW_CREDIT_CLASS, dt.get(CmLnConstants.CM_SEND_CODE.NEW_CREDIT_CLASS));
					break;
				case CmLnConstants.CM_SEND_TYPE.CODE_18000008://托收信用度降级
					msgMap.put(CmLnConstants.CM_SEND_CODE.OLD_CREDIT_CLASS, dt.get(CmLnConstants.CM_SEND_CODE.OLD_CREDIT_CLASS));
					msgMap.put(CmLnConstants.CM_SEND_CODE.NEW_CREDIT_CLASS, dt.get(CmLnConstants.CM_SEND_CODE.NEW_CREDIT_CLASS));
					break;
				case CmLnConstants.CM_SEND_TYPE.CODE_18000009://托收信用度降级
					msgMap.put(CmLnConstants.CM_SEND_CODE.OLD_CREDIT_CLASS, dt.get(CmLnConstants.CM_SEND_CODE.OLD_CREDIT_CLASS));
					msgMap.put(CmLnConstants.CM_SEND_CODE.NEW_CREDIT_CLASS, dt.get(CmLnConstants.CM_SEND_CODE.NEW_CREDIT_CLASS));
					break;
				case CmLnConstants.CM_SEND_TYPE.CODE_18000010://托收信用度初始
					msgMap.put(CmLnConstants.CM_SEND_CODE.CREDIT_CLASS, dt.get(CmLnConstants.CM_SEND_CODE.CREDIT_CLASS));
					break;
				case CmLnConstants.CM_SEND_TYPE.CODE_18000011://托收信用度初始
					msgMap.put(CmLnConstants.CM_SEND_CODE.CREDIT_CLASS, dt.get(CmLnConstants.CM_SEND_CODE.CREDIT_CLASS));
					break;
				case CmLnConstants.CM_SEND_TYPE.CODE_18000012://无欠费账单
					msgMap.put(CmLnConstants.CM_SEND_CODE.BRAND, dt.get(CmLnConstants.CM_SEND_CODE.BRAND));
					break;
				case CmLnConstants.CM_SEND_TYPE.CODE_18000013://有欠费账单
					msgMap.put(CmLnConstants.CM_SEND_CODE.BRAND, dt.get(CmLnConstants.CM_SEND_CODE.BRAND));
					break;
				case CmLnConstants.CM_SEND_TYPE.CODE_18000014://大客户生日提醒
					msgMap.put(CmLnConstants.CM_SEND_CODE.NAME, dt.get(CmLnConstants.CM_SEND_CODE.NAME));
					msgMap.put(CmLnConstants.CM_SEND_CODE.MONTH, dt.get(CmLnConstants.CM_SEND_CODE.MONTH));
					msgMap.put(CmLnConstants.CM_SEND_CODE.DAY, dt.get(CmLnConstants.CM_SEND_CODE.DAY));
					break;
				case CmLnConstants.CM_SEND_TYPE.CODE_18000001://自定义模板
					msgMap.put(CmLnConstants.CM_SEND_CODE.SMS_TXT, dt.get(CmLnConstants.CM_SEND_CODE.SMS_TXT));
					break;	
				default:
					break;
			}
			HashMap sendPackage=new HashMap();
			String regionId = CenterUtil.getRegionIdByBillId(billId); // 根据手机号获取地市
			// 短信模板赋值
			sendPackage.put("DESTNUM", billId);//下发号码
			sendPackage.put("OPTCODE", "2001");// 短信KEY String开发组根据数字型业务编解码BusinessID转换
			sendPackage.put("REGION_ID",regionId); // 地市
			sendPackage.put(SMSConstants.SMS_TEMPLATE_ID, sendType);
			sendPackage.put("RTNDATA", msgMap);
			mapList.add(sendPackage);
		}
		ISoSmsPendingSV smsPendingSV = (ISoSmsPendingSV) ServiceFactory.getService(ISoSmsPendingSV.class);
		smsPendingSV.saveSmsPendings(SMSConstants.SMS_BATCH_PENDING, (HashMap[])mapList.toArray(new HashMap[0]));
	}
	


	public static void main(String[] args) throws Exception {
		List list=new ArrayList();
		DataContainer dt=new DataContainer();
		Map msgMap=new HashMap();
		CenterFactory.setCenterInfoByTypeAndValue(CenterType.BILL_ID, "13840161273");
		msgMap.put("billId","13840161273");
		msgMap.put("sendType",CmLnConstants.CM_SEND_TYPE.CODE_18000003);
		msgMap.put(CmLnConstants.CM_SEND_CODE.BRAND, dt.get(CmLnConstants.CM_SEND_CODE.BRAND));
		msgMap.put(CmLnConstants.CM_SEND_CODE.CREDIT_CLASS, dt.get(CmLnConstants.CM_SEND_CODE.CREDIT_CLASS));
		msgMap.put(CmLnConstants.CM_SEND_CODE.CREDIT_FEE, dt.get(CmLnConstants.CM_SEND_CODE.CREDIT_FEE));
		dt.set(CmLnConstants.CM_SEND_CODE.BRAND, "Global communication");
		dt.set(CmLnConstants.CM_SEND_CODE.CREDIT_CLASS, "3");
		dt.set(CmLnConstants.CM_SEND_CODE.CREDIT_FEE, "1000");
		msgMap.put("dt",dt);
		String[] bill=new String[1];
		bill[0]="13478390168";
		String[] send=new String[1];
		send[0]=String.valueOf(CmLnConstants.CM_SEND_TYPE.CODE_18000003);
		list.add(msgMap);
		CmLnSmsSend.businessSendSms(list);
	}

}
