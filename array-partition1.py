#Time complexity: O(nlogn)
#space complexity: O(1)
class Solution:
    def arrayPairSum(self, nums: List[int]) -> int:
        nums.sort()
        i,sum1=0,0
        while i<len(nums):
            sum1+=nums[i]
            i+=2
        return sum1