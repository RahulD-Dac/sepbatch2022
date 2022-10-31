class MSort {

static void mergeSort(int arr[], int s, int e) // s= start ,e= end
    {
        // base case
        if (s < e) {            
        int mid = s +(e-s)/2;          
        mergeSort(arr, s, mid);       // left part sort      
        mergeSort(arr, mid + 1, e);   // right side sort
        merge(arr, s, mid, e);   // merge
        }

    }
	   
 static void merge(int arr[], int s, int mid, int e) {
        
        // calculating length
        int len1 = mid - s + 1;          //left side length
		int len2 = e - mid;               // right side length
        int L[] = new int[len1]; // creats temp array
        int R[] = new int[len2];  
        
        for (int i = 0; i <len1 ; i++) {                    // copy value left arr
			L[i] = arr[s + i];					// int mainArrayindex = s; // this arr star from s
            
        }
		for (int j = 0; j < len2; j++) {             // sendcond right arr
            R[j] = arr[mid + 1 + j];                // copy value         // start fore this arr is mid +1
        }
									 
							 
      // merge 2 sorted arrarays
        int i = 0, j = 0;            //   index  i for left side  ,j for right side arr
        int k = s;                   //take  k is start from start  of main array index

        while (i < len1 && j < len2) // becoz index must be lower then length
		
	    {
            if (L[i] < R[j]) {
                arr[k] = L[i];
					i++;// copy lower value int main
            } 
			else {
                arr[k] = R[j];
				j++;
            }
			k++;
        }
        // if length is differt for that seprat
        while (i < len1) {
            arr[k] = L[i]; 			
			i++;
			k++;
        }

        while (j < len2) {
            arr[k] = R[j]; 			
			j++;
			k++;
        }

    }
    
static void display(int arr[]) // it requried writton type
    {
        int n = arr.length; //
        for (int i = 0; i < n; i++) {

            System.out.print(arr[i] + " ");
        }
    }

  public static void main(String args[]) {
        int arr[] = { 2, 5, 7, 4, 9 };
        int n = arr.length;
		 
        mergeSort(arr,0,n-1); // send start as 0 and end as n-1
        display(arr);
    }

}