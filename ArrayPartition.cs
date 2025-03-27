// time complexity - O(nlogn)
// space- O(1)
public class Solution
{
    public int ArrayPairSum(int[] nums)
    {
        if (nums == null || nums.Length == 0)
        {
            return 0;
        }
        int result = 0;
        Array.Sort(nums);
        for (int i = 0; i < nums.Length; i = i + 2)
        {
            result += nums[i];
        }
        return result;
    }
}