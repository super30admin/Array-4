//Time complexity: O(n)
//Space Complexity: O(1)
//Did the code run successfully in LeetCode = yes

package com.madhurima;

public class MaximumSubArray {
}

class MaximumSubArraySolution {
    public int maxSubArray(int[] nums) {
        if(nums == null || nums.length == 0){
            return 0;
        }

        int max = nums[0];
        int rsum = nums[0];

        for(int i = 1; i < nums.length; i++){
            rsum = Math.max(rsum + nums[i], nums[i]); //rsum is best of adding new element to it or starting afresh with new element
            max = Math.max(max, rsum);
        }

        return max;

    }
}
