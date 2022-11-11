public class Pattern5
{
    public static void main(String args[])
    {                                                                     
        for(int i=1; i<=4; i++)
        {
            
            for(int j=4; j>i; j--)
            {
                System.out.print(" ");
                
            }
            for(int k=i; k>=1; k--)
            {
                System.out.print(k);
                
            }
            for(int m=2; m<=i; m++)
            {
                System.out.print(m);
                
            }
            System.out.println();
        }
        
        for(int i=4; i>=1; i--)
        {
            
            for(int j=4; j>=i; j--)
            {
                System.out.print(" ");
                
            }
            for(int k=i-1; k>=1; k--)
            {
                System.out.print(k);
                
            }
            for(int m=2; m<=i-1; m++)
            {
                System.out.print(m);
                
            }
            System.out.println();
        }
    
    }
    
}

/*Output:

   1
  212
 32123
4321234
 32123
  212
   1
 */ 
    

