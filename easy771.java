import java.util.HashSet;
import java.util.Iterator;

public class easy771 {
    public static int numJewelsInStones(String J, String S) {
        HashSet jSet = new HashSet();
        for (char c : J.toCharArray()) {
            jSet.add(c);
        }
        int matches = 0;
        for (char c : S.toCharArray()) {
            if(jSet.contains(c)){
                ++matches;
            }
        }
        return matches;
    }
    public static void main(String args[]) {
        System.out.println(numJewelsInStones("z", "ZZ"));
    }
}
