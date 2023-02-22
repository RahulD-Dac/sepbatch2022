import java.util.Scanner;

public class EvenOdd {

         public static void main(String []args)
{
         try (Scanner sc = new Scanner(System.in)) {
                  System.out.print("Enter The Number");
                  int num = sc.nextInt();

                  String evenOdd = (num %2 == 0) ? "even" : "odd";
                  
                  System.out.println(num +" is " + evenOdd);
         }

         }

         
}
