package com.asiainfo.crm.cm.customer.group.util;

import java.rmi.RemoteException;
import java.util.Map;

import com.ai.appframe2.common.DataType;
import com.asiainfo.crm.cm.common.CmConstants;
import com.asiainfo.crm.cm.customer.group.service.interfaces.ICmGroupMemberSV;
import com.asiainfo.crm.cm.query.bo.QBOCmGroupMemberQryCdnBean;
import com.asiainfo.crm.cm.query.ivalues.IQBOCmGroupMemberQryCdnValue;

public class CmGroupMemberUtil
{
	/**   
	 * <p>构造集团成员查询条件对象。
	 * <p>将需要作为查询条件的属性存放到Map中，调用此方法构造查询条件IValue对象，供以下方法使用:
	 * <blockquote>
	 * 		{@link ICmGroupMemberSV#queryQGroupCustMemberUserCountByCdn(IQBOCmGroupMemberQryCdnValue) ICmGroupMemberSV.queryQGroupCustMemberUserCountByCdn}<br>
	 * 		{@link ICmGroupMemberSV#queryQGroupCustMemberUsersByCdn(IQBOCmGroupMemberQryCdnValue, int, int) ICmGroupMemberSV.queryQGroupCustMemberUsersByCdn}<br>
	 * 		{@link ICmGroupMemberSV#queryQGroupKeyMemberUserCountByCdn(IQBOCmGroupMemberQryCdnValue) ICmGroupMemberSV.queryQGroupKeyMemberUserCountByCdn}<br>
	 * 		{@link ICmGroupMemberSV#queryQGroupKeyMemberUsersByCdn(IQBOCmGroupMemberQryCdnValue, int, int) ICmGroupMemberSV.queryQGroupKeyMemberUsersByCdn}<br>
	 * </blockquote>
	 * <h4>用法:</h4>
	 * <h5>可以这样用：</h5>
	 * <blockquote>
	 * 		<pre>
	 * Map parameter = new HashMap();
	 * parameter.put("GROUP_CUST_ID", Long.valueOf(9100000012L));
	 * ICmGroupMemberSV groupMemberSV = (ICmGroupMemberSV)ServiceFactory.getService(ICmGroupMemberSV.class);
	 * IQBOCmGroupMemberQryCdnValue cdnValue = CmGroupMemberUtil.createGroupMemberQryCdn(parameter);
	 * int memberCount = groupMemberSV.queryQGroupCustMemberUserCountByCdn(cdnValue);
	 * 		</pre>
	 * </blockquote>
	 * <h5>也可以这样用：</h5>
	 * <blockquote>
	 * 		<pre>
	 * Map parameter = new HashMap();
	 * parameter.put("GROUP_CUST_ID", Long.valueOf(9100000012L));
	 * ICmGroupMemberSV groupMemberSV = (ICmGroupMemberSV)ServiceFactory.getService(ICmGroupMemberSV.class);
	 * int memberCount = groupMemberSV.queryQGroupCustMemberUserCountByCdn(CmGroupMemberUtil.createGroupMemberQryCdn(parameter));
	 * 		</pre>
	 * </blockquote>
	 * <em> 这样的使用方式可以屏蔽掉对IQBOCmGroupMemberQryCdnValue的依赖，如果该对象发生改变一般不会对代码造成很大的变动。</em>
	 * @Function: createGroupMemberQryCdn
	 *
	 * @param parameter 包含需要作为查询条件的属性。
	 * <h4>查询条件包含：
	 * 	<table>
	 * 		<tr>
	 * 			<th>CODE</th>
	 * 			<th>NAME</th>
	 * 		</tr>
	 * 		<tr>
	 * 			<td>GROUP_CUST_ID</td>
	 * 			<td>集团客户编号</td>
	 * 		</tr>
	 * 		<tr>
	 * 			<td>GROUP_ID</td>
	 * 			<td>集团编号</td>
	 * 		</tr>
	 * 		<tr>
	 * 			<td>GROUP_NAME</td>
	 * 			<td>集团名称</td>
	 * 		</tr>
	 * 		<tr>
	 * 			<td>GROUP_LEVEL</td>
	 * 			<td>集团级别</td>
	 * 		</tr>
	 * 		<tr>
	 * 			<td>GROUP_STATUS</td>
	 * 			<td>集团状态</td>
	 * 		</tr>
	 * 		<tr>
	 * 			<td>INDIV_CUST_ID</td>
	 * 			<td>集团成员或关键人物对应的个人客户编号</td>
	 * 		</tr>
	 * 		<tr>
	 * 			<td>CUST_REL_ID</td>
	 * 			<td>集团成员编号</td>
	 * 		</tr>
	 * 		<tr>
	 * 			<td>MEMBER_NAME</td>
	 * 			<td>集团成员或关键人物名称</td>
	 * 		</tr>
	 * 		<tr>
	 * 			<td>BILL_ID</td>
	 * 			<td>集团成员或关键人物关联的手机号码</td>
	 * 		</tr>
	 * 		<tr>
	 * 			<td>WORK_DEPT</td>
	 * 			<td>集团成员或关键人物工作部门</td>
	 * 		</tr>
	 * 		<tr>
	 * 			<td>MEMBER_LEVEL</td>
	 * 			<td>成员类别(见#{@link CmConstants.GroupMemberLevel CmConstants.GroupMemberLevel})</td>
	 * 		</tr>
	 * 		<tr>
	 * 			<td>MEMBER_TYPE</td>
	 * 			<td>集团成员分类（网内[{@link CmConstants.GroupMember#TYPE_INNER_MEMBER CmConstants.GroupMember.TYPE_INNER_MEMBER}]、
	 * 			网外[{@link CmConstants.GroupMember#TYPE_OUT_MEMBER CmConstants.GroupMember.TYPE_OUT_MEMBER}]、
	 * 			其他[{@link CmConstants.GroupMember#TYPE_EXT_MEMBER CmConstants.GroupMember.TYPE_EXT_MEMBER}]）</td>
	 * 		</tr>
	 * 		<tr>
	 * 			<td>MEMBER_APP_TYPE</td>
	 * 			<td>集团其他成员类型</td>
	 * 		</tr>
	 * 		<tr>
	 * 			<td>CITY_ID</td>
	 * 			<td>集团客户的归属地市</td>
	 * 		</tr>
	 * 		<tr>
	 * 			<td>COUNTY_ID</td>
	 * 			<td>集团客户的归属县市</td>
	 * 		</tr>
	 * 		<tr>
	 * 			<td>AREA_ID</td>
	 * 			<td>集团客户的归属片区</td>
	 * 		</tr>
	 * 		<tr>
	 * 			<td>IS_HIGH_VALUE</td>
	 * 			<td>是否中高端价值客户</td>
	 * 		</tr>
	 * 		<tr>
	 * 			<td>IS_KEY_MEMBER</td>
	 * 			<td>是否关键人物</td>
	 * 		</tr>
	 * 		<tr>
	 * 			<td>KERNEL_TYPE</td>
	 * 			<td>关键人物类型</td>
	 * 		</tr>
	 * 		<tr>
	 * 			<td>IS_KERNEL_MEMBER</td>
	 * 			<td>是否核心成员</td>
	 * 		</tr>
	 * 		<tr>
	 * 			<td>IS_CONTACT</td>
	 * 			<td>是否联系人</td>
	 * 		</tr>
	 * 		<tr>
	 * 			<td>IS_VIP</td>
	 * 			<td>是否VIP</td>
	 * 		</tr>
	 * 		<tr>
	 * 			<td>MANAGER_ID</td>
	 * 			<td>客户经理编号</td>
	 * 		</tr>
	 * 		<tr>
	 * 			<td>MATCH_TYPE</td>
	 * 			<td>匹配方式（精确匹配、模糊匹配）</td>
	 * 		</tr>
	 * 		<tr>
	 * 			<td>START_DATE</td>
	 * 			<td>（加入时间）开始时间</td>
	 * 		</tr>
	 * 		<tr>
	 * 			<td>END_DATE</td>
	 * 			<td>（加入时间）结束时间</td>
	 * 		</tr>
	 * 		<tr>
	 * 			<td>USER_ID</td>
	 * 			<td>用户编号</td>
	 * 		</tr>
	 *  </table>
	 * 
	 * @return 包含查询条件的对象
	 * @throws Exception
	 * @throws RemoteException
	 *
	 * @version: v1.0.0
	 * @author: huzq2
	 * @date: May 30, 2011 8:57:29 PM 
	 *
	 * Modification History:
	 * Date         Author          Version            Description
	 *---------------------------------------------------------*
	 * May 30, 2011     huzq2           v1.0.0               修改原因
	 */
	public static IQBOCmGroupMemberQryCdnValue createGroupMemberQryCdn(Map parameter) throws Exception
	{
		QBOCmGroupMemberQryCdnBean memberQryCdnValue = new QBOCmGroupMemberQryCdnBean();
		// 将前台的查询条件转换成查询条件数据容器
		String[] propertyNames = memberQryCdnValue.getPropertyNames();
		for (int i = 0, length = propertyNames.length; i < length; i++)
		{
			if (parameter.get(propertyNames[i]) != null)
			{
				memberQryCdnValue.set(
						propertyNames[i],
						DataType.transfer(parameter.get(propertyNames[i]),
								memberQryCdnValue.getPropertyType(propertyNames[i])));
			}
			else
			{
				if (memberQryCdnValue.getPropertyType(propertyNames[i]).equals(DataType.DATATYPE_INTEGER)
						|| memberQryCdnValue.getPropertyType(propertyNames[i]).equals(DataType.DATATYPE_int))
				{
					// 默认设置为-1
					memberQryCdnValue.set(propertyNames[i], Integer.valueOf(-1));
				}
				else if (memberQryCdnValue.getPropertyType(propertyNames[i]).equals(DataType.DATATYPE_LONG)
						|| memberQryCdnValue.getPropertyType(propertyNames[i]).equals(DataType.DATATYPE_long))
				{
					memberQryCdnValue.set(propertyNames[i], Long.valueOf(-1));
				}
			}
		}
		// 将查询条件的状态设置为OLD状态，方便自动记录日志
		memberQryCdnValue.setStsToOld();
		return memberQryCdnValue;
	}
}
