public class Factori {
  //3. Find the Factorialof a number using Recursion. //
         static int Factorial(int n )
         {
                  if(n == 0) return 1;

                  return n*Factorial(n-1);

         }           



         public static void main(String[] args){
              int num = 6 ;

                  System.out.println("Factorial " +"is " +Factorial(6));
         }
         
}
