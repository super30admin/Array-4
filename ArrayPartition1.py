# Time Complexity : O(Nlogn)
# Space Complexity : O(1)
# Did this code successfully run on Leetcode : Yes
# Any problem you faced while coding this : No

# Your code here along with comments explaining your approach
# Sort the array then iterate over the array and add the alternate elements to the sum
# Return sum


class Solution:
    def arrayPairSum(self, nums: List[int]) -> int:
        if not nums:
            return None

        nums.sort()
        sum = 0
        for i in range(0, len(nums), 2):
            sum += nums[i]

        return sum