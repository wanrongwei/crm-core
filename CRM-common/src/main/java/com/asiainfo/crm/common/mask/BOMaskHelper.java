package com.asiainfo.crm.common.mask;

import com.ai.appframe2.bo.BOMaskFactory;
import com.ai.appframe2.bo.DataContainer;
import com.ai.appframe2.bo.IBOMask;
import com.ai.appframe2.bo.ObjectTypeNull;
import com.ai.appframe2.common.DataContainerInterface;
import com.ai.appframe2.common.ObjectType;
import com.ai.appframe2.common.ServiceManager;
import com.ai.appframe2.privilege.UserInfoInterface;
import org.apache.commons.lang.ClassUtils;
import org.apache.commons.lang.StringUtils;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import java.util.HashMap;
import java.util.Iterator;

/**   
 * BO模糊化助手类
 * 
 * @Copyright Copyright (c) 2012 Asiainfo-Linkage
 * 
 * @ClassName 
 * @Description 该类的功能描述
 *
 * @version v1.0.0
 * @author huzq
 * @date 2012-6-27 下午11:55:45
 * <br>
 * Modification History:<br>
 * Date         Author          Version            Description<br>
 * ---------------------------------------------------------*<br>
 * 2012-6-27     huzq           v1.0.0               修改原因<br>
 */
public class BOMaskHelper {
	private static final String MASK_FLAG = "MASK_FLAG";
	private static final transient Log log = LogFactory.getLog(BOMaskHelper.class);

	/**   
	 * 设置当前操作不需要模糊化，用于操作开始前<br>
	 * 调用了该方法当处理完业务之后必须要调用清除模糊化标记{@link #clearOperateMaskFlag()},避免会对下次判断产生影响！
	 * @Function setOperateNotMaskFlag
	 * @Description 
	 *
	 *
	 * @version v1.0.0
	 * @author huzq
	 * @date 2012-6-27 下午11:55:05
	 * 
	 * <strong>Modification History:</strong><br>
	 * Date         Author          Version            Description<br>
	 * ---------------------------------------------------------<br>
	 * 2012-6-27     huzq           v1.0.0               修改原因<br>
	 */
	public static void setOperateNotMaskFlag() {
		try {
			if (log.isDebugEnabled()) {
				log.debug("set not mask flag...");
			}
			UserInfoInterface userInfo = ServiceManager.getUser();
			if (userInfo != null) {
				userInfo.set(MASK_FLAG, "0");
			}
		} catch (Exception ex) {
			if (log.isErrorEnabled()) {
				log.error(" set mask flag error!", ex);
			}
		}
	}
	
	/**   
	 * @Function setOperateMaskFlag
	 * @Description 设置模糊化
	 *
	 *
	 * @version v1.0.0
	 * @author shitian
	 * @date Nov 1, 2012 2:29:19 PM
	 * 
	 * <strong>Modification History:</strong><br>
	 * Date         Author          Version            Description<br>
	 * ---------------------------------------------------------<br>
	 * Nov 1, 2012     shitian           v1.0.0               修改原因<br>
	 */
	public static void setOperateMaskFlag() {
		try {
			if (log.isDebugEnabled()) {
				log.debug("set not mask flag...");
			}
			UserInfoInterface userInfo = ServiceManager.getUser();
			if (userInfo != null) {
				userInfo.set(MASK_FLAG, "1");
			}
		} catch (Exception ex) {
			if (log.isErrorEnabled()) {
				log.error(" set mask flag error!", ex);
			}
		}
	}

	/**   
	 * 操作完成后，清除模糊化标记<br>
	 * 与方法{@link #setOperateNotMaskFlag()}配套使用。
	 * 
	 * @Function clearOperateMaskFlag
	 * @Description 
	 *
	 *
	 * @version v1.0.0
	 * @author huzq
	 * @date 2012-6-27 下午11:55:26
	 * 
	 * <strong>Modification History:</strong><br>
	 * Date         Author          Version            Description<br>
	 * ---------------------------------------------------------<br>
	 * 2012-6-27     huzq           v1.0.0               修改原因<br>
	 */
	public static void clearOperateMaskFlag() {
		try {
			if (log.isDebugEnabled()) {
				log.debug("clear mask flag...");
			}
			UserInfoInterface userInfo = ServiceManager.getUser();
			if (userInfo != null) {
				userInfo.getAttrs().remove(MASK_FLAG);
			}
		} catch (Exception ex) {
			if (log.isErrorEnabled()) {
				log.error(" clear mask flag error!", ex);
			}
		}
	}

