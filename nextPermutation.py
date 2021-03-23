#TimeComplexity:O(N) 
#SpaceComplexity: constant
#Did this code successfully run on Leetcode : Yes 
#Any problem you faced while coding this : No
class Solution:
    def swap(self,nums,j,k):
        temp=nums[j]
        nums[j]=nums[k]
        nums[k]=temp
    def reverse(self,nums1):
        j=0;k=len(nums1)-1
        while j<k :
            self.swap(nums1,j,k)
            j+=1;k-=1
        return nums1

    def nextPermutation(self, nums: List[int]) -> None:
        """
        Do not return anything, modify nums in-place instead.
        """
        if len(nums)==1:
            return
        for i in range (len(nums)-1,0,-1):
            if nums[i]>nums[i-1]: #find the dip point from reverse
                j=i-1
                for i in range(len(nums)-1,j,-1):
                    if nums[j]<nums[i]:
                        self.swap(nums,j,i) #swap dip point with the next bigger element to dip point 
                        nums[j+1:]=self.reverse(nums[j+1:]) #reverse the array after the dip point
                        return #once this is done nums is modified to next permuation 

        nums=self.reverse(nums)#if nothing is done in above steps then return reversed array

        
                
                