package oops;

import java.util.Scanner;

public class Exception1 {
public static void main(String[] args) {
	System.out.println("i am main method");
	
	int a=10;
	int marks[]= {100,200,300};
Scanner scan=null;
	try {
		a=scan.nextInt();
		
		System.out.println(marks[4]);
	int b=a/0;
	
	System.out.println("B="+b);
	}
	catch(ArithmeticException e){
		System.out.println("number cannot divided by zero");
	}
	
	catch(ArrayIndexOutOfBoundsException e)
	{
	System.out.println(e.getMessage());
	}
	catch(Exception e) {
		System.out.println(e.getMessage());
	}
	finally
	{
	System.out.println("i am here help u");	
	}
	
	
	
	
	System.out.println("main method termineted");
	
	
	
}
}
