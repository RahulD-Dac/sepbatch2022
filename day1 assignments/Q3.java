import java.util.Scanner;
class Q3
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter The number : ");
		int n = sc.nextInt();
		int fact=factorialOfNum(n);
		System.out.println("Factorial of "+n+" : "+fact);
	}
	
	public static int factorialOfNum(int num)
	{
		if(num>1)
		{
			return num*factorialOfNum(num-1);
		}
		else
			return 1;
	}
}