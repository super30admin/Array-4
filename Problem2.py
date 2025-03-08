# In this approach, we use Kadane's algorithm to find the maximum subarray sum in linear time.
# The idea is to keep track of the maximum sum ending at each position and update the overall maximum sum.
# Time Complexity: O(n), where n is the length of the input array.
# Space Complexity: O(1), as we are using only a constant amount of extra space.


class Solution:
    def maxSubArray(self, nums: List[int]) -> int:
        max_subarray = curr_subarray = nums[0]
        for num in nums[1:]:
            curr_subarray = max(num, curr_subarray + num)
            max_subarray = max(max_subarray, curr_subarray)

        return max_subarray
