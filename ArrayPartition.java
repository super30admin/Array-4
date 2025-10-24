import java.util.HashMap;
import java.util.Map;

//TC: O(n), SC: O(n)
public class ArrayPartition {

    //Let's assume we have an array of nums -> [6,2,6,5,1,2]
    //the best sum will be 9
    //min(1, 2) + min(2, 5) + min(6, 6) = 1 + 2 + 6 = 9
    //if you observe carefully, we sorted the nums array to get this number
    //instead of sorting like this Arrays.sort(nums), which would be O(n logn)
    //we will use bucket sort instead O(n) since we need to choose numbers at even positions only
    public int arrayPairSum(int[] nums) {
        int min = Integer.MAX_VALUE, max = Integer.MIN_VALUE;

        final Map<Integer, Integer> freq = new HashMap<>();
        for (int num: nums) {
            max = Math.max(max, num);
            min = Math.min(min, num);

            freq.put(num, freq.getOrDefault(num, 0) + 1);
        }

        int sum = 0;
        boolean flag = true;

        //bucket sort
        for (int i = min; i <= max; i++) {
            if (!freq.containsKey(i)) continue;

            if (!flag) {
                freq.put(i, freq.get(i) - 1);
                flag = true;
            }

            int count = freq.get(i);
            sum += (count/2) * i;

            if (count % 2 != 0) {
                sum += i;
                flag = false;
            }
        }

        return sum;
    }
}
