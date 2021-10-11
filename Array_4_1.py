class Solution:
    def arrayPairSum(self, nums: List[int]) -> int:
        nums.sort()
        return sum(nums[::2])
		
        
#TC: O(N) 
#SC: O(1)
      