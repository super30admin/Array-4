class Solution:
    def arrayPairSum(self, nums: List[int]) -> int:
        if nums==None or len(nums)==0:
            return
        sum=0
        nums.sort()
        for i in range(0,len(nums),2):
            sum+=nums[i]
        return sum 
