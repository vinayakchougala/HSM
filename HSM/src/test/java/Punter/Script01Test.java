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
	WebDriver driver;
  @Test
  public void test2() throws FileNotFoundException, IOException, ParseException
  {
	    JSONParser jp = new JSONParser();
		Object ob = jp.parse(new FileReader("./jsondata/lims.json"));
		JSONObject map = (JSONObject) ob;

		String BROWSER = (String) (map.get("browser"));
		System.out.println(BROWSER);
		
		if(BROWSER.equalsIgnoreCase("chrome"))
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
		driver = new  ChromeDriver();
		}
		
		String URL = (String) (map.get("url"));
		System.out.println(URL);
		
		
		 driver.get(URL);
		 driver.manage().window().maximize();
		 driver.close();
		 
	 /*WebDriver driver = new ChromeDriver();
	 driver.get("https://www.amazon.in");
	 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	 
	 driver.manage().window().maximize();
	 driver.close();*/
}
}
