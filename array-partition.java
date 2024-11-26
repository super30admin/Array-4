//Time complexity: O(N logN)
//Space complexity: O(1)
class Solution {
    public int arrayPairSum(int[] nums) {
        Arrays.sort(nums);
        int sum = 0;
        int i = 0;
        while(i < nums.length) {
            sum = sum + nums[i];
            i = i + 2;
        }
        return sum;
    }
}   