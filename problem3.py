#Next permutation
# // Time Complexity :  O(N)
# // Space Complexity : O(1) 
# // Did this code successfully run on Leetcode :yes
# // Any problem you faced while coding this :no



class Solution:
    def nextPermutation(self, nums: List[int]) -> None:
        if len(nums)==0: return []
        def reverse( l, r):
            while(l<r):
                nums[l], nums[r]=nums[r], nums[l]
                l+=1
                r-=1

        i = len(nums)-2
        while(i>=0 and nums[i]>=nums[i+1]):                     #first, find the value that is the less than the one on the right, so that we could swap it
            i-=1
        if (i==-1 ): return reverse( 0, len(nums)-1)            #if it is in descending order, then just return the reverse of the whole array
        j=len(nums)-1
        print(nums[i])
        while(j>=0 and nums[j]<=nums[i]):                       #find the fist value that is greater than nums[i] to swap it with
            j-=1
        
        print(j)
        nums[i],nums[j]=nums[j],nums[i]                         #swap it
        print(nums)
   
        reverse( i+1, len(nums)-1)                              #then reverse the array after the ith value so that you can get the next permutation