#TimeComplexity:O(NlogN) for sorting
#SpaceComplexity: constant space
#Did this code successfully run on Leetcode : Yes 
#Any problem you faced while coding this : No
class Solution:
    def arrayPairSum(self, nums: List[int]) -> int:
        nums.sort()
        sum=0
        for i in range(len(nums)):
            if i%2==0:
                sum+=nums[i]
        return sum