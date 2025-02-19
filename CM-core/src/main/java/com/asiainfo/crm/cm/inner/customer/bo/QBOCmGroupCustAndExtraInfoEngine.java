package com.asiainfo.crm.cm.inner.customer.bo;

import java.sql.Connection;
import java.sql.ResultSet;
import java.util.HashMap;
import java.util.Map;

import com.ai.appframe2.bo.DataContainerFactory;
import com.ai.appframe2.common.AIException;
import com.ai.appframe2.common.DataContainerInterface;
import com.ai.appframe2.common.ServiceManager;
import com.ai.appframe2.util.criteria.Criteria;
import com.asiainfo.crm.cm.inner.customer.ivalues.IQBOCmGroupCustAndExtraInfoValue;

public class QBOCmGroupCustAndExtraInfoEngine {

  public static QBOCmGroupCustAndExtraInfoBean[] getBeans(DataContainerInterface dc) throws
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

  
  public static  QBOCmGroupCustAndExtraInfoBean[] getBeans(Criteria sql) throws Exception{
   return getBeans(sql,-1,-1,false);
  }
 public static  QBOCmGroupCustAndExtraInfoBean[] getBeans(Criteria sql,int startNum,int endNum,boolean isShowFK) throws Exception{
    String[] cols = null;
    String condition = "";
    Map param = null;
    if(sql != null){
      cols = (String[])sql.getSelectColumns().toArray(new String[0]);
      condition = sql.toString();
      param = sql.getParameters();
    }
    return (QBOCmGroupCustAndExtraInfoBean[])getBeans(cols,condition,param,startNum,endNum,isShowFK);
  }




  public static  QBOCmGroupCustAndExtraInfoBean[] getBeans(String condition,Map parameter) throws Exception{
	return getBeans(null,condition,parameter,-1,-1,false);
  }

  public static  QBOCmGroupCustAndExtraInfoBean[] getBeans(String[] cols,String condition,Map parameter,
	   int startNum,int endNum,boolean isShowFK) throws Exception{
	Connection conn = null;
	try {
		conn = ServiceManager.getSession().getConnection();
		return (QBOCmGroupCustAndExtraInfoBean[])ServiceManager.getDataStore().retrieve(conn,QBOCmGroupCustAndExtraInfoBean.class,QBOCmGroupCustAndExtraInfoBean.getObjectTypeStatic(),cols,condition,parameter,startNum,endNum,isShowFK,false,null);
	}catch(Exception e){
		throw e;
	}finally{
	   if (conn != null)
	      conn.close();
	}
  }

   public static  QBOCmGroupCustAndExtraInfoBean[] getBeans(String[] cols,String condition,Map parameter,
	  int startNum,int endNum,boolean isShowFK,String[] extendBOAttrs) throws Exception{
	  Connection conn = null;
	  try {
		  conn = ServiceManager.getSession().getConnection();
		  return (QBOCmGroupCustAndExtraInfoBean[])ServiceManager.getDataStore().retrieve(conn,QBOCmGroupCustAndExtraInfoBean.class,QBOCmGroupCustAndExtraInfoBean.getObjectTypeStatic(),cols,condition,parameter,startNum,endNum,isShowFK,false,extendBOAttrs);
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
	      return ServiceManager.getDataStore().retrieveCount(conn,QBOCmGroupCustAndExtraInfoBean.getObjectTypeStatic(),condition,parameter,null);
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
		return ServiceManager.getDataStore().retrieveCount(conn,QBOCmGroupCustAndExtraInfoBean.getObjectTypeStatic(),condition,parameter,extendBOAttrs);
	}catch(Exception e){
		throw e;
	}finally{
	  if (conn != null)
	      conn.close();
	}
   }

  public static void save( QBOCmGroupCustAndExtraInfoBean aBean) throws Exception
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

