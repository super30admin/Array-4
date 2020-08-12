class Solution:
    def arrayPairSum(self, nums) :
        if len(nums) == 0:
            return 0 
        nums.sort()
        res = 0 
        for i in range(0,len(nums),2):
            res += nums[i]
        return res

# Time Complexity : O(nlogn)
# Space Complexity :O(1)
