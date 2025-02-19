package com.asiainfo.crm.cm.exe.tf.service.impl;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.commons.lang.StringUtils;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import com.ai.appframe2.bo.DataContainer;
import com.ai.appframe2.common.DataContainerInterface;
import com.ai.appframe2.common.SessionManager;
import com.ai.appframe2.service.ServiceFactory;
import com.ai.common.bo.BOBsFtpPathBean;
import com.ai.common.util.FtpUtil;
import com.asiainfo.crm.cm.busimodel.common.ParamUtil;
import com.asiainfo.crm.cm.common.bo.BOCmAttachExportBean;
import com.asiainfo.crm.cm.common.ivalues.IBOCmAttachExColValue;
import com.asiainfo.crm.cm.common.ivalues.IBOCmAttachExporClassValue;
import com.asiainfo.crm.cm.common.ivalues.IBOCmAttachExportValue;
import com.asiainfo.crm.cm.common.util.CmCommonUtil;
import com.asiainfo.crm.cm.exe.tf.service.interfaces.ICmAttachExportSV;
import com.asiainfo.crm.cm.inner.common.service.interfaces.ICmCommonInnerSV;
import com.asiainfo.crm.cm.inner.util.CmInnerServiceFactory;
import com.asiainfo.crm.cm.ln.common.util.CmBusiEntry;
import com.asiainfo.crm.cm.ln.common.util.CmLnCommonUtil;

public class CmAttachExportSVImpl implements ICmAttachExportSV {

	private transient static Log log = LogFactory.getLog(CmBusiEntry.class);

	// 解析类对象 拼接对象
	public String objFileColsValue(DataContainer dt, List ibocm) throws Exception {
		StringBuffer strBuffer = new StringBuffer();
		int len = ibocm.size();
		for (int i = 0; i < len; i++) {
			IBOCmAttachExColValue iboAttachExColValue = (IBOCmAttachExColValue) ibocm.get(i);
			strBuffer.append(dt.get(iboAttachExColValue.getFieldCode()));
			if (i != len - 1) {
				strBuffer.append(",\t");
			}
		}
		return strBuffer.toString();
	}

	public Map getMapValue(String exportPara) throws Exception {
		if (StringUtils.isBlank(exportPara)) {
			throw new Exception("Please check the incoming parameter values ​​EXPORT_PARAMETER are normal !");
		}
		String[] sparas = exportPara.split(";");
		Map map = new HashMap();
		int len = sparas.length;
		for (int i = 0; i < len; i++) {
			String objVale = sparas[i];
			int sta = objVale.indexOf("=");
			String funNmae = objVale.subSequence(0, sta).toString();
			String vlueNmae = objVale.subSequence(sta + 1, objVale.length()).toString();
			map.put(funNmae, vlueNmae);
		}
		return map;
	}

	// 现在只支持.txt 和.csv格式文件的写入
	public void writerObjValues(Object obj, List ibocm, String fileName) throws Exception {
		DataContainer[] dt = null;
		int len = 0;
		if (obj != null) {
			dt = (DataContainer[]) obj;
			len = dt.length;
		}
		File file = new File(fileName);
		BufferedWriter w = null;
		OutputStreamWriter osw = null;
		FileOutputStream fs = null;
		try {
			fs = new FileOutputStream(file);
			osw = new OutputStreamWriter(fs, "GBK");
			w = new BufferedWriter(osw);
			if (dt != null && dt.length > 0) {
				for (int i = 0; i < len; i++) {
					w.write(objFileColsValue(dt[i], ibocm));
					w.newLine();
				}
			}
		} catch (Exception e) {
			log.error(e.getMessage(), e);
			e.printStackTrace();
		} finally {
			if (w != null) {
				try {
					w.flush();
					w.close();
				} catch (Exception e) {
					log.error(e.getMessage(), e);
					e.printStackTrace();
				}
			}

			if (osw != null) {
				try {
					osw.flush();
					osw.close();
				} catch (Exception e) {
					log.error(e.getMessage(), e);
					e.printStackTrace();
				}
			}
			if (fs != null) {
				try {
					fs.flush();
					fs.close();
				} catch (Exception e) {
					log.error(e.getMessage(), e);
					e.printStackTrace();
				}
			}
		}
	}

