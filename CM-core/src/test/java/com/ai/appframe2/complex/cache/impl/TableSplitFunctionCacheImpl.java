package com.ai.appframe2.complex.cache.impl;

import java.util.HashMap;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import com.ai.appframe2.service.ServiceFactory;
import com.ai.appframe2.util.locale.AppframeLocaleFactory;
import com.ai.appframe2.complex.self.po.TableSplitMapping;
import com.ai.appframe2.complex.tab.split.function.IFunction;
import com.ai.appframe2.complex.self.service.base.interfaces.IBaseSV;
import com.ai.appframe2.complex.cache.INoneAccelerateCache;

/**
 *
 * <p>Title: </p>
 * <p>Description: </p>
 * <p>Copyright: Copyright (c) 2008</p>
 * <p>Company: AI(NanJing)</p>
 * @author Yang Hua
 * @version 5.5
 */
public class TableSplitFunctionCacheImpl extends AbstractCache implements INoneAccelerateCache{
  private transient static Log log = LogFactory.getLog(TableSplitFunctionCacheImpl.class);

  public TableSplitFunctionCacheImpl() {
    super();
  }

  /**
   *
   * @throws Exception
   * @return HashMap
   */
	public HashMap getData() throws Exception {
		HashMap map = new HashMap();

		IBaseSV objIBaseSV = (IBaseSV) ServiceFactory.getService(IBaseSV.class);
		TableSplitMapping[] objTableSplitMapping = objIBaseSV.getAllTableSplitFunction();

		for (int i = 0; i < objTableSplitMapping.length; i++) {
			try {
				map.put(objTableSplitMapping[i].getColumnConvertClass().trim(), (IFunction) Class
						.forName(objTableSplitMapping[i].getColumnConvertClass().trim()).newInstance());
			} catch (ClassNotFoundException e) {
				log.warn(e);
			}
		}

		String[] func = objIBaseSV.getAllDyncSplitFunction();
		for (int i = 0; i < func.length; i++) {
			if (map.containsKey(func[i])) {
				log.error(AppframeLocaleFactory.getResource("com.ai.appframe2.complex.cache.impl.convertion_class",
						new String[] { func[i] }));// 已经加载函数转换类:" + func[i] + ",现在不加载"
			} else {
				map.put(func[i].trim(), (IFunction) Class.forName(func[i].trim()).newInstance());
			}
		}

		return map;
	}

}
