public class CountOccurrences {
    public static int count(String s, char c) {
        int count = 0;

        for (int i=0; i<s.length(); i++) {
            // checking character in string
            if (s.charAt(i) == c)
                count++;
        }
        return count;
    }
    public static void main(String args[]) {
        String str= "hello";
        char c = 'l';
        System.out.println(count(str, c));//2
    }
}

