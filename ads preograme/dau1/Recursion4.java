import java.util.*;
class Recursion4

{
 	static int fib(int x)
	{
		if(x<=1)
			return 1;
		else 
						

		return fib(x-2)+fib(x-1);
	}
	
	public static void main(String [] args)
	{
		Scanner sc = new Scanner(System.in);
		
		
	  System.out.print("Enter number to find posiontion ");
	  int x=sc.nextInt();
	  System.out.print(x+" number to find posionstion "+fib(x-1));
		  

	
	}
}