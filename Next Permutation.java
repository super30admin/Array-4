// Time Complexity : O(n)
// Space Complexity : O(1)

class Solution {
    public void nextPermutation(int[] nums) {
        
        int n = nums.length, i = n - 2;

        if(n == 1) return;

        while(i > 0 && nums[i] >= nums[i + 1]) i--;

        int j = n - 1;

        while(j > i && nums[j] <= nums[i]) --j;

        if(i == j) reverse(i, n - 1, nums);

        else
        {
            int temp = nums[i];
            nums[i] = nums[j];
            nums[j] = temp;

            reverse(i + 1, n - 1, nums);
        }
    }

    private void reverse(int start, int end, int[] nums)
    {
        int temp;

        while(start < end)
        {
            temp = nums[start];
            nums[start] = nums[end];
            nums[end] = temp;

            ++start;
            --end;
        }
    }
}