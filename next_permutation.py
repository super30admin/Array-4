# Time Complexity : O(n)
# Space Complexity : O(1)

import sys

class Solution:
    def nextPermutation(self, nums: List[int]) -> None:
        """
        Do not return anything, modify nums in-place instead.
        """
        
        swapindex = -1
        n = len(nums)
        
        # loop through each element from right and find the swap point
        for i in range(len(nums) - 1 , 0 , -1) :
            if (nums[i] > nums[i-1] ) :
                swapindex = i - 1
                break
                
        # if not found, then reverse and return
        if(swapindex == -1) :
            self.reverse(nums, 0, n-1)
            return 
        
        # find the next largest number
        smallest = sys.maxsize
        for i in range(swapindex + 1, n) :
            if(nums[i] > nums[swapindex]) :
                smallest = i

        # swap 
        temp = nums[swapindex]
        nums[swapindex] = nums[smallest]
        nums[smallest] =  temp
                

        # reverse the next digits
        self.reverse(nums, swapindex  + 1 , n - 1)
        
        return 
    
    
    
    def reverse(self, nums, i, j) :
        
        while( i < j):
            temp = nums[i]
            nums[i] = nums[j]
            nums[j] = temp
            
            i += 1 
            j -= 1
            
        