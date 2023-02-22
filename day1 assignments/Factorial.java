//2. Write a Java Program to find the Factorialof given number. //



public class Factorial {
         public static void main(String[] args)
{
         int i,fact=1;
         int number =5;
         for (i=1;i<=number;i++){
                  fact=fact*i;

         }
         System.out.print("Factorial of"+number+" is  = "+fact);      
}
}