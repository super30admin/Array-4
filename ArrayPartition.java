// Time Complexity : O(nlogn) to sort the array
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : None

import java.util.*;

class ArrayPartition {
    public int arrayPairSum(int[] nums) {
        Arrays.sort(nums);
        int result = 0;
        for(int i=0;i<nums.length;i+=2){
            result+=nums[i];
        }
        return result;
    }

    public static void main(String [] args){
        ArrayPartition ap = new ArrayPartition();
        System.out.println(ap.arrayPairSum(new int[]{6,2,6,5,1,2}));
    }
}