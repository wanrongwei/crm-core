package com.asiainfo.crm.cm.cp.bo;

import java.util.Map;
import java.util.HashMap;
import java.sql.Connection;
import java.sql.ResultSet;
import com.ai.appframe2.common.AIException;
import com.ai.appframe2.common.DataContainerInterface;
import com.ai.appframe2.common.ServiceManager;
import com.ai.appframe2.util.criteria.Criteria;
import com.ai.appframe2.bo.DataContainerFactory;

import com.asiainfo.crm.cm.cp.ivalues.*;

public class BOCmPartnerBusiTypeDtlEngine {

  public static BOCmPartnerBusiTypeDtlBean[] getBeans(DataContainerInterface dc) throws
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

    public static BOCmPartnerBusiTypeDtlBean getBean(long _TypeDtlId,long _TypeId) throws Exception{
            /**new create*/
    String condition = "TYPE_DTL_ID = :S_TYPE_DTL_ID and TYPE_ID = :S_TYPE_ID";
      Map map = new HashMap();
      map.put("S_TYPE_DTL_ID",new Long(_TypeDtlId));
      map.put("S_TYPE_ID",new Long(_TypeId));
;
      BOCmPartnerBusiTypeDtlBean[] beans = getBeans(condition,map);
      if(beans!=null && beans.length==1)
	      return beans[0];
      else if(beans!=null && beans.length>1){
	//[错误]根据主键查询出现一条以上记录
	      throw new Exception("[ERROR]More datas than one queryed by PK");
      }else{
	      BOCmPartnerBusiTypeDtlBean bean = new BOCmPartnerBusiTypeDtlBean();
	      	      bean.setTypeDtlId(_TypeDtlId);
	      	      bean.setTypeId(_TypeId);
	      	      return bean;
      }
 }

  public static  BOCmPartnerBusiTypeDtlBean[] getBeans(Criteria sql) throws Exception{
   return getBeans(sql,-1,-1,false);
  }
 public static  BOCmPartnerBusiTypeDtlBean[] getBeans(Criteria sql,int startNum,int endNum,boolean isShowFK) throws Exception{
    String[] cols = null;
    String condition = "";
    Map param = null;
    if(sql != null){
      cols = (String[])sql.getSelectColumns().toArray(new String[0]);
      condition = sql.toString();
      param = sql.getParameters();
    }
    return (BOCmPartnerBusiTypeDtlBean[])getBeans(cols,condition,param,startNum,endNum,isShowFK);
  }




  public static  BOCmPartnerBusiTypeDtlBean[] getBeans(String condition,Map parameter) throws Exception{
	return getBeans(null,condition,parameter,-1,-1,false);
  }

  public static  BOCmPartnerBusiTypeDtlBean[] getBeans(String[] cols,String condition,Map parameter,
	   int startNum,int endNum,boolean isShowFK) throws Exception{
	Connection conn = null;
	try {
		conn = ServiceManager.getSession().getConnection();
		return (BOCmPartnerBusiTypeDtlBean[])ServiceManager.getDataStore().retrieve(conn,BOCmPartnerBusiTypeDtlBean.class,BOCmPartnerBusiTypeDtlBean.getObjectTypeStatic(),cols,condition,parameter,startNum,endNum,isShowFK,false,null);
	}catch(Exception e){
		throw e;
	}finally{
	   if (conn != null)
	      conn.close();
	}
  }

   public static  BOCmPartnerBusiTypeDtlBean[] getBeans(String[] cols,String condition,Map parameter,
	  int startNum,int endNum,boolean isShowFK,String[] extendBOAttrs) throws Exception{
	  Connection conn = null;
	  try {
		  conn = ServiceManager.getSession().getConnection();
		  return (BOCmPartnerBusiTypeDtlBean[])ServiceManager.getDataStore().retrieve(conn,BOCmPartnerBusiTypeDtlBean.class,BOCmPartnerBusiTypeDtlBean.getObjectTypeStatic(),cols,condition,parameter,startNum,endNum,isShowFK,false,extendBOAttrs);
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
	      return ServiceManager.getDataStore().retrieveCount(conn,BOCmPartnerBusiTypeDtlBean.getObjectTypeStatic(),condition,parameter,null);
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
		return ServiceManager.getDataStore().retrieveCount(conn,BOCmPartnerBusiTypeDtlBean.getObjectTypeStatic(),condition,parameter,extendBOAttrs);
	}catch(Exception e){
		throw e;
	}finally{
	  if (conn != null)
	      conn.close();
	}
   }

  public static void save( BOCmPartnerBusiTypeDtlBean aBean) throws Exception
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

