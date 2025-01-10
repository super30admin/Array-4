public class problem2 {

    // Time Complexity:0(n)
    //Space : o(1)
    public int maxSubArray(int[] nums) {
        int n = nums.length;
        int currSubArrSum= nums[0];
        int maxSubArraySUm=nums[0];

        for (int i=0; i<n; i++) {
            currSubArrSum = Math.max(currSubArrSum+nums[i],nums[i]);
            maxSubArraySUm = Math.max(maxSubArraySUm,currSubArrSum);
        }
        return maxSubArraySUm;
    }
}
