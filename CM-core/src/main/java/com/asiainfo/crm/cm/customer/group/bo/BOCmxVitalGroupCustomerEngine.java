package com.asiainfo.crm.cm.customer.group.bo;

import java.util.Map;
import java.util.HashMap;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Timestamp;
import com.ai.appframe2.common.AIException;
import com.ai.appframe2.common.DataContainerInterface;
import com.ai.appframe2.common.ServiceManager;
import com.ai.appframe2.util.criteria.Criteria;
import com.ai.appframe2.bo.DataContainerFactory;

import com.asiainfo.crm.cm.customer.group.ivalues.*;

public class BOCmxVitalGroupCustomerEngine {

  public static BOCmxVitalGroupCustomerBean[] getBeans(DataContainerInterface dc) throws
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

    public static BOCmxVitalGroupCustomerBean getBean(String _VgroupId) throws Exception{
            /**new create*/
    String condition = "VGROUP_ID = :S_VGROUP_ID";
      Map map = new HashMap();
      map.put("S_VGROUP_ID",_VgroupId);
;
      BOCmxVitalGroupCustomerBean[] beans = getBeans(condition,map);
      if(beans!=null && beans.length==1)
	      return beans[0];
      else if(beans!=null && beans.length>1){
	//[错误]根据主键查询出现一条以上记录
	      throw new Exception("[ERROR]More datas than one queryed by PK");
      }else{
	      BOCmxVitalGroupCustomerBean bean = new BOCmxVitalGroupCustomerBean();
	      	      bean.setVgroupId(_VgroupId);
	      	      return bean;
      }
 }

  public static  BOCmxVitalGroupCustomerBean[] getBeans(Criteria sql) throws Exception{
   return getBeans(sql,-1,-1,false);
  }
 public static  BOCmxVitalGroupCustomerBean[] getBeans(Criteria sql,int startNum,int endNum,boolean isShowFK) throws Exception{
    String[] cols = null;
    String condition = "";
    Map param = null;
    if(sql != null){
      cols = (String[])sql.getSelectColumns().toArray(new String[0]);
      condition = sql.toString();
      param = sql.getParameters();
    }
    return (BOCmxVitalGroupCustomerBean[])getBeans(cols,condition,param,startNum,endNum,isShowFK);
  }




  public static  BOCmxVitalGroupCustomerBean[] getBeans(String condition,Map parameter) throws Exception{
	return getBeans(null,condition,parameter,-1,-1,false);
  }

  public static  BOCmxVitalGroupCustomerBean[] getBeans(String[] cols,String condition,Map parameter,
	   int startNum,int endNum,boolean isShowFK) throws Exception{
	Connection conn = null;
	try {
		conn = ServiceManager.getSession().getConnection();
		return (BOCmxVitalGroupCustomerBean[])ServiceManager.getDataStore().retrieve(conn,BOCmxVitalGroupCustomerBean.class,BOCmxVitalGroupCustomerBean.getObjectTypeStatic(),cols,condition,parameter,startNum,endNum,isShowFK,false,null);
	}catch(Exception e){
		throw e;
	}finally{
	   if (conn != null)
	      conn.close();
	}
  }

   public static  BOCmxVitalGroupCustomerBean[] getBeans(String[] cols,String condition,Map parameter,
	  int startNum,int endNum,boolean isShowFK,String[] extendBOAttrs) throws Exception{
	  Connection conn = null;
	  try {
		  conn = ServiceManager.getSession().getConnection();
		  return (BOCmxVitalGroupCustomerBean[])ServiceManager.getDataStore().retrieve(conn,BOCmxVitalGroupCustomerBean.class,BOCmxVitalGroupCustomerBean.getObjectTypeStatic(),cols,condition,parameter,startNum,endNum,isShowFK,false,extendBOAttrs);
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
	      return ServiceManager.getDataStore().retrieveCount(conn,BOCmxVitalGroupCustomerBean.getObjectTypeStatic(),condition,parameter,null);
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
		return ServiceManager.getDataStore().retrieveCount(conn,BOCmxVitalGroupCustomerBean.getObjectTypeStatic(),condition,parameter,extendBOAttrs);
	}catch(Exception e){
		throw e;
	}finally{
	  if (conn != null)
	      conn.close();
	}
   }

  public static void save( BOCmxVitalGroupCustomerBean aBean) throws Exception
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

