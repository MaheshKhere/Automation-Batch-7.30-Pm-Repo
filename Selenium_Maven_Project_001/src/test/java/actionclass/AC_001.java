package actionclass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import base_class.Base_class;

public class AC_001 extends Base_class {

	public static void main(String[] args) throws Exception {

		launch_browser("chrome");
		navigate("https://www.flipkart.com/");
		takescreenshot("Flipkart Homepage");

		// Action Class
		Actions act = new Actions(driver);

		// Move towards element
		WebElement link = driver.findElement(By.xpath("//span[text()='Electronics']"));

		act.moveToElement(link).build().perform();

		takescreenshot("Move to Eletronics link");

		Thread.sleep(2000);
		// Move towards home and furniture
		act.moveToElement(driver.findElement(By.xpath("//span[text()='Home & Furniture']"))).build().perform();
		takescreenshot("Move to home and furniture link");
		

	}

}
