 import java.util.Scanner;

public class Precent 
{
  
    public static void main(String args[])
	{
			
			Scanner sc = new Scanner(System.in);
			System.out.println("enter 5 subject mark  ");

			System.out.println("enter 1 sub mark  ");
			Double m = sc.nextDouble();
			System.out.println("enter 2 sub mark  ");
			Double n = sc.nextDouble();
			System.out.println("enter 3 sub mark  ");
			Double o = sc.nextDouble();
			System.out.println("enter 4 sub mark  ");
			Double p = sc.nextDouble();
			System.out.println("enter 5 sub mark ");
			Double q = sc.nextDouble();
			
			Double Precentage ,sum;
			sum = (m +n +p+ o+q);
			Precentage =sum/5;
			
			System.out.println("Precentage="+Precentage+"%");
			 
	
	}
}
      
	  
	  