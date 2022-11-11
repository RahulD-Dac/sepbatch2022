class Pattern16
{
    public static void main(String []args)
    {
        //First 
        for(int i=1; i<=5; i++)
        {
            for(int j=i; j<=13; j++)
            {
                System.out.print(" ");
            }
            for(int j=1; j<=i; j++)
            {
                System.out.print("* ");
            }
            System.out.println();
            
        }
        //second
        for(int i=1; i<=5; i++)
        {
            for(int j=i; j<=11; j++)
            {
                System.out.print(" ");
            }
            for(int j=-1; j<=i; j++)
            {
                
                System.out.print("* ");
                
            }
            System.out.println();
            
        }

        //third
        for(int i=1; i<=5; i++)
        {
            for(int j=i; j<=9; j++)
            {
                System.out.print(" ");
            }
            for(int j=-3; j<=i; j++)
            {
                
                System.out.print("* ");
                
            }
            System.out.println();
            
        }
        //fourth
        for(int i=1; i<=5; i++)
        {
            for(int j=i; j<=7; j++)
            {
                System.out.print(" ");
            }
            for(int j=-5; j<=i; j++)
            {
                
                System.out.print("* ");
                
            }
            System.out.println();
            
        }
        //fifth
        for(int i=1; i<=5; i++)
        {
            for(int j=i; j<=5; j++)
            {
                System.out.print(" ");
            }
            for(int j=-7; j<=i; j++)
            {
                
                System.out.print("* ");
                
            }
            System.out.println();
            
        }
        //stem
        for(int i=1; i<=4; i++)
        {
            for(int j=1; j<=5; j++)
            {
                System.out.print("  ");
            }
            for(int j=1; j<=4; j++)
            {
                System.out.print("* ");
            }
            System.out.println();
        }
        
    }
}

/*Output:

             * 
            * * 
           * * * 
          * * * * 
         * * * * * 
           * * * 
          * * * * 
         * * * * * 
        * * * * * * 
       * * * * * * * 
         * * * * * 
        * * * * * * 
       * * * * * * * 
      * * * * * * * * 
     * * * * * * * * * 
       * * * * * * * 
      * * * * * * * * 
     * * * * * * * * * 
    * * * * * * * * * * 
   * * * * * * * * * * * 
     * * * * * * * * * 
    * * * * * * * * * * 
   * * * * * * * * * * * 
  * * * * * * * * * * * * 
 * * * * * * * * * * * * * 
          * * * * 
          * * * * 
          * * * * 
          * * * * 

          
 */