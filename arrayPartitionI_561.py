# Time Complexity : O(nlogn)
# Space Complexity : O(1)
# Did this code successfully run on Leetcode : Yes
# Any problem you faced while coding this : No

#Approach and Intuition:
#Brute Force with backtracking: we need to find all possible pairings and see what maximizes the sum
# Optimal: Let's sort the array. Why?
# If we pair up the sorted numbers, we are always utilising the higher number to add them up in our total running sum. We need to make sure our minimum always keep increasing. If we don't we'll be wasting the max minimums somewhere.

class Solution:
    def arrayPairSum(self, nums: List[int]) -> int:
        if nums == None or len(nums)==0:
            return 0
            
        nums.sort()
        
        curr_sum= 0
        
        for x in range(0, len(nums)-1, 2):
            curr_sum += nums[x]
            
        return curr_sum