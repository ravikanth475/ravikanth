package webdriverprograms;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alerts {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\tulasi\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe" );
		WebDriver driver=new ChromeDriver();
		driver.get("https://demoqa.com/alerts");
		Thread.sleep(3000);
	By demoqa_alertbutton_locator=By.xpath("//button[@id='alertButton']");
WebElement demoqa_alertbutton_element=driver.findElement(demoqa_alertbutton_locator);
demoqa_alertbutton_element.click();
Thread.sleep(3000);
Alert alert=driver.switchTo().alert();
Thread.sleep(3000);
String text=alert.getText();
System.out.println(text);
Thread.sleep(3000);
alert.accept();
driver.close();

	
		

	}

}
