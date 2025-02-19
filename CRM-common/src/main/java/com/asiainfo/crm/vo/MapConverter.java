package com.asiainfo.crm.vo;

import com.asiainfo.crm.constant.Constant;
import com.thoughtworks.xstream.converters.Converter;
import com.thoughtworks.xstream.converters.MarshallingContext;
import com.thoughtworks.xstream.converters.UnmarshallingContext;
import com.thoughtworks.xstream.io.HierarchicalStreamReader;
import com.thoughtworks.xstream.io.HierarchicalStreamWriter;
import org.apache.commons.lang.ClassUtils;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

public class MapConverter implements Converter {

	public MapConverter() {
        super();
    }

    public boolean canConvert(Class clazz) {
    	boolean result = false;
    	//Map和List类型可以转换
        if(ClassUtils.isAssignable(clazz, Map.class) || ClassUtils.isAssignable(clazz, List.class) || clazz.isArray()) {
        	result = true;
        }
        return result;
    }

    public void marshal(Object value, HierarchicalStreamWriter writer, MarshallingContext context) {
        map2xml(value, writer, context, null);
    }
    
    /**
     * 该方法实现存在未知问题，暂不使用
     */
    @Deprecated
    public Object unmarshal(HierarchicalStreamReader reader, UnmarshallingContext context) {
        return populateMap(reader, context);
    }
    
    /**
     * 
     * @param value
     * @param writer
     * @param context
     * @param listKey 当某个key对应的数据为List/数组时，数据的每个位置都要根据该key生成一个xml节点
     */
    private void map2xml(Object value, HierarchicalStreamWriter writer, MarshallingContext context, String listKey) {
        boolean isMap = true;
        Class clazz = value.getClass();
        isMap = ClassUtils.isAssignable(clazz, Map.class);

        Object subvalue = null;
        if(isMap) {
            Map map = (Map)value;
            String key = null;
            for(Iterator iterator = map.entrySet().iterator(); iterator.hasNext(); ) {
                Entry entry = (Entry)iterator.next();
                key = (String)entry.getKey();
                subvalue = entry.getValue();
                if(subvalue == null){
                	subvalue = Constant.Common.EMPTY;
                }
                Class tmpClass = subvalue.getClass();
                boolean isSubList = ClassUtils.isAssignable(tmpClass, List.class) || tmpClass.isArray();	//子节点是否List/数组
                if(!isSubList) {	//子节点不是List/数组时才开始一个新的xml节点
                	writer.startNode(key);
                }
//                if(ClassUtils.isAssignable(subvalue.getClass(), String.class)) {
//                    writer.setValue((String)subvalue);
//                }else {
//                    map2xml(subvalue, writer, context, key);
//                }
                if(isSubList || ClassUtils.isAssignable(subvalue.getClass(), Map.class)) {
                	map2xml(subvalue, writer, context, key);
                }else {
                	writer.setValue(subvalue.toString());
                }
                if(!isSubList) {
                	writer.endNode();
                }
            }
        }else {
        	boolean isList = ClassUtils.isAssignable(clazz, List.class);
        	int len = isList ? ((List)value).size() : Array.getLength(value);
        	
        	for(int i=0; i<len; i++) {
        		subvalue = isList ? ((List)value).get(i) : Array.get(value, i);
        		if(subvalue == null){
                	subvalue = Constant.Common.EMPTY;
                }
        		writer.startNode(listKey);
//                if(ClassUtils.isAssignable(subvalue.getClass(), String.class)) {
//                    writer.setValue((String)subvalue);
//                }else {
//                    map2xml(subvalue, writer, context, null);
//                }
        		if(isList || clazz.isArray() ||  ClassUtils.isAssignable(subvalue.getClass(), Map.class)) {
                	map2xml(subvalue, writer, context, null);
                }else {
                	writer.setValue(subvalue.toString());
                }
                writer.endNode();
        	}
        }
    }
    
    /**
     * 该方法实现存在未知问题，暂不使用
     * @param reader
     * @param context
     * @return
     */
    @Deprecated
    private Object populateMap(HierarchicalStreamReader reader, UnmarshallingContext context) {
        boolean isMap = true;
        Map map = new ServiceParam();
        List list = new ArrayList();
        while(reader.hasMoreChildren()) {
            reader.moveDown();
            String key = reader.getNodeName();
            Object value = null;
            if(reader.hasMoreChildren()) {
                value = populateMap(reader, context);
            }else {
                value = reader.getValue();
            }
            if(isMap) {
                if(map.containsKey(key)) {
                    //转换为List
                    isMap = false;
                    for(Iterator iterator = map.entrySet().iterator(); iterator.hasNext(); ) {
                    	Entry entry = (Entry)iterator.next();
                    	list.add(entry.getValue());
                    }
                    //插入List
                    list.add(value);
                }else {
                    //插入Map
                    map.put(key, value);
                }
            }else {
                //插入List
                list.add(value);
            }
            reader.moveUp();
        }
        if(isMap) {
            return map;
        }else {
            return list;
        }
    }
}
