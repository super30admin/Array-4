"""
Approach:

We will maintain two variables here. Running maximum 'rmax' and global maximum 'max'.

rmax will contain the currently running maximum number while max will contain maximum that is found till now.

rmax will always be calculated as maximum of (rmax + next element) and next element. If the rmax in that iteration is greater than max then update the max to rmax.

TC: O(n)
SC: O(1)
"""

class Solution:
    def maxSubArray(self, nums: List[int]) -> int:
        if nums == None or len(nums) == 0:
            return 0
        
        rmax = 0
        maxi = float('-inf')
        
        for i in range(0, len(nums)):
            rmax = max(rmax + nums[i], nums[i])
            if rmax > maxi:
                maxi = rmax
                
        return maxi
    
# If it was asked to return the start and end index then code can be modified like this
class Solution:
    def maxSubArray(self, nums: List[int]) -> int:
        if nums == None or len(nums) == 0:
            return 0
        
        rmax = nums[0]
        maxi = nums[0]
        start = 0
        end = 0
        currStart = 0
        
        for i in range(1, len(nums)):
            if nums[i] > rmax + nums[i]:
                rmax = nums[i]
                currStart = i
                
            else:
                rmax = rmax + nums[i]
                
            if rmax > maxi:
                maxi = rmax
                start = currStart
                end = i
        print("Start: ",  start)
        print("End: ",  end)
        return maxi