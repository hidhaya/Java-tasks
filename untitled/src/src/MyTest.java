package src;

public class MyTest {
    public static String repeat(String s, int number){
        StringBuilder sb = new StringBuilder();
        for(int i = 0; i < number; i++)
            sb.append (s);
        return sb.toString();
    }
    public static void main(String[] args){
        System.out.println( repeat("hello", 4));//hellohello
    }
}


