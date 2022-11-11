class Pattern12
{
    public static void main(String args[])
    {                                                                      
        for(char i='A'; i<='F'; i++)
        {
            for(char k='F'; k>=i; k--)
            {
                System.out.print(" ");
            }
            
            for(char j='A'; j<=i; j++)
            {
                
                System.out.print(" "+j);

            }
            System.out.println();
        }
        
    }
    
}

/*Output:

       A
      A B
     A B C
    A B C D
   A B C D E
  A B C D E F
  
 */