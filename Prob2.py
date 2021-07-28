class Solution(object):
    def maxSubArray(self, nums):
        """
        :type nums: List[int]
        :rtype: int
        """
        #time :O(n)
        #space: O(1)
        maxSum, rSum = nums[0],nums[0]
        start,end = 0,0
        curStart = 0
        for i in xrange(1,len(nums)):
            # rSum = max(rSum+nums[i],nums[i])
            # maxSum = max(maxSum,rSum)
            rSum = rSum + nums[i]
            if  rSum < nums[i]:
                curStart = i
                rSum = nums[i]
            if rSum > maxSum:
                maxSum = rSum
                start = curStart
                end = i
                
        return maxSum
        #brute force
#         maxSum = max(nums)
#         sumOfAll = sum(nums)
#         for el in xrange(2,len(nums)):
#             i=0
#             while(i+el<len(nums)+1):
#                 tempSum = sum(nums[i:i+el])
#                 if tempSum>maxSum:
#                     maxSum = tempSum
#                 i+=1
        
#         if sumOfAll>maxSum:
#             maxSum = sumOfAll
        
#         return maxSum
