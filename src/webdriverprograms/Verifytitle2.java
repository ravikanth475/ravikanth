package webdriverprograms;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Verifytitle2 {

	public static void main(String[] args) {
		String expectedTitle=("Online Shopping site in India: Shop Online for Mobiles, Books, Watches, Shoes and More - Amazon.in"
);
		System.setProperty("webdriver.chrome.driver","C:\\Users\\tulasi\\Downloads\\chromedriver_win32\\chromedriver.exe" );
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.amazon.in/");
		String actualTitle=driver.getTitle();
		System.out.println(actualTitle);
		if(actualTitle.equals(expectedTitle)) {
			System.out.println("pass");
		}
			else
				System.out.println("fail");
		}

	}


