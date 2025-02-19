package com.asiainfo.crm.cm.exe.batch;

import java.lang.reflect.Method;
import java.util.Map;

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
import com.asiainfo.appframe.ext.exeframe.bp.interfaces.IBpParseLine;
import com.asiainfo.appframe.ext.exeframe.bp.interfaces.IBpProcess;
import com.asiainfo.appframe.ext.exeframe.bp.po.BpCol;
import com.asiainfo.appframe.ext.exeframe.bp.po.BpInfo;
import com.asiainfo.appframe.ext.exeframe.bp.po.BpParseCol;
import com.asiainfo.appframe.ext.exeframe.bp.service.interfaces.IBpSV;
import com.asiainfo.crm.cm.batch.ivalues.IBOCmBatchFuncValue;
import com.asiainfo.crm.cm.batch.service.interfaces.ICmBatchDataSV;
import com.asiainfo.crm.cm.batch.util.CmBatchUtil;
import com.asiainfo.crm.cm.common.CmConstants;
import com.asiainfo.crm.cm.common.CmServiceFactory;
import com.asiainfo.crm.cm.common.util.CmCommonUtil;
import com.asiainfo.crm.cm.model.ivalues.ICmBusiLogValue;

public class CmCommonBp implements IBpProcess, IBpNotify, IBpParseLine {

