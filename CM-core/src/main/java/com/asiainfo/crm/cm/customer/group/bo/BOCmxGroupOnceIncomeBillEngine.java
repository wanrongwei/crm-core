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

public class BOCmxGroupOnceIncomeBillEngine {

  public static BOCmxGroupOnceIncomeBillBean[] getBeans(DataContainerInterface dc) throws
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

    public static BOCmxGroupOnceIncomeBillBean getBean(String _BillId,long _OnceIncomeId) throws Exception{
            /**new create*/
    String condition = "BILL_ID = :S_BILL_ID and ONCE_INCOME_ID = :S_ONCE_INCOME_ID";
      Map map = new HashMap();
      map.put("S_BILL_ID",_BillId);
      map.put("S_ONCE_INCOME_ID",new Long(_OnceIncomeId));
;
      BOCmxGroupOnceIncomeBillBean[] beans = getBeans(condition,map);
      if(beans!=null && beans.length==1)
	      return beans[0];
      else if(beans!=null && beans.length>1){
	//[错误]根据主键查询出现一条以上记录
	      throw new Exception("[ERROR]More datas than one queryed by PK");
      }else{
	      BOCmxGroupOnceIncomeBillBean bean = new BOCmxGroupOnceIncomeBillBean();
	      	      bean.setBillId(_BillId);
	      	      bean.setOnceIncomeId(_OnceIncomeId);
	      	      return bean;
      }
 }

  public static  BOCmxGroupOnceIncomeBillBean[] getBeans(Criteria sql) throws Exception{
   return getBeans(sql,-1,-1,false);
  }
 public static  BOCmxGroupOnceIncomeBillBean[] getBeans(Criteria sql,int startNum,int endNum,boolean isShowFK) throws Exception{
    String[] cols = null;
    String condition = "";
    Map param = null;
    if(sql != null){
      cols = (String[])sql.getSelectColumns().toArray(new String[0]);
      condition = sql.toString();
      param = sql.getParameters();
    }
    return (BOCmxGroupOnceIncomeBillBean[])getBeans(cols,condition,param,startNum,endNum,isShowFK);
  }




  public static  BOCmxGroupOnceIncomeBillBean[] getBeans(String condition,Map parameter) throws Exception{
	return getBeans(null,condition,parameter,-1,-1,false);
  }

  public static  BOCmxGroupOnceIncomeBillBean[] getBeans(String[] cols,String condition,Map parameter,
	   int startNum,int endNum,boolean isShowFK) throws Exception{
	Connection conn = null;
	try {
		conn = ServiceManager.getSession().getConnection();
		return (BOCmxGroupOnceIncomeBillBean[])ServiceManager.getDataStore().retrieve(conn,BOCmxGroupOnceIncomeBillBean.class,BOCmxGroupOnceIncomeBillBean.getObjectTypeStatic(),cols,condition,parameter,startNum,endNum,isShowFK,false,null);
	}catch(Exception e){
		throw e;
	}finally{
	   if (conn != null)
	      conn.close();
	}
  }

   public static  BOCmxGroupOnceIncomeBillBean[] getBeans(String[] cols,String condition,Map parameter,
	  int startNum,int endNum,boolean isShowFK,String[] extendBOAttrs) throws Exception{
	  Connection conn = null;
	  try {
		  conn = ServiceManager.getSession().getConnection();
		  return (BOCmxGroupOnceIncomeBillBean[])ServiceManager.getDataStore().retrieve(conn,BOCmxGroupOnceIncomeBillBean.class,BOCmxGroupOnceIncomeBillBean.getObjectTypeStatic(),cols,condition,parameter,startNum,endNum,isShowFK,false,extendBOAttrs);
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
	      return ServiceManager.getDataStore().retrieveCount(conn,BOCmxGroupOnceIncomeBillBean.getObjectTypeStatic(),condition,parameter,null);
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
		return ServiceManager.getDataStore().retrieveCount(conn,BOCmxGroupOnceIncomeBillBean.getObjectTypeStatic(),condition,parameter,extendBOAttrs);
	}catch(Exception e){
		throw e;
	}finally{
	  if (conn != null)
	      conn.close();
	}
   }

  public static void save( BOCmxGroupOnceIncomeBillBean aBean) throws Exception
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

