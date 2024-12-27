# Explain your approach briefly at the top:
# To maximize the sum of min(ai, bi), sort the array.
# Pair consecutive elements (nums[0], nums[1]), (nums[2], nums[3]), etc., and take the smaller value of each pair.
# Summing these values ensures the total sum is maximized because sorting minimizes the difference between paired elements.

# Time Complexity: O(n log n), where n is the length of nums, due to sorting.
# Space Complexity: O(1), as sorting is in-place.
# Did this code successfully run on Leetcode: Yes
# Any problem you faced while coding this: No


class Solution:
    def arrayPairSum(self, nums: List[int]) -> int:
        # Step 1: Sort the array
        nums.sort()
        
        # Step 2: Initialize the result to accumulate the sum of minimums
        result = 0
        
        # Step 3: Iterate through the sorted array, taking every alternate element starting from index 0
        for i in range(0, len(nums), 2):
            result += nums[i]  # Add the minimum value of each pair
        
        return result
