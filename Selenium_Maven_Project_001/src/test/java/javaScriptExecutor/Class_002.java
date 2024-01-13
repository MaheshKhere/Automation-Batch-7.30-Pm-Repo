package javaScriptExecutor;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;

import base_class.Base_class;

public class Class_002 extends Base_class {

	public static void main(String[] args) throws Exception {

		launch_browser("chrome");
		navigate("https://www.redbus.in/");
		takescreenshot("redbus");

		JavascriptExecutor js = (JavascriptExecutor) driver;
		// js.executeScript("window.history.go(0)");

		// Scroll at end
		js.executeScript("window.scrollBy(0,document.body.scrollHeight)");

		// Click on link
		driver.findElement(By.xpath("//a[@id='about_us_footer']")).click();
	}
}
