class IS{

 static void isort( int a1[])
 {
	int n =a1.length;                
	 
	 for(int i=1 ; i<n ; ++i)
	 {
		  int key = a1[i];         		  
		 int j=i-1;
		  while(j>=0 &&a1[j]>key)
		  {
			  
			  a1[j+1]=a1[j];
			  j= j-1;
			  
			  }
			a1[j+1] =key;
		
	 }
 }
	     
	 
static void display(int a1[]) // it requried writton type 
{
	int n = a1.length;  // 
	for(int i=0 ; i<n ; i++)
	{
		
		System.out.print(a1[i]+" ");
	}
}


public static void main ( String [] args)
{
	int a1[] ={70,10,23,45,6,78,93};
	int n = a1.length;
	 
	isort(a1);
	display(a1);
	
}
}