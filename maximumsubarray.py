# Time Complexity : O(N) where N is length of  array
# Space Complexity : O(1) as we are using constant space
# Did this code successfully run on Leetcode : Yes
# Any problem you faced while coding this : No

# Your code here along with comments explaining your approach:
# I am taking two variables maxi to keep track of the maximum sum and sumy to keep track of the current subarray sum.
# I am iterating through the nums array and adding each element to sumy.
# If at any point sumy becomes greater than maxi, I update maxi.
# If sumy becomes negative, I reset it to 0 as any negative sum will not contribute to a maximum subarray.
# Finally, I return maxi which contains the maximum subarray sum

from typing import List
class Solution:
    def maxSubArray(self, nums: List[int]) -> int:
        maxi = float('-inf')
        sumy = 0
        for i in range(len(nums)):
            sumy += nums[i]
            if sumy > maxi:
                maxi = sumy
            if sumy < 0:
                sumy = 0
        return maxi
