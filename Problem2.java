// Time : O(n)
//Space : O(1)
// LeetCode : Yes
// Approach:
// 1. Have a runningsum and a max value set to 0.
// 2. Now iterate through the whole array and add current value to running sum . If runningsum is less than 0 reset it to 0 .else update max as
//    max of previous max and runningsum.
// 3. now if still max is 0, then all are negative elements in array . So return smallest negative element.
public class maxSubArray {
    public static int maxSubArray(int[] nums) {
        int max = 0;
        int runningsum = 0;
        for(int i = 0;i<nums.length;i++){
            runningsum += nums[i];
            if(runningsum<0)    runningsum = 0;
            max = Math.max(runningsum,max);
        }
        if(max == 0){
            max = nums[0];
            for(int i : nums)
                max = Math.max(max,i);
        }
        return max;
    }
}
