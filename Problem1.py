#Time Complexity :O(nlogn)
#Space Complexity :O(1)
#Did this code successfully run on Leetcode : Yes
#Any problem you faced while coding this : No
class Solution:
    def arrayPairSum(self, nums: List[int]) -> int:
        result=0
        nums=sorted(nums)
        for i in range(0,len(nums),2):
            result+=nums[i]
        return result