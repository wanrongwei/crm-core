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

public class LineOptionResultVo implements Serializable {
	private static final long serialVersionUID = -11539193223263531L;
    private String msg;
    private List<LineOptionVo> lineOptions;
	public String getMsg() {
		return msg;
	}
	public void setMsg(String msg) {
		this.msg = msg;
	}
	public List<LineOptionVo> getLineOptions() {
		return lineOptions;
	}
	public void setLineOptions(List<LineOptionVo> lineOptions) {
		this.lineOptions = lineOptions;
	}
}
