//tc is O(nlogn)
//sc is O(1)

import java.util.*;

class Solution {
    public int arrayPairSum(int[] nums) {

        if (nums == null || nums.length == 0)
            return 0;

        int n = nums.length;
        int res = 0;

        Arrays.sort(nums);

        for (int i = 0; i < n; i = i + 2) {

            res = res + nums[i];
        }

        return res;

    }
}
