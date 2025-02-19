package com.asiainfo.crm.cm.common.util;

import java.sql.Connection;
import java.util.HashMap;
import java.util.Map;

import org.apache.commons.lang.StringUtils;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import com.ai.appframe2.common.ServiceManager;
import com.ai.appframe2.complex.cache.CacheFactory;
import com.ai.appframe2.complex.datasource.DataSourceFactory;
import com.ai.appframe2.complex.xml.XMLHelper;
import com.ai.appframe2.complex.xml.cfg.defaults.Pool;
import com.ai.common.cache.BsCenterCacheImpl;
import com.ai.common.util.ExceptionUtil;

/**
 * <p> @Description </p>
 * <p> @company Asiainfo-linkage (NJ) </p>
 * <p> @author 闫瑞国 </p>
 * <p> @Email yanrg@asiainfo-linkage.com </p>
 * <p> @createDate Mar 7, 2012 4:41:34 PM </p>
 * <p> @modifyDate </p>
 * <p> @version 1.0 </p>
 */
public class CmConnUtil {
	private final static transient Log log = LogFactory.getLog(CmConnUtil.class);
	
	private static final String DATA_SOURCE_PARTY = "party";
	private static final String DATA_SOURCE_SO = "so";

	private static final Map poolMap = new HashMap();

	static {
		try {
			Pool[] pools = XMLHelper.getInstance().getDefaults().getDatasource().getPools();
			if(pools!=null && pools.length>0){
				for (int i = 0; i < pools.length; i++) {
					poolMap.put(pools[i].getName(), "");
				}
			}
			
		} catch (Exception e) {
			log.error("", e);
		}
	}
	
	
	
	/**
	 * 获得base库只读连接
		* @Function: ConnUtil.java
		* @Description: 
		*
		* @return
		* @throws Exception
		*
		* @version: v1.0.0
		* @author: yanrg
		* @date: Mar 7, 2012 4:46:02 PM
		*
		* Modification History:
		* Date         		    Author          	 Version            
		*-------------------------------------------------------*
		* Mar 7, 2012 4:46:02 PM       yanrg                 v1.0.0
	 */
	public static Connection getReadOnlyBaseConn() throws Exception {
		return ServiceManager.getSession().getConnection(DataSourceFactory.getDataSource().getPrimaryDataSource());
	}

	/**
	 * 获得base可写连接
		* @Function: ConnUtil.java
		* @Description: 
		*
		* @return
		* @throws Exception
		*
		* @version: v1.0.0
		* @author: yanrg
		* @date: Mar 7, 2012 4:47:40 PM
		*
		* Modification History:
		* Date         		    Author          	 Version            
		*-------------------------------------------------------*
		* Mar 7, 2012 4:47:40 PM       yanrg                 v1.0.0
	 */
	public static Connection getWriteAbleBaseConn() throws Exception {
		return ServiceManager.getSession().getNewConnection(DataSourceFactory.getDataSource().getPrimaryDataSource());
	}
	
	
	/**
	 * 获得party只读连接
		* @Function: ConnUtil.java
		* @Description: 
		*
		* @return
		* @throws Exception
		*
		* @version: v1.0.0
		* @author: yanrg
		* @date: Mar 7, 2012 5:08:02 PM
		*
		* Modification History:
		* Date         		    Author          	 Version            
		*-------------------------------------------------------*
		* Mar 7, 2012 5:08:02 PM       yanrg                 v1.0.0
	 */
	public static Connection getReadOnlyPartyConn() throws Exception {
		return ServiceManager.getSession().getConnection(getRealDataSource(DATA_SOURCE_PARTY,""));
	}
	
	/**
	 * 获得party可写连接
		* @Function: ConnUtil.java
		* @Description: 
		*
		* @return
		* @throws Exception
		*
		* @version: v1.0.0
		* @author: yanrg
		* @date: Mar 7, 2012 4:47:40 PM
		*
		* Modification History:
		* Date         		    Author          	 Version            
		*-------------------------------------------------------*
		* Mar 7, 2012 4:47:40 PM       yanrg                 v1.0.0
	 */
	public static Connection getWriteAblePartyConn() throws Exception {
		return ServiceManager.getSession().getNewConnection(getRealDataSource(DATA_SOURCE_PARTY,""));
	}
	
	/**
	 * 获得so只读连接
		* @Function: ConnUtil.java
		* @Description: 
		*
		* @return
		* @throws Exception
		*
		* @version: v1.0.0
		* @author: yanrg
		* @date: Mar 7, 2012 5:08:02 PM
		*
		* Modification History:
		* Date         		    Author          	 Version            
		*-------------------------------------------------------*
		* Mar 7, 2012 5:08:02 PM       yanrg                 v1.0.0
	 */
	public static Connection getReadOnlySoConn(String regionId) throws Exception {
		return ServiceManager.getSession().getConnection(getRealDataSource(DATA_SOURCE_SO,regionId));
	}
	
	/**
	 * 获得so可写连接
		* @Function: ConnUtil.java
		* @Description: 
		*
		* @return
		* @throws Exception
		*
		* @version: v1.0.0
		* @author: yanrg
		* @date: Mar 7, 2012 4:47:40 PM
		*
		* Modification History:
		* Date         		    Author          	 Version            
		*-------------------------------------------------------*
		* Mar 7, 2012 4:47:40 PM       yanrg                 v1.0.0
	 */
	public static Connection getWriteAbleSoConn(String regionId) throws Exception {
		return ServiceManager.getSession().getNewConnection(getRealDataSource(DATA_SOURCE_SO,regionId));
	}
	
	private static String getRealDataSource(String dataSourceName,String regionId)throws Exception{
		String realDataSource = null;
		if(poolMap.containsKey(dataSourceName)){
			realDataSource = dataSourceName;
		}else {
			if(StringUtils.isNotBlank(regionId)){
				String centerNumber = (String) CacheFactory.get(BsCenterCacheImpl.class, new StringBuilder().append(BsCenterCacheImpl.RC).append(regionId).toString());
				StringBuilder sb = new StringBuilder().append(dataSourceName).append(centerNumber);
				if(poolMap.containsKey(sb.toString())){
					realDataSource = sb.toString();
				}else{
					//根据数据源名称-[{0}]-和地市标识-[{1}]-没有获得真实数据源！
					ExceptionUtil.throwBusinessException("CMS0000152",dataSourceName,regionId);
				}
					
			}else {
				//地市为空！
				ExceptionUtil.throwBusinessException("CMS0000151");
			}
			
		}
		return realDataSource;
	}

	/**
	 * @Function: ConnUtil.java
	 * @Description: 
	 *
	 * @param args
	 *
	 * @version: v1.0.0
	 * @author: yanrg
	 * @date: Mar 7, 2012 4:41:34 PM
	 *
	 * Modification History:
	 * Date         		    Author          	 Version            
	 *-------------------------------------------------------*
	 * Mar 7, 2012 4:41:34 PM       yanrg                 v1.0.0
	 */
	public static void main(String[] args)throws Exception {
		/*Connection conn = getWriteAblePartyConn();
		System.out.println(conn.getAutoCommit());*/
	}

}
