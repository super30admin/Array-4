#Time complexity is: O(n)
#Space complexity is O(n)
#No issues faced while coding
#Code ran successfully on leetcode
class Solution(object):
    def maxSubArray(self, nums):
        """
        :type nums: List[int]
        :rtype: int
        """
        #Base condition
        if(nums==None or len(nums)==0):
            return 0
        #Initializing the requreid variables
        n=len(nums)
        curr=0
        maxi=-1*float('inf')
        #We will be iterating through the entire array
        for i in range(0,n):
            #Calcualting the current sum
            curr=max(nums[i],curr+nums[i])
            #Finding the value of the maximum sub array
            if(curr>maxi):
                maxi=curr
        #Finally returning the maximum sum of the sub array
        return maxi