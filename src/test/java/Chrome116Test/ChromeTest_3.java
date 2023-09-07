package Chrome116Test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.manager.SeleniumManager;

public class ChromeTest_3 {
	
	public static void main(String[] args) {
		

		ChromeOptions co = new ChromeOptions();
		co.setBrowserVersion("118");
		
		String browserPath = SeleniumManager.getInstance().getDriverPath(co, false).browserPath;
		String driverPath = SeleniumManager.getInstance().getDriverPath(co, false).driverPath;
		
		System.out.println("BrowserPath = "+browserPath);
		System.out.println("DriverPath = "+driverPath);
		
		
//		BrowserPath = C:\Users\biswa\.cache\selenium\chrome\win64\118.0.5993.3\chrome.exe
//		DriverPath = C:\Users\biswa\.cache\selenium\chromedriver\win64\118.0.5993.3\chromedriver.exe

		
		
		WebDriver driver = new ChromeDriver(co);
		driver.get("http://www.google.com");
		System.out.println(driver.getTitle());
	}

}
