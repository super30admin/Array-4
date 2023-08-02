#Time complexity is O(nlogn)
#Spcae complexity is O(n)
#No issues faced while coding
#Code ran successfully on leetcode
class Solution(object):
    def arrayPairSum(self, nums):
        """
        :type nums: List[int]
        :rtype: int
        """
        #Sorting the nums array
        nums.sort()
        #Taking the result variable and initializing that to 0
        result=0
        #Iterating through the array and finding the result sum
        for i in range(0,len(nums),2):
            #Adding the numberf that have even indexes to the result
            result+=nums[i]
        #Returning the result
        return result