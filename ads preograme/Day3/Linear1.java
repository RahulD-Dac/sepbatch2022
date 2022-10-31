public class Linear1
{
	static int lsearch(int a1[],int x)
	{
		int n = al.length;
		for(int i=0;i<n;i++)
		{
			if(a1[i] == x)
			return i; // match fpunf thrn preint indrx number 
			
		}
		return -1;
	}
	
	public static void main (String args[])
	{
		int a1[]= {2,3,4,5,6,7,8,7};
		int x=7;
		int res = lsearch(a1,x);
		if(res == -1)
			System.out.println("not found x in array");
		else
			System.out.println(" found x in array");
	}
}