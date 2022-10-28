
class Recursion3

{
	static int show(int n)
	{
		if(n<=1)
			return 1;
		else 
			System.out.println("prev number "+  (n-1)+" next number "+ n );

		return n+(show(n-1));
	}
	
	public static void main(String [] args)
	{
	  System.out.print(show(10));
	
	}
}