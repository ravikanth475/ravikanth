package webdriverprograms;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class MultipleFrames {

	public static void main(String[] args) throws Exception {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\tulasi\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe" );
		WebDriver driver=new ChromeDriver();
		driver.get("file:///C:/Users/tulasi/Downloads/frames.html");
		Thread.sleep(3000);
		driver.switchTo().frame(0);
		By frames_textbox1_locator=By.id("001");
		WebElement frames_textbox1_element	=driver.findElement(frames_textbox1_locator);
		frames_textbox1_element.sendKeys("Hello");
		Thread.sleep(3000);
		driver.switchTo().defaultContent();
		
		/*By fram_fram2_locator=By.xpath("/html/frameset/frame[2]");
	WebElement	fram_fram2_element=driver.findElement(fram_fram2_locator);
	driver.switchTo().frame(fram_fram2_element);*/
	// above stmts for control is swithto one frame to another frame using WebElement
		
		driver.switchTo().frame(1);
		By frames_textbox2_locator=By.id("002");
		WebElement frames_textbox2_element	=driver.findElement(frames_textbox2_locator);
		frames_textbox2_element.sendKeys("welcome");
		Thread.sleep(3000);
		driver.switchTo().defaultContent();
		
		
		
		
		driver.switchTo().frame(2);
		By frames_textbox3_locator=By.id("003");
		WebElement frames_textbox3_element	=driver.findElement(frames_textbox3_locator);
		frames_textbox3_element.sendKeys("Every one");
	}

}
