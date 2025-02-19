package com.asiainfo.crm.so.exe.remote.third;

import java.io.Serializable;
import java.lang.reflect.Method;
import java.util.List;

public class CustScoreAndGradeInfoDataBean implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 2048085870918375295L;
	private String newBillId;//转入手机号码
	private String oldBillId;//归属地手机号码
	private String allConScore;//总消费积分
	private short type;//积分类型
	private short level;//客户级别
	private String levelDate;//客户级别有效期
	private short oprCode;//操作类型
	private long procId;//交易流水号
	private List scores;//年积分信息
	private String effectDate;//被冲正交易日期
	
	//liujianya新增
	private String joinDate;          //客户入网时间
	private String brandAwardScore;   //品牌奖励积分
	private String yearAwardScore;    //网龄奖励积分
	private String specialMoveScore;  //专项转移积分
	private String useScore;		  //已兑换积分
	private String ableScore;		  //可兑换积分	
	
	
	public String getUseScore() {
		return useScore;
	}
	public void setUseScore(String useScore) {
		this.useScore = useScore;
	}
	public String getAbleScore() {
		return ableScore;
	}
	public void setAbleScore(String ableScore) {
		this.ableScore = ableScore;
	}
	public String getJoinDate() {
		return joinDate;
	}
	public void setJoinDate(String joinDate) {
		this.joinDate = joinDate;
	}
	public String getBrandAwardScore() {
		return brandAwardScore;
	}
	public void setBrandAwardScore(String brandAwardScore) {
		this.brandAwardScore = brandAwardScore;
	}
	public String getYearAwardScore() {
		return yearAwardScore;
	}
	public void setYearAwardScore(String yearAwardScore) {
		this.yearAwardScore = yearAwardScore;
	}
	public String getSpecialMoveScore() {
		return specialMoveScore;
	}
	public void setSpecialMoveScore(String specialMoveScore) {
		this.specialMoveScore = specialMoveScore;
	}
	public String getNewBillId() {
		return newBillId;
	}
	public void setNewBillId(String newBillId) {
		this.newBillId = newBillId;
	}
	public String getOldBillId() {
		return oldBillId;
	}
	public void setOldBillId(String oldBillId) {
		this.oldBillId = oldBillId;
	}
	public String getAllConScore() {
		return allConScore;
	}
	public void setAllConScore(String allConScore) {
		this.allConScore = allConScore;
	}
	public String getEffectDate() {
		return effectDate;
	}
	public void setEffectDate(String effectDate) {
		this.effectDate = effectDate;
	}
	public short getType() {
		return type;
	}
	public void setType(short type) {
		this.type = type;
	}
	public short getLevel() {
		return level;
	}
	public void setLevel(short level) {
		this.level = level;
	}
	public String getLevelDate() {
		return levelDate;
	}
	public void setLevelDate(String levelDate) {
		this.levelDate = levelDate;
	}
	public short getOprCode() {
		return oprCode;
	}
	public void setOprCode(short oprCode) {
		this.oprCode = oprCode;
	}
	public long getProcId() {
		return procId;
	}
	public void setProcId(long procId) {
		this.procId = procId;
	}
	public List getScores() {
		return scores;
	}
	public void setScores(List scores) {
		this.scores = scores;
	}

	public String toString() {
		return "CustScoreAndGradeInfoDataBean [newBillId=" + newBillId
				+ ", oldBillId=" + oldBillId + ", allConScore=" + allConScore
				+ ", type=" + type + ", level=" + level + ", levelDate="
				+ levelDate + ", oprCode=" + oprCode + ", procId=" + procId
				+ ", scores=" + scores + ", effectDate=" + effectDate
				+ ", joinDate=" + joinDate + ", brandAwardScore="
				+ brandAwardScore + ", yearAwardScore=" + yearAwardScore
				+ ", specialMoveScore=" + specialMoveScore + ", useScore="
				+ useScore + ", ableScore=" + ableScore + "]";
	}

}
