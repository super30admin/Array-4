'''
Time Complexity : O(n)//traversing
Space Complexity : O(1)
'''

class Solution:
    def maxSubArray(self, nums: List[int]) -> int:
        maxsum = nums[0]
        s = nums[0]
        for i in nums[1:]:
            if i + s < i :
                maxsum = max(s,maxsum)
                s =0
            s += i
            maxsum = max(s,maxsum)
            # print(i,maxsum,s)
        return maxsum
