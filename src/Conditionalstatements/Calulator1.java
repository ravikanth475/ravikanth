
package Conditionalstatements;
import java.util.Scanner;
public class Calulator1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		System.out.println("enter a,b values");
		int a=scan.nextInt(),b=scan.nextInt();
		System.out.println("select operator: \nadd + \nsub -y\nmul *");
		char operator=scan.next().charAt(0);
		if(operator=='+')
			
			System.out.println("display:"+(a+b));
		else if(operator=='-')
		
			System.out.println("display:"+(a-b));
		
		else if(operator=='*')
		
			System.out.println("display:"+(a*b));
		
		
		
		else
			System.out.println("invalid operator");
		
	}

}
