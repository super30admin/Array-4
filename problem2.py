class Solution(object):
    def maxSubArray(self, nums): #T.C -> O(N)
        """
        :type nums: List[int]
        :rtype: int
        """
        currSum = nums[0]
        maxSum = nums[0]

        st = 0
        end = 0
        currSt = 0

        for i in range(1,len(nums)):
            currSum = currSum+nums[i]
            if nums[i] > currSum:
                currSum = nums[i]
                currSt = i
            if maxSum < currSum:
                maxSum = currSum
                st = currSt
                end = i
        print(st,end)
        return maxSum