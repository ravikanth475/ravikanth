package webdriverprograms;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDown {

	public static void main(String[] args) throws Exception {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\tulasi\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.amazon.in/");
		By amazon_dropdown_locator=By.cssSelector("select#searchDropdownBox");
WebElement  amazon_dropdown_element=driver.findElement(amazon_dropdown_locator);
	Select select=new Select(amazon_dropdown_element);
	List<WebElement> allOptions=select.getOptions();
	//System.out.println(select.getOptions());
	for (WebElement opt : allOptions) {
		String data=opt.getText();
		System.out.println(data);
		if(data.equals("Movies & TV Shows"))
		select.selectByVisibleText(data);
	
	}
	select.selectByIndex(7);
	Thread.sleep(3000);
	select.selectByValue("search-alias=dvd");
	Thread.sleep(3000);
	
	
	
	}

}
