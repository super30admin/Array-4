class Solution:
    def maxSubArray(self, nums: List[int]) -> int:
        # opt=nums
        # for i in range(1,len(nums)):
        #     opt[i]=max(opt[i-1]+nums[i],nums[i])
        # return max(opt)  
        # def maxSubArray(self, nums: List[int]) -> int:
        cur, res = nums[0], nums[0]
        for i in range(1, len(nums)):
            cur = nums[i] if cur <= 0 else cur + nums[i]
            res = max(cur, res)
            # print(cur,res)
        return res