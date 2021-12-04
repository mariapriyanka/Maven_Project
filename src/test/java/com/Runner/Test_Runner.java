package com.Runner;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Test_Runner {

	public static void main(String[] args) throws AWTException, InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				System.getProperty("user.dir")+"/Driver_1/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://automationpractice.com/index.php");
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		WebElement women = driver.findElement(By.xpath("//a[@title='Women']"));
		Actions a =new Actions(driver);
		a.moveToElement(women).build().perform();
		driver.findElement(By.xpath("//a[@title='Casual Dresses']")).click();
		Robot r=new Robot();
		r.keyPress(KeyEvent.VK_DOWN);
		//r.keyRelease(KeyEvent.VK_UP);
		Thread.sleep(2000);
		r.keyPress(KeyEvent.VK_DOWN);
		//r.keyRelease(KeyEvent.VK_UP);
		Thread.sleep(1000);
		r.keyPress(KeyEvent.VK_DOWN);
		Thread.sleep(1000);
		r.keyPress(KeyEvent.VK_DOWN);
		Thread.sleep(1000);
		r.keyPress(KeyEvent.VK_DOWN);
		Thread.sleep(1000);
		r.keyPress(KeyEvent.VK_DOWN);
		Thread.sleep(1000);
		r.keyPress(KeyEvent.VK_DOWN);
		Thread.sleep(1000);
		WebElement addtocart = driver.findElement(By.xpath("//span[contains(text(),'Add to cart')]"));
		a.moveToElement(addtocart).click().build().perform();
		driver.findElement(By.xpath("//span[contains(text(),'Proceed to checkout')]")).click();
}
}
