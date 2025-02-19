package com.asiainfo.crm.cm.support.bce.service.impl;

import java.util.Iterator;
import java.util.Map;

import com.ai.appframe2.common.DataContainerInterface;
import com.ai.appframe2.common.DataType;
import com.ai.bce.ivalues.IBceData;
import com.ai.bce.ivalues.INodeData;
import com.ai.bce.ivalues.INodeXmlData;
import com.ai.bce.ivalues.ISubmitData;
import com.ai.bce.service.interfaces.IBceDataParser;
import com.ai.bce.valuebean.BceDataBean;
import com.asiainfo.crm.cm.common.util.CmCommonUtil;

public class CmBceDataParserImpl implements IBceDataParser {

	public IBceData dataParse(ISubmitData[] submitDatas, Map sessionMap) throws Exception {
		return parse(null, submitDatas[0], sessionMap);
	}

	private IBceData parse(IBceData parent, ISubmitData submitData, Map sessionMap) throws Exception {
		if (submitData == null) {
			return null;
		}
		IBceData bceData = new BceDataBean();
		if (parent != null) {
			parent.addSubData(bceData);
		}
		INodeData[] nodeInfos = submitData.getNodeDatas();
		if (nodeInfos != null && nodeInfos.length > 0) {
			for (int j = 0; j < nodeInfos.length; j++) {
				String[][] userDatas = nodeInfos[j].getUserDatas();
				INodeXmlData[] dataInfo = nodeInfos[j].getNodeXmlDatas();
				ISubmitData[] childSubmitData = nodeInfos[j].getChildSubmitData();

				if (userDatas != null && userDatas.length > 0) {
					for (int i = 0; i < userDatas.length; i++) {
						bceData.addUserData(userDatas[i][0], userDatas[i][1]);
					}
				}
				if (dataInfo != null && dataInfo.length > 0) {
					for (int i = 0; i < dataInfo.length; i++) {
						DataContainerInterface[] dcs = dataInfo[i].getDataContainers();
						if (dcs == null || dcs.length == 0) {
							continue;
						}
						String name = dataInfo[i].getName();
						bceData.addNormalRowsetInfo(name, dcs);
					}
				}
				// 增加对通过URL传参进来的数据
				if (CmCommonUtil.isNotEmptyObject(sessionMap)) {
					Iterator it = sessionMap.entrySet().iterator();
					while (it.hasNext()) {
						Map.Entry entry = (Map.Entry) it.next();
						bceData.addUserData(DataType.getAsString(entry.getKey()), DataType.getAsString(entry.getValue()));
					}
				}
				if (childSubmitData != null && childSubmitData.length > 0) {
					for (int i = 0; i < childSubmitData.length; i++) {
						parse(bceData, childSubmitData[i], sessionMap);
					}
				}
			}
		}
		return bceData;
	}

}
