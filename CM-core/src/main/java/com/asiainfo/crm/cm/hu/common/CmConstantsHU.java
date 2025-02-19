package com.asiainfo.crm.cm.hu.common;

public class CmConstantsHU {

	/**   
	 * @Copyright Copyright (c) 2015 Asiainfo-Linkage
	 * 
	 * @ClassName CmConstantsHU
	 * @Description 联系人类型
	 *
	 * @version v1.0.0
	 * @author Administrator
	 * @date 2015-12-30 下午2:20:04
	 * <br>
	 * Modification History:<br>
	 * Date         Author          Version            Description<br>
	 * ---------------------------------------------------------*<br>
	 * 2015-12-30     shitian           v1.0.0               修改原因<br>
	 */
	public interface CONT_TYPE {

		public static final int INDIV_LEGAL_DELEGATE = 0;
		
		public static final int INDIV_CTN_CONTACT = 1;
		
		public static final int INDIV_CUSTOMER = 2;
		
		public static final int INDIV_CONTACT_PERSON = 3;
	}
	
	/**   
	 * @Copyright Copyright (c) 2015 Asiainfo-Linkage
	 * 
	 * @ClassName CmConstantsHU
	 * @Description permission的类型
	 *
	 * @version v1.0.0
	 * @author Administrator
	 * @date 2015-12-30 下午2:20:35
	 * <br>
	 * Modification History:<br>
	 * Date         Author          Version            Description<br>
	 * ---------------------------------------------------------*<br>
	 * 2015-12-30     shitian           v1.0.0               修改原因<br>
	 */
	public interface PERMISSION_TYPE {

		public static final int INDIVIDUAL = 1;
		
		public static final int CONTACT = 3;
		
		public static final int GROUP = 2;
	}
	/**   
	 * @Copyright Copyright (c) 2015 Asiainfo-Linkage
	 * 
	 * @ClassName CmConstantsHU
	 * @Description 用于判断是否有权限
	 *
	 * @version v1.0.0
	 * @author Administrator
	 * @date 2015-01-11 下午2:20:35
	 * <br>
	 * Modification History:<br>
	 * Date         Author          Version            Description<br>
	 * ---------------------------------------------------------*<br>
	 * 2015-01-11     huangqun          v1.0.0               修改原因<br>
	 */
	public interface CONTROL_CUST_CERT_CODE{
		// entity_id
		public static final long ent_id = 30000032;
		// priv_id
		public static final long priv_id = 30000000;
	}
}
