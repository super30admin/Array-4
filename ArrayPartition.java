import java.util.Arrays;
import java.util.HashMap;

public class ArrayPartition {
    public int arrayPairSum(int[] nums) {
        int n = nums.length;
        Arrays.sort(nums);
        int res = 0;

        for (int i = 0; i < n; i += 2) {
            res += nums[i];
        }

        return res;
    }
}

//TC: O(n*logn), SC: O(1)


//Approach - 2 (Bucket Sort)
class Solution {
    public int arrayPairSum(int[] nums) {
        int n = nums.length;

        HashMap<Integer, Integer> map = new HashMap<>();
        int res = 0;
        int min = Integer.MAX_VALUE, max = Integer.MIN_VALUE;

        for (int num : nums) {
            map.put(num, map.getOrDefault(num, 0) + 1);
            min = Math.min(min, num);
            max = Math.max(max, num);
        }

        boolean flag = false;

        for (int i = min; i <= max; i++) {
            if (!map.containsKey(i))
                continue;

            if (flag) {
                map.put(i, map.get(i) - 1);
            }

            int frq = map.get(i);

            if (frq % 2 == 0) {
                res += (frq / 2) * i;
                flag = false;
            } else {
                res += frq / 2 * i + i;
                flag = true;
            }
        }

        return res;
    }
}

//TC: O(n) + O(range), SC: O(n)