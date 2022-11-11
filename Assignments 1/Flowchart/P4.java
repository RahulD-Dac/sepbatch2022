//import java.util.Scanner;

class P4
{
	public static void main(String args[])
	{
		//Scanner o= new Scanner(System.in);
		//System.out.println("Enter a No.");
		//int a=o.nextInt();
		
		for(int i=1;i<=5;i++) //row
		{
			for(int j=5;j>i;j--) //column //spaces
			{
				System.out.print("  ");
			}				
			
			for(int j=1;j<=i;j++) //column //symbol
			{
				System.out.print("1 ");
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