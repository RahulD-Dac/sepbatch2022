import java.util.Scanner;

class Q9
{
	public static void main (String args[])
	{
		Scanner s=new Scanner(System.in);
		System.out.print("Enter a No.");
		int a=s.nextInt();
		int n=1;
		if(a<=0)
		{
			System.out.println("Enter Positive No. and try again... ");
		}
		else
		{	
			System.out.println("The Factors of Given No. are...");
			while(n<=a)    
			{
			  if(a%n==0)
			  {	
			      System.out.println(n);
			  }
			  n++;
			}
		}	
	}
	
}	
