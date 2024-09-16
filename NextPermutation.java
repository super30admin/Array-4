public class NextPermutation {

        /**
         * Time Complexity: O(N) N is size of array
         * Space complexity: O(1)
         * 
         * Approach:
         * 1. Iterate from end of the array and find the first number which is less than its next number (store it as
         * action index)
         * 2. Again iterate from end and find the number greater than number at action index, swap the numbers at
         * these two indices.
         * 3. Now reverse all the numbers froma ction index till end.
         */


        public void nextPermutation(int[] nums) {

            if(nums == null || nums.length == 0)
                return;

            int i = nums.length-2;
            while(i >= 0 && nums[i] >= nums[i+1]) {
                i--;
            }
            if(i < 0){
                reverse(nums, 0, nums.length-1);
                return;
            }

            int j = nums.length-1;
            while(j >= 0 && nums[j] <= nums[i]){
                j--;
            }
            swap(nums, i, j);

            reverse(nums, i+1, nums.length-1);

        }

        public void swap(int[] nums, int i, int j) {
            int temp = nums[i];
            nums[i] = nums[j];
            nums[j] = temp;
        }

        public void reverse(int[] nums, int start, int end) {
            while(start < end) {
                swap(nums, start, end);
                start++;
                end--;
            }
        }
    
}