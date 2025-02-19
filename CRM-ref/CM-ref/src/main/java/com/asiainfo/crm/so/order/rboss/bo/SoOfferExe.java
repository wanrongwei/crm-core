package com.asiainfo.crm.so.order.rboss.bo;

import com.ai.omframe.order.data.ivalues.ISoAttrData;
import com.ai.omframe.order.data.ivalues.ISoBusiPriceData;
import com.ai.omframe.order.data.ivalues.ISoCommitmentData;
import com.ai.omframe.order.data.ivalues.ISoServicePkgData;
import com.asiainfo.crm.so.order.rboss.ivalues.ISoOfferExe;

import java.sql.Timestamp;
import java.util.Map;

public class SoOfferExe implements ISoOfferExe {

	//策划ID
	private long offerId;
	//策划实例ID:产品变更,退订的时候用
	private long offerInstId;
	//数据状态
	private int state;
	private Timestamp validDate;
	private Timestamp expireDate;
	private ISoServicePkgData prodList[];
	//策划操作类型CREATE 订购 UPDATE 产品变更 LOGOUT 退订CANCEL 撤消
	private String operType;
	//生效类型 暂时没用
	private String effType;
	//失效类型 暂时没用
	private String expType;
	//特定的操作ID
	private long businessId;
	//预缴付费类型
	private int payType;
	//策划属性
	private Map<String,ISoAttrData[]> soAttrMap;
	//互斥对象的生效时间,退订的时个候作为失效时间
	private Timestamp oppValidDate;
	//策划类型
	private String offerType;
	//是否可以重复订购 1 不可以 2 可以
	private int mulAcceptType; 
	//产品变更是否更新策划.
	private boolean isOfferUpdate = false;
	//被连带订购的策划
	private long relOfferId;
	//被连带订购的策划实例
	private long relOfferInstId;
    //连带类型
    private String relatType;
    //是否换增值策划
	//private boolean isChgVASOffer = false;
	//套餐变更offerId
	private long oldOfferId;
	//套餐变更offerInstId
	private long oldOfferInstId;
	//一定要获取默选产品或连带默选的增值策划,用在该策划选产品或连带增值策划上
	private boolean mustDefSelFlag = false;
    private boolean inheritProdFlag = true;//换主策划时,原套餐下必选新套餐下可选的产品是否继承,默认继承
    private boolean isCanRestEffExpDate = true;//是否能重设时间
    private boolean isDoneGetRelOffer = false;//是否取过连带的策划  默认值是还没有取

    private boolean isAppointEffDate = false;//是否指定了业务生效时间,如果指定时间了,就不能重新设置.

    private ISoOfferExe[] subSoOfferExes;//对连带策划的选择,产品包下策划的选择,产品包变更下策划选择

    private int depth;//连带的层数
    
    private ISoBusiPriceData[] soBusiPriceDatas;
    
    private ISoCommitmentData[] soCommitmentData;
    
    private int number;
    public ISoCommitmentData[] getSoCommitmentData() {
		return soCommitmentData;
	}

	public void setSoCommitmentData(ISoCommitmentData[] soCommitmentData) {
		this.soCommitmentData = soCommitmentData;
	}

	private long custId;
    
    public long getOfferIndexId() {
		return offerIndexId;
	}

	public void setOfferIndexId(long offerIndexId) {
		this.offerIndexId = offerIndexId;
	}

	private long offerIndexId;

    public SoOfferExe(){
	}
	
	public SoOfferExe(long offerId, String operType){
		this.offerId = offerId;
		this.operType = operType;
	}

	public SoOfferExe(long offerId, String operType, Timestamp validDate, Timestamp expireDate){
		this.offerId = offerId;
		this.operType = operType;
		this.validDate = validDate;
		this.expireDate = expireDate;
	}
	
	public SoOfferExe(long offerId, String operType, String effType, String expType){
//		this.offerId = offerId;
//		this.operType = operType;
//		this.effType = effType;
//		this.expType = expType;
		this(offerId,operType,effType,expType,0L);
	}
	public SoOfferExe(long offerId, String operType, String effType, String expType, long offerIndexId){
		this.offerId = offerId;
		this.operType = operType;
		this.effType = effType;
		this.expType = expType;
		this.offerIndexId = offerIndexId;
	}
	public long getCustId() {
		return custId;
	}

	public void setCustId(long custId) {
		this.custId = custId;
	}

	public void setOfferId(long offerId){
		this.offerId = offerId;
	}
	
	public long getOfferId(){
		return this.offerId;
	}
	
	public void setState(int aState){
		this.state = aState;
	}
	
	public int getState(){
		return this.state;
	}
	
	public void setValidDate(Timestamp aValidDate){
		this.validDate = aValidDate;
	}
	
	public Timestamp getExpireDate(){
		return this.expireDate;
	}
	
	public void setexpireDate(Timestamp aExpireDate){
		this.expireDate = aExpireDate;
	}
	
	public Timestamp getValidDate(){
		return this.validDate;
	}

