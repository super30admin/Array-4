#Time O(n), space O(1)
class Solution:
    def nextPermutation(self, nums: List[int]) -> None:
        """
        Do not return anything, modify nums in-place instead.
        """
        
        sl=-1
        n=len(nums)
        
        #Finding the swap location
        for i in range(n-1,-1,-1):
            if nums[i]>nums[i-1]:
                sl=i-1
                break
    #  reversing if its already in descending order          
        if sl==-1:
            self.reverse(nums,0,n-1)
            return
#Finding the smallest value for swap            
        s=sl+1
        for i in range(sl+1,n):
            if nums[i]>nums[sl]:
                s=i
                
        nums[sl],nums[s]=nums[s],nums[sl]
 #Reversing the array after swap location       
        self.reverse(nums,sl+1,n-1)
        
        
    def reverse(self,nums,i,j):

        while i<j:
            nums[i],nums[j]=nums[j],nums[i]
            i+=1
            j-=1
