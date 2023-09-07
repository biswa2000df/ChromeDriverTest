package Chrome116Test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class ChromeTest_2 {
	
	public static void main(String[] args) {
		
//which browser want to lunch set the browser version then lunch the browser in the updated version like 115 above.
		
		ChromeOptions co = new ChromeOptions();
		co.setBrowserVersion("115");
//		co.setBrowserVersion("117");
//		co.setBrowserVersion("118");
		WebDriver driver = new ChromeDriver(co);
		driver.get("http://www.google.com");
		System.out.println(driver.getTitle());
	}

}
