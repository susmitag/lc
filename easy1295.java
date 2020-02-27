public class easy1295 {
    private static int countDigits(int num) {
        int c = 0;
        while (num != 0) {
            num = num / 10;
            ++c;
        }
        return c;
    }

    public static int findNumbers(int[] nums) {
        int countEven = 0;
        for (int num : nums) {
            int c = countDigits(num);
            if (c % 2 == 0) {
                ++countEven;
            }
        }
        return countEven;
    }

    public static void main(String args[]) {
        int[] nums = {12, 345, 2, 6, 7896};
        System.out.println(findNumbers(nums));
    }
}
