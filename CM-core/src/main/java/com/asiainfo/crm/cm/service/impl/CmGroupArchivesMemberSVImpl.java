package com.asiainfo.crm.cm.service.impl;

import com.ai.appframe2.bo.DataContainer;
import com.asiainfo.crm.cm.busimodel.impl.common.AbstractCmGroupArchivesMemberImpl;
import com.asiainfo.crm.cm.common.CmServiceFactory;
import com.asiainfo.crm.cm.service.interfaces.ICmGroupArchivesMemberSV;
/**
 * 
* Copyright: Copyright (c) 2012 Asiainfo-Linkage
* 
* @ClassName: CmGroupArchivesMemberSVImpl.java
* @Description: 集团建档员工管理
*
* @version: v1.0.0
* @author: suntao6
* @date: Jul 24, 2012 4:12:24 PM 
*
* Modification History:
* Date         Author          Version            Description
*---------------------------------------------------------*
* Jul 24, 2012      suntao6          v1.0.0             修改原因
 */
public class CmGroupArchivesMemberSVImpl implements ICmGroupArchivesMemberSV {

	public DataContainer[] queryGroupArchivesMember(String criteria,
			int startNum, int endNum) throws Exception {

		return ((AbstractCmGroupArchivesMemberImpl)CmServiceFactory.getBusiMode(AbstractCmGroupArchivesMemberImpl.class)).queryData(criteria, startNum, endNum);
	}

	public int queryGroupArchivesMemberCount(String criteria) throws Exception {

		return ((AbstractCmGroupArchivesMemberImpl) CmServiceFactory.getBusiMode(AbstractCmGroupArchivesMemberImpl.class)).queryCount(criteria);
	}

	public void saveGroupArchivesMember(DataContainer[] values)
			throws Exception {

		((AbstractCmGroupArchivesMemberImpl) CmServiceFactory.getBusiMode(AbstractCmGroupArchivesMemberImpl.class)).saveGroupArchives(values);
	}

}
