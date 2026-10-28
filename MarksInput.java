import java.util.Scanner;

public class MarksInput {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arr[] = new int[5];
        System.out.println("Enter the marks here");
        for (int i = 0; i < arr.length;
             i++) {
            arr[i] = sc.nextInt();
        }
        int total = 0;
        for (int i = 0; i < arr.length; i++) {
            total += arr[i];
        }
        int avg = total / 5;
        if (arr[0] >= 35 && arr[1] >= 35 && arr[2] >= 35 && arr[3] >= 35 && arr[4] >= 35) {
            if (avg >= 80) {
                System.out.println(avg + "D");
            } else if (avg >= 60) {
                System.out.println(avg + "M");
            } else if (avg >= 40) {
                System.out.println(avg + "P");
            } else {
                System.out.println(avg + "F");
            }
        } else {
            System.out.println("Your result is not sufficient to calculate average");
        }
    }
}


