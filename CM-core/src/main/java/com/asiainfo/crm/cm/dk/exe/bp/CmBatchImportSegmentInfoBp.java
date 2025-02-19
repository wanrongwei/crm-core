package com.asiainfo.crm.cm.dk.exe.bp;

import org.apache.commons.lang.StringUtils;
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
import com.asiainfo.crm.cm.common.util.CmCommonUtil;
import com.asiainfo.crm.cm.customer.group.ivalues.IBOCmGroupCustomerValue;
import com.asiainfo.crm.cm.customer.group.ivalues.IBoCmCustSegmentValue;
import com.asiainfo.crm.cm.customer.group.service.interfaces.ICmCustSegmentSV;
import com.asiainfo.crm.cm.customer.group.service.interfaces.ICmGroupCustomerSV;
import com.asiainfo.crm.cm.inner.customer.bo.BOCmCustSegmentRelaBean;
import com.asiainfo.crm.cm.inner.customer.ivalues.IBOCmCustSegmentRelaValue;
import com.asiainfo.crm.cm.inner.customer.service.interfaces.ICmCustSegmentRelaSV;

public class CmBatchImportSegmentInfoBp implements IBpProcess, IBpNotify{

	private  final static  int FILE_COL_COUNT = 3 ;	//上传文件每行的项目列数. 


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

		ICmCustSegmentRelaSV segRelSv = (ICmCustSegmentRelaSV) ServiceFactory.getService(ICmCustSegmentRelaSV.class);
		
		ICmCustSegmentSV segSv = (ICmCustSegmentSV) ServiceFactory.getService(ICmCustSegmentSV.class);
		
		ICmGroupCustomerSV cmSv = (ICmGroupCustomerSV) ServiceFactory.getService(ICmGroupCustomerSV.class);
		
		if(null!=bpCols && bpCols.length>0){
			
			for (int i = 0; i<bpCols.length;i++)	//一般一行记录,保存调帐按每行保存
			{
				BpCol[] bpCol = bpCols[i];
				if ( bpCol ==null || bpCol.length != FILE_COL_COUNT)	//行内容参数与配置的不一致
				{
					//// 记录格式错误，字段个数不等于{0}
					ExceptionUtil.throwBusinessException("AMS1600120", String.valueOf(FILE_COL_COUNT));
				}
				String segName = "";
				long segId =0;
				String certCode = "";//客户证件号码
				long allowApprovable = 1;
				long allowCreditCalcula = 1;
				long allowRevisable = 1;
				long allowInheritalbe = 1;
				
				IBOCmCustSegmentRelaValue value = new BOCmCustSegmentRelaBean();
				IBoCmCustSegmentValue segValue = null;
				
				for (int j =0;j<FILE_COL_COUNT; j++)
				{
					switch( bpCol[j].getPosition() )	//按照顺序处理
					{
						case 1:  
							if(StringUtils.isNotBlank(bpCol[j].getValue())){
								segName = bpCol[j].getValue();
								segValue = segSv.querySegmentByNamefromCache(segName);
								if(null!=segValue){
									value.setSegmentId(segValue.getSegmentId());
									segId = segValue.getSegmentId();
								}else{
									ExceptionUtil.throwBusinessException("CMS8705030",segName);
								}
							}
							break; 
							
						case 2:  
							if(StringUtils.isNotBlank(bpCol[j].getValue())){
								certCode = bpCol[j].getValue();
							}
							break;
							
						case 3:  
							if(StringUtils.isNotBlank(bpCol[j].getValue())){
								allowRevisable = Long.parseLong(bpCol[j].getValue());
								value.setIsRevisable(allowRevisable);
							}
							break;	
						default:
							break;
					}
				}
				
				if (null != certCode && !"".equals(certCode)) {
					IBOCmGroupCustomerValue GroupCustValue = cmSv.queryGroupCustomer("", CmConstants.CertificateType.KOB_NUMBER, certCode);
					long custId = GroupCustValue.getCustId();
					if (null != GroupCustValue) {
						if (custId > 0) {
							IBOCmCustSegmentRelaValue segRelValue = segRelSv.querySegmentRelaByCustId(custId);
							if (null != segRelValue) {
								if (segRelValue.getIsRevisable() == 1) {// 可被修改则修改
									segRelValue.setSegmentId(segId);
									segRelValue.setIsRevisable(allowRevisable);
									segRelSv.saveSegmentRela(segRelValue);
								}
							} else {
								// 新增
								value.setCustId(custId);
								value.setDoneCode(ServiceManager.getDoneCode());
								value.setIsApprovable(allowApprovable);
								value.setIsCreditCalculated(allowCreditCalcula);
								value.setIsInheritable(allowInheritalbe);
								segRelSv.saveSegmentRela(value);
							}
						} else {
							ExceptionUtil.throwBusinessException("CMS9988731",certCode);
						}
					}
				} else {
					ExceptionUtil.throwBusinessException("CMS8705031", String.valueOf(i + 1));
				}
			}
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
		BpFrameWork.main(new String[]{"-dispatcher","BATCH_ADD_CUSTOMER_SEGMENT_012:240:1:0"});
	 } 


}
