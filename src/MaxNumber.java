import java.util.Scanner;

 public class MaxNumber {
     static  void main(String[] args){

         Scanner sc = new Scanner(System.in);
         System.out.print("Enter the number1: ");
         int number1 = sc.nextInt();

         System.out.print("Enter the number2: ");
         int number2 = sc.nextInt();

         if (number1 > number2) {
             System.out.print(number1 + "number1 is Maximum number");

         }else {
             System.out.print(number2 + "number2 is Maximum number");
         }
//int max=number1


     }
 }
