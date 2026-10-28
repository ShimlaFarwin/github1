public class TypeOfMethods {
    public static void main(String[] args){

        MethodsInJava obj = new MethodsInJava();
        obj.add();
        System.out.println("The substraction is:" + obj.sub());

        obj.multi(10,20);
        obj.multi(100,5);
        obj.multi(7,5);

        System.out.println("The Division is: " + obj.div(100,5));

        System.out.println("The factorial is: " + obj.fact(5));


    }
}
