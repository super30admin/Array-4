#Time Complexity: O(N)
#Space Complexity: O(1)

class Solution:
    def maxSubArray(self, nums: List[int]) -> int:
        curr = maxx = nums[0]
        for num in nums[1:]:
            curr = max(num, curr + num)
            maxx = max(maxx, curr)          
        
        return maxx