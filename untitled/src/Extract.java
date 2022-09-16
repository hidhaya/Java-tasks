public class Extract {
    public static String Extract(String str, int number) {
        if (str.length() < number) {
            return str;
        }
        return str.substring(0, number);
    }
    public static void main(String[] args) {
            String str = "Robin";
            int number = 3;
        System.out.println(Extract(str, number));
        }

    }

