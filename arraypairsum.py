# Time Complexity: O(n)
# Space Complexity: O(1)
# Approach: Sort the numbers. The min in each pair will be in alternate positions. So take its sum and that will be the result
class Solution:
    def arrayPairSum(self, nums: List[int]) -> int:
        nums.sort()
        result = 0
        for i in range(0,len(nums),2):
            result += nums[i]
            
        return result