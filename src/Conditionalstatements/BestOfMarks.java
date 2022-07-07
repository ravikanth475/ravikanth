package Conditionalstatements;
import java.util.Scanner;
public class BestOfMarks {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter main marks:");
		int a=scan.nextInt();
	
		System.out.println("Did u attempt impexam");
		String answer=scan.next();
		if(answer.equals ("yes"))
		{
			System.out.println("enter impmarks");
			int impmarks=scan.nextInt();
			if(impmarks>a) {
				
			
				
				System.out.println("finalmarks:"+impmarks);
			}
				
			else
			{
				System.out.println("finalmarks:"+a);
			}
			
		}
		else
			System.out.println("finalmarks:"+a);
	}

}
