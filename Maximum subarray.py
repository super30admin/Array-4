class Solution:
    def maxSubArray(self, nums: List[int]) -> int:
        # cmax = 0
        # gmax = -float('inf')

        # for i in range(len(nums)):
        #     cmax = max(cmax + nums[i], nums[i])

        #     gmax = max(cmax,gmax)
        # return gmax

        # Followup Question, can you return the index of subarrays start and end?
        cmax = 0
        gmax = -float('inf')
        start = 0
        end = 0
        cstart = 0

        for i in range(len(nums)):
            cmax += nums[i]
            if cmax < nums[i]:
                cmax = nums[i]
                cstart = i
            if cmax > gmax:
                gmax = cmax
                start = cstart
                end = i

        print(start, end)
        return gmax
