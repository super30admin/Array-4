# 53. Maximum Subarray
# https://leetcode.com/problems/maximum-subarray/

# Logic: We calculate a running sum and a max sum. 
# If the current sum goes more than max sum, we set 
# max sum to the current sum. If the current sum 
# becomes negative, we set current sum to zero.

# Time Complexity: O(n)
# Space Complexity: O(1)

class Solution:
    def maxSubArray(self, nums) -> int:
        max_sum = nums[0]
        cur_sum = 0

        for i in nums:
            cur_sum += i
            max_sum = max(max_sum, cur_sum)
            
            if cur_sum < 0:
                cur_sum = 0
        return max_sum