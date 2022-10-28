import java.util.*;

class Gcd  

{
	static String fun(int n)
	{
		if(n==1)
		return "int";		
			
	return "gcd(int,"+ fun(n-1)+")";
	}	

	
public static void main(String [] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number to preint table ");
			
		int n=sc.nextInt();	
		System.out.println(fun(n));
	
	}
}

/*
Enter number to preint table
3
gcd(int,gcd(int,int))

E:\ads preograme\day2>javac Gcd.java

E:\ads preograme\day2>java Gcd
Enter number to preint table
6
gcd(int,gcd(int,gcd(int,gcd(int,gcd(int,int)))))

 */