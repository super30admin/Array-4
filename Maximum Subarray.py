#time: O(n)
#space: O(1)

#DP approach
class Solution:
    def maxSubArray(self, nums: List[int]) -> int:
        
        maxv=nums[0]
        for i in range(1,len(nums)):
            nums[i]=max(nums[i]+nums[i-1],nums[i])
            maxv=max(maxv,nums[i])
        return maxv