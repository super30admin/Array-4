from typing import List
# class Solution:
#     def maxSubArray(self, nums: List[int]) -> int:
#         rsum,maxsum = float('-inf'),float('-inf')
#         for i in range(len(nums)):
#             rsum = max(rsum+nums[i], nums[i])
#             maxsum = max(rsum, maxsum)
#         return maxsum

# class Solution:
#     def maxSubArray(self, nums: List[int]) -> int:
#         rsum,maxsum = nums[0],nums[0]
#         for i in range(1,len(nums)):
#             rsum = rsum+nums[i]
#             if rsum <nums[i]:
#                 rsum = nums[i]
#             maxsum = max(rsum, maxsum)
#         return maxsum


class Solution:
    def maxSubArray(self, nums: List[int]) -> int:
        rsum,maxsum = nums[0],nums[0]
        currstart = 0
        start = 0
        end = 0
        for i in range(1,len(nums)):
            rsum = rsum+nums[i]
            if rsum <nums[i]:
                rsum = nums[i]
                currstart = i
            if maxsum<rsum:
                maxsum = rsum
                start = currstart
                end = i
        print(start)
        print(end)
        return maxsum
        
        