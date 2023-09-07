package Chrome116Test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class ChromeTest_1 {
	
	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();//normal  what is the bydefault chromeversion it is open 
		driver.get("http://www.google.com");
		System.out.println(driver.getTitle());
	}

}
