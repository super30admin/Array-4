# // Time Complexity : O(n)
# // Space Complexity : O(1)
# // Did this code successfully run on Leetcode : Yes
# // Any problem you faced while coding this : No


# // Your code here along with comments explaining your approach
# use Running sum and Global max 
# update both when nums[i] > rsum + nums[i]

class Solution:
    def maxSubArray(self, nums: List[int]) -> int:
        if nums == None or len(nums) == 0: return 0
        rsum = 0
        mx = -float('inf')
        cur = 0
        start, end = 0,0
        # rsum and globle max
        for i in range(len(nums)):
            if nums[i]>rsum+nums[i]:
                rsum = nums[i]
                cur = i
            else:
                rsum += nums[i]
            if rsum > mx:
                start = cur
                end = i
                mx = rsum
            # rsum = max(nums[i], rsum + nums[i])
            # mx = max(mx, rsum)
        print(start, end)
        return mx
            
            