   public static  void save( BOCmPartnerBusiTypeDtlBean[] aBeans) throws Exception{
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

   public static  void saveBatch( BOCmPartnerBusiTypeDtlBean[] aBeans) throws Exception{
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


  public static  BOCmPartnerBusiTypeDtlBean[] getBeansFromQueryBO(String soureBO,Map parameter) throws Exception{
      Connection conn = null;
      ResultSet resultset = null;
      try {
	  conn = ServiceManager.getSession().getConnection();
	  String sql = ServiceManager.getObjectTypeFactory().getInstance(soureBO).getMapingEnty();
	  resultset =ServiceManager.getDataStore().retrieve(conn,sql,parameter);
	  return (BOCmPartnerBusiTypeDtlBean[])ServiceManager.getDataStore().crateDtaContainerFromResultSet(BOCmPartnerBusiTypeDtlBean.class,BOCmPartnerBusiTypeDtlBean.getObjectTypeStatic(),resultset,null,true);
      }catch(Exception e){
	  throw e;
      }finally{
      if(resultset!=null)resultset.close();
	  if (conn != null)
	      conn.close();
      }
   }

     public static  BOCmPartnerBusiTypeDtlBean[] getBeansFromSql(String sql,Map parameter) throws Exception{
      Connection conn = null;
      ResultSet resultset = null;
      try {
	  conn = ServiceManager.getSession().getConnection();
	  resultset =ServiceManager.getDataStore().retrieve(conn,sql,parameter);
	  return (BOCmPartnerBusiTypeDtlBean[])ServiceManager.getDataStore().crateDtaContainerFromResultSet(BOCmPartnerBusiTypeDtlBean.class,BOCmPartnerBusiTypeDtlBean.getObjectTypeStatic(),resultset,null,true);
      }catch(Exception e){
	  throw e;
      }finally{
      if(resultset!=null)resultset.close();
	  if (conn != null)
	      conn.close();
      }
   }

   public static java.math.BigDecimal getNewId() throws Exception{
       return ServiceManager.getIdGenerator().getNewId(BOCmPartnerBusiTypeDtlBean.getObjectTypeStatic());
   }


   public static java.sql.Timestamp getSysDate() throws Exception{
       return ServiceManager.getIdGenerator().getSysDate(BOCmPartnerBusiTypeDtlBean.getObjectTypeStatic());
   }


   public static BOCmPartnerBusiTypeDtlBean wrap(DataContainerInterface source,Map colMatch,boolean canModify){
     try{
       return (BOCmPartnerBusiTypeDtlBean)DataContainerFactory.wrap(source,BOCmPartnerBusiTypeDtlBean.class,colMatch,canModify);
     }catch(Exception e){
       if(e.getCause()!=null)
	 throw new RuntimeException(e.getCause());
       else
	 throw new RuntimeException(e);
     }
   }
   public static BOCmPartnerBusiTypeDtlBean copy(DataContainerInterface source,Map colMatch,boolean canModify){
     try {
       BOCmPartnerBusiTypeDtlBean result = new BOCmPartnerBusiTypeDtlBean();
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

   public static BOCmPartnerBusiTypeDtlBean transfer(IBOCmPartnerBusiTypeDtlValue value) {
	   if(value==null)
		   return null;
	try {
		if(value instanceof BOCmPartnerBusiTypeDtlBean){
			return (BOCmPartnerBusiTypeDtlBean)value;
		}
		BOCmPartnerBusiTypeDtlBean newBean = new BOCmPartnerBusiTypeDtlBean();

		DataContainerFactory.transfer(value ,newBean);
		return newBean;
	}catch (Exception ex) {
		if(ex.getCause()!=null)
			throw new RuntimeException(ex.getCause());
		else
			throw new RuntimeException(ex);
	}
   }

   public static BOCmPartnerBusiTypeDtlBean[] transfer(IBOCmPartnerBusiTypeDtlValue[] value) {
	   if(value==null || value.length==0)
		   return null;

	try {
		if(value instanceof BOCmPartnerBusiTypeDtlBean[]){
			return (BOCmPartnerBusiTypeDtlBean[])value;
		}
		BOCmPartnerBusiTypeDtlBean[] newBeans = new BOCmPartnerBusiTypeDtlBean[value.length];
		   for(int i=0;i<newBeans.length;i++){
			   newBeans[i] = new BOCmPartnerBusiTypeDtlBean();
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
  public static void save(IBOCmPartnerBusiTypeDtlValue aValue) throws Exception
  {
     save(transfer(aValue));
  }

   public static  void save( IBOCmPartnerBusiTypeDtlValue[] aValues) throws Exception{
	  save(transfer(aValues));
   }

   public static  void saveBatch( IBOCmPartnerBusiTypeDtlValue[] aValues) throws Exception{
     saveBatch(transfer(aValues));
   }
}
