package com.asiainfo.crm.ci.spec.service.interfaces;

import com.asiainfo.crm.ci.spec.ivalues.IBOCiChnlMapValue;
import com.asiainfo.crm.ci.spec.ivalues.IBOCiChannelValue;


/**
 * 
 * @author wangql2
 *
 */
public interface IChannelSV{
	public IBOCiChannelValue[] getAllCiChannels() throws Exception;
	
	public IBOCiChannelValue[] getCiChannels(String channelCode,String channelName) throws Exception;
	
	public IBOCiChannelValue[] getCiChannels(String channelCode,String channelName,int startIndex, int endIndex) throws Exception;
	
	public int getCiChannelsCount(String channelCode,String channelName) throws Exception;
	
	public IBOCiChannelValue getCiChannelsById(String channelId) throws Exception;
	
	public IBOCiChannelValue getCiChannelsByCode(String channelCode) throws Exception;
	
	public IBOCiChannelValue saveCiChannel(IBOCiChannelValue value) throws Exception;
	
	public void delCiChannelByChnlId(long channelId) throws Exception;
	
	public IBOCiChnlMapValue[] getAllCiChannelMaps() throws Exception;
	
	public void delChnlMapByChnlMapId(long channelMapId) throws Exception;
	
	public IBOCiChnlMapValue[] getCiChnlMapsByChnlId(String channelId) throws Exception;
	
	public IBOCiChnlMapValue[] getCiChnlMapsByChnlId(String channelId,int startIndex, int endIndex) throws Exception;
	
	public int getCiChnlMapsByChnlIdCount(String channelId) throws Exception;
	
	public IBOCiChnlMapValue saveCiChnlMap(IBOCiChnlMapValue value) throws Exception;
	
	public IBOCiChnlMapValue getCiChnlMapByChnlMapId(long chnlMapId) throws Exception;
}
