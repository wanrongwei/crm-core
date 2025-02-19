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

public class BoCmCustSegmentEngine {

  public static BoCmCustSegmentBean[] getBeans(DataContainerInterface dc) throws
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

    public static BoCmCustSegmentBean getBean(long _SegmentId) throws Exception{
            /**new create*/
    String condition = "SEGMENT_ID = :S_SEGMENT_ID";
      Map map = new HashMap();
      map.put("S_SEGMENT_ID",new Long(_SegmentId));
;
      BoCmCustSegmentBean[] beans = getBeans(condition,map);
      if(beans!=null && beans.length==1)
	      return beans[0];
      else if(beans!=null && beans.length>1){
	      throw new Exception("[ERROR]More datas than one queryed by PK");
      }else{
	      BoCmCustSegmentBean bean = new BoCmCustSegmentBean();
	      	      bean.setSegmentId(_SegmentId);
	      	      return bean;
      }
 }

  public static  BoCmCustSegmentBean[] getBeans(Criteria sql) throws Exception{
   return getBeans(sql,-1,-1,false);
  }
 public static  BoCmCustSegmentBean[] getBeans(Criteria sql,int startNum,int endNum,boolean isShowFK) throws Exception{
    String[] cols = null;
    String condition = "";
    Map param = null;
    if(sql != null){
      cols = (String[])sql.getSelectColumns().toArray(new String[0]);
      condition = sql.toString();
      param = sql.getParameters();
    }
    return (BoCmCustSegmentBean[])getBeans(cols,condition,param,startNum,endNum,isShowFK);
  }




  public static  BoCmCustSegmentBean[] getBeans(String condition,Map parameter) throws Exception{
	return getBeans(null,condition,parameter,-1,-1,false);
  }

  public static  BoCmCustSegmentBean[] getBeans(String[] cols,String condition,Map parameter,
	   int startNum,int endNum,boolean isShowFK) throws Exception{
	Connection conn = null;
	try {
		conn = ServiceManager.getSession().getConnection();
		return (BoCmCustSegmentBean[])ServiceManager.getDataStore().retrieve(conn,BoCmCustSegmentBean.class,BoCmCustSegmentBean.getObjectTypeStatic(),cols,condition,parameter,startNum,endNum,isShowFK,false,null);
	}catch(Exception e){
		throw e;
	}finally{
	   if (conn != null)
	      conn.close();
	}
  }

   public static  BoCmCustSegmentBean[] getBeans(String[] cols,String condition,Map parameter,
	  int startNum,int endNum,boolean isShowFK,String[] extendBOAttrs) throws Exception{
	  Connection conn = null;
	  try {
		  conn = ServiceManager.getSession().getConnection();
		  return (BoCmCustSegmentBean[])ServiceManager.getDataStore().retrieve(conn,BoCmCustSegmentBean.class,BoCmCustSegmentBean.getObjectTypeStatic(),cols,condition,parameter,startNum,endNum,isShowFK,false,extendBOAttrs);
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
	      return ServiceManager.getDataStore().retrieveCount(conn,BoCmCustSegmentBean.getObjectTypeStatic(),condition,parameter,null);
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
		return ServiceManager.getDataStore().retrieveCount(conn,BoCmCustSegmentBean.getObjectTypeStatic(),condition,parameter,extendBOAttrs);
	}catch(Exception e){
		throw e;
	}finally{
	  if (conn != null)
	      conn.close();
	}
   }

  public static void save( BoCmCustSegmentBean aBean) throws Exception
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

