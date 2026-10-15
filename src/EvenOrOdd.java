import java.util.Scanner;

public class EvenOrOdd {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number: ");
        int number = sc.nextInt();

        if (number % 2 == 0) {
            System.out.println(number + "the number that you entered is even");
        }else{
            System.out.println(number + "the number that you entered is odd+");
        }
    }
}
