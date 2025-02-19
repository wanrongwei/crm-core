package com.asiainfo.crm.cm.inner.party.bo;

import java.util.Map;
import java.util.HashMap;
import java.sql.Connection;
import java.sql.ResultSet;
import com.ai.appframe2.common.AIException;
import com.ai.appframe2.common.DataContainerInterface;
import com.ai.appframe2.common.ServiceManager;
import com.ai.appframe2.util.criteria.Criteria;
import com.ai.appframe2.bo.DataContainerFactory;

import com.asiainfo.crm.cm.inner.party.ivalues.*;

public class BOCmxIndivPartyHobbyEngine {

  public static BOCmxIndivPartyHobbyBean[] getBeans(DataContainerInterface dc) throws
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

    public static BOCmxIndivPartyHobbyBean getBean(int _HobbyType,int _HobbyId,long _PartyId) throws Exception{
            /**new create*/
    String condition = "HOBBY_TYPE = :S_HOBBY_TYPE and HOBBY_ID = :S_HOBBY_ID and PARTY_ID = :S_PARTY_ID";
      Map map = new HashMap();
      map.put("S_HOBBY_TYPE",new Integer(_HobbyType));
      map.put("S_HOBBY_ID",new Integer(_HobbyId));
      map.put("S_PARTY_ID",new Long(_PartyId));
;
      BOCmxIndivPartyHobbyBean[] beans = getBeans(condition,map);
      if(beans!=null && beans.length==1)
	      return beans[0];
      else if(beans!=null && beans.length>1){
	//[错误]根据主键查询出现一条以上记录
	      throw new Exception("[ERROR]More datas than one queryed by PK");
      }else{
	      BOCmxIndivPartyHobbyBean bean = new BOCmxIndivPartyHobbyBean();
	      	      bean.setHobbyType(_HobbyType);
	      	      bean.setHobbyId(_HobbyId);
	      	      bean.setPartyId(_PartyId);
	      	      return bean;
      }
 }

  public static  BOCmxIndivPartyHobbyBean[] getBeans(Criteria sql) throws Exception{
   return getBeans(sql,-1,-1,false);
  }
 public static  BOCmxIndivPartyHobbyBean[] getBeans(Criteria sql,int startNum,int endNum,boolean isShowFK) throws Exception{
    String[] cols = null;
    String condition = "";
    Map param = null;
    if(sql != null){
      cols = (String[])sql.getSelectColumns().toArray(new String[0]);
      condition = sql.toString();
      param = sql.getParameters();
    }
    return (BOCmxIndivPartyHobbyBean[])getBeans(cols,condition,param,startNum,endNum,isShowFK);
  }




  public static  BOCmxIndivPartyHobbyBean[] getBeans(String condition,Map parameter) throws Exception{
	return getBeans(null,condition,parameter,-1,-1,false);
  }

  public static  BOCmxIndivPartyHobbyBean[] getBeans(String[] cols,String condition,Map parameter,
	   int startNum,int endNum,boolean isShowFK) throws Exception{
	Connection conn = null;
	try {
		conn = ServiceManager.getSession().getConnection();
		return (BOCmxIndivPartyHobbyBean[])ServiceManager.getDataStore().retrieve(conn,BOCmxIndivPartyHobbyBean.class,BOCmxIndivPartyHobbyBean.getObjectTypeStatic(),cols,condition,parameter,startNum,endNum,isShowFK,false,null);
	}catch(Exception e){
		throw e;
	}finally{
	   if (conn != null)
	      conn.close();
	}
  }

   public static  BOCmxIndivPartyHobbyBean[] getBeans(String[] cols,String condition,Map parameter,
	  int startNum,int endNum,boolean isShowFK,String[] extendBOAttrs) throws Exception{
	  Connection conn = null;
	  try {
		  conn = ServiceManager.getSession().getConnection();
		  return (BOCmxIndivPartyHobbyBean[])ServiceManager.getDataStore().retrieve(conn,BOCmxIndivPartyHobbyBean.class,BOCmxIndivPartyHobbyBean.getObjectTypeStatic(),cols,condition,parameter,startNum,endNum,isShowFK,false,extendBOAttrs);
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
	      return ServiceManager.getDataStore().retrieveCount(conn,BOCmxIndivPartyHobbyBean.getObjectTypeStatic(),condition,parameter,null);
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
		return ServiceManager.getDataStore().retrieveCount(conn,BOCmxIndivPartyHobbyBean.getObjectTypeStatic(),condition,parameter,extendBOAttrs);
	}catch(Exception e){
		throw e;
	}finally{
	  if (conn != null)
	      conn.close();
	}
   }

  public static void save( BOCmxIndivPartyHobbyBean aBean) throws Exception
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

