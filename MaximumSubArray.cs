using System;
using System.Collections.Generic;
using System.Text;

namespace ArrayDS
{
    internal class MaximumSubArray
    {
        //TC: O(n)
        //SC: O(1)
        public int MaxSubArray(int[] nums)
        {
            if (nums == null || nums.Length == 0) return 0;
            int rSum = nums[0];
            int max = nums[0];
            for (int i = 1; i < nums.Length; i++)
            {
                rSum = Math.Max(rSum + nums[i], nums[i]);
                max = Math.Max(max, rSum);
            }
            return max;
        }
    }
}
