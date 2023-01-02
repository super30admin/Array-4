//Time complexity: O(nLogn)
//Space Complexity: O(1)
//Did the code run successfully in LeetCode = yes

package com.madhurima;

import java.util.Arrays;

public class ArrayPartition1 {

    public int arrayPairSum(int[] nums) {
        if(nums == null || nums.length == 0){
            return 0;
        }

        int n = nums.length;
        int result = 0;

        Arrays.sort(nums);

        for(int i = 0; i < n; i = i+2){
            result = result + nums[i];
        }

        return result;
    }

}


