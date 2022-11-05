public class BT
{
	
	static TreeNode root;
	
	static class TreeNode
	{
		TreeNode left;
		TreeNode right;
		int data;
		
 	public  TreeNode(int data)	 //it for inner part data TreeNode
		{
			this.data= data;
			left =right=null;   // first left and right is null fore root
		}
	}

   BT()
   {
	   root = null;   // start it has null value 
   }
   
   BT(int data) //constuctor main calss link new input fisrt data
   {
	  root = new TreeNode(data);  // acening fist node value to root  
	  
   }
   

/// pre-order // root l right

void printPreOrder(TreeNode n)
{
	if(n == null)  // cheak n node is null or not   dont take root
		return;
	
	System.out.print(n.data +" ");
	printPreOrder( n.left);
	printPreOrder(n.right);
		
}

void preOreder()
		{
			printPreOrder(root);
			
		}
		
		
void printInorder( TreeNode n)
{
	   if(n == null)  // cheak n node is null or not   dont take root
		return;
		printInorder(n.left);
	  System.out.print(n.data +"... ");
	 printInorder(n.right);
 
		
}

void  inorder()
{
	printInorder(root); ///root pass becoz every recorion root update for subtree
	
} 


 void printPostorder(TreeNode n)// LC, RC, Root,
 {
	 if(n == null)
		 return;
	 
	 printPostorder(n.left);
	 printPostorder(n.right);
	 
	  System.out.print(n.data+ " /// ");
 
 }
 void postorder()
 {
	  printPostorder(root);
 }		
	
	
	
	
	
	
   public static void main(String [] args)
   {
	   BT bt = new BT();     
	   
	   
	    root =new TreeNode(1);  
		root.left = new TreeNode(2);
		root.right = new TreeNode(3);
	  root.left.left =new TreeNode(6); // link 1st node to root 
	  
	
	   System.out.println("PreOrder ..."); 
	   bt.preOreder();
	    System.out.println();
	    System.out.println("PostOrder ...");
	   bt.postorder();
	   System.out.println();
	    System.out.println("inOrder ...");
	   bt.inorder();
   }
	
		
	
	
	
}