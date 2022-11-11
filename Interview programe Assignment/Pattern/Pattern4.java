public class Pattern4
{
    public static void main(String args[])
    {  
        
        for (int i = 0; i < 5; i++)   
        {  
        int num = 1;  
        for(int k=4;  k>=i; k--)
            {
                System.out.print(" ");
            }
        for (int j = 0; j <= i; j++)   
        {  
            System.out.print(" "+num);  
            num = num * (i - j) / (j + 1);  
        }  
        System.out.println();  
        }  

    
    }
    
}

/*Output:

      1
     1 1
    1 2 1
   1 3 3 1
  1 4 6 4 1

  
 */ 
    

