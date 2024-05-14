# Time complexity: O(n)
# Space complexity: O(1)
# when the value at index is greater than rsum+value, rsum becomes just the value.
# else, rsum is rsum+value at index
# update the maxsum value with maximum of maxsum and rsum.
# return maxsum




class Solution:
    def maxSubArray(self, nums: List[int]) -> int:
        rsum = nums[0]
        maxnum = nums[0]
        for i in range(1,len(nums)):
            # temp = rsum
            if nums[i] > rsum+nums[i]:
                rsum = nums[i]
            else: rsum = rsum + nums[i]
            
            maxnum = max(rsum, maxnum)
        return maxnum
            
        