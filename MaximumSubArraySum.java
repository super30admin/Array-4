// TC: O(n)
// SC: O(1)
public class MaximumSubArraySum {
    // Kadanes Algorithm
    public int maxSubArray(int[] nums) {
        if(nums.length == 1)
            return nums[0];
        int maxSum = nums[0];
        int curSum  = nums[0];
        for(int i=1; i<nums.length; i++){
            // checking if currsum is less than 0 than we dont change sum but we change the cursum value to current number
            if(curSum >= 0)
                curSum += nums[i];
            else
                curSum = nums[i];
            // getting max value on the go
            if(curSum > maxSum)
                maxSum = curSum;
        }
        return maxSum;
        // int max = Integer.MIN_VALUE;
        // for(int i=0; i<nums.length; i++){
        //     for(int j=nums.length-1; j>=i; j--){
        //         int temp = helper(nums, i, j);
        //         if(temp > max){
        //             max = temp;
        //         }
        //     }
        //     System.out.println(max);
        // }
        // return max;
    }
    
    public int helper(int[] nums, int start, int end){
        int sum = 0;
        for(int i=start; i<=end; i++){
            sum += nums[i];
        }
        return sum;
    }
}