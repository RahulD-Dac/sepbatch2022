//Write a Java program to check the equality of two arrays?
// Java program to find given two array  are equal or not
import java.io.*;
import java.util.*;

class Q2 {
	 
	public static boolean areEqual(int arr1[], int arr2[])
	{
		int N = arr1.length;// If lengths of array are not equal means
		int M = arr2.length; 		
		if (N != M)		// array are not equal 
			return false;                      		
		Arrays.sort(arr1);// Sort both arrays
		Arrays.sort(arr2);
											
		for (int i = 0; i < N; i++)// Linearly compare elements
			if (arr1[i] != arr2[i])
				return false;     								  		
		return true;// If all elements were same.
	}

	// Driver code
	public static void main(String[] args)
	{
		int arr1[] = { 3, 5, 2, 5, 2 };
		int arr2[] = { 2, 3, 5, 5, 1 };

		// Function call
		if (areEqual(arr1, arr2))
			System.out.println("Yes");
		else
			System.out.println("No");
	}
}
