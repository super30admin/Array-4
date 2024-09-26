# Time Complexity: O(n)
# Space Complexity: O(1)
# Approach: Maintain 3 values while iterating array. Current value, local result and result.
# 			Keep adding the next element in the local result for each value in array.
#			If current value > result and > local_result change local result and result to i
#			If only i > local result then change local result value to if
# 			If local result > result then change result to local result.
#			At the end of the array return result
class Solution:
    def maxSubArray(self, nums: List[int]) -> int:
        local_result = nums[0]
        result = nums[0]
        
        for i in nums[1:]:
            local_result += i
            if i > result and local_result < i:
                local_result = i
                result = i
            
            if local_result < i:
                local_result = i
                
            if local_result > result:
                result = local_result
                
        return result