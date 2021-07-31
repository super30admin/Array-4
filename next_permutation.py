class Solution:
    def nextPermutation(self, nums: List[int]) -> None:
        """
        TC:O(n)
        SC:O(1)
        Do not return anything, modify nums in-place instead.
        """
        #[4,5,0,4,7,2,5,4,3,2,1]
        
        n=len(nums)
        i=n-2
        # return index of number which is just smaller than next
        while i>=0 and nums[i]>=nums[i+1]:
            i-=1
        
        # find number just greater than previous computed num
        if i>=0:
            j=n-1
            while nums[i]>=nums[j]:
                j-=1
            # swap the numbers
            self.swapp(nums,i,j)
        
        # reverse
        self.reverse(nums,i+1,n-1)
    
          
    def swapp(self, nums,i,j):
        temp=nums[i]
        nums[i]=nums[j]
        nums[j]=temp
        
    def reverse(self,nums, l, r):
        while l<r:
            self.swapp(nums,l,r)
            l+=1
            r-=1
  


                
                
            
            
            
        
        
       