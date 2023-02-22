import java.util.Scanner;

public class PositiveNegative {

         public static void main(String[] args) {
                  Scanner sc = new Scanner(System.in);
         
         System.out.print("Enter The Number  =  ");
         int num = sc.nextInt();

         String evenOdd = (num >= 0) ? "Positive" : "Negative";
         
         System.out.println(num +" is " + evenOdd);

         }
         
}
