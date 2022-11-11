
public class PP4{
  
    public static void main(String args[]) {
 
 
for(int i=1; i<=9; i++){
   for(int j=0; j<9-i; j++){//create initial space for pyramid shape
       System.out.print(" ");
}
for(int k=1; k<i; k++){
       System.out.print(k);//create right half 
}
for(int l=i; l>=1; l--){
       System.out.print( l );//create left half 
}
System.out.print("\n");
}
	}
}	
	 

	/*






		1
       121
      12321
     1234321
    123454321
   12345654321
  1234567654321
 123456787654321
12345678987654321

*/