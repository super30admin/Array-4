// Time Complexity : O(N)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No
public class NextPermutation {
    class Solution {
        public void nextPermutation(int[] nums) {
            if(nums  == null) return;
            int n = nums.length;

            //find the breach such that num[i]< num[i+1]
            int i = n-2;
            for(; i >= 0 ;i--) {
                if(nums[i] < nums[i+1])
                    break;
            }

            //swap num[i] with number  present from (i+1 till i=n) just greater than num[i]
            if(i>=0) {
                int j =n-1;
                while(nums[i] >= nums[j]){
                    j--;
                }
                swap(nums, i, j);
            }

            //reverse all nums from i+1 till i=n

            reverse(nums, i+1, n-1);

        }

        private void reverse(int[] nums, int start, int end) {
            int l = start;
            int r = end;
            while(l <= r) {
                swap(nums,l, r);
                l++;
                r--;
            }
        }

        private void swap(int[] nums, int i, int j) {
            int temp = nums[i];
            nums[i] = nums[j];
            nums[j] = temp;
        }
    }
}
