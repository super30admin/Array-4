// Time Complexity : O(nlogn) 
// Space Complexity : O(1) 
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No

class Solution:
    def arrayPairSum(self, nums: List[int]) -> int:
        nums.sort()
        s=0
        i=0
        n=len(nums)
        while i<n:
            s=s+min(nums[i:i+1])
            i=i+2
        return s
        
        
https://leetcode.com/problems/array-partition-i/discuss/102180/Java-O(n)-beats-100