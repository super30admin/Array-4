class Solution:
    def maxSubArray(self, nums: List[int]) -> int:
        if len(nums)==0:
            return 0
        if len(nums)==1:
            return nums[0]
        #maxsum, running sum approach
        maxsum=runningsum=nums[0]
        
        for i in range(1,len(nums)):
            runningsum=max(nums[i],runningsum+nums[i])
            maxsum=max(maxsum,runningsum)
        return maxsum
        #Time O(n)
        #Space O(1)
        
        #DP
        # dp=[float("-inf")]*len(nums)
        # if len(nums)==1:
        #     return nums[0]
        # for i in range(len(nums)):
        #     if i-1>=0:
        #         dp[i]=max(nums[i],dp[i-1]+nums[i])
        #     else:
        #         dp[i]=nums[i]
        # return max(dp) if max(dp)!=float("-inf") else 0
        # #Time O(n)
        # #space O(n)
