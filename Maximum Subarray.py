class Solution:
    def maxSubArray(self, nums: List[int]) -> int:
        if nums==None or len(nums)==0:
            return 
        maxx=nums[0]
        curr=nums[0]
        for i in range(1,len(nums)):
            maxx=max(nums[i],maxx+nums[i])
            curr=max(curr,maxx)
            
        return curr  
