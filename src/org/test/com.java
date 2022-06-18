package org.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class com {
	
	
	   public static void main(String[] args) throws InterruptedException {
		
		   System.setProperty("webdriver.chrome.driver",
				   "C:\\Users\\ARAVIND\\eclipse-workspace\\Revision1\\ref\\chromedriver.exe");
		   
		   
		   WebDriver driver = new ChromeDriver();
		   
		   driver.get("https://www.facebook.com/");
		   
		   driver.manage().window().maximize();
		   
		   WebElement mail = driver.findElement(By.id("email"));
		   mail.sendKeys("aravindkanna529@gmail.com");
		   
//		   WebElement pass = driver.findElement(By.id("pass"));
//		   pass.sendKeys("aravind 1998");
		   
		   //driver.findElement(By.name("login")).click();
		   Thread.sleep(3000);
		   WebElement click = driver.findElement(By.xpath("(//a[@role='button'])[2]"));
		   
		   click.click();
		   
		   Thread.sleep(3000);
		   
		   driver.findElement(By.name("firstname")).sendKeys("aravind");
		   
		   driver.findElement(By.name("lastname")).sendKeys("kanna");
		   
		   driver.findElement(By.xpath("(//input[@class='inputtext _58mg _5dba _2ph-'])[3]")).sendKeys("9176379634");
		   
		   driver.findElement(By.id("password_step_input")).sendKeys("aravind");
		   
		   WebElement dayselect = driver.findElement(By.id("day"));
		   
		   Select select = new Select(dayselect);
		   
		   select.selectByVisibleText("17");
		   
		   Thread.sleep(3000);
		   
		    
		   
		   
		   
		   
		   
	}

}
