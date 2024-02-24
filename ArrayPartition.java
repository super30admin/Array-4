import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class ArrayPartition {
    public int arrayPairSum(int[] nums) {
        // return arrayPairSumUsingSort(nums);
        return arrayPairSumUsingBucketSort(nums);
    }
    // TC: O(N) + O(Max - Min) where N is length of array, Max is max element in array, Min in min element in array
    // SC: O(1)
    private int arrayPairSumUsingBucketSort(int[] nums) {
        Map<Integer, Integer> counts = new HashMap<>();
        int min = Integer.MAX_VALUE, max = Integer.MIN_VALUE;
        for (int i : nums) {
            counts.put(i, counts.getOrDefault(i, 0) + 1);
            min = Math.min(min, i);
            max = Math.max(max, i);
        }
        int res = 0;
        boolean flag = false;
        for (int i = min; i <= max; i++) {
            if (counts.containsKey(i)) {
                if (flag) {
                    counts.put(i, counts.get(i) - 1);
                }
                int count = counts.get(i);
                res += (count / 2) * i;
                if (count % 2 != 0) {
                    res += i;
                    flag = true;
                } else {
                    flag = false;
                }
            }
        }
        return res;
    }
    // TC: O(NlogN) where N is length of array
    // SC: O(1)
    private int arrayPairSumUsingSort(int[] nums) {
        int res = 0;
        Arrays.sort(nums);
        for (int i = 0; i < nums.length; i = i + 2) {
            res += nums[i];
        }
        return res;
    }
}
