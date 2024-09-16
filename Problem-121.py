'''
leet code - Next Permutation - 31 - https://leetcode.com/problems/next-permutation/
Time complexity - O(N)
Approach - first we need to traverse through last element onwards untill we find the 1st and 2nd element.
          1) 1st element is less than next element
          2) 2nd elemenet is greater than 1st element
          3) After finding 1st and 2nd element, we need to swap them.
          4) Then we need to reverse the elements after 1st element.
          
'''

class Solution:
    def nextPermutation(self, nums: List[int]) -> None:
        """
        Do not return anything, modify nums in-place instead.
        """
        i=len(nums)-2
        while (i>=0 and nums[i+1]<=nums[i]):
            i=i-1
        if i>=0:
            j=len(nums)-1
            while (j>=0 and nums[j]<=nums[i]):
                j=j-1
            self.swap(nums,i,j)
        self.reverse(nums,i+1,len(nums)-1)
        

    def reverse(self,nums,start,end):
        while (start<end):
            self.swap(nums,start,end)
            start=start+1
            end=end-1
        
    
    
    
    def swap(self,nums,i,j):
        nums[i],nums[j]=nums[j],nums[i]