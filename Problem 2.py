# Time Complexity : O(n) where n is length of list
# Space Complexity :O(1)
# Did this code successfully run on Leetcode : Yes
# Any problem you faced while coding this : No

class Solution:
    def maxSubArray(self, nums: List[int]) -> int:
        if len(nums) == 0:
            return 0
        elif len(nums) == 1:
            return nums[0]

        # maintain a running./ local maximum and global max
        currmax = nums[0]
        globalmax = nums[0]

        # iterate over the list
        for i in range(1, len(nums)):
            # in currmax, we choose if we want to continue with the list by adding the numbers or want to start fresh with a new number based on the values
            currmax = max(currmax + nums[i], nums[i])
            # in globalmax, we maintain the maxium value found till now in the list while iterating it
            globalmax = max(globalmax, currmax)

        return globalmax