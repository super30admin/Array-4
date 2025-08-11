class Solution:
    def maxSubArray(self, nums: List[int]) -> int:
        maxYet=-float('inf')
        subsum=0

        for n in nums:
            if subsum+n>=0:
                subsum+=n
                maxYet=max(maxYet, subsum, n)
            else:
                subsum=0
                maxYet=max(maxYet, n)
        
        return maxYet
            
                