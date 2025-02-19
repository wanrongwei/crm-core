package com.asiainfo.crm.common;

import com.ai.appframe2.common.ServiceManager;
import com.ai.appframe2.common.SessionManager;
import com.ai.appframe2.complex.tab.split.TenantIDFactory;
import com.ai.appframe2.privilege.UserInfoInterface;
import com.ai.appframe2.service.ServiceFactory;
import com.asiainfo.crm.constant.ResConst;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import java.rmi.RemoteException;
import java.sql.Timestamp;

public class ResUserInfo
{
	private static transient Log log = LogFactory.getLog(ResUserInfo.class);

	/**
	 * 获取 租户 编码
	 */
	public static String getTenantId() throws Exception
	{
		String tenantId = TenantIDFactory.getTenant();
		return tenantId;
	}

	/**
	 * 获取当前操作员归属地市： SR0.2资源侧不要RegionId字段
	 */
	public static String getRegionId() throws Exception
	{
		// SR0.2资源侧不要RegionId字段
		String regionId = getTenantId();
		try
		{
			return regionId;
		} catch (Exception e)
		{
			log.info("***", e);
		} finally
		{
			log.info("*** regionId = ***" + regionId);
		}
		return null;
	}

	/**
	 * 获取归属组织，网络运营商返回最上层组织编号，租户91分表获取当前虚拟运营商的各自对应组织 
	 */
	public static long getTopOrganizeId() throws Exception
	{
		long topOrganizeId = 21000000L;
		// 21租户
		if ("21".equals(ResUserInfo.getTenantId()))
		{
			topOrganizeId = ResConst.PARENT_ORG_ID;
			return topOrganizeId; // 总组织
		}
		// 91租户：91表存放了所有虚拟运营商的数据，按照 归属组织+实例编号(号码、SIM卡) 做联合主键
		else if ("91".equals(ResUserInfo.getTenantId()))
		{
			long secOrgId = ResUserInfo.getOrgId();
			return secOrgId;
		}
		// 22租户：TODO 需要设定一个匈牙利最上层组织
		else if ("22".equals(ResUserInfo.getTenantId()))
		{
			long secOrgId = ResConst.HU_ORG_ID;
			return secOrgId;
		}
		return topOrganizeId;
	}

	// 根据地市获取地市最上层组织编号
	public static long getOrganizeIdByRegionId(String regionId)
	{
		// 正常的方法：目前个有问题，获取不到，暂时不用
		// OrgmodelClient.getOrganizeIdByRegionId(regionId);// 通过调用这个方法找到当前地区的ORGID
		return -1;
	}


	/**
	 * 获取当前操作员归属县区
	 */
	public static String getCountyId() throws Exception
	{
		return getTenantId();
		// return (String) SessionManager.getUser().get(com.ai.secframe.common.Constants.COUNTY_ID);
	}

	/**
	 * 获取当前操作员编号
	 */
	public static long getOpId() throws Exception
	{
		long opId = 0L;
		try
		{
			UserInfoInterface user = SessionManager.getUser();
			opId = user.getID();
		} catch (Exception e)
		{
			log.info("***", e);
			return opId;
		} finally
		{
			log.info("*** opId = ***" + opId);
		}
		return opId;
	}
	
	/**
	 * 获取当前操作员编码
	 */
	public static String getCode() throws Exception
	{
		String opCode = "";
		try
		{
			UserInfoInterface user = SessionManager.getUser();
			opCode = user.getCode();
		} catch (Exception e)
		{
			log.info("***", e);
			return opCode;
		} finally
		{
			log.info("*** opCode = ***" + opCode);
		}
		return opCode;
	}
	

	/**
	 * 获取当前操作员姓名
	 */
	public static String getOpName() throws Exception
	{
		String opName = "";
		try
		{
			UserInfoInterface user = SessionManager.getUser();
			opName = user.getName();
		} catch (Exception e)
		{
			log.info("***", e);
			return opName;
		} finally
		{
			log.info("*** opName = ***" + opName);
		}
		return opName;
	}

	/**
	 * 获取当前操作员DomainId
	 */
	public static long getDomainId() throws Exception
	{
		long domainId = 0L;
		try
		{
			UserInfoInterface user = SessionManager.getUser();
			domainId = user.getDomainId();
		} catch (Exception e)
		{
			log.info("***", e);

		} finally
		{
			log.info("*** domainId = ***" + domainId);
		}
		return domainId;
	}

	/**
	 * 获取当前操作员归属组织编号
	 */
	public static long getOrgId() throws Exception
	{
		long orgId = 0L;
		try
		{
			UserInfoInterface user = SessionManager.getUser();
			orgId = user.getOrgId();
		} catch (Exception e)
		{
			log.info("***", e);
			return orgId;
		} finally
		{
			log.info("*** orgId = ***" + orgId);
		}
		return orgId;
	}

	/**
	 * 获取当前操作员归属组织名称
	 */
	public static String getOrgName() throws Exception
	{
		String orgName = "";
		try
		{
			UserInfoInterface user = SessionManager.getUser();
			orgName = user.getOrgName();
		} catch (Exception e)
		{
			log.info("***", e);
			return orgName;
		} finally
		{
			log.info("*** orgName = ***" + orgName);
		}
		return orgName;
	}

	public static long getDoneCode() throws Exception
	{
		long doneCode = 0L;
		try
		{
			doneCode=ServiceManager.getDoneCode();
		} catch (Exception e)
		{
			log.info("***", e);
			return doneCode;
		} finally
		{
			log.info("*** doneCode = ***" + doneCode);
		}
		return doneCode;
	}

	/**
	 * 获取数据库当前时间
	 */
	public static Timestamp getDoneDate() throws Exception, RemoteException
	{
		return ServiceManager.getIdGenerator().getSysDate();
	}


	/**
	 * 获取当前 国家编码 CountryCode
	 */
	public static String getCountryCode() throws Exception
	{
		String countryCode = "DK";
		if (ResUserInfo.getTenantId().equals("21") || ResUserInfo.getTenantId().equals("91"))
		{
			countryCode = "DK";
		} else
		{
			countryCode = "HU";
		}
		return countryCode;
	}
	
	// 判断是否是省公司
	public static boolean isProvinceOper() throws Exception, RemoteException
	{
		if (getOrgId() == getOrganizeIdByRegionId(getRegionId()))
		{
			return true;
		} else
		{
			return false;
		}
	}

//	public static Timestamp getMaxExpire() throws Exception, RemoteException
//	{
//		return ResTimeUtils.convertStringToTimestamp(ResConst.MAX_Expire_DATE, "yyyy-MM-dd HH:mm:ss");
//	}

	public static String getStorePermission() throws Exception, RemoteException
	{
		return "1"; // 获取当前操作员的仓库权限，0：所有，1：一级节点
	}

}
