package com.asiainfo.crm.so.order.rboss.ivalues;

import java.io.Serializable;

public interface ILineProductInfoForDSLValue extends Serializable{
	
	public String getProductNo();
	
	public void setProductNo(String productNo);
	
	public String getProductOperator();
	
	public void setProductOperator(String productOperator);
	
	public String getProductType();
	
	public void setProductType(String productType);

	
}
