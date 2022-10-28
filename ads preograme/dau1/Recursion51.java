import java.util.*;

class Recursion51

{
	static void table(int n,int i)
	{
		if(i>10)
		return;		
			
	System.out.println(n + " * " + i + " = " + n * i);
		table(n,i+1);
	}	

	
public static void main(String [] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number to preint table ");
			
		int n=sc.nextInt();	
		table(n,1);
	
	}
}