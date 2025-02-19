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
 * @date 2012-7-16 下午7:26:22
 * <br>
 * Modification History:<br>
 * Date         Author          Version            Description<br>
 * ---------------------------------------------------------*<br>
 * 2012-7-16     huzq           v1.0.0               修改原因<br>
 */
public interface IVOBusiLogValue extends IValueObject {

	public ICmBusiLogValue getMainBusiLog();

	public void setMainBusiLog(ICmBusiLogValue busiLogValue);

	public ICmBusiLogValue[] getBusiLogDetails();

	public List getBusiLogDetailList();

	public void addBusiLogDetail(ICmBusiLogValue busiLogValue) throws Exception;

	public void addBusiLogDetails(ICmBusiLogValue[] busiLogValues);

	public boolean hasBusiLogDetails();
}
