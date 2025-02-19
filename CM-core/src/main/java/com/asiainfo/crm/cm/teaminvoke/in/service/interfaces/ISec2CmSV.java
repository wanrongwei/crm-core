/**
 * 
 */
package com.asiainfo.crm.cm.teaminvoke.in.service.interfaces;

import java.util.Map;

import com.ai.appframe2.bo.DataContainer;
import com.ai.common.bo.BOBsDistrictBean;
import com.ai.secframe.orgmodel.ivalues.IBOSecOperatorValue;
import com.ai.secframe.orgmodel.ivalues.IBOSecOrganizeValue;
import com.ai.secframe.orgmodel.ivalues.IBOSecPlayerValue;
import com.ai.secframe.orgmodel.ivalues.IQBOSecCustManagerValue;
import com.ai.secframe.orgmodel.ivalues.IQBOSecOrgStaffOperValue;

/**
 * @Copyright Copyright (c) 2012 Asiainfo-Linkage
 * 
 * @ClassName 权限提供给客户侧的接口
 * @Description 该类的功能描述
 * 
 * @version v1.0.0
 * @author zhangyin
 * @date 2012-4-11 下午12:08:16 <br>
 *       Modification History:<br>
 *       Date Author Version Description<br>
 *       ---------------------------------------------------------*<br>
 *       2012-4-11 zhangyin v1.0.0 修改原因<br>
 */
public interface ISec2CmSV {

	/**
	 * 根据工号(名称)查询操作员
	 * 
	 * @Function getOperatorByCode
	 * @Description
	 * 
	 * @param code
	 * @return
	 * @throws Exception
	 * 
	 * @version v1.0.0
	 * @author zhangyin
	 * @date 2012-4-11 下午12:08:33
	 * 
	 * <strong>Modification History:</strong><br>
	 * Date Author Version Description<br>
	 * ---------------------------------------------------------<br>
	 * 2012-4-11 zhangyin v1.0.0 修改原因<br>
	 */
	public IBOSecOperatorValue getOperatorByCode(String code) throws Exception;

	/**
	 * 
	 * @Function getOperatorInfoByOpId
	 * @Description 根据opId查询操作员信息
	 * 
	 * @param operatorId
	 * @return
	 * @throws Exception
	 * 
	 * @version v1.0.0
	 * @author huaiduo
	 * @date 2012-4-17 下午06:45:53
	 * 
	 * <strong>Modification History:</strong><br>
	 * Date Author Version Description<br>
	 * ---------------------------------------------------------<br>
	 * 2012-4-17 huaiduo v1.0.0 修改原因<br>
	 */
	public IBOSecOperatorValue getOperatorInfoByOpId(long operatorId)
			throws Exception;

	/**
	 * @Function getSecOperatorsByName
	 * @Description
	 * 
	 * @param organizeName
	 * @return
	 * @throws Exception
	 * 
	 * @version v1.0.0
	 * @author mofangrui
	 * @date 2012-5-25 下午05:24:03
	 * 
	 * <strong>Modification History:</strong><br>
	 * Date Author Version Description<br>
	 * ---------------------------------------------------------<br>
	 * 2012-5-25 mofangrui v1.0.0 修改原因<br>
	 */
	public IBOSecOrganizeValue[] getSecOperatorsByName(String organizeName)
			throws Exception;

	/**
	 * 
	 * @Function getChildOrgs
	 * @Description 新增大客户的组织，下属组织
	 * 
	 * @param organizeId
	 * @param isUseFlag
	 * @param domainId
	 * @return
	 * @throws Exception
	 * 
	 * @version v1.0.0
	 * @author qianmx
	 * @date Jun 20, 2012 2:59:36 PM
	 * 
	 * <strong>Modification History:</strong><br>
	 * Date Author Version Description<br>
	 * ---------------------------------------------------------<br>
	 * Jun 20, 2012 qianmx v1.0.0 修改原因<br>
	 */
	public IBOSecOrganizeValue[] getChildOrgs(long organizeId, boolean isUseFlag)
			throws Exception;

