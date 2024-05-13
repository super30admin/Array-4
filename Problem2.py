# Appoach 1: Brute force
# Time Complexity: O(n^2)
# Space Complexity: O(1)
class Solution:
    def maxSubArray(self, nums: List[int]) -> int:
        max_sum = float('-inf')  
        
        for i in range(len(nums)):
            current_sum = 0 
            for j in range(i, len(nums)):
                current_sum += nums[j]  
                max_sum = max(max_sum, current_sum)  
        return max_sum

#-----------------------------------------------------------
# Appoach 2: 
# Time Complexity: O(n)
# Space Complexity: O(1)

class Solution:
    def maxSubArray(self, nums: List[int]) -> int:
        max_sum = float('-inf')
        cur_sum = 0
        i = 0

        while i < len(nums):
            cur_sum = max(nums[i], cur_sum + nums[i])
            if cur_sum > max_sum:
                max_sum = cur_sum
            i += 1
        return max_sum

#---------------------------------------------------------------
# Appoach 1:  For finding the sub array with maximum sum
# Time Complexity: O(n)
# Space Complexity: O(1)
class Solution:
    def maxSubArray(self, nums: List[int]) -> int:
        start = 0
        cur_start = 0
        end = 0
        max_sum = float('-inf')
        cur_sum = 0
        i = 0

        while i < len(nums):
            cur_sum = max(nums[i], cur_sum + nums[i])
            if cur_sum > max_sum:
                max_sum = cur_sum
                start = cur_start
                end = i
            if cur_sum < 0:
                cur_sum = 0
                cur_start = i + 1
            i += 1

        print(nums[start:end+1])  

    
            


        
        