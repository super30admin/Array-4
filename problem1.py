class Solution:
    def arrayPairSum(self, nums: List[int]) -> int:
        
        #sort
        nums.sort()
        sum1=0
        for i in range(0,len(nums),2):
             #add the odd indexes
            sum1+=nums[i]
        return sum1
        #Time O(nlogn)
        #space O(n)
