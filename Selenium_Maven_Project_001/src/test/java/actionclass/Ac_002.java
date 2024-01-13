package actionclass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import base_class.Base_class;

public class Ac_002 extends Base_class{

	public static void main(String[] args) throws Exception {
		
		launch_browser("chrome");
		navigate("https://www.jiomart.com/");
		takescreenshot("Homepage Jiomart");
		
		// Locate sign in
		WebElement signin = driver.findElement(By.cssSelector("span[id='sign_in_text']"));
		
		Actions act = new Actions(driver);
		
		// Right click 
		act.moveToElement(driver.findElement(By.cssSelector("span[id='sign_in_text']"))).contextClick().build().perform();
		Thread.sleep(3000);
		takescreenshot("Performed Right Click on Sign In ");

	}

}
