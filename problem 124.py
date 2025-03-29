#  https://leetcode.com/problems/maximum-subarray/


class Solution:
    def maxSubArray(self, nums: List[int]) -> int:
        n = len(nums)
        global_max = nums[0]
        curr_max = nums[0]

        for i in range(1,n):
            curr_max = max(curr_max+nums[i], nums[i])
            global_max = max(global_max,curr_max)
        
        return global_max

# TC: O(n)
# SC: O(1)

# follow up for this question can be asking for the start and end indices of the subarray

class Solution:
    def maxSubArray(self, nums: List[int]) -> int:
        n = len(nums)
        global_max = nums[0]
        curr_max = nums[0]
        curr_start = 0 
        curr_end = 0

        start = 0 
        end = 0
        for i in range(1,n):
            curr_max = max(curr_max+nums[i], nums[i])
            if nums[i] == curr_max: # if the curr_max is updated which means that we are considering 
                # a new subarray, we update the start and end indices  of the current subarray
                curr_start = i
                curr_end = i
            else: # otherwise, we just update end indices only.
                curr_end = i
            
            global_max = max(global_max,curr_max)
            if curr_max == global_max: # similarly if the global is updates means we are considering the new
                # subarray and we will update the start and end indices of the new subarray
                start = curr_start
                end = curr_end

        print(start)
        print(end)
        
        return global_max

# TC: O(n)
# SC: O(1)

################################ little optimization with the end for this #################################

class Solution:
    def maxSubArray(self, nums: List[int]) -> int:
        n = len(nums)
        global_max = nums[0]
        curr_max = nums[0]
        curr_start = 0 
        start = 0 
        end = 0
        for i in range(1,n):
            curr_max = max(curr_max+nums[i], nums[i])
            if nums[i] == curr_max:
                curr_start = i
            
            global_max = max(global_max,curr_max)
            if curr_max == global_max:
                start = curr_start
                end = i

        print(start)
        print(end)
        
        return global_max

# TC: O(n)
# SC: O(1)