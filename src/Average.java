import  java.util.Scanner;
public class Average {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the Physics marks: ");
        int  Physics = sc.nextInt();
        System.out.print("Enter the Chemistry marks: ");
        int  Chemistry = sc.nextInt();
        System.out.print("Enter the Biology marks: ");
        int  Biology = sc.nextInt();
        System.out.print("Enter the Mathematics marks: ");
        int  Mathematics = sc.nextInt();
        System.out.print("Enter the IT marks: ");
        int  IT = sc.nextInt();

        double total = Physics+Chemistry+Biology+Mathematics+IT;
         double average = total/5.0;
        System.out.println("Total marks: " + total);
        System.out.println("Average marks: " + average);

         if (average >= 90){
             System.out.println("grade = A");
         }
         else if (average >= 80) {
             System.out.println("Grade: grade = B");
         }
         else if (average >= 70) {
             System.out.println("Grade: grade = C");
         }
         else if (average >= 60) {
             System.out.println("Grade: grade = D");
         }
         else if (average >= 40) {
             System.out.println("Grade: grade = E");
          }
         else if (average <40) {
             System.out.println("Grade: grade = F");
         }
         else {
             System.out.println("Invalid marks");
         }



    }

    }

