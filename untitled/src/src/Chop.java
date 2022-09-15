package src;

import java.util.ArrayList;
import java.util.List;

public class Chop {
    public static List<String> split(String s, int chunkSize){
        List<String> chunks = new ArrayList<>();
        for(int i = 0; i < s.length(); i = i + chunkSize){
            chunks.add(s.substring(i,Math.min(s.length(), i+chunkSize)));
        }
        return chunks;

    }
    public static void main(String[] args){
            String s = "javacoding";
            int chunkSize = 2;
            System.out.println(split(s, chunkSize));//[ja, va, co,di, ng]
}
}

