# TC: O(N LOGN)
# SC: O(1)

class Solution:
    def arrayPairSum(self, nums: List[int]) -> int:
        nums.sort()
        result=0
        for i in range(0,len(nums),2):
            result+=nums[i]
        print(nums)
        return result