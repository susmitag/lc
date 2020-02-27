import java.util.ArrayList;

public class easy1281 {
    public static int subtractProductAndSum(int n) {
        ArrayList<Integer> digits = new ArrayList<Integer>();
        int num = n;
        while (num>=10) {
            digits.add(num%10);
            num = num/10;
        }
        if(num>0) {
            digits.add(num);
        }
        int sum = 0, prod = 1;
        for(int digit : digits) {
            sum += digit;
            prod *= digit;
        }
        return prod - sum;
    }
    public static void main(String args[]) {
        System.out.println(subtractProductAndSum(234));
    }
}
