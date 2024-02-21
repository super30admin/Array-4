class Solution:
    def nextPermutation(self, nums: List[int]) -> None:
        """
        Do not return anything, modify nums in-place instead.
    
        """
        
        k = len(nums)-2
        
        while k >= 0 and nums[k+1] <= nums[k]:
            k -= 1
            
        print(k)
            
        if k >= 0:
            n = len(nums) - 1
            
            while nums[n] <= nums[k]:
                n = n - 1
                
            nums[k], nums[n] = nums[n], nums[k]
            
        print(k)
            
        nums[k+1:] = sorted(nums[k+1:], reverse=True)
