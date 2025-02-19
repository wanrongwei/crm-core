package com.asiainfo.crm.cm.dk.bo;

import java.util.Map;
import java.util.HashMap;
import java.sql.Connection;
import java.sql.ResultSet;
import com.ai.appframe2.common.AIException;
import com.ai.appframe2.common.DataContainerInterface;
import com.ai.appframe2.common.ServiceManager;
import com.ai.appframe2.util.criteria.Criteria;
import com.ai.appframe2.bo.DataContainerFactory;

import com.asiainfo.crm.cm.dk.ivalues.*;

public class BOCmPsOptinSyncC3Engine {

  public static BOCmPsOptinSyncC3Bean[] getBeans(DataContainerInterface dc) throws
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

    public static BOCmPsOptinSyncC3Bean getBean(long _RecordId) throws Exception{
            /**new create*/
    String condition = "record_id = :S_record_id";
      Map map = new HashMap();
      map.put("S_record_id",new Long(_RecordId));
;
      BOCmPsOptinSyncC3Bean[] beans = getBeans(condition,map);
      if(beans!=null && beans.length==1)
	      return beans[0];
      else if(beans!=null && beans.length>1){
	      throw new Exception("[ERROR]More datas than one queryed by PK");
      }else{
	      BOCmPsOptinSyncC3Bean bean = new BOCmPsOptinSyncC3Bean();
	      	      bean.setRecordId(_RecordId);
	      	      return bean;
      }
 }

  public static  BOCmPsOptinSyncC3Bean[] getBeans(Criteria sql) throws Exception{
   return getBeans(sql,-1,-1,false);
  }
 public static  BOCmPsOptinSyncC3Bean[] getBeans(Criteria sql,int startNum,int endNum,boolean isShowFK) throws Exception{
    String[] cols = null;
    String condition = "";
    Map param = null;
    if(sql != null){
      cols = (String[])sql.getSelectColumns().toArray(new String[0]);
      condition = sql.toString();
      param = sql.getParameters();
    }
    return (BOCmPsOptinSyncC3Bean[])getBeans(cols,condition,param,startNum,endNum,isShowFK);
  }




  public static  BOCmPsOptinSyncC3Bean[] getBeans(String condition,Map parameter) throws Exception{
	return getBeans(null,condition,parameter,-1,-1,false);
  }

  public static  BOCmPsOptinSyncC3Bean[] getBeans(String[] cols,String condition,Map parameter,
	   int startNum,int endNum,boolean isShowFK) throws Exception{
	Connection conn = null;
	try {
		conn = ServiceManager.getSession().getConnection();
		return (BOCmPsOptinSyncC3Bean[])ServiceManager.getDataStore().retrieve(conn,BOCmPsOptinSyncC3Bean.class,BOCmPsOptinSyncC3Bean.getObjectTypeStatic(),cols,condition,parameter,startNum,endNum,isShowFK,false,null);
	}catch(Exception e){
		throw e;
	}finally{
	   if (conn != null)
	      conn.close();
	}
  }

   public static  BOCmPsOptinSyncC3Bean[] getBeans(String[] cols,String condition,Map parameter,
	  int startNum,int endNum,boolean isShowFK,String[] extendBOAttrs) throws Exception{
	  Connection conn = null;
	  try {
		  conn = ServiceManager.getSession().getConnection();
		  return (BOCmPsOptinSyncC3Bean[])ServiceManager.getDataStore().retrieve(conn,BOCmPsOptinSyncC3Bean.class,BOCmPsOptinSyncC3Bean.getObjectTypeStatic(),cols,condition,parameter,startNum,endNum,isShowFK,false,extendBOAttrs);
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
	      return ServiceManager.getDataStore().retrieveCount(conn,BOCmPsOptinSyncC3Bean.getObjectTypeStatic(),condition,parameter,null);
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
		return ServiceManager.getDataStore().retrieveCount(conn,BOCmPsOptinSyncC3Bean.getObjectTypeStatic(),condition,parameter,extendBOAttrs);
	}catch(Exception e){
		throw e;
	}finally{
	  if (conn != null)
	      conn.close();
	}
   }

  public static void save( BOCmPsOptinSyncC3Bean aBean) throws Exception
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

