"""
TC=0(3N) Asymptotically O(N)
SC=O(1)

1.Find where is breach 
2. Find replacement number and Swap
3.Reverse the rest

when there is no breach , just reverse number
"""
class Solution:
    def nextPermutation(self, nums: List[int]) -> None:
        """
        Do not return anything, modify nums in-place instead.
        """
        if not nums:
            return
        
        n=len(nums)
        #Find the breach 
        i=n-2 # compare i and i+1
        while(i>=0 and nums[i]>=nums[i+1]):
            i-=1
        if(i>=0):#any value of i or i==-1
        
        #find the replacement no
            j=n-1
            while(nums[i]>=nums[j]):
                j-=1
            self.swap(nums,i,j)
        
        #reverse
        self.reverse(nums,i+1,n-1)
        
    def reverse(self,nums,l,r):
        while(l<r):
            self.swap(nums,l,r)
            l+=1
            r-=1
    
    def swap(self,nums,i,j):
        temp=nums[i]
        nums[i]=nums[j]
        nums[j]=temp
        
 
        
        