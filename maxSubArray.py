"""
Track the current subarray sum, reset to 0 if it becomes negative
At each step, decide: extend current subarray or start new
Keep track of the maximum sum seen so far
"""
"""	
Time Complexity : O(n) - One pass through the array
Space Complexity : O(1) - No auxillary space used
"""


class Solution:
    def maxSubArray(self, nums: list[int]) -> int:
        max_sum = curr_sum = nums[0]
        for num in nums[1:]:
            curr_sum = max(num, curr_sum + num)
            max_sum = max(max_sum, curr_sum)
        return max_sum
    
if __name__ == "__main__":
    sol = Solution()
    print(sol.maxSubArray([-2,1,-3,4,-1,2,1,-5,4]))
