public class ArrayPartition {
    
    /**
     * Time Complexity: O(nlogn) N is size of array
     * Space complexity: O(1)
     * 
     * Approach:
     * 1. Sort the array
     */

        public int arrayPairSum(int[] nums) {
            if(nums == null || nums.length == 0)
                return 0;
            
            Arrays.sort(nums);
            int res = 0;
            for(int i=0; i<nums.length-1; i+=2){
                res += Math.min(nums[i], nums[i+1]);
            }
            
            return res;
        }
    
}