// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : None


// Your code here along with comments explaining your approach
In this problem we have to find the maximum sum of the minimu of the pairs in the array.For this we have to sort the array first and then all the even index place digits.

# Time complexity --> o(nlogn)
# space complexity --> o(1)
class Solution(object):
    def arrayPairSum(self, nums):
        """
        :type nums: List[int]
        :rtype: int
        """
        if nums==None or len(nums)==0:
            return 0
        nums=sorted(nums)
        total=0
        for i in range(0,len(nums),2):
            total=total+nums[i]
        return total