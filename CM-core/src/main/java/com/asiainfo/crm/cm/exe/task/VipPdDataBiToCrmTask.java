package com.asiainfo.crm.cm.exe.task;

import com.asiainfo.appframe.ext.exeframe.task.interfaces.ITask;
import com.asiainfo.crm.cm.exe.task.bi.trans.BiDataProcess;

/**
 * 
 * Copyright: Copyright (c) 2011 Asiainfo-Linkage
 * 
 * @ClassName: VipPdDataBiToCrmTask.java
 * @Description: 全球通VIP等级数据抽取任务类
 *
 * @version: v1.0.0
 * @author: xialing
 * @date: Jun 24, 2011 3:27:16 PM 
 *
 * Modification History:
 * Date         Author          Version            Description
 *---------------------------------------------------------*
 * Jun 24, 2011		xialing           v1.0.0               修改原因
 */
public class VipPdDataBiToCrmTask implements ITask
{

	public String doTask(long taskId) throws Exception
	{
		return BiDataProcess.getInstance().mainProcess(taskId);
	}

}
