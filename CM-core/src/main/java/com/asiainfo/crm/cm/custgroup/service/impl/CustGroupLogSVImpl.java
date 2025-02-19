package com.asiainfo.crm.cm.custgroup.service.impl;

import java.sql.Timestamp;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import com.asiainfo.crm.util.StringUtil;
import net.sf.json.JSONArray;
import net.sf.json.JSONObject;

import org.apache.commons.lang.StringUtils;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import com.ai.appframe2.common.AIException;
import com.ai.appframe2.common.ServiceManager;
import com.ai.appframe2.common.SessionManager;
import com.ai.appframe2.privilege.UserInfoInterface;
import com.ai.appframe2.service.ServiceFactory;
import com.ai.common.util.ExceptionUtil;
import com.ai.omframe.util.TimeUtil;
import com.ai.secframe.common.OrgModelConstants;
import com.asiainfo.crm.cm.common.CmConstants;
import com.asiainfo.crm.cm.custgroup.bo.BOCmGroupLogBean;
import com.asiainfo.crm.cm.custgroup.bo.BOCmGroupLogEngine;
import com.asiainfo.crm.cm.custgroup.dao.interfaces.IGroupLogDAO;
import com.asiainfo.crm.cm.custgroup.ivalues.IBOCmGeneralConfigValue;
import com.asiainfo.crm.cm.custgroup.ivalues.IBOCmGroupLogValue;
import com.asiainfo.crm.cm.custgroup.ivalues.IBOCmGroupMemberInfoValue;
import com.asiainfo.crm.cm.custgroup.service.interfaces.ICustGroupLogSV;
import com.asiainfo.crm.cm.custgroup.utils.CmGroupConstants;
import com.asiainfo.crm.cm.custgroup.utils.InnerServiceFactory;
import com.asiainfo.crm.cm.model.ivalues.ICustomerValue;
import com.asiainfo.crm.cm.teaminvoke.out.service.interfaces.ICmCustomerSV;
import com.asiainfo.crm.constant.RBossConst;

/**
 * 
 * 群组日志的 行为库
 *
 */
public class CustGroupLogSVImpl implements ICustGroupLogSV {

	public static transient Log log = (Log) LogFactory.getLog(CustGroupLogSVImpl.class);	
	
	public IBOCmGroupLogValue[] getGroupLogs(long customerGroupId,long logCreator,int logType,String logEventType,
			int sortType,String startDate,String endDate,int startNum,int endNum) throws Exception {
		
		boolean isCustGroupOwner = false;
		IBOCmGroupMemberInfoValue[] groupMemberValues = InnerServiceFactory.getCustGroupMemberSV()
				.queryCmGroupMemberInfoByCondition(logCreator, customerGroupId, -1, CmGroupConstants.MemberStatus.Valid, -1, -1);
		if(groupMemberValues!=null && groupMemberValues.length>0){
			//是群成员才能查询日志
			IBOCmGroupMemberInfoValue groupMemberValue = groupMemberValues[0];
			long groupRole = groupMemberValue.getGroupRole();
			if(CmGroupConstants.GroupRole.Owner == groupRole){
				isCustGroupOwner = true;
			}else{
				isCustGroupOwner = false;
			}
		}
		
		String curYM = null;
		if(StringUtils.isNotBlank(startDate)){
			SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
			Calendar calendar = Calendar.getInstance();
			calendar.setTime(new Date());
			calendar.add(Calendar.MONTH, -2);
			Date earliestDate = calendar.getTime();
			Date starDateTime = format.parse(startDate);
			//查询的时间超过3个月，返回空
			if(starDateTime.before(earliestDate)){
				return null;
			}else{
				SimpleDateFormat format1 = new SimpleDateFormat("yyyyMM");
				curYM = format1.format(starDateTime);
			}
		}
		
		StringBuffer sql = new StringBuffer("");
		sql.append(" select * from party.cm_group_log_21_"+curYM+" where 1=1 ");
		if(customerGroupId>0){
			sql.append(" and group_id = "+customerGroupId);
			if(isCustGroupOwner){
				//群主
				sql.append(" and ( (log_creator = "+ logCreator +" and log_level = 4 ) or log_level = 1 or log_level = 2 or log_level = 3 ) ");
			}else{
				//如果是普通成员,可以查看他自己发起的事件日志和等级为member的
				sql.append(" and (log_creator = "+ logCreator +" and (log_level = 2 or log_level = 4) or log_level = 1 ) ");
			}
		}else{
			//没有groupId，查history，直接根据custId查
			sql.append(" and log_creator = "+ logCreator);
		}
		if(logType>0){
			sql.append(" and log_type = "+logType);
		}
		if(StringUtils.isNotBlank(logEventType)){
			sql.append(" and log_event_type = '"+ logEventType +"'");
		}
		if(StringUtils.isNotBlank(startDate) && StringUtils.isNotBlank(endDate)){
			sql.append(" and (event_create_date >= '"+startDate+"' and event_create_date <= '"+endDate+"' ) ");
		}
		if(sortType==0){
			sql.append(" order by event_create_date,LOG_INFO_INDEX ASC ");
		}else if(sortType==1){
			sql.append(" order by event_create_date desc ,LOG_INFO_INDEX ASC ");
		}
		sql.append(" limit "+startNum+","+endNum);
		IGroupLogDAO groupLogDAO = (IGroupLogDAO)ServiceFactory.getService(IGroupLogDAO.class);
		return groupLogDAO.queryGroupLogBySql(sql.toString(), null);
	}
	
