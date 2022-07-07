package array;

public class Array1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int a[]= {10,20,30,40,50};
int size=a.length;
System.out.println("no.of elements: "+size);
System.out.println("Array values using loop");

for(int i=0;i<a.length;i++)
{
System.out.println("Array values:"+a[i]);
}
System.out.println("\nArray values for each loop");
for(int x:a)
	System.out.println(x);
	}

}
