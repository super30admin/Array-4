//Time Complexity: O(n)
//Space Complexity: O(1)

public class MaximumSubArray {
    public int maxSubArray(int[] nums) {
        if(nums == null || nums.length == 0) return 0;
        int local = nums[0], global = nums[0];
        for(int i = 1; i < nums.length; i++){
            local = Math.max(local + nums[i], nums[i]);
            global = Math.max(local, global);
        }
        return global;
    }
}
