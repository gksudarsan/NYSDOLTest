package com.ui.locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;

import com.ui.base.TestBase;

public class claimsIntake extends TestBase {


	public WebElement file_unemployement_claim (){
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//td/a/span[contains(text(),'File Unemployment Claim')]")));
		return driver.findElement(By.xpath("//td/a/span[contains(text(),'File Unemployment Claim')]"));

	}

	public WebElement unemployement_claim (){
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//td/a/span[contains(text(),'Unemployment Claim')]")));
		return driver.findElement(By.xpath("//td/a/span[contains(text(),'Unemployment Claim')]"));

	}

}


