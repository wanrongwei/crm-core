package com.asiainfo.crm.cm.model.bo;

import java.util.Map;
import java.util.HashMap;
import java.sql.Connection;
import java.sql.ResultSet;
import com.ai.appframe2.common.AIException;
import com.ai.appframe2.common.DataContainerInterface;
import com.ai.appframe2.common.ServiceManager;
import com.ai.appframe2.util.criteria.Criteria;
import com.ai.appframe2.bo.DataContainerFactory;

import com.asiainfo.crm.cm.model.ivalues.*;

public class CmParaMaintainEngine {

  public static CmParaMaintainBean[] getBeans(DataContainerInterface dc) throws
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

    public static CmParaMaintainBean getBean(long _MaintainOrgId,long _FactoryId) throws Exception{
            /**new create*/
    String condition = "MAINTAIN_ORG_ID = :S_MAINTAIN_ORG_ID and FACTORY_ID = :S_FACTORY_ID";
      Map map = new HashMap();
      map.put("S_MAINTAIN_ORG_ID",new Long(_MaintainOrgId));
      map.put("S_FACTORY_ID",new Long(_FactoryId));
;
      CmParaMaintainBean[] beans = getBeans(condition,map);
      if(beans!=null && beans.length==1)
	      return beans[0];
      else if(beans!=null && beans.length>1){
	//[错误]根据主键查询出现一条以上记录
	      throw new Exception("[ERROR]More datas than one queryed by PK");
      }else{
	      CmParaMaintainBean bean = new CmParaMaintainBean();
	      	      bean.setMaintainOrgId(_MaintainOrgId);
	      	      bean.setFactoryId(_FactoryId);
	      	      return bean;
      }
 }

  public static  CmParaMaintainBean[] getBeans(Criteria sql) throws Exception{
   return getBeans(sql,-1,-1,false);
  }
 public static  CmParaMaintainBean[] getBeans(Criteria sql,int startNum,int endNum,boolean isShowFK) throws Exception{
    String[] cols = null;
    String condition = "";
    Map param = null;
    if(sql != null){
      cols = (String[])sql.getSelectColumns().toArray(new String[0]);
      condition = sql.toString();
      param = sql.getParameters();
    }
    return (CmParaMaintainBean[])getBeans(cols,condition,param,startNum,endNum,isShowFK);
  }




  public static  CmParaMaintainBean[] getBeans(String condition,Map parameter) throws Exception{
	return getBeans(null,condition,parameter,-1,-1,false);
  }

  public static  CmParaMaintainBean[] getBeans(String[] cols,String condition,Map parameter,
	   int startNum,int endNum,boolean isShowFK) throws Exception{
	Connection conn = null;
	try {
		conn = ServiceManager.getSession().getConnection();
		return (CmParaMaintainBean[])ServiceManager.getDataStore().retrieve(conn,CmParaMaintainBean.class,CmParaMaintainBean.getObjectTypeStatic(),cols,condition,parameter,startNum,endNum,isShowFK,false,null);
	}catch(Exception e){
		throw e;
	}finally{
	   if (conn != null)
	      conn.close();
	}
  }

   public static  CmParaMaintainBean[] getBeans(String[] cols,String condition,Map parameter,
	  int startNum,int endNum,boolean isShowFK,String[] extendBOAttrs) throws Exception{
	  Connection conn = null;
	  try {
		  conn = ServiceManager.getSession().getConnection();
		  return (CmParaMaintainBean[])ServiceManager.getDataStore().retrieve(conn,CmParaMaintainBean.class,CmParaMaintainBean.getObjectTypeStatic(),cols,condition,parameter,startNum,endNum,isShowFK,false,extendBOAttrs);
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
	      return ServiceManager.getDataStore().retrieveCount(conn,CmParaMaintainBean.getObjectTypeStatic(),condition,parameter,null);
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
		return ServiceManager.getDataStore().retrieveCount(conn,CmParaMaintainBean.getObjectTypeStatic(),condition,parameter,extendBOAttrs);
	}catch(Exception e){
		throw e;
	}finally{
	  if (conn != null)
	      conn.close();
	}
   }

