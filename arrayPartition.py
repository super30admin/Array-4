"""
Time : O(NLOGN)
Time : O(1) (O(N) actually because Python uses O(N) to sort but this changes from language to language)
Leetcode : Yes
Problems : No
"""
class Solution:
    def arrayPairSum(self, nums: List[int]) -> int:
        
        nums.sort()
        c = 0
        for i in range(0, len(nums), 2):
            c += nums[i]
            
        return c
            