package com.asiainfo.crm.cm.ln.common.util;

/**   
 * @Copyright Copyright (c) 2012 Asiainfo-Linkage
 * 
 * @ClassName 
 * @Description 权限实体
 *
 * @version v1.0.0
 * @author kangzk
 * @date Aug 25, 2012 2:57:12 PM
 * <br>
 * Modification History:<br>
 * Date         Author          Version            Description<br>
 * ---------------------------------------------------------*<br>
 * Aug 25, 2012     kangzk           v1.0.0               修改原因<br>
 */
public class CmLnEnter {

	public interface enterUserSpeuser {
		
		//操作权限编号
		public static final int PRIVID = 30000000;
		
		//校园权限实体
		public static final int SCAMPUS_ENTID = 30000000;
		
		//账户等级调整  调整等级为15级
		public static final int ACCOUNT_UP_ENTID = 30000001;
		
		//校园权限实体  调整等级为0级
		public static final int ACCOUNT_DROP_ENTID = 30000002;
		
		//申请关键人为A+级别
		public static final int SCAMPUS_APPLY_UP_ENTID = 30000003;
		
		//取消关键人A+级别
		public static final int SCAMPUS_APPLY_DROP_ENTID = 30000004;
		
		//关键人一级审核权限
		public static final int SCAMPUS_ONE_EXAMINE_ENTID = 30000005;
		
		//关键人二级审核权限
		public static final int SCAMPUS_TWO_EXAMINE_ENTID = 30000006;
		
		//加分项一级审核权限
		public static final int ADD_GRADE_ONE_ENTID = 30000007;
		
		//加分项二级审核权限
		public static final int ADD_GRADE_TWO_ENTID = 30000008;
		
		//级别变更审批权限
		public static final int GROUP_LEVEL_APPLY_ENTID = 30000009;
		
		//客户经理省级权限实体
		public static final int CUST_MANAGER_PROVINCE_ENTID = 30000010;
		
		//客户经理地市级权限实体
		public static final int CUST_MANAGER_REGION_ENTID = 30000011;
		
		//客户经理区县级权限实体
		public static final int CUST_MANAGER_COUNTY_ENTID = 30000012;
		
		//集团级别申请权限I级申请为C级权限
		public static final int GROUP_SERVICE_LEVEL_ENTID = 30000013;
		
		//特殊信誉等级申请一级审核权限
		public static final int CM_USER_SPEUSER_MAIN_ONE_LEVEL_ENTID = 30000014;
		
		//特殊信誉等级申请二级审核权限
		public static final int CM_USER_SPEUSER_MAIN_TWO_LEVEL_ENTID = 30000015;
		
		//指定危险信誉等级申请一级审核权限
		public static final int PERIL_CREDIT_ONE_LEVEL_ENTID = 30000016;
		
		//指定危险信誉等级申请二级审核权限
		public static final int PERIL_CREDIT_TWO_LEVEL_ENTID = 30000017;
		
		//第三方认定加分申请一级审核权限
		public static final int HOLD_ADD_SCORE_ONE_LEVEL_ENTID = 30000018;
		
		//第三方认定加分申请二级审核权限
		public static final int HOLD_ADD_SCORE_TWO_LEVEL_ENTID = 30000019;

		//修改账户信用等级0-14权限
		public static final int MODIFY_ACCT_CREDIT = 30000020;
		
		//批量操作时，可以查看个人相关的批量操作
		public static final int IS_INDIV_OP = 30000021;
		
		//批量操作时，可以查看集团相关的批量操作
		public static final int IS_GROUP_OP = 30000022;
		
		//账户银行合同号修改权限
		public static final int ACCOUNT_CONTRACT_NO = 30000023;
	}
	
}