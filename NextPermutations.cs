using System;
using System.Collections.Generic;
using System.Text;

namespace ArrayDS
{
    internal class NextPermutationLC
    {

        //TC: O(n)
        //SC: O(1)
        public void NextPermutation(int[] nums)
        {
            if (nums == null || nums.Length == 0) return;
            int n = nums.Length;
            //Step 1: Locate the smaller number
            int temp = -1;
            for (int i = n - 2; i >= 0; i--)
            {
                if (nums[i] > nums[i + 1])
                {
                    temp = i;
                    break;
                }
            }

            //Step 2: Swap the number just larger than the number found in step 1
            if (temp != -1)
            {
                for (int i = n - 1; i >= 0; i--)
                {
                    if (nums[i] > nums[temp])
                    {
                        swap(nums, i, temp);
                        break;
                    }
                }
            }
            //Step3: reverse the portion from temp + 1 to n- 1
            reverse(nums, temp + 1, n - 1);
        }

        private void swap(int[] nums, int i, int j)
        {
            int temp = nums[i];
            nums[i] = nums[j];
            nums[j] = temp;
        }

        private void reverse(int[] nums, int l, int r)
        {
            while (l < r)
            {
                swap(nums, l, r);
                l++;
                r--;
            }
        }
    }
}
