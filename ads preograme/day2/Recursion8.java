

class Recursion8   
{
	static String reverse(String str)
	{
		if(str.isEmpty())
		
	return str;
	return reverse(str.substring(1)) + str.charAt(0);
		
	}
	
	public static void main(String [] args)
	{
		String str  = "Rahul Darade"; 
		String reversed = reverse(str);
		System.out.print("Reverse of the given string is " +reversed);

	}
}