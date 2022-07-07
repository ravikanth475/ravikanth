package Conditionalstatements;
import java.util.Scanner;
public class GretestOfThreeNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner ravi=new Scanner(System.in);
		System.out.println("Enter a,b,c values");
		int a=ravi.nextInt(),b=ravi.nextInt(),c=ravi.nextInt();
		if(a==b&&b==c)
			System.out.println("a,b,c values are equal");
		else if(a>b&&a>c)
		{	System.out.println("a is greater");
		System.out.println("bye");
		}
		else if(b>c)
			System.out.println("b is greater");
		else
			System.out.println("c is greater");
		System.out.println("goodbye");
	}

}
