import java.util.Arrays;

public class ArrayPartition {
    //https://leetcode.com/problems/array-partition/

    public int arrayPairSum(int[] nums) {
        if (nums == null || nums.length == 0) {
            return 0;
        }
        // Sort the array

        Arrays.sort(nums);
        int total = 0;
        // Add every alternate element assumign we created pairs of   two elements as per the problem

        for (int i = 0; i < nums.length; i = i + 2) {
            total = total + nums[i];
        }

        // an alternate solution in which if we calculate the mod of
        // an i and get zero we are adding all alternate elemnts which are smallest in pair as per sorting

        /**  for (int i = 0; i < nums.length; i++) {
         if (i % 2 == 0) {
         total = total + nums[i];
         }
         }*/

        return total;
    }
}
