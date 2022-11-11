public class Pattern2
{
    public static void main(String args[])
    {   
        System.out.println("*********");                                                                  
        for(int i=4; i>=1; i--)
        {
            for (int j = i; j<=4 ; j++)   
            {  
                System.out.print(" ");  
            }     
            for (int k = 1; k <= (2*i-1) ;k++)   
            {  
                if( k==1 || k==(2*i-1))   
                {  
                System.out.print("*");  
                }  
                else   
                {  
                System.out.print(" ");  
                }  
            }  
            
            System.out.println();
        }
        
        
        
    }
    
}

/*Output

*********
 *     *
  *   *
   * *
    *


*/