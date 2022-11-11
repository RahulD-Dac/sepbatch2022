

import java.util.Scanner;

public class Class1 {
	int roll;
	String name;
	double mark;

	void setDetails(int r ,String n,double m)
	{
		roll =r;
		age =a;
		marks =m;
	}
void printDetails(int roll, String name, double marks)
        {
                System.out.println(roll+","+age+","+marks);
        }
}

public class StudentDemo1
{
public static void main(String[] args)
{
		 Class1 c1 = new Class1();
		 c1.setDetails(1,rahul,78.00);
		 c1.printDetails();
		 
		
}
}