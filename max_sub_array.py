# Time complexity: O(n)
# Space complexity: O(1)

def maxSubArray(nums):
    if not nums:
        return 0
    max_sum = current_sum = nums[0]
    for num in nums[1:]:
        current_sum = max(num, current_sum + num)
        max_sum = max(max_sum, current_sum)
    return max_sum
