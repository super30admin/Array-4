#time:O(n)
#space: O(1)
class Solution:
    def maxSubArray(self, nums: List[int]) -> int:

        prev=nums[0]
        mx=nums[0]
        for i in range(1,len(nums)):
            curr=nums[i]
            if prev >0:
                curr +=prev
            mx=max(mx,curr)
            prev=curr
        return mx
