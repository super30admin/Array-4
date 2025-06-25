// Time Complexity : O(2n + Max No)
// Space Complexity : O(range), for hashmap for bucket sort
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No
// Approach -
//   - The goal is to maximize the sum of min(ai, bi) for n pairs from the array.
//   - Count the frequency of each number using a hashmap.
//   - Iterate through the sorted keys (from min to max):
//       - If the previous iteration had an unpaired number (odd frequency), skip one occurrence.
//       - Add half the count times the number to the result (number is paired with itself).
//       - If the count is odd, add one more occurrence to the result and carry forward one unpaired element using a flag.

import java.util.Arrays;
import java.util.HashMap;

public class ArrayPartition {
    //sort - TC = O(2n Log 2n), SC = O(2logn)  depends on built in sort
    // public int arrayPairSum(int[] nums) {
    //     Arrays.sort(nums);
    //     int result = 0;
    //     for(int i = 0; i < nums.length; i+=2) {
    //         result += Math.min(nums[i], nums[i+1]);
    //     }
    //     return result;
    // }

    //Bucket sort - TC = O(2n + Max No), SC = O(range)
    public int arrayPairSum(int[] nums) {
        int[] frequencyMap = new int[10001];    //range is 10^4
        int n = nums.length;
        int result = 0;
        HashMap<Integer, Integer> map = new HashMap<>();
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;

        for(int num: nums) {
            map.put(num, map.getOrDefault(num, 0) + 1);
            min = Math.min(min, num);
            max = Math.max(max, num);
        }

        boolean flag = false;   //flag to set true if we encounter odd freq earlier
        for(int i = min; i <= max; i++) {
            if(!map.containsKey(i)) continue;
            if(flag) {
                map.put(i, map.get(i) - 1);
            }
            int freq = map.get(i);
            if(freq % 2 == 0) { //even count so make pairs of same no.
                result += freq / 2 * i;
                flag = false;
            } else {
                result += freq / 2 * i;
                result += i;
                flag = true;
            }
        }

        return result;
    }

    public static void main(String[] args) {
        ArrayPartition solver = new ArrayPartition();

        int[] nums1 = {1, 4, 3, 2};
        System.out.println("Input: " + Arrays.toString(nums1));
        System.out.println("Max sum of pairs: " + solver.arrayPairSum(nums1)); // Expected: 4

        int[] nums2 = {6, 2, 6, 5, 1, 2};
        System.out.println("Input: " + Arrays.toString(nums2));
        System.out.println("Max sum of pairs: " + solver.arrayPairSum(nums2)); // Expected: 9
    }
}
