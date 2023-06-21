class Solution:
    def maxSubArray(self, nums: List[int]) -> int:
        # T.C. = O(N)
        # S.C. = O(1)
        if((nums is None) or (len(nums)==0)):
            return 0

        sumx = 0
        maxe = nums[0]

        for i in range(len(nums)):
            # if the (current sum + current element) goes below 0
            # then we check if the maxsum is greater or the current elem
            # and update maxsum accordingly and reset sum to zero
            if sumx+nums[i]<0:
                maxe = max(maxe,nums[i])
                sumx = 0
            # else we keep adding to the sum and keep updating the max as required
            else:
                sumx+=nums[i]
                maxe = max(maxe,sumx)

        return maxe
