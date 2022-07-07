package webdriverprograms;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutoComplete {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\tulasi\\Downloads\\chromedriver_win32\\chromedriver.exe" );
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.amazon.in/");
		Thread.sleep(3000);
		 By amazon_searchbox_locator=By.id("twotabsearchtextbox");
		 WebElement amazon_searchbox_element=driver.findElement(amazon_searchbox_locator);
		 amazon_searchbox_element.sendKeys("Dates");
		 Thread.sleep(3000);
		 for(int i=1;i<=3;i++) {
			 amazon_searchbox_element.sendKeys(Keys.ARROW_DOWN);
		 Thread.sleep(3000);
		 }
		 amazon_searchbox_element.sendKeys(Keys.ENTER);
		 
	}

}
