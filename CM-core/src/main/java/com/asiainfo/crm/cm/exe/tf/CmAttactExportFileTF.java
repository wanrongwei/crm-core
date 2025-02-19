package com.asiainfo.crm.cm.exe.tf;

import java.io.File;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import com.ai.appframe2.complex.cache.CacheFactory;
import com.ai.appframe2.service.ServiceFactory;
import com.ai.common.bo.BOBsFtpPathBean;
import com.ai.common.cache.BsFtpPathCacheImpl;
import com.asiainfo.appframe.ext.exeframe.tf.TfFrameWork;
import com.asiainfo.appframe.ext.exeframe.tf.interfaces.IAdvanceTransform;
import com.asiainfo.crm.cm.common.bo.BOCmAttachExportBean;
import com.asiainfo.crm.cm.common.ivalues.IBOCmAttachExporClassValue;
import com.asiainfo.crm.cm.common.util.CmAttachExColUtil;
import com.asiainfo.crm.cm.common.util.CmCommonUtil;
import com.asiainfo.crm.cm.exe.tf.service.interfaces.ICmAttachExportSV;
import com.asiainfo.crm.cm.ln.common.util.CmBusiEntry;
import com.asiainfo.crm.cm.ln.common.util.CmLnCommonUtil;

public class CmAttactExportFileTF implements IAdvanceTransform {
	private transient static Log log = LogFactory.getLog(CmBusiEntry.class);
	
	private static List AttachList=new ArrayList();
	
	private static Map cmServiceMap = new HashMap();
	
	//文件执行结果状态
	private static String retState_F="F"; //成功状态
	private static String retState_X="X"; //失败状态
	//private static String retState_U="U";//未处理状态
	
	private ICmAttachExportSV getCmAttachExport(){
		return (ICmAttachExportSV)ServiceFactory.getService(ICmAttachExportSV.class);
	}
	
	
	public void destFinish(HashMap[] arg0) throws Exception {
		//System.out.println("destFinish");
	}

	public void hisFinish(HashMap[] arg0) throws Exception {
		
		//System.out.println("hisFinish");
	}

	public boolean isSelfDestFinish() {
		//System.out.println("isSelfDestFinish");
		return false;
	}

	public boolean isSelfHisFinish() {
		
		//System.out.println("isSelfHisFinish");
		return false;
	}

	public boolean isSelfSrcFinish() {
		if (!AttachList.isEmpty()) {
			try {
				getCmAttachExport().saveAttactExportValue(AttachList);
			} catch (Exception e) {
				log.error("Save object error :"+e);
			}
		}
		AttachList.clear();
		return true;
	}

	public void srcFinish(HashMap[] ahashmap) throws Exception {
		//System.out.println("srcFinish");
	}

	/**
	 * 订单处理方法
	 */
	public void transform(HashMap[] ahashmap) throws Exception {
		int len=ahashmap.length;
		if (ahashmap != null && len > 0) {
			for (int i = 0; i < len; i++) {
				// 逐条处理同步处理工单
				transObject(ahashmap[i],AttachList);
			}
		}
	}
	
