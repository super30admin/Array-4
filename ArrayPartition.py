#Time Complexity : O(nlogn) -- sorting the array
#Space Complexity : O(1)
class Solution:
    def arrayPairSum(self, nums: List[int]) -> int:
        
        if not nums:
            return 
        
        nums.sort()
        total = 0
        
        for i in range(0, len(nums), 2):
            
            total = total + nums[i]
            
        return total
