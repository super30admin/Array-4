# Time Complexity : O(N log N) (Where N is total number)
# Space Complexity : O(1) 
# Did this code successfully run on Leetcode : Yes
# Three line explanation of solution in plain english:
# Sort the number and take every even indexed number.

class Solution:
    def arrayPairSum(self, nums: List[int]) -> int:
#       Sorting the numbers
        nums.sort()
        ans = 0
        for i in range(0, len(nums), 2):
#           Add every even indexed number to the answer 
            ans += nums[i]
            
        return ans
