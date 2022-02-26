'''
TC: O(nlogn)
SC: O(1)
'''

class Solution:
    def arrayPairSum(self, nums: List[int]) -> int:
        
        snums = sorted(nums)
        maxm = 0
        
        for i in range(0, len(nums) - 1, 2):
            maxm += min(snums[i], snums[i + 1])
        
        return maxm
        