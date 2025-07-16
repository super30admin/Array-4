import java.util.Arrays;
import java.util.HashMap;

//Time Complexity: O(n log n) for sorting the array
//Space Complexity: O(1) for the result variable, as we are not using any additional data structures that grow with input size
// Intuition: Sort the array and sum every second element starting from the first element.
class ArrayPartition {
    public int arrayPairSum(int[] nums) {
        Arrays.sort(nums);
        int result = 0;
        for (int i = 0; i < nums.length; i += 2) {
            result += nums[i];
        }
        return result;
    }
}

// We can also use the range and use bucket sort to achieve O(n) time complexity
// using the min and max of the array.

// Time complexity: O(n) for bucket sort
// Space complexity: O(n) for the bucket array
class ArrayPairBucketSort {
    public int arrayPairSum(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<>();
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;

        int result = 0;

        for (int num : nums) {
            min = Math.min(min, num);
            max = Math.max(max, num);
            map.put(num, map.getOrDefault(num, 0) + 1);
        }

        boolean skipNext = false;
        for (int i = min; i <= max; i++) {
            if (!map.containsKey(i))
                continue;
            int currCount = map.get(i);
            while (currCount > 0) {
                if (!skipNext) {
                    result += i;
                }
                skipNext = !skipNext;
                currCount--;
                map.put(i, currCount);
            }
            map.remove(i);
        }

        return result;
    }
}
