# // Time Complexity : O(n)
# // Space Complexity : O(1)
# // Did this code successfully run on Leetcode : Yes
# // Any problem you faced while coding this : No
#
#
# // Your code here along with comments explaining your approach
class Solution:
    def arrayPairSum(self, nums: List[int]) -> int:
        if nums == None or len(nums) == 0:
            return 0
        #Sort the array
        nums.sort()
        sum_n =0
        for i in range(0,len(nums),2):
            # Loop through the array in steps of 2 and add the alternate elements
            sum_n+=nums[i]
        return sum_n