	/**
	 * 解析对象文件
	 * @param map
	 * @throws Exception 
	 */
	private void transObject(HashMap map,List AttachList) throws Exception{
		BOCmAttachExportBean iboAttachExportValue=new BOCmAttachExportBean();
		/*************************参数对象定义*********************************/
		//定义类名和方法命
		List ibocm=null;//导出字段文件
		String className="";//类名 参数
		String methName="";//方法名称 参数
		
		Class<?> interfaceClass =null;//类对象
		Method method = null;//方法名称
		
		//类对象
		IBOCmAttachExporClassValue colClass=null;
		
		//返回对象
		Object returnValue = null; 
		Map<?, ?> returnMap = null; 
		Object returnObj = null;
		
		
		//执行操作参数
		String retStats=retState_F;
		String newFileName="";
		String retMsg="Successful implementation !";
		
		/*************************业务对象方法**************************************/
		
	try{
			//类封装对象
			getCmAttachExport().getAttactValeuMap(iboAttachExportValue,map);
			
			//服务器文件名
			newFileName=iboAttachExportValue.getFileName()+"(" + new Date().getTime()+")";
			
			if(CmCommonUtil.isEmptyObj(iboAttachExportValue)){
				retMsg="The problems of configuration data";
				retStats=retState_X;
				saveAttactBean(iboAttachExportValue,retStats,newFileName,retMsg,AttachList);
				log.error(retMsg);
				return;
			}
		
			//类对象
			colClass=CmAttachExColUtil.getOneCmAttachExColClass(iboAttachExportValue.getMethCode());
			if (colClass==null) {
				retStats=retState_X;
				retMsg="Class is not configured !";
				saveAttactBean(iboAttachExportValue,retStats,newFileName,retMsg,AttachList);
				log.error("Class is not configured !");
				return;
			}
			 
			 className=colClass.getClassName();//"com.asiainfo.crm.cm.attach.service.interfaces.ICmOutFileSV";
			 methName=colClass.getMethName();//"outPutGrpCustList";
			 
			 interfaceClass = Class.forName(className);
			 method = interfaceClass.getMethod(methName, new Class[] { Map.class });
			 
			 if (log.isErrorEnabled()){
				 log.error("Call the class : ["+className+"],Call the method :["+methName+"]");
			 }
					
		 	Object serviceObject = null;
			if (cmServiceMap.containsKey(interfaceClass)) {
				serviceObject = cmServiceMap.get(interfaceClass);
			} else {
				serviceObject = ServiceFactory.getService(interfaceClass);
				cmServiceMap.put(interfaceClass, serviceObject);
			}
			
			//调用查询对象  1、拆分对象  2、查询对象
			returnValue = method.invoke(serviceObject, new Object[] { getCmAttachExport().getMapValue(iboAttachExportValue.getExportParameter()) });
				
			
			returnMap = (Map<?, ?>) returnValue;
			returnObj = returnMap.get("returnObj");
			if(returnObj==null){
				log.error("Returns object is empty :"+returnObj);
			}
			
			StringBuffer sf=new StringBuffer();
			BOBsFtpPathBean bsFtpPathValue = (BOBsFtpPathBean) CacheFactory.get(BsFtpPathCacheImpl.class,colClass.getFtpCode());
			sf.append(bsFtpPathValue.getLocalPath()).append(File.separator).append(newFileName).append(colClass.getFileMode());

			//读取缓存数据·
			ibocm=CmAttachExColUtil.getAttachExColOne(String.valueOf(iboAttachExportValue.getColCode()));
			
			//对象写入
			getCmAttachExport().writerObjValues(returnObj,ibocm,sf.toString());
			
			//文件上传
			getCmAttachExport().upFile(colClass,bsFtpPathValue,newFileName);
			
			//更改数据库中数据状态
			saveAttactBean(iboAttachExportValue,retStats,newFileName,retMsg,AttachList);
		}catch (Exception e) {
			retMsg=e.getMessage();
			retStats="X";
			//更改数据库中数据状态
			saveAttactBean(iboAttachExportValue,retStats,newFileName,retMsg,AttachList);
			log.error("Processing failure:"+e.getMessage(),e);
			return;
		}
		
	}
	
	
	/**
	 * 更改状态
	 * @throws Exception
	 */
	private void saveAttactBean(BOCmAttachExportBean iboAttachExportValue,String stats,String attachName,String retMsg,List AttachList)throws Exception{
		iboAttachExportValue.setStsToOld();
		iboAttachExportValue.setState(stats);
		iboAttachExportValue.setReason(retMsg);
		iboAttachExportValue.setAttacyName(attachName);
		iboAttachExportValue.setDoneDate(CmLnCommonUtil.getSysDateTime());
		AttachList.add(iboAttachExportValue);
	}


	public static void main(String[] args) throws Exception {
		TfFrameWork.main(new String[] { "CM_ATTACH_EXPORT", "1", "0" });
	}
}




















