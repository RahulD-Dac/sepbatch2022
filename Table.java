

import java.util.Scanner;

class Table{

public static void main(String[] args)
{
		Scanner s1 = new Scanner(System.in);
		System.out.println("enter number to print table ");
		int n=s1.nextInt();
 
		//for(int i = 1; i<=n; i++)
		{
			for(int j=1; j<=10; j++)
			{
				int a = n*j;
			System.out.println(n+"*"+j+"="+a);

				
				
			}
		}
}
}