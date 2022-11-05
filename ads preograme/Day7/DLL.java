class DLL{
	
	 ListNode head;
	 ListNode tail;
	 int length;
	 
	 class ListNode
	 {
		 int data;
		 ListNode next;
		 ListNode prev;
		 
		 public ListNode(int data)
		 {
			 this.data = data;   			 					 
		 }
		 
	 }
	
	public DLL()
	{
		this.head = null;
		this.tail= null;		
		this.length =0; 		
	}
	
	public boolean isEmpty()
	{
		return length == 0;
	}
	
	public int length()
	{
		return length;
	}
	
public void displayForword()
	{
			if(head == null)
			{
				return;
			}
		
			ListNode temp = head;
			while(temp!=null)
			{
				System.out.print(temp.data+"---->");
				temp=temp.next;
			}
	System.out.print("null");
System.out.println();	
	}

public void displayBackword()
{
	if(tail== null)
	{
		return;
	}
	
	ListNode temp = tail;   // aesss this with tail fore backword
			while(temp!=null)
			{
				System.out.print(temp.data+"---->");
				temp=temp.prev;
			}
	
	System.out.print("null");	
	
}
	
///first insert	
	public void insertFirst(int value)
	{
		ListNode newNode = new ListNode(value);
		
		if(isEmpty())
		{
			tail = newNode;
			//head=newNode; ^^^^^
		}
		else
		{
			head.prev= newNode;//^^^^^^^^
			
		}
		
		newNode.next =head ; // 1.st imp is coneccet next part of newNode to next 
		head =newNode;  // now head will  point to newNode 
						// we are done newNode replace with nead for start postion
						
		length++;  //new node is added so we have to increme lengthof linked list
		
	}
	
/// insertEnd

public void insertEnd(int value)
{
	
	ListNode newNode = new ListNode(value);
	
	if(isEmpty())
	{
		head = newNode;
	}
   else
   {
	   tail.next= newNode;
	   newNode.prev= tail;
	   
   }	
   
   tail =newNode;  // tail move to newNode name ref
   length++;
}	
	
 /*
static  void insertAfter(ListNode head ,int value)
  {
		ListNode temp = head;
    if(head==null)
      return;
    ListNode newNode = new ListNode(value);
	
    newNode.next = temp.next;
    temp.next = newNode;
    newNode.prev = temp;
    newNode.next.prev = newNode;


  }	
	 
*/	
													       
/// main Method

public static void main(String []args)
{
	DLL dll = new  DLL();// DLL Class name
	dll.insertFirst(11);
	dll.insertFirst(23);
	dll.insertFirst(233);   
	dll.insertEnd(1);     
	dll.insertEnd(354);
	//dll.insertAfter(head,23);  
	
	dll.displayForword();
	dll.displayBackword();
	
}	
	
}