import java.util.Arrays;

//Time Complexity: O(nlogn) , for sorting 
//Space Complexity: O(1)

class Solution {
    public int arrayPairSum(int[] nums) {
        if (nums == null || nums.length == 0)
            return 0;

        int sum = 0;
        Arrays.sort(nums);
        for (int i = 0; i < nums.length; i = i + 2) {
            sum = sum + nums[i];
        }

        return sum;

    }
}
