# Problem2 Maximum Subarray (https://leetcode.com/problems/maximum-subarray/)
# // Time Complexity :O(2n =O(n)
# // Space Complexity :O(1)
# // Did this code successfully run on Leetcode :Yes
# // Any problem you faced while coding this :No
class Solution:
    def maxSubArray(self, nums):
        if not nums:
            return 0
        n = len(nums)
        curr_sum = max_sum = nums[0]
        curr_start = 0
        start = 0
        end = 0
        i = 0
        while i < n - 1:
            curr_sum = curr_sum + nums[i]
            if curr_sum < nums[i]:
                curr_start = i
                curr_sum = nums[i]
            if max_sum < curr_sum:
                start = curr_start
                end = i
                max_sum = curr_sum
            max_sum = max(curr_sum, max_sum)
            i += 1
        print(start, end)
        return max_sum


sol = Solution()
print(sol.maxSubArray([-2, 1, -3, 4, -1, 2, 1, -5, 4]))


# class Solution:
#     def maxSubArray(self, nums):
#         if not nums:
#             return 0
#         n = len(nums)
#         curr_sum = max_sum = nums[0]
#         i = 0
#         while i < n - 1:
#             curr_sum = max((curr_sum + nums[i]), nums[i])
#             max_sum = max(curr_sum, max_sum)
#             i += 1
#         return max_sum


# sol = Solution()
# print(sol.maxSubArray([-2, 1, -3, 4, -1, 2, 1, -5, 4]))