   public static  void save( QBOCmGroupCustAndExtraInfoBean[] aBeans) throws Exception{
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

   public static  void saveBatch( QBOCmGroupCustAndExtraInfoBean[] aBeans) throws Exception{
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


  public static  QBOCmGroupCustAndExtraInfoBean[] getBeansFromQueryBO(String soureBO,Map parameter) throws Exception{
      Connection conn = null;
      ResultSet resultset = null;
      try {
	  conn = ServiceManager.getSession().getConnection();
	  String sql = ServiceManager.getObjectTypeFactory().getInstance(soureBO).getMapingEnty();
	  resultset =ServiceManager.getDataStore().retrieve(conn,sql,parameter);
	  return (QBOCmGroupCustAndExtraInfoBean[])ServiceManager.getDataStore().crateDtaContainerFromResultSet(QBOCmGroupCustAndExtraInfoBean.class,QBOCmGroupCustAndExtraInfoBean.getObjectTypeStatic(),resultset,null,true);
      }catch(Exception e){
	  throw e;
      }finally{
      if(resultset!=null)resultset.close();
	  if (conn != null)
	      conn.close();
      }
   }

     public static  QBOCmGroupCustAndExtraInfoBean[] getBeansFromSql(String sql,Map parameter) throws Exception{
      Connection conn = null;
      ResultSet resultset = null;
      try {
	  conn = ServiceManager.getSession().getConnection();
	  resultset =ServiceManager.getDataStore().retrieve(conn,sql,parameter);
	  return (QBOCmGroupCustAndExtraInfoBean[])ServiceManager.getDataStore().crateDtaContainerFromResultSet(QBOCmGroupCustAndExtraInfoBean.class,QBOCmGroupCustAndExtraInfoBean.getObjectTypeStatic(),resultset,null,true);
      }catch(Exception e){
	  throw e;
      }finally{
      if(resultset!=null)resultset.close();
	  if (conn != null)
	      conn.close();
      }
   }

   public static java.math.BigDecimal getNewId() throws Exception{
       return ServiceManager.getIdGenerator().getNewId(QBOCmGroupCustAndExtraInfoBean.getObjectTypeStatic());
   }


   public static java.sql.Timestamp getSysDate() throws Exception{
       return ServiceManager.getIdGenerator().getSysDate(QBOCmGroupCustAndExtraInfoBean.getObjectTypeStatic());
   }


   public static QBOCmGroupCustAndExtraInfoBean wrap(DataContainerInterface source,Map colMatch,boolean canModify){
     try{
       return (QBOCmGroupCustAndExtraInfoBean)DataContainerFactory.wrap(source,QBOCmGroupCustAndExtraInfoBean.class,colMatch,canModify);
     }catch(Exception e){
       if(e.getCause()!=null)
	 throw new RuntimeException(e.getCause());
       else
	 throw new RuntimeException(e);
     }
   }
   public static QBOCmGroupCustAndExtraInfoBean copy(DataContainerInterface source,Map colMatch,boolean canModify){
     try {
       QBOCmGroupCustAndExtraInfoBean result = new QBOCmGroupCustAndExtraInfoBean();
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

   public static QBOCmGroupCustAndExtraInfoBean transfer(IQBOCmGroupCustAndExtraInfoValue value) {
	   if(value==null)
		   return null;
	try {
		if(value instanceof QBOCmGroupCustAndExtraInfoBean){
			return (QBOCmGroupCustAndExtraInfoBean)value;
		}
		QBOCmGroupCustAndExtraInfoBean newBean = new QBOCmGroupCustAndExtraInfoBean();

		DataContainerFactory.transfer(value ,newBean);
		return newBean;
	}catch (Exception ex) {
		if(ex.getCause()!=null)
			throw new RuntimeException(ex.getCause());
		else
			throw new RuntimeException(ex);
	}
   }

   public static QBOCmGroupCustAndExtraInfoBean[] transfer(IQBOCmGroupCustAndExtraInfoValue[] value) {
	   if(value==null || value.length==0)
		   return null;

	try {
		if(value instanceof QBOCmGroupCustAndExtraInfoBean[]){
			return (QBOCmGroupCustAndExtraInfoBean[])value;
		}
		QBOCmGroupCustAndExtraInfoBean[] newBeans = new QBOCmGroupCustAndExtraInfoBean[value.length];
		   for(int i=0;i<newBeans.length;i++){
			   newBeans[i] = new QBOCmGroupCustAndExtraInfoBean();
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
  public static void save(IQBOCmGroupCustAndExtraInfoValue aValue) throws Exception
  {
     save(transfer(aValue));
  }

   public static  void save( IQBOCmGroupCustAndExtraInfoValue[] aValues) throws Exception{
	  save(transfer(aValues));
   }

   public static  void saveBatch( IQBOCmGroupCustAndExtraInfoValue[] aValues) throws Exception{
     saveBatch(transfer(aValues));
   }
}
