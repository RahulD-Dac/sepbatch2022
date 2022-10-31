class BS{

 static void bsort( int a1[])
 {
	int n =a1.length;
	boolean flag = true;
	int itr=0 ;
	int com=0;
	 for(int i=0 ; i<n-1 ; i++)         // itr
	 {
		 flag = false;
		 itr++;
		 for(int j =0 ; j<n-i-1; j++)  // n-i-1 bec no need to  go fore left side number cheake
		 		 
		 {
			 com++;
			  if(a1[j]>a1[j+1])
			  {
				  int tem =a1[j];
				  a1[j] =a1[j+1];
				  a1[j+1]= tem;
				  flag = true;
			  }
		 }
		
		
	 }
	   
	   
	 System.out.println("itr"+itr);
	 System.out.println("com"+com);
	 
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
	int a1[] ={1,2,4,3};
	int n = a1.length;
	display(a1);
	bsort(a1);
	display(a1);
	
}
}