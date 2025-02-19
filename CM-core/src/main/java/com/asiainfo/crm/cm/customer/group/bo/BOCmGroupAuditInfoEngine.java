package com.asiainfo.crm.cm.customer.group.bo;

import java.util.Map;
import java.util.HashMap;
import java.sql.Connection;
import java.sql.ResultSet;
import com.ai.appframe2.common.AIException;
import com.ai.appframe2.common.DataContainerInterface;
import com.ai.appframe2.common.ServiceManager;
import com.ai.appframe2.util.criteria.Criteria;
import com.ai.appframe2.bo.DataContainerFactory;

import com.asiainfo.crm.cm.customer.group.ivalues.*;

public class BOCmGroupAuditInfoEngine {

  public static BOCmGroupAuditInfoBean[] getBeans(DataContainerInterface dc) throws
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

    public static BOCmGroupAuditInfoBean getBean(long _AuditId) throws Exception{
            /**new create*/
    String condition = "AUDIT_ID = :S_AUDIT_ID";
      Map map = new HashMap();
      map.put("S_AUDIT_ID",new Long(_AuditId));
;
      BOCmGroupAuditInfoBean[] beans = getBeans(condition,map);
      if(beans!=null && beans.length==1)
	      return beans[0];
      else if(beans!=null && beans.length>1){
	//[错误]根据主键查询出现一条以上记录
	      throw new Exception("[ERROR]More datas than one queryed by PK");
      }else{
	      BOCmGroupAuditInfoBean bean = new BOCmGroupAuditInfoBean();
	      	      bean.setAuditId(_AuditId);
	      	      return bean;
      }
 }

  public static  BOCmGroupAuditInfoBean[] getBeans(Criteria sql) throws Exception{
   return getBeans(sql,-1,-1,false);
  }
 public static  BOCmGroupAuditInfoBean[] getBeans(Criteria sql,int startNum,int endNum,boolean isShowFK) throws Exception{
    String[] cols = null;
    String condition = "";
    Map param = null;
    if(sql != null){
      cols = (String[])sql.getSelectColumns().toArray(new String[0]);
      condition = sql.toString();
      param = sql.getParameters();
    }
    return (BOCmGroupAuditInfoBean[])getBeans(cols,condition,param,startNum,endNum,isShowFK);
  }




  public static  BOCmGroupAuditInfoBean[] getBeans(String condition,Map parameter) throws Exception{
	return getBeans(null,condition,parameter,-1,-1,false);
  }

  public static  BOCmGroupAuditInfoBean[] getBeans(String[] cols,String condition,Map parameter,
	   int startNum,int endNum,boolean isShowFK) throws Exception{
	Connection conn = null;
	try {
		conn = ServiceManager.getSession().getConnection();
		return (BOCmGroupAuditInfoBean[])ServiceManager.getDataStore().retrieve(conn,BOCmGroupAuditInfoBean.class,BOCmGroupAuditInfoBean.getObjectTypeStatic(),cols,condition,parameter,startNum,endNum,isShowFK,false,null);
	}catch(Exception e){
		throw e;
	}finally{
	   if (conn != null)
	      conn.close();
	}
  }

   public static  BOCmGroupAuditInfoBean[] getBeans(String[] cols,String condition,Map parameter,
	  int startNum,int endNum,boolean isShowFK,String[] extendBOAttrs) throws Exception{
	  Connection conn = null;
	  try {
		  conn = ServiceManager.getSession().getConnection();
		  return (BOCmGroupAuditInfoBean[])ServiceManager.getDataStore().retrieve(conn,BOCmGroupAuditInfoBean.class,BOCmGroupAuditInfoBean.getObjectTypeStatic(),cols,condition,parameter,startNum,endNum,isShowFK,false,extendBOAttrs);
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
	      return ServiceManager.getDataStore().retrieveCount(conn,BOCmGroupAuditInfoBean.getObjectTypeStatic(),condition,parameter,null);
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
		return ServiceManager.getDataStore().retrieveCount(conn,BOCmGroupAuditInfoBean.getObjectTypeStatic(),condition,parameter,extendBOAttrs);
	}catch(Exception e){
		throw e;
	}finally{
	  if (conn != null)
	      conn.close();
	}
   }

  public static void save( BOCmGroupAuditInfoBean aBean) throws Exception
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

