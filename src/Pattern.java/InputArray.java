import java.util.Scanner;
import java.util.Arrays;

public class InputArray {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter an array size: ");
        int size = sc.nextInt();//5

        //int[] arr = {1,2,3,4};

        int[] numbers = new int[size];

        for (int i = 0; i < size; i++){
            numbers[i] = sc.nextInt();
        }

        System.out.println("After input");
        for (int a: numbers){
            System.out.print(a + " ");
        }
        System.out.println();
        System.out.println("Using toStrong method to print an array");
        System.out.println("------------------------------------------");

        System.out.println(Arrays.toString(numbers));
    }

    
}
