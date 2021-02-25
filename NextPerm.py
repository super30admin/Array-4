#Time Complexity -- O(n)
#Space Complexity -- O(1)

class Solution:
    
    def reversefunc(self, nums, i , j):
        while( i <= j):
            nums[i], nums[j] = nums[j],nums[i]
            i += 1
            j -= 1
    
    
    def nextPermutation(self, nums: List[int]) -> None:
        """
        Do not return anything, modify nums in-place instead.
        """
        if not nums:
            return []
        
        n = len(nums)
        i = n-2
        
        while i >= 0 and nums[i] >= nums[i+1]:
            i -= 1
            
        if i >= 0:
            j = n-1
            
            while(nums[i] >= nums[j]):
                j -= 1
                
            nums[i],nums[j]=nums[j],nums[i]
        
          
        self.reversefunc(nums, i+1, n-1)
