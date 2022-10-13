  import java.util.Scanner;
class Student
{
	//Data
	int roll;
	double marks;

	//Methods
	Student()
	{
		roll = 0;
		marks = 0.0;
	}

	Student(int roll, double marks)
	{
		this.roll = roll;
		this.marks = marks;
	}
	void printDetails()
	{
		System.out.println(roll+","+marks);
	}
}

class StudentArray1
{
	public static void main(String args[])
	{
		int size;
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the total no. of students");
		size = sc.nextInt();

		Student stud[] = new Student[size];
		 int max = stud[0];
		System.out.println("Please enter details of the students");

		for(int i = 0; i < size; i++)
		{
			System.out.println("Enter roll & marks");
			int r = sc.nextInt();
			double m = sc.nextDouble();
			stud[i] = new Student(r,m);
		}
		System.out.println("Entered student details are");
		for(int i = 0; i < size; i++)
		{
			stud[i].printDetails();
		}

		for (int i = 0; i < stud.length; i++) {
            //Compare elements of array with max
           if(stud[i] > max)
               max = stud[i];
        }




		/*
		if(stud[0].mark > stud[1].mark )
			{
				System.out.println("great mark is of "+stud[0]);
			}

		else if (stud[1].mark > stud[2].mark)
		{
				System.out.println("great mark is of "+stud[1]);
				}

			else
			{
				System.out.println("great mark is of "+stud[2]);
			}
			*/
	}
}