   public static  void save( BOCmPsOptinSyncC3Bean[] aBeans) throws Exception{
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

   public static  void saveBatch( BOCmPsOptinSyncC3Bean[] aBeans) throws Exception{
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


  public static  BOCmPsOptinSyncC3Bean[] getBeansFromQueryBO(String soureBO,Map parameter) throws Exception{
      Connection conn = null;
      ResultSet resultset = null;
      try {
	  conn = ServiceManager.getSession().getConnection();
	  String sql = ServiceManager.getObjectTypeFactory().getInstance(soureBO).getMapingEnty();
	  resultset =ServiceManager.getDataStore().retrieve(conn,sql,parameter);
	  return (BOCmPsOptinSyncC3Bean[])ServiceManager.getDataStore().crateDtaContainerFromResultSet(BOCmPsOptinSyncC3Bean.class,BOCmPsOptinSyncC3Bean.getObjectTypeStatic(),resultset,null,true);
      }catch(Exception e){
	  throw e;
      }finally{
      if(resultset!=null)resultset.close();
	  if (conn != null)
	      conn.close();
      }
   }

     public static  BOCmPsOptinSyncC3Bean[] getBeansFromSql(String sql,Map parameter) throws Exception{
      Connection conn = null;
      ResultSet resultset = null;
      try {
	  conn = ServiceManager.getSession().getConnection();
	  resultset =ServiceManager.getDataStore().retrieve(conn,sql,parameter);
	  return (BOCmPsOptinSyncC3Bean[])ServiceManager.getDataStore().crateDtaContainerFromResultSet(BOCmPsOptinSyncC3Bean.class,BOCmPsOptinSyncC3Bean.getObjectTypeStatic(),resultset,null,true);
      }catch(Exception e){
	  throw e;
      }finally{
      if(resultset!=null)resultset.close();
	  if (conn != null)
	      conn.close();
      }
   }

   public static java.math.BigDecimal getNewId() throws Exception{
       return ServiceManager.getIdGenerator().getNewId(BOCmPsOptinSyncC3Bean.getObjectTypeStatic());
   }


   public static java.sql.Timestamp getSysDate() throws Exception{
       return ServiceManager.getIdGenerator().getSysDate(BOCmPsOptinSyncC3Bean.getObjectTypeStatic());
   }


   public static BOCmPsOptinSyncC3Bean wrap(DataContainerInterface source,Map colMatch,boolean canModify){
     try{
       return (BOCmPsOptinSyncC3Bean)DataContainerFactory.wrap(source,BOCmPsOptinSyncC3Bean.class,colMatch,canModify);
     }catch(Exception e){
       if(e.getCause()!=null)
	 throw new RuntimeException(e.getCause());
       else
	 throw new RuntimeException(e);
     }
   }
   public static BOCmPsOptinSyncC3Bean copy(DataContainerInterface source,Map colMatch,boolean canModify){
     try {
       BOCmPsOptinSyncC3Bean result = new BOCmPsOptinSyncC3Bean();
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

   public static BOCmPsOptinSyncC3Bean transfer(IBOCmPsOptinSyncC3Value value) {
	   if(value==null)
		   return null;
	try {
		if(value instanceof BOCmPsOptinSyncC3Bean){
			return (BOCmPsOptinSyncC3Bean)value;
		}
		BOCmPsOptinSyncC3Bean newBean = new BOCmPsOptinSyncC3Bean();

		DataContainerFactory.transfer(value ,newBean);
		return newBean;
	}catch (Exception ex) {
		if(ex.getCause()!=null)
			throw new RuntimeException(ex.getCause());
		else
			throw new RuntimeException(ex);
	}
   }

   public static BOCmPsOptinSyncC3Bean[] transfer(IBOCmPsOptinSyncC3Value[] value) {
	   if(value==null || value.length==0)
		   return null;

	try {
		if(value instanceof BOCmPsOptinSyncC3Bean[]){
			return (BOCmPsOptinSyncC3Bean[])value;
		}
		BOCmPsOptinSyncC3Bean[] newBeans = new BOCmPsOptinSyncC3Bean[value.length];
		   for(int i=0;i<newBeans.length;i++){
			   newBeans[i] = new BOCmPsOptinSyncC3Bean();
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
  public static void save(IBOCmPsOptinSyncC3Value aValue) throws Exception
  {
     save(transfer(aValue));
  }

   public static  void save( IBOCmPsOptinSyncC3Value[] aValues) throws Exception{
	  save(transfer(aValues));
   }

   public static  void saveBatch( IBOCmPsOptinSyncC3Value[] aValues) throws Exception{
     saveBatch(transfer(aValues));
   }
}
