# Time complexity : O(n)
# Space complexity : O(1)
# Leetcode : Solved and submitted

class Solution:
    def maxSubArray(self, nums: List[int]) -> int:
        n = len(nums)
        if not nums or len(nums) == 0:
            return 0
        
        # take the maximum and curr sum as nums[0] which is the first element
        max_arr = nums[0]
        curr_sum = nums[0]
        currStart = currEnd = start = end = 0
        
        # traversing from the first element of the array
        for i in range(1,n):
          
            # add the current num to the current sum
            curr_sum = curr_sum + nums[i]
            # check which one is greater
            if curr_sum < nums[i]:
                # if the current number is greater than the sum til now, update the starting index to i which is the current index
                # and also the sum to the current number
                currStart = i
                curr_sum = nums[i]
            
            
            # find the max by checking with the previous max and the curr sum
            if max_arr < curr_sum:
              # if we have a new max, then update the starting index as the index of curr sum and end as the current index
              # as we found the max till now
                max_arr = curr_sum
                start = currStart
                end = i
            
        #print(start, end)
        return max_arr
