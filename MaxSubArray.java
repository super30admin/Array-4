//Time Complexity - O(n)

class Solution {
    public int maxSubArray(int[] nums) {
        if(nums == null || nums.length == 0){
            return -1;
        }
        int n = nums.length;
        int rsum = nums[0];
        int max = nums[0];
        int start = 0; int end = 0;
        int currstart = 0;
        for(int i = 1; i <= n-1; i++){
            if(nums[i] > rsum + nums[i]){
                currstart = i;
                rsum = nums[i];
            }else{
                rsum = rsum + nums[i];
            }
            if(rsum > max){
                max =rsum;
                start = currstart;
                end  = i;
            }
        }
            System.out.println(start);
            System.out.println(end);
            
            
           // rsum = Math.max(nums[i] , rsum + nums[i]);
          //  max = Math.max(max, rsum);
       
        return max;
    }
}