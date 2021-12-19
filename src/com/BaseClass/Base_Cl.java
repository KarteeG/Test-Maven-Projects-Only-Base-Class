package com.BaseClass;


import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.support.ui.Select;

public class Base_Cl{
	
	public static WebDriver driver;
	
	public static WebDriver getBrowser(String type) {
		
		if (type.equalsIgnoreCase("chrome")) {
			System.setProperty("webdriver.chrome.driver", 
					System.getProperty("user.dir")+"//Driver//chromedriver.exe" );
			driver = new ChromeDriver();
		}else if (type.equalsIgnoreCase("firefox")) {
			System.setProperty("webdriver.gecko.driver", 
					System.getProperty("user.dir")+"//Driver//geckodriver.exe" );
			driver = new FirefoxDriver();
		}else if (type.equalsIgnoreCase("IE")) {
			System.setProperty("webdriver.ie.driver", 
					System.getProperty("user.dir")+"//Driver//iedriver.exe" );
			driver = new InternetExplorerDriver();
		}
		driver.manage().window().maximize();
		return driver;

	}
	
	public static void url(String url) {
		driver.get(url);
	}
	
	public static void wait1() {
		driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
	}
	
	public static void inputValue(WebElement Element,String value) {
		Element.sendKeys(value);
	}
	public static void clickOn(WebElement element) {
		element.click();
	}
	
	public static void thread(int seconds) throws InterruptedException {
		Thread.sleep(5000);
	}
	
	public static void select(WebElement element,int index) {
		Select s = new Select(element);
		//s.selectByValue("value");
		s.selectByIndex(index);
	}
	public static void javaScript(WebElement element) {
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("arguments[0].click();", element);
	}
	
	public static void close() {
		driver.close();
	}
	public static void scrollDown() {
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(0,1000)");
		
	}
	public static void screenShot() throws IOException {
		TakesScreenshot ts = (TakesScreenshot)driver;
		File screenshotAs = ts.getScreenshotAs(OutputType.FILE);
		File des = new File("C:\\Users\\u\\eclipse-workspace\\Revised_Selinium\\Screen Shots\\sec.png");
		FileUtils.copyFile(screenshotAs, des);

	}
	
	

}