	/**   
	 * 单独提供整个数据集模糊化方法,用于业务主动模糊化
	 * 
	 * @Function mask
	 * @Description 
	 *
	 * @param dc
	 *
	 * @version v1.0.0
	 * @author huzq
	 * @date 2012-6-27 下午9:00:36
	 * 
	 * <strong>Modification History:</strong><br>
	 * Date         Author          Version            Description<br>
	 * ---------------------------------------------------------<br>
	 * 2012-6-27     huzq           v1.0.0               修改原因<br>
	 */
	public static void mask(DataContainerInterface dc) {
		try {
			// 如果
			if (dc == null) {
				if (log.isInfoEnabled()) {
					log.info("The dc is empty!");
				}
				return;
			}
			// 如果dc不是具体的BOBean则跳过
			if (dc.getObjectType() instanceof ObjectTypeNull) {
				if (log.isInfoEnabled()) {
					log.info("The dc is not a certain BO!");
				}
				return;
			}
			String boName = dc.getTypeName();
			// 如果当前系统配置需要对该类型dc做模糊化处理则调用模糊化处理方法
			if (BOMaskFactory.isNeedMask(boName)) {
				// 对单个DataContainer进行模糊化
				maskOneDataContainer(dc, boName);
			}
		} catch (Exception e) {
			if (log.isErrorEnabled()) {
				log.error("special mask error!", e);
			}
		}
	}

	/**   
	 * 批量模糊化数据容器
	 * 
	 * @Function mask
	 * @Description 
	 *
	 * @param dcs
	 *
	 * @version v1.0.0
	 * @author huzq
	 * @date 2012-6-28 下午4:55:09
	 * 
	 * <strong>Modification History:</strong><br>
	 * Date         Author          Version            Description<br>
	 * ---------------------------------------------------------<br>
	 * 2012-6-28     huzq           v1.0.0               修改原因<br>
	 */
	public static void mask(DataContainerInterface[] dcs) {
		try {
			// 如果容器数组为空跳过
			if (dcs == null) {
				if (log.isInfoEnabled()) {
					log.info("The Parameter dcs is null OR empty!");
				}
				return;
			}
			// 默认取第一个的类型
			if (dcs[0].getObjectType() instanceof ObjectTypeNull) {
				if (log.isInfoEnabled()) {
					log.info("The dc is not a certain BO!");
				}
				return;
			}
			String boName = dcs[0].getTypeName();

			// 如果该bo不需要模糊化则跳过
			if (!BOMaskFactory.isNeedMask(boName)) {
				return;
			}
			// 如果需要模糊化则进行模糊化处理
			for (int i = 0, count = dcs.length; i < count; i++) {
				DataContainerInterface dc = dcs[i];
				// 跳过空数据容器
				if (dc == null) {
					continue;
				}
				// 对单个DataContainer进行模糊化
				maskOneDataContainer(dc, boName);
			}
		} catch (Exception e) {
			if (log.isErrorEnabled()) {
				log.error("special mask error!", e);
			}
		}
	}

	/**   
	 * 批量模糊化
	 * 
	 * @Function mask
	 * @Description 
	 *
	 * @param dcs
	 * @param boBeanClass
	 *
	 * @version v1.0.0
	 * @author huzq
	 * @date 2012-6-28 下午5:21:59
	 * 
	 * <strong>Modification History:</strong><br>
	 * Date         Author          Version            Description<br>
	 * ---------------------------------------------------------<br>
	 * 2012-6-28     huzq           v1.0.0               修改原因<br>
	 */
	public static void mask(DataContainerInterface[] dcs, Class boBeanClass) {
		try {
			// 如果容器数组为空跳过
			if (dcs == null) {
				if (log.isInfoEnabled()) {
					log.info("The DataContainers are null!");
				}
				return;
			}
			// 如果对象的对象类是ObjectTypeNull，则判断参数中的boBeanClass是否为空，如果为空则跳过；否则设置dc的ObjectType。
			String boName = null;
			if (!(dcs[0].getObjectType() instanceof ObjectTypeNull)) {
				boName = dcs[0].getTypeName();
			} else {
				// boBeanClass为空跳过
				if (boBeanClass == null) {
					if (log.isInfoEnabled()) {
						log.info("The boBeanClass is null!");
					}
					return;
				}
				// 非DataContainer的子类，跳过
				if (!ClassUtils.isAssignable(boBeanClass, DataContainer.class)) {
					if (log.isInfoEnabled()) {
						log.info("The boBeanClass is not a subclass of DataContainer!");
					}
					return;
				}
				ObjectType objectType = ServiceManager.getObjectTypeFactory().getObjectTypeByClass(boBeanClass);
				if (objectType instanceof ObjectTypeNull) {
					return;
				}
				// 将传入的DC都塞上类型
				for (int i = 0; i < dcs.length; i++) {
					dcs[i].setObjectType(objectType);
				}
				boName = objectType.getFullName();
			}
			// 如果不需要模糊化，跳过
			if (!BOMaskFactory.isNeedMask(boName)) {
				return;
			}
			for (int i = 0, count = dcs.length; i < count; i++) {
				DataContainerInterface dc = dcs[i];
				// 跳过空数据容器
				if (dc == null) {
					continue;
				}
				// 对单个DataContainer进行模糊化
				maskOneDataContainer(dc, boName);
			}
		} catch (Exception e) {
			if (log.isErrorEnabled()) {
				log.error("special mask error!", e);
			}
		}
	}

