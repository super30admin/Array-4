"""
Iterate over the array keeping a global and a local minima, at every point check if adding the current
element increases or decreases the local maxima, if it decreases then check if the current element is greater
than the local min + the current element if so update the local maxima to current element and at every step 
update the global maxima and update it if it's less than the new local maxima.
Leetcode - running
space complexity - O(1)
Time complexity - O(N)

"""
def maxSubArray(self, nums):
    local_min = global_min = nums[0]
    for i in range(1,len(nums)):
        local_min = max(nums[i],local_min+nums[i])
        global_min = max(global_min,local_min)
    return global_min
    