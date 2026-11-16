# PROBLEM 53. MAXIMUM SUBARRAY
# TIME COMPLEXITY: O(N) where N is the length of the array
# SPACE COMPLEXITY: O(1)


class Solution:
    def maxSubArray(self, nums: list[int]) -> int:
        result=float('-inf')
        checker=0

        for i in range(len(nums)):
            checker+=nums[i]
            result=max(result,checker)
            if checker<=0:
                checker=0
            
        return result