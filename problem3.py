#Time Complexity = O(n)
#Space Complexity = O(n)

class Solution:
    def maxSubArray(self, nums: List[int]) -> int:
        
        rsum = nums[0]
        res = nums[0]
        fs =0
        fe = 0
        s = 0
        e = 0
        for i in nums[1:]:
            if(rsum+i>i):
                rsum = rsum+i
                fe = i 
            else:
                rsum = i
                fs = i
                
            if(rsum>res):
                res = rsum
                s = fs
                e = fe
                
            
        print(s,e)
        return res
        