	/**
	 * 客户优惠变更日志
	 * @param custId
	 * @param startDate
	 * @param endDate
	 * @return
	 * @throws Exception
	 */
	public IBOCmGroupLogValue[] getGroupLogsByCustomerId(long custId,String startDate,String endDate) throws Exception {
		StringBuffer sql = new StringBuffer("");
		String curYM = null;
		SimpleDateFormat format1 = new SimpleDateFormat("yyyyMM");
		if(StringUtils.isNotBlank(startDate)){
			curYM = format1.format(startDate);
			
			sql.append(" select * from party.cm_group_log_21_"+curYM+" where log_creator = " + custId );
			sql.append(" and log_type = 4 and log_event_type = 'SHOW_PREFERENCE' ");
			sql.append(" and (event_create_date >= '"+startDate+"' and event_create_date <= '"+endDate+"' ) ");
		}
		
		String endYM = null;
		if(StringUtils.isNotBlank(endDate)){
			endYM = format1.format(endDate);
			if(!endYM.equals(curYM)){
				sql.append(" UNION select * from party.cm_group_log_21_"+endYM+" where log_creator = " + custId );
				sql.append(" and log_type = 4 and log_event_type = 'SHOW_PREFERENCE' ");
				sql.append(" and (event_create_date >= '"+startDate+"' and event_create_date <= '"+endDate+"' ) ");

				String nextYM = null;
				
				SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
				Date endDateTime = format.parse(endDate);
				
				Calendar calendar = Calendar.getInstance();
				calendar.setTime(new Date(startDate));
				calendar.add(Calendar.MONTH, 1);
				Date nextMonthDate = calendar.getTime();
				
				while(endDateTime.after(nextMonthDate)){
					nextYM = format1.format(nextMonthDate);
					if(!nextYM.equals(endYM)){
						sql.append(" UNION select * from party.cm_group_log_21_"+nextYM+" where log_creator = " + custId );
						sql.append(" and log_type = 4 and log_event_type = 'SHOW_PREFERENCE' ");
						sql.append(" and (event_create_date >= '"+startDate+"' and event_create_date <= '"+endDate+"' ) ");
					}
					
					calendar.add(Calendar.MONTH, 1);
					nextMonthDate = calendar.getTime();
				}
			}
		}
		sql.append(" order by event_create_date desc");
		IGroupLogDAO groupLogDAO = (IGroupLogDAO)ServiceFactory.getService(IGroupLogDAO.class);
		return groupLogDAO.queryGroupLogBySql(sql.toString(), null);
	}
	