	public void saveAttactExportValue(List list) throws Exception {
		BOCmAttachExportBean[] cmAttachExportBeans = (BOCmAttachExportBean[]) list.toArray(new BOCmAttachExportBean[0]);
		ICmCommonInnerSV icm = (ICmCommonInnerSV) ServiceFactory.getService(ICmCommonInnerSV.class);
		icm.saveBeans(cmAttachExportBeans);
	}

	public void upFile(IBOCmAttachExporClassValue colClass, BOBsFtpPathBean bsFtpPathValue, String newFileName) throws Exception {
		FtpUtil ftp = null;
		File file = null;
		try {
			StringBuffer sf = new StringBuffer();
			sf.append(bsFtpPathValue.getLocalPath()).append(File.separator).append(newFileName).append(colClass.getFileMode());
			file = new File(sf.toString());
			ftp = CmCommonUtil.getFtpUtil(colClass.getFtpCode());
			outPutSendSmsFile(ftp, colClass, bsFtpPathValue, newFileName);
		} catch (Exception ex) {
			if (log.isErrorEnabled()) {
				log.error(ex.getMessage(), ex);
			}
		} finally {
			if (ftp != null) {
				ftp.close();
			}
			if (file.isFile()) {
				log.error("Delete the local files!" + file.getPath());
				file.delete();
			}

		}
	}

	/**
	 * 上传服务器
	 * @param ftp
	 * @param colClass
	 * @param bsFtpPathValue
	 * @param newFileName
	 * @throws Exception
	 */
	public void outPutSendSmsFile(FtpUtil ftp, IBOCmAttachExporClassValue colClass, BOBsFtpPathBean bsFtpPathValue, String newFileName) throws Exception {
		FileInputStream fis = null;
		try {
			if (ftp != null) {
				StringBuffer localPath = new StringBuffer();
				StringBuffer remotePath = new StringBuffer();
				remotePath.append(bsFtpPathValue.getRemotePath()).append("/").append(newFileName).append(colClass.getFileMode());
				localPath.append(bsFtpPathValue.getLocalPath()).append("/").append(newFileName).append(colClass.getFileMode());
				fis = new FileInputStream(localPath.toString());
				ftp.mkdir(bsFtpPathValue.getRemotePath());
				// 服务器上的文件名称
				if (log.isDebugEnabled()) {
					log.debug("outPutSendSmsFile---The new file name is :" + newFileName);
				}
				// 上传文件至fTP服务器
				ftp.upload(remotePath.toString(), fis, FtpUtil.BIN);// file流为空对象 请注意
			}
		} catch (Exception ex) {
			if (log.isErrorEnabled()) {
				log.error("File upload error :", ex);
			}
		} finally {
			if (fis != null) {
				fis.close();
			}
		}
	}

