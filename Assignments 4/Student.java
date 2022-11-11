import java.util.*;
 //import java.lang.Math;
class Student 

	{
		int[] mark = new int[3];
		String  name ;
		
	public Student( String n,int a,int b,int c) {
        name = n;
        mark[0] = a;
        mark[1] = b;
        mark[2] = c;
    }
	 public int avg() {
        int s = 0;
        for (int i = 0; i < 3; i++) {
            s += mark[i];
        }
        return s / 3;
    }
   public void display(){
	   System.out.println("Stdent Name "+name);
	   for(int i= 0 ; i<3 ;i++)
	   {
		   System.out.println("Marks"+(i+1)+" "+mark[i]);
	   }
	   
   }
    
     
    public static void main(String args[]) {
         Student s1 = new Student("RAMESH",47,56,78);
         s1.display();
		 System.out.println("AVG   =" +s1.avg());
     }
}