public class easy1221 {
    public static int balancedStringSplit(String s) {
        int count = 0, numR = 0;
        for (int i=0; i < s.length(); ++i) {
            char c = s.charAt(i);
            if (c == 'R') {
                ++numR;
            } else {
                --numR;
            }
            if (numR == 0) {
                ++count;
            }
        }
        return count;
    }
    public static void main(String args[]) {
        System.out.println(balancedStringSplit("RLRRLLRLRL"));
    }
}
