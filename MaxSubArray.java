// Time Complexity : The time complexity is O(n) where n is the length of array
// Space Complexity : The space complexity if O(1)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No

// Your code here along with comments explaining your approach

class Solution {
    public int maxSubArray(int[] nums) {

        if(nums.length == 0){
            return 0;
        }

        int max = nums[0];
        int sum = nums[0];

        for(int i=1;i<nums.length;i++){

            // if the current number adds value to the current sum
            if(sum + nums[i] > nums[i]){
                sum += nums[i];
            }
            // if current number doesnt add value to the current sum
            else{
                sum = nums[i];
            }

            max = Math.max(max,sum);
        }

        return max;

    }
}