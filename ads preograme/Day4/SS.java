class SS{

static void ssort(int a1 [])
{	
	int n =a1.length;
	for(int sel_pos =0 ; sel_pos< n-1 ; sel_pos++)
	 {
		 for(int pos =sel_pos+1 ; pos<n; pos++)  // n-i-1 bec no need to  go fore left side number cheake
		 {
			if(a1[sel_pos]>a1[pos])
			{
				int temp = a1[sel_pos];
				a1[sel_pos]= a1[pos] ;
				a1[pos]=temp;
			}
	
	
		 }
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
	int a1[] ={2,5,77,34,852,931};
	int n = a1.length;
	ssort(a1);
	display(a1);
	
}

	
}