   public static  void save( BoCmCustSegmentBean[] aBeans) throws Exception{
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

   public static  void saveBatch( BoCmCustSegmentBean[] aBeans) throws Exception{
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


  public static  BoCmCustSegmentBean[] getBeansFromQueryBO(String soureBO,Map parameter) throws Exception{
      Connection conn = null;
      ResultSet resultset = null;
      try {
	  conn = ServiceManager.getSession().getConnection();
	  String sql = ServiceManager.getObjectTypeFactory().getInstance(soureBO).getMapingEnty();
	  resultset =ServiceManager.getDataStore().retrieve(conn,sql,parameter);
	  return (BoCmCustSegmentBean[])ServiceManager.getDataStore().crateDtaContainerFromResultSet(BoCmCustSegmentBean.class,BoCmCustSegmentBean.getObjectTypeStatic(),resultset,null,true);
      }catch(Exception e){
	  throw e;
      }finally{
      if(resultset!=null)resultset.close();
	  if (conn != null)
	      conn.close();
      }
   }

     public static  BoCmCustSegmentBean[] getBeansFromSql(String sql,Map parameter) throws Exception{
      Connection conn = null;
      ResultSet resultset = null;
      try {
	  conn = ServiceManager.getSession().getConnection();
	  resultset =ServiceManager.getDataStore().retrieve(conn,sql,parameter);
	  return (BoCmCustSegmentBean[])ServiceManager.getDataStore().crateDtaContainerFromResultSet(BoCmCustSegmentBean.class,BoCmCustSegmentBean.getObjectTypeStatic(),resultset,null,true);
      }catch(Exception e){
	  throw e;
      }finally{
      if(resultset!=null)resultset.close();
	  if (conn != null)
	      conn.close();
      }
   }

   public static java.math.BigDecimal getNewId() throws Exception{
       return ServiceManager.getIdGenerator().getNewId(BoCmCustSegmentBean.getObjectTypeStatic());
   }


   public static java.sql.Timestamp getSysDate() throws Exception{
       return ServiceManager.getIdGenerator().getSysDate(BoCmCustSegmentBean.getObjectTypeStatic());
   }


   public static BoCmCustSegmentBean wrap(DataContainerInterface source,Map colMatch,boolean canModify){
     try{
       return (BoCmCustSegmentBean)DataContainerFactory.wrap(source,BoCmCustSegmentBean.class,colMatch,canModify);
     }catch(Exception e){
       if(e.getCause()!=null)
	 throw new RuntimeException(e.getCause());
       else
	 throw new RuntimeException(e);
     }
   }
   public static BoCmCustSegmentBean copy(DataContainerInterface source,Map colMatch,boolean canModify){
     try {
       BoCmCustSegmentBean result = new BoCmCustSegmentBean();
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

   public static BoCmCustSegmentBean transfer(IBoCmCustSegmentValue value) {
	   if(value==null)
		   return null;
	try {
		if(value instanceof BoCmCustSegmentBean){
			return (BoCmCustSegmentBean)value;
		}
		BoCmCustSegmentBean newBean = new BoCmCustSegmentBean();

		DataContainerFactory.transfer(value ,newBean);
		return newBean;
	}catch (Exception ex) {
		if(ex.getCause()!=null)
			throw new RuntimeException(ex.getCause());
		else
			throw new RuntimeException(ex);
	}
   }

   public static BoCmCustSegmentBean[] transfer(IBoCmCustSegmentValue[] value) {
	   if(value==null || value.length==0)
		   return null;

	try {
		if(value instanceof BoCmCustSegmentBean[]){
			return (BoCmCustSegmentBean[])value;
		}
		BoCmCustSegmentBean[] newBeans = new BoCmCustSegmentBean[value.length];
		   for(int i=0;i<newBeans.length;i++){
			   newBeans[i] = new BoCmCustSegmentBean();
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
  public static void save(IBoCmCustSegmentValue aValue) throws Exception
  {
     save(transfer(aValue));
  }

   public static  void save( IBoCmCustSegmentValue[] aValues) throws Exception{
	  save(transfer(aValues));
   }

   public static  void saveBatch( IBoCmCustSegmentValue[] aValues) throws Exception{
     saveBatch(transfer(aValues));
   }
}
