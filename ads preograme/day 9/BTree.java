public class BTree
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

  BTree()
   {
	   root = null;   // start it has null value 
   }
   
  BTree(int data) //constuctor main calss link new input fisrt data
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
	
	
	
//insertion in tree

public TreeNode printInsert(TreeNode root, int key)
{
	if (root == null)
	{
		root = new TreeNode(key);
		return root;
	}
	
	if(key <= root.data) // key is less it ture ented int left part
	{
		root.left = printInsert(root.left , key);  // rootself call save value to to left
	}
	else
	{
		root.right = printInsert(root.right ,key); // right subroot key is bigger then inser in right
		}
	
	return root;    // goes back to root for preint 
	
	
}	
	///recsive call
	void insert(int key)
	{
		root = printInsert(root, key);  // main root
	}
	
   public static void main(String [] args)
   {
	   BTree bt = new BTree();     
	        
	    bt.insert(12);
	    bt.insert(15);
	    bt.insert(16);
	    bt.insert(10);
	
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