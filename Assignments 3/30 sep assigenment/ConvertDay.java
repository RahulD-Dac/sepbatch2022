 import java.util.Scanner;

public class ConvertDay
{

    public static void main(String args[])
	{

			Scanner sc = new Scanner(System.in);
			System.out.println("enter Days you Want to convert in Year  ");
			int d = sc.nextInt();
					double year;
			int week, month ;
			int ct=0;
			int n=0;
			int rem=0;
			int day =0;
			while(d>=365)
			{
				ct++;
				d=(d-365);
				rem=d;
			}
			while(rem>=30)
			{
				n++;
				rem=(rem-365);
				day=rem;
			}
			
			
			if(d<30)
				
				{
					
					day=d;
					
				}
			//year=d/365;
			//month=d%30;
			//week=(d/365)%7;
			System.out.println("Year = "+ct);
 			System.out.println("month ="+n);
 			System.out.println("Day ="+day);


	}
}


