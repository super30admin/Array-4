#Time Complexity: O(N)
#Space Complexity: O(1)
class Solution:
    def arrayPairSum(self, nums: List[int]) -> int:
        nums.sort()
        minn = 0
        for i in range(0,len(nums),2):
            minn += min(nums[i],nums[i+1])
        
        return minn
            
            
        