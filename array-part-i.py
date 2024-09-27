# // Time Complexity : O(nlogn) 
# // Space Complexity : O(1)
# // Did this code successfully run on Leetcode : Yes
# // Any problem you faced while coding this : No


# // Your code here along with comments explaining your approach
# sort and add every second int

class Solution:
    def arrayPairSum(self, nums: List[int]) -> int:
        nums.sort()
        i = 0
        res = 0
        while i<len(nums):
            res += nums[i]
            i+=2
        
        return res
        