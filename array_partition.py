#Time Complexity: O(NlogN)

#Space Complexity: O(1) 
class Solution:
    def arrayPairSum(self, nums: List[int]) -> int:
        if len(nums)==0:
            return
        
        nums.sort()
        total = 0
        for i in range(0,len(nums),2):
            total+=nums[i]
        return total
            