#TC:O(N) SC:O(1)
class Solution:
    def nextPermutation(self, nums: List[int]) -> None:
        """
        Do not return anything, modify nums in-place instead.
        """
        
        #start from right side, check with one previous if previous less than the curr check next greater than previous and swap.
        n=len(nums)-2
        j=len(nums)-1

        while(n>=0 and nums[n]>=nums[n+1]):
            n=n-1
        
        i=len(nums)-1
        while(n>=0 and i>=0 and nums[n]>=nums[i]): 
            i=i-1
       
        self.swap(nums,n,i)

        while(n+1<=j):
            self.swap(nums,n+1,j)
            n=n+1
            j=j-1

    def swap(self,nums, num1, num2):
        x=nums[num1] 
        nums[num1]=nums[num2]  
        nums[num2]=x   
    

