 import java.util.Scanner;

class Percentage
{
     
	double perc;
    
	 
		
	public double adddDetails()
		{
		    System.out.println("Enter Student Details Prentage ");
			Scanner s1 = new Scanner(System.in);
			System.out.println("Student percentage ");
			perc=s1.nextDouble();
			return perc;
		}
		
		void printDetails()
		{
			System.out.println("Student percentage  "+perc);
		
		if(perc>=70)
		{
			System.out.println("you got First class ");
		}
		else 
		{
			if (perc<70 && perc>=60)
				{
				System.out.println("you got second class ");
				}
				else 
				{
				if(perc<60 && perc>=35)
					
				System.out.println("you got thired class ");
					
					
				else 
				System.out.println("you Fail ");
				}
		}
		}

    public static void main(String args[])
	{ 
 			Percentage sc = new Percentage();
			sc.adddDetails();
			
			sc.printDetails();
			 
 
		
	}
}


