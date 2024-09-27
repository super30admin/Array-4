package Array4;

import java.util.Arrays;

public class ArrayPartition1 {
    /* Created by palak on 8/13/2021 */

    /**
     Maximize the sums of minimums in the Pair
     Sort and form pairs
     2n given length => form the pairs
     find the minimum in the pair OR
     since they are sorted, add all the first values of the pair and RETURN.

     Time Complexity: O(n log n)
     Space Complexity: O(1)
     */
    public int arrayPairSum(int[] nums) {
        Arrays.sort(nums);
        int sum = 0;
        for(int i = 0 ; i < nums.length ; i+=2) {
            sum += nums[i];
        }
        return sum;
    }

    public static void main(String[] args) {

    }
}
