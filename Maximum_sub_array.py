# TC: O(N)
# SC: O(1)

class Solution:
    def maxSubArray(self, nums: List[int]) -> int:
        res=0
        result=-999999999
        for i in range(0,len(nums)):
            if res+nums[i]>nums[i]:
                res+=nums[i]
                print(res)
            else:
                # print(i)
                res=nums[i]
            result=max(result,res)
        return result
        