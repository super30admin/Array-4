#Time Complexity: O(n)
#Space Complexity: O(1)
class Solution:
    def maxSubArray(self, nums: List[int]) -> int:
        maxm = nums[0]
        rsum = nums[0]

        for i in range(1,len(nums)):

            rsum = max(rsum+nums[i],nums[i])
            maxm = max(maxm,rsum)

        return maxm