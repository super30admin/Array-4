
// Time Complexity : O(n) 
// Space Complexity : O(1) 
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No

class Solution:
    def maxSubArray(self, nums: List[int]) -> int:
        
        currsum=0
        maxsum=float('-inf')
        i=0
        
        while i< len(nums):

            currsum=currsum+nums[i]
            maxsum= max(currsum,maxsum)
                
            if currsum<=0:
                currsum=0
                
            i=i+1
            
        return (maxsum)
        
        
