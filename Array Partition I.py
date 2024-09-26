class Solution:
    def arrayPairSum(self, nums: List[int]) -> int:
        if nums==None and len(nums)==0:return 0
        nums.sort()
        sum1=0
        for i in range(0,len(nums),2):
            sum1=sum1+nums[i]
        return sum1
    
