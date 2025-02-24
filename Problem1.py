'''
1. We see a pattern when we sort the array in ascending order so as to keep the minimum number maximized
2. The even indexed places are the minimum of the pairs formed
3. Return the sum

TC: O(nlogn) -> sort
SC: O(1)
'''

class Solution:
    def arrayPairSum(self, nums: List[int]) -> int:
        nums.sort()
        return sum([nums[i] for i in range(0,len(nums),2)])