public class easy1108 {
    public static String defangIPaddr(String address) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < address.length(); ++i) {
            char c = address.charAt(i);
            if ( c == '.'){
                sb.append("[.]");
            } else {
                sb.append(Character.toString(c));
            }
        }
        return sb.toString();
    }

    public static void main(String args[]){
        System.out.println(defangIPaddr("1.1.1.1"));
    }
}