   public static  void save( BOCmGroupAuditInfoBean[] aBeans) throws Exception{
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

   public static  void saveBatch( BOCmGroupAuditInfoBean[] aBeans) throws Exception{
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


  public static  BOCmGroupAuditInfoBean[] getBeansFromQueryBO(String soureBO,Map parameter) throws Exception{
      Connection conn = null;
      ResultSet resultset = null;
      try {
	  conn = ServiceManager.getSession().getConnection();
	  String sql = ServiceManager.getObjectTypeFactory().getInstance(soureBO).getMapingEnty();
	  resultset =ServiceManager.getDataStore().retrieve(conn,sql,parameter);
	  return (BOCmGroupAuditInfoBean[])ServiceManager.getDataStore().crateDtaContainerFromResultSet(BOCmGroupAuditInfoBean.class,BOCmGroupAuditInfoBean.getObjectTypeStatic(),resultset,null,true);
      }catch(Exception e){
	  throw e;
      }finally{
      if(resultset!=null)resultset.close();
	  if (conn != null)
	      conn.close();
      }
   }

     public static  BOCmGroupAuditInfoBean[] getBeansFromSql(String sql,Map parameter) throws Exception{
      Connection conn = null;
      ResultSet resultset = null;
      try {
	  conn = ServiceManager.getSession().getConnection();
	  resultset =ServiceManager.getDataStore().retrieve(conn,sql,parameter);
	  return (BOCmGroupAuditInfoBean[])ServiceManager.getDataStore().crateDtaContainerFromResultSet(BOCmGroupAuditInfoBean.class,BOCmGroupAuditInfoBean.getObjectTypeStatic(),resultset,null,true);
      }catch(Exception e){
	  throw e;
      }finally{
      if(resultset!=null)resultset.close();
	  if (conn != null)
	      conn.close();
      }
   }

   public static java.math.BigDecimal getNewId() throws Exception{
       return ServiceManager.getIdGenerator().getNewId(BOCmGroupAuditInfoBean.getObjectTypeStatic());
   }


   public static java.sql.Timestamp getSysDate() throws Exception{
       return ServiceManager.getIdGenerator().getSysDate(BOCmGroupAuditInfoBean.getObjectTypeStatic());
   }


   public static BOCmGroupAuditInfoBean wrap(DataContainerInterface source,Map colMatch,boolean canModify){
     try{
       return (BOCmGroupAuditInfoBean)DataContainerFactory.wrap(source,BOCmGroupAuditInfoBean.class,colMatch,canModify);
     }catch(Exception e){
       if(e.getCause()!=null)
	 throw new RuntimeException(e.getCause());
       else
	 throw new RuntimeException(e);
     }
   }
   public static BOCmGroupAuditInfoBean copy(DataContainerInterface source,Map colMatch,boolean canModify){
     try {
       BOCmGroupAuditInfoBean result = new BOCmGroupAuditInfoBean();
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

   public static BOCmGroupAuditInfoBean transfer(IBOCmGroupAuditInfoValue value) {
	   if(value==null)
		   return null;
	try {
		if(value instanceof BOCmGroupAuditInfoBean){
			return (BOCmGroupAuditInfoBean)value;
		}
		BOCmGroupAuditInfoBean newBean = new BOCmGroupAuditInfoBean();

		DataContainerFactory.transfer(value ,newBean);
		return newBean;
	}catch (Exception ex) {
		if(ex.getCause()!=null)
			throw new RuntimeException(ex.getCause());
		else
			throw new RuntimeException(ex);
	}
   }

   public static BOCmGroupAuditInfoBean[] transfer(IBOCmGroupAuditInfoValue[] value) {
	   if(value==null || value.length==0)
		   return null;

	try {
		if(value instanceof BOCmGroupAuditInfoBean[]){
			return (BOCmGroupAuditInfoBean[])value;
		}
		BOCmGroupAuditInfoBean[] newBeans = new BOCmGroupAuditInfoBean[value.length];
		   for(int i=0;i<newBeans.length;i++){
			   newBeans[i] = new BOCmGroupAuditInfoBean();
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
  public static void save(IBOCmGroupAuditInfoValue aValue) throws Exception
  {
     save(transfer(aValue));
  }

   public static  void save( IBOCmGroupAuditInfoValue[] aValues) throws Exception{
	  save(transfer(aValues));
   }

   public static  void saveBatch( IBOCmGroupAuditInfoValue[] aValues) throws Exception{
     saveBatch(transfer(aValues));
   }
}
