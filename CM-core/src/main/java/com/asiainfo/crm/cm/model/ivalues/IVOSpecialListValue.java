/**
 * 
 */
package com.asiainfo.crm.cm.model.ivalues;

import java.util.List;

/**   
 * @Copyright Copyright (c) 2012 Asiainfo-Linkage
 * 
 * @ClassName 
 * @Description 该类的功能描述
 *
 * @version v1.0.0
 * @author huzq
 * @date 2012-7-17 下午4:33:57
 * <br>
 * Modification History:<br>
 * Date         Author          Version            Description<br>
 * ---------------------------------------------------------*<br>
 * 2012-7-17     huzq           v1.0.0               修改原因<br>
 */
public interface IVOSpecialListValue extends IValueObject {

	public static final String S_SPECIAL_LIST_ID = "SPECIAL_LIST_ID";

	public void addSpecialList(ISpecialListValue specialListValue);

	public List getSpecialListList();

	public ISpecialListValue[] getSpecialLists();

	public boolean hasSpecialLists();
	
	public ISpecialListValue removeSpecialList(ISpecialListValue specialListValue);

	public void setId(long id) throws Exception;

	public void addSpecialLists(ISpecialListValue[] specialListValues);
}
