//TC : O(n)
//SC : O(1)
class Solution {
    public int maxSubArray(int[] nums) {
        if(nums == null || nums.length == 0)
            return 0;
        
        int globalSum = Integer.MIN_VALUE;
        int localSum = 0;
        
        int slow=0,fast=0;
        int p1=slow,p2=fast;

        while(fast<nums.length){
            //Check if the window has the maximum sum or the current number is more
            localSum = Math.max(localSum+nums[fast],nums[fast]);

            //if current number is more,move fast pointer
            if(localSum==nums[fast])
                slow = fast;

            //Update global sum, Kepp track of slow and fast pointer
            if(localSum > globalSum){
                p1=slow;
                p2=fast;
                globalSum = localSum;
            }
                
            fast++;
        }
        System.out.println(p1+" "+p2);
        return globalSum;
    }
}