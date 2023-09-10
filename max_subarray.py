#TC:O(n)
#SC:O(1)
class Solution:
    def maxSubArray(self, nums):
        if not nums:
            return 0  # Handle the case of an empty input array.

        max_sum = nums[0]  # Initialize the maximum sum with the first element.
        current_sum = nums[0]  # Initialize the current sum with the first element.

        for num in nums[1:]:
            # Start a new subarray if the current element is greater than the current sum.
            # Otherwise, extend the current subarray.
            current_sum = max(num, current_sum + num)
            
            # Update the maximum sum if the current sum is greater.
            max_sum = max(max_sum, current_sum)

        return max_sum