   public static  void save( BOCmxGroupOnceIncomeBillBean[] aBeans) throws Exception{
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

   public static  void saveBatch( BOCmxGroupOnceIncomeBillBean[] aBeans) throws Exception{
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


  public static  BOCmxGroupOnceIncomeBillBean[] getBeansFromQueryBO(String soureBO,Map parameter) throws Exception{
      Connection conn = null;
      ResultSet resultset = null;
      try {
	  conn = ServiceManager.getSession().getConnection();
	  String sql = ServiceManager.getObjectTypeFactory().getInstance(soureBO).getMapingEnty();
	  resultset =ServiceManager.getDataStore().retrieve(conn,sql,parameter);
	  return (BOCmxGroupOnceIncomeBillBean[])ServiceManager.getDataStore().crateDtaContainerFromResultSet(BOCmxGroupOnceIncomeBillBean.class,BOCmxGroupOnceIncomeBillBean.getObjectTypeStatic(),resultset,null,true);
      }catch(Exception e){
	  throw e;
      }finally{
	  /**add result close*/
	  if(resultset!=null) resultset.close();
	  if (conn != null)
	      conn.close();
      }
   }

     public static  BOCmxGroupOnceIncomeBillBean[] getBeansFromSql(String sql,Map parameter) throws Exception{
      Connection conn = null;
      ResultSet resultset = null;
      try {
	  conn = ServiceManager.getSession().getConnection();
	  resultset =ServiceManager.getDataStore().retrieve(conn,sql,parameter);
	  return (BOCmxGroupOnceIncomeBillBean[])ServiceManager.getDataStore().crateDtaContainerFromResultSet(BOCmxGroupOnceIncomeBillBean.class,BOCmxGroupOnceIncomeBillBean.getObjectTypeStatic(),resultset,null,true);
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
       return ServiceManager.getIdGenerator().getNewId(BOCmxGroupOnceIncomeBillBean.getObjectTypeStatic());
   }


   public static java.sql.Timestamp getSysDate() throws Exception{
       return ServiceManager.getIdGenerator().getSysDate(BOCmxGroupOnceIncomeBillBean.getObjectTypeStatic());
   }


   public static BOCmxGroupOnceIncomeBillBean wrap(DataContainerInterface source,Map colMatch,boolean canModify){
     try{
       return (BOCmxGroupOnceIncomeBillBean)DataContainerFactory.wrap(source,BOCmxGroupOnceIncomeBillBean.class,colMatch,canModify);
     }catch(Exception e){
       if(e.getCause()!=null)
	 throw new RuntimeException(e.getCause());
       else
	 throw new RuntimeException(e);
     }
   }
   public static BOCmxGroupOnceIncomeBillBean copy(DataContainerInterface source,Map colMatch,boolean canModify){
     try {
       BOCmxGroupOnceIncomeBillBean result = new BOCmxGroupOnceIncomeBillBean();
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

   public static BOCmxGroupOnceIncomeBillBean transfer(IBOCmxGroupOnceIncomeBillValue value) {
	   if(value==null)
		   return null;
	try {
		if(value instanceof BOCmxGroupOnceIncomeBillBean){
			return (BOCmxGroupOnceIncomeBillBean)value;
		}
		BOCmxGroupOnceIncomeBillBean newBean = new BOCmxGroupOnceIncomeBillBean();

		DataContainerFactory.transfer(value ,newBean);
		return newBean;
	}catch (Exception ex) {
		if(ex.getCause()!=null)
			throw new RuntimeException(ex.getCause());
		else
			throw new RuntimeException(ex);
	}
   }

   public static BOCmxGroupOnceIncomeBillBean[] transfer(IBOCmxGroupOnceIncomeBillValue[] value) {
	   if(value==null || value.length==0)
		   return null;

	try {
		if(value instanceof BOCmxGroupOnceIncomeBillBean[]){
			return (BOCmxGroupOnceIncomeBillBean[])value;
		}
		BOCmxGroupOnceIncomeBillBean[] newBeans = new BOCmxGroupOnceIncomeBillBean[value.length];
		   for(int i=0;i<newBeans.length;i++){
			   newBeans[i] = new BOCmxGroupOnceIncomeBillBean();
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
  public static void save(IBOCmxGroupOnceIncomeBillValue aValue) throws Exception
  {
     save(transfer(aValue));
  }

   public static  void save( IBOCmxGroupOnceIncomeBillValue[] aValues) throws Exception{
	  save(transfer(aValues));
   }

   public static  void saveBatch( IBOCmxGroupOnceIncomeBillValue[] aValues) throws Exception{
     saveBatch(transfer(aValues));
   }
}
