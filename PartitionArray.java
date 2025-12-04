// 561. Array Partition
// https://leetcode.com/problems/array-partition/description/


/**
 * Time Complexity: O(nlogn)
 * Space Complexity: O(1)
 */

class Solution {
    public int arrayPairSum(int[] nums) {
        int result = 0;

        Arrays.sort(nums);

        for(int i = 0 ; i < nums.length ; i+= 2){
            result += nums[i];
        }

        return result;
    }
}

/**
 * Time Complexity: O(n) + O(m) where m is the range between min & max number
 * Space Complexity: O(n)
 */

class Solution {
    public int arrayPairSum(int[] nums) {
        Map<Integer, Integer> map = new HashMap<>();
        int min = nums[0];
        int max = nums[0];

        int result = 0;
        boolean flag = false;

        for (int i = 0; i < nums.length; i++) {
            min = Math.min(min, nums[i]);
            max = Math.max(max, nums[i]);

            map.put(nums[i], map.getOrDefault(nums[i], 0) + 1);
        }

        for (int i = min; i <= max; i++) {

            if (!map.containsKey(i)) {
                continue;
            }

            // since this 2 pair's with 1 which is already processed we remove this 2 from frequency
            if (flag) {
                map.put(i, map.get(i) - 1);
            }

            int fr = map.get(i);
            if (fr % 2 == 0) { // even freq
                result = result + fr / 2 * i;
                flag = false;
            } else { // odd freq
                result = result + fr / 2 * i;
                /**
                * 1 1 1 1 1 2 2
                * We take fr / 2 which gives us 2 one's (since pair), but we also want to take remaining 1 since it is min of next pair
                * hence we add that i to result, we do flag = true, because we want to skip next big number as it's min pair is already taken
                * then i++ happens, now our number is 2
                */
                result = result + i;
                flag = true;
            }
        }

        return result;
    }
}