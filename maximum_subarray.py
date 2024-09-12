# Time Complexity: O(n)
# Space Complexity: O(1)
class Solution:
    def maxSubArray(self, nums):
        n = len(nums)
        #         defining current sum and max val and while iterating in array
        #         we will take max between current sum + current element and just the current number
        #         and the max value will be max between max and current sum
        curr_sum = nums[0]
        max_val = nums[0]
        for i in range(1, n):
            curr_sum = max(curr_sum + nums[i], nums[i])
            max_val = max(max_val, curr_sum)

        return max_val
