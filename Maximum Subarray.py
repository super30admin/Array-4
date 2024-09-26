class Solution:
    def maxSubArray(self, nums: List[int]) -> int:
        if nums==None and len(nums)==0:return 0
        rsum=nums[0]
        max1=nums[0]
        for i in range(1,len(nums)):
            rsum=max(rsum+nums[i],nums[i])
            max1=max(max1,rsum)
        return max1