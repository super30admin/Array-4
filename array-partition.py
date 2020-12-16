# Time Complexity: O(N lg N)
# Space Complexity: O(1)
class Solution(object):
    def arrayPairSum(self, nums):
        """
        :type nums: List[int]
        :rtype: int
        """
        # Sort Array
        nums.sort()
        sum = 0
        # Take sum of every alternate element
        for i in range(0,len(nums),2):
            sum += nums[i]
        
        return sum
            