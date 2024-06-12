package Array-4;
// TC: O(n)
// SC: O(n)
public class Problem1 {
    public int arrayPairSum(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<>();
        int result = 0;
        int n = nums.length;
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;

        for (int i = 0; i < n; i++) {
            map.put(nums[i], map.getOrDefault(nums[i], 0) + 1);
            min = Math.min(min, nums[i]);
            max = Math.max(max, nums[i]);
        }

        boolean flag = false;
        for (int i = min; i <=max; i++) {
            if (map.containsKey(i)) {
                if (flag) {
                    map.put(i, map.get(i) - 1);
                }
                int cnt = map.get(i);
                int pairs = cnt / 2;
                result = result + pairs * i;
                if (cnt % 2 == 0) {
                    flag = false;
                } else {
                    result = result + i;
                    flag = true;
                }
            }
        }
        return result;
    }
}
