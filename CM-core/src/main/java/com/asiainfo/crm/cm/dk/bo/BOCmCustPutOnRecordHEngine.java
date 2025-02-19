package com.asiainfo.crm.cm.dk.bo;


import java.sql.Connection;
import java.sql.ResultSet;
import java.util.HashMap;
import java.util.Map;

import com.ai.appframe2.bo.DataContainerFactory;
import com.ai.appframe2.common.AIException;
import com.ai.appframe2.common.DataContainerInterface;
import com.ai.appframe2.common.ServiceManager;
import com.ai.appframe2.util.criteria.Criteria;
import com.asiainfo.crm.cm.dk.ivalues.IBOCmCustPutOnRecordHValue;



public class BOCmCustPutOnRecordHEngine {

  public static BOCmCustPutOnRecordHBean[] getBeans(DataContainerInterface dc) throws
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

    public static BOCmCustPutOnRecordHBean getBean(long _CustId,String _BeskedId) throws Exception{
            /**new create*/
    String condition = "CUST_ID = :S_CUST_ID and BESKED_ID = :S_BESKED_ID";
      Map map = new HashMap();
      map.put("S_CUST_ID",new Long(_CustId));
      map.put("S_BESKED_ID",_BeskedId);
;
      BOCmCustPutOnRecordHBean[] beans = getBeans(condition,map);
      if(beans!=null && beans.length==1)
	      return beans[0];
      else if(beans!=null && beans.length>1){
	      throw new Exception("[ERROR]More datas than one queryed by PK");
      }else{
	      BOCmCustPutOnRecordHBean bean = new BOCmCustPutOnRecordHBean();
	      	      bean.setCustId(_CustId);
	      	      bean.setBeskedId(_BeskedId);
	      	      return bean;
      }
 }

  public static  BOCmCustPutOnRecordHBean[] getBeans(Criteria sql) throws Exception{
   return getBeans(sql,-1,-1,false);
  }
 public static  BOCmCustPutOnRecordHBean[] getBeans(Criteria sql,int startNum,int endNum,boolean isShowFK) throws Exception{
    String[] cols = null;
    String condition = "";
    Map param = null;
    if(sql != null){
      cols = (String[])sql.getSelectColumns().toArray(new String[0]);
      condition = sql.toString();
      param = sql.getParameters();
    }
    return (BOCmCustPutOnRecordHBean[])getBeans(cols,condition,param,startNum,endNum,isShowFK);
  }




  public static  BOCmCustPutOnRecordHBean[] getBeans(String condition,Map parameter) throws Exception{
	return getBeans(null,condition,parameter,-1,-1,false);
  }

  public static  BOCmCustPutOnRecordHBean[] getBeans(String[] cols,String condition,Map parameter,
	   int startNum,int endNum,boolean isShowFK) throws Exception{
	Connection conn = null;
	try {
		conn = ServiceManager.getSession().getConnection();
		return (BOCmCustPutOnRecordHBean[])ServiceManager.getDataStore().retrieve(conn,BOCmCustPutOnRecordHBean.class,BOCmCustPutOnRecordHBean.getObjectTypeStatic(),cols,condition,parameter,startNum,endNum,isShowFK,false,null);
	}catch(Exception e){
		throw e;
	}finally{
	   if (conn != null)
	      conn.close();
	}
  }

   public static  BOCmCustPutOnRecordHBean[] getBeans(String[] cols,String condition,Map parameter,
	  int startNum,int endNum,boolean isShowFK,String[] extendBOAttrs) throws Exception{
	  Connection conn = null;
	  try {
		  conn = ServiceManager.getSession().getConnection();
		  return (BOCmCustPutOnRecordHBean[])ServiceManager.getDataStore().retrieve(conn,BOCmCustPutOnRecordHBean.class,BOCmCustPutOnRecordHBean.getObjectTypeStatic(),cols,condition,parameter,startNum,endNum,isShowFK,false,extendBOAttrs);
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
	      return ServiceManager.getDataStore().retrieveCount(conn,BOCmCustPutOnRecordHBean.getObjectTypeStatic(),condition,parameter,null);
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
		return ServiceManager.getDataStore().retrieveCount(conn,BOCmCustPutOnRecordHBean.getObjectTypeStatic(),condition,parameter,extendBOAttrs);
	}catch(Exception e){
		throw e;
	}finally{
	  if (conn != null)
	      conn.close();
	}
   }

  public static void save( BOCmCustPutOnRecordHBean aBean) throws Exception
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

