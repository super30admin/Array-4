class Solution:
    def nextPermutation(self, nums: List[int]) -> None:
        """
        Do not return anything, modify nums in-place instead.
        """
        # Time Complexity: O(n)
        # Space Complexity: O(1)
        
        i=len(nums)-2
        # find if there is a breach
        while(i>=0):
            if(nums[i]<nums[i+1]):
                break
            i-=1
        
        # swap if there is a breach
        if(i>=0):
            j = len(nums)-1
            while(nums[j]<=nums[i]):
                j-=1
            
            nums[i],nums[j] = nums[j],nums[i]
        
        # reverse from i+1th index
        i = i+1
        j = len(nums)-1
        while(i<j):
            nums[i],nums[j] = nums[j],nums[i]
            i+=1
            j-=1
