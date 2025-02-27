package com.asiainfo.crm.cm.puremobile.bo;

import java.util.Map;
import java.util.HashMap;
import java.sql.Connection;
import java.sql.ResultSet;
import com.ai.appframe2.common.AIException;
import com.ai.appframe2.common.DataContainerInterface;
import com.ai.appframe2.common.ServiceManager;
import com.ai.appframe2.util.criteria.Criteria;
import com.ai.appframe2.bo.DataContainerFactory;

import com.asiainfo.crm.cm.puremobile.ivalues.*;

public class BOCmInsOfferinstRelEngine {

  public static BOCmInsOfferinstRelBean[] getBeans(DataContainerInterface dc) throws
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

    public static BOCmInsOfferinstRelBean getBean(long _CmrelId) throws Exception{
            /**new create*/
    String condition = "CMREL_ID = :S_CMREL_ID";
      Map map = new HashMap();
      map.put("S_CMREL_ID",new Long(_CmrelId));
;
      BOCmInsOfferinstRelBean[] beans = getBeans(condition,map);
      if(beans!=null && beans.length==1)
	      return beans[0];
      else if(beans!=null && beans.length>1){
	      throw new Exception("[ERROR]More datas than one queryed by PK");
      }else{
	      BOCmInsOfferinstRelBean bean = new BOCmInsOfferinstRelBean();
	      	      bean.setCmrelId(_CmrelId);
	      	      return bean;
      }
 }

  public static  BOCmInsOfferinstRelBean[] getBeans(Criteria sql) throws Exception{
   return getBeans(sql,-1,-1,false);
  }
 public static  BOCmInsOfferinstRelBean[] getBeans(Criteria sql,int startNum,int endNum,boolean isShowFK) throws Exception{
    String[] cols = null;
    String condition = "";
    Map param = null;
    if(sql != null){
      cols = (String[])sql.getSelectColumns().toArray(new String[0]);
      condition = sql.toString();
      param = sql.getParameters();
    }
    return (BOCmInsOfferinstRelBean[])getBeans(cols,condition,param,startNum,endNum,isShowFK);
  }




  public static  BOCmInsOfferinstRelBean[] getBeans(String condition,Map parameter) throws Exception{
	return getBeans(null,condition,parameter,-1,-1,false);
  }

  public static  BOCmInsOfferinstRelBean[] getBeans(String[] cols,String condition,Map parameter,
	   int startNum,int endNum,boolean isShowFK) throws Exception{
	Connection conn = null;
	try {
		conn = ServiceManager.getSession().getConnection();
		return (BOCmInsOfferinstRelBean[])ServiceManager.getDataStore().retrieve(conn,BOCmInsOfferinstRelBean.class,BOCmInsOfferinstRelBean.getObjectTypeStatic(),cols,condition,parameter,startNum,endNum,isShowFK,false,null);
	}catch(Exception e){
		throw e;
	}finally{
	   if (conn != null)
	      conn.close();
	}
  }

   public static  BOCmInsOfferinstRelBean[] getBeans(String[] cols,String condition,Map parameter,
	  int startNum,int endNum,boolean isShowFK,String[] extendBOAttrs) throws Exception{
	  Connection conn = null;
	  try {
		  conn = ServiceManager.getSession().getConnection();
		  return (BOCmInsOfferinstRelBean[])ServiceManager.getDataStore().retrieve(conn,BOCmInsOfferinstRelBean.class,BOCmInsOfferinstRelBean.getObjectTypeStatic(),cols,condition,parameter,startNum,endNum,isShowFK,false,extendBOAttrs);
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
	      return ServiceManager.getDataStore().retrieveCount(conn,BOCmInsOfferinstRelBean.getObjectTypeStatic(),condition,parameter,null);
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
		return ServiceManager.getDataStore().retrieveCount(conn,BOCmInsOfferinstRelBean.getObjectTypeStatic(),condition,parameter,extendBOAttrs);
	}catch(Exception e){
		throw e;
	}finally{
	  if (conn != null)
	      conn.close();
	}
   }

  public static void save( BOCmInsOfferinstRelBean aBean) throws Exception
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

