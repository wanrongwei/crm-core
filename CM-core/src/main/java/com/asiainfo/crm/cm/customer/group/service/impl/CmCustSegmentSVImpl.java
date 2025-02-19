package com.asiainfo.crm.cm.customer.group.service.impl;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.commons.lang.StringUtils;

import com.ai.appframe2.common.ServiceManager;
import com.ai.appframe2.complex.cache.CacheFactory;
import com.ai.appframe2.privilege.UserInfoInterface;
import com.ai.appframe2.service.ServiceFactory;
import com.asiainfo.crm.cm.common.cache.CmCustSegmentCacheImpl;
import com.asiainfo.crm.cm.customer.group.bo.BoCmCustSegmentBean;
import com.asiainfo.crm.cm.customer.group.dao.interfaces.ICmCustSegmentDAO;
import com.asiainfo.crm.cm.customer.group.ivalues.IBoCmCustSegmentValue;
import com.asiainfo.crm.cm.customer.group.service.interfaces.ICmCustSegmentSV;
import com.asiainfo.crm.cm.inner.util.CmInnerServiceFactory;

public class CmCustSegmentSVImpl implements ICmCustSegmentSV {

	public void save(IBoCmCustSegmentValue value) throws Exception {
		ICmCustSegmentDAO dao = (ICmCustSegmentDAO) ServiceFactory.getService(ICmCustSegmentDAO.class);
		dao.saveSegment(value);
	}

	public IBoCmCustSegmentValue[] querySegments(long segId, String segName, long parentSegId, String regionId,int strIdx,int endIdx) throws Exception {
		ICmCustSegmentDAO dao = (ICmCustSegmentDAO) ServiceFactory.getService(ICmCustSegmentDAO.class);
		IBoCmCustSegmentValue[] values = dao.querySegments(segId, segName, parentSegId, regionId,strIdx,endIdx);

		ICmCustSegmentSV sv = (ICmCustSegmentSV) ServiceFactory.getService(ICmCustSegmentSV.class);
		if (null != values && values.length > 0) {
			for (int i = 0; i < values.length; i++) {
				if (values[i].getUpSegmentId() > 0 && values[i].getUpSegmentId() != -1) {
					IBoCmCustSegmentValue segValue = sv.querySegment(values[i].getUpSegmentId(), "");
					if (null != segValue) {
						values[i].setDiaplayAttr(IBoCmCustSegmentValue.S_UpSegmentId, "UP_SEGMENT_NAME", segValue.getSegmentName());
					}
				} else {
					values[i].setDiaplayAttr(IBoCmCustSegmentValue.S_UpSegmentId, "UP_SEGMENT_NAME", " ");
				}
			}
		}
		return values;
	}

	public IBoCmCustSegmentValue querySegment(long segId, String segName) throws Exception {
		ICmCustSegmentDAO dao = (ICmCustSegmentDAO) ServiceFactory.getService(ICmCustSegmentDAO.class);
		return dao.querySegment(segId, segName);
	}

	public int getSegmentCount(long segId, String segName, long parentSegId, String regionId) throws Exception {
		IBoCmCustSegmentValue[] values = querySegments(segId, segName, parentSegId, regionId,-1,-1);
		if (null != values && values.length > 0) {
			return values.length;
		}
		return 0;
	}

	/*
	 * (non-Javadoc)
	 * @see com.asiainfo.crm.cm.customer.group.service.interfaces.ICmCustSegmentSV#queryAllSegments()
	 */
	public IBoCmCustSegmentValue[] queryAllSegments(long parentSegId) throws Exception {
		String cond = "";
		Map map = null;
		if (parentSegId > 0) {
			cond = "up_segment_id = :parentSegId ";
			map = new HashMap();
			map.put("parentSegId", parentSegId);
		}
		return (IBoCmCustSegmentValue[]) CmInnerServiceFactory.getCommonInnerSV().getBeans(BoCmCustSegmentBean.class, cond, map, -1, -1);
	}

	/*
	 * (non-Javadoc)
	 * @see
	 * com.asiainfo.crm.cm.customer.group.service.interfaces.ICmCustSegmentSV#querySegmentByNamefromCache(java.lang.
	 * String)
	 */
	public IBoCmCustSegmentValue querySegmentByNamefromCache(String segName) throws Exception {
		Object obj = CacheFactory.get(CmCustSegmentCacheImpl.class, segName);
		IBoCmCustSegmentValue val = null;
		if (obj != null) {
			val = (IBoCmCustSegmentValue) obj;
		}
		return val;
	}

