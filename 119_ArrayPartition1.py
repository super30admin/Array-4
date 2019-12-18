'''
Accepted on leetcode(561)
Time complexity - O(Nlog(N))
space - O(1)
Approach - Sort the array and then add alternate elements and return the sum.
'''
class Solution:
    def arrayPairSum(self, nums) -> int:
        if len(nums) == 0:
            return 0
        nums = sorted(nums)
        sum = 0
        for i in range(0,len(nums),2):
            sum += nums[i]
        return sum