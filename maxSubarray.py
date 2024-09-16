# Approach: 2 Pointers
# TC: O(N)
# SC: O(1)
class Solution:
    def maxSubArray(self, nums: List[int]) -> int:
        # if len(nums) == 1: return nums[0]
        # e.g. [-2,1,-3,4,-1,2,1,-5,4]

        global_res = (-float("inf"),0,0)
        
        ssum = -float("inf")
        l = r = 0
        
        while r < len(nums):
            if ssum > global_res[0]:
                if r == 0:
                    global_res = (ssum, l, 1)
                else:
                    global_res = (ssum, l, r)
            if nums[r] + ssum >= nums[r]:
                ssum += nums[r]
            else:
                ssum = nums[r]
                l = r
            r+= 1
        if ssum > global_res[0]:
            if r == 0:
                r += 1
            global_res = (ssum, l, r)
        print(nums[global_res[1]:global_res[2]])
        return global_res[0]