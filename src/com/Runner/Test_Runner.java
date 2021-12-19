package com.Runner;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.BaseClass.Base_Class;

public class Test_Runner extends Base_Class {
	public static WebDriver driver; // ----> static variable ; Null

	public static void main(String[] args) throws InterruptedException {

		driver = getBrowser("chrome");
		url("http://automationpractice.com/index.php");
		wait1();
		
		navigateTo("https://www.google.co.in/");
		back();
		refersh();
		forward();
		back();
		refersh();
		thread(5000);

		WebElement signin = driver.findElement(By.xpath("//a[@class='login']"));
		clickOnElement(signin);

		WebElement email = driver
				.findElement(By.xpath("(//input[@class='is_required validate account_input form-control'])[2]"));
		sendKeys(email, "kartee.sri@gmail.com");

		WebElement pass = driver
				.findElement(By.xpath("(//input[@class='is_required validate account_input form-control'])[3]"));
		sendKeys(pass, "password");

		WebElement sign = driver.findElement(By.xpath("(//button[@type='submit'])[3]"));
		clickOnElement(sign);
		
		thread(5000);
		
		WebElement dress = driver.findElement(By.xpath("(//a[@href=\"http://automationpractice.com/index.php?id_category=5&controller=category\"])[2]"));
		mouseclick(dress);

		//close();

	}

}
