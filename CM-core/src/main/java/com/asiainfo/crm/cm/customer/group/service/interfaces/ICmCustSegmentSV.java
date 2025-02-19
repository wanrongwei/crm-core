package com.asiainfo.crm.cm.customer.group.service.interfaces;


import com.asiainfo.crm.cm.customer.group.ivalues.IBoCmCustSegmentValue;

public interface ICmCustSegmentSV {
	public void save(IBoCmCustSegmentValue value)throws Exception;
	
	public IBoCmCustSegmentValue[] querySegments(long segId, String segName,long parentSegId,String regionId,int strIdx,int endIdx)throws Exception;
	
	public IBoCmCustSegmentValue querySegment(long segId, String segName)throws Exception;
	
	public int getSegmentCount(long segId, String segName,long parentSegId,String regionId)throws Exception;
	
	public IBoCmCustSegmentValue[] queryAllSegments(long parentSegId)throws Exception;
	
	public IBoCmCustSegmentValue querySegmentByNamefromCache(String segName)throws Exception;
	public IBoCmCustSegmentValue querySegmentByIdfromCache(long segId)throws Exception;
	public IBoCmCustSegmentValue[] querySegmentByParentIdfromCache(long segId, String segName,long parentSegId,String regionId)throws Exception;
	public int querySegmentCountByParentIdfromCache(long segId, String segName,long parentSegId,String regionId)throws Exception;
	/**
	 * 
	 * @Function querySegmentFromCache
	 * @Description 
	 *
	 * @param 
	 * @throws Exception
	 *
	 * @version v1.0.0
	 * @author huangqun
	 * @date 2014-9-22	 下午7:51:37
	 * 
	 * <strong>Modification History:</strong><br>
	 * Date         Author          Version            Description<br>
	 * ---------------------------------------------------------<br>
	 * 2014-9-22     huangqun           v1.0.0               修改原因<br>
	 */
	public IBoCmCustSegmentValue[] querySegmentFromCache(long parentSegId)throws Exception;
}
