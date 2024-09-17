class Solution:
    def maxSubArray(self, nums: List[int]) -> int:
        '''
        Time Complexity: O(n)
        Space Complexity: O(1)
        '''
        s = 0
        maxSum = 0
        
        for i in nums:
            s = s+ i
            if(s<0):
                s=0
            if(s>maxSum):
                maxSum = s
        if(maxSum==0):
            return max(nums)
        return maxSum
