// Time Complexity : O(nlogn)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : yes
// Any problem you faced while coding this : no

import java.util.*;

class Main {
    // approch 1 sort the array and add every second element
    public static int arrayPairSum(int[] nums) {
        // null case
        if (nums == null || nums.length == 0)
            return 0;
        // sort the array
        Arrays.sort(nums);
        int n = nums.length;
        // result
        int result = 0;
        for (int i = 0; i < n; i += 2) {
            result += nums[i];
        }
        return result;
    }
}