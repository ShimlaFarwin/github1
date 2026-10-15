import java.util.Scanner;

public class Calculation {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the marks: ");
        int marks = sc.nextInt();

        if (marks >= 80 && marks <=100){
            System.out.println("Your marks is " + marks + "and grade is D");
        }
        else if (marks >= 60 && marks <80) {
            System.out.println("Your marks is " + marks + "and grade is M");

        }
        else if (marks >= 40 && marks <60) {
            System.out.println("Your marks is " + marks + "and grade is P");
        }
        else if (marks >= 0 && marks <40) {
            System.out.println("Your marks is " + marks + "and grade is F");
        }
        else {
            System.out.println("Invalid marks");
        }

    }

}
