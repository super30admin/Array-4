# Time Complexity: O(3n) ~ O(n)
# Space Complexity: O(1)

class Solution:
    def nextPermutation(self, nums: List[int]) -> None:
        """
        Do not return anything, modify nums in-place instead.
        """
        def swap(i, j):
            nonlocal nums
            temp = nums[i]
            nums[i] = nums[j]
            nums[j] = temp
            
        def reverse(l,r):
            while(l <= r):
                swap(l, r)
                l += 1
                r -= 1
            
        n = len(nums)
        # step 1 - find breach
        i = n - 2
        while(i >=0 and nums[i] >= nums[i+1]):
            i -= 1
        
        if(i >= 0):
            # Step 2 - find the number which is just greater than the breach number and swap with nums[i]
            j = n - 1
            while(nums[i] >= nums[j]):
                j -= 1
            swap(i, j)
        
        # Step 3 - reverse
        reverse(i+1, n-1)