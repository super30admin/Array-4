#Time Complexity: O(N)

#Space Complexity: O(1) 

class Solution:
    def maxSubArray(self, nums: List[int]) -> int:
        if len(nums)==0 :
            return 0
        n = len(nums)
        rsum = nums[0]
        maxi = nums[0]
        for i in range(1,n):
            rsum += nums[i]
            if nums[i] > rsum:
                rsum = nums[i]
            maxi = max(rsum,maxi)
        return maxi
        