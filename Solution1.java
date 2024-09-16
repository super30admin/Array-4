import java.util.Arrays;

// Time Complexity :O(nlogn) sorting the array
// Space Complexity :O(1) no extra space
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No


// Your code here along with comments explaining your approach

//sort the array and pick min starting from 0 index as the min values will contribute ledd to the sum
class Solution {
    public int arrayPairSum(int[] nums) {
        if(nums.length==0||nums==null)
            return 0;
        
        Arrays.sort(nums);
        int sum=0;
        for(int i=0;i<nums.length;i=i+2){
            sum+=nums[i];
        }
        
        return sum;
    }
}