	public IBOCmGroupLogValue addGroupLog(Map<String,Object> paraMap){
		try{
			Long custGroupId = (Long)paraMap.get("custGroupId");
			Long custId = (Long)paraMap.get("custId");
			String logEventType = (String)paraMap.get("logEventType");
			Long operatorObjectId = (Long)paraMap.get("operatorObjectId");
			Timestamp eventCreateDate = (Timestamp)paraMap.get("eventCreateDate");//引发这个日志的事件源的创建时间
			
			IBOCmGeneralConfigValue[] custGroupLogEventCfgs = InnerServiceFactory.getCmGeneralConfigSV()
					.getGeneralConfigs(CmGroupConstants.srcType.fmcCustGroup, CmGroupConstants.configType.logType, logEventType, "U");
			IBOCmGeneralConfigValue[] custGroupLogParams = InnerServiceFactory.getCmGeneralConfigSV()
					.getGeneralConfigs(CmGroupConstants.srcType.fmcCustGroup, CmGroupConstants.configType.logParams, logEventType, "U");
			if(custGroupLogEventCfgs != null && custGroupLogEventCfgs.length > 0 && custGroupLogParams != null && custGroupLogParams.length > 0){
				IBOCmGeneralConfigValue eventCfg = custGroupLogEventCfgs[0];
				
				String logParams = custGroupLogParams[0].getValue1();
				
				IBOCmGroupLogValue groupLogValue = new BOCmGroupLogBean();
				
				groupLogValue.setGroupId(custGroupId);
				groupLogValue.setLogCreator(custId);
				if (SessionManager.getUser()!=null){
					groupLogValue.setCreateOpId(SessionManager.getUser().getID());
					groupLogValue.setCreateOrgId(SessionManager.getUser().getOrgId());
				}
				
				if(operatorObjectId!=null){
					groupLogValue.setOperatorObjectId(operatorObjectId);
				}
				groupLogValue.setCreateDate(TimeUtil.getDefaultSysDate());
				groupLogValue.setEventCreateDate(eventCreateDate);
				groupLogValue.setLogType(Long.parseLong(eventCfg.getValue2()));
				groupLogValue.setLogEventType(logEventType);
				groupLogValue.setLogLevel(Long.parseLong(eventCfg.getValue3()));
				
				String logInfoValue = getLogInfo(eventCfg, paraMap,logParams);
				//生产一个批次号
			    String batchDealId  = com.ai.common.util.TimeUtil.getYYYYMMDDHHMMSS(new Date())+StringUtil.getRandomString(10);
			    groupLogValue.setBatchDealId(batchDealId);
				System.out.println("=======logInfoValue==="+logInfoValue);
				if(StringUtils.isNotBlank(logInfoValue)){
					/*int i_logInfoNum = logInfoValue.length()/12000;
					if(logInfoValue.length()>i_logInfoNum*12000){
						i_logInfoNum = i_logInfoNum + 1;
					}
					if(logInfoValue.length()>0&&i_logInfoNum==0){
						i_logInfoNum = 1;
					}
					for (int i = 1; i <= i_logInfoNum; i++) {
						IBOCmGroupLogValue groupLogValue_clone = new BOCmGroupLogBean();
						groupLogValue_clone.copy(groupLogValue);
						
						groupLogValue.setLogId(BOCmGroupLogEngine.getNewId().longValue());
						groupLogValue.setLogInfo1("");
						groupLogValue.setLogInfo2("");
						groupLogValue.setLogInfo3("");
						groupLogValue.setLogInfo4("");
						groupLogValue.setLogInfo5("");
						groupLogValue.setLogInfo6("");
						groupLogValue.setLogInfoIndex(i_logInfoNum);
						if(logInfoValue.length()>(i-1)*12000+12000){
							System.out.println("========= logInfoNum=="+i+"== logInfoValue= "+logInfoValue.substring((i-1)*12000,(i-1)*12000+12000));
							groupLogValue.setLogInfo1(logInfoValue.substring((i-1)*12000,(i-1)*12000+2000));
							groupLogValue.setLogInfo2(logInfoValue.substring((i-1)*12000+2000,(i-1)*12000+4000));
							groupLogValue.setLogInfo3(logInfoValue.substring((i-1)*12000+4000,(i-1)*12000+6000));
							groupLogValue.setLogInfo4(logInfoValue.substring((i-1)*12000+6000,(i-1)*12000+8000));
							groupLogValue.setLogInfo5(logInfoValue.substring((i-1)*12000+8000,(i-1)*12000+10000));
							groupLogValue.setLogInfo6(logInfoValue.substring((i-1)*12000+10000,(i-1)*12000+12000));
						}else if(logInfoValue.length()>(i-1)*12000+10000&&logInfoValue.length()<= (i-1)*12000+12000){
							System.out.println("========= logInfoNum=="+i+"== logInfoValue= "+logInfoValue.substring((i-1)*12000,logInfoValue.length()));
							groupLogValue.setLogInfo1(logInfoValue.substring((i-1)*12000,(i-1)*12000+2000));
							groupLogValue.setLogInfo2(logInfoValue.substring((i-1)*12000+2000,(i-1)*12000+4000));
							groupLogValue.setLogInfo3(logInfoValue.substring((i-1)*12000+4000,(i-1)*12000+6000));
							groupLogValue.setLogInfo4(logInfoValue.substring((i-1)*12000+6000,(i-1)*12000+8000));
							groupLogValue.setLogInfo5(logInfoValue.substring((i-1)*12000+8000,(i-1)*12000+10000));
							groupLogValue.setLogInfo6(logInfoValue.substring((i-1)*12000+10000,logInfoValue.length()));
						}else if(logInfoValue.length()>(i-1)*12000+8000&&logInfoValue.length()<= (i-1)*12000+10000){
							System.out.println("========= logInfoNum=="+i+"== logInfoValue= "+logInfoValue.substring((i-1)*12000,logInfoValue.length()));
							groupLogValue.setLogInfo1(logInfoValue.substring((i-1)*12000,(i-1)*12000+2000));
							groupLogValue.setLogInfo2(logInfoValue.substring((i-1)*12000+2000,(i-1)*12000+4000));
							groupLogValue.setLogInfo3(logInfoValue.substring((i-1)*12000+4000,(i-1)*12000+6000));
							groupLogValue.setLogInfo4(logInfoValue.substring((i-1)*12000+6000,(i-1)*12000+8000));
							groupLogValue.setLogInfo5(logInfoValue.substring((i-1)*12000+8000,logInfoValue.length())); 
						}else if(logInfoValue.length()>(i-1)*12000+6000&&logInfoValue.length()<= (i-1)*12000+8000){
							System.out.println("========= logInfoNum=="+i+"== logInfoValue= "+logInfoValue.substring((i-1)*12000,logInfoValue.length()));
							groupLogValue.setLogInfo1(logInfoValue.substring((i-1)*12000,(i-1)*12000+2000));
							groupLogValue.setLogInfo2(logInfoValue.substring((i-1)*12000+2000,(i-1)*12000+4000));
							groupLogValue.setLogInfo3(logInfoValue.substring((i-1)*12000+4000,(i-1)*12000+6000));
							groupLogValue.setLogInfo4(logInfoValue.substring((i-1)*12000+6000,logInfoValue.length()));
						}else if(logInfoValue.length()>(i-1)*12000+4000&&logInfoValue.length()<= (i-1)*12000+6000){
							System.out.println("========= logInfoNum=="+i+"== logInfoValue= "+logInfoValue.substring((i-1)*12000,logInfoValue.length()));
							groupLogValue.setLogInfo1(logInfoValue.substring((i-1)*12000,(i-1)*12000+2000));
							groupLogValue.setLogInfo2(logInfoValue.substring((i-1)*12000+2000,(i-1)*12000+4000));
							groupLogValue.setLogInfo3(logInfoValue.substring((i-1)*12000+4000,logInfoValue.length()));
						}else if(logInfoValue.length()>(i-1)*12000+2000&&logInfoValue.length()<= (i-1)*12000+4000){
							System.out.println("========= logInfoNum=="+i+"== logInfoValue= "+logInfoValue.substring((i-1)*12000,logInfoValue.length()));
							groupLogValue.setLogInfo1(logInfoValue.substring((i-1)*12000,(i-1)*12000+2000));
							groupLogValue.setLogInfo2(logInfoValue.substring((i-1)*12000+2000,logInfoValue.length()));
						}else{
							System.out.println("========= logInfoNum=="+i+"== logInfoValue= "+logInfoValue.substring((i-1)*12000,logInfoValue.length()));
							groupLogValue.setLogInfo1(logInfoValue.substring((i-1)*12000,logInfoValue.length()));
						}
						IGroupLogDAO groupLogDAO = (IGroupLogDAO)ServiceFactory.getService(IGroupLogDAO.class);
						groupLogDAO.addGroupLog(groupLogValue);
					}*/
					System.out.println("=======logInfoValue==="+logInfoValue);
					int i_logInfoNum = logInfoValue.length()/12000;
					if(logInfoValue.length()>i_logInfoNum*12000){
						i_logInfoNum = i_logInfoNum + 1;
					}
					if(logInfoValue.length()>0&&i_logInfoNum==0){
						i_logInfoNum = 1;
					}
					for (int i = 1; i <= i_logInfoNum; i++) {
						IBOCmGroupLogValue groupLogValue_clone = new BOCmGroupLogBean();
						groupLogValue_clone.copy(groupLogValue);
						groupLogValue_clone.setLogId(BOCmGroupLogEngine.getNewId().longValue());
						groupLogValue_clone.setLogInfo1("");
						groupLogValue_clone.setLogInfo2("");
						groupLogValue_clone.setLogInfo3("");
						groupLogValue_clone.setLogInfo4("");
						groupLogValue_clone.setLogInfo5("");
						groupLogValue_clone.setLogInfo6("");
						if(logInfoValue.length()>(i-1)*12000+12000){
							System.out.println("========= logInfoNum=="+i+"== logInfoValue= "+logInfoValue.substring((i-1)*12000,(i-1)*12000+12000));
							groupLogValue_clone.setLogInfo1(logInfoValue.substring((i-1)*12000,(i-1)*12000+2000));
							groupLogValue_clone.setLogInfo2(logInfoValue.substring((i-1)*12000+200,(i-1)*12000+4000));
							groupLogValue_clone.setLogInfo3(logInfoValue.substring((i-1)*12000+4000,(i-1)*12000+6000));
							groupLogValue_clone.setLogInfo4(logInfoValue.substring((i-1)*12000+6000,(i-1)*12000+8000));
							groupLogValue_clone.setLogInfo5(logInfoValue.substring((i-1)*12000+8000,(i-1)*12000+10000));
							groupLogValue_clone.setLogInfo6(logInfoValue.substring((i-1)*12000+10000,(i-1)*12000+12000));
						}else if(logInfoValue.length()>(i-1)*12000+10000&&logInfoValue.length()<= (i-1)*12000+12000){
							System.out.println("========= logInfoNum=="+i+"== logInfoValue= "+logInfoValue.substring((i-1)*12000,logInfoValue.length()));
							groupLogValue_clone.setLogInfo1(logInfoValue.substring((i-1)*12000,(i-1)*12000+2000));
							groupLogValue_clone.setLogInfo2(logInfoValue.substring((i-1)*12000+2000,(i-1)*12000+4000));
							groupLogValue_clone.setLogInfo3(logInfoValue.substring((i-1)*12000+4000,(i-1)*12000+6000));
							groupLogValue_clone.setLogInfo4(logInfoValue.substring((i-1)*12000+6000,(i-1)*12000+8000));
							groupLogValue_clone.setLogInfo5(logInfoValue.substring((i-1)*12000+8000,(i-1)*12000+10000));
							groupLogValue_clone.setLogInfo6(logInfoValue.substring((i-1)*12000+10000,logInfoValue.length()));
						}else if(logInfoValue.length()>(i-1)*12000+8000&&logInfoValue.length()<= (i-1)*12000+10000){
							System.out.println("========= logInfoNum=="+i+"== logInfoValue= "+logInfoValue.substring((i-1)*12000,logInfoValue.length()));
							groupLogValue_clone.setLogInfo1(logInfoValue.substring((i-1)*12000,(i-1)*12000+2000));
							groupLogValue_clone.setLogInfo2(logInfoValue.substring((i-1)*12000+2000,(i-1)*12000+4000));
							groupLogValue_clone.setLogInfo3(logInfoValue.substring((i-1)*12000+4000,(i-1)*12000+6000));
							groupLogValue_clone.setLogInfo4(logInfoValue.substring((i-1)*12000+6000,(i-1)*12000+8000));
							groupLogValue_clone.setLogInfo5(logInfoValue.substring((i-1)*12000+8000,logInfoValue.length())); 
						}else if(logInfoValue.length()>(i-1)*12000+6000&&logInfoValue.length()<= (i-1)*12000+8000){
							System.out.println("========= logInfoNum=="+i+"== logInfoValue= "+logInfoValue.substring((i-1)*12000,logInfoValue.length()));
							groupLogValue_clone.setLogInfo1(logInfoValue.substring((i-1)*12000,(i-1)*12000+2000));
							groupLogValue_clone.setLogInfo2(logInfoValue.substring((i-1)*12000+2000,(i-1)*12000+4000));
							groupLogValue_clone.setLogInfo3(logInfoValue.substring((i-1)*12000+4000,(i-1)*12000+6000));
							groupLogValue_clone.setLogInfo4(logInfoValue.substring((i-1)*12000+6000,logInfoValue.length()));
						}else if(logInfoValue.length()>(i-1)*12000+4000&&logInfoValue.length()<= (i-1)*12000+6000){
							System.out.println("========= logInfoNum=="+i+"== logInfoValue= "+logInfoValue.substring((i-1)*12000,logInfoValue.length()));
							groupLogValue_clone.setLogInfo1(logInfoValue.substring((i-1)*12000,(i-1)*12000+2000));
							groupLogValue_clone.setLogInfo2(logInfoValue.substring((i-1)*12000+2000,(i-1)*12000+4000));
							groupLogValue_clone.setLogInfo3(logInfoValue.substring((i-1)*12000+4000,logInfoValue.length()));
						}else if(logInfoValue.length()>(i-1)*12000+2000&&logInfoValue.length()<= (i-1)*12000+4000){
							System.out.println("========= logInfoNum=="+i+"== logInfoValue= "+logInfoValue.substring((i-1)*12000,logInfoValue.length()));
							groupLogValue_clone.setLogInfo1(logInfoValue.substring((i-1)*12000,(i-1)*12000+2000));
							groupLogValue_clone.setLogInfo2(logInfoValue.substring((i-1)*12000+2000,logInfoValue.length()));
						}else{
							System.out.println("========= logInfoNum=="+i+"== logInfoValue= "+logInfoValue.substring((i-1)*12000,logInfoValue.length()));
							groupLogValue_clone.setLogInfo1(logInfoValue.substring((i-1)*12000,logInfoValue.length()));
						}
						IGroupLogDAO groupLogDAO = (IGroupLogDAO)ServiceFactory.getService(IGroupLogDAO.class);
						groupLogDAO.addGroupLog(groupLogValue_clone);
					}
				}else{
					IGroupLogDAO groupLogDAO = (IGroupLogDAO)ServiceFactory.getService(IGroupLogDAO.class);
					groupLogDAO.addGroupLog(groupLogValue);
				}
			
				return groupLogValue;
			}else{
				//do nothing
				return null;
			}
		}catch(Exception e){
			e.printStackTrace();
			return null;
		}
	}
	
