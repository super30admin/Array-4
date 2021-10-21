# Time Complexity: O(n)
# Space Complexity: O(n)
# Approch to solve this problem Given Below:

class Solution:
    def arrayPairSum(self, nums: List[int]) -> int:
        nums.sort()                             # Sort the nums list
        result = 0                              # Declared the total sum of min
        
        for i in range(len(nums)):              # Iterate through the whole list

            if(i%2 == 0):                       # Min would be at even position only
                result = result + nums[i]
                
        return result
            