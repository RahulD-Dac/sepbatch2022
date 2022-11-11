public class Pattern15
{
    public static void main(String args[])
    {                                                                      
        for(int i=1; i<=6; i++)
        {
            for(int k=1; k<=i; k++)
            {
                System.out.print(" ");
            }
            for(int j=i; j<=6; j++)
            {
                System.out.print(j+" ");
            }
            
            System.out.println();
        }
        
    
    }
    
}

/*Output:

 1 2 3 4 5 6 
  2 3 4 5 6 
   3 4 5 6 
    4 5 6 
     5 6 
      6 
  
 */ 
    

