'''
1. Maintain a running sum prefix. If adding any number is making the value go below zero, we remove that from the subarray by resetting the prefix to 0
2. At each addition of number we also check if that prefixSum is more than current maxSum by maintaing a var.

TC: O(n)
SC: O(1)
'''

class Solution:
    def maxSubArray(self, nums: List[int]) -> int:
        if len(nums) == 1:
            return nums[0]
        maxSub = nums[0]
        prefix = 0

        for num in nums:
            if prefix < 0:
                prefix = 0
            prefix += num
            maxSub = max(prefix, maxSub) 
        return maxSub

        
        