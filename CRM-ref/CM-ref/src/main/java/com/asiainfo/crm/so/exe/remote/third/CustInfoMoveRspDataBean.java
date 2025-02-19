package com.asiainfo.crm.so.exe.remote.third;

import java.io.Serializable;
import java.util.Date;
import java.util.List;
import java.util.Map;

public class CustInfoMoveRspDataBean implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 2911052580255997815L;
	private String procId;//交易流水号	CBOSS交易流水号
	private String oldMsisdn;// 客户原归属地手机号码
	private String allConScore;// 总消费积分（M值）
	private List scores;// 年份积分集合  List<CustInfoScoreData>
	private int type;// 积分类型  0－全球通积分；1－动感地带
	private int level;// 客户级别 0－普通用户（动感地带用户为普通用户） 1－银卡 2－金卡 3－钻石卡
	private String levelDate;// 客户级别有效截止日期
	private String result;// 错误码
	private Map otherInfo;// 扩展信息
	private String resultDesc;
	
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
	public String getResultDesc() {
		return resultDesc;
	}
	public void setResultDesc(String resultDesc) {
		this.resultDesc = resultDesc;
	}


	public String getOldMsisdn() {
		return oldMsisdn;
	}

	public void setOldMsisdn(String oldMsisdn) {
		this.oldMsisdn = oldMsisdn;
	}

	public String getAllConScore() {
		return allConScore;
	}

	public void setAllConScore(String allConScore) {
		this.allConScore = allConScore;
	}

	public List getScores() {
		return scores;
	}

	public void setScores(List scores) {
		this.scores = scores;
	}

	public int getType() {
		return type;
	}

	public void setType(int type) {
		this.type = type;
	}

	public int getLevel() {
		return level;
	}

	public void setLevel(int level) {
		this.level = level;
	}

	public String getLevelDate() {
		return levelDate;
	}

	public void setLevelDate(String levelDate) {
		this.levelDate = levelDate;
	}

	public String getResult() {
		return result;
	}

	public void setResult(String result) {
		this.result = result;
	}

	public Map getOtherInfo() {
		return otherInfo;
	}

	public void setOtherInfo(Map otherInfo) {
		this.otherInfo = otherInfo;
	}

	public String getProcId() {
		return procId;
	}

	public void setProcId(String procId) {
		this.procId = procId;
	}

	public String toString() {
		return "CustInfoMoveRspDataBean [procId=" + procId + ", oldMsisdn="
				+ oldMsisdn + ", allConScore=" + allConScore + ", scores="
				+ scores + ", type=" + type + ", level=" + level
				+ ", levelDate=" + levelDate + ", result=" + result
				+ ", otherInfo=" + otherInfo + ", resultDesc=" + resultDesc
				+ ", joinDate=" + joinDate + ", brandAwardScore="
				+ brandAwardScore + ", yearAwardScore=" + yearAwardScore
				+ ", specialMoveScore=" + specialMoveScore + ", useScore="
				+ useScore + ", ableScore=" + ableScore + "]";
	}

}
