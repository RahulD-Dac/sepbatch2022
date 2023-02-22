import java.util.Scanner;

public class Swap2 {
         // Swap two numberswithout using third variable approach 2.
         public static void main(String[] args) {

                  System.out.println("Entering  two numbers without using third");
                  try (Scanner sc = new Scanner(System.in)) {
                           int x = sc.nextInt();
                           int y = sc.nextInt();

                           System.out.println("Entering two numbers x is" + x + "y" + y);

                           x = x * y;
                           y = x / y;
                           x = x / y;

                           System.out.println("after swap two numbers x is = " + x + "  y = =22" + y);
                  }

         }

}