	/**
	 * 
	 * @Function getAmsByCond
	 * @Description 查询客户经理信息
	 * 
	 * @param staffId
	 * @param staffName
	 * @param orgName
	 * @return
	 * @throws Exception
	 * @version v1.0.0
	 * @author kangzk
	 * @date Jun 20, 2012 2:59:36 PM
	 * 
	 * <strong>Modification History:</strong><br>
	 * Date Author Version Description<br>
	 * ---------------------------------------------------------<br>
	 * Jun 20, 2012 kangzk v1.0.0 修改原因<br>
	 */
	public IQBOSecCustManagerValue[] getAmsByCond(String code,
			String staffName, String orgName, int start, int end)
			throws Exception;

	/**
	 * 
	 * @Function getAmsCountByCond
	 * @Description 查询客户经理信息
	 * 
	 * @param staffId
	 * @param staffName
	 * @param orgName
	 * @return
	 * @throws Exception
	 * @version v1.0.0
	 * @author kangzk
	 * @date Jun 20, 2012 2:59:36 PM
	 * 
	 * <strong>Modification History:</strong><br>
	 * Date Author Version Description<br>
	 * ---------------------------------------------------------<br>
	 * Jun 20, 2012 kangzk v1.0.0 修改原因<br>
	 */
	public int getAmsCountByCond(String code, String staffName, String orgName)
			throws Exception;

	/**
	 * 
	 * @Function getAmsCountByCond
	 * @Description 查询客户经理信息
	 * 
	 * @param staffId
	 * @param staffName
	 * @param orgName
	 * @return
	 * @throws Exception
	 * @version v1.0.0
	 * @author kangzk
	 * @date Jun 20, 2012 2:59:36 PM
	 * 
	 * <strong>Modification History:</strong><br>
	 * Date Author Version Description<br>
	 * ---------------------------------------------------------<br>
	 * Jun 20, 2012 kangzk v1.0.0 修改原因<br>
	 */
	public int getAmsCountByCond(long staffId, String staffName, String orgName)
			throws Exception;

	/**
	 * 
	 * @Function getAmsByCond
	 * @Description 查询客户经理信息
	 * 
	 * @param staffId
	 * @param staffName
	 * @param orgName
	 * @return
	 * @throws Exception
	 * @version v1.0.0
	 * @author kangzk
	 * @date Jun 20, 2012 2:59:36 PM
	 * 
	 * <strong>Modification History:</strong><br>
	 * Date Author Version Description<br>
	 * ---------------------------------------------------------<br>
	 * Jun 20, 2012 kangzk v1.0.0 修改原因<br>
	 */
	public IQBOSecCustManagerValue[] getAmsByCond(long staffId,
			String staffName, String orgName, int start, int end)
			throws Exception;

	/**
	 * 
	 * @Function queryCustManager
	 * @Description 查询客户经理信息
	 * 
	 * @param code
	 * @param staffName
	 * @param orgName
	 * @param districtId
	 * @param countyId
	 * @param ownerArea
	 * @param billId
	 * @return
	 * @throws Exception
	 * @version v1.0.0
	 * @author kangzk
	 * @date Jun 20, 2012 2:59:36 PM
	 * 
	 * <strong>Modification History:</strong><br>
	 * Date Author Version Description<br>
	 * ---------------------------------------------------------<br>
	 * Jun 20, 2012 kangzk v1.0.0 修改原因<br>
	 */
	public IQBOSecCustManagerValue[] queryCustManager(String code,
			String staffName, String orgName, String districtId,
			String countyId, String ownerArea, String billId, int start, int end)
			throws Exception;

	/**
	 * 
	 * @Function queryCustManagerCond
	 * @Description 查询客户经理信息
	 * 
	 * @param code
	 * @param staffName
	 * @param orgName
	 * @param districtId
	 * @param countyId
	 * @param ownerArea
	 * @param billId
	 * @return
	 * @throws Exception
	 * @version v1.0.0
	 * @author kangzk
	 * @date Jun 20, 2012 2:59:36 PM
	 * 
	 * <strong>Modification History:</strong><br>
	 * Date Author Version Description<br>
	 * ---------------------------------------------------------<br>
	 * Jun 20, 2012 kangzk v1.0.0 修改原因<br>
	 */
	public int queryCustManagerCond(String code, String staffName,
			String orgName, String districtId, String countyId,
			String ownerArea, String billId) throws Exception;