	/*
	 * (non-Javadoc)
	 * @see com.asiainfo.crm.cm.customer.group.service.interfaces.ICmCustSegmentSV#querySegmentByIdfromCache(long)
	 */
	public IBoCmCustSegmentValue querySegmentByIdfromCache(long segId) throws Exception {
		Object obj = CacheFactory.get(CmCustSegmentCacheImpl.class, segId);
		IBoCmCustSegmentValue val = null;
		if (obj != null) {
			val = (IBoCmCustSegmentValue) obj;
		}
		return val;
	}

	/*
	 * (non-Javadoc)
	 * @see com.asiainfo.crm.cm.customer.group.service.interfaces.ICmCustSegmentSV#querySegmentByParentIdfromCache(long)
	 */
	public IBoCmCustSegmentValue[] querySegmentByParentIdfromCache(long segId, String segName, long parentSegId, String regionId) throws Exception {
		Object obj = CacheFactory.get(CmCustSegmentCacheImpl.class, "UP_" + parentSegId);
		IBoCmCustSegmentValue[] val = null;
		List list = new ArrayList();
		if (obj != null) {
			val = (IBoCmCustSegmentValue[]) ((List) obj).toArray(new IBoCmCustSegmentValue[0]);
			if (segId > -1) {
				for (int i = 0; i < val.length; i++) {
					if (val[i].getSegmentId() == segId) {
						list.add(val[i]);
						break;
					}
				}
			} else if (StringUtils.isNotBlank(segName) ) {
				for (int i = 0; i < val.length; i++) {
					if (StringUtils.contains(val[i].getSegmentName(), segName)) {
						list.add(val[i]);
					}
				}
			}
		}
		if(segId > -1 || StringUtils.isNotBlank(segName)){
			val =  (IBoCmCustSegmentValue[]) list.toArray(new IBoCmCustSegmentValue[0]);
		}		
		if (null != val && val.length > 0) {
			for (int i = 0; i < val.length; i++) {
				if (val[i].getUpSegmentId() > 0 && val[i].getUpSegmentId() != -1) {
					ICmCustSegmentSV sv = (ICmCustSegmentSV) ServiceFactory.getService(ICmCustSegmentSV.class);
					IBoCmCustSegmentValue segValue = sv.querySegmentByIdfromCache(val[i].getUpSegmentId());
					if (null != segValue) {
						val[i].setDiaplayAttr(IBoCmCustSegmentValue.S_UpSegmentId, "UP_SEGMENT_NAME", segValue.getSegmentName());
					}
				} else {
					val[i].setDiaplayAttr(IBoCmCustSegmentValue.S_UpSegmentId, "UP_SEGMENT_NAME", " ");
				}
			}
		}
		return val;
	}

	/*
	 * (non-Javadoc)
	 * @see
	 * com.asiainfo.crm.cm.customer.group.service.interfaces.ICmCustSegmentSV#querySegmentCountByParentIdfromCache(long)
	 */
	public int querySegmentCountByParentIdfromCache(long segId, String segName, long parentSegId, String regionId) throws Exception {
		ICmCustSegmentSV sv = (ICmCustSegmentSV) ServiceFactory.getService(ICmCustSegmentSV.class);
		return sv.querySegmentByParentIdfromCache(segId, segName, parentSegId, regionId).length;
	}
//	public static void main(String[] args) throws Exception {
//		UserInfoInterface user = ServiceManager.getNewBlankUserInfo();
//		user.setTenantId("02");
//		user.set("REGION_ID", "012");
//		user.setID(100000026);
//		user.setOrgId(10000000);
//		ServiceManager.setServiceUserInfo(user);
//		CmCustSegmentSVImpl impl=new CmCustSegmentSVImpl();
//		IBoCmCustSegmentValue[] values=impl.querySegmentByParentIdfromCache(-1, null, 1, null);
//		System.out.println(123);
//	}

	public IBoCmCustSegmentValue[] querySegmentFromCache(long parentSegId)
			throws Exception {
		Object obj = CacheFactory.get(CmCustSegmentCacheImpl.class, "UP_" + parentSegId);
		return (IBoCmCustSegmentValue[]) ((List) obj).toArray(new IBoCmCustSegmentValue[0]);
	}
}
