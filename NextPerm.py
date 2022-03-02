# Time Complexty o(n)
# Space Complexity o(1)




class Solution:
    def nextPermutation(self, nums: List[int]) -> None:
        
        
        def reverse(nums , l ,r):
            
            while (l <r):
                swap(nums , l , r)
                l +=1
                r -=1
        
        def swap(nums , x , y ):
            
            temp = nums[x]
            
            nums[x] = nums[y]
            
            nums[y] = temp

                
        
        if len(nums) == 1:
            return nums
        
        n = len(nums)
        
        i = n -2
# Find the breach by finding the element which is smaller that the previous element        
        while(i >=0 and nums[i] >= nums[i+1]):
            i -=1
        
        if i >=0:
# Swap the breach element with the next greatest element            
            j = n-1
            
            while(nums[i] >= nums[j]):
                
                j -=1
            swap(nums , i , j )
 # Reverse all the elements from the breach point       
        reverse(nums , i+1 ,n -1)
        
        
            
            
        
            
            
            
        
        
        
        
        
        
            