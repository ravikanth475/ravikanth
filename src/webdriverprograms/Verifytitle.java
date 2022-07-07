package webdriverprograms;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Verifytitle {

	public static void main(String[] args) throws InterruptedException {
		String expectedtitle="amazon";
		System.setProperty("webdriver.chrome.driver", "C:\\\\Users\\\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in");
		String actualtitle=driver.getTitle();
		if(actualtitle.equals(expectedtitle))
			System.out.println("test script passed");
		else
			System.out.println("test script failed");
		Thread.sleep(3000);
		driver.close();
		

	}

}
