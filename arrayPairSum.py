# Approach: We sort the array and take min on each pair of numbers. This is a way to improve our odds of maximize the result.
# If we don't sort that may cause us to get less than max sum.
# TC: O(nlogn)
# SC: O(1)
class Solution:
    def arrayPairSum(self, nums: List[int]) -> int:
        nums.sort()
        ssum = 0
        for i in range(0,len(nums),2):
            ssum += nums[i]
        return ssum