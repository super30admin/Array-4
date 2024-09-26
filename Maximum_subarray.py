// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : None


// Your code here along with comments explaining your approach
In this problem we maintain running sum and global maximum at every index.The logic here is for every index we check if the element at that index or sum of elements till the previous index which is greater.Based on that we keep a track of the maximum at each and every point.


# Time complexity --> o(n)
# space complexity --> o(1)
class Solution(object):
    def maxSubArray(self, nums):
        """
        :type nums: List[int]
        :rtype: int
        """
        if nums==None or len(nums)==0:
            return 0
        curr_max=nums[0]
        maxi=nums[0]
        for i in range(1,len(nums)):
        #calculating the element at the index or the elements till the previous index which one is greater and maintaining a global max at each and every index.
            curr_max=max(nums[i],curr_max+nums[i])
            maxi=max(maxi,curr_max)
        return maxi