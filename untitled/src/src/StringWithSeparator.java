package src;

public class StringWithSeparator {
    public static void main(String[] args){
        String s = "Robin Singh from USA";
        // split string into an array of substrings
        String[] str = s.split("\\s");
        System.out.println(str);//["robin","Singh","from","USA"]
        // join method returns string with separator
     String joinString = String.join("-", str);//"Robin-Singh-from-USA"
     System.out.println(joinString.toLowerCase());// robin-singh-from-usa
    }
    }

