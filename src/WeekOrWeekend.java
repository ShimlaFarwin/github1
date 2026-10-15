public class WeekOrWeekend {
    public static void main(String[] args) {

        int number = 6;

        switch (number) {
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
                System.out.print(number + "Is week");
                break;
            case 6:
            case 7:
                System.out.print(number + "Isn't weekend");
                break;


            default:
                System.out.print("Invalid day");

        }
    }
}