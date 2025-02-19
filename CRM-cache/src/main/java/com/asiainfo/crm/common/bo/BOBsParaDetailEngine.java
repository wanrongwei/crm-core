package com.asiainfo.crm.common.bo;

import com.ai.appframe2.bo.DataContainerFactory;
import com.ai.appframe2.common.AIException;
import com.ai.appframe2.common.DataContainerInterface;
import com.ai.appframe2.common.ServiceManager;
import com.ai.appframe2.util.criteria.Criteria;
import com.asiainfo.crm.common.ivalues.IBOBsParaDetailValue;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Timestamp;
import java.util.HashMap;
import java.util.Map;

public class BOBsParaDetailEngine {

  public static BOBsParaDetailBean[] getBeans(DataContainerInterface dc) throws
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

  
  public static  BOBsParaDetailBean[] getBeans(Criteria sql) throws Exception{
   return getBeans(sql,-1,-1,false);
  }
 public static  BOBsParaDetailBean[] getBeans(Criteria sql,int startNum,int endNum,boolean isShowFK) throws Exception{
    String[] cols = null;
    String condition = "";
    Map param = null;
    if(sql != null){
      cols = (String[])sql.getSelectColumns().toArray(new String[0]);
      condition = sql.toString();
      param = sql.getParameters();
    }
    return (BOBsParaDetailBean[])getBeans(cols,condition,param,startNum,endNum,isShowFK);
  }




  public static  BOBsParaDetailBean[] getBeans(String condition,Map parameter) throws Exception{
	return getBeans(null,condition,parameter,-1,-1,false);
  }

  public static  BOBsParaDetailBean[] getBeans(String[] cols,String condition,Map parameter,
	   int startNum,int endNum,boolean isShowFK) throws Exception{
	Connection conn = null;
	try {
		conn = ServiceManager.getSession().getConnection();
		return (BOBsParaDetailBean[])ServiceManager.getDataStore().retrieve(conn,BOBsParaDetailBean.class,BOBsParaDetailBean.getObjectTypeStatic(),cols,condition,parameter,startNum,endNum,isShowFK,false,null);
	}catch(Exception e){
		throw e;
	}finally{
	   if (conn != null)
	      conn.close();
	}
  }

   public static  BOBsParaDetailBean[] getBeans(String[] cols,String condition,Map parameter,
	  int startNum,int endNum,boolean isShowFK,String[] extendBOAttrs) throws Exception{
	  Connection conn = null;
	  try {
		  conn = ServiceManager.getSession().getConnection();
		  return (BOBsParaDetailBean[])ServiceManager.getDataStore().retrieve(conn,BOBsParaDetailBean.class,BOBsParaDetailBean.getObjectTypeStatic(),cols,condition,parameter,startNum,endNum,isShowFK,false,extendBOAttrs);
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
	      return ServiceManager.getDataStore().retrieveCount(conn,BOBsParaDetailBean.getObjectTypeStatic(),condition,parameter,null);
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
		return ServiceManager.getDataStore().retrieveCount(conn,BOBsParaDetailBean.getObjectTypeStatic(),condition,parameter,extendBOAttrs);
	}catch(Exception e){
		throw e;
	}finally{
	  if (conn != null)
	      conn.close();
	}
   }

  public static void save( BOBsParaDetailBean aBean) throws Exception
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

   public static  void save( BOBsParaDetailBean[] aBeans) throws Exception{
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

   public static  void saveBatch( BOBsParaDetailBean[] aBeans) throws Exception{
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


  public static  BOBsParaDetailBean[] getBeansFromQueryBO(String soureBO,Map parameter) throws Exception{
      Connection conn = null;
      ResultSet resultset = null;
      try {
	  conn = ServiceManager.getSession().getConnection();
	  String sql = ServiceManager.getObjectTypeFactory().getInstance(soureBO).getMapingEnty();
	  resultset =ServiceManager.getDataStore().retrieve(conn,sql,parameter);
	  return (BOBsParaDetailBean[])ServiceManager.getDataStore().crateDtaContainerFromResultSet(BOBsParaDetailBean.class,BOBsParaDetailBean.getObjectTypeStatic(),resultset,null,true);
      }catch(Exception e){
	  throw e;
      }finally{
	  /**add result close*/
	  if(resultset!=null) resultset.close();
	  if (conn != null)
	      conn.close();
      }
   }

     public static  BOBsParaDetailBean[] getBeansFromSql(String sql,Map parameter) throws Exception{
      Connection conn = null;
      ResultSet resultset = null;
      try {
	  conn = ServiceManager.getSession().getConnection();
	  resultset =ServiceManager.getDataStore().retrieve(conn,sql,parameter);
	  return (BOBsParaDetailBean[])ServiceManager.getDataStore().crateDtaContainerFromResultSet(BOBsParaDetailBean.class,BOBsParaDetailBean.getObjectTypeStatic(),resultset,null,true);
      }catch(Exception e){
	  throw e;
      }finally{
	  /**add result close*/
	  if(resultset!=null) resultset.close();
	  if (conn != null)
	      conn.close();
      }
   }

   public static java.math.BigDecimal getNewId() throws Exception{
       return ServiceManager.getIdGenerator().getNewId(BOBsParaDetailBean.getObjectTypeStatic());
   }


   public static Timestamp getSysDate() throws Exception{
       return ServiceManager.getIdGenerator().getSysDate(BOBsParaDetailBean.getObjectTypeStatic());
   }


   public static BOBsParaDetailBean wrap(DataContainerInterface source,Map colMatch,boolean canModify){
     try{
       return (BOBsParaDetailBean)DataContainerFactory.wrap(source,BOBsParaDetailBean.class,colMatch,canModify);
     }catch(Exception e){
       if(e.getCause()!=null)
	 throw new RuntimeException(e.getCause());
       else
	 throw new RuntimeException(e);
     }
   }
   public static BOBsParaDetailBean copy(DataContainerInterface source,Map colMatch,boolean canModify){
     try {
       BOBsParaDetailBean result = new BOBsParaDetailBean();
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

   public static BOBsParaDetailBean transfer(IBOBsParaDetailValue value) {
	   if(value==null)
		   return null;
	try {
		if(value instanceof BOBsParaDetailBean){
			return (BOBsParaDetailBean)value;
		}
		BOBsParaDetailBean newBean = new BOBsParaDetailBean();

		DataContainerFactory.transfer(value ,newBean);
		return newBean;
	}catch (Exception ex) {
		if(ex.getCause()!=null)
			throw new RuntimeException(ex.getCause());
		else
			throw new RuntimeException(ex);
	}
   }

   public static BOBsParaDetailBean[] transfer(IBOBsParaDetailValue[] value) {
	   if(value==null || value.length==0)
		   return null;

	try {
		if(value instanceof BOBsParaDetailBean[]){
			return (BOBsParaDetailBean[])value;
		}
		BOBsParaDetailBean[] newBeans = new BOBsParaDetailBean[value.length];
		   for(int i=0;i<newBeans.length;i++){
			   newBeans[i] = new BOBsParaDetailBean();
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
  public static void save(IBOBsParaDetailValue aValue) throws Exception
  {
     save(transfer(aValue));
  }

   public static  void save( IBOBsParaDetailValue[] aValues) throws Exception{
	  save(transfer(aValues));
   }

   public static  void saveBatch( IBOBsParaDetailValue[] aValues) throws Exception{
     saveBatch(transfer(aValues));
   }
}
