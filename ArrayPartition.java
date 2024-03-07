// https://leetcode.com/problems/array-partition/

// Sorting
// Time complexity: O(nlogn)
// Space complexity: O(1)

// Bucket sort using Hashmap
// Time Complexity: O(n)
// Space Complexity: O(n)

class Solution {
    public int arrayPairSum(int[] nums) {
        // Arrays.sort(nums);
        int result = 0;
        // for(int i = 0; i < nums.length; i=i+2) {
        //     result += nums[i];
        // }

        HashMap<Integer, Integer> map = new HashMap<>();
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        boolean flag = false;
        for(int num: nums) {
            map.put(num, map.getOrDefault(num, 0) + 1);
            max = Math.max(max, num);
            min = Math.min(min, num);
        }

        for( int i = min; i <= max; i++) {
            if(map.containsKey(i)) {
                if(flag) {
                    map.put(i, map.get(i) - 1);
                }
                int cnt = map.get(i);
                int pairs = cnt/2;
                result += pairs * i;

                if(cnt%2 != 0) {
                    result += i;
                    flag = true;
                } else {
                    flag = false;
                }
            }
        }

        return result;
    }
}


