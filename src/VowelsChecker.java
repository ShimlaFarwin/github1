import java.util.Scanner;

public class VowelsChecker {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter a letter: ");
        char letter = in.next().charAt(0);

        if(letter == 'A' || letter == 'E' ||  letter == 'I' || letter == 'O' || letter == 'U' ||
                letter == 'a' || letter == 'e' ||  letter == 'i' || letter == 'o' || letter == 'u'){
            System.out.println(letter + "The letter is vowels");
        }else {
            System.out.println(letter + "The letter isn't vowels");
        }
    }
}
