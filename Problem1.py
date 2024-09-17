"""
561. Array Partition I
Time Complexity - O(nlogn)
Space Complexity - O(n)...sortinginternal extra space
Here first we sort the array and then we take sum of alternate elements and return the sum 
"""
class Solution:
    def arrayPairSum(self, nums: List[int]) -> int:
        if nums == None or len(nums) == 0:
            return 0
        nums.sort()
        sum = 0
        for i in range(0,len(nums),2):
            sum += nums[i]
        return sum
        