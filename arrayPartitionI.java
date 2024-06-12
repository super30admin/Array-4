import java.util.Arrays;

// Time Complexity : O(N log N)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No

public class ArrayPartitionI {
    public static void main(String[] args) {
        int[] nums = {1,4,3,2};
        arrayPairSum(nums);
    }

    public static int arrayPairSum(int[] nums) {
        Arrays.sort(nums);  // T.C - O(n log n); S.C - O(1)
        int result = 0;

        for(int i=0; i<nums.length; i=i+2){
            result += nums[i];
        }

        return result;
    }
}

