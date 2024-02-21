/*
* Did this code successfully run on Leetcode : YES
* 
* Any problem you faced while coding this : NO
* 
* Time Complexity: O(n) + O(maxKey - minKey)
    n = length of nums
    maxKey = max integer in nums
    minKey = min integer in nums
* 
* Space Complexity: O(n)
* 
*/
import java.util.HashMap;

public class ArrayPartition {
    public int arrayPairSum(int[] nums) {
        // bucket sort

        HashMap<Integer, Integer> freqMap = new HashMap<>();

        int maxKey = Integer.MIN_VALUE, minKey = Integer.MAX_VALUE;

        for (int num : nums) {
            freqMap.put(num, freqMap.getOrDefault(num, 0) + 1);

            maxKey = Math.max(maxKey, num);
            minKey = Math.min(minKey, num);
        }

        boolean isPreviousNumRemaining = false;

        int sum = 0;

        for (int key = minKey; key <= maxKey; key++) {
            if (freqMap.containsKey(key)) {
                if (isPreviousNumRemaining) {
                    freqMap.put(key, freqMap.get(key) - 1);
                }

                int count = freqMap.get(key);

                sum += ((count + 1) / 2) * key;

                if (count % 2 == 0) {
                    isPreviousNumRemaining = false;
                } else {
                    isPreviousNumRemaining = true;
                }
            }
        }

        return sum;
    }
}
