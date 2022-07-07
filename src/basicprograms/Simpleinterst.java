package basicprograms;
import java.util.Scanner;
public class Simpleinterst {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("enter p,t,r");
		int p=scan.nextInt();
		int t=scan.nextInt();
		int r=scan.nextInt();
		float si=(float)p*t*r/100;
		System.out.println("simple interest ="+si);
		

	}

}
