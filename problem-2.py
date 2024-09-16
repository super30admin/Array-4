class Solution:
    def maxSubArray(self, nums: List[int]) -> int:
        if not nums or len(nums)==0:
            return 0
        
        maximum=float('-inf')
        curr_sum=0
        for i in range(len(nums)):
            curr_sum=max(curr_sum+nums[i], nums[i])
            if curr_sum>maximum:
                maximum=curr_sum
                curr_sum=max(curr_sum,nums[i])
                
        return maximum
                
        