	/**
	 * 根据事件获取对应事件的日志内容
	 * @author huanglun
	 * @date 2018年9月13日 下午3:01:49
	 * @param logEventType
	 * @param eventConfig
	 * @param paraMap
	 * @return
	 */
	private String getLogInfo(IBOCmGeneralConfigValue eventConfig,Map<String,Object> paraMap,String logParams) throws Exception{
		Timestamp eventCreateDate = (Timestamp)paraMap.get("eventCreateDate");//引发这个日志的事件源的创建时间
		String logTemplate = eventConfig.getValue1();
		if(StringUtils.isNotBlank(logTemplate) && StringUtils.isNotBlank(logParams)){
			String[] logParamsArray = logParams.split(",");
			for (int i = 0; i < logParamsArray.length; i++) {
				String paramName = logParamsArray[i];
				String paramValue = " ";
				if(CmGroupConstants.GroupLogParam.Creator.equals(paramName) 
						|| CmGroupConstants.GroupLogParam.Admin.equals(paramName) 
						|| CmGroupConstants.GroupLogParam.Old_Admin.equals(paramName)
						|| CmGroupConstants.GroupLogParam.New_Admin.equals(paramName)
						|| CmGroupConstants.GroupLogParam.Invitee.equals(paramName)){
					long custIdParam = 0L;
					try{
						custIdParam = (Long)paraMap.get(paramName);
					}catch(Exception e){
						e.printStackTrace();
					}
					if(custIdParam > 0){
						paramValue = transferCustId2CustName(custIdParam);
					}
				}else if(CmGroupConstants.GroupLogParam.Event_Time.equals(paramName) ){
					SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
					paramValue = sdf.format(eventCreateDate);
				}else if(CmGroupConstants.GroupLogParam.Expiration_date_of_this_invitation.equals(paramName)){
					SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
					paramValue = sdf.format(paraMap.get(paramName));
				}else if(CmGroupConstants.GroupLogParam.Invitation_Id.equals(paramName)
						||CmGroupConstants.GroupLogParam.Group_Member_Count.equals(paramName)){
					paramValue= String.valueOf(paraMap.get(paramName));
				}else{
					paramValue= String.valueOf(paraMap.get(paramName));
				}
				logTemplate = logTemplate.replace("{"+paramName+"}", paramValue);
			}
			return logTemplate;
		}
		return null;
	}
	

