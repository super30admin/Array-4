#Time Complexity :o(nlogn) 
#Space Complexity :o(1)
#Did this code successfully run on Leetcode :yes
#Any problem you faced while coding this :no

class Solution(object):
    def arrayPairSum(self, nums):
        """
        :type nums: List[int]
        :rtype: int
        """
        if(nums==None or len(nums)==0):
            return 0
        
        nums.sort()
        val=0
        for i in range(0,len(nums),2):
            val+=nums[i]
            
        return val