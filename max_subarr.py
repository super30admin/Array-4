class Solution:
    def maxSubArray(self, nums: List[int]) -> int:
        start = 0
        end = 0
        curr_start = 0
        currsubarr_sum = nums[0]
        maxsubarr_sum = nums[0]
        n = len(nums)

        for i in range(1, n):
            if nums[i] > currsubarr_sum + nums[i]:
                currsubarr_sum = nums[i]
                curr_start = i
            else:
                currsubarr_sum += nums[i]

            if currsubarr_sum > maxsubarr_sum:
                maxsubarr_sum = currsubarr_sum
                start = curr_start
                end = i
        return maxsubarr_sum


# time complexity is O(n)
# space complexity is O(1)
