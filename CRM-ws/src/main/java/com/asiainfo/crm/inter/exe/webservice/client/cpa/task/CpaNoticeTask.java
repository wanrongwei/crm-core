package com.asiainfo.crm.inter.exe.webservice.client.cpa.task;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.HashMap;
import java.util.Map;

import net.sf.json.JSONObject;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import com.ai.appframe2.service.ServiceFactory;
import com.ai.common.util.ExceptionUtil;
import com.asiainfo.appframe.ext.exeframe.task.interfaces.ITask;
import com.asiainfo.appframe.ext.exeframe.task.query.ivalues.IBOCfgTaskParamValueValue;
import com.asiainfo.appframe.ext.exeframe.task.query.service.interfaces.ITaskSV;
import com.asiainfo.crm.inter.exe.webservice.client.cpa.CPABusinessServiceFactory;
import com.asiainfo.crm.inter.exe.webservice.client.cpa.SyncIncrementalSubscriberInfoRequest;

public class CpaNoticeTask implements ITask {

	private transient static Log log = LogFactory.getLog(CpaNoticeTask.class);

	public final static long REQUEST_PARAM = 10000;
	public final static long TIME_PARAM = 1000;
	public final static long SPLIT_PARAM = 1001;

	public final static int SPLIT_SIZE = 200;
	public final static SimpleDateFormat sdf = new SimpleDateFormat("yyyyMMddHHmmss");

	@Override
	public String doTask(long cfgTaskId) throws Exception {
		try {
			execute(cfgTaskId);
		} catch (Exception e) {
			log.error("Do Task Error", e);
			throw e;
		}
		return cfgTaskId + this.getClass().getSimpleName() + " doTask successed!";
	}

	private void execute(long cfgTaskId) throws Exception {
		ITaskSV taskSV = (ITaskSV) ServiceFactory.getService(ITaskSV.class);
		IBOCfgTaskParamValueValue[] taskParams = taskSV.getCfgTaskParamValueByTaskId(cfgTaskId);

		SyncIncrementalSubscriberInfoRequest request = null;
		Calendar calendar = null;

		Map<Long, String> params = new HashMap<Long, String>();
		for (IBOCfgTaskParamValueValue taskParam : taskParams) {
			params.put(taskParam.getParamId(), taskParam.getParamValue());
		}

		String timeParam = params.get(TIME_PARAM);
		if (timeParam != null) {
			calendar = Calendar.getInstance();
			calendar.setTime(sdf.parse(timeParam));
		}

		String splitParam = params.get(SPLIT_PARAM);
		if (splitParam != null) {
			int size = Integer.parseInt(splitParam);
			StringBuilder sb = new StringBuilder();
			for (int i = 1; i <= size; i++) {
				sb.append(params.get(REQUEST_PARAM + i));
			}
			JSONObject fromString = JSONObject.fromString(sb.toString(), new String[] { "originalInitDate" });
			request = (SyncIncrementalSubscriberInfoRequest) JSONObject.toBean(fromString, SyncIncrementalSubscriberInfoRequest.class);
		} else {
			ExceptionUtil.throwBusinessException("BSS0000644");
		}

		if (request != null && calendar != null) {
			request.getRequestBody().setOriginalInitDate(calendar);
		}

		if (request != null) {
			CPABusinessServiceFactory.getService().getCPAFileInterfacePort().syncIncrementalSubscriberInfo(request);
		} else {
			ExceptionUtil.throwBusinessException("BSS0000644");
		}

	}
	
	public static void main(String[] args) throws Exception {
		System.setProperty("tenant.id", "21");
		new CpaUserTask().doTask(50000000595L);
	}

}
