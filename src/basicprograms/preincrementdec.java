package basicprograms;
import java.util.Scanner;
public class preincrementdec {

	public static void main(String[] args) {
		Scanner res= new Scanner(System.in);
		System.out.println("Enter a,b,c Values");
		int a=res.nextInt(),b=res.nextInt(),c=res.nextInt();
		 int d=++a + --b +c;
		 System.out.println(d);
	}

}