	public void getAttactValeuMap(BOCmAttachExportBean iboAttachExportValue, Map map) throws Exception {
		Object obj = null;
		obj = map.get(IBOCmAttachExportValue.S_AttachId);
		if (!CmCommonUtil.isEmptyObj(obj)) {
			iboAttachExportValue.initProperty(IBOCmAttachExportValue.S_AttachId, obj);
		}
		obj = map.get(IBOCmAttachExportValue.S_ColCode);// 类编码
		if (!CmCommonUtil.isEmptyObj(obj)) {
			iboAttachExportValue.initProperty(IBOCmAttachExportValue.S_ColCode, obj);
		}
		obj = map.get(IBOCmAttachExportValue.S_MethCode);
		if (!CmCommonUtil.isEmptyObj(obj)) {
			iboAttachExportValue.initProperty(IBOCmAttachExportValue.S_MethCode, obj);
		}
		obj = map.get(IBOCmAttachExportValue.S_AttacyName);
		if (!CmCommonUtil.isEmptyObj(obj)) {
			iboAttachExportValue.initProperty(IBOCmAttachExportValue.S_AttacyName, obj);
		}
		obj = map.get(IBOCmAttachExportValue.S_FileName);
		if (!CmCommonUtil.isEmptyObj(obj)) {
			iboAttachExportValue.initProperty(IBOCmAttachExportValue.S_FileName, obj);
		}
		obj = map.get(IBOCmAttachExportValue.S_FileSize);
		if (!CmCommonUtil.isEmptyObj(obj)) {
			iboAttachExportValue.initProperty(IBOCmAttachExportValue.S_FileSize, obj);
		}
		obj = map.get(IBOCmAttachExportValue.S_FunctionCode);
		if (!CmCommonUtil.isEmptyObj(obj)) {
			iboAttachExportValue.initProperty(IBOCmAttachExportValue.S_FunctionCode, obj);
		}
		obj = map.get(IBOCmAttachExportValue.S_FunctionName);
		if (!CmCommonUtil.isEmptyObj(obj)) {
			iboAttachExportValue.initProperty(IBOCmAttachExportValue.S_FunctionName, obj);
		}
		obj = map.get(IBOCmAttachExportValue.S_State);
		if (!CmCommonUtil.isEmptyObj(obj)) {
			iboAttachExportValue.initProperty(IBOCmAttachExportValue.S_State, obj);
		}

		obj = map.get(IBOCmAttachExportValue.S_ExportParameter);// 查询条件
		if (!CmCommonUtil.isEmptyObj(obj)) {
			iboAttachExportValue.initProperty(IBOCmAttachExportValue.S_ExportParameter, obj);
		}
		obj = map.get(IBOCmAttachExportValue.S_RegionId);
		if (!CmCommonUtil.isEmptyObj(obj)) {
			iboAttachExportValue.initProperty(IBOCmAttachExportValue.S_RegionId, obj);
		}
		obj = map.get(IBOCmAttachExportValue.S_OpId);
		if (!CmCommonUtil.isEmptyObj(obj)) {
			iboAttachExportValue.initProperty(IBOCmAttachExportValue.S_OpId, obj);
		}
		obj = map.get(IBOCmAttachExportValue.S_OrgId);
		if (!CmCommonUtil.isEmptyObj(obj)) {
			iboAttachExportValue.initProperty(IBOCmAttachExportValue.S_OrgId, obj);
		}
		obj = map.get(IBOCmAttachExportValue.S_CreateDate);
		if (!CmCommonUtil.isEmptyObj(obj)) {
			iboAttachExportValue.initProperty(IBOCmAttachExportValue.S_CreateDate, obj);
		}
		obj = map.get(IBOCmAttachExportValue.S_CreateOpId);
		if (!CmCommonUtil.isEmptyObj(obj)) {
			iboAttachExportValue.initProperty(IBOCmAttachExportValue.S_CreateOpId, obj);
		}
		obj = map.get(IBOCmAttachExportValue.S_CreateOrgId);
		if (!CmCommonUtil.isEmptyObj(obj)) {
			iboAttachExportValue.initProperty(IBOCmAttachExportValue.S_CreateOrgId, obj);
		}
		obj = map.get(IBOCmAttachExportValue.S_Remarks);
		if (!CmCommonUtil.isEmptyObj(obj)) {
			iboAttachExportValue.initProperty(IBOCmAttachExportValue.S_Remarks, obj);
		}
		obj = map.get(IBOCmAttachExportValue.S_EffectiveDate);
		if (!CmCommonUtil.isEmptyObj(obj)) {
			iboAttachExportValue.initProperty(IBOCmAttachExportValue.S_EffectiveDate, obj);
		}
		obj = map.get(IBOCmAttachExportValue.S_ExpireDate);
		if (!CmCommonUtil.isEmptyObj(obj)) {
			iboAttachExportValue.initProperty(IBOCmAttachExportValue.S_ExpireDate, obj);
		}
		obj = map.get(IBOCmAttachExportValue.S_DoneCode);
		if (!CmCommonUtil.isEmptyObj(obj)) {
			iboAttachExportValue.initProperty(IBOCmAttachExportValue.S_DoneCode, obj);
		}
		obj = map.get(IBOCmAttachExportValue.S_DoneDate);
		if (!CmCommonUtil.isEmptyObj(obj)) {
			iboAttachExportValue.initProperty(IBOCmAttachExportValue.S_DoneDate, obj);
		}
		obj = map.get(IBOCmAttachExportValue.S_Reason);
		if (!CmCommonUtil.isEmptyObj(obj)) {
			iboAttachExportValue.initProperty(IBOCmAttachExportValue.S_Reason, obj);
		}
	}

