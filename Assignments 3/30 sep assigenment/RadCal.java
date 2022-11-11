 import java.util.Scanner;

public class RadCal 
{
  
    public static void main(String args[])
	{
			
			Scanner sc = new Scanner(System.in);
			System.out.println("enter Radius  ");
			Double r = sc.nextDouble();
			Double pi= 3.14;
			Double A,c;
			System.out.println("Area of circle  ");
			A=r*pi*r;
			System.out.println(A);
			System.out.println("Circumference of circle  ");
			c=2*pi*r;	
			System.out.print(c);
	
	}
}
      
	  
	  