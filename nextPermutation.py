# TimeComplexity:constant (max 10 iterations)
# SpaceComplexity: constant
# Approach: when you try multiple examples you can find pattern ,start form last and fidn breaking point then sawp with just greateer element then reverse that part of the array.
# Brute force wouldbe generate all permuatations o(n!)


class Solution:
    def nextPermutation(self, nums: List[int]) -> None:
        """
        Do not return anything, modify nums in-place instead.
        Try multiple examples for next permutation you will find pattern

        """
        for i in range(len(nums)-2,-1,-1):
            if nums[i+1]>nums[i]:
                break
       
        
        

        if len(nums)==1 or (i==0 and nums[0]>nums[1]):
            #swap entire array
           
            l=0
            h=len(nums)-1
        else:
            b=i
            for i in range(len(nums)-1,i-1,-1):
                if nums[i]>nums[b]:
                    break
            nums[i],nums[b]=nums[b],nums[i]
            #reverse from b+1
            
            l=b+1
            h=len(nums)-1
            
           
        while(l<h):
            nums[l],nums[h]=nums[h],nums[l]
            
            l+=1
            h-=1
