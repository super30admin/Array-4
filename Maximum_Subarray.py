
class Solution:
    #
    def maxSubArray(self, nums: List[int]) -> int:
        if not nums:
            return 0
        
        curr, result = nums[0],nums[0]
        k = 0
        start, end =0,0
        for i in range(1,len(nums)):
            curr = nums[i] +curr
            if nums[i] > curr:
                k = i
                curr = nums[i]
                
            if curr > result:
                result = curr
                start = k
                end = i
        print(start, end)
        return result
                
    
