package aca.first.test;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.testng.annotations.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import static org.testng.AssertJUnit.assertEquals;

/*
Steps
1: Opened "Mozilla Firefox".
2: Enter "compensation.codebnb.me" in the browser field.
Actual result: Should be redirect on the "http://compensation.codebnb.me/" page.
Expected result: Redirected on the "http://compensation.codebnb.me/" page.
 */
public class MyFirstWebDriverTest {
	
	@Test()
	public void myFirstTest(){
		 WebDriver driver = new FirefoxDriver();
		// driver.get("http://aca.am");
		driver.get("http://compensation.codebnb.me/");
		driver.navigate().to("http://compensation.codebnb.me/");
		//Assert.assertEquals("compensation", driver.getTitle(), "Compensation tool");

		assertEquals("COMPENSATION", driver.findElement(By.xpath("//span[contains(.,'Compensation')]")).getText());

		assertEquals("SIGN IN", driver.findElement(By.xpath("//a[@href='/accounts/login']")).getText());

		 driver.close();
		 driver.quit();
	}

}

