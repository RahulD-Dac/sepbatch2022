import java.util.Scanner;

class P1
{
	public static void main(String args[])
	{
		Scanner o= new Scanner(System.in);
		System.out.println("Enter a No.");
		int a=o.nextInt();
		
		for(int i=1;i<=a;i++) //row
		{
			for(int j=1;j<=i;j++) //column
			{
				System.out.print(i+" ");
			}				
			System.out.println();
		}
	}
}	



/*

1
1 1
1 1 1 
1 1 1 1
1 1 1 1 1

*/