# Time Complexity : O(nlogn)[n = length of nums list]
# Space Complexity : O(1)
# Did this code successfully run on Leetcode : Yes
# Any problem you faced while coding this : No

# Problem Approach
# The intution is to minimize the gap between pairs. 
# To achive this the input is sorted
class Solution:
    def arrayPairSum(self, nums: List[int]) -> int:
        nums.sort()
        s = 0
        for i in range(0, len(nums)-1, 2):
            s+=min(nums[i],nums[i+1])
        return s