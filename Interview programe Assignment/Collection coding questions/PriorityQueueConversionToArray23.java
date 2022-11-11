import java.lang.*;
import java.util.*;

class PriorityQueueConversionToArray23{
	
	public static void main(String args[]){
		
		PriorityQueue<String> pq1 = new PriorityQueue<String>();
		
		pq1.add("Red");
		pq1.add("Blue");
		pq1.add("Orange");
		pq1.add("Yellow");
		pq1.add("Pink");
		pq1.add("Black");
		pq1.add("Brown");
		pq1.add("White");
		
		System.out.println("Elements in the priority queue are : ");
		for(String x : pq1){
			
			System.out.print(x+" ");
		}
		
		Object array[] = pq1.toArray();
		
		System.out.println();
		System.out.println("Elements in the array are : ");
		for(Object x : array){
			
			System.out.print(x+" ");
		}
		
	}
}