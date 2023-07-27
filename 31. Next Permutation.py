# Time Complexity = O(n)
# Space Complexity = O(1)
class Solution:
    def nextPermutation(self, nums: List[int]) -> None:
        """
        Do not return anything, modify nums in-place instead.
        """
        if len(nums) == 0:
            return
        
        n = len(nums)
        i = n - 2
        # Step 1: Find the first decreasing element from the right
        while i >= 0 and nums[i] >= nums[i + 1]:
            i -= 1
        
        j = n - 1  # At the last digit of number
        if i >= 0:
            # Step 2: Find the smallest element greater than nums[i]
            while nums[i] >= nums[j]:
                j -= 1
            # Step 3: Swap the elements at index i and j
            self.swap(nums, i, j)
        
        # Step 4: Reverse the elements from index i+1 to the end
        self.reverse(nums, i + 1, n - 1)

    def reverse(self, nums:[], l, r):
        # Step 5: Reverse the elements from index l to index r
        while l < r:
            self.swap(nums, l, r)
            l += 1
            r -= 1

    def swap(self, nums:[], i, j): # Swapping using addition method
        if i != j:
            nums[i] = nums[i] + nums[j]
            nums[j] = nums[i] - nums[j]
            nums[i] = nums[i] - nums[j]
