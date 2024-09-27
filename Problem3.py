#Time Complexity: O(N)
#Space Complexity: O(1)
class Solution:
    def nextPermutation(self, nums: List[int]) -> None:
        """
        Do not return anything, modify nums in-place instead.
        """
        n = len(nums)
        i = len(nums) - 2
        while i>= 0 and nums[i] >= nums[i+1]:
            i -=1
            
        j = n - 1
        if i >=0:
            while nums[j] <= nums[i]:
                j -= 1
        nums[i],nums[j] = nums[j], nums[i]
        # reverse a function
        
        start = i+1
        end = n - 1
        while start < end:
            nums[start], nums[end] = nums[end], nums[start]
            start +=1
            end -=1
            
        
        
            
    

