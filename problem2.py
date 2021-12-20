#Time O(n), space O(1)
class Solution:
    def maxSubArray(self, nums: List[int]) -> int:
        g=0
        s=nums[0]
        #Kandane Algo
        for i in range(len(nums)):
            g+=nums[i]
            
            if g>s:
                s=g
            
            if g<0:
                g=0
                
        return s
