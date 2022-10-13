 import java.util.Scanner;

class Student
{
    String name;
    int id;
	double marks;
    
		int  changeMarks(int marks)
		{
			//Scanner m1 = new Scanner(System.in);

			System.out.println("Student marks =");
			marks=m1.nextDouble(78);
			return marks;
			
		}
		
		public void adddDetails()
		{
		    System.out.println("Enter Student Details as NAME ,ID AND MARKS");
			Scanner s1 = new Scanner(System.in);
			System.out.println("Student name ");
			name=s1.nextLine();

			System.out.println("Student id =");
			id=s1.nextInt();

			System.out.println("Student marks =");
			marks=s1.nextDouble();


		}
		void printDetails()
		{
		System.out.println("Student Name  "+name);
			System.out.println("Student id= "+id);
			System.out.println("Student marks =  "+marks);

		}

    public static void main(String args[])
	{ 
 			Student sc = new Student();
			sc.adddDetails();
			sc.printDetails();
			changeMarks(sc.marks);
 
		
	}
}


