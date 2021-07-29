class Solution:
    def arrayPairSum(self, nums: List[int]) -> int:
        """Time complexity-O(nlogn)
        Space complexity-O(1)"""
        nums.sort()
        maxsum=0
        for i in range(0,len(nums),2):
            maxsum+=nums[i]
        return maxsum