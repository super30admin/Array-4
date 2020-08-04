"""
// Time Complexity : o(n)
// Space Complexity : o(1)
// Did this code successfully run on Leetcode : yes
// Any problem you faced while coding this : no


// Your code here along with comments explaining your approach
"""
class Solution:
    def maxSubArray(self, nums: List[int]) -> int:
        
        glob = loc = nums[0] #setting local and global variables to the element
        n = len(nums)
        start = 0 #to get index of the subarray
        end = 0
        
        tmp = 0
        
        for i in range(1,n):
            
            if loc + nums[i] < nums[i]: #compare the running sum and the current number itself
                loc = nums[i] #if its the number itself, update local and set starting index in tmp
                tmp = i
            else:
                loc = loc + nums[i] #else add number to the running sum
                
            if loc > glob: #if local sum grows bigger than global, update
                glob = loc
                start = tmp 
                end = i #end will be the current index
                
        print(start,end)
        return glob #return global result