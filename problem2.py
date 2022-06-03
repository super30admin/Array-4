#Maximum subarray

# // Time Complexity :  O(N)
# // Space Complexity : O(1) 
# // Did this code successfully run on Leetcode :yes
# // Any problem you faced while coding this :no


class Solution:
    def maxSubArray(self, nums: List[int]) -> int:
        if len(nums)==0: return 0
        rSum=nums[0]
        maxs=nums[0]
        start=0
        end=0
        curr=0
        for n, i in enumerate(nums[1:]):            
            if (rSum + i  > i):                 #if the running sum + the current number is greater than just the greater number, set the running sum as the sum of them
                rSum=rSum + i
            else:
                rSum=i                          #else set the running sum as the current number as it is greater
                curr=n+1
            if rSum>maxs:                       #if the updated running sum is greater than the maximum value so far, update it
                maxs = rSum
                end = n+1
                start=curr
        print("{} {}".format(start,end))
        return maxs