// Time Complexity : O(nlogn)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No

class Solution {
    public int arrayPairSum(int[] nums) {
        Arrays.sort(nums);
        int n = nums.length;
        int total = 0;
        for(int i = 0; i< n; i++){
            if(i % 2 == 0){
                total = total + nums[i];
            }
        }
        return total;
    }
}  