class Solution:
    def arrayPairSum(self, nums: List[int]) -> int:
        nums.sort()
        result = 0

        for i in range(0, len(nums), 2):
            result += nums[i]

        return result

# Arrays
# Time Complexity: O(nlogn)
# Space Complexity: O(1)
# Did this code successfully run on Leetcode : yes
# Any problem you faced while coding this : No
