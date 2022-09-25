public class S8 {
  
    public static void main(String args[]) {
		 
		 for(int i=5;i>=1;i--)
	 {
	
		for(int j=i;j>1;j--)
		 {  
			 System.out.print(" ");
		 }
		for(int j=5;j>=i;j--) //***********************************************8
		 {
			  
			 System.out.print(j+" ");
		 }	 

	          System.out.println();

	   }
			
	}		
	
}

/*
     5
   5 4
  5 4 3
 5 4 3 2
5 4 3 2 1

*/