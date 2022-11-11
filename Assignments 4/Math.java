import java.util.Scanner;
 //import java.lang.Math;
class Demo
	{
		int x;
		int y;
		
 		static int add (int x ,int y)
			{
			    int add = x+y;
				return add;
				//System.out.println("Sub of ="+sum);
			}
		 
		static int subtract(int x ,int y) 
			{
				int sub =(x-y);
				return sub;
			}
		
		static int multiply(int x ,int y)
			{
			int mul = (x*y);
			return mul;
			}
			
		static int power(int x ,int y)
		{
			int  pow=1;
			for (int  i=1; i<=y ;i++)
			{
				pow = pow*x;
			}
			return pow;
		 
		}
	}
	
		 
public class Math	{
	public static void main (String [] args)
	{
		int x,y;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter one integer  number ");
		x=sc.nextInt();
		System.out.println("Enter Second integer  number ");
		y=sc.nextInt();
		
		Demo d = new Demo();
		
		System.out.println("add is "+d.add(x,y));
		 
		System.out.println("sub is "+Demo.subtract(x,y));
		System.out.println("Multiplcatin  is " +Demo.multiply(x,y));
		System.out.println("Power is "+Demo.power(x,y));
		
					
	}

}
//a = Math.pow(x,y);
		//System.out.println("Power of ="+add()); 
		//System.out.println(sc.add(x,y));
		//System.out.println(sc.subtract(x,y));
		//System.out.println( Math.power(x,y));
		// /System.out.println(Demo.add());