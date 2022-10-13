

import java.util.Scanner;

class FactorialIN {
 public static void main(String[] args){
    //big numbber fact ??????????????????
	int fact,i;
	fact=1;
	Scanner sc = new Scanner(System.in);	
	System.out.println(" Enter number for Factorial of  ");
 
	 int n = Integer.parseInt(args[0]);

  for (i=1;i<=n;i++)
  {
	  fact= fact*i;
  }
  
  System.out.println("Factorial of   is "+fact);
   

  
  }
  
} 


