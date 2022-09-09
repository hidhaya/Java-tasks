public class Main {
    static void removeRepeating(String s1, String s2){
        String s3 = s1 + " " + s2 + " ";
        String words = "";
        int i = 0;
        for(char x : s3.toCharArray()) {
            if (x == ' ') {
                // Searching for the word in A.
                // If while searching, we reach
                // the end of the String, then
                // the word is not present in
                // the String
                if (!s1.contains(words) ||
                        !s2.contains(words))
                    System.out.print(words);

                // Initialise word for the
                // next iteration
                words = " ";
            }
            else
            {
                words = words + x;
            }
        }
    }
    public static void main(String[] args) {
        String s1 = "I am Safi";
        String s2 = "I am from Chennai";
        removeRepeating(s1, s2);
    }
}

