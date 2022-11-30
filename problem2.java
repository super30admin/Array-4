package Array-4;

public class problem2 {
    //TC:- O(n)
    //SC:_ O(1)
    public int maxSubArray(int[] nums) {
        if(nums == null || nums.length == 0) return 0;
        
        int n = nums.length;
        int rsum = nums[0];
        int max = nums[0];
        
        for(int i = 1; i< n; i++){
            rsum = Math.max(rsum + nums[i], nums[i]);
            max = Math.max(max, rsum);
        }
        
        return max;
    }
}
