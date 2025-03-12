class Solution:
    def arrayPairSum(self, nums: List[int]) -> int:
        # T: O(n log n), S: O(1)
        nums.sort()  # Step 1: Sort the array
        return sum(
            nums[i] for i in range(0, len(nums), 2)
        )  # Step 2: Sum min elements of pairs
