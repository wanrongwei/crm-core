/**  
* <p>Title: AttrVo.java</p>  
* <p>Description: </p>  
* <p>Copyright: Copyright (c) 2017</p>  
* <p>Company: www.asiainfo.com</p>  
* @author YJ  
* @date 2019年8月13日  
* @version SR 0.83  
*/  
package com.asiainfo.crm.so.order.fixedline.dto;

import java.io.Serializable;
import java.util.List;

/**  
* <p>Title: AttrVo</p>  
* <p>Description: </p>  
* @author YJ  
* @date 2019年8月13日  
*/

public class PreqInfoVo implements Serializable {
	private static final long serialVersionUID = -2539194228263541L;
    private String address;
    private AddressInfoVo addressInfo;
    private List<LineProductInfoVo> lineProductInfo;
    private List<CoInfoVo> coInfo;
    private SelCoVo selCo;
    private CapTureInfoVo capTureInfo;
    private String cmtsId;
    private String installationStatus;
    
    private String deselectionReasonDate;//2020-01-28 10:00:00 TDC fiber digging时最早onlinedate
    
    private String placeId; // fibia

    
    public String getPlaceId() {
		return placeId;
	}
	public void setPlaceId(String placeId) {
		this.placeId = placeId;
	}
	public String getDeselectionReasonDate() {
		return deselectionReasonDate;
	}
	public void setDeselectionReasonDate(String deselectionReasonDate) {
		this.deselectionReasonDate = deselectionReasonDate;
	}
	public String getInstallationStatus() {
		return installationStatus;
	}
	public void setInstallationStatus(String installationStatus) {
		this.installationStatus = installationStatus;
	}
	public void setAddress(String address) {
         this.address = address;
     }
     public String getAddress() {
         return address;
     }

    public void setAddressInfo(AddressInfoVo addressInfo) {
         this.addressInfo = addressInfo;
     }
     public AddressInfoVo getAddressInfo() {
         return addressInfo;
     }

    public void setLineProductInfo(List<LineProductInfoVo> lineProductInfo) {
         this.lineProductInfo = lineProductInfo;
     }
     public List<LineProductInfoVo> getLineProductInfo() {
         return lineProductInfo;
     }

    public void setCoInfo(List<CoInfoVo> coInfo) {
         this.coInfo = coInfo;
     }
     public List<CoInfoVo> getCoInfo() {
         return coInfo;
     }

    public void setSelCo(SelCoVo selCo) {
         this.selCo = selCo;
     }
     public SelCoVo getSelCo() {
         return selCo;
     }

    public void setCapTureInfo(CapTureInfoVo capTureInfo) {
         this.capTureInfo = capTureInfo;
     }
     public CapTureInfoVo getCapTureInfo() {
         return capTureInfo;
     }

    public void setCmtsId(String cmtsId) {
         this.cmtsId = cmtsId;
     }
     public String getCmtsId() {
         return cmtsId;
     }

}
