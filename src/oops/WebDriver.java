package oops;

public interface WebDriver {
public void get();
public abstract void click();

public static void doubleClick() {
	System.out.println("Doubleclick");
}

public default void rightclick() {
	display();
}

private void display() {
	System.out.println("hi");
}

}
