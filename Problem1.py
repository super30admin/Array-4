#Time complexity: O(nlogn)
#Space complexity: O(1)
#Works on leetcdoe - yes
#Approach: Here we just sort the array and take sum of alternate elements starting from the second one. 

class Solution(object):
    def arrayPairSum(self, nums):
        """
        :type nums: List[int]
        :rtype: int
        """
        return sum(sorted(nums)[::2])