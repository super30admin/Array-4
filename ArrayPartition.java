// this approach uses map TC : N

// TC : O(N + Range)
// range is min to max
// or TC can be Max(N, range)

// SC : O(N)
// Storing the elements of the array in the map
class Solution {
    public int arrayPairSum(int[] nums) {
        int n = nums.length;
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        int res = 0;
        boolean flag = false;
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i : nums) {
            map.put(i, map.getOrDefault(i, 0) + 1);
            min = Math.min(min, i);
            max = Math.max(max, i);
        }
        for (int i = min; i <= max; ++i) {
            if (!map.containsKey(i))
                continue;
            if (flag) {
                map.put(i, map.getOrDefault(i, 0) - 1);
                flag = false;
            }
            int currFreq = map.get(i);
            if (currFreq % 2 == 0) {
                res += (currFreq / 2) * i;
            } else {
                res += (currFreq / 2) * i;
                res += i;
                flag = true;
            }
        }
        return res;
    }
}