	/**
	 * 将客户ID转换成客户名称
	 * @param custId
	 * @return
	 * @throws Exception
	 */
	@SuppressWarnings("finally")
	public String transferCustId2CustName(Long custId){
		String custName = "";
		ICmCustomerSV customerSV = (ICmCustomerSV)ServiceFactory.getService(ICmCustomerSV.class);
		try{
			ICustomerValue customerVal = customerSV.queryCustomerByCustId(custId);
			if(customerVal!=null && customerVal.getCustType() == CmConstants.CustomerType.INDIVIDUAL){
				custName = customerVal.getFirstName() + " " + customerVal.getLastName();
			}else if(customerVal!=null && customerVal.getCustType() == CmConstants.CustomerType.GROUP){
				custName = customerVal.getCustName();
			}
		}catch(Exception e){
			e.printStackTrace();
		}finally{
			return custName;
		}
	}
	
	/**
	 * 查询指定时间开始到当前时间的最老折扣
	* <p>Title: </p>
	* <p>Description: </p>
	* <p>Company: AsiaInfo</p> 
	* @author YuJing
	 * @throws Exception 
	* @date 2018-12-20
	* ICustGroupLogSV
	 */
	@Override
	public String getOldDiscountByCustIDAndTime(Long custId, Timestamp eventTime) throws Exception {
		
		if(custId<=0){
    		ExceptionUtil.throwBusinessException("CCC0000137");
    	}
		//与叶茂确认需求，只取第一条议价变更记录
		JSONObject resultObject = new JSONObject();
		
		IGroupLogDAO groupLogDAO = (IGroupLogDAO)ServiceFactory.getService(IGroupLogDAO.class);
		/*IOrdCustValidAmountSV validSV = (IOrdCustValidAmountSV)ServiceFactory.getService(IOrdCustValidAmountSV.class);
		//查询Amount记录
		IBOOrdCustValidAmountValue[] ordCustValidAmount = validSV.queryOrdCustValidAmountByCondition(custId, CmGroupConstants.GroupType.B2C, CmGroupConstants.OfferGroupType.FMC_GROUP, null, -1, -1);
		for (int i = 0; i < ordCustValidAmount.length; i++) {
		}*/
		
		SimpleDateFormat compareDateFormat = new SimpleDateFormat("yyyy-MM"); 
		String paramTime = compareDateFormat.format(eventTime);
		String nowTime = compareDateFormat.format(new Date());
		IBOCmGroupLogValue[] allGroupLogs = null;
		if(Long.valueOf(paramTime.replace("-", ""))>Long.valueOf(nowTime.replace("-", ""))){
			return resultObject.put("hasValue", "NO").toString();
		}
		Calendar cale = Calendar.getInstance();
		cale.set(Calendar.YEAR, Integer.parseInt(paramTime.split("-")[0]));
		cale.set(Calendar.MONTH, Integer.parseInt(paramTime.split("-")[1]));
		
		Calendar caleNow = Calendar.getInstance();
		caleNow.set(Calendar.YEAR, Integer.parseInt(nowTime.split("-")[0]));
		caleNow.set(Calendar.MONTH, Integer.parseInt(nowTime.split("-")[1]));
		
		if(paramTime.equals(nowTime)){ //输入参数的时间，如果是当月时间，那么就只查当月的一张表
			allGroupLogs =  groupLogDAO.queryGroupLogByCustIDAndEventTime(custId, eventTime,1);
		}else{
			//输入参数的时间，如果不是当月时间，那么一次查询不同月份的表，直到查询到第一条记录
			allGroupLogs =  groupLogDAO.queryGroupLogByCustIDAndEventTime(custId, eventTime,1);
			if(null==allGroupLogs||allGroupLogs.length <= 0){
				for (int i = 1; i < 11; i++) {
					cale.set(Calendar.MONTH,cale.get(Calendar.MONTH)+1);
					Date lastDate = compareDateFormat.parse(cale.get(Calendar.YEAR)+"-"+cale.get(Calendar.MONTH));
					allGroupLogs =  groupLogDAO.queryGroupLogByCustIDAndEventTime(custId, TimeUtil.formatDateTimeToDate(lastDate),2);
					if(null!=allGroupLogs&&allGroupLogs.length>0){
						break;
					}
					if(caleNow.get(Calendar.YEAR)==cale.get(Calendar.YEAR)&&caleNow.get(Calendar.MONTH)==cale.get(Calendar.MONTH)){
						break;
					}
				}
			}
		}
	 
		if(null!=allGroupLogs&&allGroupLogs.length>0){
			IBOCmGroupLogValue[] allGroupLogs_result = null;
			List<IBOCmGroupLogValue> groupLogsList = new ArrayList<IBOCmGroupLogValue>();
			//循环所有记录，组合所有log_info
			String batchDealId_pre = "";
			IBOCmGroupLogValue cmGroupLog_clone = null;
			for (int i = 0; i < allGroupLogs.length; i++) {
				IBOCmGroupLogValue cmGroupLog =  allGroupLogs[i];
				String batchDealId = cmGroupLog.getBatchDealId();
				if(null!=batchDealId&&batchDealId.trim().length()>0){
					if(batchDealId_pre.equals(batchDealId)){
						String loginfoString = cmGroupLog.getLogInfo1()+cmGroupLog.getLogInfo2()+cmGroupLog.getLogInfo3()+
								cmGroupLog.getLogInfo4()+cmGroupLog.getLogInfo5()+cmGroupLog.getLogInfo6();
						cmGroupLog_clone.setLogInfo1(cmGroupLog_clone.getLogInfo1() + loginfoString);
					}else{
						batchDealId_pre = batchDealId;
						cmGroupLog_clone = cloneGroupLogInfo(cmGroupLog);
						String loginfoString = cmGroupLog.getLogInfo1()+cmGroupLog.getLogInfo2()+cmGroupLog.getLogInfo3()+
						cmGroupLog.getLogInfo4()+cmGroupLog.getLogInfo5()+cmGroupLog.getLogInfo6();
						cmGroupLog_clone.setLogInfo1(loginfoString);
						groupLogsList.add(cmGroupLog_clone);
					}
				}else{
					String loginfoString = cmGroupLog.getLogInfo1()+cmGroupLog.getLogInfo2()+cmGroupLog.getLogInfo3()+
							cmGroupLog.getLogInfo4()+cmGroupLog.getLogInfo5()+cmGroupLog.getLogInfo6();
					cmGroupLog_clone = cloneGroupLogInfo(cmGroupLog);
					cmGroupLog_clone.setLogInfo1(loginfoString);
					batchDealId_pre = "";
					groupLogsList.add(cmGroupLog);
				}
			}
			
			allGroupLogs_result = groupLogsList.toArray(new BOCmGroupLogBean[groupLogsList.size()]);
			int i_hasvalue = 0;
			
			for (int k = 0; k < allGroupLogs_result.length; k++) {
				JSONObject oldDiscountInfoObject = new JSONObject();
				JSONArray offerGroupInfoJsonArray = new JSONArray();
				IBOCmGroupLogValue cmGroupLog =  allGroupLogs_result[k];
				long logIndex = 0;
				if(cmGroupLog.getLogInfoIndex()>0){
				    logIndex = cmGroupLog.getLogInfoIndex();
				}
				String loginfo = cmGroupLog.getLogInfo1();
				int firstCharIndex = loginfo.indexOf(": ");
				int firstDouCharIndex = loginfo.indexOf(",",firstCharIndex+1);
				String customerGroupId = loginfo.substring(firstCharIndex+1,firstDouCharIndex);
				customerGroupId = customerGroupId.trim();
				oldDiscountInfoObject.put("customerGroupId", customerGroupId);
				int secondDouCharIndex = loginfo.indexOf(",",firstDouCharIndex+1);
				String oldDisCountInfo = loginfo.substring(secondDouCharIndex+1,loginfo.length()-1);
				JSONArray oldDiscountJsonArray = JSONArray.fromObject(oldDisCountInfo);
				if(null!=oldDiscountJsonArray&&oldDiscountJsonArray.length()>0){
					Map<String,Map<String,String>> compareMap = new HashMap<String,Map<String,String>>();
					for (int i = 0; i < oldDiscountJsonArray.length(); i++) {
						JSONObject oldObject = oldDiscountJsonArray.getJSONObject(i);
						String oldDiscountPercentage = oldObject.optString("Old_Discount_Percentage");
						String offerGroupId = oldObject.optString("Offer_Group_Id");
						String offerGroupType = oldObject.optString("Offer_Group_Type");
						String oldDiscountTier = oldObject.optString("Old_Discount_Tier");
						
						//转换折扣从80% -> 20%
						int nowPercent = Integer.parseInt(oldDiscountPercentage.replace("%", ""));
						nowPercent = 100 - nowPercent;
						
						if(compareMap.containsKey(offerGroupId)){
							Map  resultObj = compareMap.get(offerGroupId);
							String prePercentage = String.valueOf(resultObj.get("oldDiscountPercentage"));
							if(Integer.parseInt(prePercentage.replace("%", ""))>nowPercent){
								resultObj.put("oldDiscountPercentage", nowPercent+"%");
								resultObj.put("oldDiscountTier", oldDiscountTier);
								resultObj.put("offerGroupid", offerGroupId);
								resultObj.put("offerGroupType", offerGroupType);
							}
						}else{
							Map  resultObj = new HashMap();
							resultObj.put("offerGroupid", offerGroupId);
							resultObj.put("offerGroupType", offerGroupType);
							resultObj.put("oldDiscountPercentage", nowPercent+"%");
							resultObj.put("oldDiscountTier", oldDiscountTier);
							compareMap.put(offerGroupId, resultObj);
						}
					}
					
					if(null!=compareMap){
						resultObject.put("hasValue", "YES");
						for (Entry<String, Map<String,String>> entryDiscount : compareMap.entrySet()) { 
							offerGroupInfoJsonArray.put(entryDiscount.getValue());
						}
						oldDiscountInfoObject.put("offerGroupInfo", offerGroupInfoJsonArray);
						resultObject.put("oldDiscountInfo", oldDiscountInfoObject);
						i_hasvalue = 1 ;
					}
				}
				
				if(i_hasvalue==1){
					break;
				}
			}
			if(i_hasvalue==0){
				//如果没有数据集，就设置查询成功，没有数据的标示
				resultObject.put("hasValue", "NO");
			}
		}else{
			//如果没有数据集，就设置查询成功，没有数据的标示
			resultObject.put("hasValue", "NO");
		}
		log.info("getOldDiscountByCustIDAndTime 返回的数据"+resultObject.toString());
		return resultObject.toString();
	}
	