   public static  void save( BOCmCustPutOnRecordHBean[] aBeans) throws Exception{
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

   public static  void saveBatch( BOCmCustPutOnRecordHBean[] aBeans) throws Exception{
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


  public static  BOCmCustPutOnRecordHBean[] getBeansFromQueryBO(String soureBO,Map parameter) throws Exception{
      Connection conn = null;
      ResultSet resultset = null;
      try {
	  conn = ServiceManager.getSession().getConnection();
	  String sql = ServiceManager.getObjectTypeFactory().getInstance(soureBO).getMapingEnty();
	  resultset =ServiceManager.getDataStore().retrieve(conn,sql,parameter);
	  return (BOCmCustPutOnRecordHBean[])ServiceManager.getDataStore().crateDtaContainerFromResultSet(BOCmCustPutOnRecordHBean.class,BOCmCustPutOnRecordHBean.getObjectTypeStatic(),resultset,null,true);
      }catch(Exception e){
	  throw e;
      }finally{
      if(resultset!=null)resultset.close();
	  if (conn != null)
	      conn.close();
      }
   }

     public static  BOCmCustPutOnRecordHBean[] getBeansFromSql(String sql,Map parameter) throws Exception{
      Connection conn = null;
      ResultSet resultset = null;
      try {
	  conn = ServiceManager.getSession().getConnection();
	  resultset =ServiceManager.getDataStore().retrieve(conn,sql,parameter);
	  return (BOCmCustPutOnRecordHBean[])ServiceManager.getDataStore().crateDtaContainerFromResultSet(BOCmCustPutOnRecordHBean.class,BOCmCustPutOnRecordHBean.getObjectTypeStatic(),resultset,null,true);
      }catch(Exception e){
	  throw e;
      }finally{
      if(resultset!=null)resultset.close();
	  if (conn != null)
	      conn.close();
      }
   }

   public static java.math.BigDecimal getNewId() throws Exception{
       return ServiceManager.getIdGenerator().getNewId(BOCmCustPutOnRecordHBean.getObjectTypeStatic());
   }


   public static java.sql.Timestamp getSysDate() throws Exception{
       return ServiceManager.getIdGenerator().getSysDate(BOCmCustPutOnRecordHBean.getObjectTypeStatic());
   }


   public static BOCmCustPutOnRecordHBean wrap(DataContainerInterface source,Map colMatch,boolean canModify){
     try{
       return (BOCmCustPutOnRecordHBean)DataContainerFactory.wrap(source,BOCmCustPutOnRecordHBean.class,colMatch,canModify);
     }catch(Exception e){
       if(e.getCause()!=null)
	 throw new RuntimeException(e.getCause());
       else
	 throw new RuntimeException(e);
     }
   }
   public static BOCmCustPutOnRecordHBean copy(DataContainerInterface source,Map colMatch,boolean canModify){
     try {
       BOCmCustPutOnRecordHBean result = new BOCmCustPutOnRecordHBean();
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

   public static BOCmCustPutOnRecordHBean transfer(IBOCmCustPutOnRecordHValue value) {
	   if(value==null)
		   return null;
	try {
		if(value instanceof BOCmCustPutOnRecordHBean){
			return (BOCmCustPutOnRecordHBean)value;
		}
		BOCmCustPutOnRecordHBean newBean = new BOCmCustPutOnRecordHBean();

		DataContainerFactory.transfer(value ,newBean);
		return newBean;
	}catch (Exception ex) {
		if(ex.getCause()!=null)
			throw new RuntimeException(ex.getCause());
		else
			throw new RuntimeException(ex);
	}
   }

   public static BOCmCustPutOnRecordHBean[] transfer(IBOCmCustPutOnRecordHValue[] value) {
	   if(value==null || value.length==0)
		   return null;

	try {
		if(value instanceof BOCmCustPutOnRecordHBean[]){
			return (BOCmCustPutOnRecordHBean[])value;
		}
		BOCmCustPutOnRecordHBean[] newBeans = new BOCmCustPutOnRecordHBean[value.length];
		   for(int i=0;i<newBeans.length;i++){
			   newBeans[i] = new BOCmCustPutOnRecordHBean();
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
  public static void save(IBOCmCustPutOnRecordHValue aValue) throws Exception
  {
     save(transfer(aValue));
  }

   public static  void save( IBOCmCustPutOnRecordHValue[] aValues) throws Exception{
	  save(transfer(aValues));
   }

   public static  void saveBatch( IBOCmCustPutOnRecordHValue[] aValues) throws Exception{
     saveBatch(transfer(aValues));
   }
}