	public IBOCmAttachExportValue[] qryAttach(String criteria, int start, int end) throws Exception {
		List<IBOCmAttachExportValue> list = new ArrayList<IBOCmAttachExportValue>();
		DataContainer[] dcs = ParamUtil.parseXmlCriteria_new(criteria);
		DataContainer conditionDC = dcs[0];

		StringBuilder querySql = new StringBuilder("select * from CM_ATTACH_EXPORT");
		StringBuilder conditionSql = new StringBuilder("");

		Map<Object, Object> parameter = new HashMap<Object, Object>();
		if (StringUtils.isNotBlank(conditionDC.getAsString(IBOCmAttachExportValue.S_CreateDate))
				&& StringUtils.isNotBlank(conditionDC.getAsString(IBOCmAttachExportValue.S_DoneDate))) {
			conditionSql.append(" and " + IBOCmAttachExportValue.S_CreateDate + " >=DATE_FORMAT( :STARTDATE ,'%Y-%m-%d')");
			conditionSql.append(" and " + IBOCmAttachExportValue.S_CreateDate + " <=DATE_FORMAT( :ENDDATE ,'%Y-%m-%d')");

			parameter.put("STARTDATE", conditionDC.getAsString(IBOCmAttachExportValue.S_CreateDate).substring(0, 10));
			parameter.put("ENDDATE", conditionDC.getAsString(IBOCmAttachExportValue.S_DoneDate).substring(0, 10));
		}
		if (StringUtils.isNotBlank(conditionDC.getAsString(IBOCmAttachExportValue.S_FileName))) {
			conditionSql.append(" and " + IBOCmAttachExportValue.S_FileName + " = :FILENAME ");
			parameter.put("FILENAME", conditionDC.getAsString(IBOCmAttachExportValue.S_FileName));
		}
		if (StringUtils.isNotBlank(conditionDC.getAsString(IBOCmAttachExportValue.S_State))) {
			conditionSql.append(" and " + IBOCmAttachExportValue.S_State + " = :STATE ");
			parameter.put("STATE", conditionDC.getAsString(IBOCmAttachExportValue.S_State));
		}
		if (StringUtils.isNotBlank(conditionDC.getAsString(IBOCmAttachExportValue.S_FunctionCode))) {
			conditionSql.append(" and " + IBOCmAttachExportValue.S_FunctionCode + " = :FUNCTIONCODE ");
			parameter.put("FUNCTIONCODE", conditionDC.getAsString(IBOCmAttachExportValue.S_FunctionCode));
		}

		conditionSql.append(" and " + IBOCmAttachExportValue.S_OpId + " = :OPID ");
		parameter.put("OPID", SessionManager.getUser().getID());

		conditionSql.append(" order by create_date desc");

		DataContainerInterface[] returnValues = CmInnerServiceFactory.getCommonInnerSV().getBeansFromSql(BOCmAttachExportBean.class,
				CmLnCommonUtil.getQueryResult(querySql.toString(), conditionSql.toString(), start, end, parameter), parameter);
		int len = returnValues.length;
		for (int i = 0; i < len; i++) {
			IBOCmAttachExportValue dm = new BOCmAttachExportBean();
			dm.copy(returnValues[i]);
			list.add(dm);
		}
		return list.toArray(new IBOCmAttachExportValue[0]);
	}

