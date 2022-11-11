public class S10 {
  
    public static void main(String args[]) {
				int E=70;

		 for(int i=1;i<=5;i++)
	 {
	
		for(int j=4;j>=i;j--)
		 {  
			 System.out.print(" ");
		 }
		for(int j=i;j>=1;j--)
		 {
			  
			 System.out.print((char)(E-j)+" ");
 		 }	 

	          System.out.println();

	   }
			
	}		
	
}

/*
	E
   D E
  C D E
 B C D E
A B C D E

*/