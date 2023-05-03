# Time Complexity : O(n)
# Space Complexity : O(1)
# Did this code successfully run on Leetcode : yes
# Any problem you faced while coding this : no

class Solution:
    def maxSubArray(self, nums: List[int]) -> int:
        # csum = -float('inf')
        # maxsum = -float('inf')
        start = end = 0
        csum = maxsum = nums[0]
        curstart = 0
        for i in range(1,len(nums)):
            if nums[i] > csum+nums[i]:
                curstart = i
                csum = nums[i]
            else:
                csum += nums[i]
            if csum > maxsum:
                start = curstart
                end = i
                maxsum = csum
            # csum = max(i, csum+i)
            # maxsum = max(csum,maxsum)
        print(start,end)
        return maxsum
            