#Time Complexity: O(N)

#Space Complexity: O(1) 

class Solution:
    
    def swap(self,nums,a,b):
        temp = nums[a]
        nums[a] = nums[b]
        nums[b] = temp
        
    def reverse(self,nums,p,q):
        while(p<q):
            self.swap(nums,p,q)
            p+=1
            q-=1
    def nextPermutation(self, nums: List[int]) -> None:
        """
        Do not return anything, modify nums in-place instead.
        """
        n = len(nums)
        i = n-2
        
        while(i>=0 and nums[i+1]<=nums[i]):
            i-=1
        
        if i>=0:
            j = n-1
            while(nums[j]<=nums[i]) :
                j-=1
            
            self.swap(nums,i,j)
        self.reverse(nums,i+1,n-1)