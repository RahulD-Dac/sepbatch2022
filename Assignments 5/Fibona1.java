

import java.util.Scanner;

class Fibona1 {
 public static void main(String[] args){
   
 	{
		int n=Integer.parseInt(args[0]);
 		int x=0,y=1;

		for(int i= 1;i <=n;i ++)
		{
		int z=x+y;
		x=y;
		y=z;
		System.out.println(z);

		}
}
  
  }
  
} 


