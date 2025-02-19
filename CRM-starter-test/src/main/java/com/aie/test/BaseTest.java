package com.aie.test;

import org.junit.jupiter.api.BeforeAll;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.ai.appframe2.common.SessionManager;
import com.ai.appframe2.privilege.UserInfoInterface;
import com.ai.secframe.bean.sysmgr.UserInfoDefaultImpl;
import com.aie.TestApplication;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = TestApplication.class)
public abstract class BaseTest {

	@BeforeAll
	public static void before() {
		UserInfoInterface user = new UserInfoDefaultImpl();
		try {
			user.setID(10288116L);
			user.setCode("21TEST");
			user.set("ORG_TYPE", 2);
			user.setTenantId("21");
			SessionManager.setUser(user);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
