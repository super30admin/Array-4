class Solution {
    public int maxSubArray(int[] nums) {
        
        int localSum = nums[0];
        int globalSum = nums[0];
        
        for(int i = 1; i < nums.length;  i++){
            localSum = Math.max(nums[i], localSum + nums[i]);
            if(localSum > globalSum){
                globalSum = localSum;
            }
        }
        
        return globalSum;
    }
}

//Time : O(n)
//Space : O(1)