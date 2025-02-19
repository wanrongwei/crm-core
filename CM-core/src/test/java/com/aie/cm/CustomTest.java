package com.aie.cm;

import org.junit.jupiter.api.Test;

import com.ai.appframe2.service.ServiceFactory;
import com.aie.test.BaseTest;
import com.asiainfo.crm.cm.model.ivalues.IContactValue;
import com.asiainfo.crm.cm.service.interfaces.ICmxContactSV;

public class CustomTest extends BaseTest {

	@Test
	public void test() {
		ICmxContactSV service = (ICmxContactSV)ServiceFactory.getService(ICmxContactSV.class);
		try {
			IContactValue contact = service.queryCustContactsByCustId(21210013351419L);
			System.out.println(contact);
			System.out.println(contact.getEffectiveDate());
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
