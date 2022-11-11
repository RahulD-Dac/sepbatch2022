 import java.util.Scanner;

public class Employee

{
	public static void main (String args[])
	{
		Scanner s=new Scanner(System.in);
		System.out.print("Enter Employee Salary.:");
		double sal=s.nextDouble();
		double HRA=0;
		double DA=0;
		double GS =0;
		 
		
		
		if(sal<10000)
			
			{
				HRA=((sal/100)*10);
				DA=((sal/100)*90);
				
				
			}
			else if(sal>=10000)
			
			{
				HRA=2000;
				DA=((sal/100)*98);
				
				
			}
		GS=sal+DA+ HRA;
		
		
		System.out.println("Empolyee Gross Salary :="+GS);
		
		
		
	}
	
}

