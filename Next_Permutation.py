# Time - O(N)
# Space - O(1)
# starting from right, finding peak element and swapping with next element which is greater than to it in the right. then reversing it 



class Solution:
    def nextPermutation(self, nums: List[int]) -> None:
        """
        Do not return anything, modify nums in-place instead.
        """
        
        if not nums or len(nums) == 0:
            return 
        
        peak = len(nums)-2
        peakElm = len(nums)-1
        
        while (peak >= 0 and nums[peak] >= nums[peak+1]):
            peak -= 1
        
        if peak>= 0:
            while(peakElm >= 0 and nums[peakElm]<= nums[peak]):
                peakElm -= 1
            self.swap(nums, peak, peakElm)
        
        self.reverse(nums, peak+1, len(nums)-1)
        
        
        
    def swap(self, nums, i, j):
        nums[i], nums[j] = nums[j], nums[i]
    
    def reverse(self, nums, start, end):
        while(start<end):
            self.swap(nums, start, end)
            start += 1
            end -= 1
    
