class Solution:
    # Time Complexity - O(n)
    # Space Complexity - O(1)
    def maxSubArray(self, nums: List[int]) -> int:
        if nums is None or len(nums) == 0: return 0

        rsum, max_ = nums[0], nums[0]
        for i in range(1, len(nums)):
            rsum = max(rsum + nums[i], nums[i])
            max_ = max(rsum, max_)

        return max_


# If you want to find indices of the start and end of the max sum subarray, then the following code works
class Solution:
    # Time Complexity - O(n)
    # Space Complexity - O(1)
    def maxSubArray(self, nums) -> int:
        if nums is None or len(nums) == 0: return 0

        rsum, max_ = nums[0], nums[0]
        currStart = start = end = 0

        for i in range(1, len(nums)):
            if (rsum + nums[i] > nums[i]):
                rsum += nums[i]
            else:
                rsum = nums[i]
                currStart = i

            if rsum > max_:
                max_ = rsum
                start = currStart
                end = i
        print("start: " + str(start) + " end: " + str(end))

        return max_