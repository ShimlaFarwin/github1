import java.util.Scanner;

public class TicketCounter {
    public static void main(String[] args){
        Scanner in =new Scanner(System.in);

        System.out.print("Enter your residence (1. Local, 2. Foreign): ");
        int residence = in.nextInt();
        System.out.print("Enter your age: ");
        int age = in.nextInt();

       int fees = 0;
       String residencestauts = " ";

        if (residence == 2){
            residencestauts = "Foreign";
         if(age <= 5) {
            fees = 100;
        } else if (age > 5 && age <= 12) {
            fees = 500;
        } else if (age > 12 && age <= 18 ) {
            fees = 1000;
        } else {
            fees = 2000;
        }
        }
        else if (residence == 1) {
            residencestauts = "Local";
            if(age <= 5) {
                fees  = 0;
            } else if (age > 5 && age <= 12) {
                fees  = 30;
            } else if (age > 12 && age <= 18 ) {
                fees  = 50;
            } else {
                fees  = 100;
            }

        }
        else {
            residencestauts = ("Invalid");
        }

        System.out.println("---------- Print Ticket----------");
        System.out.println("Your residence: " + residencestauts);
        System.out.println("Your age is: " + age);
        System.out.println("Your ticket amount is: Rs. " + fees);
        System.out.println("Thank you come again");
    }

}

