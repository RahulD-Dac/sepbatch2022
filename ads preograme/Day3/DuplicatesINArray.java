class DuplicatesINArray

{
	static void display(int arr[], int n)
	{
		// First check all the values that are
        // present in an array then go to that
        // values as indexes and increment by
        // the size of array
		if(n>=1)
		{
			for(int i=0; i<n; i++)
			{
				int index = arr[i]% n;
				arr[index]+= n;
			}
			 // Now check which value exists more
        // than once by dividing with the size
        // of array
			for(int i=0; i<n; i++)
			{
				if ((arr[i]/n) >=2)
					System.out.print(i +"");
			}
		}
		else
			return -1;
	}		
	public static void main (String args[])
			{
				int arr [] = {2,3,1};
				int arr_size = arr.length;
				
				System.out.println("The DuplicatesINArray is");
				display(arr,arr_size);
				
			}
			
	}
 
	
	
 