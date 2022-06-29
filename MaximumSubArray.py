#Time complexity: O(n)
#space complexity: O(1)
class Solution:
    def maxSubArray(self, nums: List[int]) -> int:
        Sum=0
        res=nums[0]
        for i in range(len(nums)):
            if Sum<0:
                Sum=0
            Sum+=nums[i]
            res=max(Sum,res)
        return res
        