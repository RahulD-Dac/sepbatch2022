 import java.util.Scanner;

public class Temp
{

    public static void main(String args[])
	{

			Scanner sc = new Scanner(System.in);
			System.out.println("enter Temp in celsius  ");
			int d = sc.nextInt();
					
			int Fahrenheit ;
			Fahrenheit=(d*9/5)+32;
			
			System.out.println("Fahrenheit "+Fahrenheit);
 			//System.out.println(" month "+month);
 			//System.out.println(" Week"+week);


	}
}


