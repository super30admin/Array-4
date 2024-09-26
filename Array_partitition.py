# Time Complexity : O(n*log(n))
# Space Complexity : O(1)
# Did this code successfully run on Leetcode : Yes
# Any problem you faced while coding this : No
#
#

class Solution:
    def arrayPairSum(self, nums) -> int:
        nums.sort()
        result = 0
        for i in range(0, len(nums), 2):
            result += nums[i]
        return result


print(Solution().arrayPairSum([1, 4, 3, 2]))
