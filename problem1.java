/**
    Time Complexity : O(N + R)
    Explanation:
    - O(N) to build frequency map and find min/max
    - O(R) to iterate from min to max (R = max - min + 1)
    Total: O(N + R)

    Space Complexity : O(N)
    Explanation:
    HashMap can store up to N distinct values in worst case.

    Did this code successfully run on LeetCode : Yes

    Any problem you faced while coding this :
    Initially used Arrays.sort(nums) which is O(N log N).
    Then tried optimizing using frequency counting idea.
    Also had confusion about pairing logic, fixed it using a flag:
    - flag=false means take this number into sum (it will be the min of the pair)
    - flag=true means skip (it becomes the max of the pair)
    */

class Solution {

    
    public int arrayPairSum(int[] nums) {

        int n = nums.length;

        HashMap<Integer, Integer> fmap = new HashMap<>();
        int min = nums[0];
        int max = nums[0];

        // Build frequency map + find range
        for (int i = 0; i < n; i++) {
            min = Math.min(min, nums[i]);
            max = Math.max(max, nums[i]);
            fmap.put(nums[i], fmap.getOrDefault(nums[i], 0) + 1);
        }

        int sum = 0;
        boolean flag = false;

        // Walk from min to max, simulate sorted order using counts
        for (int i = min; i <= max; i++) {
            if (!fmap.containsKey(i)) continue;

            int cnt = fmap.get(i);
            while (cnt > 0) {
                if (!flag) {
                    sum += i;     // take as the smaller element of the pair
                    flag = true;
                } else {
                    flag = false; // skip as the larger element of the pair
                }
                cnt--;
            }
        }

        return sum;
    }
}