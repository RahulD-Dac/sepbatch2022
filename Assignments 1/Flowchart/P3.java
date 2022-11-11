//import java.util.Scanner;

class P3
{
	public static void main(String args[])
	{
		//Scanner o= new Scanner(System.in);
		//System.out.println("Enter a No.");
		//int a=o.nextInt();
		/*
		for(int i=5;i>=1;i--) //row
		{
			for(int j=1;j<=i;j++) //column
			{
				System.out.print("1 ");
			}				
			System.out.println();
		}
		*/
		
		for(int i=1;i<=5;i++) //row
		{
			for(int j=1;j<i;j++) //column //Space  
			{
				System.out.print("  ");
			}				
			
			for(int j=5;j>=i;j--) //column //Symbol
			{
				System.out.print(i+" ");
			}				
			
			
			System.out.println();
		}
		
	}
}	



/*
1 1 1 1 1  
  1 1 1 1      
    1 1 1
      1 1
        1

*/