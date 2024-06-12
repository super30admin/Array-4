//Time complexity O(n)
//Space complexity O(1)
//Did this code successfully run on Leetcode : Yes
//Any problem you faced while coding this : No
class Solution {
    public int maxSubArray(int[] nums) {
        
        if(nums.length == 0){
            
            return 0;
        }
        
        int currentWindow = nums[0];
        int max = nums[0];
        int currStart = 0;
        int start = 0;
        int end = 0;
        for(int i = 1; i < nums.length; i ++){
            
            
            int sum = currentWindow + nums[i];
            
            if(nums[i] > sum){
                
                currStart = i;
                currentWindow = Math.max(sum, nums[i]);
            }
            else currentWindow = sum;
            
            if(max < currentWindow){
                
                start = currStart;
                end = i;
                max = currentWindow;
            }
          //  max = Math.max(max, currentWindow);
            
            
        }
        System.out.println(start);
        System.out.println(end);
        
        return max;
    }
}