	/**
	 * 
	 * @Function querySecOrgCount
	 * @Description 查询组织对象总行数
	 * 
	 * @param orgId
	 * @param orgName
	 * @return
	 * @throws Exception
	 * @version v1.0.0
	 * @author kangzk
	 * @date Jun 20, 2012 2:59:36 PM
	 * 
	 * <strong>Modification History:</strong><br>
	 * Date Author Version Description<br>
	 * ---------------------------------------------------------<br>
	 * Jun 20, 2012 kangzk v1.0.0 修改原因<br>
	 */
	public int querySecOrgCount(long orgId, String orgName,String districtId,String countyId,String ownerArea) throws Exception;

	/**
	 * 
	 * @Function querySecOrg
	 * @Description 查询组织对象
	 * 
	 * @param orgId
	 * @param orgName
	 * @return
	 * @throws Exception
	 * @version v1.0.0
	 * @author kangzk
	 * @date Jun 20, 2012 2:59:36 PM
	 * 
	 * <strong>Modification History:</strong><br>
	 * Date Author Version Description<br>
	 * ---------------------------------------------------------<br>
	 * Jun 20, 2012 kangzk v1.0.0 修改原因<br>
	 */
	public DataContainer[] querySecOrg(long orgId, String orgName,String districtId,String countyId,String ownerArea, int start,
			int end) throws Exception;

	/**
	 * 
	 * @Function getPmsCountByCond
	 * @Description 查询电话经理总行数
	 * 
	 * @param staffId
	 * @param staffName
	 * @param orgName
	 * @return
	 * @throws Exception
	 * @version v1.0.0
	 * @author kangzk
	 * @date Jun 20, 2012 2:59:36 PM
	 * 
	 * <strong>Modification History:</strong><br>
	 * Date Author Version Description<br>
	 * ---------------------------------------------------------<br>
	 * Jun 20, 2012 kangzk v1.0.0 修改原因<br>
	 */
	public int getPmsCountByCond(String code, String staffName, String orgName)
			throws Exception;

	/**
	 * 
	 * @Function getPmsByCond
	 * @Description 查询电话经理信息
	 * 
	 * @param staffId
	 * @param staffName
	 * @param orgName
	 * @return
	 * @throws Exception
	 * @version v1.0.0
	 * @author kangzk
	 * @date Jun 20, 2012 2:59:36 PM
	 * 
	 * <strong>Modification History:</strong><br>
	 * Date Author Version Description<br>
	 * ---------------------------------------------------------<br>
	 * Jun 20, 2012 kangzk v1.0.0 修改原因<br>
	 */
	public IQBOSecCustManagerValue[] getPmsByCond(String code,
			String staffName, String orgName, int start, int end)
			throws Exception;

	/**
	 * 
	 * @Function getEffectAmInfo
	 * @Description 查询客户经理对象
	 * 
	 * @param managerId
	 * @return
	 * @throws Exception
	 * @version v1.0.0
	 * @author kangzk
	 * @date Jun 20, 2012 2:59:36 PM
	 * 
	 * <strong>Modification History:</strong><br>
	 * Date Author Version Description<br>
	 * ---------------------------------------------------------<br>
	 * Jun 20, 2012 kangzk v1.0.0 修改原因<br>
	 */
	public IQBOSecCustManagerValue getEffectAmInfo(long managerId,
			int managerType) throws Exception;

	/**
	 * 
	 * @Function getPlayersByCode
	 * @Description 查询角色对象
	 * 
	 * @param managerId
	 * @return
	 * @throws Exception
	 * @version v1.0.0
	 * @author kangzk
	 * @date Jun 20, 2012 2:59:36 PM
	 * 
	 * <strong>Modification History:</strong><br>
	 * Date Author Version Description<br>
	 * ---------------------------------------------------------<br>
	 * Jun 20, 2012 kangzk v1.0.0 修改原因<br>
	 */
	public IBOSecPlayerValue[] getPlayersByCode(String code) throws Exception;

