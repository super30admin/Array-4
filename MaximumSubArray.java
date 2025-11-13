public class MaximumSubArray {
//Time Complexity:O(n)
//Space Complexity:O(1)
//We start with the first element as the current and max subarray sum.
//As we move through the array, we either extend the current subarray or start fresh from the current element.
//We keep updating the max whenever the current subarray becomes larger than the max so far.
    public int maxSubArray(int[] nums)
    {
        int n = nums.length();
        int currSubArr = nums[0];
        int maxSubAr = nums[0];
        for(int i=1;i<n;i++)
        {
            currSubArr = Math.max(nums[i], currSubArr+nums[i]);
            maxSubAr = Math.max(maxSubAr, currSubArr);
        }
    }
}
