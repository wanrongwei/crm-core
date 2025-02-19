package com.asiainfo.crm.common.bo;

import com.ai.appframe2.bo.DataContainerFactory;
import com.ai.appframe2.common.AIException;
import com.ai.appframe2.common.DataContainerInterface;
import com.ai.appframe2.common.ServiceManager;
import com.ai.appframe2.util.criteria.Criteria;
import com.asiainfo.crm.common.ivalues.IBOBsSoOrdDepositeCfgValue;

import java.sql.Connection;
import java.sql.ResultSet;
import java.util.HashMap;
import java.util.Map;

public class BOBsSoOrdDepositeCfgEngine {

  public static BOBsSoOrdDepositeCfgBean[] getBeans(DataContainerInterface dc) throws
      Exception {
    Map ps = dc.getProperties();
    StringBuffer buffer = new StringBuffer();
    Map pList = new HashMap();
    for (java.util.Iterator cc = ps.entrySet().iterator(); cc.hasNext(); ) {
      Map.Entry e = (Map.Entry) cc.next();
      if(buffer.length() >0)
	 buffer.append(" and ");
      buffer.append(e.getKey().toString() + " = :p_" + e.getKey().toString());
      pList.put("p_" + e.getKey().toString(),e.getValue());
    }
    Connection conn = ServiceManager.getSession().getConnection();
    try {
      return getBeans(buffer.toString(), pList);
    }finally{
      if (conn != null)
	conn.close();
    }
  }

    public static BOBsSoOrdDepositeCfgBean getBean(int _ConfigId) throws Exception{
            /**new create*/
    String condition = "CONFIG_ID = :S_CONFIG_ID";
      Map map = new HashMap();
      map.put("S_CONFIG_ID",new Integer(_ConfigId));
;
      BOBsSoOrdDepositeCfgBean[] beans = getBeans(condition,map);
      if(beans!=null && beans.length==1)
	      return beans[0];
      else if(beans!=null && beans.length>1){
	//[错误]根据主键查询出现一条以上记录
	      throw new Exception("[ERROR]More datas than one queryed by PK");
      }else{
	      BOBsSoOrdDepositeCfgBean bean = new BOBsSoOrdDepositeCfgBean();
	      	      bean.setConfigId(_ConfigId);
	      	      return bean;
      }
 }

  public static  BOBsSoOrdDepositeCfgBean[] getBeans(Criteria sql) throws Exception{
   return getBeans(sql,-1,-1,false);
  }
 public static  BOBsSoOrdDepositeCfgBean[] getBeans(Criteria sql,int startNum,int endNum,boolean isShowFK) throws Exception{
    String[] cols = null;
    String condition = "";
    Map param = null;
    if(sql != null){
      cols = (String[])sql.getSelectColumns().toArray(new String[0]);
      condition = sql.toString();
      param = sql.getParameters();
    }
    return (BOBsSoOrdDepositeCfgBean[])getBeans(cols,condition,param,startNum,endNum,isShowFK);
  }




  public static  BOBsSoOrdDepositeCfgBean[] getBeans(String condition,Map parameter) throws Exception{
	return getBeans(null,condition,parameter,-1,-1,false);
  }

  public static  BOBsSoOrdDepositeCfgBean[] getBeans(String[] cols,String condition,Map parameter,
	   int startNum,int endNum,boolean isShowFK) throws Exception{
	Connection conn = null;
	try {
		conn = ServiceManager.getSession().getConnection();
		return (BOBsSoOrdDepositeCfgBean[])ServiceManager.getDataStore().retrieve(conn,BOBsSoOrdDepositeCfgBean.class,BOBsSoOrdDepositeCfgBean.getObjectTypeStatic(),cols,condition,parameter,startNum,endNum,isShowFK,false,null);
	}catch(Exception e){
		throw e;
	}finally{
	   if (conn != null)
	      conn.close();
	}
  }

