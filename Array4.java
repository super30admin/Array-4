# Array-4
import java.util.Arrays;

## Problem1 Array partition I (https://leetcode.com/problems/array-partition-i/)
//Time complexity: O(nlogn)
//Space complexity: O(1)
class Solution {
    public int arrayPairSum(int[] nums) {
        if(nums == null || nums.length == 0) return 0;
        Arrays.sort(nums);
        int result = 0;
        for(int i = 0; i < nums.length; i = i+2)
            result += nums[i];
        return result;
    }
}
## Problem2 Maximum Subarray (https://leetcode.com/problems/maximum-subarray/)
//Time complexity: O(n)
//Space complexity: O(n)
class Solution2 {
    public int maxSubArray(int[] nums) {
        if(nums == null || nums.length == 0) return 0;
        int rsum = nums[0];
        int max = nums[0];
        for(int i=1; i < nums.length; i++) {
            rsum = Math.max(nums[i], rsum + nums[i]);
            max = Math.max(max, rsum);
        }
        return max;
    }
}

## Problem3  Next permutation(https://leetcode.com/problems/next-permutation/)
// time complexity: O(n)
// space complexity: O(1)
class Solution3 {
    public void nextPermutation(int[] nums) {
        if(nums == null || nums.length == 0) return;
        int n = nums.length;
        int i = n-2;
        
        //finding breach
        while(i >= 0 && nums[i] >= nums[i+1]) i--;
        
        // swapping with the breach element
        int j = n-1;
        if(i >= 0) {
            while(nums[j] <= nums[i]) j--;
            swap(nums, i, j);
        }
        
        //reverse the other elements
        reverse(nums, i+1, n-1);
    }
    
    private void reverse(int[] nums, int l, int r) {
        while(l < r) {
            swap(nums, l, r);
            l++;  r--;
        }
    }
    
    private void swap(int[] nums, int i, int j) {
        int temp;
        temp  = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
}
