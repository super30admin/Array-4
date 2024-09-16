class Solution:
    def maxSubArray(self, nums: List[int]) -> int:
        maxsum=nums[0]
        sum1=nums[0]
        for i in range(1,len(nums)):
            if sum1<0:
                sum1=nums[i]
            else:
                sum1=sum1+nums[i]
            maxsum=max(sum1,maxsum)
        return maxsum
        
Time is O(n)
Space is O(1)
