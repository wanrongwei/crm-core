package com.asiainfo.crm.cm.ln.exe.batch.service.impl;

import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.commons.lang.StringUtils;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import com.ai.appframe2.bo.DataContainer;
import com.ai.appframe2.common.ServiceManager;
import com.ai.appframe2.service.ServiceFactory;
import com.ai.common.i18n.CrmLocaleFactory;
import com.ai.common.util.ExceptionUtil;
import com.asiainfo.crm.cm.common.CmServiceFactory;
import com.asiainfo.crm.cm.common.bo.BOCmGroupSchoolInfoBean;
import com.asiainfo.crm.cm.common.bo.BOCmGroupSchoolInfoEngine;
import com.asiainfo.crm.cm.common.bo.BOCmGsChanMemberBean;
import com.asiainfo.crm.cm.common.bo.BOCmGsChanTeamBean;
import com.asiainfo.crm.cm.common.bo.BOCmGsScheduleInfoBean;
import com.asiainfo.crm.cm.common.bo.BOCmGsStudInfoBean;
import com.asiainfo.crm.cm.common.bo.BOCmGsTchrInfoBean;
import com.asiainfo.crm.cm.common.bo.BOGroupArchivesBean;
import com.asiainfo.crm.cm.common.bo.BOGroupArchivesEngine;
import com.asiainfo.crm.cm.common.bo.BoGroupArchivesMemberBean;
import com.asiainfo.crm.cm.common.ivalues.IBOCmGroupSchoolInfoValue;
import com.asiainfo.crm.cm.common.ivalues.IBOCmGsChanMemberValue;
import com.asiainfo.crm.cm.common.ivalues.IBOCmGsScheduleInfoValue;
import com.asiainfo.crm.cm.common.ivalues.IBOCmGsStudInfoValue;
import com.asiainfo.crm.cm.common.ivalues.IBOCmGsTchrInfoValue;
import com.asiainfo.crm.cm.common.ivalues.IBOGroupArchivesValue;
import com.asiainfo.crm.cm.common.ivalues.IBoGroupArchivesMemberValue;
import com.asiainfo.crm.cm.common.service.interfaces.ICmCampusInfoSV;
import com.asiainfo.crm.cm.common.util.CmCommonUtil;
import com.asiainfo.crm.cm.customer.speusermain.bo.BOCmUserSpeuserMainBean;
import com.asiainfo.crm.cm.customer.speusermain.ivalues.IBOCmUserSpeuserMainValue;
import com.asiainfo.crm.cm.ln.common.util.CmLnCommonUtil;
import com.asiainfo.crm.cm.ln.common.util.CmLnConstants;
import com.asiainfo.crm.cm.ln.customer.indiv.service.interfaces.ICmLnIndivSV;
import com.asiainfo.crm.cm.ln.exe.batch.service.interfaces.ICmSchoolInfoBatchManagerSV;
import com.asiainfo.crm.cm.model.bean.VOAccountBean;
import com.asiainfo.crm.cm.model.bean.VOCustBean;
import com.asiainfo.crm.cm.model.ivalues.IAccountValue;
import com.asiainfo.crm.cm.model.ivalues.IVOAccountValue;
import com.asiainfo.crm.cm.model.ivalues.IVOCustValue;
import com.asiainfo.crm.cm.service.interfaces.ICmAccountSV;
import com.asiainfo.crm.cm.service.interfaces.ICmGroupArchivesMemberSV;
import com.asiainfo.crm.cm.service.interfaces.ICmGroupArchivesSV;
import com.asiainfo.crm.cm.service.interfaces.ICmSchoolInfoManagerSV;
import com.asiainfo.crm.cm.teaminvoke.in.service.interfaces.ICmTeamInvokeSV;
import com.asiainfo.crm.so.common.ivalues.IBOUserInfoValue;

