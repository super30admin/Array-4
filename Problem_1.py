from typing import List
class Solution:
    def arrayPairSum(self, nums: List[int]) -> int:
        if nums == None or len(nums) == 0:
            return 0
        nums.sort()
        result = 0
        for i in range(0, len(nums), 2):
            result += nums[i]
        return result

# Time Complexity: O(n * log(n))
# Space Complexity: O(1)