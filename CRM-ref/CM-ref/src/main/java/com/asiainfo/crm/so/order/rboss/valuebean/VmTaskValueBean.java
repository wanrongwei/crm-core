package com.asiainfo.crm.so.order.rboss.valuebean;

import com.ai.appframe2.common.AIException;
import com.ai.appframe2.util.ITreeNodeInfo;
import com.ai.comframe.vm.workflow.bo.BOVmTaskBean;

public class VmTaskValueBean extends BOVmTaskBean implements ITreeNodeInfo {

	private static final long serialVersionUID = 6674764751038802659L;
	private long sortId=-1;
	protected int m_level =-1;
	protected int m_childCount =-1;
	protected String m_childRowIndexs ="";
	
	public VmTaskValueBean() throws AIException {
		super();
	}

	public int getChildCount() {
		return this.m_childCount;
	}

	public String getChildRowIndexs() {
		return this.m_childRowIndexs;
	}

	public long getId() {
		if(this.getTaskId().indexOf("^")>=0){
			String[] idArray=this.getTaskId().split("\\^");
			return Long.parseLong(idArray[idArray.length-1]);
		}
		return Long.parseLong(this.getTaskId());
	}

	public int getLevel() {
		return this.m_level;
	}

	public long getParentId() {
		// 自己手工把parentTaskId放到这个字段
		if(this.getEngineTaskId().indexOf("^")>=0){
			String[] idArray=this.getEngineTaskId().split("\\^");
			return Long.parseLong(idArray[idArray.length-1]);
		}
		return Long.parseLong(this.getEngineTaskId());
	}

	public long getSortId() {
		if(sortId>0){
			return sortId;
		}
		if(this.getTaskId().indexOf("^")>=0){
			String[] idArray=this.getTaskId().split("\\^");
			return Long.parseLong(idArray[idArray.length-1]);
		}
		return Long.parseLong(this.getTaskId());
	}

	public void setChildCount(int count) {
		this.m_childCount = count;
		
	}

	public void setChildRowIndexs(String rows) {
		this.m_childRowIndexs = rows;
	}

	public void setLevel(int level) {
		this.m_level = level;
	}
	
	public void setSortId(long sortId) {
		this.sortId = sortId;
	}
	
}
