package Conditionalstatements;
import java.util.Scanner;
public class CharacterIdentification {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
Scanner scan=new Scanner(System.in);
System.out.println("Ener character:");

char ch=scan.next().charAt(0);
if(ch>='A' && ch<='Z')
	System.out.println("Uppercase character");
else if(ch>='a' && ch<='z')
System.out.println("Lowercase character");
else if(ch>='0' && ch<='9')
	
	System.out.println("digits");

	
else
	System.out.println("Special character");


	
	


	}

}
