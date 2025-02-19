/**
 * 
 */
package com.asiainfo.crm.cm.model.bean;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import com.ai.appframe2.common.DataType;
import com.asiainfo.crm.cm.common.util.CmCommonUtil;
import com.asiainfo.crm.cm.model.ivalues.ISpecialListValue;
import com.asiainfo.crm.cm.model.ivalues.IVOSpecialListValue;

/**   
 * @Copyright Copyright (c) 2012 Asiainfo-Linkage
 * 
 * @ClassName 
 * @Description 该类的功能描述
 *
 * @version v1.0.0
 * @author huzq
 * @date 2012-7-17 下午4:39:53
 * <br>
 * Modification History:<br>
 * Date         Author          Version            Description<br>
 * ---------------------------------------------------------*<br>
 * 2012-7-17     huzq           v1.0.0               修改原因<br>
 */
public class VOSpecialListBean extends ValueObjectBean implements IVOSpecialListValue {

	/**
	 * 
	 */
	private static final long serialVersionUID = -815253803070643375L;

	private List specialList = new ArrayList();

	public void addSpecialList(ISpecialListValue specialListValue) {
		if (specialListValue != null) {
			specialList.add(specialListValue);
		}
	}

	public long getId() {
		return DataType.getAsLong(S_SPECIAL_LIST_ID);
	}

	public List getSpecialListList() {
		return specialList;
	}

	public ISpecialListValue[] getSpecialLists() {
		return (ISpecialListValue[]) specialList.toArray(new ISpecialListValue[0]);
	}

	public boolean hasSpecialLists() {
		return CmCommonUtil.isNotEmptyObject(specialList);
	}

	public ISpecialListValue removeSpecialList(ISpecialListValue specialListValue) {
		if (specialList.remove(specialListValue)) {
			return specialListValue;
		}
		return null;
	}

	public void setId(long id) throws Exception {
		setUserObject(S_SPECIAL_LIST_ID, id);
	}

	public void addSpecialLists(ISpecialListValue[] specialListValues) {
		if (specialListValues != null && specialListValues.length > 0) {
			specialList.addAll(Arrays.asList(specialListValues));
		}
	}

}
