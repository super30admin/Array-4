class Solution:
    def maxSubArray(self, nums: List[int]) -> int:
        if not nums:
            return 0
        sum_local = nums[0]
        sum_global = nums[0]
        if len(nums)>1:
            for i in range(1,len(nums)):
                sum_local = max(nums[i], sum_local+nums[i])
                sum_global = max(sum_local, sum_global)
        return sum_global

#time compelxity - O(n)

#space complexity - O(1)

#all test cases passed