

import java.lang.*;

class Fab{
		static long fab(int n)
		{
			if(n == 0 || n== 1)
				return 1;
			return fab(n-1) + fab(n-2);

public static void main(String[] args)
{
		 
		 for(long i= 0; i< Integer.parseInt( args[0]); i++)
			 
		 System.out.print( fab(i));
}
}

