# Time:- O(nlogn)
# Space:- O(1)
# Approach: The intuition is to pair up the numbers in such a way that we dont end up giving up on a lot of the larger numbers. The only way to do this is to sort and make pairs of the numbers. Once we are done sorting then the final sum will be just the alternate numbers.
class Solution:
    def arrayPairSum(self, nums: List[int]) -> int:
        nums.sort()
        res=0
        for i in range(0,len(nums),2):
            res+=nums[i]
        return res
    