	public IBOCmGroupLogValue cloneGroupLogInfo(IBOCmGroupLogValue oldGroupLogInfo) throws AIException{
		IBOCmGroupLogValue newCmGroupLogValue = new BOCmGroupLogBean();
		newCmGroupLogValue.setLogId(oldGroupLogInfo.getLogId());
		newCmGroupLogValue.setGroupId(oldGroupLogInfo.getGroupId());
		newCmGroupLogValue.setLogCreator(oldGroupLogInfo.getLogCreator());
		newCmGroupLogValue.setCreateOpId(oldGroupLogInfo.getCreateOpId());
		newCmGroupLogValue.setCreateOrgId(oldGroupLogInfo.getCreateOrgId());
		newCmGroupLogValue.setOperatorObjectId(oldGroupLogInfo.getOperatorObjectId());
		newCmGroupLogValue.setCreateDate(oldGroupLogInfo.getCreateDate());
		newCmGroupLogValue.setEventCreateDate(oldGroupLogInfo.getEventCreateDate());
		newCmGroupLogValue.setLogType(oldGroupLogInfo.getLogType());
		newCmGroupLogValue.setLogEventType(oldGroupLogInfo.getLogEventType());
		newCmGroupLogValue.setLogLevel(oldGroupLogInfo.getLogLevel());
		newCmGroupLogValue.setLogInfo1(oldGroupLogInfo.getLogInfo1());
		newCmGroupLogValue.setLogInfo2(oldGroupLogInfo.getLogInfo2());
		newCmGroupLogValue.setLogInfo3(oldGroupLogInfo.getLogInfo3());
		newCmGroupLogValue.setLogInfo4(oldGroupLogInfo.getLogInfo4());
		newCmGroupLogValue.setLogInfo5(oldGroupLogInfo.getLogInfo5());
		newCmGroupLogValue.setLogInfo6(oldGroupLogInfo.getLogInfo6());
		newCmGroupLogValue.setBatchDealId(oldGroupLogInfo.getBatchDealId());
		newCmGroupLogValue.setLogInfoIndex(oldGroupLogInfo.getLogInfoIndex());
		return newCmGroupLogValue;
	}
	
