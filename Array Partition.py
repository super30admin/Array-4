# Time complexity: O(n log n)
# Space complexity: O(1)
# Sort the elements and add the elements at even indices to the sum and return sum.


class Solution:
    def arrayPairSum(self, nums: List[int]) -> int:
        nums = sorted(nums)
        sum = 0
        for i in range(0,len(nums)-1,2):
            sum = sum + nums[i]
        return sum
            
        