package com.ui.base;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.SQLException;
import java.time.Duration;
import java.util.HashMap;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.checkerframework.checker.guieffect.qual.AlwaysSafe;
import org.openqa.selenium.Proxy;
import org.openqa.selenium.Proxy.ProxyType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.firefox.ProfilesIni;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.beust.jcommander.Parameter;
//import com.relevantcodes.extentreports.ExtentReports;
//import com.relevantcodes.extentreports.ExtentTest;
import com.ui.utilities.TestUtil;

import org.openqa.selenium.remote.DesiredCapabilities;

public class TestBase {
	//public static String br;
	
	
	
	public static ExtentReports report = new ExtentReports();
	public static ExtentSparkReporter spark = new ExtentSparkReporter("target\\reports.html");
	
	public static WebDriver driver;
	public static Properties prop;
	
	public static WebDriverWait wait;
	
	
	//public static Explicit Wait wait1;
	
	public TestBase(WebDriver driver)
	{
			wait = new WebDriverWait(driver,Duration.ofSeconds(2000));
		
		
		 
	}
	
	
	
	
	public TestBase()
	{
		

		try 
		{
			prop=new Properties();
			FileInputStream ip=new FileInputStream(System.getProperty("user.dir")+"\\src\\main\\java"
					+ "\\com\\ui\\configuration\\config.properties");
			prop.load(ip);
			
			/*
			 * BatchProp=new Properties();
			 * 
			 * FileInputStream ip1=new
			 * FileInputStream(System.getProperty("user.dir")+"\\src\\main\\java" +
			 * "\\com\\ui\\configuration\\BatchConfig.properties"); BatchProp.load(ip1);
			 */
			
	
		}
		catch(FileNotFoundException e)
		{
			e.printStackTrace();
		}
		catch(IOException e)
		{
			e.printStackTrace();
		}
	}
	
	
	@Parameters({"browser"})
	
	public static void initialization(String browser)
     
	{
		browser=prop.getProperty("browsername");
		System.out.println("Running Browser is :" +browser);
		//String browser=prop.getProperty("browser");
	
		if(browser.equalsIgnoreCase("chrome"))
		{
			System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir")+"\\Driver\\chromedriver.exe");
			
			
			Map<String, Object> prefs = new HashMap<String,Object>();
			prefs.put("profile.default_content_setting.popups", 0);
			prefs.put("download.default_directory", System.getProperty("user.dir")+"\\Download\\");
			ChromeOptions options =new ChromeOptions();
			//Map<String, Object> prefs = new HashMap<String,Object>();
			//prefs.put("profile.default_content_setting.popups", 0);
			
			options.setExperimentalOption("prefs", prefs);

			
		options.setCapability (CapabilityType.ACCEPT_SSL_CERTS, true);		
		driver=new ChromeDriver(options);
		}
		else if(browser.equals("firefox"))
		{
			System.setProperty("webdriver.gecko.driver",System.getProperty("user.dir")+"\\Driver\\geckodriver.exe");
			driver=new FirefoxDriver();
		}
		else if(browser.equals("ie"))
		{
			System.setProperty("webdriver.ie.driver",System.getProperty("user.dir")+"\\Driver\\IEDriverServer.exe");
			driver=new InternetExplorerDriver();
		}

	
		//edge
		
		//System.setProperty("webdriver.edge.driver",System.getProperty("user.dir")+"\\Driver\\msedgedriver.exe");
		//driver = new EdgeDriver();
		
				driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(TestUtil.PAGE_LOAD_TIMEOUT, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(TestUtil.IMPLICIT_WAIT, TimeUnit.SECONDS);
	
}
	
	
	
	@Parameters({"browser"})
	@BeforeTest
	public void setup(@Optional("browser")String browser) throws ClassNotFoundException, SQLException
	{
		//public void LoginAccountProcess(@Optional("Abc")String name) throws
	//	FileNotFoundException, IOException, InterruptedException {
		//System.out.println("Name of th login Id is ==>"+name);
		//Opening browser... Hitting URL...
		initialization(browser);
		wait=new WebDriverWait(driver,Duration.ofSeconds(50));
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		driver.get(prop.getProperty("applicationUrl"));
		
		//ExtentTest test;
		//ExtentReports report;
		//report = new ExtentReports(System.getProperty("user.dir")+"ExtentReportResults.html");
		//test = report.startTest("ExtentDemo");
		
		
		report.attachReporter(spark);
		
		
	}
	
	  @AfterTest public void tearDownCT_ST() throws InterruptedException {
		/*  ExtentReports report = new ExtentReports(System.getProperty("user.dir")+"ExtentReportResults.html");
			
		  ExtentTest test = null;
		report.endTest(test);
		  report.flush();
		 */ 
		  report.flush();
	  driver.close(); driver.quit(); }
	 
	
	
}
