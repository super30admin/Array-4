#Arary partition 1
# // Time Complexity :  O(N log N)
# // Space Complexity : O(1) 
# // Did this code successfully run on Leetcode :yes
# // Any problem you faced while coding this :no


class Solution:
    def arrayPairSum(self, nums: List[int]) -> int:
        nums.sort()
        res=0
        i=0
        while(i<len(nums)-1):                               #find the minimum of the two numbers and add it to the sum
            res += min(nums[i], nums[i+1])
            i+=2
        return res