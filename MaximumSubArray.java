class Solution {
    public int maxSubArray(int[] nums) {
        int curr = nums[0];
        int max = nums[0];
        for(int i=1;i<nums.length;i++){
            if(nums[i]<nums[i]+curr){
                curr = curr + nums[i];
            }
            else{
                curr = nums[i];
            }
            if(max < curr){
                max = curr;
            }
        }
        return max;
    }
}

//Time complexity : O(N) where N is the length of array
//Space complexity : O(1)
