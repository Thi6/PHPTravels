package com.bae.phptravels.test;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class PhpTravelsTest {

	public static WebDriver driver;
	
	@Before
	public void setup() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\Downloads\\chromedriver_win32/chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
	}
	
	@After
	public void teardown() {
		driver.quit();
	}
	
	@Test
	public void bookHotel() {
		driver.get("https://www.phptravels.net/");
		WebDriverWait wait1 = (new WebDriverWait(driver, 20));
		
		
		WebElement checkElement1 = driver.findElement(By.xpath("//*[@id=\"s2id_autogen3\"]/a"));
		checkElement1.click();
		checkElement1.sendKeys("London");
		
		wait1.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"select2-drop\"]/ul/li/ul/li[1]/div")));
		WebElement checkElement2 = driver.findElement(By.xpath("//*[@id=\"select2-drop\"]/ul/li/ul/li[1]/div"));
		checkElement2.click();
		
		WebElement checkElement3 = driver.findElement(By.xpath("//*[@id=\"dpd1\"]/div/input"));
		checkElement3.click();
		
		wait1.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div[10]")));
		WebElement checkElement4 = driver.findElement(By.xpath("/html/body/div[10]/div[1]/table/tbody/tr[5]/td[6]"));
		checkElement4.click();
		
		WebElement checkElement5 = driver.findElement(By.xpath("/html/body/div[11]/div[1]/table/tbody/tr[2]/td[1]"));
		checkElement5.click();
		
		WebElement checkElement6 = driver.findElement(By.name("travellers"));
		checkElement6.click();
		
		wait1.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("")));
		WebElement checkElement7 = driver.findElement(By.id("adultPlusBtn"));
		checkElement7.click();
		
	}
	
	
}
