# Time Complexity: O(nlogn), where n is length of the input array
# Space Complexity: O(1)
# Did this code successfully run on Leetcode: Yes

# Solution:

class Solution:
    def arrayPairSum(self, nums: List[int]) -> int:
        if not nums or len(nums) == 0:
            return 0

        result = 0

        # Sort the array
        nums.sort()

        # Add the odd alternate elements to get the minimum out of every consecutive pairs
        for i in range(0, len(nums), 2):
            result += nums[i]

        return result
