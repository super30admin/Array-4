// TC => O(nlogn)
// SC => O(1)
public class Solution
{
    public int ArrayPairSum(int[] nums)
    {
        if (nums == null || nums.Length == 0)
        {
            return 0;
        }
        Array.Sort(nums);
        int total = 0;
        for (int i = 0; i < nums.Length; i = i + 2)
        {
            total += nums[i];
        }

        return total;
    }
}