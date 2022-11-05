class RemoveEvenIntger
{
		public static void printArray(int [] arr)
		{
			for(int i=0; i<arr.length ; i++)
			{
				System.out.print(arr[i]+ " ");
			}
			System.out.println();
		}
		
public static int[] removeEven(int[] arr)
	{
		int oddcount=0;
		for(int i=0; i<arr.length ; i++)
		{
			if(arr[i]%2 !=0)
			{
				oddcount++;
			  			 
			}
		}
		int index=0;
		int [] result = new int[oddcount];  // need count to cheak
		for(int i=0; i<arr.length ; i++)
		{                                  
			if(arr[i]%2 !=0)
			{
				oddcount++;
			    result[index]= arr[i];
				index++	 ;
			}
		}
		return result;
	}
		   		  	
	
public static void main (String [] args)
	{
		int[] arr= {3,2,4,7,8,10,5,6,};
		printArray(arr);
		int []result = removeEven(arr);
		printArray(result);
	}
}