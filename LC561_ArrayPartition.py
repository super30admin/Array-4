"""
We want to minimize the difference between the numbers in a pair so that the big ones dont do waste and so we  first sort the array 
and
we add traverse the array in steps of 2 and add the first number to the result
e.g. - [6,2,6,5,1,2]
SORT- [1,2,2,6,6]
RESULT = 1+2+6
TC = O(nlogn)
SC = O(1)
"""

class Solution:
    def arrayPairSum(self, nums: List[int]) -> int:
        if nums is None:
            return nums
        nums.sort()
        result = 0
        print(nums)    
        for i in range(0, len(nums)-1, 2):
            result = result+nums[i]
            
        return result