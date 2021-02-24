# Time Complexity: O(n)
# Space Complexity: O(1)
class Solution:
    def maxSubArray(self, nums: List[int]) -> int:
        if(nums == None or len(nums) == 0):
            return 0
        
        local_start = 0
        # local_end = 
        global_start = 0
        global_end = 0
        
        rsum = nums[0]
        max_val = nums[0]
        
        for i in range(1, len(nums)):
            # if the running sum changes then change local start ptr
            rsum = rsum + nums[i]
            if(rsum < nums[i]):
                rsum = nums[i]
                local_start = i

            # rsum = max(rsum + nums[i], nums[i])
            
            # if max value is changing then change global start and end to the current local window
            if(max_val < rsum):
                max_val = rsum
                global_start = local_start
                global_end = i
            # max_val = max(max_val, rsum)
        print(global_start, global_end)
            
        return max_val