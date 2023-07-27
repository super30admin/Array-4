# Time and space complexity = O(nlogn) and O(1)
class Solution:
    def arrayPairSum(self, nums: List[int]) -> int:
        nums.sort()
        sum = 0
        for i in range(0,len(nums),2):
            sum = sum + nums[i]
        return sum
