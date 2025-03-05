class Solution:
    # TC : O(nlogn)
    # SC : O(1)
    def arrayPairSum(self, nums: List[int]) -> int:
        if nums is None:
            return 0
        nums.sort()
        sumv = 0
        for i in range(0,len(nums),2):
            sumv += nums[i]
        return sumv