class Solution:
    def nextPermutation(self, nums: List[int]) -> None:
        """
        Do not return anything, modify nums in-place instead.
        """
    
        n = len(nums)
        
        # Finding a breach from the end where the number on right is less then left
        # Meaning we can swap that number with the lowest on the right of that index and get the minimum
        swap_index = -1
        for i in range(n - 2, -1, -1):
            if nums[i] < nums[i+1]:
                swap_index = i
                break
        
        print(swap_index)        
        
        # Meaning we can swap that number with the lowest on the right of that index and get the minimum
        # Finding the swap index and swapping it 
        if swap_index != -1:
            for i in range(n-1, -1, -1):
                if nums[i] > nums[swap_index]:
                    temp = nums[i]
                    nums[i] = nums[swap_index]
                    nums[swap_index] = temp
                    break
                
        def reverse(nums, i, j):
            
            while i < j:
                temp = nums[j]
                nums[j] = nums[i]
                nums[i] = temp
                i += 1
                j -= 1
            
        reverse(nums, swap_index + 1, len(nums) - 1)
            
        # TC: O(n) where n is the length of nums
        # SC: O(1) done inplace