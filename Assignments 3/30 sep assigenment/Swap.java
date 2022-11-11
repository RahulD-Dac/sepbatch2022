 import java.util.Scanner;

public class Swap

{
	public static void main (String args[])
	{
		Scanner s=new Scanner(System.in);
		System.out.print("Enter 1st No.:");
		int p=s.nextInt();  / 
		System.out.print("Enter 2nd No.:");
		int q=s.nextInt();  
		
		
		p=p+q; 
		q=p-q;  
		p=p-q;
		
		
		System.out.println("After Swapping:");
		System.out.println();
		System.out.println("1st No. is: "+p);
		System.out.println("2nd No. is: "+q);
		
	}
	
}

