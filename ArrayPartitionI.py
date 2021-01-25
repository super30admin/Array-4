"""
Apporach: Using sorting

In order to understand this approach, let us look at the problem from a different perspective. We need to form the pairings of the array's elements such that the overall sum of the minimum out of such pairings is maximum. Thus, we can look at the operation of choosing the minimum out of the pairing, say (a, b) as incurring a loss of a - b(if a> ba), in the maximum sum possible.

The total sum will now be maximum if the overall loss incurred from such pairings is minimized. This minimization of loss in every pairing is possible only if the numbers chosen for the pairings lie closer to each other than to the other elements of the array.

Taking this into consideration, we can sort the elements of the given array and form the pairings of the elements directly in the sorted order. This will lead to the pairings of elements with minimum difference between them leading to the maximization of the required sum.

TC: O(nlogn)
SC: O(1) or O(n) if we count complexity of the implemenatation of sorting function in python
"""

class Solution:
    def arrayPairSum(self, nums: List[int]) -> int:
        if nums == None or len(nums) == 0:
            return 0
        
        nums.sort()
        result = 0
        
        for i in range(0, len(nums), 2):
            result += nums[i]
            
        return result
        
        