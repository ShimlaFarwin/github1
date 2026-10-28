 class MethodsInJava {

     //No return type method
     public void add() {
         int a = 200;
         int b = 200;
         int total = a + b;
         System.out.println("The total is: " + total);
     }

     // Return type method
     public int sub() {
         int a = 500;
         int b = 200;
         int substraction = a - b;
         return substraction;

     }

     //No return type method with parameter
     public void multi(int a, int b) {
         int multy = a * b;
         System.out.println("The Multiplication is: " + multy);
     }

     // Return type method with parameter
     public double div(int a, int b) {
         int divi = a / b;
         return divi;
     }

     //Recursion function (function is called itself)
     public int fact(int num) {
         if (num == 1) {
             return 1;
         }
         return num * fact(num - 1);
     }
 }


