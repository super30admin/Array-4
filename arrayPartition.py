class Solution:
    def arrayPairSum(self, nums: List[int]) -> int:
        # Time: O(nlogn)
        # Space: O(1)
        nums.sort()
        s=0
        for i in range(0,len(nums),2):
            s = s+ nums[i]
        return s
