class Solution(object):
    def arrayPairSum(self, nums):
        """
        :type nums: List[int]
        :rtype: int
        """
        #O(nlogn)
        #O(1)
        if not nums:
            return 0
        #you need to keep absolute difference bewtween pair elements to be minimum >>>to get maximum sum
        nums.sort()
        localsum=0
        for i in range(0,len(nums),2):
            localsum+=nums[i]
        return localsum