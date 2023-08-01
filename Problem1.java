package Array4;

import java.util.Arrays;

/**
 * If we sort the array then we ensure that till the current index atleast one
 * of every two largest elements in the arr will be taken in the sum.
 * 
 * Time Complexity : O(nlogn)- where n is length of given array
 * 
 * Space Complexity : O(1)
 * 
 * Did this code successfully run on Leetcode : yes
 * 
 * Any problem you faced while coding this : No
 */
public class Problem1 {
    public int arrayPairSum(int[] nums) {
        Arrays.sort(nums);
        int sum=0;
        for(int i=0;i<nums.length;i+=2){
            sum+=nums[i];
        }

        return sum;
    }
}
