 import java.util.Scanner;

public class Simple 
{
  
    public static void main(String args[])
	{
			
			Scanner sc = new Scanner(System.in);
			System.out.println("enter Principle amount  ");
			Double p = sc.nextDouble();


			System.out.println("enter Rate of Interest ");
			Double r = sc.nextDouble();
			System.out.println("enter Time in year ");
			Double n = sc.nextDouble();	 
			
			Double simple;
			simple = (p*n*r) / 100;
			 
			
			System.out.println("simple Interest="+simple);
			 
	
	}
}
      
	  
	  