   public static  BOBsSoOrdDepositeCfgBean[] getBeans(String[] cols,String condition,Map parameter,
	  int startNum,int endNum,boolean isShowFK,String[] extendBOAttrs) throws Exception{
	  Connection conn = null;
	  try {
		  conn = ServiceManager.getSession().getConnection();
		  return (BOBsSoOrdDepositeCfgBean[])ServiceManager.getDataStore().retrieve(conn,BOBsSoOrdDepositeCfgBean.class,BOBsSoOrdDepositeCfgBean.getObjectTypeStatic(),cols,condition,parameter,startNum,endNum,isShowFK,false,extendBOAttrs);
	  }catch(Exception e){
		  throw e;
	  }finally{
		if (conn != null)
		  conn.close();
	  }
   }


   public static int getBeansCount(String condition,Map parameter) throws Exception{
     Connection conn = null;
      try {
	      conn = ServiceManager.getSession().getConnection();
	      return ServiceManager.getDataStore().retrieveCount(conn,BOBsSoOrdDepositeCfgBean.getObjectTypeStatic(),condition,parameter,null);
      }catch(Exception e){
	      throw e;
      }finally{
	  if (conn != null)
	      conn.close();
      }
   }

   public static int getBeansCount(String condition,Map parameter,String[] extendBOAttrs) throws Exception{
	      Connection conn = null;
	try {
		conn = ServiceManager.getSession().getConnection();
		return ServiceManager.getDataStore().retrieveCount(conn,BOBsSoOrdDepositeCfgBean.getObjectTypeStatic(),condition,parameter,extendBOAttrs);
	}catch(Exception e){
		throw e;
	}finally{
	  if (conn != null)
	      conn.close();
	}
   }

  public static void save( BOBsSoOrdDepositeCfgBean aBean) throws Exception
  {
	  Connection conn = null;
	try {
		conn = ServiceManager.getSession().getConnection();
		   ServiceManager.getDataStore().save(conn,aBean);
	   }catch(Exception e){
		throw e;
	}finally{
	  if (conn != null)
		  conn.close();
	}
  }

   public static  void save( BOBsSoOrdDepositeCfgBean[] aBeans) throws Exception{
	     Connection conn = null;
	try {
		conn = ServiceManager.getSession().getConnection();
		ServiceManager.getDataStore().save(conn,aBeans);
	}catch(Exception e){
		throw e;
	}finally{
	  if (conn != null)
	      conn.close();
	}
   }

   public static  void saveBatch( BOBsSoOrdDepositeCfgBean[] aBeans) throws Exception{
	     Connection conn = null;
	try {
		conn = ServiceManager.getSession().getConnection();
		ServiceManager.getDataStore().saveBatch(conn,aBeans);
	}catch(Exception e){
		throw e;
	}finally{
	  if (conn != null)
	      conn.close();
	}
   }


  public static  BOBsSoOrdDepositeCfgBean[] getBeansFromQueryBO(String soureBO,Map parameter) throws Exception{
      Connection conn = null;
      ResultSet resultset = null;
      try {
	  conn = ServiceManager.getSession().getConnection();
	  String sql = ServiceManager.getObjectTypeFactory().getInstance(soureBO).getMapingEnty();
	  resultset =ServiceManager.getDataStore().retrieve(conn,sql,parameter);
	  return (BOBsSoOrdDepositeCfgBean[])ServiceManager.getDataStore().crateDtaContainerFromResultSet(BOBsSoOrdDepositeCfgBean.class,BOBsSoOrdDepositeCfgBean.getObjectTypeStatic(),resultset,null,true);
      }catch(Exception e){
	  throw e;
      }finally{
      if(resultset!=null)resultset.close();
	  if (conn != null)
	      conn.close();
      }
   }

