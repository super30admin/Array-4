"""
Time complexity O(N)
Space complexity O(1)

-Compare the current index num[i] and rsum+num[i] and see which is maximum and start the subarray from that 
-Compare max between prev max and rsum

"""

class Solution:
    def maxSubArray(self, nums: List[int]) -> int:
        if not nums:
            return 0
        rsum=nums[0]
        max1=nums[0]
        for i in range(1,len(nums)):
            rsum=max(nums[i],nums[i]+rsum)
            max1=max(max1,rsum)
        
        return max1