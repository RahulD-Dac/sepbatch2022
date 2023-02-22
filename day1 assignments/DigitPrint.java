 import java.util.Scanner;
public class DigitPrint {

         // 10. Write a Java Program to print the digits of a Given Number.

         public static void main(String[] args) {
                  int n,m,a ,Count=0,i=1;
                  Scanner s = new Scanner(System.in);
                  System.out.println("Enter a Number");

                  n =s.nextInt();
                  m=n;
                  while(n>0)
                  {
                           n=n/10;
                           Count++;
                 }
                 while(m>0)
                  {
                           a=m%10;
                           System.out.println("Digits at position "+Count+":"+a);
                           m = m / 10;
                           Count--;
                 }


         }

}
