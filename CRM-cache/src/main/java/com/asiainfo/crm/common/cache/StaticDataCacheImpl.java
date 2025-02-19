package com.asiainfo.crm.common.cache;

import com.ai.appframe2.complex.cache.impl.AbstractCache;
import com.ai.appframe2.service.ServiceFactory;
import com.ai.common.i18n.CrmLocaleFactory;
import com.ai.common.ivalues.IBOBsStaticDataValue;
import com.ai.common.service.base.interfaces.IBaseSV;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import java.util.*;

public class StaticDataCacheImpl extends AbstractCache {
    private static transient Log log = LogFactory.getLog(com.ai.common.cache.StaticDataCacheImpl.class);
    public static final String CODE_TYPE_CODE_VALUE_SPLIT_CHAR = "^";
    public static final String CODE_TYPE_PREFIX_KEY = "_CT^";

    public StaticDataCacheImpl() {
    }

    public HashMap getData() throws Exception {
        HashMap map = new HashMap();
        IBaseSV objIBaseSV = (IBaseSV) ServiceFactory.getService(IBaseSV.class);
        IBOBsStaticDataValue[] objIBSStaticDataValue = objIBaseSV.getAllBsStaticData();
        HashMap codeTypeMap = new HashMap();

        for(int i = 0; i < objIBSStaticDataValue.length; ++i) {
            map.put(objIBSStaticDataValue[i].getCodeType() + "^" + objIBSStaticDataValue[i].getCodeValue(), objIBSStaticDataValue[i]);
            if (codeTypeMap.containsKey(objIBSStaticDataValue[i].getCodeType())) {
                List list = (List)codeTypeMap.get(objIBSStaticDataValue[i].getCodeType());
                list.add(objIBSStaticDataValue[i]);
            } else {
                List list = new ArrayList();
                list.add(objIBSStaticDataValue[i]);
                codeTypeMap.put(objIBSStaticDataValue[i].getCodeType(), list);
            }
        }

        Set keys = codeTypeMap.keySet();
        Iterator iter = keys.iterator();

        while(iter.hasNext()) {
            String item = (String)iter.next();
            map.put("_CT^" + item, (IBOBsStaticDataValue[])((IBOBsStaticDataValue[])((List)codeTypeMap.get(item)).toArray(new IBOBsStaticDataValue[0])));
        }

        if (log.isDebugEnabled()) {
            log.debug(CrmLocaleFactory.getResource("BAS0000001", new String[]{"" + map.size()}));
        }

        return map;
    }
}
