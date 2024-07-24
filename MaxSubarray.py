# Time Complexity : O(n)
# Space Complexity : O(1)
class Solution:
    def maxSubArray(self, nums):
        if not nums or len(nums) == 0:
            return 0
        sum = 0
        max_sum = float('-inf')

        for num in nums:
            sum = max(num, sum + num) # If the sum becomes less than the current number, better to restart
                                      # the array sum from current number
            max_sum = max(sum, max_sum)

        return max_sum

# Examples

# Example 1
nums = [-2,1,-3,4,-1,2,1,-5,4]
solution = Solution()
print("Maximum Subarray Sum: {}".format(solution.maxSubArray(nums))) # Output: 6

# Example 2
nums = [1]
solution = Solution()
print("Maximum Subarray Sum: {}".format(solution.maxSubArray(nums))) # Output: 1

# Example 3
nums = [5,4,-1,7,8]
solution = Solution()
print("Maximum Subarray Sum: {}".format(solution.maxSubArray(nums))) # Output: 23