public class CmSchoolInfoBatchManagerSVImpl implements
		ICmSchoolInfoBatchManagerSV {
	private transient static Log log = LogFactory.getLog(CmSchoolInfoBatchManagerSVImpl.class);
	/**
	 * 校园教职工信息批量导入
	 */
	public void importGsTchrInfo(String[] colNames, String[] colValues,
			Map commonInfo) throws Exception {
		//IBOCmGsTchrInfoValue[] cmGsTchrInfo = new IBOCmGsTchrInfoValue[1];
		BOCmGsTchrInfoBean cmGsTchrInfoValue = new BOCmGsTchrInfoBean();
		for (int i = 0; i < colValues.length; i++) {
			if (StringUtils.isBlank(colValues[i])) {
				if ("PHONE_ID".equals(colNames[i])) {
					log.error(CrmLocaleFactory.getResource("CMS5000087")); // 手机号码不能为空！
					ExceptionUtil.throwBusinessException("CMS5000087");
			}else if("NAME".equals(colNames[i])){
				log.error("Staff name can not be empty!");
				ExceptionUtil.throwBusinessException("Staff name can not be empty!");
			}else if("SCHOOL_ID".equals(colNames[i])){
				log.error("School coding can not be empty !"); 
				ExceptionUtil.throwBusinessException("School coding can not be empty !");
			} 
			}else {
				if("SCHOOL_ID".equals(colNames[i])){
					int auditStatus = isAudit(colValues[i]);
					if(auditStatus == 1){
						cmGsTchrInfoValue.setSchoolId(Long.parseLong(colValues[i]));
					}else if(auditStatus == -1){
			        ExceptionUtil.throwBusinessException("The campus information does not exist , can not be imported !");   
					}else{
			        ExceptionUtil.throwBusinessException("The campus information does not exist , can not be imported !");   
					}	
				}else if ("PHONE_ID".equals(colNames[i])) {
					cmGsTchrInfoValue.setPhoneId(colValues[i]);
				}else if ("NAME".equals(colNames[i])) {
					cmGsTchrInfoValue.setName(colValues[i]);
				}else if ("GENDER".equals(colNames[i])) {
					if (colValues[i]!=null && !"".equals(colValues[i])) {
						cmGsTchrInfoValue.setGender(Integer.parseInt(colValues[i]));
					}
				}else if ("BRAND".equals(colNames[i])) {
					if (colValues[i]!=null && !"".equals(colValues[i])) {
						cmGsTchrInfoValue.setBrand(Integer.parseInt(colValues[i]));						}
				}else if ("HEADSHIP".equals(colNames[i])) {
					if (colValues[i]!=null && !"".equals(colValues[i])) {
						cmGsTchrInfoValue.setHeadship(colValues[i]);
					}
				}else if ("DEPT".equals(colNames[i])) {
					if (colValues[i]!=null && !"".equals(colValues[i])) {
						cmGsTchrInfoValue.setDept(colValues[i]);
					}
				}else if ("IS_COUNSELOR".equals(colNames[i])) {
					if (colValues[i]!=null && !"".equals(colValues[i])) {
						cmGsTchrInfoValue.setIsCounselor(Integer.parseInt(colValues[i]));
					}
				}
			}
		}
		DataContainer dc = new DataContainer();
		dc.copy(cmGsTchrInfoValue);
		int count = getCmSchoolInfoManagerSV().getCmGsTchrInfoBeanByName(dc);
		if(count != 0){
			 ExceptionUtil.throwBusinessException("The faculty information already exists , you can not be imported !");
		}
		cmGsTchrInfoValue.setStsToNew();
		cmGsTchrInfoValue.setOperType(1);
		cmGsTchrInfoValue.setAuditSts(1);
		String regionId = CmCommonUtil.getDefaultRegionId();
		cmGsTchrInfoValue.setRegionId(regionId);
		//cmGsTchrInfo[0] = cmGsTchrInfoValue;
		((ICmSchoolInfoManagerSV)ServiceFactory.getService(ICmSchoolInfoManagerSV.class)).saveGsTchrInfo(new BOCmGsTchrInfoBean[]{cmGsTchrInfoValue});
	}
	/**
	 * 校园直销员信息批量导入
	 */
	public void importGsChanTeam(String[] colNames, String[] colValues,
			Map commonInfo) throws Exception {
		
		//IBOCmGsChanMemberValue[] cmGsChanMember = new IBOCmGsChanMemberValue[1];
		BOCmGsChanMemberBean cmGsChanMemberValue = new BOCmGsChanMemberBean();
		for (int i = 0; i < colValues.length; i++) {
			if (StringUtils.isBlank(colValues[i])) {
				if ("TEAM_ID".equals(colNames[i])) {
					log.error("Direct team number can not be empty!");
					ExceptionUtil.throwBusinessException("Direct team number can not be empty!");
			}else if("SCHOOL_ID".equals(colNames[i])){
				log.error("School coding can not be empty !"); // 手机号码不能为空！
				ExceptionUtil.throwBusinessException("School coding can not be empty !");
			}else if("TEAM_NAME".equals(colNames[i])){
				log.error("Direct team name can not be empty!"); 
				ExceptionUtil.throwBusinessException("Direct team name can not be empty!");
			} else if("MEMBER_NAME".equals(colNames[i])){
				log.error("Direct team name can not be empty!"); 
				ExceptionUtil.throwBusinessException("Direct team name can not be empty!");
			} else if("MEMBER_PHONE".equals(colNames[i])){
				log.error("Contact can not be empty !"); 
				ExceptionUtil.throwBusinessException("Contact can not be empty !");
			} else if("WORK_TYPE".equals(colNames[i])){
				log.error("Type of work can not be empty !"); 
				ExceptionUtil.throwBusinessException("Type of work can not be empty !");
			} else if("WORK_AREA".equals(colNames[i])){
				log.error("Work can not be empty !"); 
				ExceptionUtil.throwBusinessException("Work can not be empty !");
			} else if("SALARIAT".equals(colNames[i])){
				log.error("Pay scales can not be empty !"); 
				ExceptionUtil.throwBusinessException("Pay scales can not be empty !");
			} else if("MEMBER_DEGREE".equals(colNames[i])){
				log.error("Education can not be empty !");
				ExceptionUtil.throwBusinessException("Education can not be empty !");
			} else if("MEMBER_GENDER".equals(colNames[i])){
				log.error("Sex can not be empty !"); 
				ExceptionUtil.throwBusinessException("Sex can not be empty !");
			}
			}else {
				if("SCHOOL_ID".equals(colNames[i])){
					int auditStatus = isAudit(colValues[i]);
					if(auditStatus == 1){
						cmGsChanMemberValue.setSchoolId(Long.parseLong(colValues[i]));  
					}else if(auditStatus == -1){
			        ExceptionUtil.throwBusinessException("The campus information does not exist , can not be imported !");   
					}else{
			        ExceptionUtil.throwBusinessException("The campus information does not exist , can not be imported !");   
					}	
				}else if ("TEAM_ID".equals(colNames[i])) {
					cmGsChanMemberValue.setTeamId(Long.parseLong(colValues[i]));
				}else if ("TEAM_NAME".equals(colNames[i])) {
					cmGsChanMemberValue.setTeamName(colValues[i]);
				}else if ("MEMBER_NAME".equals(colNames[i])) {
					if (colValues[i]!=null && !"".equals(colValues[i])) {
						cmGsChanMemberValue.setMemberName(colValues[i]);
					}
				}else if ("MEMBER_PHONE".equals(colNames[i])) {
					if (colValues[i]!=null && !"".equals(colValues[i])) {
						cmGsChanMemberValue.setMemberPhone(colValues[i]);						}
				}else if ("WORK_TYPE".equals(colNames[i])) {
					if (colValues[i]!=null && !"".equals(colValues[i])) {
						cmGsChanMemberValue.setWorkType(Integer.parseInt(colValues[i]));
					}
				}else if ("WORK_AREA".equals(colNames[i])) {
					if (colValues[i]!=null && !"".equals(colValues[i])) {
						cmGsChanMemberValue.setWorkArea(colValues[i]);
					}
				}else if ("SALARIAT".equals(colNames[i])) {
					if (colValues[i]!=null && !"".equals(colValues[i])) {
						cmGsChanMemberValue.setSalariat(colValues[i]);
					}
				}else if ("MEMBER_DEGREE".equals(colNames[i])) {
					if (colValues[i]!=null && !"".equals(colValues[i])) {
						cmGsChanMemberValue.setMemberDegree(Integer.parseInt(colValues[i]));
					}
				}else if ("MEMBER_GENDER".equals(colNames[i])) {
					if (colValues[i]!=null && !"".equals(colValues[i])) {
						cmGsChanMemberValue.setMemberGender(Integer.parseInt(colValues[i]));
					}
				}else if ("HEADSHIP".equals(colNames[i])) {
					if (colValues[i]!=null && !"".equals(colValues[i])) {
						cmGsChanMemberValue.setHeadship(colValues[i]);
					}
				}else if ("GRADUATE_DATE".equals(colNames[i])) {
					if (colValues[i]!=null && !"".equals(colValues[i])) {
						cmGsChanMemberValue.setGraduateDate(Timestamp.valueOf(colValues[i]));
					}
				}else if ("IS_PRINCIPAL".equals(colNames[i])) {
					if (colValues[i]!=null && !"".equals(colValues[i])) {
						cmGsChanMemberValue.setIsPrincipal(Integer.parseInt(colValues[i]));
					}
				}
			}
		}
	    ICmSchoolInfoManagerSV iCmSchoolInfoManagerSV = (ICmSchoolInfoManagerSV) ServiceFactory.getService(ICmSchoolInfoManagerSV.class);
		long schoolId = cmGsChanMemberValue.getSchoolId();
        DataContainer[] dc = iCmSchoolInfoManagerSV.queryGsChanTeam(String.valueOf(schoolId), -1, -1);
        if(dc == null || dc.length == 0){//如果该校园下没有直销队信息则直接抛出一样
        	log.error("Direct team does not exist!");
        	ExceptionUtil.throwBusinessException("Direct team does not exist!");
        }else if(dc.length >= 1){
        	BOCmGsChanTeamBean[] values = (BOCmGsChanTeamBean[]) dc;
        	long teamId = cmGsChanMemberValue.getTeamId();
        	List list = new ArrayList();
        	List compareList = new ArrayList();
        	for (int j = 0; j < values.length; j++) {//遍历查询出的数组对象
        		list.add(values[j].getTeamId());//将所有的直销队ID放入list
        		if(values[j].getAuditSts() == 1){
        		compareList.add(values[j].getTeamId());//将所有审核过的直销队ID放入compareList
        		}
        	}
        	if(list!= null && list.contains(teamId)){//如果查询出的所有ID中包含有批量导入记录中的ID
        		if(compareList!= null && compareList.contains(teamId)){////如果该记录审核，则执行插入操作
        			cmGsChanMemberValue.setStsToNew();
    				cmGsChanMemberValue.setOperType(1);
    				cmGsChanMemberValue.setAuditSts(1);
    				String regionId = CmCommonUtil.getDefaultRegionId();
    				cmGsChanMemberValue.setRegionId(regionId);
    			((ICmSchoolInfoManagerSV)ServiceFactory.getService(ICmSchoolInfoManagerSV.class)).saveChanMember(new BOCmGsChanMemberBean[]{cmGsChanMemberValue});	
        		}else{//该直销队为未审核
                	log.error("The direct sales team unaudited !");
                	ExceptionUtil.throwBusinessException("The direct sales team unaudited !");		
        		}
	        	}else{//如果查询出的所有ID中不包含有该条批量导入记录中的ID
        		log.error("Direct team does not exist!");
            	ExceptionUtil.throwBusinessException("Direct team does not exist!");
//        	log.error("直销队未审核！");
//        	ExceptionUtil.throwBusinessException("直销队未审核！");	
        	}
        }
	
	}
	
	public void importGsScheduleInfo(String[] colNames, String[] colValues,
			Map commonInfo) throws Exception {
		BOCmGsScheduleInfoBean cmGsScheduleInfoValue = new BOCmGsScheduleInfoBean();
		for (int i = 0; i < colValues.length; i++) {
			if (StringUtils.isBlank(colValues[i])) {
				if ("PHONE_ID".equals(colNames[i])) {
					log.error(CrmLocaleFactory.getResource("CMS5000087")); // 手机号码不能为空！
					ExceptionUtil.throwBusinessException("CMS5000087");
				}else if("PROMOTE_TYPE".equals(colNames[i])){
					log.error("Marketing types can not be empty!"); 
					ExceptionUtil.throwBusinessException("Marketing types can not be empty!");
				}else if("IS_FRESHMAN".equals(colNames[i])){
					log.error("Whether the newborn can not be empty !"); 
					ExceptionUtil.throwBusinessException("Whether the newborn can not be empty !");
				}else if("SCHOOL_ID".equals(colNames[i])){
					log.error("School coding can not be empty !"); // 手机号码不能为空！
					ExceptionUtil.throwBusinessException("School coding can not be empty !");
				}
			}else {
				if("SCHOOL_ID".equals(colNames[i])){
					int auditStatus = isAudit(colValues[i]);
					if(auditStatus == 1){
						 cmGsScheduleInfoValue.setSchoolId(Long.parseLong(colValues[i])); 					
				    }else if(auditStatus == -1){
			        ExceptionUtil.throwBusinessException("The campus information does not exist , that can not be imported !");   
					}else{
			        ExceptionUtil.throwBusinessException("The unaudited campus information , you can not be imported!");   
					}
				}else if ("PHONE_ID".equals(colNames[i])) {
					cmGsScheduleInfoValue.setPhoneId(colValues[i]);
				}else if ("PROMOTE_TYPE".equals(colNames[i])) {
					if (colValues[i]!=null && !"".equals(colValues[i])) {
						cmGsScheduleInfoValue.setPromoteType(Integer.parseInt(colValues[i]));						}
				}else if ("IS_FRESHMAN".equals(colNames[i])) {
					if (colValues[i]!=null && !"".equals(colValues[i])) {
						cmGsScheduleInfoValue.setIsFreshman(Integer.parseInt(colValues[i]));
					}
				}else if ("SCHOOL_AREA_CODE".equals(colNames[i])) {
					if (colValues[i]!=null && !"".equals(colValues[i])) {
						cmGsScheduleInfoValue.setSchoolAreaCode(colValues[i]);
					}
				} 
			}
		}
		cmGsScheduleInfoValue.setStsToNew();
		cmGsScheduleInfoValue.setOperType(1);
		cmGsScheduleInfoValue.setAuditSts(1);//批量导入时默认该数据是审核通过的
		String regionId = CmCommonUtil.getDefaultRegionId();
		cmGsScheduleInfoValue.setRegionId(regionId);
		((ICmSchoolInfoManagerSV)ServiceFactory.getService(ICmSchoolInfoManagerSV.class)).saveGsScheduleInfo(new BOCmGsScheduleInfoBean[]{cmGsScheduleInfoValue});
	}
	
	public void importCmGroupSchoolInfo(String[] colNames, String[] colValues,
			Map commonInfo) throws Exception {
		
		//IBOCmGroupSchoolInfoValue[] cmGsChanMember = new IBOCmGroupSchoolInfoValue[1];
		BOCmGroupSchoolInfoBean cmGsChanMemberValue = new BOCmGroupSchoolInfoBean();
		for (int i = 0; i < colValues.length; i++) {
			if (StringUtils.isBlank(colValues[i])) {
				if ("SCHOOL_NAME".equals(colNames[i])) {
					log.error("School name can not be empty!");
					ExceptionUtil.throwBusinessException("School name can not be empty!");
				}else if("SCHOOL_PROPERTY".equals(colNames[i])){
					log.error("The nature of school can not be empty !"); 
					ExceptionUtil.throwBusinessException("The nature of school can not be empty !");
				}else if("YKT".equals(colNames[i])){
					log.error("Campus Card can not be empty !"); 
					ExceptionUtil.throwBusinessException("Campus Card can not be empty !");
				} else if("MASTER_DEPT".equals(colNames[i])){
					log.error("The competent authorities can not be empty !"); 
					ExceptionUtil.throwBusinessException("The competent authorities can not be empty !");
				} else if("SCHOOL_TYPE".equals(colNames[i])){
					log.error("School Type can not be empty !"); 
					ExceptionUtil.throwBusinessException("School Type can not be empty !");
				} else if("STUDEND_SUM".equals(colNames[i])){
					log.error("The number of students can not be empty !"); 
					ExceptionUtil.throwBusinessException("The number of students can not be empty !");
				} else if("REGION_CODE".equals(colNames[i])){
					log.error("The attribution can not be empty !"); 
					ExceptionUtil.throwBusinessException("The attribution can not be empty !");
				} else if("COUNTY_CODE".equals(colNames[i])){
					log.error("The attribution of marketing area can not be empty!");
					ExceptionUtil.throwBusinessException("The attribution of marketing area can not be empty!");
				} else if("CMCC_SUM".equals(colNames[i])){
					log.error("China Mobile, the number of customers can not be empty !"); 
					ExceptionUtil.throwBusinessException("China Mobile, the number of customers can not be empty !");
				 } else if("RECRUIT_SUM".equals(colNames[i])){
						log.error("Enrollment this year can not be empty !"); 
						ExceptionUtil.throwBusinessException("Enrollment this year can not be empty !");
				 }else if("TEACHER_SUM".equals(colNames[i])){
						log.error("Staff numbers can not be empty !"); 
						ExceptionUtil.throwBusinessException("Staff numbers can not be empty !");
			     }else if("SCHOOL_ADDRESS".equals(colNames[i])){
						log.error("School address can not be empty !"); 
						ExceptionUtil.throwBusinessException("School address can not be empty !");
			     }else if("SCHOOL_WAP".equals(colNames[i])){
						log.error("School's Web site can not be empty !"); 
						ExceptionUtil.throwBusinessException("School's Web site can not be empty !");
			     }else if("CMCC_WLAN".equals(colNames[i])){
						log.error("Whether the mobile campus WLAN coverage can not be empty !"); 
						ExceptionUtil.throwBusinessException("Whether the mobile campus WLAN coverage can not be empty !");
			     }else if("CMCC_WIRE".equals(colNames[i])){
						log.error("Whether mobile broadband coverage is limited on campus can not be empty !"); 
						ExceptionUtil.throwBusinessException("Whether mobile broadband coverage is limited on campus can not be empty !");
			     }else if("CT_WLAN".equals(colNames[i])){
						log.error("Whether Telecom campus WLAN coverage can not be empty !"); 
						ExceptionUtil.throwBusinessException("Whether Telecom campus WLAN coverage can not be empty !");
			     }else if("CT_WIRE".equals(colNames[i])){
						log.error("Are telecommunications limited broadband coverage campus can not be empty !"); 
						ExceptionUtil.throwBusinessException("Are telecommunications limited broadband coverage campus can not be empty !");
			     }else if("CU_WLAN".equals(colNames[i])){
						log.error("Are Unicom campus WLAN coverage can not be empty !"); 
						ExceptionUtil.throwBusinessException("Are Unicom campus WLAN coverage can not be empty !");
			     }else if("CU_WIRE".equals(colNames[i])){
						log.error("Are Unicom limited broadband coverage campus can not be empty !"); 
						ExceptionUtil.throwBusinessException("Are Unicom limited broadband coverage campus can not be empty !");
			     }
			}else {
				if("SCHOOL_ID".equals(colNames[i])){
					 if(isAudit(colValues[i]) != 1){
						 ExceptionUtil.throwBusinessException("The unaudited campus information , you can not import !");   
						   }
				}else if ("SCHOOL_NAME".equals(colNames[i])) {
					cmGsChanMemberValue.setSchoolName(colValues[i]);
				}else if ("SCHOOL_PROPERTY".equals(colNames[i])) {
					cmGsChanMemberValue.setSchoolProperty(Integer.parseInt(colValues[i]));
				}else if ("MASTER_DEPT".equals(colNames[i])) {
					if (colValues[i]!=null && !"".equals(colValues[i])) {
						cmGsChanMemberValue.setMasterDept(Integer.parseInt(colValues[i]));
					}
				}else if ("SCHOOL_TYPE".equals(colNames[i])) {
					if (colValues[i]!=null && !"".equals(colValues[i])) {
						cmGsChanMemberValue.setSchoolType(Integer.parseInt(colValues[i]));						}
				}else if ("STUDEND_SUM".equals(colNames[i])) {
					if (colValues[i]!=null && !"".equals(colValues[i])) {
						cmGsChanMemberValue.setStudendSum(Integer.parseInt(colValues[i]));
					}
				}else if ("REGION_CODE".equals(colNames[i])) {
					if (colValues[i]!=null && !"".equals(colValues[i])) {
						cmGsChanMemberValue.setRegionCode(Integer.parseInt(colValues[i]));
					}
				}else if ("COUNTY_CODE".equals(colNames[i])) {
					if (colValues[i]!=null && !"".equals(colValues[i])) {
						cmGsChanMemberValue.setCountyCode(Integer.parseInt(colValues[i]));
					}
				}else if ("CMCC_SUM".equals(colNames[i])) {
					if (colValues[i]!=null && !"".equals(colValues[i])) {
						cmGsChanMemberValue.setCmccSum(Long.parseLong(colValues[i]));
					}
				}else if ("RECRUIT_SUM".equals(colNames[i])) {
					if (colValues[i]!=null && !"".equals(colValues[i])) {
						cmGsChanMemberValue.setRecruitSum(Long.parseLong(colValues[i]));
					}
				}else if ("TEACHER_SUM".equals(colNames[i])) {
					if (colValues[i]!=null && !"".equals(colValues[i])) {
						cmGsChanMemberValue.setTeacherSum(Long.parseLong(colValues[i]));
					}
				}else if ("SCHOOL_ADDRESS".equals(colNames[i])) {
					if (colValues[i]!=null && !"".equals(colValues[i])) {
						cmGsChanMemberValue.setSchoolAddress(colValues[i]);
					}
				}else if ("SCHOOL_WAP".equals(colNames[i])) {
					if (colValues[i]!=null && !"".equals(colValues[i])) {
						cmGsChanMemberValue.setSchoolWap(colValues[i]);
					}
				}else if ("CMCC_WLAN".equals(colNames[i])) {
					if (colValues[i]!=null && !"".equals(colValues[i])) {
						cmGsChanMemberValue.setCmccWlan(Integer.parseInt(colValues[i]));
					}
				}else if ("CMCC_WIRE".equals(colNames[i])) {
					if (colValues[i]!=null && !"".equals(colValues[i])) {
						cmGsChanMemberValue.setCmccWire(Integer.parseInt(colValues[i]));
					}
				}else if ("CT_WLAN".equals(colNames[i])) {
					if (colValues[i]!=null && !"".equals(colValues[i])) {
						cmGsChanMemberValue.setCtWlan(Integer.parseInt(colValues[i]));
					}
				}else if ("CT_WIRE".equals(colNames[i])) {
					if (colValues[i]!=null && !"".equals(colValues[i])) {
						cmGsChanMemberValue.setCtWire(Integer.parseInt(colValues[i]));
					}
				}else if ("CU_WLAN".equals(colNames[i])) {
					if (colValues[i]!=null && !"".equals(colValues[i])) {
						cmGsChanMemberValue.setCuWlan(Integer.parseInt(colValues[i]));
					}
				}else if ("CU_WIRE".equals(colNames[i])) {
					if (colValues[i]!=null && !"".equals(colValues[i])) {
						cmGsChanMemberValue.setCuWire(Integer.parseInt(colValues[i]));
					}
				}else if ("PSCHOOL_ID".equals(colNames[i])) {
					if (colValues[i]!=null && !"".equals(colValues[i])) {
						cmGsChanMemberValue.setPschoolId(Long.parseLong(colValues[i]));
					}
				}else if ("GROUP_ID".equals(colNames[i])) {
					if (colValues[i]!=null && !"".equals(colValues[i])) {
						cmGsChanMemberValue.setGroupId(Long.parseLong(colValues[i]));
					}
				}else if ("CU_SUM".equals(colNames[i])) {
					if (colValues[i]!=null && !"".equals(colValues[i])) {
						cmGsChanMemberValue.setCuSum(Long.parseLong(colValues[i]));
					}
				}else if ("CT_SUM".equals(colNames[i])) {
					if (colValues[i]!=null && !"".equals(colValues[i])) {
						cmGsChanMemberValue.setCtSum(Long.parseLong(colValues[i]));
					}
				}else if ("LONGITUDE".equals(colNames[i])) {
					if (colValues[i]!=null && !"".equals(colValues[i])) {
						cmGsChanMemberValue.setLongitude(Long.parseLong(colValues[i]));
					}
				}else if ("LATITUDE".equals(colNames[i])) {
					if (colValues[i]!=null && !"".equals(colValues[i])) {
						cmGsChanMemberValue.setLatitude(Long.parseLong(colValues[i]));
					}
				}else if ("YKT".equals(colNames[i])) {
					if (colValues[i]!=null && !"".equals(colValues[i])) {
						cmGsChanMemberValue.setYkt(Integer.parseInt(colValues[i]));
					}
				}
			}
		}
		cmGsChanMemberValue.setStsToNew();
		cmGsChanMemberValue.setOperType(1);
		cmGsChanMemberValue.setAuditSts(1);//批量导入时默认该数据是审核通过的
		String regionId = CmCommonUtil.getDefaultRegionId();
		cmGsChanMemberValue.setRegionId(regionId);
		//cmGsChanMember[0] = cmGsChanMemberValue;
		((ICmCampusInfoSV)ServiceFactory.getService(ICmCampusInfoSV.class)).saveCampusInfo(cmGsChanMemberValue);
	}
	
	public void importGsStudInfo(String[] colNames, String[] colValues,
			Map commonInfo) throws Exception {
		//IBOCmGsStudInfoValue[] cmGsChanMember = new IBOCmGsStudInfoValue[1];
		BOCmGsStudInfoBean cmGsChanMemberValue = new BOCmGsStudInfoBean();
		for (int i = 0; i < colValues.length; i++) {
			if (StringUtils.isBlank(colValues[i])) {
				if ("YEAR".equals(colNames[i])) {
					log.error("The start of School year can not be empty !");
					ExceptionUtil.throwBusinessException("The start of School year can not be empty !");
				}else if("ACADEMY".equals(colNames[i])){
					log.error("Departments can not be empty!"); 
					ExceptionUtil.throwBusinessException("Departments can not be empty!");
				}else if("CLASS_NAME".equals(colNames[i])){
					log.error("Class can not be empty!"); 
					ExceptionUtil.throwBusinessException("Class can not be empty!");
				} else if("GENDER".equals(colNames[i])){
					log.error("Sex can not be empty!"); 
					ExceptionUtil.throwBusinessException("Sex can not be empty!");
				} else if("PHONE_ID".equals(colNames[i])){
					log.error("Phone ID cannot be empty!"); 
					ExceptionUtil.throwBusinessException("Phone ID cannot be empty!");
				} else if("NAME".equals(colNames[i])){
					log.error("Student name cannot be empty!");
					ExceptionUtil.throwBusinessException("Student name cannot be empty!");
				}else if("SCHOOL_ID".equals(colNames[i])){
					log.error("School code can not be empty!"); // 手机号码不能为空！
					ExceptionUtil.throwBusinessException("School code can not be empty!");
				}
			}else {
				if("SCHOOL_ID".equals(colNames[i])){
					int auditStatus = isAudit(colValues[i]);
					if(auditStatus == 1){
					cmGsChanMemberValue.setSchoolId(Long.parseLong(colValues[i]));
				    }else if(auditStatus == -1){
			        ExceptionUtil.throwBusinessException("The campus information does not exist,that can not be imported!");   
					}else{
			        ExceptionUtil.throwBusinessException("The campus information does not exist,that can not be imported!");   
					}
				}else if ("YEAR".equals(colNames[i])) {
					cmGsChanMemberValue.setYear(colValues[i]);
				}else if ("ACADEMY".equals(colNames[i])) {
					cmGsChanMemberValue.setAcademy(colValues[i]);
				}else if ("IDENTIFY_METHOD".equals(colNames[i])) {
					if (colValues[i]!=null && !"".equals(colValues[i])) {
						cmGsChanMemberValue.setIdentifyMethod(Integer.parseInt(colValues[i]));
					}
				}else if ("CLASS_NAME".equals(colNames[i])) {
					if (colValues[i]!=null && !"".equals(colValues[i])) {
						cmGsChanMemberValue.setClassName(colValues[i]);						}
				}else if ("GENDER".equals(colNames[i])) {
					if (colValues[i]!=null && !"".equals(colValues[i])) {
						cmGsChanMemberValue.setGender(Integer.parseInt(colValues[i]));
					}
				}else if ("PHONE_ID".equals(colNames[i])) {
					if (colValues[i]!=null && !"".equals(colValues[i])) {
						cmGsChanMemberValue.setPhoneId(colValues[i]);
					}
				}else if ("NAME".equals(colNames[i])) {
					if (colValues[i]!=null && !"".equals(colValues[i])) {
						cmGsChanMemberValue.setName(colValues[i]);
					}
				}else if ("ID_CODE".equals(colNames[i])) {
					if (colValues[i]!=null && !"".equals(colValues[i])) {
						cmGsChanMemberValue.setIdCode(colValues[i]);
					}
				}else if ("DEGREE".equals(colNames[i])) {
					if (colValues[i]!=null && !"".equals(colValues[i])) {
						cmGsChanMemberValue.setDegree(Integer.parseInt(colValues[i]));
					}
				}else if ("BRAND".equals(colNames[i])) {
					if (colValues[i]!=null && !"".equals(colValues[i])) {
						cmGsChanMemberValue.setBrand(Integer.parseInt(colValues[i]));
					}
				}else if ("HOME_ADDRESS".equals(colNames[i])) {
					if (colValues[i]!=null && !"".equals(colValues[i])) {
						cmGsChanMemberValue.setHomeAddress(colValues[i]);
					}
				}
			}
		}
		DataContainer dc = new DataContainer();
		dc.copy(cmGsChanMemberValue);
		int count = getCmSchoolInfoManagerSV().getCmGsStudInfoByName(dc);
		if(count != 0){
			 ExceptionUtil.throwBusinessException("The student information already exists,that can not be imported!");
		}
		cmGsChanMemberValue.setStsToNew();
		cmGsChanMemberValue.setOperType(1);
		cmGsChanMemberValue.setAuditSts(1);
		String regionId = CmCommonUtil.getDefaultRegionId();
		cmGsChanMemberValue.setRegionId(regionId);
		//cmGsChanMember[0] = cmGsChanMemberValue;
		((ICmSchoolInfoManagerSV)ServiceFactory.getService(ICmSchoolInfoManagerSV.class)).saveGsStudInfo(new BOCmGsStudInfoBean[]{cmGsChanMemberValue});
	}
/**
 * 建档职员批量导入
 */
	public void importGroupMember(String[] colNames, String[] colValues,
			Map commonInfo) throws Exception {
		//IBoGroupArchivesMemberValue[] cmGsScheduleInfo = new IBoGroupArchivesMemberValue[1];
		BoGroupArchivesMemberBean cmGsScheduleInfoValue = new BoGroupArchivesMemberBean();
		for (int i = 0; i < colValues.length; i++) {
			if (StringUtils.isBlank(colValues[i])) {
				if ("GROUP_SEQ".equals(colNames[i])) {
					log.error("File group code can not be empty!"); 
					ExceptionUtil.throwBusinessException("File group code can not be empty!");
				}else if("MEMBER_PHONE_ID".equals(colNames[i])){
					log.error("The staff's mobile phone number can not be empty!"); 
					ExceptionUtil.throwBusinessException("The staff's mobile phone number can not be empty!");
				}
			}else {
				if ("GROUP_SEQ".equals(colNames[i])) {
					int count = getGroupMemberById(colValues[i]);
					if (count == 0) {
						ExceptionUtil.throwBusinessException("The group file does not exist!");
					}else{
						cmGsScheduleInfoValue.setGroupSeq(colValues[i]);
					}
				}else if ("MEMBER_PHONE_ID".equals(colNames[i])) {
					if (colValues[i]!=null && !"".equals(colValues[i])) {
						cmGsScheduleInfoValue.setMemberPhoneId(colValues[i]);						}
				}else if ("MEMBER_TYPE".equals(colNames[i])) {
					if (colValues[i]!=null && !"".equals(colValues[i])) {
						cmGsScheduleInfoValue.setMemberType(Integer.parseInt(colValues[i]));						}
				}else if ("MEMBER_STS".equals(colNames[i])) {
					if (colValues[i]!=null && !"".equals(colValues[i])) {
						cmGsScheduleInfoValue.setMemberSts(Integer.parseInt(colValues[i]));
					}
				}else if ("WORK_DEPT".equals(colNames[i])) {
					if (colValues[i]!=null && !"".equals(colValues[i])) {
						cmGsScheduleInfoValue.setWorkDept(colValues[i]);
					}
				}else if ("MEMBER_NAME".equals(colNames[i])) {
					if (colValues[i]!=null && !"".equals(colValues[i])) {
						cmGsScheduleInfoValue.setMemberName(colValues[i]);
					}
				} 
			}
		}
		cmGsScheduleInfoValue.setStsToNew();
		cmGsScheduleInfoValue.setOperType(1);
		String regionId = CmCommonUtil.getDefaultRegionId();
		cmGsScheduleInfoValue.setRegionId(regionId);
		//cmGsScheduleInfo[0] = cmGsScheduleInfoValue;
		((ICmGroupArchivesMemberSV)ServiceFactory.getService(ICmGroupArchivesMemberSV.class)).saveGroupArchivesMember(new BoGroupArchivesMemberBean[]{cmGsScheduleInfoValue});
	}
	
/**
 * 
* @Function: CmSchoolInfoBatchManagerSVImpl.java
* @Description: 判断该学校信息是否审核 如果没有审核不能批量添加
*
* @param:参数描述
* @return：返回结果描述
* @throws：异常描述
*
* @version: v1.0.0
* @author: suntao6
 * @throws Exception 
* @date: Oct 29, 2012 3:06:53 PM 
*
* Modification History:
* Date         Author          Version            Description
*---------------------------------------------------------*
* Oct 29, 2012     suntao6           v1.0.0              修改原因
 */
	public int isAudit(String schoolId) throws Exception{
		int iAudit = 0;
		int schoolCount = getCampusSchoolById(schoolId);//根据校园PK_ID查找校园信息
		if(schoolCount == 0){
			iAudit = -1;	
		}else{
			IBOCmGroupSchoolInfoValue  value = 
				((ICmCampusInfoSV)ServiceFactory.getService(ICmCampusInfoSV.class)).queryCampusinfoBySchoolId(schoolId);
		    iAudit = value.getAuditSts();
		}
		return iAudit;
	}
	
	/**
	 * 
	* @Function: CmGroupSchoolInfoDAOImpl.java
	* @Description: 根据学校ID
	*
	* @param:参数描述
	* @return：返回结果描述
	* @throws：异常描述
	*
	* @version: v1.0.0
	* @author: suntao6
	* @date: Aug 15, 2012 2:09:08 PM 
	*
	* Modification History:
	* Date         Author          Version            Description
	*---------------------------------------------------------*
	* Aug 15, 2012     suntao6           v1.0.0              修改原因
	 */
	public int getCampusSchoolById(String schoolId)
			throws Exception {
		 StringBuilder condition = new StringBuilder();
		 HashMap paraMap = new HashMap();
		 condition.append(" 1=1 ");
		 if(!"".equals(schoolId)&&!"null".equals(schoolId)&&schoolId!=null){
		  condition.append(" and "+IBOCmGroupSchoolInfoValue.S_SchoolId + "  = :schoolId ");
		  paraMap.put("schoolId", schoolId);
		 }
		 IBOCmGroupSchoolInfoValue[] values =   BOCmGroupSchoolInfoEngine.getBeans(condition.toString(),paraMap);
		 int count = values.length;
		 return count;
	}
	public int getGroupMemberById(String groupSeq)throws Exception {
			 StringBuilder condition = new StringBuilder();
			 HashMap paraMap = new HashMap();
			 condition.append(" 1=1 ");
			 if(!"".equals(groupSeq)&&!"null".equals(groupSeq)&&groupSeq!=null){
			  condition.append(" and "+IBOGroupArchivesValue.S_GroupSeq + "  = :groupSeq ");
			  paraMap.put("groupSeq", groupSeq);
			 }
			 IBOGroupArchivesValue[] values =   BOGroupArchivesEngine.getBeans(condition.toString(),paraMap);
			 int count = values.length;
			 return count;
}
	public void importGroupArchive(String[] colNames, String[] colValues,
			Map commonInfo) throws Exception {
		//IBoGroupArchivesMemberValue[] cmGsScheduleInfo = new IBoGroupArchivesMemberValue[1];
		BOGroupArchivesBean cmGsScheduleInfoValue = new BOGroupArchivesBean();
		for (int i = 0; i < colValues.length; i++) {
			if (StringUtils.isBlank(colValues[i])) {
				if ("GROUP_NAME".equals(colNames[i])) {
					log.error("The group file name cannot be empty!"); 
					ExceptionUtil.throwBusinessException("The group file name cannot be empty!");
				}else if("ORG_TYPE".equals(colNames[i])){
					log.error("The types of institutions can not be empty!"); 
					ExceptionUtil.throwBusinessException("The types of institutions can not be empty!");
				}else if("TRADE_TYPE".equals(colNames[i])){
					log.error("The sectors can not be empty!");
					ExceptionUtil.throwBusinessException("The sectors can not be empty!");
				}else if(" CUST_LEVEL".equals(colNames[i])){
					log.error("The customer level cannot be empty!"); 
					ExceptionUtil.throwBusinessException("The customer level cannot be empty!");
				}
			}else {
				if ("ADDRESS_CODE".equals(colNames[i])) {
					if (colValues[i]!=null && !"".equals(colValues[i])) {
						cmGsScheduleInfoValue.setAddressCode(Long.parseLong(colValues[i]));	
				}
				}else if ("AREA_NUM".equals(colNames[i])) {
					if (colValues[i]!=null && !"".equals(colValues[i])) {
						cmGsScheduleInfoValue.setAreaNum(colValues[i]);						}
				}else if ("ASSET".equals(colNames[i])) {
					if (colValues[i]!=null && !"".equals(colValues[i])) {
						cmGsScheduleInfoValue.setAsset(colValues[i]);						}
				}else if ("BIG_TRADE_TYPE".equals(colNames[i])) {
					if (colValues[i]!=null && !"".equals(colValues[i])) {
						cmGsScheduleInfoValue.setBigTradeType(colValues[i]);
					}
				}else if ("CONTROL_TYPE".equals(colNames[i])) {
					if (colValues[i]!=null && !"".equals(colValues[i])) {
						cmGsScheduleInfoValue.setControlType(Integer.parseInt(colValues[i]));
					}
				}else if ("COUNTY_CODE".equals(colNames[i])) {
					if (colValues[i]!=null && !"".equals(colValues[i])) {
						cmGsScheduleInfoValue.setControlType(Integer.parseInt(colValues[i]));
					}
				}else if ("CUST_LEVEL".equals(colNames[i])) {
					if (colValues[i]!=null && !"".equals(colValues[i])) {
						cmGsScheduleInfoValue.setCustLevel(Integer.parseInt(colValues[i]));
					}
				} else if ("DOORPLATE_CODE".equals(colNames[i])) {
					if (colValues[i]!=null && !"".equals(colValues[i])) {
						cmGsScheduleInfoValue.setDoorplateCode(colValues[i]);
					}
				} else if ("ECONOMY_TYPE".equals(colNames[i])) {
					if (colValues[i]!=null && !"".equals(colValues[i])) {
						cmGsScheduleInfoValue.setEconomyType(Integer.parseInt(colValues[i]));
					}
				} else if ("EMPLOYEE_NUM".equals(colNames[i])) {
					if (colValues[i]!=null && !"".equals(colValues[i])) {
						cmGsScheduleInfoValue.setEmployeeNum(Long.parseLong(colValues[i]));
					}
				} else if ("GROUP_ADDRESS".equals(colNames[i])) {
					if (colValues[i]!=null && !"".equals(colValues[i])) {
						cmGsScheduleInfoValue.setGroupAddress(colValues[i]);
					}
				} else if ("GROUP_ID".equals(colNames[i])) {
					if (colValues[i]!=null && !"".equals(colValues[i])) {
						cmGsScheduleInfoValue.setGroupId(Long.parseLong(colValues[i]));
					}
				} else if ("GROUP_NAME".equals(colNames[i])) {
					if (colValues[i]!=null && !"".equals(colValues[i])) {
						cmGsScheduleInfoValue.setGroupName(colValues[i]);
					}
				} else if ("GROUP_STATUS".equals(colNames[i])) {
					if (colValues[i]!=null && !"".equals(colValues[i])) {
						cmGsScheduleInfoValue.setGroupStatus(Integer.parseInt(colValues[i]));
					}
				} else if ("GROUP_TYPE".equals(colNames[i])) {
					if (colValues[i]!=null && !"".equals(colValues[i])) {
						cmGsScheduleInfoValue.setGroupType(Integer.parseInt(colValues[i]));
					}
				} else if ("LINK_PHONE".equals(colNames[i])) {
					if (colValues[i]!=null && !"".equals(colValues[i])) {
						cmGsScheduleInfoValue.setLinkPhone(colValues[i]);
					}
				} else if ("MIDDLE_TRADE_TYPE".equals(colNames[i])) {
					if (colValues[i]!=null && !"".equals(colValues[i])) {
						cmGsScheduleInfoValue.setMiddleTradeType(colValues[i]);
					}
				} else if ("ORG_TYPE".equals(colNames[i])) {
					if (colValues[i]!=null && !"".equals(colValues[i])) {
						cmGsScheduleInfoValue.setOrgType(Integer.parseInt(colValues[i]));
					}
				} else if ("OTHER_LINK_PHONE".equals(colNames[i])) {
					if (colValues[i]!=null && !"".equals(colValues[i])) {
						cmGsScheduleInfoValue.setOtherLinkPhone(colValues[i]);
					}
				} else if ("PRACTICE1".equals(colNames[i])) {
					if (colValues[i]!=null && !"".equals(colValues[i])) {
						cmGsScheduleInfoValue.setPractice1(colValues[i]);
					}
				} else if ("PRACTICE2".equals(colNames[i])) {
					if (colValues[i]!=null && !"".equals(colValues[i])) {
						cmGsScheduleInfoValue.setPractice2(colValues[i]);
					}
				} else if ("REGION_DETAIL_NAME".equals(colNames[i])) {
					if (colValues[i]!=null && !"".equals(colValues[i])) {
						cmGsScheduleInfoValue.setRegionDetailName(colValues[i]);
					}
				} else if ("SMALL_TRADE_TYPE".equals(colNames[i])) {
					if (colValues[i]!=null && !"".equals(colValues[i])) {
						cmGsScheduleInfoValue.setSmallTradeType(colValues[i]);
					}
				} else if ("TRADE_TYPE".equals(colNames[i])) {
					if (colValues[i]!=null && !"".equals(colValues[i])) {
						cmGsScheduleInfoValue.setTradeType(colValues[i]);
					}
				} else if ("UNIT_NUM".equals(colNames[i])) {
					if (colValues[i]!=null && !"".equals(colValues[i])) {
						cmGsScheduleInfoValue.setUnitNum(Long.parseLong(colValues[i]));
					}
				} else if ("WORK_TYPE".equals(colNames[i])) {
					if (colValues[i]!=null && !"".equals(colValues[i])) {
						cmGsScheduleInfoValue.setWorkType(Integer.parseInt(colValues[i]));
					}
				} else if ("YEAR_TURNOVER".equals(colNames[i])) {
					if (colValues[i]!=null && !"".equals(colValues[i])) {
						cmGsScheduleInfoValue.setYearTurnover(colValues[i]);
					}
				}  else if ("STATISTICS_EMPLOYEE_NUM".equals(colNames[i])) {
					if (colValues[i]!=null && !"".equals(colValues[i])) {
						cmGsScheduleInfoValue.setStatisticsEmployeeNum(Long.parseLong(colValues[i]));
					}
				} 
			}
		}
		cmGsScheduleInfoValue.setStsToNew();
		cmGsScheduleInfoValue.setOperType(1);
		((ICmGroupArchivesSV)ServiceFactory.getService(ICmGroupArchivesSV.class)).saveGroupArchives(new BOGroupArchivesBean[]{cmGsScheduleInfoValue});
		}
	private ICmSchoolInfoManagerSV getCmSchoolInfoManagerSV() {
		return (ICmSchoolInfoManagerSV) ServiceFactory.getService(ICmSchoolInfoManagerSV.class);
	}
	}  
