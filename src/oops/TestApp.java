package oops;

public class TestApp {
public static void main(String[] args) {
	/*ChromeBrowser test=new ChromeBrowser();
	test.get();test.click();test.screenShot();*/
	
	WebDriver driver;
	driver=new ChromeBrowser();
	driver.get();driver.click();driver.rightclick();
	
	
	
 /*Firefox test1=new Firefox();
test1.get();test1.click();*/
	
	driver=new Firefox();
	driver.get();driver.click();
	driver.rightclick();
	
	WebDriver.doubleClick();
}
}
