package Punter;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;


	public class Demo1
	{
		@Test
		public void tc1() throws InterruptedException
		{
			System.setProperty("webdriver.chrome.driver", "./Software/chromedriver.exe");
			WebDriver driver = new ChromeDriver();
			driver.get("https://www.facebook.com");
			Thread.sleep(2000);
			driver.findElement(By.cssSelector("input[name='email']")).sendKeys("8605764303");
			Thread.sleep(2000);
			driver.findElement(By.cssSelector("input[id='pass']")).sendKeys("111222333");
			Thread.sleep(2000);
			driver.findElement(By.cssSelector("button[name='login']")).click();
			Reporter.log("pass",true);
			driver.close();
			
		}
		
		@Test
		public void tc2() throws InterruptedException
		{
			System.setProperty("webdriver.gecko.driver", "./Software/geckodriver.exe");
			WebDriver driver = new FirefoxDriver();
			driver.get("https://www.facebook.com");
			Thread.sleep(2000);
			driver.findElement(By.cssSelector("input[name='email']")).sendKeys("8605764303");
			Thread.sleep(2000);
			driver.findElement(By.cssSelector("input[id='pass']")).sendKeys("111222333");
			Thread.sleep(2000);
			driver.findElement(By.cssSelector("button[name='login']")).click();
			Reporter.log("pass",true);
			driver.close();
			
		}

	}