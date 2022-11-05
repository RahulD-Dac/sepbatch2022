class List1
{
	  private  Node head =null;
	private static class Node{
	private	int data;
	private	Node next;
				
	public	Node(int d)   // constuctor call
		{
			data = d;
			next = null;    // null becoz at last node contains next null address
			}
		 	
	} 

public	void display()
	{
		Node n = head ; // copy head to other or n also pointing to head were pointing 
						/// for moveing node to node 
						// we cant move head other wise we los pre list

	    while(n!= null)  // to cheak up to end 
	{
		   System.out.print(n.data+"------>");
		   n= n.next;		// for other link cheak up to null
			
		}			
	}

public static void main (String [] args)
			{
				List1 lK = new List1();
				lK.head = new Node(11);
				Node second = new Node(22);       // creating refrance for Node and memory allocation
				Node thrid = new Node(33);
				 
				
				
				lK.head.next = second;   // linkinfg node
				second.next = thrid;
				 
				 lK.display();
				
				
				
			}

	
}