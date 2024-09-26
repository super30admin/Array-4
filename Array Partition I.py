class Solution:
    def arrayPairSum(self, nums: List[int]) -> int:
        #Approach: Sorting
        #Time Complexity: O(n log n)
        #Space Complexity: O(n)
        
        nums.sort()
        
        total = 0
        for i in range(0, len(nums), 2):
            total += nums[i]
            
        return total