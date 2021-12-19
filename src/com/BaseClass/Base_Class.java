package com.BaseClass;


import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.interactions.Actions;

public class Base_Class {

	public static WebDriver driver; // ----> static variable ; Null

	public static WebDriver getBrowser(String type) {

		if (type.equalsIgnoreCase("chrome")) {
			System.setProperty("webdriver.chrome.driver",
					System.getProperty("user.dir") + "//Driver//chromedriver.exe");
			 driver = new ChromeDriver();
		} 
		else if (type.equalsIgnoreCase("firefox")) {
			System.setProperty("webdriver.gecko.driver", System.getProperty("user.dir") + "//Driver//geckodriver.exe");
			 driver = new FirefoxDriver();
		}
		else if (type.equalsIgnoreCase("Ie")) {
			System.setProperty("webdriver.ie.driver", System.getProperty("user.dir") + "//Driver//iedriver.exe");
			 driver = new InternetExplorerDriver();
		}
		driver.manage().window().maximize();
		return driver;
		

	}
	
	public static void navigateTo(String value) {
		driver.navigate().to(value);
	}
	public static void back() {
		driver.navigate().back();
	}
	public static void forward() {
		driver.navigate().forward();
	}
	
	public static  void refersh() {
		driver.navigate().refresh();

	}

	public static void clickOnElement(WebElement element) {
		element.click();
	}

	public static void sendKeys(WebElement element, String value) {
		element.sendKeys(value);
	}

	public static void url(String url) {
		driver.get(url);

	}
	
	public static void wait1() {
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	}

	public static void close() {
		driver.close();
	}

	public static void quit() {
		driver.quit();
	}
	
	public static void thread(long seconds) throws InterruptedException {
		Thread.sleep(seconds);
	}
	
	public static void mouseclick(WebElement element) {
		Actions a=new Actions(driver);
		a.click(element).build().perform();
	}
	

}
