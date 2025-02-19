package com.asiainfo.crm.cm.dk.exe.bp;

import org.apache.commons.lang.StringUtils;

import com.ai.appframe2.bo.DataContainer;
import com.ai.appframe2.common.DataType;
import com.ai.appframe2.common.ServiceManager;
import com.ai.appframe2.complex.center.CenterFactory;
import com.ai.appframe2.privilege.UserInfoInterface;
import com.ai.appframe2.service.ServiceFactory;
import com.ai.common.util.ExceptionUtil;
import com.ai.secframe.client.OrgmodelClient;
import com.asiainfo.appframe.ext.exeframe.bp.BpFrameWork;
import com.asiainfo.appframe.ext.exeframe.bp.bo.BOBpDataBean;
import com.asiainfo.appframe.ext.exeframe.bp.bo.BOBpFileBean;
import com.asiainfo.appframe.ext.exeframe.bp.interfaces.IBpNotify;
import com.asiainfo.appframe.ext.exeframe.bp.interfaces.IBpProcess;
import com.asiainfo.appframe.ext.exeframe.bp.po.BpCol;
import com.asiainfo.appframe.ext.exeframe.bp.po.BpInfo;
import com.asiainfo.appframe.ext.exeframe.bp.service.interfaces.IBpSV;
import com.asiainfo.crm.cm.common.CmConstants;
import com.asiainfo.crm.cm.common.CmServiceFactory;
import com.asiainfo.crm.cm.common.ivalues.IBOCmInsCmrelValue;
import com.asiainfo.crm.cm.common.util.CmCommonUtil;
import com.asiainfo.crm.cm.dk.service.interfaces.ICmDkCustomerSV;
import com.asiainfo.crm.cm.inner.customer.bo.BOCmGroupMemberBean;
import com.asiainfo.crm.cm.inner.customer.ivalues.IBOCmGroupMemberValue;
import com.asiainfo.crm.cm.ln.common.util.CmLnConstants;
import com.asiainfo.crm.cm.model.bean.VOCustBean;
import com.asiainfo.crm.cm.model.bo.CustRelationshipBean;
import com.asiainfo.crm.cm.model.ivalues.ICustOrganizeValue;
import com.asiainfo.crm.cm.model.ivalues.ICustRelationshipValue;
import com.asiainfo.crm.cm.model.ivalues.IGroupMemberValue;
import com.asiainfo.crm.cm.model.ivalues.ISoUserValue;
import com.asiainfo.crm.cm.model.ivalues.IVOCustValue;
import com.asiainfo.crm.cm.service.interfaces.ICmCustomerSV;
import com.asiainfo.crm.cm.teaminvoke.in.service.interfaces.ICmTeamInvokeSV;

public class CmBatchAddGroupDeptUserBp implements IBpProcess, IBpNotify{

	private  final static  int FILE_COL_COUNT = 2 ;	//上传文件每行的项目列数. 


