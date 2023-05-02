//Time -> O(n)
//Space -> O(1)

class Problem2 {
        public int maxSubArray(int[] nums) {
            if(nums.length == 0 || nums == null)
                return 0; 
            int max = nums[0];
            int currSum = nums[0];
            int start = 0; 
            int end = 0; 
            int currStart = 0; 
            for(int i = 1; i < nums.length; i++){
                if(currSum + nums[i] < nums[i]){
                    currSum = nums[i];
                    currStart = i; 
                }
                else{
                    currSum += nums[i];
                }
                if(max < currSum){
                    max = currSum;
                    start = currStart; 
                    end = i;
                }
            }
            return max;
        }
}
