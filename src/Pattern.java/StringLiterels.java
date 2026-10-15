public class StringLiterels {
    public static void main(String[] args) {

        String a = "Bcas Kalmunai";
        String b = "Bcas Kalmunai";
        String c = "BCAS Kalmunai";

        System.out.println("Hashcode A: " + a.hashCode());
        System.out.println("Hashcode B: " + b.hashCode());
        System.out.println("Hashcode C: " + c.hashCode());
        System.out.println("Equals:" + a.equals(c));
        System.out.println("Equals Ignore Case: " + a.equalsIgnoreCase(c));
        System.out.println("To Upper Case: " + a.toUpperCase());
        System.out.println("To Lower Case: " + a.toLowerCase());
        System.out.println("CharAT: " + a.charAt(2));//a
        System.out.println("Length: " + a.length());
        System.out.println("Contains: " + a.contains("Kalmunai"));
        System.out.println("IsEmpty: " + a.isEmpty());
        System.out.println("Replace: " + c.replace("Kalmunai","KALMUNAI"));
        System.out.println("Starts with: " + a.startsWith("b"));
        System.out.println("End With: " + a.endsWith("B"));

        char[] ch = a.toCharArray();
        System.out.println(Arrays.toString(ch)); 

        for (char element: ch){
            System.out.println(element);
        }
        for (int i = 0; i < ch.length; i++){
            System.out.println();
        }

        String d = "  BCAS  ";
        System.out.println("Length: " + d.length());//8
        System.out.println("Trim with Length: " + d.trim().length());//4
        

    }
    
}
