# Time Complexity : O(NlogN) for sorting
# Space Complexity : O(1)
# Did this code successfully run on Leetcode : Yes
# Any problem you faced while coding this : No
# Your code here along with comments explaining your approach

# sort the numbers at add all numbers at even positions 
# to get the maximum sum of the minimum element of all pairs
# sorting works as when sorted, the pairs have the first element(even index element)
# as the minimum of the pair
# if we sort and take pairs as idx (0, n-1), (1, n-2) and so on, 
# we get minimum sum



class Solution:

    def arrayPairSum(self, nums):

        if nums is None or len(nums) == 0:
            return 0
        
        result = 0
        nums.sort()
        for i in range(0, len(nums), 2):

            result += nums[i]
        
        return result