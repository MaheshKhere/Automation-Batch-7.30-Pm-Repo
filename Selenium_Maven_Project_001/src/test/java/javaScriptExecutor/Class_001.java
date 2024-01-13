package javaScriptExecutor;

import org.openqa.selenium.JavascriptExecutor;

import base_class.Base_class;

public class Class_001 extends Base_class {

	public static void main(String[] args) throws Exception {

		launch_browser("chrome");
		navigate("https://www.railyatri.in/");
		takescreenshot("RailYatri");

		// Scroll Page at some points
		JavascriptExecutor js = (JavascriptExecutor) driver;
		//js.executeScript("window.scrollBy(0,1000)");

		//Scroll Page At Bottom/end
		js.executeScript("window.scrollBy(0,document.body.scrollHeight)");
		takescreenshot("After Scroll Page at bottom");
	}
}
