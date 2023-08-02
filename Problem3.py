#Time complexity is O(n)
#Space complexity is O(1)
#No issues faced while coding
#Code ran successfully on leetcode

class Solution(object):
    def nextPermutation(self, nums):
        """
        :type nums: List[int]
        :rtype: None Do not return anything, modify nums in-place instead.
        """
        #Base condition
        if(nums==None):
            return None
        #Initializing all the required variables
        n=len(nums)
        i=len(nums)-2
        #We will be iterating until we find the smallest value at index i 
        while(i>=0 and nums[i]>=nums[i+1]):
            i-=1
        #initializing j value
        j=n-1
        #checking the value of i to make sure that there is next possible iteration
        if(i>=0):
            #iterating through the array
            while(nums[i]>=nums[j]):
                j-=1
            #Swapping the values
            self.swap(nums,i,j)
        #Reversing the values from i+1 to n-1
        self.reverse(nums,i+1,n-1)

    #Function to reverese the values 
    def reverse(self,nums,l,r):
        while(l<r):
            #Swapping the values at index l and r
            self.swap(nums,l,r)
            l+=1
            r-=1
    
    #Swapping the values at position i and j
    def swap(self,nums,i,j):
        if(i!=j):
            nums[i]=nums[i]+nums[j]
            nums[j]=nums[i]-nums[j]
            nums[i]=nums[i]-nums[j]