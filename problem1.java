// Time Complexity :O(n) but slower for sprase data
// Space Complexity : O(n)
// Did this code successfully run on Leetcode : yes
// Any problem you faced while coding this :no

class Solution {
    public int arrayPairSum(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<>();
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        for (int num : nums) {
            min = Math.min(min, num);
            max = Math.max(max, num);
            map.put(num, map.getOrDefault(num, 0) + 1);
        }
        boolean flag = true;
        int result = 0;
        for (int i = min; i <= max; i++) {
            if (!map.containsKey(i))
                continue;
            if (!flag) {
                map.put(i, map.get(i) - 1);
                flag = true;
            }
            int freq = map.get(i);
            if (freq % 2 == 0) {
                result += (freq / 2) * i;
                flag = true;
            } else {
                result += i;
                result += (freq / 2) * i;
                flag = false;
            }
        }
        return result;
    }
}