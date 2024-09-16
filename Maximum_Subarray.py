# Time: O(N)
# Space: O(1)
# Did this code successfully run on Leetcode : Yes
# Any problem you faced while coding this : No
"""
We just need to maintain a running sum as well as a maximum sum. It is basically like a sliding window 
concept. We continuously check if current number added to previous sum will decrease the sum or increase
it. In case it increases it, that means we can broaden the the window.; In case the current number is 
greater than the runiing sum, that means we can discard the previous window and start from the current
position. Also, we keep on updating the maximum sum till now b y taking maximum of max and the running sum.
"""

class Solution:
    def maxSubArray(self, nums: List[int]) -> int:
        if not nums or len(nums) == None:
            return 0
        rSum = nums[0]
        maxi = nums[0]
        
        for i in range(1, len(nums)):
            rSum = max(rSum + nums[i], nums[i]) # current array
            maxi = max(rSum, maxi) # global array one 
        return maxi 
      

class Solution:
    def maxSubArray(self, nums: List[int]) -> int:
        if not nums or len(nums) == None:
            return 0
        rSum = nums[0]
        maxi = nums[0]
        # global start and end
        start = 0 
        end = 0
        startCurr = 0 # no end pointer since it always be i
        for i in range(1, len(nums)):
            rSum = rSum + nums[i]
            # when individual sum is greater we will update it
            if rSum < nums[i]:
                rSum = nums[i]
                startCurr = i
            # when max changes we need to change global pointer as well
            if maxi < rSum:
                maxi = rSum
                start = startCurr
                end = i
        print(start, end)
        return maxi 
