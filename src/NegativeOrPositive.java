import java.util.Scanner;

public class NegativeOrPositive {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number: ");
        int number = sc.nextInt();

        if (number >= 0) {
            System.out.print(number + "the number is positive");
        } else {
            System.out.print(number + "the number is negative");

        }
    }
}