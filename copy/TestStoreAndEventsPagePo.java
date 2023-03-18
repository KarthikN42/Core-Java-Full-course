package com.enhapp.web.tests;

import java.awt.AWTException;
import java.io.IOException;
import java.security.GeneralSecurityException;

import org.testng.annotations.Test;

import com.enhapp.common.library.Constants;
import com.enhapp.common.library.DriverManager;
import com.enhapp.web.pom.LoginPagePo;
import com.enhapp.web.pom.StoreAndEventPagePo;

public class TestStoreAndEventsPagePo extends DriverManager implements Constants {
	@Test(priority = 1, description = "TC_01 : Verify Partner is able to create a store and events for B2B")
	public void TestStoreAndEvens() throws IOException, GeneralSecurityException, InterruptedException, AWTException {
		LoginPagePo loginPagePo = new LoginPagePo(webdriver);
		loginPagePo.getLoginPage();
		loginPagePo.loginFunction(getRole());
		
		StoreAndEventPagePo obj = new  StoreAndEventPagePo(webdriver);
		obj.createStoreAndeventsB2C();

}
}