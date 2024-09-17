class Solution(object):
    
    """
        
        Name : Shahreen Shahjahan Psyche
        Space : O(1)
        Time : O(N)
        
        Passed All Test Cases : Yes
    
    """
    def maxSubArray(self, nums):
        """
        :type nums: List[int]
        :rtype: int
        """
        if not nums:
            return float('-inf')
        
        
        global_sum = nums[0]
        local_sum = nums[0]
        start = 0
        end = 0
        
        for i in range(1, len(nums)):
            local_sum = local_sum + nums[i]
            if local_sum < nums[i]:
                local_sum = nums[i]
                start = i
            if local_sum > global_sum:
                global_sum = local_sum  
                end = i
        
        print(start, end)
        return global_sum
