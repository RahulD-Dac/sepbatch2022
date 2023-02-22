import java.util.Scanner;

  
public class LeapYear {
         //8. Write a Java Program to find whether given number is Leap year or NOT? 

         public static void main(String[] args) {
                           int year ;

                           System.out.println("Enter year");
                           try (Scanner sc = new Scanner(System.in)) {
                                    year =sc.nextInt();
                           }

                           if(((year%4 == 0) && (year%100!=0)) || (year%100 == 0)) {
                                    System.out.println("Specified year is leap year");
                           }
                           else
                           {
                                    System.out.println("Specified year is not leap year");
                                    
                           }


                           }
         }
         