   public static  void save( BOCmxIndivPartyHobbyBean[] aBeans) throws Exception{
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

   public static  void saveBatch( BOCmxIndivPartyHobbyBean[] aBeans) throws Exception{
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


  public static  BOCmxIndivPartyHobbyBean[] getBeansFromQueryBO(String soureBO,Map parameter) throws Exception{
      Connection conn = null;
      ResultSet resultset = null;
      try {
	  conn = ServiceManager.getSession().getConnection();
	  String sql = ServiceManager.getObjectTypeFactory().getInstance(soureBO).getMapingEnty();
	  resultset =ServiceManager.getDataStore().retrieve(conn,sql,parameter);
	  return (BOCmxIndivPartyHobbyBean[])ServiceManager.getDataStore().crateDtaContainerFromResultSet(BOCmxIndivPartyHobbyBean.class,BOCmxIndivPartyHobbyBean.getObjectTypeStatic(),resultset,null,true);
      }catch(Exception e){
	  throw e;
      }finally{
      if(resultset!=null)resultset.close();
	  if (conn != null)
	      conn.close();
      }
   }

     public static  BOCmxIndivPartyHobbyBean[] getBeansFromSql(String sql,Map parameter) throws Exception{
      Connection conn = null;
      ResultSet resultset = null;
      try {
	  conn = ServiceManager.getSession().getConnection();
	  resultset =ServiceManager.getDataStore().retrieve(conn,sql,parameter);
	  return (BOCmxIndivPartyHobbyBean[])ServiceManager.getDataStore().crateDtaContainerFromResultSet(BOCmxIndivPartyHobbyBean.class,BOCmxIndivPartyHobbyBean.getObjectTypeStatic(),resultset,null,true);
      }catch(Exception e){
	  throw e;
      }finally{
      if(resultset!=null)resultset.close();
	  if (conn != null)
	      conn.close();
      }
   }

   public static java.math.BigDecimal getNewId() throws Exception{
       return ServiceManager.getIdGenerator().getNewId(BOCmxIndivPartyHobbyBean.getObjectTypeStatic());
   }


   public static java.sql.Timestamp getSysDate() throws Exception{
       return ServiceManager.getIdGenerator().getSysDate(BOCmxIndivPartyHobbyBean.getObjectTypeStatic());
   }


   public static BOCmxIndivPartyHobbyBean wrap(DataContainerInterface source,Map colMatch,boolean canModify){
     try{
       return (BOCmxIndivPartyHobbyBean)DataContainerFactory.wrap(source,BOCmxIndivPartyHobbyBean.class,colMatch,canModify);
     }catch(Exception e){
       if(e.getCause()!=null)
	 throw new RuntimeException(e.getCause());
       else
	 throw new RuntimeException(e);
     }
   }
   public static BOCmxIndivPartyHobbyBean copy(DataContainerInterface source,Map colMatch,boolean canModify){
     try {
       BOCmxIndivPartyHobbyBean result = new BOCmxIndivPartyHobbyBean();
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

   public static BOCmxIndivPartyHobbyBean transfer(IBOCmxIndivPartyHobbyValue value) {
	   if(value==null)
		   return null;
	try {
		if(value instanceof BOCmxIndivPartyHobbyBean){
			return (BOCmxIndivPartyHobbyBean)value;
		}
		BOCmxIndivPartyHobbyBean newBean = new BOCmxIndivPartyHobbyBean();

		DataContainerFactory.transfer(value ,newBean);
		return newBean;
	}catch (Exception ex) {
		if(ex.getCause()!=null)
			throw new RuntimeException(ex.getCause());
		else
			throw new RuntimeException(ex);
	}
   }

   public static BOCmxIndivPartyHobbyBean[] transfer(IBOCmxIndivPartyHobbyValue[] value) {
	   if(value==null || value.length==0)
		   return null;

	try {
		if(value instanceof BOCmxIndivPartyHobbyBean[]){
			return (BOCmxIndivPartyHobbyBean[])value;
		}
		BOCmxIndivPartyHobbyBean[] newBeans = new BOCmxIndivPartyHobbyBean[value.length];
		   for(int i=0;i<newBeans.length;i++){
			   newBeans[i] = new BOCmxIndivPartyHobbyBean();
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
  public static void save(IBOCmxIndivPartyHobbyValue aValue) throws Exception
  {
     save(transfer(aValue));
  }

   public static  void save( IBOCmxIndivPartyHobbyValue[] aValues) throws Exception{
	  save(transfer(aValues));
   }

   public static  void saveBatch( IBOCmxIndivPartyHobbyValue[] aValues) throws Exception{
     saveBatch(transfer(aValues));
   }
}
