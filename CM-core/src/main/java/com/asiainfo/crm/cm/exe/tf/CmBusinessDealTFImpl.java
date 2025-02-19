package com.asiainfo.crm.cm.exe.tf;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import com.ai.appframe2.common.DataType;
import com.ai.common.util.ExceptionUtil;
import com.asiainfo.appframe.ext.exeframe.tf.interfaces.IAdvanceTransform;
import com.asiainfo.crm.cm.common.util.CmCommonUtil;
import com.asiainfo.crm.cm.exe.tf.bo.BOCmPsBusiRecBean;
import com.asiainfo.crm.cm.exe.tf.business.ICmTransformDealService;
import com.asiainfo.crm.cm.exe.tf.ivalues.IBOCmPsBusiRecValue;
import com.asiainfo.crm.cm.exe.tf.util.CmTransformDealServiceFactory;

public class CmBusinessDealTFImpl extends AbstractAdvanceTransformImpl implements IAdvanceTransform {

	private transient static Log log = LogFactory.getLog(CmBusinessDealTFImpl.class);
	
	public void transform(HashMap[] arg0) throws Exception {
		// 将Map转换为IBOCmPsBusiRecValue对象数组。
		IBOCmPsBusiRecValue[] values = this.convert(arg0);
		for (int i = 0; i < values.length; i++) {
			// 调用具体的处理服务。
			ICmTransformDealService service = CmTransformDealServiceFactory.getDealService(values[i].getBusinessId());
			if (service == null) {
				//未取到服务信息！
				log.error("CMS0010043");
				ExceptionUtil.throwBusinessException("CMS0010043");
			} else {
				service.deal(values[i].getRelObjectType(), values[i].getRelObjectId(), values[i].getBusinessId(), values[i].getRelObjectDetail());
			}
		}
	}

	/**   
	 * @Function convert
	 * @Description 将Map转换为IValue对象
	 *
	 * @param map
	 * @return
	 * @throws Exception
	 *
	 * @version v1.0.0
	 * @author huzq2
	 * @date 2012-2-24 下午2:59:09
	 * 
	 * <strong>Modification History:</strong><br>
	 * Date         Author          Version            Description<br>
	 * ---------------------------------------------------------<br>
	 * 2012-2-24     huzq2           v1.0.0               修改原因<br>
	 */
	private IBOCmPsBusiRecValue[] convert(HashMap[] map) throws Exception {
		if (CmCommonUtil.isNotEmptyObject(map)) {
			List resultList = new ArrayList();
			for (int i = 0; i < map.length; i++) {
				IBOCmPsBusiRecValue value = new BOCmPsBusiRecBean();
				String[] propertyNames = value.getPropertyNames();
				for (int j = 0; j < propertyNames.length; j++) {
					value.initProperty(propertyNames[j], DataType.transfer(map[i].get(propertyNames[j]), value.getPropertyType(propertyNames[j])));
				}
				resultList.add(value);
			}
			return (BOCmPsBusiRecBean[]) resultList.toArray(new BOCmPsBusiRecBean[0]);
		} else {
			return new BOCmPsBusiRecBean[0];
		}
	}
}
