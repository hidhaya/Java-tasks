package src;

import java.util.Scanner;

/*public class Capitalize {
    public static void main(String[] args){
        String str = "helloworld";

// capitalize first letter
        String output = str.substring(0, 1).toUpperCase() + str.substring(1);

        System.out.println(output);// Helloworld

    }
}*/
public class Capitalize {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter string: ");
        String s = scanner.nextLine();
        String newString = "";
        String[] str = s.split("\\s");
        for (String string: str){
            int length = string.length();
            String firstChar = string.substring(0, 1);
            String restChar = string.substring(1, length-1);
            String lastChar = Character.toString(string.charAt(length-1));
            newString = newString+ firstChar.toUpperCase()+restChar+lastChar+" ";
        }
        System.out.println(newString);// Java String Exercises
}
}