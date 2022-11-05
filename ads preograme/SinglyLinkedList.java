public class SinglyLinkedList
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
	
	public void display()
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
	
 public void  insertEnd(int value)
   {
	   ListNode newNode = new ListNode(value);
	   
	   if(head == null) // 1. list is empty 
	   {
		   head=newNode;   //so diretcly point head to newNode
	   }
	   //2. we have go to end so we have to traves so creat new ref for head  we cant move head   curr
		 
	   ListNode curr = head;     // curr.next la null 
	    while(curr.next!= null)  // it false at end so traves up to end   *********imp *****
		{
			curr=curr.next;       // traves
		}
		curr.next = newNode;     // end node next has  null value so assign newNode directly
		return;
   }
   
   public void insertFirstAfter(ListNode head ,int value)    //add afte first node so pass head'
   {
		ListNode newNode = new ListNode(value);
		newNode.next= head.next;
		head.next = newNode;
   }
//////////////////delete

static void deleteNode(int key)      // value

	{
		ListNode temp = head, prev =null ;   // prev type is ListNode
		 //case 1 : delete Node at begining 
		if(temp !=null && temp.data == key) // list empty or not && temp.dat = key Then found
		{			
			head = temp.next;//head shifted  not 
			return;   //true then return  to cheak next node
		} 

		//remaining cases
		while(temp != null && temp.data !=key) // two false then ture need traves
		{
			prev = temp;	 // pre la temp point kela  			
			temp = temp.next;    // tempo traves
		}
		if(temp == null)       // while loop false then we havr to cheak temp null i.e at end we cant delete
			return;   
		prev.next = temp.next; //if false then  delete node pre.next connect to temp.next becoz temp is traves to delete node chya next node perynirt
		
	}   
   
 ////////////////////////////   deleteNodePos(int pos)  

	


static  void deleteNodePos(int pos)      // only delete node after Fisrt node pos >1 index
   	{
		if(head == null)     // chesk empty list
		return;               // return help to cheak next node list 
	  
		ListNode temp = head;    // create temp for traves beoze cheak pos to delete
		if(pos == 0)        // if pos is zero it means delete 0 pos node ****we cant dele first pos node
		{
			head = temp.next; // head la next node (after dele node ) la temp.next la connect beoz head nead next / addess 
			return; // reture get out loop give dele node
		}
  	
	/// above condio false 
	for(int i=0; temp!=null && i<pos-1;i++)  // pos-1 is less then del pos given // if we chesk temp is null it mean at end 
		{                 
			temp = temp.next; //help to traves to pos-1 
	 	}   
		if(temp == null || temp.next == null)    //  it mean end node 
		return;  
		ListNode n = temp.next.next;   // n is create at pos-1  temp is fixed and n is trasever to next.next one after another node 
		temp.next = n;         // temp.next connnect to (n)temp.next.next
	
	}
	
	
//// seach in linked list
 boolean seach(ListNode head , int key)   // seach start from head tp given key || we are given boolean for true/flase condiotion cheack 

{  
	ListNode temp = head;       // new rfe to trasever
	while(temp != null)        // saeach up to end 
	{
		if(temp.data == key) {   // key found
			System.out.println( "key found");
			return true;  			   		
		}
		temp= temp.next;   // tarvser
		}
		System.out.println( "key not found");
		return false; // kry not in givern list ;
	
	
	
   
}	
 	
	
   
   public static void main (String [] args)
   {
	   SinglyLinkedList sll= new SinglyLinkedList();
	   
	   sll.insertFirst(11);
	   sll.insertFirst(13);
	   sll.insertFirst(17);
	   sll.insertFirst(81);
	   sll.insertEnd(33);  	   
	   //sll.insertFirstAfter(head ,39);
	   sll.display();
	  // sll.deleteNode(17);
	   sll.deleteNodePos(2);
		sll.seach(head, 00);
	   sll.display();
   }
	 
}