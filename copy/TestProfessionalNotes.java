package com.enhapp.web.tests;

import java.awt.AWTException;
import java.io.IOException;
import java.security.GeneralSecurityException;

import org.testng.annotations.Test;

import com.enhapp.common.library.Constants;
import com.enhapp.common.library.DriverManager;
import com.enhapp.web.pom.LoginPagePo;
import com.enhapp.web.pom.ProfessionalNotesPo;

public class TestProfessionalNotes extends DriverManager implements Constants {
	@Test(priority = 1, description = "TC_01 : Verify Professional is able to create a notes")
	public void createChallengeCorporate() throws IOException, GeneralSecurityException, InterruptedException, AWTException {
		LoginPagePo loginPagePo = new LoginPagePo(webdriver);
		loginPagePo.getLoginPage();
		loginPagePo.loginFunction(getRole());
		
//		ProfessionalNotesPo obj = new ProfessionalNotesPo(webdriver);
//		obj.createNotes();
	}
	

}
