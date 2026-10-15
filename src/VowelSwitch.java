public class VowelSwitch {
    public static void main(String[] args){

        char letter = 'A';

        switch(letter){
            case 'A':
            case 'E':
            case 'I':
            case 'O':
            case 'U':
            case 'a':
            case 'e':
            case 'i':
            case 'o':
            case 'u':
                System.err.print(letter + "Is vowels");
                break;

            default:
                System.out.print(letter + "Isn't vowels");
        }
    }
}
