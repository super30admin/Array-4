class Solution:
    
    # TC: O(NlogN)
    # SC: O(1)
    
    def arrayPairSum(self, nums: List[int]) -> int:
        
        result = 0
        # Sorting
        nums.sort()
        
        # Adding 1st element of each pair
        for i in range(0, len(nums), 2):
            result += nums[i]
            
        return result