// Time Complexity :O(nlog +n/2) => O(nLogn)
// Space Complexity :O(1)
// Did this code successfully run on Leetcode : yes
// Any problem you faced while coding this : 

// Your code here along with comments explaining your approach
// if we sort the array and pick/add every odd number it will be maximum sum of all minimum values of all pairs


class Solution {
    public int arrayPairSum(int[] nums) {
        
        Arrays.sort(nums);
        int sum =0;
        for(int i =0; i <nums.length; i+=2)
        {
            sum+=nums[i];
        }
        
        return sum;
    }
}
