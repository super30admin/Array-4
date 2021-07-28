class Solution(object):
    def arrayPairSum(self, nums):
        """
        :type nums: List[int]
        :rtype: int
        """
        #time complexity: O(nlogn)
        # space complexity: O(n)
        #sort the elements and taking the minimum of each pair and adding it
        nums.sort()
        maxSum = 0
        for i in xrange(0,len(nums),2):
            maxSum += nums[i]
        return maxSum
