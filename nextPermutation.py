#Time complexity: O(n)
#space complexity: O(1)
class Solution:
    def nextPermutation(self, nums: List[int]) -> None:
        """
        Do not return anything, modify nums in-place instead.
        """
        i=len(nums)-2
        while(i>=0 and nums[i] >= nums[i+1]):
            i-=1
        index=i+1
        for j in range(i+1,len(nums)):
            if(nums[j]>nums[i] and nums[index]>=nums[j]):
                index=j
        if(i!=-1):
            nums[index],nums[i]=nums[i],nums[index]
        nums=self.reverse(nums,i+1,len(nums)-1)
    
    def reverse(self,nums,start,end):
        while(start<end):
            nums[start],nums[end]=nums[end],nums[start]
            start+=1
            end-=1
        return nums
        
        
                
            