  public static void save( CmParaMaintainBean aBean) throws Exception
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

   public static  void save( CmParaMaintainBean[] aBeans) throws Exception{
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

   public static  void saveBatch( CmParaMaintainBean[] aBeans) throws Exception{
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


  public static  CmParaMaintainBean[] getBeansFromQueryBO(String soureBO,Map parameter) throws Exception{
      Connection conn = null;
      ResultSet resultset = null;
      try {
	  conn = ServiceManager.getSession().getConnection();
	  String sql = ServiceManager.getObjectTypeFactory().getInstance(soureBO).getMapingEnty();
	  resultset =ServiceManager.getDataStore().retrieve(conn,sql,parameter);
	  return (CmParaMaintainBean[])ServiceManager.getDataStore().crateDtaContainerFromResultSet(CmParaMaintainBean.class,CmParaMaintainBean.getObjectTypeStatic(),resultset,null,true);
      }catch(Exception e){
	  throw e;
      }finally{
      if(resultset!=null)resultset.close();
	  if (conn != null)
	      conn.close();
      }
   }

     public static  CmParaMaintainBean[] getBeansFromSql(String sql,Map parameter) throws Exception{
      Connection conn = null;
      ResultSet resultset = null;
      try {
	  conn = ServiceManager.getSession().getConnection();
	  resultset =ServiceManager.getDataStore().retrieve(conn,sql,parameter);
	  return (CmParaMaintainBean[])ServiceManager.getDataStore().crateDtaContainerFromResultSet(CmParaMaintainBean.class,CmParaMaintainBean.getObjectTypeStatic(),resultset,null,true);
      }catch(Exception e){
	  throw e;
      }finally{
      if(resultset!=null)resultset.close();
	  if (conn != null)
	      conn.close();
      }
   }

   public static java.math.BigDecimal getNewId() throws Exception{
       return ServiceManager.getIdGenerator().getNewId(CmParaMaintainBean.getObjectTypeStatic());
   }


   public static java.sql.Timestamp getSysDate() throws Exception{
       return ServiceManager.getIdGenerator().getSysDate(CmParaMaintainBean.getObjectTypeStatic());
   }


   public static CmParaMaintainBean wrap(DataContainerInterface source,Map colMatch,boolean canModify){
     try{
       return (CmParaMaintainBean)DataContainerFactory.wrap(source,CmParaMaintainBean.class,colMatch,canModify);
     }catch(Exception e){
       if(e.getCause()!=null)
	 throw new RuntimeException(e.getCause());
       else
	 throw new RuntimeException(e);
     }
   }
   public static CmParaMaintainBean copy(DataContainerInterface source,Map colMatch,boolean canModify){
     try {
       CmParaMaintainBean result = new CmParaMaintainBean();
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

   public static CmParaMaintainBean transfer(ICmParaMaintainValue value) {
	   if(value==null)
		   return null;
	try {
		if(value instanceof CmParaMaintainBean){
			return (CmParaMaintainBean)value;
		}
		CmParaMaintainBean newBean = new CmParaMaintainBean();

		DataContainerFactory.transfer(value ,newBean);
		return newBean;
	}catch (Exception ex) {
		if(ex.getCause()!=null)
			throw new RuntimeException(ex.getCause());
		else
			throw new RuntimeException(ex);
	}
   }

   public static CmParaMaintainBean[] transfer(ICmParaMaintainValue[] value) {
	   if(value==null || value.length==0)
		   return null;

	try {
		if(value instanceof CmParaMaintainBean[]){
			return (CmParaMaintainBean[])value;
		}
		CmParaMaintainBean[] newBeans = new CmParaMaintainBean[value.length];
		   for(int i=0;i<newBeans.length;i++){
			   newBeans[i] = new CmParaMaintainBean();
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
  public static void save(ICmParaMaintainValue aValue) throws Exception
  {
     save(transfer(aValue));
  }

   public static  void save( ICmParaMaintainValue[] aValues) throws Exception{
	  save(transfer(aValues));
   }

   public static  void saveBatch( ICmParaMaintainValue[] aValues) throws Exception{
     saveBatch(transfer(aValues));
   }
}
