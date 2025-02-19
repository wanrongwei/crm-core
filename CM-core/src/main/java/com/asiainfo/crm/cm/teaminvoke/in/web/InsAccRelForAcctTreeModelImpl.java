/**
 * 
 */
package com.asiainfo.crm.cm.teaminvoke.in.web;

import java.util.HashMap;

import javax.servlet.ServletRequest;

import com.ai.appframe2.complex.center.CenterFactory;
import com.ai.appframe2.web.HttpUtil;
import com.ai.appframe2.web.tag.dbtree.AIDBTreeNode;
import com.ai.appframe2.web.tag.dbtree.AIDBTreeNodeInterface;
import com.ai.appframe2.web.tag.dbtree.DBTreeNewDataModelInterface;
import com.ai.appframe2.web.tag.dbtree.QueryTreeDataInterface;
import com.ai.common.i18n.CrmLocaleFactory;
import com.asiainfo.crm.cm.common.CmServiceFactory;
import com.asiainfo.crm.cm.model.ivalues.ISoAccrelValue;

/**   
 * Copyright: Copyright (c) 2011 Asiainfo-Linkage
 * 
 * @ClassName: InsAccRelTreeModelImpl.java
 * @Description: 该类的功能描述
 *
 * @version: v1.0.0
 * @author: huzq2
 * @date: Jan 14, 2011 5:04:09 PM 
 *
 * Modification History:
 * Date         Author          Version            Description
 *---------------------------------------------------------*
 * Jan 14, 2011		huzq2           v1.0.0               修改原因
 */

public class InsAccRelForAcctTreeModelImpl implements DBTreeNewDataModelInterface, QueryTreeDataInterface {

	private long acctId = 0L;

	private String centerType = null;

	private String centerValue = null;

	public void getChildren(AIDBTreeNodeInterface pParentNode, int getChildDeep) throws Exception {
		// 设置中心信息
		CenterFactory.setCenterInfoByTypeAndValue(this.centerType, this.centerValue);
		ISoAccrelValue[] insAccrelValues = CmServiceFactory.getTeamInvokeSV().getSoAccrelsByAcctId(this.acctId, -1, -1, -1);
		if (null != insAccrelValues && insAccrelValues.length > 0) {
			int length = insAccrelValues.length;
			for (int i = 0; i < ((length < 10) ? length : 10); i++) {
				AIDBTreeNodeInterface treeNode = new AIDBTreeNode();
				ISoAccrelValue accrelValue = insAccrelValues[i];
				treeNode.setValue(accrelValue.getAcctRelaId() + "");
				treeNode.setLabel(accrelValue.getUserId() + "");
				treeNode.setLeaf(true);
				treeNode.setChecked(true);
				treeNode.setLeafPicUrl("/images/username.gif");
				pParentNode.addChild(treeNode);
			}
			if (length > 10) {
				AIDBTreeNodeInterface treeNode = new AIDBTreeNode();
				treeNode.setValue("-10");
				treeNode.setLabel("More...");
				treeNode.setLeaf(true);
				treeNode.setChecked(true);
				treeNode.setLeafPicUrl("/webframe/images/add.gif");
				pParentNode.addChild(treeNode);
			}
		}
	}

	public AIDBTreeNodeInterface getRootNode() {
		AIDBTreeNodeInterface treeNode = new AIDBTreeNode();
		treeNode.setValue(String.valueOf(this.acctId));
		treeNode.setLabel(CrmLocaleFactory.getResource("CMS0000130"));
		treeNode.setFoldClosePicUrl("/jsv2/analyse/fold_c.gif");
		treeNode.setFoldOpenPicUrl("/jsv2/analyse/fold_c.gif");
		return treeNode;
	}

	public void init(ServletRequest request) throws Exception {
		this.acctId = HttpUtil.getAsLong(request, "acctId");
		this.centerType = HttpUtil.getAsString(request, "CenterType");
		this.centerValue = HttpUtil.getAsString(request, "CenterValue");
	}

	public Object getTreeData(AIDBTreeNodeInterface parentNode, HashMap paramMap) throws Exception {
		return null;
	}

}
