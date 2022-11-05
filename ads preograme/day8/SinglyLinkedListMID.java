public class SinglyLinkedListMID
	{
	   static ListNode head; 	   
	   static class ListNode
		   {        		
				  int data;
				  ListNode next;
				  
			public ListNode(int data)
			{                 
				this.data=data;
				this.next=next;
			}
	 
	 }
	
public  void display()
	{
		ListNode curr = head;
		while(curr != null)
		{
			System.out.print(curr.data+" --->");
			curr =curr.next;
		}
		System.out.print( "null");
		System.out.println( );
	}


public void insertFirst( int value)
	{
		ListNode newNode = new ListNode(value);
		newNode.next= head;    /// star la head point to that node we are pointing newNode next that point  
		head= newNode;        // then point of head change to newNode i.e  node is inserted at first
	}
	
	
public ListNode middleNode()
{
	//if(head == null);{
	//return null;
 
	//}
	
	ListNode slow = head;
	ListNode fast = head;
	
	while(fast!= null && fast.next !=null)
	{
		slow = slow.next;
		fast = fast.next.next;
		
	}
	return slow;
}	


public void insertFirstAfter(ListNode head ,int value)    //add afte first node so pass head'
   {
		ListNode newNode = new ListNode(value);
		newNode.next= head.next;
		head.next = newNode;
   }
   
   
   
/// sorting linked list
 public void sorting()
 {
	 int c=0;          // length
	 if(head !=null)
	 {
		 ListNode temp = head;
		 while(temp!=null)
		 {
			 temp=temp.next;
			 c++;
		 }
	 }
	 System.out.print("no of nodes is " + c ); 
	 
	 
	 for(int i= 0 ; i<c-1 ;i++)
			
			{
				for( int j=0 ; j<c-i-1; j++)
				{
					ListNode temp = head;  // for move
					ListNode temp1 = temp.next ; // for move +1 compar data
					if(temp.data <temp1.data)
					{
						int d= temp.data;
						temp.data =temp1.data;
						temp1.data= d;
						
					}
					  temp = temp1; // tavser temp may temp1 ki posi
					  temp1 =temp1.next;
				}
			}
			
 System.out.println("sorted Liked LISt is   ");			
 
  
			
	 
	 
 }
	
	
	
	public static void main (String [] args)
   {
	    SinglyLinkedListMID sll= new SinglyLinkedListMID();
	   
	   
	   sll.insertFirst(7);
	   sll.insertFirst(0);
	    sll.insertFirstAfter(head,5);
		 sll.insertFirstAfter(head,9);
	    sll.display();   
	   
	   ListNode mid = sll.middleNode();
	   System.out.println("middle node is    = = = = "+ mid.data);
	   sll.sorting();
	   sll.display();
   
   }
   }