"""31. Next Permutation
TC - O(N)
SC - O(1)"""
class Solution:
    def nextPermutation(self, nums: List[int]) -> None:
        """
        Do not return anything, modify nums in-place instead.
        """
        if nums == None or len(nums)==0:
            return
        
        peak_index = len(nums) - 2 
        while peak_index>= 0 and nums[peak_index]>= nums[peak_index+1]:
            peak_index -=1
        
        if peak_index>=0:
            peak_ele = len(nums)-1
            while peak_ele >= 0 and nums[peak_ele]<= nums[peak_index]:
                peak_ele-=1
                
            #swap
            temp = nums[peak_index]
            nums[peak_index] = nums[peak_ele]
            nums[peak_ele] = temp
            
        self.reversed(nums, peak_index+1, len(nums)-1)
        
    def reversed(self, nums, start, end):
        while start<end:
            self.swap(nums, start, end)
            start += 1
            end -=1
    
    
    def swap(self, nums, i, j):
        temp = nums[i]
        nums[i] = nums[j]
        nums[j] = temp
        