#TC:O(N) SC:O(1)

class Solution:
    def maxSubArray(self, nums: List[int]) -> int:
        if nums==None or len(nums)==0:
            return 0
            
        rsum=nums[0]
        max_sum=nums[0]

        for i in nums[1:]:
            rsum=max(rsum+i,i)
            max_sum=max(max_sum,rsum)
        
        return max_sum
