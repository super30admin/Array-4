class Solution:
    def nextPermutation(self, nums: List[int]) -> None:
        """
        Do not return anything, modify nums in-place instead.
        """
        i=j=len(nums)-1
        
        #Getting the first non increasing elemnt
        while i>0 and nums[i-1]<=nums[i]:
            i-=1
        
        #If the array is in decreasing order
        if i==0:
            nums.reverse()
            return
        
        #Finding the first number greater than i-1
        while nums[j]<=nums[i-1]:
            j-=1
         
        #Swapping the number
        nums[i-1],nums[j]=nums[j],nums[i-1]
        
        
        #Reversing the list from i to end
        def reverse(l,r):
            while l<r:
                nums[l],nums[r]=nums[r],nums[l]
                l+=1
                r-=1
        
        reverse(i,len(nums)-1)