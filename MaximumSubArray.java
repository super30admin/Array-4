//Time = O(N)
//Space = O(1)
//LeetCode = yes
//Any issue = No

class Solution {
    public int maxSubArray(int[] nums) {
        //validate
        if(nums==null || nums.length==0) return -1;
        int slow=0, fast=0, p1=0, p2=0;
        int localMax=nums[0], globalMax=nums[0]; //init position in case of negative values
    
        for(fast=1; fast<nums.length; fast++){
            localMax += nums[fast];
            
            if(nums[fast]>localMax){
                localMax=nums[fast];
                slow=fast;
            }
            
            if(localMax>globalMax){
                globalMax=localMax;
                //p1=slow;
                //p2=fast; 
                /*saving p1 p2 for if the pointers of sub array are asked.*/
            }
        }
        return globalMax;
    }
}
