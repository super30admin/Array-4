class Solution:
    # 2-pointer approach
    # TC: O(n) - each step is linear in complexity
    # SC: O(1) - in-place modification
    def nextPermutation(self, nums: List[int]) -> None:
        """
        Do not return anything, modify nums in-place instead.
        """
        if not nums:
            return
        
        n = len(nums)
        # Step 1: Find the rightmost index where nums[idx1] < nums[idx1 + 1]
        idx1 = n - 2
        while idx1 >= 0 and nums[idx1] >= nums[idx1 + 1]:
            idx1 -= 1
        
        # Step 2: If such an index is found, find the next larger element to swap
        if idx1 >= 0:
            idx2 = n - 1
            while idx2 > idx1 and nums[idx2] <= nums[idx1]:
                idx2 -= 1
            # Step 3: Swap nums[idx1] and nums[idx2]
            nums[idx1], nums[idx2] = nums[idx2], nums[idx1]
        
        # Step 4: Reverse the elements after idx1 to get the next permutation
        nums[idx1 + 1:] = reversed(nums[idx1 + 1:])