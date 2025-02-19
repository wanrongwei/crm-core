package com.asiainfo.crm.cm.teaminvoke;

import com.ai.appframe2.common.ServiceManager;
import com.ai.appframe2.complex.center.CenterFactory;
import com.ai.appframe2.privilege.UserInfoInterface;
import com.ai.common.util.TimeUtil;
import com.ai.omframe.common.service.interfaces.CenterConst;
import com.asiainfo.crm.so.teaminvoke.out.service.interfaces.ICrmFSV;
import com.ai.appframe2.service.ServiceFactory;

/**   
 * Copyright: Copyright (c) 2012 Asiainfo-Linkage
 * 
 * @ClassName: Test.java
 * @Description: 该类的功能描述
 *
 * @version: v1.0.0
 * @author: zhouts
 * @date: 2012-8-3 上午10:36:41 
 *
 * Modification History:
 * Date         Author          Version            Description
 *-----------------------------------------------------------
 * 2012-8-3     zhouts           v1.0.0               修改原因
 */
public class TestCase {
	public static void main(String[] args) throws Exception{
        UserInfoInterface user = ServiceManager.getNewBlankUserInfo();

        user.setID(99990000L);
        user.setOrgId(14);
        user.set("REGION_ID", "418");
        user.setCode("f888888");

        ServiceManager.setServiceUserInfo(user);
       // CenterFactory.setCenterInfoByTypeAndValue(CenterConst.REGION_ID,"418");
        //String startDate="2013-01-01 00:00:00";
        //TimeUtil.getTimstampByString(startDate, "yyyy-MM-dd HH:mm:ss");
       // ICrmFSV sv=(ICrmFSV) ServiceFactory.getService(ICrmFSV.class);
        //sv.queryGroupWorkTaskInfoCount("27000045", "2", "2013-01-01", "2013-01-10");
       // sv.queryGroupWorkTaskInfo(23401000073720L,"24014521","2","2","2013-01-01", "2013-01-10",1,10);

	}
}
