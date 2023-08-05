public class MaximumSubarray {
    //Time Complexity: O(N)
    //Space complexity: O(1)
    public int maxSubArray(int[] nums) {
        int currentMax = 0;
        int max = Integer.MIN_VALUE;;

        for(int i =0; i< nums.length; i++){
            currentMax = Math.max(currentMax+ nums[i], nums[i]);
            max = Math.max(currentMax, max);
        }

        return max;

    }
}
