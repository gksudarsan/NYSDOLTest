package com.benefits;



import java.sql.SQLException;
import java.text.ParseException;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

//import com.relevantcodes.extentreports.ExtentTest;
import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.ui.base.TestBase;
import com.ui.locators.claimsIntake;
import com.ui.utilities.screenShot;


public class TC_CM_002_001 extends TestBase
{
	
String SSN = prop.getProperty("SSN");
	
	@Test(priority=1, description = "Test sample")
	public void Testing123() throws Exception
	{
		ExtentTest test = report.createTest("Log in to Benefits Unemployment Insurance");
		//Logging in to application...
		claimsIntake cl = new claimsIntake();
		System.out.println(SSN);
		screenShot screen = new screenShot();
	      String screenShotPath = screenShot.takeSnapShot(driver, "target\\error.jpg");
	       test.log(Status.FAIL,"Login is not successful");
	       test.addScreenCaptureFromPath(screenShotPath);
		
		  driver.findElement(By.xpath("//span[text()='LOG IN ']")).click();
			Thread.sleep(5000);
			test.log(Status.PASS,"User Launched website");
			//System.out.println("before refresh");
			driver.navigate().refresh();Thread.sleep(5000);
		
			  System.out.println("after refresh");
			 // driver.navigate().to(driver.getCurrentUrl());Thread.sleep(5000);
			 System.out.println("after navigate");
			 // driver.get(driver.getCurrentUrl());Thread.sleep(5000);
			  System.out.println("after navigate last");
			
			  
	     // driver.findElement(By.xpath("//input[@name='loginform:username']")).sendKeys("NDFJP3");
			  enterTextbox("Username","NDFJP3");
			  
			  test.log(Status.PASS,"User entered Username");
			  enterTextbox("Password","Admin@12345678");
			  
			  test.log(Status.PASS,"User entered Password");
			  //clickButton("Sign In");
			  
			  //test.log(Status.PASS,"User clicked on Login");
	     //driver.findElement(By.xpath("//input[@name='loginform:password']")).sendKeys("Admin@12345678");
	     driver.findElement(By.xpath("//button[@name='loginform:altSubmit']//preceding::span[1]")).click();Thread.sleep(5000);
	       //driver.navigate().refresh();Thread.sleep(5000);
	       driver.navigate().refresh();Thread.sleep(5000);
	     // screenShot screen = new screenShot();
	       screenShotPath = screenShot.takeSnapShot(driver, "target\\error.jpg");
	       test.log(Status.FAIL,"Login is not successful");
	       test.addScreenCaptureFromPath(screenShotPath);
	       
	       driver.findElement(By.xpath("//button[@class='mat-focus-indicator mat-raised-button mat-button-base mat-primary']"));
	       driver.findElement(By.xpath("//span[text()='Menu']")).click();Thread.sleep(2000);
	       driver.findElement(By.xpath("//span[text()='Unemployment Claim']")).click();Thread.sleep(2000);
	       driver.findElement(By.xpath("//span[text()='File Unemployment Claim']")).click();Thread.sleep(2000);
	       driver.findElement(By.xpath("//input[@id='ssnBeanId']")).sendKeys(SSN);Thread.sleep(1000);
	       driver.findElement(By.xpath("//input[@id='confirmSsnBeanId']")).sendKeys(SSN);
	       driver.findElement(By.xpath("//button[@type='submit']")).click();  driver.findElement(By.xpath("//span[text()='LOG IN ']")).click();
			Thread.sleep(5000);
			//System.out.println("before refresh");
			driver.navigate().refresh();Thread.sleep(5000);
		
			  System.out.println("after refresh");
			 // driver.navigate().to(driver.getCurrentUrl());Thread.sleep(5000);
			 System.out.println("after navigate");
			 // driver.get(driver.getCurrentUrl());Thread.sleep(5000);
			  System.out.println("after navigate last");
			
		  
	      driver.findElement(By.xpath("//input[@name='loginform:username']")).sendKeys("NDFJP3");
	       
	       driver.findElement(By.xpath("//input[@name='loginform:password']")).sendKeys("Admin@12345678");
	       driver.findElement(By.xpath("//button[@name='loginform:altSubmit']//preceding::span[1]")).click();Thread.sleep(5000);
	       //driver.navigate().refresh();Thread.sleep(5000);
	       driver.navigate().refresh();Thread.sleep(5000);
	       driver.findElement(By.xpath("//button[@class='mat-focus-indicator mat-raised-button mat-button-base mat-primary']"));
	       driver.findElement(By.xpath("//span[text()='Menu']")).click();Thread.sleep(2000);
	       driver.findElement(By.xpath("//span[text()='Unemployment Claim']")).click();Thread.sleep(2000);
	       driver.findElement(By.xpath("//span[text()='File Unemployment Claim']")).click();Thread.sleep(2000);
	       driver.findElement(By.xpath("//input[@id='ssnBeanId']")).sendKeys(SSN);Thread.sleep(1000);
	       driver.findElement(By.xpath("//input[@id='confirmSsnBeanId']")).sendKeys(SSN);
	       driver.findElement(By.xpath("//button[@type='submit']")).click();  driver.findElement(By.xpath("//span[text()='LOG IN ']")).click();
			Thread.sleep(5000);
			//System.out.println("before refresh");
			driver.navigate().refresh();Thread.sleep(5000);
		
			  System.out.println("after refresh");
			 // driver.navigate().to(driver.getCurrentUrl());Thread.sleep(5000);
			 System.out.println("after navigate");
			 // driver.get(driver.getCurrentUrl());Thread.sleep(5000);
			  System.out.println("after navigate last");
			
		  
	      driver.findElement(By.xpath("//input[@name='loginform:username']")).sendKeys("NDFJP3");
	       
	       driver.findElement(By.xpath("//input[@name='loginform:password']")).sendKeys("Admin@12345678");
	       driver.findElement(By.xpath("//button[@name='loginform:altSubmit']//preceding::span[1]")).click();Thread.sleep(5000);
	       //driver.navigate().refresh();Thread.sleep(5000);
	       driver.navigate().refresh();Thread.sleep(5000);
	       driver.findElement(By.xpath("//button[@class='mat-focus-indicator mat-raised-button mat-button-base mat-primary']"));
	       driver.findElement(By.xpath("//span[text()='Menu']")).click();Thread.sleep(2000);
	       driver.findElement(By.xpath("//span[text()='Unemployment Claim']")).click();Thread.sleep(2000);
	       driver.findElement(By.xpath("//span[text()='File Unemployment Claim']")).click();Thread.sleep(2000);
	       driver.findElement(By.xpath("//input[@id='ssnBeanId']")).sendKeys(SSN);Thread.sleep(1000);
	       driver.findElement(By.xpath("//input[@id='confirmSsnBeanId']")).sendKeys(SSN);
	       driver.findElement(By.xpath("//button[@type='submit']")).click();
		
		
		
		
		
		System.out.println("test test ..................");
		
	}
	
	public void enterTextbox(String xpathParameter,String value) {
		driver.findElement(By.xpath("//*[.='"+xpathParameter+"']//following::input[1]")).sendKeys(value);
	}
	
	public void clickButton(String xpathParameter) {
		driver.findElement(By.xpath("//button[.='"+xpathParameter+"'][1]"));	
	}

	
	//Logging out of application...
	@Test
	public void Testing() throws Exception
	{
		ExtentTest test = report.createTest("Log in to second testcase");
		test.log(Status.PASS, "Tested successfully");
		//Logging in to application...
		claimsIntake cl = new claimsIntake();
		System.out.println(SSN);
		  driver.findElement(By.xpath("//span[text()='LOG IN ']")).click();
			Thread.sleep(5000);
	}
	
	@Test
	public void Testing_thirdTestcase() throws Exception
	{
		ExtentTest test = report.createTest("Log in to second testcase");
		test.log(Status.PASS, "Tested successfully");
		//Logging in to application...
		claimsIntake cl = new claimsIntake();
		System.out.println(SSN);
		  driver.findElement(By.xpath("//span[text()='LOG IN ']")).click();
			Thread.sleep(5000);
	}

}