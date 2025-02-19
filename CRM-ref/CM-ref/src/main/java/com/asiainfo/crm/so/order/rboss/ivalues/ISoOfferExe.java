
package com.asiainfo.crm.so.order.rboss.ivalues;

import com.ai.omframe.order.data.ivalues.ISoAttrData;
import com.ai.omframe.order.data.ivalues.ISoBusiPriceData;
import com.ai.omframe.order.data.ivalues.ISoCommitmentData;
import com.ai.omframe.order.data.ivalues.ISoServicePkgData;

import java.io.Serializable;
import java.sql.Timestamp;
import java.util.Map;

public interface ISoOfferExe extends Serializable {

	public void setSoAttrMap(Map<String,ISoAttrData[]> soAttrMap);

	public Map<String, ISoAttrData[]> getSoAttrMap();

	public void setOfferType(String offerType);

	public String getOfferType();

	public ISoServicePkgData[] getProdList();

	public void setProdList(ISoServicePkgData prodList[]);

	public void setOperType(String operType);

	public String getOperType();

	public void setOfferId(long offerId);

	public long getOfferId();

	public void setOfferInstId(long offerInstId);

	public long getOfferInstId();

	public void setValidDate(Timestamp aValidDate);

	public Timestamp getExpireDate();

	public void setexpireDate(Timestamp aExpireDate);

	public Timestamp getValidDate();
	
	//一定要获取默选产品或连带默选的增值策划
	public void setMustDefSelFlag(boolean mustDefSelFlag);
	public boolean getMustDefSelFlag();
	
	public void setState(int aState);
	
	public int getState();
	
	public void setRelOfferId(long relOfferId);
	public long getRelOfferId();
	
	public void setEffType(String effType);
	
	public String getEffType();
	public void setExpType(String expType);
	
	public String getExpType();
	
	public void setOldOfferId(long chgOfferId);
	public long getOldOfferId();
	
	//目前只有在换策划时,获取生失效时间时用
	public void setOldOfferInstId(long chgOfferInstId);
	public long getOldOfferInstId();
	
	public void setOppValidDate(Timestamp aOppValidDate);
	public Timestamp getOppValidDate();
	
	public void setIsOfferUpdate(boolean isOfferUpdate);
	public boolean getIsOfferUpdate();
	
	public void setRelOfferInstId(long relOfferInstId);
	public long getRelOfferInstId();
	
	public void setPayType(int payType);
	
	public int getPayType(); 
	

	
	public void setBusinessId(long businessId);
	
	public long getBusinessId(); 

	public void setMulAcceptType(int mulAcceptType);
	public int getMulAcceptType();
	
	
	//public void setIsChgVASOffer(boolean isChgVASOffer);
	//public boolean getIsChgVASOffer();
    public boolean isCanRestEffExpDate() ;

    public void setCanRestEffExpDate(boolean canRestEffExpDate) ;

    public boolean isDoneGetRelOffer() ;

    public void setDoneGetRelOffer(boolean isDoneGetRelOffer) ;

    public String getRelatType() ;

    public void setRelatType(String relatType) ;

    public ISoOfferExe[] getSubSoOfferExes() ;

    public void setSubSoOfferExes(ISoOfferExe[] soOfferExes) ;


    public boolean isInheritProdFlag() ;

    public void setInheritProdFlag(boolean inheritProdFlag) ;

    public int getDepth() ;

    public void setDepth(int depth) ;

    public boolean isAppointEffDate() ;
    public void setAppointEffDate(boolean appointEffDate) ;
    
    public ISoBusiPriceData[] getSoBusiPriceDatas();

	public void setSoBusiPriceDatas(ISoBusiPriceData[] soBusiPriceDatas);
	
	public long getCustId();
	public void setCustId(long custId);
	public long getOfferIndexId();
	public void setOfferIndexId(long offerIndexId) ;

    public ISoCommitmentData[] getSoCommitmentData();

	public void setSoCommitmentData(ISoCommitmentData[] soCommitmentData);

	public void setNumber(int number);
	public int getNumber();
}
