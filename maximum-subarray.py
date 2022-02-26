'''
TC: O(n)
SC: O(1)
'''
class Solution:
    def maxSubArray(self, nums: List[int]) -> int:
        
        nlen = len(nums)
        if not nlen:
            return 0
        
        start, end, temStart = 0, 0, 0
        maxm = nums[start]
        rs = nums[start]
        
        for i in range(1, nlen):
            if rs + nums[i] < nums[i]:
                temStart = i
                rs = nums[i]
            else:
                rs += nums[i]
            if maxm < rs:
                start = temStart
                end = i
                maxm = rs
        
        return maxm
                