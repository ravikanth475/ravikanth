package webdriverprograms;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import org.openqa.selenium.interactions.Actions;

public class DragandDrop {

	public static void main(String[] args) throws Exception {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\tulasi\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
WebDriver driver=new ChromeDriver();
driver.get("https://jqueryui.com/droppable/");
driver.manage().window().maximize();
By jqurey_examples_locator=By.xpath("//h2[text()='Examples']");
WebElement jqurey_examples_element=driver.findElement(jqurey_examples_locator);
JavascriptExecutor js=(JavascriptExecutor)driver;
Thread.sleep(3000);
js.executeScript("arguments[0].scrollIntoView(true)", jqurey_examples_element);
	Thread.sleep(3000);
	driver.switchTo().frame(0);
	By jqury_darg_locator=By.xpath("//p[text()='Drag me to my target']");
	WebElement jqury_darg_element=driver.findElement(jqury_darg_locator);
	
	By jqury_drop_locator=By.xpath("//p[text()='Drop here']");
	WebElement jqury_drop_element=driver.findElement(jqury_drop_locator);
	Actions action=new Actions(driver);
	action.dragAndDrop(jqury_darg_element, jqury_drop_element).build().perform();
	}
	

}
