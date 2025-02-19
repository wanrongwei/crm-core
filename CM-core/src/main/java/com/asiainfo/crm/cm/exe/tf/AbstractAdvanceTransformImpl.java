/**
 * 
 */
package com.asiainfo.crm.cm.exe.tf;

import java.util.HashMap;

import com.asiainfo.appframe.ext.exeframe.tf.interfaces.IAdvanceTransform;

/**   
 * @Copyright Copyright (c) 2012 Asiainfo-Linkage
 * 
 * @ClassName 
 * @Description 该类的功能描述
 *
 * @version v1.0.0
 * @author huzq2
 * @date 2012-2-24 下午1:33:56
 * <br>
 * Modification History:<br>
 * Date         Author          Version            Description<br>
 * ---------------------------------------------------------*<br>
 * 2012-2-24     huzq2           v1.0.0               修改原因<br>
 */
public abstract class AbstractAdvanceTransformImpl implements IAdvanceTransform {

	/**
	 * 是否自己完成源表的处理
	 */
	protected boolean isSelfSrcFinish = false;

	/**
	 * 是否自己完成历史表的处理
	 */
	protected boolean isSelfHisFinish = false;

	/**
	 * 是否自己完成目标表的处理
	 */
	protected boolean isSelfDestFinish = false;

	public boolean isSelfSrcFinish() {
		return isSelfSrcFinish;
	}

	public void setSelfSrcFinish(boolean isSelfSrcFinish) {
		this.isSelfSrcFinish = isSelfSrcFinish;
	}

	public boolean isSelfHisFinish() {
		return isSelfHisFinish;
	}

	public void setSelfHisFinish(boolean isSelfHisFinish) {
		this.isSelfHisFinish = isSelfHisFinish;
	}

	public boolean isSelfDestFinish() {
		return isSelfDestFinish;
	}

	public void setSelfDestFinish(boolean isSelfDestFinish) {
		this.isSelfDestFinish = isSelfDestFinish;
	}

	public void destFinish(HashMap[] arg0) throws Exception {
	}

	public void hisFinish(HashMap[] arg0) throws Exception {
	}

	public void srcFinish(HashMap[] arg0) throws Exception {
	}

}
