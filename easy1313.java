public class easy1313 {
    public static int[] decompressRLElist(int[] nums) {
        int len = 0;
        for(int i=0; i<nums.length; i+=2) {
            len += nums[i];
        }
        int[] res = new int[len];
        len = 0;
        for(int i=0; i<nums.length; i+=2) {
            for(int j=0; j<nums[i]; ++j) {
                res[len++] = nums[i+1];
            }
        }
        return res;
    }
    public static void main(String args[]) {
        int[] nums = new int[]{1, 2, 3, 4};
        int[] res = decompressRLElist(nums);
        for(int i=0; i<res.length; ++i){
            System.out.println(res[i]);
        }
    }
}