     public static  BOBsSoOrdDepositeCfgBean[] getBeansFromSql(String sql,Map parameter) throws Exception{
      Connection conn = null;
      ResultSet resultset = null;
      try {
	  conn = ServiceManager.getSession().getConnection();
	  resultset =ServiceManager.getDataStore().retrieve(conn,sql,parameter);
	  return (BOBsSoOrdDepositeCfgBean[])ServiceManager.getDataStore().crateDtaContainerFromResultSet(BOBsSoOrdDepositeCfgBean.class,BOBsSoOrdDepositeCfgBean.getObjectTypeStatic(),resultset,null,true);
      }catch(Exception e){
	  throw e;
      }finally{
      if(resultset!=null)resultset.close();
	  if (conn != null)
	      conn.close();
      }
   }

   public static java.math.BigDecimal getNewId() throws Exception{
       return ServiceManager.getIdGenerator().getNewId(BOBsSoOrdDepositeCfgBean.getObjectTypeStatic());
   }


   public static java.sql.Timestamp getSysDate() throws Exception{
       return ServiceManager.getIdGenerator().getSysDate(BOBsSoOrdDepositeCfgBean.getObjectTypeStatic());
   }


   public static BOBsSoOrdDepositeCfgBean wrap(DataContainerInterface source,Map colMatch,boolean canModify){
     try{
       return (BOBsSoOrdDepositeCfgBean)DataContainerFactory.wrap(source,BOBsSoOrdDepositeCfgBean.class,colMatch,canModify);
     }catch(Exception e){
       if(e.getCause()!=null)
	 throw new RuntimeException(e.getCause());
       else
	 throw new RuntimeException(e);
     }
   }
   public static BOBsSoOrdDepositeCfgBean copy(DataContainerInterface source,Map colMatch,boolean canModify){
     try {
       BOBsSoOrdDepositeCfgBean result = new BOBsSoOrdDepositeCfgBean();
       DataContainerFactory.copy(source, result, colMatch);
       return result;
     }
     catch (AIException ex) {
       if(ex.getCause()!=null)
	 throw new RuntimeException(ex.getCause());
       else
	 throw new RuntimeException(ex);
     }
    }

   public static BOBsSoOrdDepositeCfgBean transfer(IBOBsSoOrdDepositeCfgValue value) {
	   if(value==null)
		   return null;
	try {
		if(value instanceof BOBsSoOrdDepositeCfgBean){
			return (BOBsSoOrdDepositeCfgBean)value;
		}
		BOBsSoOrdDepositeCfgBean newBean = new BOBsSoOrdDepositeCfgBean();

		DataContainerFactory.transfer(value ,newBean);
		return newBean;
	}catch (Exception ex) {
		if(ex.getCause()!=null)
			throw new RuntimeException(ex.getCause());
		else
			throw new RuntimeException(ex);
	}
   }

   public static BOBsSoOrdDepositeCfgBean[] transfer(IBOBsSoOrdDepositeCfgValue[] value) {
	   if(value==null || value.length==0)
		   return null;

	try {
		if(value instanceof BOBsSoOrdDepositeCfgBean[]){
			return (BOBsSoOrdDepositeCfgBean[])value;
		}
		BOBsSoOrdDepositeCfgBean[] newBeans = new BOBsSoOrdDepositeCfgBean[value.length];
		   for(int i=0;i<newBeans.length;i++){
			   newBeans[i] = new BOBsSoOrdDepositeCfgBean();
			DataContainerFactory.transfer(value[i] ,newBeans[i]);
		}
		return newBeans;
	}catch (Exception ex) {
		if(ex.getCause()!=null)
			throw new RuntimeException(ex.getCause());
		else
			throw new RuntimeException(ex);
	}
   }
  public static void save(IBOBsSoOrdDepositeCfgValue aValue) throws Exception
  {
     save(transfer(aValue));
  }

   public static  void save( IBOBsSoOrdDepositeCfgValue[] aValues) throws Exception{
	  save(transfer(aValues));
   }

   public static  void saveBatch( IBOBsSoOrdDepositeCfgValue[] aValues) throws Exception{
     saveBatch(transfer(aValues));
   }
}
