#As taught in class, I sorted the array and increased pointer by 2 adding elements to the sum
#Time Complexity: O(n)
#Space Complexity: O(1)
class Solution:
    def arrayPairSum(self, nums: List[int]) -> int:
        nums = sorted(nums)
        sum = 0
        count= 0
        for i in range(len(nums)):
            if count< len(nums):
                sum += nums[count]
                count = count + 2
        return sum