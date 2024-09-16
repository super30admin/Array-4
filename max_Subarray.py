class Solution:
    def maxSubArray(self, nums: List[int]) -> int:
        """Rolling sum approach
        Time complexity-O(n)
        Space complexity-O(1)"""
        rsum=nums[0]
        maxi=nums[0]
        startindex=0
        lastindex=0
        for i in range(1, len(nums)):
            # rsum=max(rsum+nums[i], nums[i])
            # maxi=max(maxi, rsum)
#             find start and last index of max subarray
            rsum=rsum+nums[i]
            if rsum<= nums[i]:
                rsum=nums[i]
                startindex=i
            if rsum>maxi:
                maxi=rsum
                lastindex=i
                
                
#                 lastindex=i
#                 maxi=max(maxi, rsum)
                
#             else:
#                 rsum=nums[i]
#                 startindex=i
#                 lastindex=i
#                 maxi=max(maxi, rsum)
        return maxi
        
   
        