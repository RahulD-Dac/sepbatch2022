class P6
{
	public static void main(String args[])
	{
		for(int i=1;i<5;i++) //row
		{
			for(int j=5;j>=i;j--) //column
			{
				System.out.print("* ");
			}				
			for(int j=1;j<i;j++) //column //Space  
			{
				System.out.print("    ");
			}				
			
			for(int j=5;j>=i;j--) //column //Symbol....xxxxxxx
			{
				System.out.print("* ");
			}				
			
			System.out.println();
			
			
		}
		
		for(int i=1;i<=5;i++) //row
		{
			for(int j=1;j<=i;j++) //column
			{
				System.out.print("* ");
			}		
			
			for(int j=5;j>i;j--) //column //spaces
			{
				System.out.print("    ");
			}				
			
			for(int j=1;j<=i;j++) //column //symbol......xxxxxxxxx
			{
				System.out.print("* ");
			}					
			System.out.println();
		}
		
	}
}	



/*

* * * * *
* * * *
* * * 
* * 
*
*
* *
* * *
* * * *
* * * * *


* * * * *
* * * *
* * * 
* * 
*
* *
* * *
* * * *
* * * * *
        
*/
