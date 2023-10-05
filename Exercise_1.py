# Problem1 Array partition (https://leetcode.com/problems/array-partition/)
# // Time Complexity : O(nlogn)
# // Space Complexity :O(1)
# // Did this code successfully run on Leetcode :Yes
# // Any problem you faced while coding this :No
class Solution:
    def arrayPairSum(self, nums):
        # sorting the nums
        nums = sorted(nums)
        n = len(nums)
        # starting from back
        i = n - 1
        # variable for counting total to 0
        curr_sum = 0
        while i >= 0:
            curr_sum += min(nums[i], nums[i - 1])
            i -= 2
        return curr_sum


nums = [1, 4, 3, 2]
sol = Solution()
print(sol.arrayPairSum(nums))
