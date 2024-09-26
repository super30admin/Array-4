package Dec20;

class MaximumSubarray {
    public int maxSubArray(int[] nums) {
        /*
        Time complexity: O(n) because we are maintaining a running sum at every index of the array and checking if including the element at current index gives a better sum than (running sum till (current index-1) + element at current index)
        
        Note:
        Below solution also covers finding the start and end index of the maxSum subarray.
        */
        
        // edge
        if (nums == null || nums.length == 0) {
            return 0;
        }
        int len = nums.length;
        int maxSum = Integer.MIN_VALUE;
        int runningSum = 0;
        // to give max sum subarray, maintain two pointers start and end to mark start and end indexes of maxSum subarray.
        int start = 0, end = 0;
        int currStart = 0;
        
        for (int i = 0; i < len; i++) {
            
            if (nums[i] > runningSum+nums[i]) {
                currStart = i;
                runningSum = nums[i];
            } else {
                runningSum = runningSum+nums[i];
            }
            if (runningSum > maxSum) {
                maxSum = runningSum;
                start = currStart;
                end = i;
            }
           // runningSum = Math.max(runningSum+nums[i], nums[i]);
           // maxSum = Math.max(maxSum, runningSum);
        }
        System.out.println(start);
        System.out.println(end);
        return maxSum;
    }
    
}