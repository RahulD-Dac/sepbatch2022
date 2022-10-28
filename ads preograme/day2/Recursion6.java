

class Recursion6   ///backtrasing
{
	static void reverse(char str[] ,int n)
	{
		if(n==str.length)
		{
			return;
		}
		reverse(str,n+1);
		
			
	}
		 


		public static void main(String [] args)
		{
			char str[] = "Rahul".tocharArray();
			 System.out.print("Reverse of the given string is ");
				reverse(str, 0);
		}
}