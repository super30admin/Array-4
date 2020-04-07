
// Time Complexity :O(NlogN)
// Space Complexity :O(1)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this :No


// Your code here along with comments explaining your approachclass Solution {
    public int arrayPairSum(int[] nums) {
        if(nums==null || nums.length==0) return 0;
        Arrays.sort(nums);
        int result=nums[0];
        int i=2;
        while(i<nums.length){
            result+=nums[i];
            i=i+2;
        }
        return result;
    }
}