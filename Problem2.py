# class Solution:
#     def maxSubArray(self, nums: List[int]) -> int:
#         l, r = 0,0
#         max_sum = nums[0]
#         current_sum = 0

#         for n in nums:

#             if current_sum < 0:
#                 current_sum = 0
#             current_sum += n
#             max_sum = max(max_sum, current_sum)
#         return max_sum

# Brute Force takes O(n2)
# This approach does it in 1 pass: O(n)
# Calculate current_sum everytime and take the max of currentsum and current pointer
# Take another variable and take max of above value every time pointer increments
class Solution:
    def maxSubArray(self, nums: List[int]) -> int:
        curr_sum = nums[0]
        max_sum = nums[0]

        for i in range(1, len(nums)):
            curr_sum = max(nums[i], curr_sum + nums[i])
            max_sum = max(max_sum, curr_sum)

        return max_sum

# Follow up Question: If we need to return the maximum subarray: Then try to do it 3 pointers


