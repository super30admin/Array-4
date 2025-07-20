#Time Compelexity: O(n log n)
#Space Complexity: O(n)
class Solution(object):
    def arrayPairSum(self, nums):
        """
        :type nums: List[int]
        :rtype: int
        """
        arr = sorted(nums)
        j = 0
        result_sum = 0 
        while j < len(nums):
            result_sum += min(arr[j],arr[j + 1])
            j = j + 2
        return result_sum


        