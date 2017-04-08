package aca.first.test;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import static org.testng.AssertJUnit.assertEquals;

/*
Steps
1: Opened "Mozilla Firefox".
2: Enter "compensation.codebnb.me" in the browser field.
3: Click on the button "SIGN IN"
4: In opened window enter valid "ligin" and "password"
Actual result: Should be redirect on the "http://compensation.codebnb.me/" page.
Expected result: Redirected on the "http://compensation.codebnb.me/" page.
 */
public class MyFirstWebDriverTest {
	//
	//
	@Test()
	public void myFirstTest(){
		// Opened "Mozilla Firefox"
		 WebDriver driver = new FirefoxDriver();
		// Open http://compensation.codebnb.me/ page
		driver.get("http://compensation.codebnb.me/");

		// Make sure that our site has an element by this xpath    //span[contains(.,'Compensation')]
		assertEquals("COMPENSATION", driver.findElement(By.xpath("//span[contains(.,'Compensation')]")).getText());

		// Make sure that our site has an element by this xpath    //a[@href='/accounts/login']"
		assertEquals("SIGN IN", driver.findElement(By.xpath("//a[@href='/accounts/login']")).getText());

		// Click on the button "SIGN IN"
		driver.findElement(By.xpath("//a[@href='/accounts/login']")).click();
		//shoud be opened "ligin" and "password" popup window

	/*	driver.findElement(By.xpath("//input[@id='id_username']")).sendKeys("dallas" );
		driver.findElement(By.xpath("//input[@id='id_password']")).sendKeys("Password" );
		driver.findElement(By.xpath("//input[@class='btn blockBtn blue']")).click(); */

		 	 driver.close();
		 	 driver.quit();
	}

}

