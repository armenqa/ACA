package aca.first.test;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.Iterator;
import java.util.Set;

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
	public void myFirstTest() throws InterruptedException {
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
		//shoud be opened "login" and "password" popup window

		Thread.sleep(4000);
		// sendkey for the input field "username"
		driver.findElement(By.xpath("//input[@id='id_username']")).sendKeys("dallas" );
		// sendkey for the input field "password"
		driver.findElement(By.xpath("//input[@id='id_password']")).sendKeys("Password" );
		Thread.sleep(6000);
		//press submit
		driver.findElement(By.xpath("//input[@class='btn blockBtn blue']")).click();
		Thread.sleep(10000);
        //navigate to the Surveys page
        driver.findElement(By.xpath("//a[text()='Employees']")).click();
        Thread.sleep(10000);



        //click on the "Last name" icon
        driver.findElement(By.xpath(".//*[@id='employee_table']/div/div[2]/table/thead/tr/th[2]/button")).click();
        Thread.sleep(10000);
        //click on the input field "Last name icon" and enter the "Tina"
        driver.findElement(By.xpath(".//*[@id='first_name_panel']/div[1]/div[1]/input")).sendKeys("Tina" );
        Thread.sleep(10000);
        //click on the search icon  //should be shown only "Tyna" information in the list
        driver.findElement(By.xpath(".//*[@id='first_name_panel']/div[1]/div[1]/button")).click();
        Thread.sleep(10000);
        //click on the search icon
        driver.findElement(By.xpath(".//*[@id='employee_table']/div/div[2]/table/thead/tr/th[2]/button")).click();
        Thread.sleep(10000);
        //clear "Tena" in the input field
        driver.findElement(By.xpath(".//*[@id='first_name_panel']/div[1]/div[1]/input")).clear();
        //click on the search icon  //should be shown all information in the list
        driver.findElement(By.xpath(".//*[@id='first_name_panel']/div[1]/div[1]/button")).click();
        Thread.sleep(10000);

        //navigate second page of "Employees"
        driver.findElement(By.xpath(".//html/body/div/div[3]/ul/li[4]/a")).click();
        Thread.sleep(6000);
        










		driver.close();
		driver.quit();


	}

}

