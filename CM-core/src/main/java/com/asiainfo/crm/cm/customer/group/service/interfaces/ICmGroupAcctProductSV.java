package com.asiainfo.crm.cm.customer.group.service.interfaces;


import com.asiainfo.crm.so.query.ivalues.IQUserRelInfoValue;

public interface ICmGroupAcctProductSV {
    
    
    /**
     * 查询账户下所有的产品信息（调用集团业务接口com.asiainfo.crm.so.teaminvoke.out.service.interfaces .ISoBusiSV 类 getAcctrelProdByAcctId 方法）
     * @param acctId
     * @return
     * @throws Exception
     */
    public IQUserRelInfoValue[] queryInfo(String acctId) throws Exception;
}
