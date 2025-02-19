package com.asiainfo.crm.cm.customer.group.dao.interfaces;


import com.asiainfo.crm.cm.customer.group.ivalues.IBoCmCustSegmentValue;

public interface ICmCustSegmentDAO {
	public void saveSegment(IBoCmCustSegmentValue value) throws Exception;
	
	public IBoCmCustSegmentValue[] querySegments(long segId,String segName,long parentSegId,String regionId,int strIdx,int endIdx)throws Exception;
	
	public IBoCmCustSegmentValue querySegment(long segId,String segName)throws Exception;
}
