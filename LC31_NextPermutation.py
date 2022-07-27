"""
Approach - we start from the last element and we keep checking if the number on its left is greater than that number.
once we find a breach, 
a. we replace that number with  one of the digits on its right which is just greater than that number 
b. we reverse the digits appearing next to it

In case where the number is the largest of the permutations that can be formed, i.e. if we are not able to locate any breach, we skip the first step and just reverse all the number

"""

class Solution:
    def nextPermutation(self, nums: List[int]) -> None:
        """
        Do not return anything, modify nums in-place instead.
        """
        if nums == None:
            return 
        
        def reverse(a,b, nums):
            while a<b:
                swap(a,b,nums)
                a+=1
                b-=1
            return nums
        
        def swap(a,b,nums):
            temp = nums[a]
            nums[a]= nums[b]
            nums[b]= temp
            
            return nums
        
        
        n = len(nums)
        i = n-2
        
        while i>=0 and nums[i]>=nums[i+1]:
            i-=1

        if i>=0:
            j = n-1
            while nums[j]<=nums[i]:
                j-=1
            
            swap(i, j, nums)
        reverse(i+1, n-1, nums)
        
        return nums
                
            
                
            
                
        
        
                    
            