//package com.asiainfo.crm.cm.custrel.dao.impl;
//
//import com.asiainfo.crm.cm.custrel.bo.BOCmCustRelEngine;
//import com.asiainfo.crm.cm.custrel.dao.interfaces.ICmCustRelDAO;
//import com.asiainfo.crm.cm.custrel.ivalues.IBOCmCustRelValue;
//
//import java.util.Map;
//
///**
// * User: caiwm
// * Date: 13-8-7
// * Time: 下午12:40
// */
//public class CmCustRelDAOImpl implements ICmCustRelDAO {
//
//    public IBOCmCustRelValue[] queryCmCustRelValues(String condition, Map<String, Object> params) throws Exception {
//        return BOCmCustRelEngine.getBeans(condition, params);
//    }
//
//
//    public void saveRelationship(IBOCmCustRelValue value) throws Exception {
//        if (null == value) return;
//        if (value.isNew()) {
//            value.setCustRelId(BOCmCustRelEngine.getNewId().longValue());
//            if (value.getRelationId() <= 0) {
//                value.setRelationId(value.getCustRelId());
//            }
//        }
//
//        BOCmCustRelEngine.save(value);
//    }
//
//    public void saveRelationshipBatch(IBOCmCustRelValue[] values) throws Exception {
//        if (null == values || values.length < 1) {
//            return;
//        }
//        BOCmCustRelEngine.save(values);
//    }
//}