   public static  void save( BOCmInsOfferinstRelBean[] aBeans) throws Exception{
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

   public static  void saveBatch( BOCmInsOfferinstRelBean[] aBeans) throws Exception{
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


  public static  BOCmInsOfferinstRelBean[] getBeansFromQueryBO(String soureBO,Map parameter) throws Exception{
      Connection conn = null;
      ResultSet resultset = null;
      try {
	  conn = ServiceManager.getSession().getConnection();
	  String sql = ServiceManager.getObjectTypeFactory().getInstance(soureBO).getMapingEnty();
	  resultset =ServiceManager.getDataStore().retrieve(conn,sql,parameter);
	  return (BOCmInsOfferinstRelBean[])ServiceManager.getDataStore().crateDtaContainerFromResultSet(BOCmInsOfferinstRelBean.class,BOCmInsOfferinstRelBean.getObjectTypeStatic(),resultset,null,true);
      }catch(Exception e){
	  throw e;
      }finally{
      if(resultset!=null)resultset.close();
	  if (conn != null)
	      conn.close();
      }
   }

     public static  BOCmInsOfferinstRelBean[] getBeansFromSql(String sql,Map parameter) throws Exception{
      Connection conn = null;
      ResultSet resultset = null;
      try {
	  conn = ServiceManager.getSession().getConnection();
	  resultset =ServiceManager.getDataStore().retrieve(conn,sql,parameter);
	  return (BOCmInsOfferinstRelBean[])ServiceManager.getDataStore().crateDtaContainerFromResultSet(BOCmInsOfferinstRelBean.class,BOCmInsOfferinstRelBean.getObjectTypeStatic(),resultset,null,true);
      }catch(Exception e){
	  throw e;
      }finally{
      if(resultset!=null)resultset.close();
	  if (conn != null)
	      conn.close();
      }
   }

   public static java.math.BigDecimal getNewId() throws Exception{
       return ServiceManager.getIdGenerator().getNewId(BOCmInsOfferinstRelBean.getObjectTypeStatic());
   }


   public static java.sql.Timestamp getSysDate() throws Exception{
       return ServiceManager.getIdGenerator().getSysDate(BOCmInsOfferinstRelBean.getObjectTypeStatic());
   }


   public static BOCmInsOfferinstRelBean wrap(DataContainerInterface source,Map colMatch,boolean canModify){
     try{
       return (BOCmInsOfferinstRelBean)DataContainerFactory.wrap(source,BOCmInsOfferinstRelBean.class,colMatch,canModify);
     }catch(Exception e){
       if(e.getCause()!=null)
	 throw new RuntimeException(e.getCause());
       else
	 throw new RuntimeException(e);
     }
   }
   public static BOCmInsOfferinstRelBean copy(DataContainerInterface source,Map colMatch,boolean canModify){
     try {
       BOCmInsOfferinstRelBean result = new BOCmInsOfferinstRelBean();
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

   public static BOCmInsOfferinstRelBean transfer(IBOCmInsOfferinstRelValue value) {
	   if(value==null)
		   return null;
	try {
		if(value instanceof BOCmInsOfferinstRelBean){
			return (BOCmInsOfferinstRelBean)value;
		}
		BOCmInsOfferinstRelBean newBean = new BOCmInsOfferinstRelBean();

		DataContainerFactory.transfer(value ,newBean);
		return newBean;
	}catch (Exception ex) {
		if(ex.getCause()!=null)
			throw new RuntimeException(ex.getCause());
		else
			throw new RuntimeException(ex);
	}
   }

   public static BOCmInsOfferinstRelBean[] transfer(IBOCmInsOfferinstRelValue[] value) {
	   if(value==null || value.length==0)
		   return null;

	try {
		if(value instanceof BOCmInsOfferinstRelBean[]){
			return (BOCmInsOfferinstRelBean[])value;
		}
		BOCmInsOfferinstRelBean[] newBeans = new BOCmInsOfferinstRelBean[value.length];
		   for(int i=0;i<newBeans.length;i++){
			   newBeans[i] = new BOCmInsOfferinstRelBean();
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
  public static void save(IBOCmInsOfferinstRelValue aValue) throws Exception
  {
     save(transfer(aValue));
  }

   public static  void save( IBOCmInsOfferinstRelValue[] aValues) throws Exception{
	  save(transfer(aValues));
   }

   public static  void saveBatch( IBOCmInsOfferinstRelValue[] aValues) throws Exception{
     saveBatch(transfer(aValues));
   }
}
