package com.asiainfo.crm.so.exe.ws.oss;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class CoInfo implements Serializable{
	private String coName;
	private String coKind;
	private String coType;
	private String coDesc;
	private String visitService;//GDS,GIG
	private String pbVisitService;//GDS,GIG
	private String hasPstn; // Y/N
	private String pstnNumber;
	private float db150; // 39.22
	private String isDefault; // Y/N
	private List<Equipment> technologies;
	
	public String getCoName() {
		return coName;
	}
	public void setCoName(String coName) {
		this.coName = coName;
	}
	public String getCoKind() {
		return coKind;
	}
	public void setCoKind(String coKind) {
		this.coKind = coKind;
	}
	public String getCoType() {
		return coType;
	}
	public void setCoType(String coType) {
		this.coType = coType;
	}
	public String getCoDesc() {
		return coDesc;
	}
	public void setCoDesc(String coDesc) {
		this.coDesc = coDesc;
	}
	public String getVisitService() {
		return visitService;
	}
	public void setVisitService(String visitService) {
		this.visitService = visitService;
	}
	public String getHasPstn() {
		return hasPstn;
	}
	public void setHasPstn(String hasPstn) {
		this.hasPstn = hasPstn;
	}
	public String getPstnNumber() {
		return pstnNumber;
	}
	public void setPstnNumber(String pstnNumber) {
		this.pstnNumber = pstnNumber;
	}
	public float getDb150() {
		return db150;
	}
	public void setDb150(float db150) {
		this.db150 = db150;
	}
	public String getIsDefault() {
		return isDefault;
	}
	public void setIsDefault(String isDefault) {
		this.isDefault = isDefault;
	}
	public List<Equipment> getTechnologies() {
		return technologies;
	}
	public void setTechnologies(List<Equipment> technologies) {
		this.technologies = technologies;
	}
	
	public String getPbVisitService() {
		return pbVisitService;
	}
	public void setPbVisitService(String pbVisitService) {
		this.pbVisitService = pbVisitService;
	}
	public CoInfo copy(CoInfo co) {
		if (co == null) {
			return null;
		}
		CoInfo co2 = new CoInfo();
		co2.setCoDesc(co.getCoDesc());
		co2.setCoKind(co.getCoKind());
		co2.setCoName(co.getCoName());
		co2.setCoType(co.getCoType());
		co2.setDb150(co.getDb150());
		co2.setHasPstn(co.getPstnNumber());
		co2.setIsDefault(co.getIsDefault());
		co2.setPstnNumber(co.getPstnNumber());
		co2.setVisitService(co.getVisitService());
		
		// set technologies
		List<Equipment> technologies = co.getTechnologies(); 
		if ((technologies != null) && (!technologies.isEmpty())) {
			List<Equipment> technologie2 = new ArrayList<Equipment>(); 
			int len = technologies.size();
			for (int i = 0; i < len; i++) {
				Equipment eq = technologies.get(i);
				Equipment eq2 = new Equipment();
				eq2.setAccessType(eq.getAccessType());
				eq2.setCoType(eq.getCoType());
				eq2.setSpeedDown(eq.getSpeedDown());
				eq2.setSpeedUp(eq.getSpeedUp());
				technologie2.add(eq2);
			}
			co2.setTechnologies(technologie2);
		}
		
		return co2;
	}
}
