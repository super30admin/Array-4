// Time Complexity  - O(n) as array is traversed only once
// Space Complexity - O(1) Constant space
public class MaximumSubArray {
    public int maxSubArray(int [] nums) {
        // initiaize currentSum and maxSum
        int currSum = 0;
        int maxSum = Integer.MIN_VALUE;

        // iterate through the array to dexxide whether to add to the current Subarray or choose a new one

        for (int num : nums) {
            currSum = Math.max(num, currSum + num); // update the currentSum
            maxSum = Math.max(maxSum, currSum); // update the global maximum
        }
        return maxSum;
    }

    public static void main(String [] args){
        MaximumSubArray solution = new MaximumSubArray();
        int [] nums = {-2,1,-3,4,-1,2,1,-5,4 };
        System.out.println("Maximum Subarray Sum: " + solution.maxSubArray(nums)); // Output: 6
    }
}