	public void processData(BpCol[][] bpCols, BpInfo bpInfo) throws Exception
	{
		if (!CmCommonUtil.isNotEmptyObject(bpCols)) {
			ExceptionUtil.throwBusinessException("CMS0020248");// 参数为空
		}
		// 获取公共参数	
		long bpDataId = 0L;
		// HashMap paraMap = new HashMap();
		if (bpCols!=null && bpCols[0][0] != null) {
			bpDataId = bpCols[0][0].getDataId();
		} else {
			ExceptionUtil.throwBusinessException("CMS0020248"); // 批量任务公共参数获取失败！
		}
		// 获取操作员和组织信息
		long fileId = 0L;
		BOBpDataBean bpData = null;
		BOBpFileBean bpFile = null;
		IBpSV bpSV = (IBpSV) ServiceFactory.getService(IBpSV.class);
		bpData = bpSV.getBpDataById(bpDataId);
		if (bpData == null) {
			ExceptionUtil.throwBusinessException("CMS0020249"); // 获取批量任务数据失败！
		} else {
			fileId = bpData.getFileId();
			bpFile = bpSV.getBpFileById(fileId);
			if (bpFile == null) {
				ExceptionUtil.throwBusinessException("CMS0020231"); // 获取批量上传文件信息失败！
			}
		}
		
		UserInfoInterface userInfo=OrgmodelClient.setUserInfo(bpFile.getOpId(),"");
		ServiceManager.setServiceUserInfo(userInfo);		
		
		if(null!=bpCols && bpCols.length>0){
			
			ICmTeamInvokeSV service = (ICmTeamInvokeSV) ServiceFactory.getService(ICmTeamInvokeSV.class);
			IVOCustValue custValue = new VOCustBean();			
			for (int i = 0; i<bpCols.length;i++)	//一般一行记录,给集团部门分配号码按每行保存
			{
				BpCol[] bpCol = bpCols[i];
				if ( bpCol ==null || bpCol.length != FILE_COL_COUNT)	//行内容参数与配置的不一致
				{
					//// 记录格式错误，字段个数不等于{0}
					ExceptionUtil.throwBusinessException("AMS1600120", String.valueOf(FILE_COL_COUNT));
				}
				String mobileNumber = "";
				String deptId = "";//部门编码
				
				IBOCmGroupMemberValue cmGroupMemberValue = null;
				ICustRelationshipValue custRelValue = null;				
				
				for (int j =0;j<FILE_COL_COUNT; j++)
				{
					switch( bpCol[j].getPosition() )	//按照顺序处理
					{
						case 1:  
							if(StringUtils.isNotBlank(bpCol[j].getValue())){
								mobileNumber = bpCol[j].getValue();
							}
							break; 
							
						case 2:  
							if(StringUtils.isNotBlank(bpCol[j].getValue())){
								deptId = bpCol[j].getValue();
							}
							break;
						default:
							break;
					}
				}
				if (StringUtils.isNotBlank(mobileNumber)) {
					if (StringUtils.isNotBlank(deptId)) {						
						ICustOrganizeValue custOrgVal = CmServiceFactory.getCustomerSV().queryCustOrganizeById(DataType.getAsLong(deptId));
						if (null != custOrgVal) {
							CenterFactory.setCenterInfoByTypeAndValue("BillId", mobileNumber);
							ISoUserValue userValue = service.getSoUserByBillId(mobileNumber);							
							if(CmCommonUtil.isNotEmptyObject(userValue)){
								String custId = String.valueOf(userValue.getCustId());
								//判断号码是否归属于该集团
								if(userValue.getCustId()!=custOrgVal.getCustId()){									
									ExceptionUtil.throwBusinessException("CMS6000155", new String[]{mobileNumber,custId,deptId,custId});
								}
								//查询关联的用户号码信息
								ICmDkCustomerSV dkService = (ICmDkCustomerSV) ServiceFactory.getService(ICmDkCustomerSV.class);
								IBOCmInsCmrelValue[] userInfos = dkService.queryCmInsCmrel(custOrgVal.getCustId(), userValue.getUserId(), CmConstants.RelaType.OWNER, -1, -1);
								// 查询该号码是否已经分配给某个部门
								for(int k=0;k<userInfos.length;k++){
									DataContainer dc = new DataContainer();
									dc.set(IBOCmInsCmrelValue.S_CustId, userInfos[k].getCustId());
									dc.set(IBOCmInsCmrelValue.S_UserId, userInfos[k].getUserId());
									ICmCustomerSV customerSV = CmServiceFactory.getCustomerSV();
									IGroupMemberValue[] groupMemberValues = customerSV.queryGroupMembers(dc, -1, -1);
									if (groupMemberValues != null && groupMemberValues.length > 0) {			
										//号码已分配
										ExceptionUtil.throwBusinessException("CMS0000163", mobileNumber+" is Assigned!");
									}
									String state = userValue.getState();
									int userType = userValue.getUserType();
									// 只有状态为1,4,8的时候这个号码才可用,另外个人的虚用户为6，集团虚用户为8
									if (state.equals("1") || state.equals("4") || state.equals("8")) {
										custRelValue = new CustRelationshipBean();
										cmGroupMemberValue = new BOCmGroupMemberBean();
										cmGroupMemberValue.setBillId(mobileNumber);
										cmGroupMemberValue.setUserId(userValue.getUserId());
										cmGroupMemberValue.setCustId(DataType.getAsLong(custId));
										cmGroupMemberValue.setDeptId(DataType.getAsLong(deptId));
										cmGroupMemberValue.setMemberType(CmLnConstants.MemberStatus.NUMBER_MEMBER);
										cmGroupMemberValue.setRegionId(CmCommonUtil.getDefaultRegionId());
										cmGroupMemberValue.setState(CmConstants.RecordState.USE);
										custRelValue.copy(cmGroupMemberValue);
										custRelValue.setRelationType(CmConstants.CustRelationShip.CUST_REL_TYPE_GROUP_MEMBER);
										custRelValue.setStsToNew();
										custValue.addCustRel(custRelValue);																			
									} else {
										//号码状态不对
										ExceptionUtil.throwBusinessException("CMS0000163", mobileNumber+"‘s status must is:'1,4,8'!");
									}
								}								
							} else {
								//根据手机号码[{0}]没有查询到用户信息！
								ExceptionUtil.throwBusinessException("CMS5000154", mobileNumber);
							}							
						} else {
							//根据部门编码:{0}找不到对应的集团部门！
							ExceptionUtil.throwBusinessException("CMS8705034", deptId);
						}
					} else {
						//第{0}行出现错误：Mobile Number或者Dept. ID为空
						ExceptionUtil.throwBusinessException("CMS8705033", String.valueOf(i + 1));
					}
				} else {
					//第{0}行出现错误：Mobile Number或者Dept. ID为空
					ExceptionUtil.throwBusinessException("CMS8705033", String.valueOf(i + 1));
				}
			}
			custValue.setBusinessId(CmConstants.BusiLogId.GROUP_ORG_PHONE_ASSIGN);
			CmServiceFactory.getCustomerSV().saveCustomer(custValue);
		}
	}
	
	public void statusNotify(String notifyBillId, String notifyMsg) throws Exception
	{
		// 调用发送短信接口完成短信发送
		if (StringUtils.isNotBlank(notifyBillId) && StringUtils.isNotBlank(notifyMsg)) {
			CenterFactory.setCenterInfoByTypeAndValue(CmConstants.CenterType.BILL_ID, notifyBillId);
			CmServiceFactory.getTeamInvokeSV().sendSms(notifyBillId, notifyMsg);
		}	
	}

	 public static void main (String[] args) throws Exception{ 
//		启动下载FTP文件入库
//		BpFrameWork.main(new String[]{"-ftp","BATCH_ADD_CUSTOMER_SEGMENT_012"});
//		根据入库文件执行业务逻辑
		BpFrameWork.main(new String[]{"-dispatcher","BATCH_ADD_GROUP_DEPT_USER_012:240:1:0"});
	 } 


}
