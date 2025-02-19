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

public class InsAccRelForUserTreeModelImpl implements DBTreeNewDataModelInterface, QueryTreeDataInterface {

	private long userId = 0L;

	private String centerType = null;

	private String centerValue = null;

	public void getChildren(AIDBTreeNodeInterface pParentNode, int getChildDeep) throws Exception {
		if (userId > 0) {
			// 设置中心信息
			CenterFactory.setCenterInfoByTypeAndValue(this.centerType, this.centerValue);
			ISoAccrelValue[] insAccrelValues = CmServiceFactory.getTeamInvokeSV().getSoAccrelsByUserId(userId, -1, -1, -1);
			if (insAccrelValues != null && insAccrelValues.length > 0) {
				int count = insAccrelValues.length;
				// 最多只显示10
				count = (count > 10) ? 10 : count;
				for (int i = 0; i < count; i++) {
					ISoAccrelValue tempAccrelValue = insAccrelValues[i];
					AIDBTreeNodeInterface treeNode = new AIDBTreeNode();
					treeNode.setValue(String.valueOf(tempAccrelValue.getAcctRelaId()));
					treeNode.setLabel(String.valueOf(tempAccrelValue.getAcctId()));
					treeNode.setLeaf(true);
					treeNode.setChecked(true);
					treeNode.setLeafPicUrl("/images/username.gif");
					pParentNode.addChild(treeNode);
				}
				if (insAccrelValues.length > 10) {
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
	}

	public AIDBTreeNodeInterface getRootNode() {
		AIDBTreeNodeInterface treeNode = new AIDBTreeNode();
		treeNode.setValue("0");
		treeNode.setLabel(CrmLocaleFactory.getResource("CMS0000130"));
		treeNode.setFoldClosePicUrl("/jsv2/analyse/fold_c.gif");
		treeNode.setFoldOpenPicUrl("/jsv2/analyse/fold_c.gif");
		return treeNode;
	}

	public void init(ServletRequest request) throws Exception {
		this.userId = HttpUtil.getAsLong(request, "userId");
		this.centerType = HttpUtil.getAsString(request, "CenterType");
		this.centerValue = HttpUtil.getAsString(request, "CenterValue");
	}

	public Object getTreeData(AIDBTreeNodeInterface parentNode, HashMap paramMap) throws Exception {
		return null;
	}

}
