# The arrayPairSum method calculates the maximum sum of min-pairs from the array.

# Sort the array to maximize the sum of the smaller elements in each pair.
# Iterate through every other element, adding it to the result.

# TC: O(n log n) - Sorting the array.
# SC: O(1) - Constant space (excluding input storage).


from typing import List


class Solution:
    def arrayPairSum(self, nums: List[int]) -> int:
        self.nums = sorted(nums)
        self.res = 0
        for i in range(0 , len(self.nums) , 2):
            self.res += self.nums[i]
        return self.res