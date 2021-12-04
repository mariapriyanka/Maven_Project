package com.Dec_Mini_Project;

import java.awt.AWTException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class Runner_class extends Base_class{
	public static void main(String[] args) throws AWTException {
		browser("chrome");
		getUrl("http://automationpractice.com/index.php");
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		WebElement element = driver.findElement(By.xpath("//a[@title='Women']"));
		Actions a =new Actions(driver);
		a.moveToElement(element).build().perform();
		WebElement summerDress = driver.findElement(By.xpath("(//a[@title='Summer Dresses'])[1]"));
		clickElement(summerDress);
		scrolldown();
		WebElement Dress1 = driver.findElement(By.xpath("//img[@title='Printed Chiffon Dress']"));
		clickElement(Dress1);
		
		WebElement add = driver.findElement(By.xpath("(//button[@type='submit'])[3]"));
		clickElement(add);
		WebElement proceed = driver.findElement(By.xpath("//a[@title='Proceed to checkout']"));
		clickElement(proceed);
		close();
		
		
	}



}
