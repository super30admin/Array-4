'''
time complexty: o(n)
space complexity: O(1)
'''
class Solution:
    def maxSubArray(self, nums: List[int]) -> int:
        
        max_till_here = 0
        maximum=float('-inf')
        for i in range(len(nums)):
            
            max_till_here+=nums[i]
            if(maximum<max_till_here):
                maximum = max_till_here
            if(max_till_here<0):
                max_till_here=0
        return maximum