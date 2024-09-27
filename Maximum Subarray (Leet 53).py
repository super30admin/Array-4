'''
Time: O(n)
Space: O(1)
'''

class Solution:
    def maxSubArray(self, nums: List[int]) -> int:
        msum = nums[0]
        csum = 0
        
        for num in nums:
            csum = max(csum+num,num)
            msum = max(msum,csum)
        return msum