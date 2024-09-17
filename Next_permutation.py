# Time Complexity: O(n)  1.To find breach 2. To swap and 3. To reverse
# Space Complexity: O(1)
# Approach to problem: Given Below

class Solution:
    def swap(self, nums, ind1, ind2):                   # Swap function
        temp = nums[ind1]
        nums[ind1] = nums[ind2]
        nums[ind2] = temp 
        
    def reverse(self, nums, beg, end):                  # Reverse function
        while(beg < end):
            self.swap(nums, beg, end)
            beg += 1
            end -= 1
        
    def nextPermutation(self, nums: List[int]) -> None:
        """
        Do not return anything, modify nums in-place instead.
        """
        if len(nums) == 1:
            return 
        if len(nums) == 2:
            return self.swap(nums, 0, 1)
        dec = len(nums) - 2                             # Breach
        while dec >= 0 and nums[dec] >= nums[dec+1]:    # Comparing breach with other no
            dec -= 1
        self.reverse(nums, dec+1, len(nums) - 1 )       #Reverse the largest sorted list
        if dec == -1:
            return 
        next_num = dec + 1
        while next_num < len(nums) and nums[next_num] <= nums[dec]:
            next_num += 1
        self.swap(nums, next_num, dec)                  # Swap 
            
