#Time Complexity : O(nlogn)
#Space Complexity : O(1)
#Did this code successfully run on Leetcode : Yes

class Solution:
    def arrayPairSum(self, nums: List[int]) -> int:
        nums.sort()
        l, r = 0, len(nums)-1
        maxSum = 0
        for i in range(0, len(nums), 2):
            maxSum += nums[i]

        return maxSum
