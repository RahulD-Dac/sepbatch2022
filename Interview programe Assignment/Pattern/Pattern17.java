public class Pattern17
{
    public static void main(String args[])
    {                                                                      
        for(int i=1; i<=5; i++)
        {
            for(int j=i; j>=1; j--)
            {
                System.out.print("* ");
                
            }
            System.out.println();
            System.out.println();
        }
        
        for(int i=1; i<=4; i++)
        {
            for(int k=4;  k>=i; k--)
            {
                System.out.print("* ");
            }
            System.out.println();
            System.out.println();
        }
    }
    
}

/*Output

* 

* * 

* * * 

* * * * 

* * * * * 

* * * * 

* * * 

* * 

* 


*/