// 561.
// time - O(n lgn) with constant space
class Solution {
    public int arrayPairSum(int[] nums) {
        //[1,4,3,2] -> sort in ascending order -> [1,2,3,4] -> answer = 1 + 3 = 4
        //approach - sort in ascending order and group pairs to get largest min element sum
        //sorting works as we always group elements with smallest difference as possible
        Arrays.sort(nums);
        int result = 0;
        for(int i = 0; i < nums.length - 1; i = i + 2)
        {
            result += nums[i];
        }
        return result;
    }
}
