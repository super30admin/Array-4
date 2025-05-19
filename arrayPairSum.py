class Solution:
    def arrayPairSum(self, nums: List[int]) -> int:
        """
        Approach:
        1. Sort the array.
        2. Sum up elements at even indices (i.e., the smaller in each adjacent pair).
        
        Time Complexity: O(n log n)
        Space Complexity: O(1) if sorting in-place, else O(n)
        """
        nums.sort()
        return sum(nums[i] for i in range(0, len(nums), 2))
