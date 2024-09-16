# Time Complexity: O(nlog(n))
# Space Complexity: O(1)
class Solution:
    def arrayPairSum(self, nums: List[int]) -> int:
        nums.sort()
        ans=0
        for i in range(0,len(nums)-1,2):
            ans+=nums[i]
        return ans