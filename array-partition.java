// Time Complexity : O(n + range) where range = max - min
// Space Complexity : O(range) in the worst case for the frequency map
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No


// Your code here along with comments explaining your approach in three sentences only
// We use a frequency map to simulate counting sort instead of explicitly sorting the array.
// While iterating from the minimum value to the maximum value, we determine whether to take or skip occurrences based on pairing order.
// The flag indicates whether the current value should skip one occurrence because it was already paired with the previous value.

class Solution {
    public int arrayPairSum(int[] nums) {

        Map<Integer, Integer> map = new HashMap<>();

        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        int result = 0;

        // build frequency map and find range
        for(int num : nums) {
            map.put(num, map.getOrDefault(num, 0) + 1);
            min = Math.min(min, num);
            max = Math.max(max, num);
        }

        boolean flag = false;

        // iterate values in sorted order
        for(int i = min; i <= max; i++) {

            if(!map.containsKey(i)) continue;

            // skip one occurrence if previous value was waiting for a pair
            if(flag) {
                map.put(i, map.get(i) - 1);
            }

            int cnt = map.get(i);

            if(cnt % 2 == 0) {
                result += (cnt / 2) * i;
                flag = false;
            } else {
                result += (cnt / 2) * i;
                result += i;
                flag = true;
            }
        }

        return result;
    }
}