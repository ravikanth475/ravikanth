 package oops;

public class ChromeBrowser implements WebDriver {

	@Override
	public void get() {
		
		System.out.println("get by ChromeBroser");
		
	}

	@Override
	public void click() {
		System.out.println("click by ChromeBroser");	
	}
	public void screenShot() {
		System.out.println("screenShot by ChromeBroser");
	}

}
