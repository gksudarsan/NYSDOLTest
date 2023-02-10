package com.ui.pages;



import java.sql.SQLException;
import java.text.ParseException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.remote.ErrorHandler.UnknownServerException;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.ui.base.TestBase;
import com.ui.locators.claimsIntake;
import com.ui.utilities.screenShot;


public class ClaimsIntake extends TestBase
{
	
	
	claimsIntake cl = new claimsIntake();

	public void creatingclaims(UnknownServerException driver, String snapshotPath, String SimpleClassname, String EAN) throws ClassNotFoundException, SQLException, InterruptedException, ParseException
	{		
		
		((WebDriver) driver).manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		
		cl.file_unemployement_claim().click();	
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}