	public int qryAttachCount(String criteria) throws Exception {
		DataContainer[] dcs = ParamUtil.parseXmlCriteria_new(criteria);
		DataContainer conditionDC = dcs[0];

		StringBuilder querySql = new StringBuilder("select * from CM_ATTACH_EXPORT");
		StringBuilder conditionSql = new StringBuilder("");

		Map<Object, Object> parameter = new HashMap<Object, Object>();
		if (StringUtils.isNotBlank(conditionDC.getAsString(IBOCmAttachExportValue.S_CreateDate))
				&& StringUtils.isNotBlank(conditionDC.getAsString(IBOCmAttachExportValue.S_DoneDate))) {
			conditionSql.append(" and " + IBOCmAttachExportValue.S_CreateDate + " >=DATE_FORMAT( :STARTDATE ,'%Y-%m-%d')");
			conditionSql.append(" and " + IBOCmAttachExportValue.S_CreateDate + " <=DATE_FORMAT( :ENDDATE ,'%Y-%m-%d')");

			parameter.put("STARTDATE", conditionDC.getAsString(IBOCmAttachExportValue.S_CreateDate).substring(0, 10));
			parameter.put("ENDDATE", conditionDC.getAsString(IBOCmAttachExportValue.S_DoneDate).substring(0, 10));
		}
		if (StringUtils.isNotBlank(conditionDC.getAsString(IBOCmAttachExportValue.S_FileName))) {
			conditionSql.append(" and " + IBOCmAttachExportValue.S_FileName + " = :FILENAME ");
			parameter.put("FILENAME", conditionDC.getAsString(IBOCmAttachExportValue.S_FileName));
		}
		if (StringUtils.isNotBlank(conditionDC.getAsString(IBOCmAttachExportValue.S_State))) {
			conditionSql.append(" and " + IBOCmAttachExportValue.S_State + " = :STATE ");
			parameter.put("STATE", conditionDC.getAsString(IBOCmAttachExportValue.S_State));
		}
		if (StringUtils.isNotBlank(conditionDC.getAsString(IBOCmAttachExportValue.S_FunctionCode))) {
			conditionSql.append(" and " + IBOCmAttachExportValue.S_FunctionCode + " = :FUNCTIONCODE ");
			parameter.put("FUNCTIONCODE", conditionDC.getAsString(IBOCmAttachExportValue.S_FunctionCode));
		}

		conditionSql.append(" and " + IBOCmAttachExportValue.S_OpId + " = :OPID ");
		parameter.put("OPID", SessionManager.getUser().getID());

		conditionSql.append(" order by create_date desc");

		DataContainerInterface[] addMem = CmInnerServiceFactory.getCommonInnerSV().getBeansFromSql(BOCmAttachExportBean.class,
				CmLnCommonUtil.getQueryCount(querySql.toString(), conditionSql.toString(), parameter), parameter);
		return addMem[0].getAsInt("CNT");
	}

	public void saveAttachValue(IBOCmAttachExportValue[] boCmAttachExportValue) throws Exception {
		if (CmCommonUtil.isEmptyObject(boCmAttachExportValue)) {
			throw new Exception("Save object is empty !");
		}
		ICmCommonInnerSV iCmcommonIneer = (ICmCommonInnerSV) ServiceFactory.getService(ICmCommonInnerSV.class);
		List<BOCmAttachExportBean> bocmAttachList = new ArrayList<BOCmAttachExportBean>();
		int len = boCmAttachExportValue.length;
		BOCmAttachExportBean cmattBean = null;
		for (int i = 0; i < len; i++) {
			cmattBean = new BOCmAttachExportBean();
			cmattBean.copy(boCmAttachExportValue[i]);
		}
		iCmcommonIneer.saveBeans(bocmAttachList.toArray(new BOCmAttachExportBean[0]));
	}

}