	public ISoServicePkgData[] getProdList() {
		return prodList;
	}

	public void setProdList(ISoServicePkgData prodList[]) {
		this.prodList = prodList;
		
	}

	public String getOperType() {
		return this.operType;
	}

	public void setOperType(String operType) {

		this.operType = operType;
	}

	public String getEffType() {
		
		return this.effType;
	}

	public void setEffType(String effType) {
		this.effType = effType;		
	}

	public long getBusinessId() {
		return this.businessId;
	}

	public int getPayType() {
		return this.payType;
	}

	public void setBusinessId(long businessId) {

		this.businessId = businessId;
		
	}

	public void setPayType(int payType) {
		this.payType = payType;		
	}

	public long getOfferInstId() {
		return this.offerInstId;
	}

	public void setOfferInstId(long offerInstId) {
		this.offerInstId = offerInstId;
	}

	public String getExpType() {		
		return this.expType;
	}

	public void setExpType(String expType) {
		this.expType = expType;
		
	}

	public Map<String, ISoAttrData[]> getSoAttrMap() {
		return this.soAttrMap;
	}

	public void setSoAttrMap(Map<String, ISoAttrData[]> soAttrMap) {
		this.soAttrMap = soAttrMap;
	}

	public Timestamp getOppValidDate() {
		return this.oppValidDate;
	}

	public void setOppValidDate(Timestamp oppValidDate) {

		this.oppValidDate = oppValidDate;
	}

	public String getOfferType() {
		return offerType;
	}

	public void setOfferType(String offerType) {

		this.offerType = offerType;
	}

	public int getMulAcceptType() {
		return this.mulAcceptType;
	}

    public boolean isCanRestEffExpDate() {
        return isCanRestEffExpDate;
    }

    public void setCanRestEffExpDate(boolean canRestEffExpDate) {
        isCanRestEffExpDate = canRestEffExpDate;
    }
	public void setMulAcceptType(int mulAcceptType) {
		this.mulAcceptType = mulAcceptType;
	}

	public boolean getIsOfferUpdate() {
		return isOfferUpdate;
	}

	public void setIsOfferUpdate(boolean isOfferUpdate) {
		this.isOfferUpdate = isOfferUpdate;
	}

	public long getRelOfferId() {
		return relOfferId;
	}

	public void setRelOfferId(long relOfferId) {
		this.relOfferId = relOfferId;
	}

//	public boolean getIsChgVASOffer() {
//		return this.isChgVASOffer;
//	}

//	public void setIsChgVASOffer(boolean isChgVASOffer) {
//		this.isChgVASOffer = isChgVASOffer;
//		
//	}

	public long getOldOfferId() {
		return oldOfferId;
	}

	public long getOldOfferInstId() {
		return oldOfferInstId;
	}

	public void setOldOfferId(long oldOfferId) {
		this.oldOfferId = oldOfferId;
		
	}

	public void setOldOfferInstId(long oldOfferInstId) {
		this.oldOfferInstId = oldOfferInstId;		
	}

	public long getRelOfferInstId() {
		return this.relOfferInstId;
	}

	public void setRelOfferInstId(long relOfferInstId) {
		this.relOfferInstId = relOfferInstId;
	}

	public boolean getMustDefSelFlag() {
		return this.mustDefSelFlag;
	}

	public void setMustDefSelFlag(boolean mustDefSelFlag) {
		this.mustDefSelFlag = mustDefSelFlag;
	}
    public boolean isDoneGetRelOffer() {
        return isDoneGetRelOffer;
    }

    public void setDoneGetRelOffer(boolean isDoneGetRelOffer) {
        this.isDoneGetRelOffer = isDoneGetRelOffer;
    }
    public String getRelatType() {
        return relatType;
    }

    public void setRelatType(String relatType) {
        this.relatType = relatType;
    }

    public ISoOfferExe[] getSubSoOfferExes() {
        return subSoOfferExes;
    }

    public void setSubSoOfferExes(ISoOfferExe[] subSoOfferExes) {
        this.subSoOfferExes = subSoOfferExes;
    }


    public boolean isInheritProdFlag() {
        return inheritProdFlag;
    }

    public void setInheritProdFlag(boolean inheritProdFlag) {
        this.inheritProdFlag = inheritProdFlag;
    }

    public int getDepth() {
        return depth;
    }

    public int getNumber() {
		return number;
	}

	public void setNumber(int number) {
		this.number = number;
	}

	public void setDepth(int depth) {
        this.depth = depth;
    }
    public boolean isAppointEffDate() {
        return isAppointEffDate;
    }

    public void setAppointEffDate(boolean appointEffDate) {
        isAppointEffDate = appointEffDate;
    }

	public ISoBusiPriceData[] getSoBusiPriceDatas()
	{
		return soBusiPriceDatas;
	}

	public void setSoBusiPriceDatas(ISoBusiPriceData[] soBusiPriceDatas)
	{
		this.soBusiPriceDatas = soBusiPriceDatas;
	}

    
    
}
