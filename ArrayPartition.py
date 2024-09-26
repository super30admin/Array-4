# Time Complexity : O(n*log(n))
# Space Complexity : O(1)

class Solution:
    def arrayPairSum(self, nums) -> int:
        nums.sort()
        result = 0
        for i in range(0, len(nums), 2):
            result += nums[i]
        return result

