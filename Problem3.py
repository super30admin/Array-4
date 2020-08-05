class Solution(object):
    
    """
        
        Name : Shahreen Shahjahan Psyche
        Space : O(1)
        Time : O(N)
        
        Passed All Test Cases : Yes
    """
    
    def reverse(self, nums, start, end):
        while(start < end):
            # swap
            temp = nums[start]
            nums[start] = nums[end]
            nums[end] = temp
            
            start += 1
            end -= 1
    
    def nextPermutation(self, nums):
        """
        :type nums: List[int]
        :rtype: None Do not return anything, modify nums in-place instead.
        """
        index = -1
        for i in range(len(nums)-2, -1, -1):
            if nums[i] < nums[i+1]:
                index = i
                break
            
        if index != -1:
            index2 = len(nums)
            for j in range(len(nums)-1, index, - 1):
                if nums[j] > nums[index]:
                    index2 = j
                    break
            nums[index], nums[index2] = nums[index2], nums[index]
            self.reverse(nums, index+1, len(nums)-1)
        
        else:
            self.reverse(nums, 0, len(nums)-1)
            
