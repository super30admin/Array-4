// Time Complexity : O(n)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : None

public class NextPermutation {
    class Solution {
        public void nextPermutation(int[] nums) {
            int n = nums.length;

            if(n == 0)
                return;
            int idx = -1;

            for(int i = n-2; i >= 0; i--){
                if(nums[i] < nums[i + 1]){
                    idx = i;
                    break;
                }
            }
            System.out.println(idx);

            if(idx != -1){
                //find swap element
                int min = 0;
                for(int j = n-1; j > idx; j--){
                    if(nums[j] > nums[idx]){
                        min = j;
                        break;
                    }
                }
                System.out.println(min);
                swap(nums, idx, min);
                reverse(nums, idx + 1, n - 1);
            }else{
                reverse(nums, 0, n-1);
            }
        }

        private void reverse(int[] nums, int l, int r){
            while(l <= r){
                swap(nums, l, r);
                l++;
                r--;
            }
        }

        private void swap(int[] nums, int l, int r){
            int temp = nums[l];
            nums[l] = nums[r];
            nums[r] = temp;
        }
    }
}
