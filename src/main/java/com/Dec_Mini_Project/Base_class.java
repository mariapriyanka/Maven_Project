package com.Dec_Mini_Project;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.support.ui.Select;

public class Base_class {
	public static WebDriver driver;
	public static WebDriver browser(String browser_Name) {
		
			if(browser_Name.equalsIgnoreCase("chrome"))
		{
		
					System.setProperty("webdriver.chrome.driver",
					System.getProperty("user.dir")+"/Driver_1/chromedriver.exe");
				 driver=new ChromeDriver();
		}
		else if(browser_Name.equalsIgnoreCase("firefox")) {
		
			System.setProperty("webdriver.firefox.driver",
					System.getProperty("user.dir")+"/Driver_1/geckodriver.exe");
					 driver=new FirefoxDriver();
				
		}
		else if(browser_Name.equalsIgnoreCase("InternetExplorer")) {
			
			System.setProperty("webdriver.firefox.driver",
					System.getProperty("user.dir")+"/Driver_1/IEDriverServer.exe");
				 driver=new InternetExplorerDriver();
				
		}
		driver.manage().window().maximize();
		return driver;
	}
	
		public static void getUrl(String url) {
		driver.get(url);
	}
	public static void clickElement(WebElement element)
	{
		element.click();
	}
	
	public static void scrolldown() throws AWTException {
		Robot r=new Robot();
		r.keyPress(KeyEvent.VK_DOWN);
		r.keyRelease(KeyEvent.VK_UP);
		r.keyPress(KeyEvent.VK_DOWN);
		r.keyRelease(KeyEvent.VK_UP);
		r.keyPress(KeyEvent.VK_DOWN);
		r.keyRelease(KeyEvent.VK_UP);
		r.keyPress(KeyEvent.VK_DOWN);
		r.keyRelease(KeyEvent.VK_UP);
		r.keyPress(KeyEvent.VK_DOWN);
		r.keyRelease(KeyEvent.VK_UP);
		r.keyPress(KeyEvent.VK_DOWN);
		r.keyRelease(KeyEvent.VK_UP);
		r.keyPress(KeyEvent.VK_DOWN);
		r.keyRelease(KeyEvent.VK_UP);
	}
	public static void close() {
	driver.close();
	}
	public static void dropdown(String type,WebElement element, String value )
	{
	Select s=new Select(element);
	if(type.equalsIgnoreCase("index")) {
		int index=Integer.parseInt(value);
		s.selectByIndex(index);
	}
	else if(type.equalsIgnoreCase(value)) {
		s.selectByValue(value);
	}
	else if(type.equalsIgnoreCase("text")) {
		s.selectByVisibleText(value);
	}
	}
	
	}