	/**   
	 * 单独提供整个数据集模糊化方法,用于业务主动模糊化，主要是针对普通的DataContainer进行模糊化。模糊化普通DataContainer需要指定DataContainer的ObjectType。
	 * 
	 * @Function mask
	 * @Description 
	 *
	 * @param dc 需要模糊化的数据容器
	 * @param boBeanClass 指定的BOBean的类型
	 *
	 * @version v1.0.0
	 * @author huzq
	 * @date 2012-6-28 下午4:47:04
	 * 
	 * <strong>Modification History:</strong><br>
	 * Date         Author          Version            Description<br>
	 * ---------------------------------------------------------<br>
	 * 2012-6-28     huzq           v1.0.0               修改原因<br>
	 */
	public static void mask(DataContainerInterface dc, Class boBeanClass) {
		// 跳过空数据容器
		if (dc == null) {
			return;
		}
		try {
			String boName = null;
			// 如果对象的对象类是ObjectTypeNull，则判断参数中的boBeanClass是否为空，如果为空则跳过；否则设置dc的ObjectType。
			if (!(dc.getObjectType() instanceof ObjectTypeNull)) {
				boName = dc.getTypeName();
			} else {
				// boBeanClass为空跳过
				if (boBeanClass == null) {
					if (log.isInfoEnabled()) {
						log.info("The boBeanClass is null!");
					}
					return;
				}
				// 非DataContainer的子类，跳过
				if (!ClassUtils.isAssignable(boBeanClass, DataContainer.class)) {
					if (log.isInfoEnabled()) {
						log.info("The boBeanClass is not a subclass of DataContainer!");
					}
					return;
				}
				ObjectType objectType = ServiceManager.getObjectTypeFactory().getObjectTypeByClass(boBeanClass);
				// 如果对象的对象类是ObjectTypeNull，则判断参数中的boBeanClass是否为空，如果为空则跳过；否则设置dc的ObjectType。
				if (objectType instanceof ObjectTypeNull) {
					return;
				}
				dc.setObjectType(objectType);
				boName = objectType.getFullName();
			}
			if (BOMaskFactory.isNeedMask(boName)) {
				// 对单个DataContainer进行模糊化
				maskOneDataContainer(dc, boName);
			}
		} catch (Exception e) {
			if (log.isErrorEnabled()) {
				log.error("special mask error!", e);
			}
		}
	}

	/**   
	 * 模糊化单个DataContainer
	 * @Function maskOneDataContainer
	 * @Description 
	 *
	 * @param dc
	 * @param boName
	 * @throws Exception
	 *
	 * @version v1.0.0
	 * @author huzq
	 * @date 2012-6-28 下午5:24:16
	 * 
	 * <strong>Modification History:</strong><br>
	 * Date         Author          Version            Description<br>
	 * ---------------------------------------------------------<br>
	 * 2012-6-28     huzq           v1.0.0               修改原因<br>
	 */
	private static void maskOneDataContainer(DataContainerInterface dc, String boName) throws Exception {
		HashMap map = dc.getProperties();
		for (Iterator it = map.keySet().iterator(); it.hasNext();) {
			String colName = (String) it.next();
			IBOMask objIBOMask = BOMaskFactory.getBOMask(boName, colName);
			if (objIBOMask != null) {
				Object initValue = dc.get(colName);
				UserInfoInterface userInter=ServiceManager.getUser();
				if (userInter!=null && userInter.get(MASK_FLAG)!=null) {
					String flag = String.valueOf(ServiceManager.getUser().get(MASK_FLAG));
					//如果设置了模糊化，才模糊
					if (StringUtils.isNotBlank(flag) && "1".equals(flag)) {
						// 如果已经做过模糊化，则不做了
						if (initValue != null && initValue.toString().indexOf("*") > -1) {
							continue;
						}
						// bo数据的模糊化
						Object maskedBOAttrValue = objIBOMask.maskBOAttr(ServiceManager.getUser(), dc, initValue);
						if (log.isDebugEnabled()) {
							log.debug("bo:" + boName + ",attr:" + colName + ",initValue=" + initValue + ",maskValue=" + maskedBOAttrValue);
						}
						if (maskedBOAttrValue != null) {
							// 初始化字段值,模糊化
							dc.initPropertyNoUpperCase(colName, initValue, maskedBOAttrValue);
						}
					}
				}
			}
		}
	}
}
