class Solution:
    def maxSubArray(self, nums: List[int]) -> int:
    
        #DP
        maxSub = nums[0]
        rsum = nums[0]
        for i in nums[1:]:
            rsum = max(i, rsum + i)
            maxSub = max(maxSub, rsum)

        return maxSub
