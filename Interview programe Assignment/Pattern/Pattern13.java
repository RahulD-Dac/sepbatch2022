public class Pattern13
{
    public static void main(String args[])
    {                                                                     
        for(char i='A'; i<='F'; i++)
        {
            for(char j=i; j<='F'; j++)
            {
                System.out.print(" ");  
            }
            for (char k='A'; k<=i; k++)   
            { 
                if(k=='A' || k==i)
                {
                    System.out.print(i+" ");
                }
                else   
                {  
                    System.out.print("  ");
                }
            }
            
            System.out.println();
        }

        for(char i='E'; i>='A'; i--)
        {
            for(char j='E'; j>=i; j--)
            {
                System.out.print(" ");  
            }
            for (char k=i; k>='A'; k--)   
            { 
                if(k==i || k=='A')
                {
                    System.out.print(" "+i);
                }
                else   
                {  
                    System.out.print("  ");
                }
            }
            
            System.out.println();
        }
        
        
        
    }
    
}

/*Output

      A 
     B B 
    C   C 
   D     D 
  E       E 
 F         F 
  E       E
   D     D
    C   C
     B B
      A


*/