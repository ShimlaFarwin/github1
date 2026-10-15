import java.util.Arrays;

public class ArraySort {
    public static void main(String[] args) {

        int[] arr = {10,25,5,40,15};

        //write a java program to sort an array ascending and descending order.

        System.out.println("Before Sort........");
        System.out.println(Arrays.toString(arr));

        System.out.println("After Sort..........");

        Arrays.sort(arr); // convert the ascending order
        System.out.println(Arrays.toString(arr));

        for (int i = 0; i < arr.length; i++){
            System.out.println(arr[i]);
        }
        // convert the descending order
        for (int i = arr.length -1; i >= 0; i--){
            System.out.println(arr[i]);
        }
        
    }
    
}
