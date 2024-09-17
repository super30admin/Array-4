#Time Complexity: O(n)
#Space Complexity: O(1)
class Solution:
    def nextPermutation(self, nums: List[int]) -> None:
        """
        Do not return anything, modify nums in-place instead.
        """
        n = len(nums)-1
        i = n-1
        flag = 0
        
        while i>=0 and nums[i]>=nums[i+1]:
            i -= 1
            
        if i>=0:
            k = i+1
            j = n
            while j>=k:
                if nums[j]>nums[i]:
                    nums[i],nums[j] = nums[j],nums[i]
                    self.rev(k,n,nums)
                    break
                j -= 1
        else:
            nums.reverse()
               
                
    def rev(self,low,high,nums):
        while low<high:
            nums[low],nums[high] = nums[high],nums[low]
            low += 1
            high -= 1
            
    
                
                
                