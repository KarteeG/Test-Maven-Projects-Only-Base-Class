package com.Runner;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.BaseClass.Base_Cl;

public class Runner extends Base_Cl {
	public static WebDriver driver;

	public static void main(String[] args) throws InterruptedException, IOException {

		driver = getBrowser("chrome");

		url("https://adactinhotelapp.com/index.php");

		wait1();
		
		navi

		WebElement user = driver.findElement(By.id("username"));
		inputValue(user, "karteeng");

		WebElement pass = driver.findElement(By.id("password"));
		inputValue(pass, "13990T");

		WebElement login = driver.findElement(By.xpath("//input[@type='Submit']"));
		clickOn(login);

		thread(6000);

		WebElement location = driver.findElement(By.id("location"));
		select(location, 3);

		WebElement hotels = driver.findElement(By.id("hotels"));
		select(hotels, 3);

		WebElement room = driver.findElement(By.id("room_type"));
		select(room, 3);

		WebElement nor = driver.findElement(By.id("room_nos"));
		select(nor, 3);

		WebElement cid = driver.findElement(By.id("datepick_in"));
		inputValue(cid, "02/12/2021");

		WebElement cod = driver.findElement(By.id("datepick_out"));
		inputValue(cod, "03/12/2021");

		WebElement adults = driver.findElement(By.id("adult_room"));
		select(adults, 4);

		WebElement cpr = driver.findElement(By.id("child_room"));
		select(cpr, 4);

		WebElement submit = driver.findElement(By.id("Submit"));
		javaScript(submit);
		thread(6000);

		WebElement btn = driver.findElement(By.id("radiobutton_0"));
		clickOn(btn);

		WebElement con = driver.findElement(By.id("continue"));
		clickOn(con);

		WebElement fname = driver.findElement(By.name("first_name"));
		inputValue(fname, "Harsh Ajith");

		WebElement lname = driver.findElement(By.name("last_name"));
		inputValue(lname, "K");

		WebElement BD = driver.findElement(By.name("address"));
		inputValue(BD, "DGL");

		WebElement ccn = driver.findElement(By.id("cc_num"));
		inputValue(ccn, "00004597545557546");

		WebElement ctype = driver.findElement(By.id("cc_type"));
		select(ctype, 3);

		WebElement date = driver.findElement(By.id("cc_exp_month"));
		select(date, 12);

		WebElement year = driver.findElement(By.id("cc_exp_year"));
		select(year, 12);

		WebElement ed = driver.findElement(By.name("cc_cvv"));
		inputValue(ed, "000");

		WebElement bv = driver.findElement(By.id("book_now"));
		clickOn(bv);

		thread(6000);
		
		screenShot();
		
		thread(6000);
		
		scrollDown();
		
		WebElement my = driver.findElement(By.id("my_itinerary"));
		clickOn(my);

		WebElement check = driver.findElement(By.xpath("(//input[@type='checkbox'])[2]"));
		clickOn(check);

		WebElement logout = driver.findElement(By.id("logout"));
		clickOn(logout);

		close();
	}

}