	public void processData(BpCol[][] adjustParams, BpInfo bpInfo) throws Exception {
		if (!CmCommonUtil.isNotEmptyObject(adjustParams)) {
			ExceptionUtil.throwBusinessException("CMS0020248");// 参数为空
		}
		// 获取公共参数	
		long bpDataId = 0L;
		// HashMap paraMap = new HashMap();
		if (adjustParams!=null && adjustParams[0][0] != null) {
			bpDataId = adjustParams[0][0].getDataId();
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
		// UserInfoInterface userinfo = ServiceManager.getNewBlankUserInfo();
		// userinfo.setID(bpFile.getOpId());
		// userinfo.setOrgId(bpFile.getOrgId());
		// userinfo.set(Constants.REGION_ID, regionId);
		// ServiceManager.setServiceUserInfo(userinfo);

		if (adjustParams != null && adjustParams.length > 0) {
			// 逐行处理文件解析数据
			BpCol[] adjustParam = null;
			String[] splitLineContent = null; // 文本行内容
			String configId = null; // 客户管理侧的功能ID
			String[] splitDbCols = null; // 用户选择的操作列
			Map commonInfo = null; // 解析之后业务参数的Map
			ICmBatchDataSV cmBatchDataSV = (ICmBatchDataSV) ServiceFactory.getService(ICmBatchDataSV.class);
			for (int i = 0, len = adjustParams.length; i < len; i++) {
				adjustParam = adjustParams[i];
				int colLen = adjustParam.length;
				if (colLen <= 0) {
					ExceptionUtil.throwBusinessException("CMS0009074");
				}
				splitLineContent = new String[colLen];
				for (int j = 0; j < colLen; j++) {
					if (j == 0) { // 第一列时解析业务参数
						commonInfo = CmBatchUtil.getCommonInfo(adjustParam[j].getBusiPara());
						// 将当前的批次号传入处理类，用于记录业务日志等
						commonInfo.put(ICmBusiLogValue.S_BatchDataId, adjustParam[j].getDataId());
						// 从公共信息中获取configId
						configId = commonInfo.get("configId").toString();
						// 解析公共信息中的数据库字段
						splitDbCols = commonInfo.get("dbCols").toString().split(",");
					}
					splitLineContent[j] = adjustParam[j].getValue();
				}

				// 根据configId查询具体的业务处理类
				IBOCmBatchFuncValue funcValue = cmBatchDataSV.queryBatchFuncById(configId);
				String dealService = funcValue.getDealService();
				String dealMethod = funcValue.getDealFunc();
				// 增加对中心设置的支持
				// add by huzq at
				// 2012-5-29，增加对中心设置的支持，如果需要设置中心，需要在前台界面的参数页面中设置参数CenterType和CenterValue到commonInfo中，如果需要获取跨中心服务，则还需要设置CrossCenter参数.
				String centerType = null;
				String centerValue = null;
				String crossCenter = null;
				if(null!=commonInfo){
					centerType = (String) commonInfo.get(CmConstants.CommonPageParamName.CENTER_TYPE);
					centerValue = (String) commonInfo.get(CmConstants.CommonPageParamName.CENTER_VALUE);
					crossCenter = (String) commonInfo.get(CmConstants.CommonPageParamName.CROSS_CENTER);
				}
				if (StringUtils.isNotBlank(centerType) && StringUtils.isNotBlank(centerValue)) {
					CenterFactory.setCenterInfoByTypeAndValue(centerType, centerValue);
				}
				// 生成业务处理的服务
				Object serviceObject = null;
				if (StringUtils.isNotBlank(crossCenter) && CenterFactory.CROSS_CENTER.equals(crossCenter)) {
					serviceObject = ServiceFactory.getCrossCenterService(Class.forName(dealService));
				} else {
					serviceObject = ServiceFactory.getService(Class.forName(dealService));
				}
				// 生成业务处理的方法,处理方法目前默认规定入参为两个String[],第一个表示选中了哪些列需要操作,第二个表示文本行中的各个字段值
				// 生成业务处理的方法,处理方法目前默认规定入参为两个String[],第一个表示选中了哪些列需要操作,第二个表示文本行中的各个字段值
				Method serviceMethod = serviceObject.getClass().getDeclaredMethod(dealMethod, new Class[] { String[].class, String[].class, Map.class });
				// 执行业务方法
				serviceMethod.invoke(serviceObject, new Object[] { splitDbCols, splitLineContent, commonInfo });
			}
		}
	}

	public void statusNotify(String notifyBillId, String notifyMsg) throws Exception {
		// 调用发送短信接口完成短信发送
		if (StringUtils.isNotBlank(notifyBillId) && StringUtils.isNotBlank(notifyMsg)) {
			CenterFactory.setCenterInfoByTypeAndValue(CmConstants.CenterType.BILL_ID, notifyBillId);
			CmServiceFactory.getTeamInvokeSV().sendSms(notifyBillId, notifyMsg);
		}
	}

	public BpParseCol[] parseLine(String oneLine, String splitChar, String busiParam) throws Exception {
		BpParseCol[] parseCols = null;
		// 解析文本行
		if (StringUtils.isBlank(splitChar)) {
			splitChar = ","; // 默认为逗号
		}
		if (!StringUtils.isBlank(oneLine)) {
			String[] splitLineContent = null;
			String _splitChar = null;
			if (oneLine.indexOf(splitChar) != -1) { // 使用提供的分隔符
				if (splitChar.equals("|")) {
					_splitChar = "\\|";
				} else {
					_splitChar = splitChar;
				}
			} else if (oneLine.indexOf("|") != -1) { // 使用竖线
				_splitChar = "\\|";
			} else if (oneLine.indexOf(" ") != -1) { // 使用空格
				_splitChar = " ";
			} else if (oneLine.indexOf("\t") != -1) { // 使用Tab
				_splitChar = "\t";
			} else if (oneLine.indexOf("^") != -1) { // 使用^
				_splitChar = "^";
			}
			if (_splitChar != null) {
				// 特殊处理.如果是多个分隔符号相连，必须处理成多个分隔符号中间用空格隔开
				// 否则造成字符串分割的数组长度不对
				for (int i = 0; i < 2; i++) {
					if (oneLine.indexOf(_splitChar + "" + _splitChar) != -1) {
						oneLine = StringUtils.replace(oneLine, _splitChar + "" + _splitChar, _splitChar + " " + _splitChar);
					}
				}
				// 如果行最后是以分隔符号结束,那么需要补起一个空格加上分隔符号
				if (oneLine.endsWith(_splitChar)) {
					oneLine = oneLine + " " + _splitChar;
				}
				splitLineContent = oneLine.split(_splitChar);
			} else {
				splitLineContent = new String[] { oneLine };
			}
			// 解析业务公共信息
			Map commonInfo = CmBatchUtil.getCommonInfo(busiParam);
			// 解析公共信息中的数据库字段
			String batchColIds = commonInfo.get("batchColIds").toString();
			String[] splitDbCols = batchColIds.split(",");
			// 和业务参数中用户选择的列做比对
			if (splitDbCols.length != splitLineContent.length) {
				ExceptionUtil.throwBusinessException("CMS0020238"); // 上传文件中的字段数量和列表中所选的字段数量不一致！
			} else {
				parseCols = new BpParseCol[splitLineContent.length];
				for (int i = 0, len = parseCols.length; i < len; i++) {
					// 此处colId取的是该列在行中的索引位置
					if (i == 0) {
						parseCols[i] = new BpParseCol(true, Long.parseLong(splitDbCols[i].trim()), splitLineContent[i].trim()); // 默认第一列作为文本行的key
					} else {
						parseCols[i] = new BpParseCol(false, Long.parseLong(splitDbCols[i].trim()), splitLineContent[i].trim());
					}
				}
			}
		}
		return parseCols;
	}

	public static void main(String[] args) throws Exception {
		// 启动下载FTP文件入库
		 //BpFrameWork.main(new String[] {"-ftp","CM_USER_MANAGER_DTL_ADD_240"});
		// 根据入库文件执行业务逻辑
		BpFrameWork.main(new String[]{"-dispatcher","CM_USER_MANAGER_DTL_ADD_240:0:1:0"});
	}
}
