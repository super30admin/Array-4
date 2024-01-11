// Time Complexity : O(n)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : yes
// Any problem you faced while coding this :

class MaximumSubArray {
    public int maxSubArray(int[] nums) {
        int n = nums.length;
        int currsum = nums[0];
        int max = nums[0];
        int start = 0;
        int end = 0;
        int currpointer = 0;
        for(int i = 1; i < n; i++){
            currsum += nums[i];
            if(currsum < nums[i]){
                currsum = nums[i];
                currpointer = i;
            }
            if(max < currsum){
                max = currsum;
                start = currpointer;
                end = i;
            }
        }
        System.out.println(start + " "+ end);
        return max;
    }

    public static void main(String[] args) {
        MaximumSubArray solution = new MaximumSubArray();

        // Example usage
        int[] nums = {-2, 1, -3, 4, -1, 2, 1, -5, 4};
        int result = solution.maxSubArray(nums);

        System.out.println("Maximum Subarray Sum: " + result);
    }
}

