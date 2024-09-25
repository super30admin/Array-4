#Time complexity - O(n)
#Space complexity - O(n)

class Solution:
    def maxSubArray(self, nums: List[int]) -> int:
        
        n = len(nums)
        rsum = nums[0]
        max_sum = nums[0]
        curr_st = 0
        for i in range(1,n):
            if nums[i]+rsum < nums[i]: 
                rsum = nums[i]
                curr_st = i
            else:
                rsum = nums[i]+rsum
                
            if rsum >  max_sum:
                max_sum = rsum
                start = curr_st
                end = i
        return max_sum


