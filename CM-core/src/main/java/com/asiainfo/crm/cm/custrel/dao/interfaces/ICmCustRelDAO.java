package com.asiainfo.crm.cm.custrel.dao.interfaces;

import com.asiainfo.crm.cm.custrel.ivalues.IBOCmCustRelValue;

import java.util.Map;

/**
 * User: caiwm
 * Date: 13-8-7
 * Time: 下午12:39
 */
public interface ICmCustRelDAO {

    /**
     * @param condition
     * @param params
     * @return
     * @throws Exception
     */
    public IBOCmCustRelValue[] queryCmCustRelValues(String condition, Map<String, Object> params) throws Exception;

    /**
     * @param value
     * @throws Exception
     */
    public void saveRelationship(IBOCmCustRelValue value) throws Exception;

    /**
     * 批量保存关系数据
     *
     * @param values
     * @throws Exception
     */
    public void saveRelationshipBatch(IBOCmCustRelValue[] values) throws Exception;
}
