class Solution:
    # Time Complexity - O(nlogn) because we're sorting the array
    # Space Complexity - O(1)
    def arrayPairSum(self, nums) -> int:
        # We're adding min element to the result in sacrifice of the max element
        if nums is None or len(nums) == 0: return 0
        result = 0
        nums.sort()
        for i in range(0, len(nums), 2):
            result += nums[i]

        return result