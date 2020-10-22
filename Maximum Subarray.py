class Solution:
    def maxSubArray(self, nums: List[int]) -> int:
        #Time: O(N)
        #Space: O(1)
        
        max_sum = curr_sum = nums[0]
        n = len(nums)
        
        for i in range(1,n):
            if nums[i]+curr_sum>=nums[i]:
                curr_sum+=nums[i]
            else:
                curr_sum=nums[i]
            max_sum=max(max_sum,curr_sum)
        return max_sum