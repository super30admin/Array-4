#Time Complexity :o(n)
#Space Complexity :o(1)
#Did this code successfully run on Leetcode :yes
#Any problem you faced while coding this :no

class Solution(object):
    def maxSubArray(self, nums):
        """
        :type nums: List[int]
        :rtype: int
        """
        
        if(len(nums)==0 or nums==None):
            return 0
        
        gmax=nums[0]
        curSum=nums[0]

        strt=0
        end=0
        for i in range(1,len(nums)):
            if(curSum+nums[i]>nums[i]):
                curSum=curSum+nums[i]
            else:
                curSum=nums[i]
                strt=i
            if(gmax<curSum):
                end=i
                gmax=curSum
        print(strt,end)
        return gmax
