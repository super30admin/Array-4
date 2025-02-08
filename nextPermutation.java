// Time Complexity : O(n)
// Space Complexity :O(1)
// Did this code successfully run on Leetcode : yes
// Any problem you faced while coding this : no
 
class Solution {

    public void reverse(int[] nums, int st, int end) {
        while (st < end) {
            swap(nums, st, end);
            st++;
            end--;
        }
    }

    public void swap(int[] nums, int a, int b) {
        int temp = nums[a];
        nums[a] = nums[b];
        nums[b] = temp;
    }

    public void nextPermutation(int[] nums) {
        int n = nums.length;
        boolean flag = false;
        for (int i = n - 1; i > 0; i--) {
            if (nums[i - 1] < nums[i]) {
                for (int j = n - 1; j > i - 1; j--) {
                    if (nums[j] > nums[i - 1]) {
                        swap(nums, j, i - 1);
                        break;
                    }
                }
                reverse(nums, i, n - 1);
                flag = true;
                break;
            }
        }
        if (!flag) {
            reverse(nums, 0, n - 1);
        }
    }
}
