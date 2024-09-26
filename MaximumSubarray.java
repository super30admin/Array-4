class Solution {
    public int maxSubArray(int[] nums) {
        
        if(nums == null || nums.length == 0){
            return 0;
        }
        
        int n = nums.length;
        
        int runningSumMax = nums[0];
        int max = nums[0];
        
        int start = 0;
        int end = 0;
        int currStart = 0;
        
        
        for( int i = 1; i< n; i++){
           // runningSumMax = Math.max(runningSumMax + nums[i], nums[i]);
            //max = Math.max(max, runningSumMax);
            
            
            if(nums[i] > runningSumMax + nums[i]){
                runningSumMax = nums[i];
                currStart = i;
            }else{
                runningSumMax = runningSumMax + nums[i];
            }
            if(runningSumMax > max){
                max = runningSumMax;
                start = currStart;
                end = i;
            }
        }
        System.out.println("start. "+start + "end  " + end );
        
        
        return max;
        
    }
}