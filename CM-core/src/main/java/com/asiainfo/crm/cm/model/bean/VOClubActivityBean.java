/**
 * 
 */
package com.asiainfo.crm.cm.model.bean;

import java.util.ArrayList;
import java.util.List;

import com.ai.common.util.ExceptionUtil;
import com.asiainfo.crm.cm.model.bo.ClubActionRecBean;
import com.asiainfo.crm.cm.model.ivalues.IClubActionRecValue;
import com.asiainfo.crm.cm.model.ivalues.IClubActionValue;
import com.asiainfo.crm.cm.model.ivalues.IClubValue;
import com.asiainfo.crm.cm.model.ivalues.IVOClubActivityValue;

/**   
 * @Copyright Copyright (c) 2012 Asiainfo-Linkage
 * 
 * @ClassName 
 * @Description 该类的功能描述
 *
 * @version v1.0.0
 * @author huzq2
 * @date 2012-3-12 下午11:31:46
 * <br>
 * Modification History:<br>
 * Date         Author          Version            Description<br>
 * ---------------------------------------------------------*<br>
 * 2012-3-12     huzq2           v1.0.0               修改原因<br>
 */
public class VOClubActivityBean extends ValueObjectBean implements IVOClubActivityValue {

	/**
	 * 
	 */
	private static final long serialVersionUID = -4283258372355927051L;
	private IClubActionValue actionValue = null;
	private IClubValue clubValue = null;
	private List<IClubActionRecValue> actionRecValues = new ArrayList<IClubActionRecValue>();

	public long getClubId() {
		if (this.actionValue != null) {
			return this.actionValue.getClubId();
		}
		return 0;
	}

	public long getClubActivityId() {
		if (this.actionValue != null) {
			return this.actionValue.getActionId();
		}
		return 0;
	}

	public IClubValue getClub() throws Exception {
		return this.clubValue;
	}

	public long setClub(IClubValue clubValue) throws Exception {
		if (clubValue == null) {
			ExceptionUtil.throwBusinessException("CMS0030015");
		}
		this.clubValue = clubValue;
		return clubValue.getClubId();
	}

	public IClubActionValue getClubAction() throws Exception {
		return this.actionValue;
	}

	public long setClubAction(IClubActionValue actionValue) throws Exception {
		this.actionValue = actionValue;
		if (this.actionValue != null) {
			return this.actionValue.getActionId();
		}
		return -1;
	}

	public IClubActionRecValue[] getClubActionRecs() throws Exception {
		return this.actionRecValues.toArray(new ClubActionRecBean[0]);
	}

	public long setClubActionRec(IClubActionRecValue actionRecValue) throws Exception {
		if (actionRecValue == null) {
			ExceptionUtil.throwBusinessException("CMS0030015");
		}
		this.actionRecValues.add(actionRecValue);
		return actionRecValue.getRecordId();
	}

	public IClubActionRecValue removeClubActionRec(IClubActionRecValue actionRecValue) throws Exception {
		if (actionRecValue == null) {
			ExceptionUtil.throwBusinessException("CMS0030015");
		}
		this.actionRecValues.remove(actionRecValue);
		return actionRecValue;
	}

	public long getId() {
		return getClubActivityId();
	}

}
