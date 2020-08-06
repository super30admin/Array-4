# Time Complexity : Add - O(n)
# Space Complexity :O(1)
# Did this code successfully run on Leetcode : Yes
# Any problem you faced while coding this : No
'''
1. Use local sum which running sum and global sum. At each point we have two choice: either that element can add up with the running sum to form maximum sum or can be maximum on its own

2. So if an element > rSum, then rsum can be reset to that number, and it would be the local maximum at index k
3. If local max > global max, we update global max_ and record new global max start and position.
'''
import sys
class Solution:
    def maxSubArray(self, nums: List[int]) -> int:
        
        if nums == [] or len(nums) < 1:
            return -2147483648
        
        start, end = 0, 0
        k = 0
        rSum = 0
        max_= -sys.maxsize
        
        
        for i in range(len(nums)):
            
            rSum += nums[i]
            if nums[i] > rSum:
                k = i
                rSum = nums[i]
                
            if rSum > max_:
                max_ = rSum
                start = k
                end = i
        
        print(start, end, nums[start:end+1])
        return max_