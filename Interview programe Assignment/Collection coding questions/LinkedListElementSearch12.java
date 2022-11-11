import java.lang.*;
import java.util.*;

class LinkedListElementSearch12{
	
	public static void main(String args[]){
		
		Scanner sc = new Scanner(System.in);
		
		LinkedList<String> l1 = new LinkedList<String>();
		
		l1.add("Red");
		l1.add("Blue");
		l1.add("Black");
		l1.add("Brown");
		l1.add("Yellow");
		l1.add("Orange");
		
		System.out.println("Original linked list is : ");
		for(String x : l1){
			
			System.out.print(x+" ");
		}
		
		System.out.println();
		System.out.println("Enter the element you want to search : ");
		String s = sc.nextLine();
		
		if(l1.contains(s)){
			
			System.out.println("Element found in the linked list");
		}
		
		else{
			
			System.out.println("Element does not found in the linked list");
		}
	}
}