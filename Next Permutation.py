class Solution:
    def nextPermutation(self, nums: List[int]) -> None:
        """
        Do not return anything, modify nums in-place instead.
        """
        #Time Complexity: O(n)
        #Space Complexity: O(1)
        
        n = len(nums)
        if n <= 1:
            return
        
        #find the breach
        for i in range(n - 1, 0, -1):
            if nums[i] > nums[i - 1]:
                pivot = i - 1
                break
            if i == 1:
                #reverse the entire list if no breach
                self.reverse(nums, 0, n - 1)
                return
        
        #swap with just greater number 
        for i in range(n - 1, -1, -1):
            if nums[i] > nums[pivot]:
                nums[i], nums[pivot] = nums[pivot], nums[i]
                break
                
        #reverse everything to the right of pivot
        self.reverse(nums, pivot + 1, n - 1)
        return
    
    def reverse(self, nums, left, right):
        while left < right:
            nums[left], nums[right] = nums[right], nums[left]
            left += 1
            right -= 1