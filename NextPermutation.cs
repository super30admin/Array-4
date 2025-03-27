// time complexity- O(n)
// space complexity - O(1)
public class Solution
{
    public void NextPermutation(int[] nums)
    {
        if (nums == null || nums.Length == 0)
        {
            return;
        }
        // get the action digit
        int n = nums.Length;
        int i = n - 2;
        while (i >= 0 && nums[i + 1] <= nums[i])
        {
            i--;
        }
        if (i >= 0)
        {
            // find replacement
            for (int j = n - 1; j > i; j--)
            {
                if (nums[j] > nums[i])
                {
                    swap(nums, i, j);
                    break;
                }
            }
        }
        // reverse
        reverse(nums, i + 1, n - 1);
    }
    public void reverse(int[] nums, int i, int j)
    {
        while (i < j)
        {
            swap(nums, i, j);
            i++;
            j--;
        }
    }
    public void swap(int[] nums, int i, int j)
    {
        int tmp = nums[i];
        nums[i] = nums[j];
        nums[j] = tmp;
    }
}