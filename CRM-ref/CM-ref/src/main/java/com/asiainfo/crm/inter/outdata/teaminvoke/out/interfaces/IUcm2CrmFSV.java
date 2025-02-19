package com.asiainfo.crm.inter.outdata.teaminvoke.out.interfaces;

import com.ai.omframe.instance.ivalues.IInsUserValue;
import com.ai.omframe.order.ivalues.IOVOrderCustomer;



/**
 * 
 * Copyright: Copyright (c) 2011 Asiainfo
 * 
 * @ClassName: IUcm2CrmFSV.java
 * @Description: 统一接口组提供给CRM的接口类
 *
 * @version: v1.0.0
 * @author: chenzj
 * @date: Mar 10, 2011 7:38:00 PM 
 *
 * Modification History:
 * Date         Author          Version            Description
 *------------------------------------------------------------
 * Mar 10, 2011     chenzj           v1.0.0               修改原因
 */
 
public interface IUcm2CrmFSV {
	

    /**
     * 
     * @Function: IUcm2CrmFSV::unifybilling
     * @Description: 统一计费接口
     * @param aICustomerL
     * @param aIDataEKEL
     * @throws java.rmi.RemoteException
     * @throws Exception
     * @version: v1.0.0
     * @author: chenzj
     * @date: Mar 10, 2011 7:38:38 PM 
     *
     * Modification History:
     * Date         Author          Version            Description
     *-------------------------------------------------------------
     */
      
    public void unifybilling( IOVOrderCustomer aICustomerL , java.util.HashMap aIDataEKEL ) throws java.rmi.RemoteException,Exception;
    
    /**
     * 
     * @Function: IUcm2CrmFSV::unifybilling
     * @Description: 统一计费后台进程接口
     * @param aIInsUseL
     * @param aBusinessId
     * @param aIDataEKEL
     * @throws java.rmi.RemoteException
     * @throws Exception
     * @version: v1.0.0
     * @author: chenzj
     * @date: Mar 10, 2011 7:38:47 PM 
     *
     * Modification History:
     * Date         Author          Version            Description
     *-------------------------------------------------------------
     */
     
    public void unifybilling( IInsUserValue aIInsUseL , long aBusinessId , java.util.HashMap aIDataEKEL ) throws java.rmi.RemoteException,Exception;

    
    /**
     * 受控用户上发接口
     * @param aBusinessId
     * @param aIDataEKEL
     * @throws java.rmi.RemoteException
     * @throws Exception
     */
    public void unifybilling(long aBusinessId, java.util.HashMap aIDataEKEL) throws java.rmi.RemoteException,Exception;
    
    public String  getCoTypeId(long offerId) throws Exception;
    
}
