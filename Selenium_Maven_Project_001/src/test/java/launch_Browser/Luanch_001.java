package launch_Browser;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Luanch_001 {

	public static void main(String[] args) {
		
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.railyatri.in");
		
		// locate web Element
		driver.findElement(By.id("search_status"));
		driver.findElement(By.name("train_number"));
		driver.findElement(By.className("form-control train_no_picker ui-autocomplete-input"));
	
	driver.findElement(By.cssSelector("a.nav-logo-link.nav-progressive-attribute"));	
	driver.findElement(By.cssSelector("input[spellcheck='false']"));
	
	
	}

}
