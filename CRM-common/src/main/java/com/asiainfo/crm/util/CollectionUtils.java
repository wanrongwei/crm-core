package com.asiainfo.crm.util;

import java.lang.reflect.Array;
import java.util.Collection;

public class CollectionUtils {
    public static boolean isEmpty(Collection coll) {
        return coll == null || coll.isEmpty();
    }

    public static boolean isNotEmpty(Collection coll) {
        return !isEmpty(coll);
    }
    /**
     * @Function: isNotEmptyObject
     * @Description: 判断数组是否为空
     *
     * @param objs
     * @return true：非空；false：空
     *
     * @version: v1.0.0
     * @author: huzq2
     * @date: Mar 28, 2011 9:52:45 PM
     *
     * Modification History: Date Author Version Description
     * ---------------------------------------------------------* Mar 28, 2011
     * huzq2 v1.0.0 修改原因
     */
    public static boolean isNotEmptyObject(Object[] objs) {
        return (objs != null && Array.getLength(objs) > 0);
    }

    /**
     * 判断数组是否为空
     *
     * @Function isEmptyObject
     * @Description
     *
     * @param objs
     * @return true：空；false：非空
     *
     * @version v1.0.0
     * @author huzq
     * @date 2012-6-11 下午3:25:49
     *
     * <strong>Modification History:</strong><br>
     * Date Author Version Description<br>
     * ---------------------------------------------------------<br>
     * 2012-6-11 huzq v1.0.0 修改原因<br>
     */
    public static boolean isEmptyObject(Object[] objs) {
        return (objs == null || Array.getLength(objs) <= 0);
    }

}
