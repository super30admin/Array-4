// time complexity - O(n)
// space complexity - O(1)
public class Solution
{
    public int MaxSubArray(int[] nums)
    {
        int n = nums.Length;
        int CurrSum = 0;
        int maxSum = Int32.MinValue;
        int currStart = 0;
        int maxStart = 0;
        int maxEnd = 0;
        for (int i = 0; i < n; i++)
        {
            CurrSum = Math.Max(CurrSum + nums[i], nums[i]);
            if (CurrSum == nums[i])
            {
                currStart = i;
            }
            if (maxSum < CurrSum)
            {
                maxSum = CurrSum;
                maxStart = currStart;
                maxEnd = i;
            }
        }
        //Console.WriteLine("start " + maxStart + "end "+ maxEnd);
        return maxSum;
    }
}