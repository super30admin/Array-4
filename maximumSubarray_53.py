# Time Complexity : O(n)
# Space Complexity : O(1)
# Did this code successfully run on Leetcode : Yes
# Any problem you faced while coding this : No

#Approach and Intuition (Kadane's Algo):
#Brute Force: Find all subarrays and sum total of them in O(n^2+n)
#Optimal: Keep a running sum(curr_sum) while iterating through the array and maintain a max_sum. 
# Eg: [-1,1,-3,4,-1,2,1,-5,4]
# At 0th index, our curr_sum = -2 and max_sum = -2
# At 1st index, we have two choice: our curr_sum can be either: 
# Previous sum plus current value ie, -2+1= -1 OR, 
# just the current value ie, 1
# In order to get the maximum Subarray sum, its most optimal to choose the max out of these two options ie. choosing 1 itself.
# we choose max and update our curr_sum to 1 and then we change our max_sum to max of max_sum and curr_sum
# return max_sum as our final answer!

class Solution:
    def maxSubArray(self, nums: List[int]) -> int:
        if nums == None or len(nums)==0:
            return 0
        
        curr_sum = 0
        max_sum = float('-inf')
        
        for x in nums:
            #max between subarray sum so far + value at current index and value at current index
            curr_sum = max(curr_sum +x, x)
            #max between maxSum and currSum
            max_sum = max(curr_sum, max_sum)
          
        return max_sum
        