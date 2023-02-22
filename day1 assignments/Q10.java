import java.util.Scanner;
class Q10
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		int number = sc.nextInt();
		int sum=0;
		int r;
		while(number>0)
		{
			r=number%10;
			
			System.out.print(r+"  ");
			
			number=number/10;
		}
	}
}
//Write a Java Program to print the digits of a Given Number. 