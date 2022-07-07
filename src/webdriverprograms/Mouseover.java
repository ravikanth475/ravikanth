package webdriverprograms;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Mouseover {
public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver","C:\\chromedriver_win32\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.amazon.in");
	int accountsignin;
	int locator;
	By amazon_accountsignin_locator=By.xpath("\\span[text()='Account & Lists' ]");
	WebElement amazon_accountsignin_element=driver.findElement(amazon_accountsignin_locator);
Thread.sleep(3000);
Actions	action=new Actions(driver);	
action.moveToElement(amazon_accountsignin_element);
Thread.sleep(3000);
}

}
