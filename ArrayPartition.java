//TC: O(nlogn)
//SC: O(1)
//approach: sorting array, and then taking all even indexed values(making pair of 0, 1 indexed and so on)

import java.util.Arrays;

public class ArrayPartition {
    public int arrayPairSum(int[] nums) {
        Arrays.sort(nums);
        int ans = 0;
        for (int i = 0; i < nums.length; i++) {
            if (i % 2 == 0) {
                ans += nums[i];
            }
        }
        return ans;
    }

}