   public static  void save( BOCmxVitalGroupCustomerBean[] aBeans) throws Exception{
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

   public static  void saveBatch( BOCmxVitalGroupCustomerBean[] aBeans) throws Exception{
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


  public static  BOCmxVitalGroupCustomerBean[] getBeansFromQueryBO(String soureBO,Map parameter) throws Exception{
      Connection conn = null;
      ResultSet resultset = null;
      try {
	  conn = ServiceManager.getSession().getConnection();
	  String sql = ServiceManager.getObjectTypeFactory().getInstance(soureBO).getMapingEnty();
	  resultset =ServiceManager.getDataStore().retrieve(conn,sql,parameter);
	  return (BOCmxVitalGroupCustomerBean[])ServiceManager.getDataStore().crateDtaContainerFromResultSet(BOCmxVitalGroupCustomerBean.class,BOCmxVitalGroupCustomerBean.getObjectTypeStatic(),resultset,null,true);
      }catch(Exception e){
	  throw e;
      }finally{
	  /**add result close*/
	  if(resultset!=null) resultset.close();
	  if (conn != null)
	      conn.close();
      }
   }

     public static  BOCmxVitalGroupCustomerBean[] getBeansFromSql(String sql,Map parameter) throws Exception{
      Connection conn = null;
      ResultSet resultset = null;
      try {
	  conn = ServiceManager.getSession().getConnection();
	  resultset =ServiceManager.getDataStore().retrieve(conn,sql,parameter);
	  return (BOCmxVitalGroupCustomerBean[])ServiceManager.getDataStore().crateDtaContainerFromResultSet(BOCmxVitalGroupCustomerBean.class,BOCmxVitalGroupCustomerBean.getObjectTypeStatic(),resultset,null,true);
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
       return ServiceManager.getIdGenerator().getNewId(BOCmxVitalGroupCustomerBean.getObjectTypeStatic());
   }


   public static java.sql.Timestamp getSysDate() throws Exception{
       return ServiceManager.getIdGenerator().getSysDate(BOCmxVitalGroupCustomerBean.getObjectTypeStatic());
   }


   public static BOCmxVitalGroupCustomerBean wrap(DataContainerInterface source,Map colMatch,boolean canModify){
     try{
       return (BOCmxVitalGroupCustomerBean)DataContainerFactory.wrap(source,BOCmxVitalGroupCustomerBean.class,colMatch,canModify);
     }catch(Exception e){
       if(e.getCause()!=null)
	 throw new RuntimeException(e.getCause());
       else
	 throw new RuntimeException(e);
     }
   }
   public static BOCmxVitalGroupCustomerBean copy(DataContainerInterface source,Map colMatch,boolean canModify){
     try {
       BOCmxVitalGroupCustomerBean result = new BOCmxVitalGroupCustomerBean();
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

   public static BOCmxVitalGroupCustomerBean transfer(IBOCmxVitalGroupCustomerValue value) {
	   if(value==null)
		   return null;
	try {
		if(value instanceof BOCmxVitalGroupCustomerBean){
			return (BOCmxVitalGroupCustomerBean)value;
		}
		BOCmxVitalGroupCustomerBean newBean = new BOCmxVitalGroupCustomerBean();

		DataContainerFactory.transfer(value ,newBean);
		return newBean;
	}catch (Exception ex) {
		if(ex.getCause()!=null)
			throw new RuntimeException(ex.getCause());
		else
			throw new RuntimeException(ex);
	}
   }

   public static BOCmxVitalGroupCustomerBean[] transfer(IBOCmxVitalGroupCustomerValue[] value) {
	   if(value==null || value.length==0)
		   return null;

	try {
		if(value instanceof BOCmxVitalGroupCustomerBean[]){
			return (BOCmxVitalGroupCustomerBean[])value;
		}
		BOCmxVitalGroupCustomerBean[] newBeans = new BOCmxVitalGroupCustomerBean[value.length];
		   for(int i=0;i<newBeans.length;i++){
			   newBeans[i] = new BOCmxVitalGroupCustomerBean();
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
  public static void save(IBOCmxVitalGroupCustomerValue aValue) throws Exception
  {
     save(transfer(aValue));
  }

   public static  void save( IBOCmxVitalGroupCustomerValue[] aValues) throws Exception{
	  save(transfer(aValues));
   }

   public static  void saveBatch( IBOCmxVitalGroupCustomerValue[] aValues) throws Exception{
     saveBatch(transfer(aValues));
   }
}
