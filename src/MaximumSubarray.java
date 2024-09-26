// TC: O(n)
// SC: O(1)
class MaximumSubarray {
    public int maxSubArray(int[] nums) {
        int max = nums[0];
        int sum = nums[0];
        int start = 0;
        int end = 0;
        int currentStart = 0;
        for(int i=1;i<nums.length;i++) {
            // sum = Math.max(sum + nums[i], nums[i]);
            sum += nums[i];
            if(nums[i] > sum) {
                sum = nums[i];
                currentStart = i;
            }

            // max = Math.max(max, sum);
            if(sum > max) {
                max = sum;
                start = currentStart;
                end = i;
            }
        }
        System.out.println(start); 
        System.out.println(end);
        return max;
    }
}