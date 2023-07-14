package Punter;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.time.Duration;

import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.Test;

public class Script01Test
{ 
	public static void main(String[] args) 
	{
		 WebDriver driver = new ChromeDriver();
		 driver.manage().window().maximize();
		 driver.get("https://www.amazon.in");
		 driver.close();
		 
	}
}
	//WebDriver driver;


	/*public void test2() throws FileNotFoundException, IOException, ParseException
	{
		String BROWSER = System.getProperty("browser");

		if (BROWSER.equalsIgnoreCase("chrome")) 
		{
			driver = new ChromeDriver();
		} 
		else if (BROWSER.equalsIgnoreCase("firefox")) 
		{
			driver = new FirefoxDriver();
		} 
		else if (BROWSER.equalsIgnoreCase("ie"))
		{
			driver = new InternetExplorerDriver();
		} 
		else
		{
			driver = new ChromeDriver();
		}

		String URL = System.getProperty("url");

		driver.get(URL);
		driver.manage().window().maximize();
		driver.close();*/
         
		
	
	
