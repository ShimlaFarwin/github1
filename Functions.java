public class Functions {

    public void display(){
        System.out.println("Hello world......");
    }
    public static void greeting(){
        System.out.println("Hello static function");
    }
     public static void main(String[] args) {

        greeting();
       // Functions.greeting();

         Functions obj = new Functions();
         obj.display();


     }
}
