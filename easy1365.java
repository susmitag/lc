public class easy1365 {
        public static int[] smallerNumbersThanCurrent(int[] nums) {
            int[] arrayNew = new int[nums.length];
            for (int i = 0; i < nums.length; i++)
            {
                int count = 0;
                for (int j = 0; j < nums.length; j++)
                {
                    if ( (j != i) && (nums[j] < nums[i]))
                        count++;

                }
                arrayNew[i] = count;
            }
            return  arrayNew;
        }

        public static void main(String args[]) {
            int[] arr = new int[]{8, 1, 2, 2, 3};
            int[] count = smallerNumbersThanCurrent(arr);
            for(int i=0; i<arr.length; ++i) {
                System.out.println(count[i]);
            }
        }
}