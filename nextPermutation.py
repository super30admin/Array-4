class Solution:
    def nextPermutation(self, nums: List[int]) -> None:
        """
        Do not return anything, modify nums in-place instead.
        """
        if nums==None or len(nums)==0:
            return 
        
        n = len(nums)
        peak_index = -1
        peak_swap_ele_index = -1
        
        # Find peak
        for i in range(len(nums)-2,-1,-1):
            #print(nums[i])
            if nums[i]< nums[i+1]:
                peak_index = i
                #print("peak_index",peak_index)
                break
        
        # Find Swap element
        if peak_index!= -1:
            for i in range(len(nums)-1,-1,-1):
                if nums[peak_index] < nums[i]:
                    peak_swap_ele_index = i
                    # Swap
                    self.swap(nums, peak_index, peak_swap_ele_index)
                    break
        # Reverse
        self.reverse(nums,peak_index+1, n)
    
    def swap(self,nums, a, b):
        temp = nums[a]
        nums[a] = nums[b]
        nums[b] = temp
        
    def reverse(self, nums, start, end):
        end-=1
        
        while start < end:
            self.swap(nums,start,end)
            start+=1
            end-=1
        
        
        
