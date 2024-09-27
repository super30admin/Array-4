#O(n log n) solution, where n is the number of elements in nums
class Solution:
    def arrayPairSum(self, nums: List[int]) -> int:
        if nums == None or len(nums) == 0:
            return 0
        result = 0
        nums.sort()
        for i in range(0, len(nums), 2):
            result += nums[i]
        
        return result