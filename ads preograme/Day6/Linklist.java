 class Linklist

{

   static Node head;      								  	

		static class Node{
							  
		int data;  
		Node next;  		

		Node(int d)   
		{              
			data = d;    
			next = null;
			} 
	}
	  
static void addFirst(int new_data)

	{

		Node new_Node = new Node(new_data); 		

		if(head == null)                  
		{                            
			head = new_Node;        
			return;  
		}

		else 
        {
			new_Node.next = head;
			head = new_Node;
		}

	}	
		  

	static void appendLast(int new_data)

	{                     
		Node new_Node = new Node(new_data);  
		if(head == null)
		{      
			head = new_Node;   
			return;        
		}
		new_Node.next = null;  
        Node n = head;   
		while(n.next!=null)   
		{                
			n=n.next;
		}                 
		n.next = new_Node;    
		return;

	}  	  	
	
	void insertAfter(Node prev,int new_data)
	{   
		Node new_Node = new Node(new_data); 
		//follow the sequance              
		new_Node.next = prev.next;//1      
		prev.next = new_Node;     //2   	

	}

	/*

	static void addSpecific(int pos,int new_data)

	{

		Node new_Node new Node(new_data);

		if(pos == 1)

			addFirst(new_data);

		else if(pos >0 && pos <)

			

	}	*/

	

	static void deleteNode(int key)

	{

		Node temp = head, prev = null;
		 //case 1 : delete Node at begining 
		if(temp !=null && temp.data == key) 
		{			
			head = temp.next;//head shifted 
			return;   
		}   			 	
		//remaining cases
		while(temp != null && temp.data !=key)  
		{
		prev = temp;	 			
		temp = temp.next;  	

		}   
		if(temp == null) 
			return;   
		prev.next = temp.next;

	}

	static void deleteNodePos(int pos)

	{

		if(head == null)   
			return;     
		Node temp = head; 
		if(pos == 0)    
		{
			head = temp.next; 
			return; 
		}
		 			
		for(int i=0;temp!=null && i<pos-1;i++)  
		{                 
			temp = temp.next;
	 	}
		if(temp == null || temp.next == null)
			return; 
		Node n = temp.next.next; 
		temp.next = n;

	}	
				 	
static int count()

	{    
		Node temp = head; 
		int  c=0; 
		while(temp!=null) 
		{   
			c++;    
			temp=temp.next;

		}  
        return c; 
		}

	

	int countrecursive(Node temp)

	{

		//base condition
		if(temp == null)
			return 0; 
		return 1+countrecursive(temp.next);

	}	

	

	//function to search ele in linkedlist

	boolean search(Node head,int key)

	{                         
		Node temp = head;     
		while(temp!=null)     
		{
			if(temp.data ==key ){   
				return true;
			}
			temp=temp.next;
		}     							
		return false;

    }		

	

	void display()

	{

		Node n = head; 	
		while(n!=null)   
		{   
			System.out.print(n.data+" -> "); 
			n = n.next;
					}

    }		
		
	
	public static void main(String args[])

	{   
		Linklist l1 = new Linklist();	
		/*l1.head = new Node(11);  
		Node second = new Node(22);
	    Node third = new Node(33); 
		l1.head.next = second;  
		second.next = third;*/  		

		l1.display();    
		System.out.println("list is empty! ");
		appendLast(2);                      
        l1.addFirst(5);                  
		l1.addFirst(15);  
		l1.addFirst(25);  
		l1.addFirst(35);

		//l1.insertAfter(head ,38);
		//l1.deleteNode(35);
		//l1.deleteNodePos(2);
		 l1.display();
		 l1.deleteNodePos(1); /// we cant dele 
		
	   /*
		appendLast(22);

		appendLast(52);

		

		l1.insertAfter(head.next ,59);

		l1.insertAfter(head.next .next,78);

		

		deleteNode(78);
		*/
		l1.display();

		

	}

}