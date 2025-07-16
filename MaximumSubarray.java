//time complexity: O(N) where N is the length of array
//space complexity: O(1)
import  java.util.*;
public class MaximumSubarray {
    static int maxSubArray(int[] nums) {
        int len = nums.length;
        int runSum = 0;
        int max = Integer.MIN_VALUE;
        int currStart = 0;
        int end = 0;
        int start = 0;

        for(int i = 0; i < len; i++) {
            runSum += nums[i];
            if(runSum < nums[i]) {
                runSum = nums[i];
                currStart = i;
            }
            if(max < runSum) {
                start = currStart;
                max = runSum;
                end = i;
            }
        }

        System.out.println("Start index: " + start + " and end index :" + end);
        return max;
    }

    public static void main(String[] args) {
        int[] nums = {-2,1,-3,4,-1,2,1,-5,-7, 4, 1};
        System.out.println("Array is:" + Arrays.toString(nums));
        System.out.println("Sum of maximum Subarray: " + maxSubArray(nums));
    }
}