	/**
	 * 
	 * @Function getOwerareaByParentIdAndType
	 * @Description 根据上级类型和编码查询下级数据对象
	 * 
	 * @param parentId
	 * @param type
	 * @return
	 * @throws Exception
	 * @version v1.0.0
	 * @author kangzk
	 * @date Jun 20, 2012 2:59:36 PM
	 * 
	 * <strong>Modification History:</strong><br>
	 * Date Author Version Description<br>
	 * ---------------------------------------------------------<br>
	 * Jun 20, 2012 kangzk v1.0.0 修改原因<br>
	 */
//	public IBOSecOwerareaValue[] getOwerareaByParentIdAndType(String parentId,
//			int type) throws Exception;

	/**
	 * 
	 * @Function getDisTrictValues
	 * @Description key值 ：DISTRICTID 对应region_id IS_PROVINCE_CODE 为true 表示省级工号
	 *              COUNTYID 对应 区县id IS_REGION_CODE 为true表示地市级工号。
	 * 
	 * @param parentId
	 * @param type
	 * @return
	 * @throws Exception
	 * @version v1.0.0
	 * @author kangzk
	 * @date Jun 20, 2012 2:59:36 PM
	 * 
	 * <strong>Modification History:</strong><br>
	 * Date Author Version Description<br>
	 * ---------------------------------------------------------<br>
	 * Jun 20, 2012 kangzk v1.0.0 修改原因<br>
	 */
	public Map getDisTrictValues(long opId) throws Exception;

	/**
	 * 根据regionid查询名称
	 * 
	 * @param regionid
	 * @return
	 * @throws Exception
	 */
	public BOBsDistrictBean getDistrictByRegionId(String regionid)
			throws Exception;

	/**
	 * 查询客户经理信息
	 * 
	 * @param billId
	 *            客户经理手机
	 * @param managerType
	 *            客户经理类型：3集团客户经理；5电话客户经理
	 * @param managerName
	 *            客户经理姓名
	 * @param districtId
	 *            客户经理所属地市
	 * @param countyId
	 *            客户经理所属区县
	 * @param managerId[]
	 *            客户经理ID数组，主要是来查询电话经理组下的电话经理信息
	 * @param staffId
	 *            员工ID
	 * @param orgId
	 *            所属组织ID
	 * @param code
	 * 			  登录工号
	 * @param start
	 *            开始记录数
	 * @param end
	 *            结束记录数
	 * @return
	 * @throws Exception
	 */
	public IQBOSecCustManagerValue[] getCustManager(String billId,
			int managerType, String managerName, String districtId,
			String countyId, long[] managerId, long staffId, long orgId,String code,
			int start, int end) throws Exception;

	/**
	 * 查询客户经理数量
	 * 
	 * 参数同上一个接口
	 * @param billId
	 * @param managerType
	 * @param managerName
	 * @param districtId
	 * @param countyId
	 * @param managerId
	 * @param staffId
	 * @param orgId
	 * @param code
	 * @return
	 * @throws Exception
	 */
	public int getCustManagerCount(String billId, int managerType,
			String managerName, String districtId, String countyId,
			long[] managerId, long staffId, long orgId,String code) throws Exception;
	
	/**
	 * 根据工号和实体编码，返回工号是否有这个实体权限
	 * 
	 * @param operId 登录工号
	 * @param entId  
	 * @return
	 * @throws Exception
	 */
	public boolean queryExistsEntId(long operId,long entId)throws Exception;
	
	/**
	 * 根据operId获取员工信息
	 * 
	 * @param operId
	 * @return
	 * @throws Exception
	 */
	public IQBOSecOrgStaffOperValue getOperQBOByOperId(long operId) throws Exception;
	
	/**
	 * 根据客户经理组ID查询客户经理
	 * @param orgId
	 * @param start
	 * @param end
	 * @return
	 * @throws Exception
	 */
	public IQBOSecCustManagerValue[] queryCustManagerByOrgId(long orgId, int start, int end) throws Exception;
	
	/**
	 * 根据客户经理组ID查询客户经理
	 * @param orgId
	 * @return
	 * @throws Exception
	 */
	public int queryCustManagerByOrgIdCount(long orgId) throws Exception;
	
}
