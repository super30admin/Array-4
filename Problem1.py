## Problem1 Array partition I (https://leetcode.com/problems/array-partition-i/)

class Solution:
    def arrayPairSum(self, nums: List[int]) -> int:
        if nums==None or len(nums)==0:
            return 0
        sum = 0
        nums.sort()
        n = len(nums)
        for i in range(0,n,2):
            sum = sum+nums[i]
        return sum
    #Time Complexity: O(n)
    #Space Complexity: O(1) 
    #Approach: Sort the array, pick alternative elements since they will be the minimum among the chosen pairs, add it to the sum and return it. 
        