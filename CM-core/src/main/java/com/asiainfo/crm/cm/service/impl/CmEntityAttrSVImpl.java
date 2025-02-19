package com.asiainfo.crm.cm.service.impl;

import java.util.Map;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import com.ai.appframe2.bo.DataContainer;
import com.ai.appframe2.common.DataContainerInterface;
import com.ai.common.i18n.CrmLocaleFactory;
import com.ai.common.util.ExceptionUtil;
import com.asiainfo.crm.cm.busimodel.IDealBusiModel;
import com.asiainfo.crm.cm.busimodel.common.ParamUtil;
import com.asiainfo.crm.cm.busimodel.common.Parameter;
import com.asiainfo.crm.cm.busimodel.impl.common.AbstractEntityAttrDealBusiModelImpl;
import com.asiainfo.crm.cm.common.CmServiceFactory;
import com.asiainfo.crm.cm.common.util.CmCommonUtil;
import com.asiainfo.crm.cm.inner.util.CmInnerServiceFactory;
import com.asiainfo.crm.cm.model.bean.ValueObjectBean;
import com.asiainfo.crm.cm.model.ivalues.IValueObject;
import com.asiainfo.crm.cm.service.interfaces.ICmEntityAttrSV;

/** 
 * @Copyright Copyright (c) 2012 Asiainfo-Linkage
 * @ClassName 
 * @Description 该类的功能描述
 * @version v1.0.0
 * @author huzq2
 * @date 2012-4-19 下午1:09:46
 * <br>
 * Modification History:<br>
 * Date         Author          Version            Description<br>
 * ---------------------------------------------------------*<br>
 * 2012-4-19     huzq2           v1.0.0               修改原因<br>
 */
public class CmEntityAttrSVImpl implements ICmEntityAttrSV {

	private transient static Log log = LogFactory.getLog(CmEntityAttrSVImpl.class);

	public void saveEntityAttrValues(DataContainerInterface[] attrValues, Map userObject) throws Exception {
		IDealBusiModel busiModel = (IDealBusiModel) CmServiceFactory.getBusiMode(AbstractEntityAttrDealBusiModelImpl.class);
		IValueObject valueObject = new ValueObjectBean() {

			public long getId() {
				return 0;
			}
		};
		valueObject.addAttrValues(attrValues);
		valueObject.addUserMap(userObject);
		busiModel.deal(valueObject);
	}

	public DataContainerInterface[] getEntityAttrValues(Class claz, String condition, Map parameter, int startNum, int endNum) throws Exception {
		return CmInnerServiceFactory.getCommonInnerSV().getBeans(claz, condition, parameter, startNum, endNum);
	}

	public DataContainerInterface[] getEntityAttrValues(DataContainerInterface sample, int startNum, int endNum) throws Exception {
		if (!"table".equalsIgnoreCase(sample.getObjectType().getMapingEntyType())) {
			// 输入参数不合法！
			if (log.isErrorEnabled()) {
				log.error(CrmLocaleFactory.getResource("CMS0000073"));
			}
			ExceptionUtil.throwBusinessException("CMS0000073");
		}
		if (!CmCommonUtil.isNotEmptyObject(sample.getProperties())) {
			// 参数错误，参数{0}不能为空！
			if (log.isErrorEnabled()) {
				log.error(CrmLocaleFactory.getResource("CMS0022001"));
			}
			ExceptionUtil.throwBusinessException("CMS0022001");
		}
		Parameter parameter = ParamUtil.buildParameter(new DataContainer[] { (DataContainer) sample });
		return CmInnerServiceFactory.getCommonInnerSV().getBeans(sample.getClass(), parameter.getCondition(), parameter.getParameter(), startNum, endNum);
	}
}
