#Time Complexity: O(nlogn)
#Space Complexity: O(1)
class Solution:
    def arrayPairSum(self, nums: List[int]) -> int:
        nums.sort()
        i = 0
        n = len(nums)
        res = 0
        while i<n-1:
            res += nums[i]
            i += 2
        return res
            
            
        