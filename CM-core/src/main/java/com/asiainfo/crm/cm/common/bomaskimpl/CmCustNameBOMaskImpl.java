package com.asiainfo.crm.cm.common.bomaskimpl;

import com.ai.appframe2.bo.IBOMask;
import com.ai.appframe2.common.DataContainerInterface;
import com.ai.appframe2.privilege.UserInfoInterface;
import org.apache.commons.lang.StringUtils;

/**
 * Created by IntelliJ IDEA.
 * Class Name : CmCustNameBOMaskImpl;
 *
 * @author: huzhengquan
 * @date: 11-9-21
 * @time: 上午12:27
 * <p/>
 * Modification History:
 * Date 					Author			Version				Description
 * -----------------------------------------------------------------------*
 * 11-9-21    	huzhengquan           v1.0.0               创建
 */
public class CmCustNameBOMaskImpl implements IBOMask {

	public Object maskBOAttr(UserInfoInterface userInfo, DataContainerInterface dc, Object initValue) {
		if ((userInfo == null) || (StringUtils.isBlank(userInfo.getCode()))) {
			return null;
		}
		if ((userInfo.getCode().equalsIgnoreCase("f888888")) &&
				(initValue != null) && ((initValue instanceof String))) {
			String tmp = (String) initValue;
			int len = tmp.length();
			StringBuilder sb = new StringBuilder(len);
			if ((len == 2) || (len == 3)) {
				sb.append(tmp.charAt(0));
				for (int i = 1; i < len; i++) {
					sb.append("*");
				}
			} else if (len >= 4) {
				sb.append(tmp.charAt(0));
				sb.append(tmp.charAt(1));
				for (int i = 2; i < len; i++)
					sb.append("*");
			} else {
				return null;
			}

			return sb.toString();
		}
		return null;  //TODO impl.
	}
}
