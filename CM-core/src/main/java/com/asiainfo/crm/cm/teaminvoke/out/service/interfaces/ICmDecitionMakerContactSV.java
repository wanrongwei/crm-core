package com.asiainfo.crm.cm.teaminvoke.out.service.interfaces;

import com.asiainfo.crm.cm.model.ivalues.IContactValue;

public interface ICmDecitionMakerContactSV {
	/**
	 * 
	 * @Function queryDecitionMakerContact
	 * @Description 
	 *
	 * @param custId
	 * @param contType
	 * @return {BILL_ID:联系号码,CONT_EMAIL：联系email}
	 * @throws Exception
	 *
	 * @version v1.0.0
	 * @author yangjh
	 * @date 2014-5-12 上午11:21:58
	 * 
	 * <strong>Modification History:</strong><br>
	 * Date         Author          Version            Description<br>
	 * ---------------------------------------------------------<br>
	 * 2014-5-12     yangjh           v1.0.0               修改原因<br>
	 */
	public IContactValue queryDecitionMakerContact(long custId,int contType) throws Exception;
}
