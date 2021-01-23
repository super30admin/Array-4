class Solution(object):
    def maxSubArray(self, nums):
        """
        :type nums: List[int]
        :rtype: int
        """
        #O(n)
        #O(n)
        # if not nums:
        #     return 0
        # DP = [0]*len(nums)
        # DP[0] = nums[0]
        # for i in range(1, len(nums)):
        #     DP[i] = max(DP[i-1]+nums[i], nums[i])
        # return max(DP)
        
        #O(n)
        #O(1)
        gmax=nums[0]
        rmax=nums[0]
        start=0
        end=0
        curstart=0
        #find subarray
        for i in range(1,len(nums)):
            if nums[i]+rmax<nums[i]:
                curstart=i
                rmax=nums[i]
            else:
                rmax=nums[i]+rmax
            if rmax>gmax:
                start=curstart
                gmax=rmax
                end=i
        #print(start,end)
        return gmax
        
        