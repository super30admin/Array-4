# TC :O(n)
# SC : O(1)
class Solution:
    def nextPermutation(self, nums: List[int]) -> None:
        """
        Do not return anything, modify nums in-place instead.
        """
        if len(nums) == 0:
            return
        
        n = len(nums)
        
        # Step 1: Find the largest index i such that nums[i] < nums[i + 1]
        i = n - 2
        while i >= 0 and nums[i] >= nums[i + 1]:
            i -= 1
        
        if i >= 0:
            # Step 2: Find the largest index j such that nums[i] < nums[j]
            j = n - 1
            while nums[j] <= nums[i]:
                j -= 1
            
            # Step 3: Swap the values at i and j
            nums[i], nums[j] = nums[j], nums[i]
        
        # Step 4: Reverse the subarray nums[i + 1:]
        nums[i + 1:] = reversed(nums[i + 1:])
