/**
 * 
 */
package com.asiainfo.crm.cm.exe.tf.service.impl;

import java.util.Map;

import com.ai.appframe2.service.ServiceFactory;
import com.asiainfo.crm.cm.exe.tf.dao.interfaces.ICmPsBusiDAO;
import com.asiainfo.crm.cm.exe.tf.ivalues.IBOCmPsBusiRecValue;
import com.asiainfo.crm.cm.exe.tf.service.interfaces.ICmPsBusiSV;

/**   
 * @Copyright Copyright (c) 2012 Asiainfo-Linkage
 * 
 * @ClassName 
 * @Description 该类的功能描述
 *
 * @version v1.0.0
 * @author huzq2
 * @date 2012-2-24 下午2:21:01
 * <br>
 * Modification History:<br>
 * Date         Author          Version            Description<br>
 * ---------------------------------------------------------*<br>
 * 2012-2-24     huzq2           v1.0.0               修改原因<br>
 */
public class CmPsBusiSVImpl implements ICmPsBusiSV {

	private ICmPsBusiDAO getBusiDAO() {
		return (ICmPsBusiDAO) ServiceFactory.getService(ICmPsBusiDAO.class);
	}

	public void savePsBusiRecs(IBOCmPsBusiRecValue[] psBusiRecValues) throws Exception {
		getBusiDAO().savePsBusiRecs(psBusiRecValues);
	}

}