	public static void main2(String[] args) {
		
		JSONObject newObj = new JSONObject();
		newObj.put("kkk", "123");
		newObj.put("kkk", "123");
		newObj.put("kkk", "789");
		System.out.println(newObj.toString());
	}
	
	public static void main3(String[] args) {
		SimpleDateFormat compareDateFormat = new SimpleDateFormat("yyyy-MM-dd-HH"); 
		String nowTime = compareDateFormat.format(new Date());
		Calendar caleNow = Calendar.getInstance();
		caleNow.set(Calendar.YEAR, Integer.parseInt(nowTime.split("-")[0]));
		caleNow.set(Calendar.MONTH, Integer.parseInt(nowTime.split("-")[1]));
		caleNow.add(Calendar.MONTH, -1);
		caleNow.set(Calendar.DAY_OF_MONTH, Integer.parseInt(nowTime.split("-")[2]));
		caleNow.add(Calendar.DAY_OF_MONTH, -1);
		caleNow.set(Calendar.HOUR_OF_DAY, Integer.parseInt(nowTime.split("-")[3]));
		caleNow.set(Calendar.MINUTE, 59);
		caleNow.set(Calendar.SECOND, 59);
		
		System.out.println(new Timestamp(caleNow.getTime().getTime()));
		
		
	}
	public static void main(String[] args) {
		
		System.setProperty("tenant.id", "21");
		UserInfoInterface user;
		try {
			user = ServiceManager.getNewBlankUserInfo();
			user.setCode("21wangwy");
			user.setName("21wangwy");	
			user.setID(410001030L);
			user.setTenantId("21");
			user.set(RBossConst.PUBINFO_CHANNEL_TYPE, "10006");
			user.set(OrgModelConstants.REGION_ID, "2106");
			user.set(OrgModelConstants.DISTRICT_ID, "1005050");
			user.setOrgId(21000000L);
			ServiceManager.setServiceUserInfo(user);
		} catch (Exception e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		
		/*String logInfoValue = "abcdefghijklmnopqrstlllldmmdmdmdmdmdm";
		int i_logInfoNum = logInfoValue.length()/18;
		if(logInfoValue.length()>i_logInfoNum*18){
			i_logInfoNum = i_logInfoNum+1;
		}
		if(logInfoValue.length()>0&&i_logInfoNum==0){
			i_logInfoNum = 1;
		}
		IBOCmGroupLogValue groupLogValue;
		try {
			groupLogValue = new BOCmGroupLogBean();
			groupLogValue.setLogId(20);
		
		for (int i = 1; i <= i_logInfoNum; i++) {
			IBOCmGroupLogValue groupLogValue_clone = new BOCmGroupLogBean();
			groupLogValue_clone.copy(groupLogValue);
			groupLogValue_clone.setLogId(i);
			
			StringBuffer stringBufferTempBuffer = new StringBuffer();
			if(logInfoValue.length()>(i-1)*18+18){
				stringBufferTempBuffer.append(logInfoValue.substring((i-1)*18,(i-1)*18+3));
				stringBufferTempBuffer.append(logInfoValue.substring((i-1)*18+3,(i-1)*18+6));
				stringBufferTempBuffer.append(logInfoValue.substring((i-1)*18+6,(i-1)*18+9));
				stringBufferTempBuffer.append(logInfoValue.substring((i-1)*18+9,(i-1)*18+12));
				stringBufferTempBuffer.append(logInfoValue.substring((i-1)*18+12,(i-1)*18+15));
				stringBufferTempBuffer.append(logInfoValue.substring((i-1)*18+15,(i-1)*18+18));
			}else if(logInfoValue.length()>(i-1)*18+15&&logInfoValue.length()<= (i-1)*18+18){
				stringBufferTempBuffer.append(logInfoValue.substring((i-1)*18,(i-1)*18+3));
				stringBufferTempBuffer.append(logInfoValue.substring((i-1)*18+3,(i-1)*18+6));
				stringBufferTempBuffer.append(logInfoValue.substring((i-1)*18+6,(i-1)*18+9));
				stringBufferTempBuffer.append(logInfoValue.substring((i-1)*18+9,(i-1)*18+12));
				stringBufferTempBuffer.append(logInfoValue.substring((i-1)*18+12,(i-1)*18+18));
				stringBufferTempBuffer.append(logInfoValue.substring((i-1)*18+18,logInfoValue.length()));
			}else if(logInfoValue.length()>(i-1)*18+12&&logInfoValue.length()<= (i-1)*18+15){
				stringBufferTempBuffer.append(logInfoValue.substring((i-1)*18,(i-1)*18+3));
				stringBufferTempBuffer.append(logInfoValue.substring((i-1)*18+3,(i-1)*18+6));
				stringBufferTempBuffer.append(logInfoValue.substring((i-1)*18+6,(i-1)*18+9));
				stringBufferTempBuffer.append(logInfoValue.substring((i-1)*18+9,(i-1)*18+12));
				stringBufferTempBuffer.append(logInfoValue.substring((i-1)*18+12,logInfoValue.length())); 
			}else if(logInfoValue.length()>(i-1)*18+9&&logInfoValue.length()<= (i-1)*18+12){
				stringBufferTempBuffer.append(logInfoValue.substring((i-1)*18,(i-1)*18+3));
				stringBufferTempBuffer.append(logInfoValue.substring((i-1)*18+3,(i-1)*18+6));
				stringBufferTempBuffer.append(logInfoValue.substring((i-1)*18+6,(i-1)*18+9));
				stringBufferTempBuffer.append(logInfoValue.substring((i-1)*18+9,logInfoValue.length()));
			}else if(logInfoValue.length()>(i-1)*18+6&&logInfoValue.length()<= (i-1)*18+9){
				stringBufferTempBuffer.append(logInfoValue.substring((i-1)*18,(i-1)*18+3));
				stringBufferTempBuffer.append(logInfoValue.substring((i-1)*18+3,(i-1)*18+6));
				stringBufferTempBuffer.append(logInfoValue.substring((i-1)*18+6,logInfoValue.length()));
			}else if(logInfoValue.length()>(i-1)*18+3&&logInfoValue.length()<= (i-1)*18+6){
				stringBufferTempBuffer.append(logInfoValue.substring((i-1)*18,(i-1)*18+3));
				stringBufferTempBuffer.append(logInfoValue.substring((i-1)*18+3,logInfoValue.length()));
			}else{
				stringBufferTempBuffer.append(logInfoValue.substring((i-1)*18,logInfoValue.length()));
			}
			groupLogValue.setLogInfo1(stringBufferTempBuffer.toString());
		System.out.println(stringBufferTempBuffer+" "+groupLogValue.getLogInfo1());*/
		
		SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
		Date eventDate;
		try {
			eventDate = dateFormat.parse("2019-12-16 00:00:00");
			InnerServiceFactory.getCustGroupLogSV().getOldDiscountByCustIDAndTime(21210115681622L, new Timestamp(eventDate.getTime()));
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}
