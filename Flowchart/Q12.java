import java.util.Scanner;

class Q12
{
	public static void main (String args[])
	{
		Scanner s=new Scanner(System.in);
		System.out.print("Enter 1st No.");
		int a=s.nextInt();
		System.out.print("Enter 2nd No.");
		int b=s.nextInt();
		
		System.out.println();
		
		if(b>=0)
		{	
		for(int i=0;i<b;i++)  //1,2,3,4,5
		{
		  a++;   //15,16,17,18,19,20
		}
			System.out.println("The Sum of two numbers is:"+a);
		}
        else
		{			
		for(int i=0;i>b;i--)  //1,2,3,4,5
		{
		  a--;   //15,16,17,18,19,20
		}
			System.out.println("The Sum of two numbers is:"+a);	
		}
	}
	
}	


/*

a
b
c

a<b a<c....1
a>b a<c....0...skip...next part
a<b a>c....0....skip...next part 

b<a b<c...






*/